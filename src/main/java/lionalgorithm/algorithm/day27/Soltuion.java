package lionalgorithm.algorithm.day27;

public class Soltuion {

    public int solution(int n) {
        int answer = 0;
        int[] store = new int[n + 1];
        //각 인덱스에 숫자를 넣어줄 것이다.
        for (int i = 0; i < n; i++) {
            store[i] = i;
        }
        store[0] = 0;

        return answer;
    }


    public static void main(String[] args) {
        int N = 50;
        int[] arr = new int[N - 1];
        System.out.println(arr.length);
    }


}
