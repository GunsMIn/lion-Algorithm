package lionalgorithm.algorithm.day29;

public class QuickSort {

    void pivotSort(int[] arr, int left, int right) {
        int pivot = arr[arr.length/2];
        left = 0; // 맨 왼쪽 인덱스의 시작점
        right = arr.length -1; // 맨 오른쪽 인덱스의 시작점

        //left가 right보다 크거나 같다면 엇갈린것이어서 정렬을 멈춰야 한다.
        if (left >= right) return;

        while (left < right) {
            while (arr[left] < pivot) {left++;} // 왼쪽의 영역이 작다면 index만 증가시켜줘서 다음값 비교하게해주자
            while (arr[right] > pivot ) {right--;}
        }



    }
}
