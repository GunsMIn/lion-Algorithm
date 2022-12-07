package lionalgorithm.algorithm.day38;

import java.util.PriorityQueue;

public class Priority {

    public int solution(int[] scoville, int k) {
        int answer = 0; // count
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        //우선 순위 큐에 값 넣기
        for (int s : scoville) {
            pq.add(s);
        }
        while (pq.peek() < k) {
            int firstValue = pq.poll();
            int secondValue = pq.poll();
            int mix = firstValue + secondValue;
            answer ++;
        }

        return answer;
    }


    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a-b);
        int[] arr = {1, 2, 3, 9, 10, 12};
        int k = 7;
        int cnt = 0;
        for (int i = 0; i <arr.length ; i++) {
            pq.add(arr[i]);
        }

       /* int mix = pq.poll() + (pq.poll() * 2);
        System.out.println("mix = " + mix);
        pq.add(mix);*/

        while (pq.peek() < k) {
            int mix = pq.poll() + (pq.poll() * 2);
            if (mix <= k) {
                pq.add(mix);
                cnt++;
            }
        }
        System.out.println("pq = " + pq);
        System.out.println("cnt = " + cnt);





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
