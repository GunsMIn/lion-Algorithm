package lionalgorithm.algorithm.day40;

public class Six {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        /**
         * [[1,2],[2,3]]	[[3,4],[5,6]]
         *
         *
         * **/
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
                // arr1[0][0] + arr2[0][0]
                // arr1[0][1] + arr2[0][1]
                // arr1[1][0] + arr2[1][0]
                // arr1[1][1] + arr2[1][1]
            }
        }
        return answer;
    }
}
