package lionalgorithm.algorithm.day19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution2 {

    //https://school.programmers.co.kr/learn/courses/30/lessons/42862
    //set 자료구조 사용
    public int solution(int n, int[] lost, int[] reserve) {
        //set구조에서 총 n명중에서 lostSet에 남아있는 학생의 수를 빼주면 체육복을 가질 수 있는 학생의 수를 구할수있다.
        //1.set을 만든다.
        //2.여분을 기준으로 앞뒤로 확인하여 체육복을 빌려준다.
        //3. 전체 학생 수에서 lostSet에 남은 학생의 수를 빼준다.
        HashSet<Integer> reserveSet = new HashSet<>();
        HashSet<Integer> lostSet = new HashSet<>();

        //우선 reserve의 여분이 있는 학생의 번호를 reserveSet에 넣어줌
        for (int rs : reserve) {
            reserveSet.add(rs);
        }

        //그리고 lost의 도난 당한 번호를 루프 시작
        for (int ls : lost) {
            if (reserveSet.contains(ls)) { // 여분옷을 가진 배열에서 도난당한다면 빌려줄 수 없는 상태
                reserveSet.remove(ls);
            } else { // 그냥 lostSet에 넣어준다
                lostSet.add(ls);
            }
        }
        //그럼 이제 reserveSet의 값하나하나를 -+1 비교 해주자
        for (int rc : reserveSet) {
            if (lostSet.contains(rc - 1)) {
                lostSet.remove(rc - 1);
            } else if (lostSet.contains(rc + 1)) {
                lostSet.remove(rc + 1);
            }
        }

        int answer = n - lostSet.size();


        return answer;
    }
  /*  public int solutions(int n, int[] lost, int[] reserve) {
        int answer = 0;

        HashSet<Integer> lostSet = new HashSet<>();
        HashSet<Integer> reserveSet = new HashSet<>();

        for (int re : reserve) {
            reserveSet.add(re);
        }
        //lostset에 값을 넣어주고 reserveSet도 여벌을 가지고있는 set도 도난 체크를 해주자
        for (int l : lost) {
            if (reserveSet.contains(l)) {
                reserveSet.remove(l);
            }else{
                lostSet.add(l);
            }
        }


        for (int rs : reserveSet) {
            if (lostSet.contains(rs - 1)) {
                lostSet.remove(rs - 1);
            } else if (lostSet.contains(rs + 1)) {
                lostSet.remove(rs + 1);
            }
        }
        return n- lostSet.size() ;
    }*/


}
