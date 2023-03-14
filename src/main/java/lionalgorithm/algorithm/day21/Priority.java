package lionalgorithm.algorithm.day21;

import java.util.PriorityQueue;

public class Priority {
    ////https://yoongrammer.tistory.com/81 ->  자료구조 도움금
    public int[] solution2(int[] arr, int divisor) {
        //큐 구조는 원래 fifo구조이다 (먼저 들어온게 먼저 빠져나올 수 있다)
        //욱선순위대로! 빠져나가는 자료구조 -> 정렬이 필요 없게 된다.
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        int[] answer = new int[list.size()];
        int cnt = 0;

        while (!list.isEmpty()) { //빌때까지 poll해주어서 넣어준다.
            answer[cnt++] = list.poll();
        }
        return answer;
    }

}
