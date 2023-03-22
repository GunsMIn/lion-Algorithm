package lionalgorithm.algorithm.day41;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("!!");
        // Test case 1
        String[] companies1 = {"A fabdec 2", "B cebdfa 2", "C ecfadb 2"};
        String[] applicants1 = {"a BAC 1", "b BAC 3", "c BCA 2", "d ABC 3", "e BCA 3", "f ABC 2"};
        String[] result1 = solution.solution(companies1, applicants1);
        System.out.println(result1.toString()); // ["A_bf", "B_ce", "C_d"]

        // Test case 2
        String[] companies2 = {"A abc 2", "B abc 1"};
        String[] applicants2 = {"a AB 1", "b AB 1", "c AB 1"};
        String[] result2 = solution.solution(companies2, applicants2);
        System.out.println(Arrays.toString(result2)); // ["A_ab", "B_"]
    }
}
