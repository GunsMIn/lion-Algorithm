package lionalgorithm.algorithm.day30;

public class Solution {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12926

    public String solution(String s, int n) {
         String answer = "";
        //s로는 문자열이 들어온다,
        //n은 글자를 각각 n만큼 이동시켜준다.
        //제일 처음으로 처리해야하는 것은 공백처리이다
        //아스키코드 32 -> 공백 처리?

        char[] chars = s.toCharArray();
        for (char c : chars) { // c는 문자 하나하나이다.
            if(c==32) answer += " ";
        }


        return answer;
    }

}
