package lionalgorithm.algorithm.day23;

import java.util.Scanner;

//https://sir.kr/qa/347560
public class Main {
    static int T; // 지폐의 금액 -> 문제에서는 20

    static int K; // 동전의 가지수 -> 문제에서는 3

    static int[] Pi; // 각 동전의 금액 -> 10 , 5, 1

    static int[] Ni; // 각 동전의 개수 -> 2, 3, 5

    static int[][] D; // 다이나믹 배열


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();
        K = sc.nextInt();
        D = new int[K + 1][T + 1]; // [동전의 가지수 +1][지폐의 금액 +1]
        Pi = new int[K + 1];
        Ni = new int[K + 1];

        D[0][0] = 1;

        for (int i = 1; i <= K; i++) {

            D[i][0] = 1; // j위치에서 현재동전금액을 뺀곳의 값을 참조함
            Pi[i] = sc.nextInt();
            Ni[i] = sc.nextInt();

        }


        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= T; j++) {
                // 이전 동전이 만든 잔돈과
                // 내가 만들 잔돈을 더해 주면
                // 잔돈을 만들수 있는 케이스가 합쳐진다.
                for (int k = 0; k <= Ni[i]; k++) {
                    if (Pi[i] * k > j) break;
                    D[i][j] += D[i - 1][j - Pi[i] * k];
                }
            }
        }
        System.out.println(D[K][T]);
        sc.close();
    }

}