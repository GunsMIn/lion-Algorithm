package lionalgorithm.algorithm.day41;

import java.util.*;

public class Two {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }


        Set<String> keySet = map.keySet();
        for (String k : keySet) {
            if (map.get(k)!=0) {
                answer += k;
            }
        }

        return answer;
    }

   
}
