package lionalgorithm.algorithm.stack;


import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class Four {





    /**
     * 우선 매개변수에는 중요대 배열 , 인쇄를 요청한 문서의 순서
     * 또한 location은 인덱스의 위치와 같다.
     * **/
    public int solution(int[] priorities, int location) {

        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        //선입선출구조에 넣음
        for (int priority : priorities) {
            queue.offer(priority);
        }

        while (!queue.isEmpty()) {

        }




        return answer;
    }

}
