package lionalgorithm.algorithm.day43;

public class One {

    public int solution(int n, int[] lost, int[] reserve) {
        // 학생들의 체육복 상태를 저장하는 배열 생성 (0: 정상, -1: 체육복 없음, 1: 여벌 체육복 있음)
        int[] students = new int[n];
        // 체육복을 도난당한 학생들의 번호에 해당하는 students 배열의 값을 -1로 변경
        for (int l : lost) {
            students[l - 1]--; //students[l - 1]--;: 이 코드는 students 배열에서 l - 1 인덱스의 값을 1 감소시킵니다. 배열에 저장된 값에 따라 결과가 달라집니다. 예를 들어, 배열의 값이 0이었다면 -1이 되고, 1이었다면 0이 됩니다.
        }
        // 여벌의 체육복을 가진 학생들의 번호에 해당하는 students 배열의 값을 1로 변경
        for (int r : reserve) {
            students[r - 1]++;
        }

        // 학생들의 체육복 상태를 확인하며 빌려줄 수 있는 경우 체육복을 빌려주는 과정
        for (int i = 0; i < students.length; i++) {
            if (students[i] == -1) {

                //이전 학생이 여벌 체육복이 있을 때 (단 첫번째 학생은 제외)
                if (i >= 1 && students[i - 1] == 1) {
                    students[i]++;
                    students[i - 1]--;
                } else if (i < students.length - 1 && students[i + 1] == 1) { //
                    // 다음 학생이 여벌  체육복이 있을 때 (단 마지막 학생은 제외)
                    students[i]++;
                    students[i+1]--;
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] >= 0) {
                answer++;
            }
        }
        return answer;
    }


}
