package lionalgorithm.algorithm.day38;

import java.util.PriorityQueue;

public class Priority {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42626

    public int solution(int[] scoville, int K) {
        int answer = 0; // count
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        //우선 순위 큐에 값 넣기
        for (int s : scoville) {
            pq.add(s);
        }

        //모든 음식의 스코빌 지수를 K 이상으로 만든다 그렇기 위해서는 peek한 값이 k보다 작을때까지 진행!
        while (pq.peek() < K) {
            //런타임 에러가 발생 했던이유는 1개 밖에 없는데 2개를 poll하려고 했기 때문이다.
            if (pq.size() <= 1) return -1;
            int firstValue = pq.poll();
            int secondValue = pq.poll();
            int mix = firstValue + (secondValue * 2);
            pq.offer(mix);
            answer++;
        }

        System.out.println("pq = " + pq);
        return answer;
    }


    public static void main(String[] args) {

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;

        int solution = new Priority().solution(scoville, k);
        System.out.println("solution = " + solution);


      /*  pq.add(1);		pq.add(15);		pq.offer(10);
        pq.add(21);		pq.add(25);		pq.offer(18);
        pq.add(8);
*/
        //System.out.println("pq = " + pq);
       /* int[] arr = {1, 2, 3, 9, 10, 12};

        int mix = arr[0] + (arr[1] * 2);*/
        //
    }
}
