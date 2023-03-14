package lionalgorithm.algorithm.Day11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {
    Stack02 st = new Stack02();

   /* @BeforeEach
    void setUp() {
        st.push(10);
        st.push(20);
    }*/

    @Test
    void push() {
        Integer[] arr = st.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    void isEmpty() {
        Stack02 st = new Stack02();
        assertTrue(st.isEmpty());
        st.push(10);
        assertFalse(st.isEmpty());
        st.pop();
        assertTrue(st.isEmpty());
    }

    //예외 테스트
    @Test
    void pushAndPop() {

        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        assertEquals(20, st.pop());
        assertEquals(10, st.pop());

        //예외 테스트
        assertThrows(RuntimeException.class, () -> {
            st.pop();
        });
    }

    //peek테스트
    @Test
    void peek() {
        Stack02 st = new Stack02();
        Integer[] arr = st.getArr();
        assertThrows(RuntimeException.class, () -> {
            st.peek();
        });
        st.push(10);
        assertEquals(10, arr[0]);
        int peeked = st.peek();
        assertEquals(10, peeked);
    }


}