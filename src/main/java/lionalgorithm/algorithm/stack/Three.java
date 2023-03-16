package lionalgorithm.algorithm.stack;

import java.util.Stack;

public class Three {
    /**
     * https://school.programmers.co.kr/learn/courses/30/lessons/12909
     * 매개변수로는 괄호들이 들어온다.
     * 즉 관건은 stack에 들어가면 끝에는 stack.isEmpty가 true여야한다.
     *
     * **/

    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                //이미 올바르지 않은 괄호의 상태일 경우 check
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

}
