package lionalgorithm.algorithm.day40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class One {

    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for (String s : strings) {
            char c = s.charAt(n);
            //c는 각 s의 n번째 단어이다.
            list.add(c + s);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
           answer[i] =  list.get(i).substring(1);
        }
        return answer;
    }
}
