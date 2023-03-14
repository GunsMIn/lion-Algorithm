package lionalgorithm.algorithm.day34;

public class Solution {
    //12
    // 1,2,3,4,6,12
    // 어떤 수의 약수는  해당 숫자를 n으로 나누었을때 나머지가 0이어야 약수이다.
    public int solve(int a) {
        int answer = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) answer += i;
        }
        return answer;
    }


    public static void main(String[] args) {


    }
}
