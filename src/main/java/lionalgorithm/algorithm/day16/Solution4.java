package lionalgorithm.algorithm.day16;

import java.util.*;
//두 개 뽑아서 더하기
public class Solution4 {

    public int[] solution(int[] numbers) {
        int[] answer = {};
        //1.우선 numbers를 오름차순을 진행!
        //[1,1,2,3,4]
        //1+1
        //1+2
        //1+3
        //1+4
        //2+3
        //2+4
        //3+4
        Arrays.sort(numbers);
        Set<Integer> ans = new HashSet<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length ; j++) {
               ans.add(numbers[i] + numbers[j]);
            }
        }
        System.out.println(ans);

        return ans.stream().sorted().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {

        Solution4 s = new Solution4();
        int[] a = {5,0,2,7};
        s.solution(a);
    }
}
