package lionalgorithm.algorithm.day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    //https://velog.io/@pjj186/JAVA-%EC%9E%AC%EA%B7%80-%ED%94%BC%EB%B3%B4%EB%82%98%EC%B9%98-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0
    //    1, 1, 2, 3, 5에서 3번째 있는 값은 어떤 것일까요? 첫번째, 두번째가 각각 1, 1이기 때문에 세번째 값은 2 입니다.
//    함수로 표현 해보면 fib(1) = 1이고 fib(2) = 1, fib(3) = 2 이렇게 됩니다.
//계속 해보면 fib(4)는 3이고 fib(5)는 5, fib(6)은 8 입니다.
//이것을 리스트에 넣어보면 또 다릅니다. [1, 1, 2, 3, 5, 8] 이렇게 들어갑니다.
//fib = [1, 1, 2, 3, 5, 8]


    public static int fiboo(int num) {
        int result = 0;
        if (num == 1) {
            result = 1;
        } else if (num == 2) {
            result = 1;
        } else if (num >= 3) {
            result = fiboo(num - 2) + fiboo(num - 1);
        }
        return result;
    }

    public static int fibboo(int num) {
        int result = 0;
        if (num == 1) result = 1;
        else if (num == 2) result = 2;
        else if (num >= 3) {
            result = fibboo(num - 2) + fibboo(num - 1);
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.valueOf(bf.readLine());
        for (int i = 1; i <= num; i++) {
            System.out.print(fiboo(num));
        }
        System.out.println(" =------------------------------ ");

        for (int i = 1; i <= num; i++) {
            System.out.print(fiboo(i));
        }



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
