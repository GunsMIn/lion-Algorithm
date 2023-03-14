package lionalgorithm.algorithm.day29;

import java.util.Arrays;

public class Quick {
    //https://gwang920.github.io/algorithm%20non%20ps/qucikSort/
    public int[] sort(int[] arr, int startIdx, int endIdx) {
        int leftIdx = startIdx;
        int rightIdx = endIdx;
        int pivot = arr[(startIdx + endIdx) / 2];
        // 언제까지 반복되는지? leftIdx == rightIdx일 때도 아래 로직이 반복됨
        // ex) leftIdx = 3, rightIdx = 3일 때도
        // 왼쪽과 오른쪽 각각 교환할 index를 정하는 부분 pivot까지 올 수도 있다.
        while (leftIdx <= rightIdx) {
            while (arr[leftIdx] < pivot) leftIdx += 1;   // <=아닙니다.
            while (arr[rightIdx] > pivot) rightIdx -= 1;   // <=아닙니다.
            // leftIdx = 4, rightIdx = 7 그대로 왜 냐하면 25는 교환 대상이기 때문입니다.

            if (leftIdx <= rightIdx) {
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;
                leftIdx += 1;
                rightIdx -= 1;
            }
            System.out.printf("leftIdx:%d rightIdx:%d\n", leftIdx, rightIdx);
            System.out.println(Arrays.toString(arr));
        }
        // 교환이 모두 끝나면 왼쪽, 오른쪽 두 그룹으로 나누어 지면 됩니다.
        // 20, 18, 5, 19, 25, 5, 50, 40

        //위에서 leftIdx와 rightidx의 위치가 바뀜
        if (startIdx < rightIdx) sort(arr, startIdx, rightIdx);
        if (leftIdx < endIdx) sort(arr, leftIdx, endIdx);

        return arr;
    }

    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        Quick stt = new Quick();
        var r = stt.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(r));
    }

}
