package lionalgorithm.algorithm.day16;

public class Solution5 {
   /* public String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int leftIndex = 10; // '*' => 10 으로 치환
        int rightIndex = 12;// '#' => 12로 치환
        //1,4,7 은 무조건 L
        //3,6,9 는 무조건 R
        //L의 처음시작은 * R은 #
        for (int n : numbers) {
            //number은 각각 누를 번호의 숫자
            if (n==1||n==4||n==7) {
                sb.append("L");
                leftIndex = n;
            } else if (n == 3 || n == 6 || n == 9) {
                sb.append("R");
                rightIndex = n;
            }else{ // 2,5,8,0 일때
                if (n == 0) {
                    n=11;
                }
                //왼쪽의 차이
                int ld = (Math.abs(n - leftIndex) / 3) + (Math.abs(n - leftIndex) % 3);
                //오른쪽의 차이
                int rd = (Math.abs(n - rightIndex) / 3) + (Math.abs(n - rightIndex) % 3);
                if (ld == rd) {
                    if (hand.equals("right")) {
                        sb.append("R");
                        rightIndex = n;
                    }else{
                        sb.append("L");
                        leftIndex = n;
                    }
                } else if (ld > rd) { // 왼쪽의 차이가 더 큰
                    sb.append("R");
                    rightIndex = n;
                }else{
                    sb.append("L");
                    leftIndex =n;
                }

            }
        }
        return sb.toString();
    }*/

    public String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int leftSide = 10; // 왼손의 처음시작은 * 이다 , * 를 10으로 치환해주자!
        int rightSide = 12;// 오른손의 처음시작은 #이다 , #을 12로 치환해주자!
        for (int n : numbers) {
            if (n == 1 || n == 4 || n == 7) {
                sb.append("L");
                leftSide = n;
            } else if (n == 3 || n == 6 || n == 9) {
                sb.append("R");
                rightSide = n;
            } else { // 2580일때
                if (n == 0) {
                    n = 11;
                }
                int leftGap = (Math.abs(n - leftSide) / 3) + (Math.abs(n - leftSide) % 3);
                int rightGap = (Math.abs(n - rightSide) / 3) + (Math.abs(n - rightSide) % 3);
                if (leftGap == rightGap) {
                    if (hand.equals("left")) {
                        sb.append("L");
                        leftSide = n;
                    } else {
                        sb.append("R");
                        rightSide = n;
                    }
                } else if (leftGap > rightGap) { // 오른 손으로 눌러야한다, 오른손의 거리가 더 짧기 때문에
                    sb.append("R");
                    rightSide = n;
                } else {
                    sb.append("L");
                    leftSide = n;
                }

            }
        }
        return sb.toString();
    }

}
