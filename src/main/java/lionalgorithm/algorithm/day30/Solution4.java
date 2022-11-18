package lionalgorithm.algorithm.day30;

public class Solution4 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12935
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int min = Integer.MAX_VALUE;
        //재일 작은 숫자를 빼고 리턴해주자!
        // length 가 1 이면 -1을 리턴해주자!
        if (arr.length==1) return new int[]{-1};
        for (int i = 0; i < arr.length; i++) {
            //우선 제일 작은 수를 구하는 생각부터해야한다
            min = Math.min(min, arr[i]);
        }

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==min) continue;
            answer[idx++] = arr[i];
        }


        return answer;
    }
}
