package lionalgorithm.algorithm.day30;

import java.util.Arrays;

public class Solution3 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12930
    public String solution(String s) {
        //s라는 문자열을 공백을 기준으로 split을 해줘야한다,
        //공백을 기준으로 인덱스는 0부터 시작
        String answer = "";
        String[] str = s.split("");
        //[t, r, y,  , h, e, l, l, o,  , w, o, r, l, d]
        int idx = 0; // 인덱스 비교

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(" ")) { // 공백이면 index초기화
                idx = 0;
            } else if (idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        }


        return answer;
    }


    public static void main(String[] args) {

        String s = "try hello world";
        String[] split = s.split("");
        System.out.println("Arrays.toString(split) = " + Arrays.toString(split));

    }
}
