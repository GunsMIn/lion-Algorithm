package lionalgorithm.algorithm.day17.templateCallback;

public class Version2 implements SomeOperation {
    @Override
    public boolean decide(int a, int b) {
        return a < b / 2;
    }
}
