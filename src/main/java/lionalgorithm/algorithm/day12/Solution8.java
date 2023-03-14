package lionalgorithm.algorithm.day12;

public class Solution8 {

    public int solution(String s) {
        int answer = 0;
        String[] word = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < 10; i++) {
            s = s.replace(word[i], String.valueOf(i));
        }

        answer = Integer.valueOf(s);

        return answer;
    }

}
