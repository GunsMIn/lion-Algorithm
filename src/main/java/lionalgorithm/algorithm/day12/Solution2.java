package lionalgorithm.algorithm.day12;

import java.util.Arrays;

public class Solution2 {


    public int solution(int[] citations) {
        // 3,0,6,1,5
        // 0,1,3,5,6
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}
