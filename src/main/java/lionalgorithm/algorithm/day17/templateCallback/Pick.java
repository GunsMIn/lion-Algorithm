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

        Version1 v1 = new Version1();
        Version2 v2 = new Version2();
        Version3 v3 = new Version3();


        Pick p = new Pick();
        boolean prime1 = p.isPrime(11, v1);
        boolean prime2 = p.isPrime(11, v2);
        boolean prime3 = p.isPrime(11, v3);
        System.out.println("prime1 = " + prime1);
        System.out.println("prime2 = " + prime2);
        System.out.println("prime3 = " + prime3);


    }


}
