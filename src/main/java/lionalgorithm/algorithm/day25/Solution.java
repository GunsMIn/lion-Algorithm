package lionalgorithm.algorithm.day25;

import java.util.Stack;

public class Solution {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12906
    //같은 숫자는 싫어
    //https://www.youtube.com/watch?v=IxrMbl1w4RA
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        //나중에 stack에서 peek를 하기 위함
        stack.push(arr[0]);//1번째 숫자를 직접 넣어준다.
        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) { // 앞 뒤가 같지 않는 숫자 일때 stack에 넣어주자
                stack.push(arr[i]);
            }
        }
        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }
}
