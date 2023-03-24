package lionalgorithm.algorithm.day45;

import java.util.*;

public class Solution2 {


    public String solution(String X, String Y) {
        // 각각의 문자열에서 숫자의 빈도수를 저장할 map구조 2개
        Map<Character, Integer> countX = new HashMap<>();
        Map<Character, Integer> countY = new HashMap<>();

        // X 문자열의 각 문자별 빈도수를 countX에 저장합니다.
        for (char ch : X.toCharArray()) {
            countX.put(ch, countX.getOrDefault(ch, 0) + 1);
        }

        // Y 문자열의 각 문자별 빈도수를 countY에 저장합니다.
        for (char ch : Y.toCharArray()) {
            countY.put(ch, countY.getOrDefault(ch, 0) + 1);
        }

        // 결과를 저장할 StringBuilder를 생성합니다.
        StringBuilder result = new StringBuilder();
        boolean hasPair = false;

        // 9부터 0까지 순회하며 공통되는 숫자를 찾습니다.
        // 이 코드 블록은 가장 큰 숫자부터 가장 작은 숫자까지 내림차순으로 순회하면서,
        // 두 문자열에서 공통으로 나타나는 숫자를 찾고,
        // 그 숫자들을 결과 문자열에 추가하여 가장 큰 숫자를 만드는 데 사용됩니다.
        for (char ch = '9'; ch >= '0'; ch--) {
            if (countX.containsKey(ch) && countY.containsKey(ch)) {
                hasPair = true;
                int min = Math.min(countX.get(ch), countY.get(ch));
                for (int i = 0; i < min; i++) {
                    result.append(ch);
                }
            }
        }

        if (!hasPair) {
            return "-1";
        }

        // 공통되는 숫자가 모두 0인 경우에는 0을 반환합니다.
        if (result.length() == 0) {
            return "0";
        }

        // 결과 문자열을 반환합니다.
        return result.toString();


    }






    /**
     * 0334 0123
     *
     * **/
    public String solution2(String X, String Y) {
        String answer = "";
        char[] xChars = X.toCharArray();
        char[] yChars = Y.toCharArray();
        Arrays.sort(xChars); // 오름차순 정렬
        Arrays.sort(yChars); // 오름차순 정렬

        String temp = "";

        int length = Math.max(xChars.length, yChars.length);



        return answer;
    }
}
