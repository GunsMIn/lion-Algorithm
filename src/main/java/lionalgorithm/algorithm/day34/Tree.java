package lionalgorithm.algorithm.day34;

public class Tree {

    /**
     * 부모가 같을때까지 부모를 찾으면서
     * 한칸 올라갈때마다 +1을 하는 방식으로 거리를 구한다..
     */

    public static int goUp(int a, int b) {
        if (a > b) {
            return goUp(a / 2, b) + 1; // a를 부모 쪽으로
        } else if (a < b) {
            return goUp(a, b / 2) + 1; // b를 부모 쪽으로
        } else { // a==b
            return 0;
        }
    }
    // 4 5 +1
    // 2 5 +1
    //2 2 0  -> 거리 : 2
    /////////////
    // 4,3 +1
    // 2,3 +1
    // 2,1 +1
    // 1,1 -> 거리 3


    public static void main(String[] args) {
        int distance = goUp(3, 4);
        System.out.print(distance);

      /*  int a = 3;
        int b = 4;

        int parentA = Math.floorDiv(3, 2);
        int parentB = Math.floorDiv(4, 2);
        System.out.printf("parentA : %d\n",parentA);
        System.out.printf("parentB : %d\n",parentB);*/
    }
}
