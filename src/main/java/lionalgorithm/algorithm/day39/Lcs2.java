package lionalgorithm.algorithm.day39;

import java.util.Arrays;

public class Lcs2 {
    public static void main(String[] args) {
        /**keyPoint : 달랐을 때는 현재 위치를 기준으로 왼쪽의 값과, 위쪽의 값 중 더 큰 값을 가져온다.
         *            주의할 점은 같은 문자열이  연속해서 나오면 ? **/
        /** 찾아낸 규칙
         * 1.문자열을 비교하여 같았을 때
          현재 칸에 들어갈 값은 대각선 왼쪽 위의 값 + 1 이다. 대각선은 dp[i-1][j-1]
          2.문자열을 비교하여 달랐을 때
          현재 칸에 들어갈 값은 왼쪽과 위쪽의 값 중 더 큰 값이 들어간다.**/
          // A B C D C B A
        //D  0 0 0 1 1 1 1
        //C  0 0 1 1 2 2 2
        //A  1 1 1 1 2 2 2
        //B  1 2 2 2 2 3 3
        //D  1 2 2 3 3 3 3
        //C  1 2 3 3 4 4 4
        String str1 = "ABCDCBA"; // 열
        String str2 = "DCABDC"; // 행

        //str2인 DCABDC i로 놓고 안쪽에서 반복
        //str1인 ABCDCBA j로 놓고 안쪽에서 반복

        int[][] dp = new int[str2.length()+1][str1.length()+1]; // [행][열]

        for (int i = 1; i < str2.length(); i++) {
            for (int j = 1; j < str1.length(); j++) {
                //System.out.printf("i:%s j:%s\n",str2.charAt(i), str1.charAt(j));
                // 두개가 연속해서 같으면 대각선에서 가지고 온다
                // 대각선은 dp[i-1][j-1]
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                else if (str2.charAt(i-1) == str1.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                // 두개가 다르면 max(위,왼쪽)을 기록한다.
                else{
                    int up = dp[i - 1][j];
                    int left = dp[i][j-1];
                    dp[i][j] = Math.max(up, left);
                }
            }
            System.out.println(Arrays.toString(dp[i]));
        }
         int answer = dp[str2.length()][str1.length()];

    }
}
