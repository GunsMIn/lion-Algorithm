package lionalgorithm.algorithm.day19;

public class InsertSort {
    /**
     * 1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다. (첫 번째 타겟은 두 번째 원소부터 시작한다.)
     * 2. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
     * 3. 그 다음 타겟을 찾아 위와 같은 방법으로 반복한다.
     */

    public int[] soltuion(int n,int[] arr) {
        for (int i = 1; i < n ; i++) {
            int tmp = arr[i];
            int j;
            for (j = i-1; j >=0 ; j--) {
                if (arr[j] > tmp) {// 뒤쪽으로 밀어야함
                    arr[j + 1] = arr[j];
                }else break; // 크지만 안으면 멈춰라
            }
            arr[j+1]= tmp;
        }
        return arr;
    }
}
