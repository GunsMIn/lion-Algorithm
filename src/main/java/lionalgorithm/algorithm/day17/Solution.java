package lionalgorithm.algorithm.day17;

public class Solution {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12921
    //소수란?
    //2,3,5,7,11
    //1과 자기 자신외에 나누어떨어지는게 없는 수

    public int solution(int n) {
        int answer = 0;
        //1. n이 10 이면 1부터 10까지 소수 체크이다 (단 1은 소수가 아니니 배제)
        for (int i = 2; i <= n; i++) {
            boolean flag = false;
            for (int j = 2; j * j < i - 1; j++) {
                if (i % j != 0) { // 소수가 아닐 때
                    flag = true;
                }
            }
            if (flag) {
                answer++;
            }
        }

        return answer;
    }

}
