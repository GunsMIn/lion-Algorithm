package lionalgorithm.algorithm.day15;

public class Solution5 {

    //https://school.programmers.co.kr/learn/courses/30/lessons/76501
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        //absolutes에는 숫자배열이 들어있다
        //signs true를 만나면 양수 false를 만나면 음수이다.
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == false) {
                int fv = absolutes[i] * -1;
                answer += fv;
                continue;
            }
            answer += absolutes[i];
        }
        return answer;
    }

    public int solution2(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
            answer += signs[i] ? absolutes[i] : -absolutes[i];
        }
        return answer;
    }
}
