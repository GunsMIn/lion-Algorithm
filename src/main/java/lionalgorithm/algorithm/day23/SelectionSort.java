package lionalgorithm.algorithm.day23;

public class SelectionSort {
    /**
     * 1. 주어진 리스트에서 최솟값을 찾는다
     * 2. 최솟값을 맨 앞 자리의 값과 교환한다
     * 3. 맨 앞 자리를 제외한 나머지 값들 중 최솟값을 찾아 위와 같은 방법으로 반복한다.
     * */

    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        int tmp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (min > arr[j]) {
                    tmp = arr[j];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    //내림 차순
    public int[] solution2(int[] arr) {
        int max = Integer.MIN_VALUE;
        int tmp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (max < arr[j]) {
                    tmp = arr[j];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }



}
