package lionalgorithm.algorithm.day26;

import java.util.Stack;

public class Solution3 {

    public int solution(int[] histogram) {
        Stack<Integer> s = new Stack<>();
        int max_area = 0;
        int tp;
        int area_with_top;

        int i = 0;
        while (i < histogram.length) {
            if (s.empty() || histogram[s.peek()] <= histogram[i]) {
                s.push(i++);
            } else {
                tp = s.peek();
                s.pop();

                area_with_top = histogram[tp] * (s.empty() ? i : i - s.peek() - 1);

                if (max_area < area_with_top)
                    max_area = area_with_top;
            }
        }

        while (s.empty() == false) {
            tp = s.peek();
            s.pop();
            area_with_top = histogram[tp] * (s.empty() ? i : i - s.peek() - 1);

            if (max_area < area_with_top)
                max_area = area_with_top;
        }
        return max_area;
    }


    public static void main(String[] args) {

        Solution3 s = new Solution3();
        //int[] histogram={2,2,2,3}; // 8
        int[] histogram = {6, 5, 7, 3, 4, 2};//15
//        int[] histogram = {6, 2, 5, 4, 5, 1, 6};
        //int[] histogram = {7, 2, 8, 9, 1, 3, 6, 5};

        System.out.println(s.solution(histogram));

    }

}
