package lionalgorithm.algorithm.day39;

import java.util.Arrays;

public class Lcs {

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

            String str1 = "ABCDCBA"; //열
            String str2 = "DCABDC"; //행

            // str2이 세로, str1이 가로
            String[][] strList = new String[str2.length()][str1.length()];
            //메모지제이션 활용
            int[][] memo = new int[str2.length()+1][str1.length()+1];

            for (int i = 1; i < str2.length()+1; i++) {
                for (int j = 1; j < str1.length()+1; j++) {
//                System.out.printf("i: %s | j: %s \n", str2.charAt(i), str1.charAt(j));
                    if (str2.charAt(i-1) == str1.charAt(j-1)){
                        memo[i][j] = memo[i - 1][j - 1] + 1;
                    }
                    else{
                        int up = memo[i - 1][j];
                        int left = memo[i][j-1];
                        memo[i][j] = Math.max(up, left);
                    }
                }
            }

            for (int[] ints : memo) {
                System.out.println("ints = " + Arrays.toString(ints));
            }
        }
}
