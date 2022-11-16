package lionalgorithm.algorithm.day29;

public class QuickSort {

    public static void pivotSort(int[] arr, int left, int right) {
        int pivot = arr[arr.length/2];
        System.out.println("pivot = " + pivot);
        left = 0; // 맨 왼쪽 인덱스의 시작점
        right = arr.length -1; // 맨 오른쪽 인덱스의 시작점

        //left가 right보다 크거나 같다면 엇갈린것이어서 정렬을 멈춰야 한다.
        if (left >= right) return;

        //{20, 60, 5, 19, 40(p), 50, 5, 25};
        while (left <= right) { // 두 인덱스가 서로 교차할 때 까지 반복시키기 위해서!
            while (arr[left] < pivot) {
                // 왼쪽의 영역이 피봇보다 작다면 index만 증가시켜줘서 다음값 비교하게해주자
                // // 피봇 아래에있는 값중 큰 값을 고르기위함
                left++;
            }
            while (arr[right] > pivot) {
                // 오른쪽의 영역이 피봇보다 크다면 index만 감소시켜서 이전값을 비교하게해주자
                // 피봇 위에있는 값중 작은 값을 고르기위함
                right--;
            }

            //교환
            //{20, 60(s), 5, 19, 40(p), 50, 5, 25(s)} -> {20, 25(s), 5, 19, 40(p), 50, 5, 60(s)} 만들어 주기 위함
            if (left < right) {
                //예를들어서 여기에는 arr[left]는 60 그리고 arr[right]에는 25가 있고 교환해주어야한다.
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                //교환 후에는 왼쪽인덱스는 +1 오른쪽인덱스는 -1을 해줘야한다.
                left++;
                right--;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{20, 60, 5, 19, 40, 50, 5, 25};
        QuickSort.pivotSort(arr,0,0);
    }
}
