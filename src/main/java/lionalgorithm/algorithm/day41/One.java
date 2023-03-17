package lionalgorithm.algorithm.day41;

public class One {

    public String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            //각각의 10진수 배열을 2진수로(String)
            String binary1 = Integer.toBinaryString(arr1[i]);
            String binary2 = Integer.toBinaryString(arr2[i]);
            String line = "";
            for (int j = 0; j < n; j++) {
                char b1 = binary1.charAt(j);
                char b2 = binary2.charAt(j);
                if (b1 == '1' || b2 == '1') {
                    line += "#";
                }else{
                    line += " ";
                }
            }
            answer[i] = line;
        }
        return answer;
    }


    
    public String[] solution2(int n, int[] arr1, int[] arr2) {

        String[] string = new String[n];
        for (int i = 0; i < n; i++) {
            string[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            string[i] = string[i].replaceAll("1", "#");
            string[i] =string[i].replaceAll("0", " ");

            while(string[i].length() < n) {
                string[i] = " " + string[i];
            }
        }
        return string;
    }

}
