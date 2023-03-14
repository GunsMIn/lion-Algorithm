package lionalgorithm.algorithm.day19;

public class BubbleSort {
    //버블 정렬
    // 13 5 11 7 23 15
    //https://javaplant.tistory.com/16
    public int[] soltuion(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) { //하나 적게 돌아도 됨
            for (int j = 0; j < n - i - 1; j++) { // j는 도는 횟수가 하나씩 작아져야함
                if (arr[j] > arr[j + 1]) { // 버블 정렬은 양 옆을 비교해줘야함
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
