package lionalgorithm.algorithm.day20;

//https://javacoding.tistory.com/56?category=352749
public class Solution6 {
    /**
     * 유클리드 호제법 : 두 수의 최대공약수를 구하는 알고리즘이다.
     * a를 b로 나눈 나머지를 r이라고 하면 (a>b) a와 b의 최대공약수는 b와 r의 최대공약수와 같다
     * 두 수 a, b  를 20과 12로 잡아보면.a 를 b로 나눈 나머지 8을 N 으로 둔다면  a = 12 , b = 8이 됩니다.
     * 계속해서 이는 곧   a = 8  ( 이전의 b ) ,   b =  4 ( 12를 8로 나눈 나머지 )
     * 마지막으로 a = 4, b = 0 이 되고 ,b가 0이 될 때의 a값 ( = 4 ) 이 두 수의 최대 공약수이다.
     */
    public int[] solution(int n, int m) {

        int max = Math.max(n, m);
        int min = Math.min(n, m);
        while (min != 0) {
            //r 은 나머지
            int r = max % min;
            max = min; // 주석을 읽어 보면 이 값이 최대공약수이다
            min = r;
        }
        //최소 공배수는 두 값을 곱한 값에 최대공약수를 나눈값이다
        int choiso = n * m / max;

        int[] answer = {max, choiso};

        return answer;
    }
}
