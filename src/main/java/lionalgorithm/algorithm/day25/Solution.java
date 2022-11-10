package lionalgorithm.algorithm.day25;

import java.util.Stack;

public class Solution {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12906
    //같은 숫자는 싫어
    public int[] solution(int []arr) {

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) { // 앞 뒤가 같지 않는 숫자 일때 stack에 넣어주자
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        return answer;
    }
}
