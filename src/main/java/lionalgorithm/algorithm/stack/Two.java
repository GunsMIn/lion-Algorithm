package lionalgorithm.algorithm.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Two {

    /** https://school.programmers.co.kr/learn/courses/30/lessons/42586
     * 7일 3일 9일
     * Math.ceil() -> https://itdar.tistory.com/entry/Java-%EC%9E%90%EB%B0%94-Math-class-roundceilfloorabs-%EB%B0%98%EC%98%AC%EB%A6%BC%EC%98%AC%EB%A6%BC%EB%82%B4%EB%A6%BC%EC%A0%88%EB%8C%80%EA%B0%92
     *
     * 또 생각해야 할 것은 앞선 단계가 개발이 완료되지 않으면 뒷쪽 단계는 완료되도 배포 못함
     * 그럼 선입 선출 구조인 queue 를 이용?
     *
     **/

    public int[] solution(int[] progresses, int[] speeds) {

        //작업일수를 계산할 자료구조 🔽
        Queue<Integer> que =  new LinkedList<>();
        //한번에 배포되는 건수를 저장할 list자료구조
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            double preDay = (100.0 - progresses[i]) / speeds[i];
            int day = (int) Math.ceil(preDay);
            que.offer(day);
        }
        //que에는 작업일수가 들어가 있다.
        //7 3 9

        int count = 0;

        while (!que.isEmpty()) {
            int prev = que.poll();
            count++;
            //다음 작업이 현재 처리해야할 작업일수 보다 큰 경우
            //이러한 경우에는 현재 작업(1개)만 추가
            if (que.isEmpty()) {
                answer.add(count); // 마지막 작업 일수 추가
            }
            //이전 작업보다 뒤의 작업일수 가 클때는 이전 작업만 수행가능
            else if (prev < que.peek()) {
                answer.add(count);
                count = 0;
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }



    public int[] solution2(int[] progresses, int[] speeds) {

        int[] days = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            days[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }

        List<Integer> answer = new ArrayList<>();
        int cnt = 1;
        int preDay = days[0];

        for (int i = 1; i < days.length ; i++) {
            //이전 작업이 현재 작업보다 오래 걸린다면?
            //cnt 를 증가 시켜준다.
            if (preDay >= days[i]) {
                cnt++; // 처리할 수 있는 작업건수 ++

            }else{ // 이전 작업이 현재 작업보다 빨리 끝난다면?
                //1.cnt를 넣어주자
                //2.cnt 초기화
                //3.그리고 마지막으로 preDay를 현재의 값으로 넣어주자
                answer.add(cnt);
                cnt = 1;
                preDay = days[i];
            }
        }
        //그리고 마지막으로 생각해주어야 하는 것
        //마지막 처리해야 할 것을 cnt해주자
        answer.add(cnt);

        int[] result = new int[answer.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = answer.get(i);
        }

        return result;

    }
}