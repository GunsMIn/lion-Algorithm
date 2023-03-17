package lionalgorithm.algorithm.day40;

public class Five {
    public String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length(); i++) {
            //11
            //7
            if (i < phone_number.length() - 4) {
                answer += "*";
            }else{
                answer += phone_number.charAt(i);
            }
        }

        return answer;
    }

}
