package lionalgorithm.algorithm.day16;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {

    public int solution(int n) {
        String answer = "";
        while (n != 0) {
            answer += n % 3;
            n /= 3;
        }
        return Integer.parseInt(answer, 3);
    }





    public static void main(String[] args) {

        Solution3 s = new Solution3();
        s.solution(45);
    }
}
