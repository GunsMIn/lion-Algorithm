package lionalgorithm.algorithm.day20;

//https://school.programmers.co.kr/learn/courses/30/lessons/12947
public class Solution5 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int n = x;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        if (n % sum != 0) {
            return false;
        }

        return answer;
    }

}
