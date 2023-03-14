package lionalgorithm.algorithm.day13;

import java.util.HashSet;
import java.util.Set;

public class Solution4 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/1845
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length / 2;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num); // 중복제거
        }
        int size = set.size();
        if (max < size) {
            answer = max;
        } else {
            answer = size;
        }

        return answer;
    }
}
