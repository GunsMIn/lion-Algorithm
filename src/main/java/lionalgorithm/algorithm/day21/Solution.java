package lionalgorithm.algorithm.day21;

public class Solution {

    //하샤드의수 https://school.programmers.co.kr/learn/courses/30/lessons/12947

    public boolean solution(int x) {
        //x의 값을 하나하나 더 한 변수가 필요하다.
        boolean answer = false;
        int sum = 0;
        int originValue = x; // x가 계속 변할것이라서 원래의 숫자를 담아 줄 변수

        while (x != 0) {
            sum += x % 10;
            x /= 10; //자릿수 이동
        }

        if (originValue % sum ==0) {
           answer = true;
        }

        return answer;
    }
}
