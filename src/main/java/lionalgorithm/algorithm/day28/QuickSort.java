package lionalgorithm.algorithm.day28;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};

        // 1. 기준값을 뽑는 로직 구현
        int n = arr.length;
        int mid = n / 2;

        System.out.println("arr[mid] = " + arr[mid]);
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[mid] > arr[i]) { // 기준 값보다 작을 때
                leftList.add(arr[i]);
            }else if(arr[mid] < arr[i]){
                rightList.add(arr[i]);
            }
        }
        System.out.println(leftList);
        System.out.println(rightList);
    }

}
