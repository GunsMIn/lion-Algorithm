package lionalgorithm.algorithm.day15;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    //https://school.programmers.co.kr/learn/courses/13577/lessons/96091
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i); // 해싱처리완료!
        }


        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                //반복문안의 반복문에서도 i를 사용 할 수 있다.
                if (map.containsKey(phone_book[i].substring(j))) {

                }

            }
        }


        return answer;
    }
}
