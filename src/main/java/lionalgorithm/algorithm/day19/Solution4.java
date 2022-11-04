package lionalgorithm.algorithm.day19;

import java.util.Arrays;

public class Solution4 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12982
    public int solution(int[] d, int budget) {
        int count = 0;
        int sum = 0;
        //예산을 다 처리할 수 있는 경우는 2가지가 존재
        // 1.예산으로 다 처리할 수 있는 경우
        // 2.예산으로 다 처리할 수 없는 경우
        //우선 d를 오름차순으로 만든다.
        Arrays.sort(d);
        //작은 수부터 더하는 것이 최대의 값을 낼 수 있을 것이다.
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum > budget) {
                count = i; // 인덱스의 번호가 여기서는 count로~
                break;
            }
        }
        if (sum <= budget) {
            count = d.length;
        }
        return count;
    }
}
