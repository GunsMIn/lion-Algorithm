package lionalgorithm.algorithm.day21;

import java.util.ArrayList;
import java.util.Comparator;

public class Solution2 {
    //나누어 떨어지는 숫자 배열
    //https://school.programmers.co.kr/learn/courses/30/lessons/12910

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        //arr의 숫자배열에서 divisor 값으로 나누어 떨어지는 숫자를 반환
        //우선 반복문을 돌려야한다.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }

        return  list.stream().sorted(Comparator.naturalOrder()).mapToInt(Integer::intValue).toArray();

    }
}
