package lionalgorithm.algorithm.day32;

import java.util.Scanner;

public class GetGcd {
    /**
     * 최대공약수 구하기(GCD: Greatest Common Divisor)
     * int a = 196 / int b = 42 각 수를 소수의 곱으로 표현하면 다음과같다
     * 42에는 2 * 7이 들어있고 196에도 2 * 7이 들어있습니다. 그래서 약수는 1, 2, 7, 14가 공약수가 되겠습니다.
     * 하지만 최대공약수는 최대이기 때문에 약수중에 가장큰 한개가 최대공약수입니다.
     * 그래서 1, 2, 7, 14중에 가장큰 숫자는 14이기 때문에 14가 최대 공약수가 되는 것입니다.
     */


    private static int gcd(int a, int b) {
        //gcd(a, a) = a ->두 수가 같으면 최대 공약수는 a라는 정의
        // 핵심로직 큰것에서 작은것을 빼주는는 것
        if (a == b) {
            return a;
        } else if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }
    }

    public static void main(String[] args) {
        int a = 196;
        int b = 42;
        System.out.println(gcd(a, b));
    }
}
