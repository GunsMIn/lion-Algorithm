package lionalgorithm.algorithm.day15;

import java.util.Arrays;

public class Solution4 {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCnt = 0;
        int correctCnt = 0;

        Arrays.sort(lottos); //내가 찍은 로또 번호
        Arrays.sort(win_nums); // 결과 로또 번호

        for (int myLotto : lottos) {
            if (myLotto == 0) {
                zeroCnt++;
                continue;
            }
            for (int win_num : win_nums) {
                if (win_num == myLotto) {
                    correctCnt++;
                    break;
                }
            }
        }
        int max = correctCnt + zeroCnt;
        int min = correctCnt;

        for (int i = 0; i < 2; i++) {
            if (answer[i] == 6) answer[i] = 1;
            else if (answer[i] == 5) answer[i] = 2;
            else if (answer[i] == 4) answer[i] = 3;
            else if (answer[i] == 3) answer[i] = 4;
            else if (answer[i] == 2) answer[i] = 5;
            else answer[i] = 6;
        }

        return answer;
    }
}
