package lionalgorithm.algorithm.day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
        // 우선 참여자들 모두 1의 값을 넣어줄 것이다.
        for (String person : participant) {
            map.put(person, map.getOrDefault(person, 0) + 1); // 그러면 각각 1 들어감
        }
        //완주한 선수들은 값을 0을 만들어 줄 것이다. 그럼 이 반복문을 완료하였을때 아직 value가 1인 선수는 완주X
        for (String complete : completion) {
            map.put(complete, map.get(complete) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                answer += key;
            }
        }
        return answer;
    }
}