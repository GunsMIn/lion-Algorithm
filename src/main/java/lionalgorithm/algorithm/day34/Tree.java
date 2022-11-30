package lionalgorithm.algorithm.day34;

public class Tree {

    public static int goUp(int a,int b) {
        if (a > b) {
            return goUp(a / 2, b) + 1; // a를 부모 쪽으로
        } else if (a < b) {
            return goUp(a, b / 2) + 1; // b를 부모 쪽으로
        } else{ // a==b
            return 0;
        }
    }

    public static void main(String[] args) {
        int i = goUp(3, 4);
        System.out.print(i);

      /*  int a = 3;
        int b = 4;

        int parentA = Math.floorDiv(3, 2);
        int parentB = Math.floorDiv(4, 2);
        System.out.printf("parentA : %d\n",parentA);
        System.out.printf("parentB : %d\n",parentB);*/
    }
}
