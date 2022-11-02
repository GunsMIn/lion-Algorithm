package lionalgorithm.algorithm.day18;

public class Eratosthenes {
    //소수가 되는 수의 배수를 지우면 남은 건 소수가 된다

    public int doEratosthenes(int n) {
        int answer =0;
        int[] prime = new int[n + 1];
        //각각의 숫자에 인덱스 번호를 넣어준다

        for (int i = 0; i <= n; i++) prime[i] = i;

        prime[0]=0;// 소수가 아닌것에는 0을 넣어준다
        prime[1]=0;// 1은 소수가 아니다.


        for (int i = 2; i < Math.sqrt(n); i++) {
            //여기서 이미 소수가 아닌 수로 판별이 났다면 지나가자
            if(prime[i]==0) continue;
            for (int j = i*i; j <= n ; j+=i) {
                prime[j] = 0;
            }
        }

        for (int i = 0; i < prime.length; i++) {
            if (prime[i]!= 0) { // 해당 prime[i]이 0이 아닌숫자가 소수이다.
                answer++;
            }
        }




        return answer;
    }



    //boolean으로
    public static void main(String[] args) {

        // 구하고자 하는 숫자 범위
        int n = 120;
        // 예제와 같이 120까지의 소수를 구하기 위해 120 선언.
        boolean prime[] = new boolean[121];
        prime[0]=true;//true이면 소수가 아닌 값
        prime[1]=true;//1은 소수가 아닌 값

        for (int i = 2; i < Math.sqrt(i) ; i++) {
            //소수의 배수들을 true(소수가 아닌 값으로 만들어 주기 위해서)
            if (!prime[i]) {
                for (int j = i*i; j < n ; j+=i) {
                    prime[i] = true;
                }
            }
        }
    }


}
