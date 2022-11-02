package lionalgorithm.algorithm.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {




    public static void main(String[] args) {

        int N = 50;
        List<Integer> nums = new ArrayList<>();

        for (int i = 2; i <=N ; i++) {
                nums.add(i);
        }
        System.out.println("nums = " + nums);


        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0 && nums.get(i)> 2) {
                nums.remove(i);
            }
        }
        //람다식사용시
      /*  nums.removeIf(n -> n % 2 == 0 && n > 2);*/

        System.out.println("nums = " + nums);



    }
}
