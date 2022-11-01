package lionalgorithm.algorithm.day17.callback;

public class Version2 implements TemplateCallBack{
    @Override
    public boolean isPrime(int num) {
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
