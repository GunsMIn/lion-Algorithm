package lionalgorithm.algorithm.day25;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12906
    //같은 숫자는 싫어


    //list를 이용한 풀이
    public int[] solutuion(int[] arr) {
        //바로 앞에 있는 숫자와 다르면 넣는다. -> -1번째 하고 비교!
        //떠올려야할 자료구조는 list , 문제에서 순서를 보장하라고 했으니 set은 무리가 있다-> LinkedHashSet?!?!
        //HashSet 클래스를 상속받은 LinkedList이다.
        //데이터에 삽입된 순서대로 데이터를 관리한다.

        List<Integer> list = new ArrayList<>();
        int compareNum = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != compareNum) {
                list.add(arr[i]);
                //여기서 중요한 점은 compareNum을 바꿔줘야한다
                compareNum = arr[i];
            }
        }
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
