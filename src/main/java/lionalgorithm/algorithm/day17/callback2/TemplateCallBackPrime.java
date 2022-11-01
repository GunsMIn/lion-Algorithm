package lionalgorithm.algorithm.day17.callback2;


import lionalgorithm.algorithm.day17.callback.TemplateCallBack;

public class TemplateCallBackPrime {

    boolean someOperation(int a,int b) {
        return a < b;
    }


    public boolean isPrime(int num) {
        for (int i =2; someOperation(i,num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        TemplateCallBackPrime tcp = new TemplateCallBackPrime();
        boolean prime = tcp.isPrime(13);
        System.out.println("prime = " + prime);
    }
}
