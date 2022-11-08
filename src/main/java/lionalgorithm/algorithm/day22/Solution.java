package lionalgorithm.algorithm.day22;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    //https://codeup.kr/problem.php?id=3001
    //단순 탐색
    public int soltution(int n, int[] arr,int want) {
        int answer = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == want) {
                answer = i+1;
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int want = sc.nextInt();




        Solution s = new Solution();
        int soltution = s.soltution(n, arr, want);
        System.out.println("soltution = " + soltution);

    }

}
