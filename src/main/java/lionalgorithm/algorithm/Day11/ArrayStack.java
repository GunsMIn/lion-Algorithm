package lionalgorithm.algorithm.Day11;

public class ArrayStack {
    int top;    //인덱스
    int size;    //스택 배열의 크기
    int[] stack;

    public ArrayStack() {
        ;
    }

    public ArrayStack(int size) {
        this.size = size;
        stack = new int[size];
        top = 0;
    }

    public void push(int value) {
        stack[++top] = value;
        System.out.println(stack[top] + " Push!");
    }

    public int pop() {
        int value = this.stack[top];
        top--;
        return value;
        //return arr[pointer--];
    }

    public void peek() {
        System.out.println(stack[top] + " Peek!");
    }
}
