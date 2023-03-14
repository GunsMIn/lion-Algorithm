package lionalgorithm.algorithm.day20;

public class Solution8 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/17682
    //https://code-lab1.tistory.com/84
    public int solution(String dartResult) {
        int answer = 0;
        int[] sum = new int[3];
        String num = "";
        int parseNum = 0;
        int idx = 0;

        //1. dartResult문자열을
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                //여기서는 문자열
                num += c;
            } else if (c == 'S' || c == 'D' || c == 'T') {
                //산술 계산을 해줘야하니까 integer로
                parseNum = Integer.parseInt(num);
                if (c == 'S') {
                    parseNum = (int) Math.pow(parseNum, 1);
                } else if (c == 'D') {
                    parseNum = (int) Math.pow(parseNum, 2);
                } else if (c == 'T') {
                    parseNum = (int) Math.pow(parseNum, 3);
                }
                num = "";
                sum[idx++] = parseNum;
            }

        }


        return answer;
    }
}
