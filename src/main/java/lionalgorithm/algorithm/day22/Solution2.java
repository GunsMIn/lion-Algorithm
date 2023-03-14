package lionalgorithm.algorithm.day22;

public class Solution2 {

    /**
     * 1. 탐색의 대상이 되는 자료들이 array[low] 에서부터 array[high]에 들어있다고 가정하자. (정렬되어 있어야 함)
     * 즉 어떤 시점에서 탐색되어야 할 범위는 low에서 high 까지가 된다.
     * 맨 처음 low에는 0번 인덱스의 값, high에는 n-1번 인덱스의 값이 들어갈 것이다.
     * <p>
     * 2. low와 high값에 의거해  중간값 mid 값은 (low + high) / 2이다.
     * 즉, array[low] ~ array[high] 까지의 탐색은
     * array[low] ~ array[middle-1] +  array[middle+1] + array[high]까지의 탐색이 된다.
     * <p>
     * 3. array[mid] 값과 구하고자 하는 key값을 비교한다.
     * 3-1. key > mid :  구하고자 하는 값이 중간값보다 높다면 low를 mid +1로 만들어 줌 (왼쪽 반을 버림)
     * 3-2. key < mid : 구하고자하는 값이 중간값 보다 낮다면 high를 mid-1로 만들어 줌 (오른쪽 반을 버림)
     * 3-3. key == mid : 구하고자 하는 값을 찾음 중간값 리턴
     */
    public int binarySearch(int[] arr, int target) {
        int start = 0; // 첫 인덱스
        int mid; // (start+end) /2
        int end = arr.length - 1; // 배열의 길이 -1


        //1.찾고자 하는 값이 arr[mid] 의 값보다 큰 경우 start +1.
        //2.찾고자 하는 값이 arr[mid] 의 값보다 작은 경우 start -1.

        while (start <= end) {
            mid = (start + end) / 2;
            //같을 시
            if (arr[mid] == target) return mid;
            //중간 값 보다 클때
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) { // 중간 값보다 작을때
                start = mid - 1;
            }
        }

// 원하는 값을 찾지 못함.
        return -1;
    }


    public static void main(String[] args) {


        int targetNum = 7;
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int startIdx = 0;
        int endIdx = nums.length - 1;
        int midIdx = nums.length / 2;
        int midValue = nums[midIdx];


        if (midValue > targetNum) {
            startIdx = midIdx + 1;
        } else if (midValue < targetNum) {
            startIdx = midIdx - 1;
        } else { // 중가값이 같을 때

        }

    }


}
