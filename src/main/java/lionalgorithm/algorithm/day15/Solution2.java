package lionalgorithm.algorithm.day15;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {


//https://school.programmers.co.kr/learn/courses/13577/lessons/96091

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i); // 해싱처리
        }


        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                //반복문안의 반복문에서도 i를 사용 할 수 있다.
                if (map.containsKey(phone_book[i].substring(0, j))) {// 해당전화번호를 하나하나 map의 key값이랑 비교하기
                    answer = false;
                }
            }
        }

        return answer;
    }
}
