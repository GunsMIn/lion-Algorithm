package lionalgorithm.algorithm.day40;


import java.util.Arrays;
import java.util.Comparator;


public class Two {

    public String solution(String s) {
        String answer = "";
        String[] split = s.split("");
        Arrays.sort(split, Comparator.reverseOrder());

        for (String s1 : split) {
            answer += s1;
        }
        return answer;
    }
}
