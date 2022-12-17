package lionalgorithm.algorithm.day19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionKakao {
    //실패율 클래스
    class Fail{
        int stage; // 1번 스테이지 2번스테이지 .....
        double fail; //
        public Fail(int stage, double fail) {
            this.stage = stage;
            this.fail = fail;
        }
    }



    public int[] solution(int N, int[] stages) {
      
        //실패율 = 도달 했는데 클리어 못한 수 / 도달 한 전체 수
        // int N = 전체 스테이지의 개수
        // int[] stages 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열[2, 1, 2, 6, 2, 4, 3, 3]
        // stages.lentgth가 유저의 명수
        int[] answer = new int[N];
        List<Fail> fails = new ArrayList<>();
        int total = stages.length; // 총 인원수

        //users의 index는 stage의 번호이고 값은 stage에 도달한 사용자
        int[] users = new int[N + 1];
        //이제 각 stages를 순회를 할 것
        for (int s : stages) {
          /*  users[s]*/
        }
        
        
        
        
        
        return answer;
    }
}
