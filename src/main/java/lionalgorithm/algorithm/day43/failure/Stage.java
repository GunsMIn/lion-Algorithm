package lionalgorithm.algorithm.day43.failure;

public class Stage {
    private int number; // 스테이지 번호
    private double failRate; // 실패율

    public Stage(int number, double failRate) {
        this.number = number;
        this.failRate = failRate;
    }

    public int getNumber() {
        return number;
    }

    public double getFailRate() {
        return failRate;
    }
}
