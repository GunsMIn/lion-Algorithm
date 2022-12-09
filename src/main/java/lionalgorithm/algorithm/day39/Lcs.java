package lionalgorithm.algorithm.day39;

public class Lcs {

    public static void main(String[] args) {
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

        int[][] dp = new int[str2.length()][str1.length()]; // [행][열]

        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                System.out.printf("i:%s j:%s\n",str2.charAt(i), str1.charAt(j));
            }
        }

                
    }
}
