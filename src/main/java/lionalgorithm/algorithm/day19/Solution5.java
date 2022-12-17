package lionalgorithm.algorithm.day19;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution5 {

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        //["119", "97674223", "1195524421"]
        Map<String, Integer> map = new HashMap<>();
        for (String s : phone_book) {
            map.put(s, 1);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }


        return answer;
    }

    public boolean solution2(String[] phone_book) {
        boolean answer = true;
        //["119", "97674223", "1195524421"]
        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return answer;
    }
}
