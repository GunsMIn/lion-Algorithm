package lionalgorithm.algorithm.day39;

public class Solution {


    public static Long fib(long n, long[] memo) {

        if (n < 1) return 1;
        if (memo[(int)n] == 0) {
            memo[(int) n] = fib(n - 1, memo) + fib(n - 2, memo);
        }
        return memo[n];
    }


    public static void main(String[] args) {


    }
}
