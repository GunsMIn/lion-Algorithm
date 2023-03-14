package lionalgorithm.algorithm.day26;

public class Solution {
    public long solution(long n) {
        // n = 1일때 x
        // n = 2일때 3
        // n = 3일때 4,8
        // 나머지와 몫이 같은 자연수의 갯수는 n-1개 -> 나머지와 몫이 같은 자연수는 배수관계이다.
        long answer = 0;

        for (int i = 0; i < n; i++) {
            answer += (n + 1) * i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(2));
    }
}
