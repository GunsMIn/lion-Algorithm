package lionalgorithm.algorithm.day26;

public class AndOr {

    /***
     * AND(&) 연산자
     * 비트 단위로 AND 연산을 한다. 즉 &연산은 두 개의 비트가 모두 1일 때 1을 반환하는 AND 연한을 한다
     * 연산	결과
     * 0&0	0
     * 0&1	0
     * 1&0	1
     * 1&1	1
     * OR(|) 연산자
     * 비트단위로 OR 연산을 한다. 즉 |연산은 두 개의 비트 중 하나라도 1이면 1을 반환하는 OR 연산입니다.
     * 연산	결과
     * 0|0	0
     * 0|1	1
     * 1|0	1
     * 1|1	1
     */
    //10진수를 2진수로 바꾸는 방법 반복문을 사용한!
    String getBinaryString(int n) {
        String answer = "";
        while (n > 0) {
            answer += n % 2; //answer는 String m%2는 int
            n /= 2;
        }
        return answer;
    }

    //1. 10 진수를 2진수로 바꾸어준다
    //2. 비트연산중 or연산자를 사용한다
    //3. replaceALL을 사용하여 문자를 1,0으로 바꾸어준다


    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        //1.10진수를 2진수로 우선바꾸자
        for (int i = 0; i < n ; i++) {
            String string = Integer.toBinaryString(arr1[i] | arr2[i]);

        }


        return answer;
    }
}

