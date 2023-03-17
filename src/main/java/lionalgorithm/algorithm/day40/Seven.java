package lionalgorithm.algorithm.day40;

import java.util.Arrays;

public class Seven {
    public int solution(int[] d, int budget) {
        int count = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            // 1 2 3 4 5 / 8 6 3
            budget -= d[i];
            if(budget<0 || budget < d[i]) break;
            count++;
        }
        return count;

    }
}
