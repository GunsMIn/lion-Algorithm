package lionalgorithm.algorithm.day18;

import java.util.Stack;

public class StackOfKakao {
    //https://school.programmers.co.kr/learn/courses/30/lessons/64061
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        //1. int[] moves의 배열은 board 2차원 배열의 가로의 순서를 결정한다 [1,5,3,5,1,2,1,4]
        for (int move : moves) { // moves는 열을 정함
            for (int j = 0; j < board.length; j++) {
                if(board[j][move-1]!=0){ // 그러면 인형을 뽑았을때 여기로 들어온다.
                    if (stack.peek() == board[j][move - 1]) {
                        stack.pop();
                        answer+=2;
                    }else{
                        stack.push(board[j][move - 1]);
                    }
                    board[j][move-1]=0; // 뽑았으면 0 으로 만들어줌.
                    break; //2중for문에서의 break는 가장가까운 for문을 탈출
                }
            }
        }
        return answer;
    }
}
