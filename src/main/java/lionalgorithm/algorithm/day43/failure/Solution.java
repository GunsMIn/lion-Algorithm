package lionalgorithm.algorithm.day43.failure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {

    /**
     *   N	       stages	               result
     *   5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
     *
     * **/
    public int[] solution(int N, int[] stages) {
        //각 스테이지별 플레이어 수를 저장할 배열 🔽
        int[] numOfPlayers = new int[N+2];
        for (int stage : stages) { // 각각의 stage까지 도달한 것을 index로 생각하여 count ++ 해준다
            numOfPlayers[stage]++;
        }

        //총 참가자 수
        int totalPlayers = stages.length;
        List<Stage> stageFailureRates = new ArrayList<>();
        for (int i = 1; i <= N ; i++) {
       //스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
            double failRate = 0;
            failRate = numOfPlayers[i] / totalPlayers;
            stageFailureRates.add(new Stage(i, failRate));
            totalPlayers -= numOfPlayers[i];
        }

        //stage의 실패율을 내림차순으로 정렬한 후에 번호순으로 오름차순 정렬
        stageFailureRates.sort(Comparator.comparing(Stage::getFailRate).reversed().thenComparing(Stage::getNumber));

        int[] answer = new int[stageFailureRates.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = stageFailureRates.get(i).getNumber();
        }

        return answer;
    }
    public class Stage {
        private int number; // 스테이지 번호
        private double failRate; // 실패율

        public Stage(int number, double failRate) {
            this.number = number;
            this.failRate = failRate;
        }

        public int getNumber() {
            return number;
        }

        public double getFailRate() {
            return failRate;
        }
    }
}
