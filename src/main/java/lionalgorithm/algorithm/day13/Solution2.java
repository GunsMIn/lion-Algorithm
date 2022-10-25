package lionalgorithm.algorithm.day13;

import java.util.ArrayList;

public class Solution2 {

    //https://school.programmers.co.kr/learn/courses/30/lessons/42840

    public int[] solution(int[] answers) { //answers에는 답이 들어있다.
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        //각각 맟춘cnt가 필요
        int[] cnt = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if(answers[i]==a[i%a.length]) cnt[0]++;
            if(answers[i]==b[i%b.length]) cnt[1]++;
            if(answers[i]==c[i%c.length]) cnt[2]++;
        }

        int maxCnt = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));

        ArrayList<Integer> list = new ArrayList<>();
        if(maxCnt == cnt[0])list.add(1);
        if(maxCnt == cnt[1])list.add(2);
        if(maxCnt == cnt[2])list.add(3);



        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
