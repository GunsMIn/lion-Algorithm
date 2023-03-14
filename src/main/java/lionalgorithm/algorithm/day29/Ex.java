package lionalgorithm.algorithm.day29;

import java.util.Arrays;

public class Ex {

    public int[] pivotSort(int[] arr, int startIdx, int endIdx) {

        int pivot = arr[(startIdx + endIdx) / 2];
        int leftIdx = startIdx;
        int rightIdx = endIdx;

        while (leftIdx <= rightIdx) {
            while (arr[leftIdx] < pivot) leftIdx++;
            while (arr[rightIdx] > pivot) rightIdx--;

            if (leftIdx <= rightIdx) {
                int tmp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = tmp;
                leftIdx++;
                rightIdx--;
            }

            if (startIdx < rightIdx) pivotSort(arr, startIdx, rightIdx);
            if (leftIdx > endIdx) pivotSort(arr, leftIdx, endIdx);
        }
        return arr;
    }


  /*  public int[] pivotSort(int[] arr, int startIdx, int endIdx) {
        int pivot = arr[(startIdx + endIdx) / 2];
        int leftIdx = startIdx;
        int rightIdx = endIdx;

        while (leftIdx <= rightIdx) {
            while(arr[leftIdx] < pivot) leftIdx++;
            while(arr[rightIdx] > pivot) rightIdx--;

            if (leftIdx <= rightIdx) {
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;
                leftIdx++;
                rightIdx--; // 여기서 레프트 롸이트 바뀜
            }
        }

        if (startIdx < rightIdx) {
            pivotSort(arr, startIdx, rightIdx);
        }
        if (leftIdx < endIdx) {
            pivotSort(arr, leftIdx, endIdx);
        }
        return arr;
    }*/

    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        Ex stt = new Ex();
        var r = stt.pivotSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(r));
    }
}
