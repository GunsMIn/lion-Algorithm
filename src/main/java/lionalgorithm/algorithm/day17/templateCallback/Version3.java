package lionalgorithm.algorithm.day17.templateCallback;

public class Version3 implements SomeOperation {
    @Override
    public boolean decide(int a, int b) {
        return a * a < b;
    }
}
