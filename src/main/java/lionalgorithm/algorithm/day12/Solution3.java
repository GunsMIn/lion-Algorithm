package lionalgorithm.algorithm.day12;

import java.util.Arrays;
import java.util.Comparator;

public class Solution3 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42746
    public String solution(int[] numbers) {
        String answer = "";
        //숫자배열로 값이 들어옴
        String[] strArr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            strArr[i] = String.valueOf(numbers[i]); // 문자열로 parsing
        }

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2); // 내림차순 정렬
            }
        });

        for (String s : strArr) {
            answer += s;
        }

        return answer;
    }

}
