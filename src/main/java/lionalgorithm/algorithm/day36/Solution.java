package lionalgorithm.algorithm.day36;

import java.util.Scanner;

public class Solution {


    public static void findPrimeFactor(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(i);
                findPrimeFactor(n / i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution.findPrimeFactor(n);
    }


}
