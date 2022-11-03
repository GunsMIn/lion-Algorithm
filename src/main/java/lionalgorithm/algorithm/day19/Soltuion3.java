package lionalgorithm.algorithm.day19;

import java.util.Arrays;

public class Soltuion3 {


    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        //student 배열을 n+2로만들어주자 앞 뒤를 비교해야하기때문이다.
        int[] student = new int[n + 2];
        //5명 -> 0|0 0 0 0 0|0
        for (int r : reserve) { // 여분의 옷은 1을 넣어주자
            student[r]++; //->이것은 student배열에 ++값을 넣어주겠다는 뜻 그러닌까 0 에서 1을 넣어줌
        }
        for (int l : lost) { // 도난 당한 사람은 -1 을 넣어주자
            student[l]--;
        }
        for (int i = 0; i < n ; i++) {
            if (student[i] == 1) {
                if (student[i - 1] == -1) {
                    student[i]--; // 1에서 0이 됨
                    student[i-1]++; // -1에서 0이 됨
                } else if (student[i+1]==-1) {
                    student[i]--;
                    student[i+1]++;
                }
            }
        }
        System.out.println("Arrays.toString(student) = " + Arrays.toString(student));
        for (int i = 1; i <= n ; i++) {
            if (student[i] >= 0) {
                answer++;
            }
        }
        return answer;
    }


}
