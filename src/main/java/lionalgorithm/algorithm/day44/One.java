package lionalgorithm.algorithm.day44;

public class One {

    public String solution(int[] numbers, String hand) {
        StringBuilder builder = new StringBuilder();
        int leftPos = 10;
        int rightPos = 12;

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                builder.append("L");
                leftPos = number;
            } else if (number == 3 || number == 6 || number == 9) {
                builder.append("R");
                rightPos = number;
            }else{
                if (number == 0) {
                    number = 11;
                }

                int leftDistance = getDistance(leftPos,number);
                int rightDistance = getDistance(rightPos,number);

                if (leftDistance < rightDistance || (leftDistance == rightDistance && hand.equals("left"))) {
                    builder.append("L");
                    leftPos = number;
                } else if (rightDistance < leftDistance) {
                    builder.append("R");
                    rightPos = number;
                }
            }
        }
        return builder.toString();
    }

    private int getDistance(int start, int end) {
        int startX = (start - 1) / 3;
        int startY = (start - 1) % 3;
        int endX = (end - 1) / 3;
        int endY = (end - 1) % 3;
        return Math.abs(startX - endX) + Math.abs(startY - endY);
    }
}
