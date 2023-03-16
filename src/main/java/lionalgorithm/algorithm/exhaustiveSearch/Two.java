package lionalgorithm.algorithm.exhaustiveSearch;

import java.util.ArrayList;
import java.util.List;

public class Two {

    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] correctCount = new int[3]; // 각 수포자들이 맞힌 문제 수를 저장할 배열

        // 정답 배열과 각 수포자들의 찍는 패턴을 비교하여 맞힌 문제 수를 계산
        for (int i = 0; i < answers.length; i++) {
            //인덱스 반복하기 위해서 %(나머지연산자) 사용
            if (answers[i] == person1[i % 5]) {
                correctCount[0]++;
            }
            if (answers[i] == person2[i % 8]) {
                correctCount[1]++;
            }
            if (answers[i] == person3[i % 10]) {
                correctCount[2]++;
            }
        }

        // 가장 많은 문제를 맞힌 수포자(들)을 찾음
        int max = Math.max(correctCount[0], Math.max(correctCount[1], correctCount[2]));
        List<Integer> list = new ArrayList<Integer>();
        if (max == correctCount[0]) {
            list.add(1);
        }
        if (max == correctCount[1]) {
            list.add(2);
        }
        if (max == correctCount[2]) {
            list.add(3);
        }

        // List를 배열로 변환
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
