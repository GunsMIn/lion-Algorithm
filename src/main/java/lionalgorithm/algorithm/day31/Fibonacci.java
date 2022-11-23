package lionalgorithm.algorithm.day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    //    1, 1, 2, 3, 5에서 3번째 있는 값은 어떤 것일까요? 첫번째, 두번째가 각각 1, 1이기 때문에 세번째 값은 2 입니다.
//    함수로 표현 해보면 fib(1) = 1이고 fib(2) = 1, fib(3) = 2 이렇게 됩니다.
//계속 해보면 fib(4)는 3이고 fib(5)는 5, fib(6)은 8 입니다.
//이것을 리스트에 넣어보면 또 다릅니다. [1, 1, 2, 3, 5, 8] 이렇게 들어갑니다.
//fib = [1, 1, 2, 3, 5, 8]
    public static int fib(int n) {
        if(n==1 || n==2) return 1;
        List<Integer> fibonacciNums = new ArrayList<>();
        fibonacciNums.add(1); // 0
        fibonacciNums.add(1); // 1
        for (int i = 2; i < n ; i++) {
            fibonacciNums.add(fibonacciNums.get(i - 1) + fibonacciNums.get(i - 2));
            //                                                          i , sum
            //fibonacciNums.add(fibonacci.get(1) + fibonacci.get(0)) => 2 , 2
            //fibonacciNums.add(fibonacci.get(2) + fibonacci.get(1)) => 3 , 3
            //fibonacciNums.add(fibonacci.get(3) + fibonacci.get(2)) => 4 , 5
            //fibonacciNums.add(fibonacci.get(4) + fibonacci.get(3)) => 5 , 8

        }
        return fibonacciNums.get(n - 1);
    }



    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.valueOf(bf.readLine());

        System.out.println(fib(num));


       /* List<Integer> fibonacciNums = new ArrayList<>();
        // 1 1 2 3 5 8 13 -> 7개
        // 1 1 2 3 5 8 13 21 -> 8개
        int i = 0;
        fibonacciNums.add(1);
        i = 1;
        fibonacciNums.add(1);
        i = 2;
        fibonacciNums.add(fibonacciNums.get(1)+fibonacciNums.get(0)); // <- fibonacci.get(1) + fibonacci.get(0)
        i = 3;
        fibonacciNums.add(fibonacciNums.get(2)+fibonacciNums.get(1)); // <- fibonacci.get(2) + fibonacci.get(1)
        i = 4;
        fibonacciNums.add(fibonacciNums.get(3)+fibonacciNums.get(2)); // <- fibonacci.get(3) + fibonacci.get(2)*/


    }
}
