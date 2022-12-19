package lionalgorithm.algorithm.day35;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    /*https://school.programmers.co.kr/learn/courses/30/lessons/138477*/
/*k	        score	                     result
  3	[10, 100, 20, 150, 1, 100, 200]	[10, 10, 10, 20, 20, 100, 100]
  4	[0, 300, 40, 300, 20, 70, 150, 50, 500, 1000]	[0, 0, 0, 0, 20, 40, 70, 70, 150, 300]*/
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        //1.score의 배열만큼 반복문을 돌면서, 명예의 전당의 점수를 저장할 리스트를 만든다.
        List<Integer> list = new ArrayList<>();
        //2.명예의 전당 리스트 사이즈의 크기가 k보다 작으면 명예의 전당 리스트에 값을 넣고
        for (int i = 0; i < score.length; i++) {
            if (list.size() < k) {
                list.add(score[i]);
                Collections.sort(list); // 10 100
                answer[i] = list.get(0); // 최솟값이 들어감
            } else if (list.size() >= k) {
                int minValue = list.get(0); //10
                if (score[i] > minValue) { // 20 > 10
                    list.remove(0); // 10 out
                    list.add(score[i]); // 20 in
                    Collections.sort(list);
                }
                answer[i] = list.get(0); // 최솟값 들어감
            }
        }
        return answer;
    }

    public int[] solution2(int k, int[] score) {
        int[] answer = new int[score.length]; // 매일매일의 최소값이 들어갈 answer배열
        //명예의 전당에 들어갈 list구조
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (list.size() < k) {
                list.add(score[i]);
                Collections.sort(list);
                answer[i] = list.get(0);
            }else{
                int minValue = list.get(0);
                if (score[i] > minValue) {
                    list.remove(0);
                    list.add(score[i]);
                    Collections.sort(list);
                }
                answer[i] = list.get(0);
            }
        }
        return answer;
    }
}
