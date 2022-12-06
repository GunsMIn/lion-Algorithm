package lionalgorithm.algorithm.day37;

public class Solution2 {

    public static int[] makeHeap(int[] arr, int parentIdx, int arrSize) {
        int leftIdx = 2 * parentIdx + 1;
        int rightIdx = 2 * parentIdx + 2;
        int greaterIdx = parentIdx;

        // 왼쪽이 parent보다 크면 greateridx=leftIdx 6 7 5 --> 7 6 5
        if(leftIdx < arrSize && arr[leftIdx] > arr[greaterIdx]){
            greaterIdx = leftIdx;
        }

        //오른쪽 자식이 greater 보다 크면
        if(rightIdx < arrSize && arr[rightIdx] > arr[greaterIdx]){
            greaterIdx = rightIdx;
        }

        // swap
        if(parentIdx != greaterIdx){
            int temp = arr[parentIdx];
            arr[parentIdx] = arr[greaterIdx];
            arr[greaterIdx] = temp;
            makeHeap(arr, greaterIdx, arrSize);
        }

        return arr;
    }
}
