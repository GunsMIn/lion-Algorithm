package lionalgorithm.algorithm.day31;

import java.util.ArrayList;
import java.util.List;

public class ListSum {
    //1. 메소드 만들기
    //2. 탈출 조건 만들기
    //3. 탈출조건까지 도착할 수 있게 parameter에 변화주기

    //리스트의 합 재귀로 구하기
    public static int sum(List<Integer> nums) {
        if (nums.isEmpty()) return 0;
        int each = nums.remove(nums.size() - 1);
        return each + sum(nums);
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);

        System.out.println(ListSum.sum(nums));
    }
}
