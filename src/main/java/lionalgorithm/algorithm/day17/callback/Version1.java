package lionalgorithm.algorithm.day17.callback;

public class Version1 implements TemplateCallBack {

    @Override
    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if(num%i==0) return false;
        }
        //나머지가 0이 아니라는 얘기는 나누어 떨어지지 않는다는 말 -> 소수
        return true;
    }
}
