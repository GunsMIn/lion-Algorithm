package lionalgorithm.algorithm.day19;

public class SelectSort {

    //선택 정렬
    //데이터 하나를 기준으로 다른 데이터와 비교하
    //가장 작거나 / 큰 데이터와 자리를 바꾸는 식으로
    //반복 비교하는 정렬을 수행하게 되는데
    //데이터의 개수가 N개라면 N-1회 회전(for문)을 하게 된다
    public int[] solution(int n,int[] arr) {
        arr = new int[n];
        int tmp = 0;
        for (int i = 0; i < n-1; i++) { //이미 n 직전에(n-1)에서 n의 값은 정해져있다.
            for (int j = i+1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
