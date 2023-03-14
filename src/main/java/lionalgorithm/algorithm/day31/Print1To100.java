package lionalgorithm.algorithm.day31;

import java.io.PrintWriter;

public class Print1To100 {

    /*print100(1) -> System.out.println(1) -> print100(2) -> System.out.println(2) -> print100(3) ….. ->
    print(99) -> System.out.println(99) -> print100(100) -> System.out.println(100) -> print100(101) → return
    이 로직은 4줄의 간단한 로직이지만 재귀를 설명하는데 필요한 것들은 다 들어있습니다.
    1.시작하는 값은 어떤 것인지
    2.변화는 어떻게 줄 것인지 - print1To100(num + 1)
    3.언제 끝낼 것인지
     */
    public static void print1To100(int n) {
        if (n > 100) return; // 탈출 조건
        System.out.println(n);
        print1To100(n + 1);
    }

    public static void main(String[] args) {
        Print1To100 p = new Print1To100();
        Print1To100.print1To100(1);
    }
}
