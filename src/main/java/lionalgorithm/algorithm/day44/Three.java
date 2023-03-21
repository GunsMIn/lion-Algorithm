package lionalgorithm.algorithm.day44;

import java.util.Arrays;
import java.util.HashSet;

public class Three {
    public int[] solution(int[] lottos, int[] win_nums) {

        int count = 0; // 6개모두 일치 시 1등 , 5개 2등 , 4개 3등

        int zeroCnt = 0;
        int matchCnt = 0;

        //lotto 배열을 순회하면서 0의 개수와 맞은 번호의 개수를 계산
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCnt++;
            }
        }

        HashSet<Integer> winNumsSet = new HashSet<>();
        for (Integer num : win_nums) {
            winNumsSet.add(num);
        }

        // lottos 배열을 순회하면서 맞은 번호의 개수를 계산
        for (int num : winNumsSet) {
            if (num != 0 && winNumsSet.contains(num)) {
                matchCnt++;
            }
        }

        int maxRank = 7 - (matchCnt + zeroCnt);
        int minRank = 7 - matchCnt;
        // 순위가 6을 초과하는 경우 6으로 조정
        if (maxRank > 6) {
            maxRank = 6;
        }
        if (minRank > 6) {
            minRank = 6;
        }

        // 결과 배열을 생성하여 반환
        return new int[]{maxRank, minRank};
    }
}
