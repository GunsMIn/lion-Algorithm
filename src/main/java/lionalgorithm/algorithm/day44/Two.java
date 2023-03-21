package lionalgorithm.algorithm.day44;

import java.lang.reflect.Array;
import java.util.*;

public class Two {
    public int[] solution(int[] numbers) {

        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                result.add(numbers[i] + numbers[j]);
            }
        }

        List<Integer> resultList = new ArrayList<>(result);
        Collections.sort(resultList);

        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        return answer;

    }
}
