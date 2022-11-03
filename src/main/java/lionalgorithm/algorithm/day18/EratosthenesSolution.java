package lionalgorithm.algorithm.day18;

public class EratosthenesSolution {
    
    public int checkPrime(int n) {
        int count = 0;
        int[] prime = new int[n + 1];
        //여기서 각 배열의 인덱스를 넣어줌
        for (int i = 0; i < prime.length; i++) prime[i] = i;
        prime[0]=0;
        prime[1]=0;

        for (int i = 0; i < Math.sqrt(n) ; i++) {
            if(prime[i]==0)continue;
            for (int j = i * i; j < n ; j+=i) {
                prime[j]=0;
            }
        }
        for (int i = 0; i < prime.length; i++) {
            if(prime[i] != 0)count++;
        }

        return count;
    }
    
}
