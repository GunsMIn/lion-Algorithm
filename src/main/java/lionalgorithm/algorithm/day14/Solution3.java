package lionalgorithm.algorithm.day14;

public class Solution3 {
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        //현재 피로도 k
        // 2차원 배열 안에 [a,b] a : 시작조건 b : 돈 후 k = k - b
        //

        for (int[] dungeon : dungeons) {
            for (int i = 0; i < dungeon.length; i++) {
                if (k >= dungeon[0]) {
                    k -= dungeon[1];
                } else {
                    return answer;
                }

            }
        }


        return answer;
    }
}
