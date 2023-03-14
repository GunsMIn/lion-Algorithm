package lionalgorithm.algorithm.day12;

import java.util.LinkedList;
import java.util.Queue;

public class Solution4 {

    /*
     *1.큐가 비어있는 경우
     *2.큐가 가득차지 않는 경우
     *3.큐가 가득찬 경우
     * */
    //https://school.programmers.co.kr/learn/courses/30/lessons/42583

    public int solutions(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int truck : truck_weights) {
            while (true) {
                //다리에 아무것도 올라서지 않았을때
                if (q.isEmpty()) {
                    q.offer(truck);
                    answer++;
                    sum += truck;
                    break;//여기서 break는 다음 트럭을 진행시키는 것이다.
                } else { // 다리에 트럭이 존재할 때
                    if (q.size() == bridge_length) { // 가득찼을때
                        sum -= q.poll();
                    } else if (sum + truck > weight) { //무게를 초과했을때
                        q.offer(0);
                        answer++;
                    } else {
                        q.offer(truck);
                        answer++;
                        sum += truck;
                        break;
                    }
                }
            }
        }


        return answer + bridge_length;
    }


}
