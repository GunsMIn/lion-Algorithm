package lionalgorithm.algorithm.day14;

import java.util.HashMap;
import java.util.Map;

public class ARacer {


    //프로그머스 완주하지못한 선수
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> memo = new HashMap<>();
        for (String p : participant) {
            memo.put(p, memo.getOrDefault(p, 1));
        }
        for (String c : completion) {
            memo.put(c, memo.get(c) - 1);
        }
        for (String k : memo.keySet()) {
            if (memo.get(k) == 1) {
                answer += k;
            }
        }
        return answer;
    }


    public static void main(String[] args) {



    }
}
