package lionalgorithm.algorithm.day37;

public class Solution {

    public int[] getChildrenIndex(int parentIdx) {
        int leftIdx = 2 * parentIdx +1; // 왼쪽 노드
        int rightIdx = 2 * parentIdx +2; // 오른쪽 노드
        return new int[]{leftIdx,rightIdx};


    }

    public int solution(int [][]board)
    {
        //1.기준점에서 왼쪽 ,위쪽, 왼쪽 대각선 위의 현재숫자를 찾는다
        //2.not 0이면 3개의 방향중에 최소인숫자에 +1을 해서 저장
        //3.저장된 숫자는 가장 큰 정사각형의 한변이 될 것이다.
        //board.length = 세로길이
        //board.length[0] = 가로길이이다.
        int answer = 0;
        int height = board.length;
        int width = board[0].length;
        int[][] temp = new int[height+1][width+1];

        //배열을 복사할 것이다.
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                temp[i + 1][j + 1] = board[i][j];
            }
        }

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (temp[i][j] != 0) { // 0이 아닌 경우에  최소를 먼저 찾는다
                    temp[i][j] = Math.min(Math.min(temp[i - 1][j], temp[i][j - 1]), temp[i - 1][j - 1]) + 1;
                    answer = Math.max(answer, temp[i][j]); // Math.max(a,b) -> a,b중 큰수가 answer에 담긴다
                    //반복문 돌때마다 최댓값이구해진다.
                }
            }
        }


        return answer*answer; //최대 넓이 =최대길이 *최대길이

    }
}
