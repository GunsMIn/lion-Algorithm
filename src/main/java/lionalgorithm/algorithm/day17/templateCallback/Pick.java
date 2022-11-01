package lionalgorithm.algorithm.day17.templateCallback;

public class Pick {

    public boolean isPrime(int num,SomeOperation someOperation) {
        for (int i =2; someOperation.decide(i,num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {

   

    }


}
