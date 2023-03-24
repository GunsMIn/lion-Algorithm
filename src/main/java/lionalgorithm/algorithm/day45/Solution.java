package lionalgorithm.algorithm.day45;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {



    /**
     * 1478 → "one4seveneight"
     * 234567 → "23four5six7"
     * 10203 → "1zerotwozero3"
     * **/
    public int solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        // 우선 StringBUilder를 2개 만들어서 하나는 결과를 리턴할
        // (증요!)그리고 하나는 문자가 들어왔을 때 맞는 문자열이 만들어질 때까지 문자들을 문자열로 저장할 임시 공간 temp이다 .
        StringBuilder answer = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                answer.append(c);
            }else{ /**숫자가 아닐때, 문자일 때 **/
                temp.append(c);
                if (map.containsKey(temp.toString())) { /**문자를 저장했던 공간에 해당 문자가 있을 때**/

                    answer.append(map.get(temp.toString()));
                    temp.setLength(0); // 문자 저장할 임시 공간을 비워줌
                }
            }
        }
        return Integer.parseInt(answer.toString());
    }


}
