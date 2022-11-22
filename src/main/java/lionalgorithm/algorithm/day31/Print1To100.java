package lionalgorithm.algorithm.day31;

import java.io.PrintWriter;

public class Print1To100 {

    public static void print1To100(int n) {
        if(n > 100) return;
        n = n + 1;
        System.out.println(n);
        print1To100(n);
    }

    public static void main(String[] args) {
        Print1To100 p = new Print1To100();
        Print1To100.print1To100(0);
    }
}
