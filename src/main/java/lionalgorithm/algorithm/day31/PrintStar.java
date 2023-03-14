package lionalgorithm.algorithm.day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrintStar {
    //별찍기
    //1.반복할 메소드 만들기
    static void printNum(int num) {
        if (num == 0) return; // 탈출 조건
        System.out.printf("%s", "*");
        printNum(num - 1);
    }

    static String printNums(int num) {
        if (num == 0) return "";
        return "*" + printNums(num - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.valueOf(bf.readLine());
        printNum(num);
        System.out.println();
        System.out.println("=====================");
        System.out.println(printNums(num));
    }
}
