package lionalgorithm.algorithm.day31;

public class ArraySum {

    static int sum(int[] arr, int answer, int idx) {
        //answer = 0, idx = 0이 파라미터로 넘오왔다.
        if (arr.length == idx) return answer; // 여기서는 arr.length 가 4가되면 정지하게
        // idx + 1을 해서 탈출조건에 갈수 있게 처리한다
        return sum(arr, answer + arr[idx], idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 2, 9};
        int r = sum(arr, 0, 0);
        // 처음 호출 할 때도 0을 추가로 넣어주어서 복잡해졌다.
        // parameter를 하나 더 추가 해서 더 복잡해졌다.
        System.out.println(r);
    }

    static int sum2(int[] arr, int index) {
        if (index == arr.length) return 0;
        return arr[index] + sum2(arr, index++);

    }

}
