package lionalgorithm.algorithm.day22;

import java.util.Arrays;

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

        int n = 10;
        int[] arr = {2, 3, 7, 4, 9, 10, 233, 111, 23, 39};
        int want =111;

        Solution s = new Solution();
        int soltution = s.soltution(n, arr, want);
        System.out.println("soltution = " + soltution);

    }

}
