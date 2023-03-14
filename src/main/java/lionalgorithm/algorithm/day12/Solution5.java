package lionalgorithm.algorithm.day12;

public class Solution5 {

    //https://school.programmers.co.kr/learn/courses/30/lessons/86491?language=java
    public int solutions(int[][] sizes) {
        //가장 긴것을 가로 가장 짧은것을 세오
        int max_v = 0;//가로 중 가장 긴
        int max_h = 0;//세로 중 가장 짧은
        for (int[] size : sizes) {
            max_v = Math.max(max_v, Math.max(size[0], size[1]));
            max_h = Math.max(max_h, Math.min(size[0], size[1]));
        }
        int answer = max_v * max_h;
        return answer;
    }

    public int solution(int[][] sizes) {
        //가장 긴것을 가로 가장 짧은것을 세오
        int max_w = 0;//가로 중 가장 긴
        int max_h = 0;//세로 중 가장
        int answer = 0;

        for (int i = 0; i < sizes.length; i++) {
            int temp = 0;
            for (int j = 0; j < sizes[i].length; j++) {
                if (sizes[i][0] < sizes[i][1]) { // 세로가 가로보다 크면 둘이 바꿔주는 것이다.
                    temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                }
                if (sizes[i][0] > max_w) {
                    max_w = sizes[i][0];
                }

                if (sizes[i][1] > max_h) {
                    max_h = sizes[i][1];
                }

            }
        }
        answer = max_h * max_w;

        return answer;
    }

}
