package lionalgorithm.algorithm.day21;

import java.util.PriorityQueue;

public class Priority {

    //https://yoongrammer.tistory.com/81
    public int[] solution2(int[] arr, int divisor) {

        //욱선순위대로!
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
        while (!list.isEmpty()) {
            answer[cnt++] = list.poll();
        }
        return  answer;
    }

}
