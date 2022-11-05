package lionalgorithm.algorithm.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12977
    public int solution(int[] nums) {
        int answer = 0;
        //오름차순 정렬을 해주자
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        //우선 3개의 배열의 값을 각각 더해야한다.
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k <nums.length ; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    private boolean isPrime(int sum) {
        for (int i = 2; i < Math.sqrt(sum) ; i++) {
            if (sum % i == 0) {
                return false;
            }
        }
        return true;
    }

}
