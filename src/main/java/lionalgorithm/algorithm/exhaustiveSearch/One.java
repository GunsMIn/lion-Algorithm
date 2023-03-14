package lionalgorithm.algorithm.exhaustiveSearch;

import javax.xml.stream.XMLInputFactory;

public class One {
    /**완전 탐색
    문제 : https://school.programmers.co.kr/learn/courses/30/lessons/86491
    정리글 : https://taehoung0102.tistory.com/74 **/

    /**
     * 풀이 방법
     * 우선 이 문제를 가로 세로의 개념으로 보면 어렵다.
     * 명함을 회전할 수 있으므로 가로는 두 길이 중 가장 긴 것을
     * 세로는 두 길이중 짧은 것을 교차해서 넣어주자.
     * 그래서 포인트는 즉 , 가로에 두 길이중 긴 것을 세로에 짧은 것을 넣은 다음
     * 각 값의 max를 뽑아내자
     * **/
     public int solution(int[][] sizes) {

        int max_x = 0, max_y=0;
        //우선 첫번째 요소는 가로 두번째 요소는 세로의 크기
        //[[60, 50], [30, 70], [60, 30], [80, 40]]
         for (int i = 0; i < sizes.length; i++) {
             int x = sizes[i][0];// 가로
             int y = sizes[i][1];// 세로
             max_x = Math.max(max_x, Math.max(x, y));
             max_y = Math.max(max_y, Math.min(x, y));
         }

       return max_x * max_y;

    }
}
