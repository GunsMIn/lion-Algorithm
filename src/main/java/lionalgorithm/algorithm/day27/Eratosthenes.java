package lionalgorithm.algorithm.day27;

public class Eratosthenes {

    public int isPrime(int n) {
        int answer = 0;
        boolean[] prime = new boolean[n + 1];
        //이미 여기서 배열에 다 false가 들어감
        //0과 1은 소수가아니다 - > 앞으로 소수가 아닌값은 true를 넣어 줄 것이다
        prime[0]=true;
        prime[1]=true;

        for (int i = 2; i < Math.sqrt(n) ; i++) {
            if (!prime[i]) { // false인 값만 들어온다.
                for (int j = i * 2; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = 0; i < prime.length; i++) {
            if(!prime[i]) answer++;
        }
        return answer;
    }
}
