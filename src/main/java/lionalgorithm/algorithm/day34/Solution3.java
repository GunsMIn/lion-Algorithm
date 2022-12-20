package lionalgorithm.algorithm.day34;

public class Solution3 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12903
    public String solution(String s) {
        //단어의 가운데 글자를 반환해야한다.
        //문자열의 길이를 먼저 계산해야한다.
        //짝수 일때랑 홀수일때
        //4 0123
        //12(가운데)
        //5 01234
        //2(가운데)
        String answer = "";
        int length = s.length();
        if (length % 2 == 0) {
            answer += s.substring(length / 2 - 1, length / 2 + 1);
        }else{
            //2.5여도 int면 소수점 버려진다.
            answer += s.substring(length / 2, length / 2 + 1);
        }
        return answer;
    }

}
