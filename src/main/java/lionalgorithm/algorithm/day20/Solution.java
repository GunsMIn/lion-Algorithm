package lionalgorithm.algorithm.day20;

public class Solution {
    /***
     * AND(&) 연산자
     * 비트 단위로 AND 연산을 한다. 즉 &연산은 두 개의 비트가 모두 1일 때 1을 반환하는 AND 연한을 한다
     * 연산	결과
     * 0&0	0
     * 0&1	0
     * 1&0	1
     * 1&1	1
     * OR(|) 연산자
     * 비트단위로 OR 연산을 한다. 즉 |연산은 두 개의 비트 중 하나라도 1이면 1을 반환하는 OR 연산입니다.
     * 연산	결과
     * 0|0	0
     * 0|1	1
     * 1|0	1
     * 1|1	1
     */
    //https://school.programmers.co.kr/learn/courses/30/lessons/17681
    public String[] solution(int n, int[] arr1, int[] arr2) {
        //우선 10진수를 2진수로 바꾸자
        String[] string = new String[n];
        for (int i = 0; i < n; i++) {
            //
            string[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            string[i] = string[i].replaceAll("1", "#");
            string[i] = string[i].replaceAll("0", " ");

            //이진수 변환시 1은 00001이 아닌 1이다
            //비트 연산 뒤에도 n길이가 되지 않는 경우가 발생할 수 있다
            while (string[i].length() < n) {
                string[i] = " " + string[i];
            }
        }
        return string;
    }


    public String[] solutions(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
            while (answer[i].length() < n) {
                answer[i] = " " + answer[i];
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(new Solution().solution(n, arr1, arr2));
    }
}
