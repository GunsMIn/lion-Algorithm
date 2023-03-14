package lionalgorithm.algorithm.day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

    //팩토리얼
    public static int factor(int num) {
        if (num == 1) return 1;
        return num * factor(num - 1);
    }

    public static int factoraial(int num) {
        if (num == 1) return 1;
        return num * factoraial(num - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.valueOf(bf.readLine());
        System.out.println(factor(num));
    }
}
