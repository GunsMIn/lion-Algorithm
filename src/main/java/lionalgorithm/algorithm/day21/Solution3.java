package lionalgorithm.algorithm.day21;

import java.util.Arrays;
import java.util.Collections;

//https://school.programmers.co.kr/learn/courses/30/lessons/12933
public class Solution3 {
    //https://velog.io/@stella317/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%A0%95%EC%88%98-%EB%82%B4%EB%A6%BC%EC%B0%A8%EC%88%9C%EC%9C%BC%EB%A1%9C-%EB%B0%B0%EC%B9%98%ED%95%98%EA%B8%B0
    public long solution(long n) {
        long answer = 0;
        String stringValue = String.valueOf(n);

        char[] chars = stringValue.toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        String string = sb.reverse().toString();
        answer = Long.parseLong(string);

        return answer;
    }

    public long solutions(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        String[] split = s.split("");
        /*primitive arrays은 Arrays.sort()를 통한 내림차순을 할 수 없다.
        Collections.reverseOrder()를 사용하면 error가 발생한다. 
        Object of Array를 사용하면 Collections.reverseOrder()사용 가능하다.ex) Integer, String*/
        Arrays.sort(split, Collections.reverseOrder());
        //문자열로 정렬이 됨
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
        }


        return Long.parseLong(sb.toString());
    }
}
