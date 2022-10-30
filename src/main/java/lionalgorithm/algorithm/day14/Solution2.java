package lionalgorithm.algorithm.day14;

public class Solution2 {


    //https://school.programmers.co.kr/learn/courses/30/lessons/42842
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        //우선 brown과 yellow를 더하자
        int sum = brown + yellow;
       //2.가로와 세로는 반드시 3이상이어야한다
        for (int i = 3; i < sum; i++) {
            int sero = i;
            int garo = sum / sero;
            if (sero > garo) { // 세로가 가로보다 크면 안된다 continue
                continue;// 아래 못내려가게하려고!
            }
            if ((sero - 2) * (garo - 2) == yellow) {
                answer[0] = garo;
                answer[1] = sero;
                return answer;
            }
        }
        return answer;
    }

    public int[] solutions(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        for (int i = 3; i < sum; i++) {
            int garo = i;
            int  sero = sum / garo;
            if(sero > garo){continue;}
            if ((garo - 2) * (sero - 2) == yellow) {
                answer[0] = garo;
                answer[1] = sero;
                return answer;
            }
        }

        return answer;
    }




}
