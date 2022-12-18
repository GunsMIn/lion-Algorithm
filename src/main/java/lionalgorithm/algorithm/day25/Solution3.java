/*
package lionalgorithm.algorithm.day25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution3 {

    //https://velog.io/@kimmjieun/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EA%B8%B0%EB%8A%A5%EA%B0%9C%EB%B0%9C
    public int[] solution(int[] progresses,int[] speeds) {
        //일을 처리하려면 남은 작업일수를 저장 할 자료구조 queuew
        Queue<Integer> day = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            float progress = progresses[i];
            float speed = speeds[i];
            int ceilDay = (int) Math.ceil((100 - progress) / speed);
            day.offer(ceilDay);
        }
        //[7,3,9] ->[2,1]//[5,10,1,1,20,1] -> [1,3,2]
        //각 배포마다 배포되는 기능개수 리스트
        List<Integer> answer = new ArrayList<>();

        int cnt =1; // 한번의 배포에 배포되는 기능개발 가능 개수
        int before = day.poll(); // 현재 큐에 있는 첫 기능이 배포되는데 걸리는 일수
        //큐가 빌때 까지 반복하자
        while (!day.isEmpty()) {
            if (before >= day.peek()) { // 먼저 처리될 기능개발 일수가 다음기능개방의 일수보다 클때
                cnt++;
                day.poll();
            }else{ //먼저 처리될 기능개발 일수가 다음기능개방의 일수보다 작을때
                answer.add(cnt);
                cnt=1;
                day.poll();
            }
        }
        day.add(cnt);


    }

}
*/
