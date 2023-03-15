package lionalgorithm.algorithm.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class One {
    /**
     * 순서대로 ? -> stack을 이용?
     * 중복 제거이지만 순서대로이니 set은 사용 못한다.
     * 하지만 linkedhashset은?
     *
     *
     * **/
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int prev = -1;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] != prev) {
                stack.push(arr[i]);
                prev = arr[i];
            }
        }

        //int[] answer = new int[stack.size()];
        // 1 3 0 1
        int[] answer = stack.stream().mapToInt(i -> i).toArray();
        return answer;
    }


    public int[] preferSolution(int[] arr) {
        List<Integer> temp = new ArrayList<>();
        int a = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != a) {
                temp.add(arr[i]);
                a = arr[i];
            }
        }

        int[] answer = new int[temp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }




    /**처음의 나의 잘못된 접근 🔽*/
    public int[] wrongSolution(int[] arr) {
        arr[arr.length + 1] = -1;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            //앞 뒤 수가 같으면 pop
            if (arr[i] == arr[i + 1]) {
                stack.pop();
            }
            stack.push(arr[i]);
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}
