package lionalgorithm.algorithm.Day11;

public class Stack02 {

    private Integer[] arr; // int[] 0
    private int top = 0;

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    public Integer[] getArr() {
        return arr;
    }

    public void push(int value) {
        // 10을 넣으면 arr[0] = 10
        this.arr[this.top++] = value;
    }

    public int pop() {
        return this.arr[--top];// this.top = 2
    }
    
    public boolean isEmpty() {
        return (this.top == 0);
    }




}
