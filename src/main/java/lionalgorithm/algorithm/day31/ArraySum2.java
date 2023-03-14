package lionalgorithm.algorithm.day31;

public class ArraySum2 {
    static int sum(int[] arr, int idx) {
        //여기서 idx = 4가 되면 재귀함수 종료!
        if (arr.length == idx) return 0; //idx가 배열의 길이와 같다는것은 더이상 인덱스를 안더해도된다
        // idx + 1을 해서 탈출조건에 갈수 있게 처리한다
        return arr[idx] + sum(arr, idx + 1);
        //arr[0]+arr[1]+arr[2]+arr[3]
        //idx = 3이고
    }

    static int sum2(int[] arr, int index) {
        if (index == arr.length) return 0;
        return arr[index] + sum2(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 2, 9};
        int r = sum2(arr, 0);
        // 처음 호출 할 때도 0을 추가로 넣어주어서 복잡해졌다.
        // parameter를 하나 더 추가 해서 더 복잡해졌다.
        System.out.println(r);
    }
}
