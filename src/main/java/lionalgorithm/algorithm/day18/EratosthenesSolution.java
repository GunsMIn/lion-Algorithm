package lionalgorithm.algorithm.day18;

public class EratosthenesSolution {

    public int checkPrime(int n) {
        int count = 0;
        int[] prime = new int[n + 1];
        //여기서 각 배열의 인덱스를 넣어줌
        for (int i = 0; i < prime.length; i++) prime[i] = i;
        //0과 1은 소수가 아니다 그래서 0을 넣어주자
        prime[0] = 0;
        prime[1] = 0;

        //모든 약수는 대칭 형태를 갖는다 -> 루트판별법
        for (int i = 0; i < Math.sqrt(n); i++) {
            //이미 0이 된값은(소수가 아닌 값) 다음 반복으로!
            if (prime[i] == 0) continue;
            for (int j = i * i; j < n; j += i) {
                prime[j] = 0;
            }
        }
        for (int i = 0; i < prime.length; i++) {
            if (prime[i] != 0) count++;
        }
        return count;
    }

}
