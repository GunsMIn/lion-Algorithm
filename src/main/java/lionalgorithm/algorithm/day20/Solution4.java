package lionalgorithm.algorithm.day20;

public class Solution4 {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num;
            num += x;
        }
        return answer;
    }
}
