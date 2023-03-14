package lionalgorithm.algorithm.day16;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] solution(int[] answers) {


        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        //a,b,c 각각의 결과 값
        int[] cnt = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length]) cnt[0]++;
            if (answers[i] == b[i % b.length]) cnt[1]++;
            if (answers[i] == c[i % c.length]) cnt[2]++;
        }

        //최대값 구하기
        int maxCnt = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));

        List<Integer> answer = new ArrayList<>();
        if (maxCnt == cnt[0]) answer.add(1);
        if (maxCnt == cnt[1]) answer.add(2);
        if (maxCnt == cnt[2]) answer.add(3);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }


}
