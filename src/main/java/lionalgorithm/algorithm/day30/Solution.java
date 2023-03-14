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
            if (c == 32) answer += " "; // 아스키 코드에서 32가 공백
            else {
                if (c >= 65 && c <= 90) {
                    c += n;
                    if (c > 90) c -= 26; // 들어온게 소문자인데 대문자로 처리된면 안되니 -26해주자
                } else if (c >= 97 && c <= 122) {
                    c += n;
                    if (c > 122) c -= 26;
                }
                answer += c;
            }
        }


        return answer;
    }

}
