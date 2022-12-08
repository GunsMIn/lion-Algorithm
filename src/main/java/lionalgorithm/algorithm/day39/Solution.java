package lionalgorithm.algorithm.day39;

public class Solution {


    public static long fib(int n, long[] memo) {

        if(n == 0) throw new IllegalStateException("n은 1이상의 수");
        if(n == 1 || n == 2) return 1;
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
