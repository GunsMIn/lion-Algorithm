package lionalgorithm.algorithm.day12;

public class Solution6 {
    public long solution(int price, int money, int count) {
        //price * count
        long answer = 0;
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i * price;
        }
        answer = sum > money ? sum - money : 0;

        return answer;
    }

}
