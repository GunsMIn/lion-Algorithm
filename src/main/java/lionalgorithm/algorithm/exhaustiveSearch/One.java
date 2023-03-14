package lionalgorithm.algorithm.exhaustiveSearch;

import javax.xml.stream.XMLInputFactory;

public class One {
    // 완전 탐색
    //https://school.programmers.co.kr/learn/courses/30/lessons/86491
    public int solution(int[][] sizes) {

        int max_x = 0, max_y=0;
        //우선 첫번째 요소는 가로 두번째 요소는 세로의 크기
        //[[60, 50], [30, 70], [60, 30], [80, 40]]
        for (int[] size : sizes) {
            max_x = Math.max(max_x, Math.max(size[0], size[1]));
            max_y = Math.max(max_y, Math.max(size[0], size[1]));
        }

       return max_x * max_y;

    }
}
