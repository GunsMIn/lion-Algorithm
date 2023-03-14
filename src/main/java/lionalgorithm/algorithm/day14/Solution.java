package lionalgorithm.algorithm.day14;

import java.util.Stack;
import java.util.Stack;

public class Solution {

    //https://school.programmers.co.kr/learn/courses/30/lessons/42584

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek(); //stack.peek()에서는 전에 들어갔던 배열의 index번호가 있을것!
                stack.pop();
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            answer[stack.peek()] = prices.length - 1 - stack.peek();
            stack.pop();
        }
        return answer;
    }

    public int[] solutions(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> st = new Stack<>();
        //1 2 3 2 3
        for (int i = 0; i < prices.length; i++) {
            if (!st.isEmpty() && prices[st.peek()] < prices[i]) {
                //가격이 떨어진 것
                answer[st.peek()] = i - st.peek();
                st.pop();
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            answer[st.peek()] = prices.length - 1 - st.pop();
        }
        return answer;
    }

}
