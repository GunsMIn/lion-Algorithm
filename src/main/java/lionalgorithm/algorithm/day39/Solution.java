package lionalgorithm.algorithm.day39;

public class Solution {

    //피보나치수열
    //0과 1로 시작하고  n번째 피보나치 수는 바로 직전의 두 피보나치 수의 합이다.
    //즉 다섯 번째 피보나치 수인 5는 다섯 번째 수는 네 번째수와 세 번째 수의 합이고,
    // 네 번째 수는 세 번째 수와 두 번째 수의 합이 된다.

    public static long fib(int n, long[] memo) {

        if (n == 0) throw new IllegalStateException("n은 1이상의 수");
        if (n == 1 || n == 2) return 1;
        //인덱스 1,2는 1 반환
        if (memo[n] == 0) { // memo 배열에 초기값 0이 들어있다.
            memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
            //memo[5] = fib(4) + fib(3)
        }
        return memo[n];
    }


    public static void main(String[] args) {
        int n = 5;
        var r = fib(n, new long[n + 1]);
        System.out.println(r);

    }
}
