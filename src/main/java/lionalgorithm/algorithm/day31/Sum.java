package lionalgorithm.algorithm.day31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    //1~n의 합구하기 재귀함수
    public int sum(int num) {
        if (num == 0) return num; // num이 0일때 0 리턴
        return num + sum(num - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.valueOf(bf.readLine());
        System.out.print(new Sum().sum(num));
    }
}
