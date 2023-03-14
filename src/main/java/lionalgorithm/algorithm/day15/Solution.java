package lionalgorithm.algorithm.day15;

import org.springframework.web.method.support.HandlerMethodReturnValueHandler;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    //https://school.programmers.co.kr/learn/courses/30/lessons/1845

    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length / 2;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num); // 중복제거
        }
        int size = set.size();
        if (max < size) { // 중복을 제거한 set의 크기가 nums의 배열 /2 보다 크면 선택할 수 있는 것은 배열의 /2 값이다
            answer = max;
        } else { //size가 max보다 작을 때
            answer = size;
        }
        return answer;
    }

}
