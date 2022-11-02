package lionalgorithm.algorithm.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {




    public static void main(String[] args) {

        int n = 50;

        int[] prime = new int[n + 1];
        for (int i = 0; i < prime.length; i++) {
            prime[i]=i;
        }
        System.out.println("prime = " + Arrays.toString(prime));


        //리스트에서 2를 제외한 모든 2의 배수 지우기
        for (int i = 2; i < n; i++) {
            if(i==2)continue;
            for (int j = i * i; j < n; j += i) {
                prime[i]=0;
            }
        }
        System.out.println("prime = " + Arrays.toString(prime));

    }
}
