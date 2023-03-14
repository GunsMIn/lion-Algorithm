package lionalgorithm.algorithm.day15;

import java.util.Arrays;

public class Solution3 {

    //https://school.programmers.co.kr/learn/courses/30/lessons/77484
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        //31, 10, 45, 1, 6, 19
        //44, 1, 0, 0, 31 ,25
        int zeroCnt = 0;
        int correctCnt = 0;
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        //0,0,1,25,31,44
        //1,6,10,19,31,45
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCnt++;
                continue;
            }
            for (int j = 0; j < lottos.length; j++) {
                if (win_nums[j] == lottos[i]) { // 1
                    correctCnt++;
                    break;
                }
            }
        }
        answer[0] = getRank(zeroCnt + correctCnt);
        answer[1] = getRank(correctCnt);

        return answer;
    }

    public static int getRank(int n) {
        switch (n) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }


    }


    public static void main(String[] args) {

        Solution3 s = new Solution3();

    }
}
