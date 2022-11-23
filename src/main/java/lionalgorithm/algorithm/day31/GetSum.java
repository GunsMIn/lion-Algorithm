package lionalgorithm.algorithm.day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetSum {

    //자릿수의 합구하기
    public static int sumOfDigit(int q) {
        if(q==0) return 0;
        return q % 10 + sumOfDigit(q / 10);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.valueOf(bf.readLine());
        System.out.print(sumOfDigit(num));
    }
}
