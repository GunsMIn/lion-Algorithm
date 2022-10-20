package lionalgorithm.algorithm.Day11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {
    Stack02 st = new Stack02();

    @BeforeEach
    void setUp() {
        st.push(10);
        st.push(20);
    }

    @Test
    void push() {
        Integer[] arr = st.getArr();
        assertEquals(20,arr[1]);
        assertEquals(10,arr[0]);
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


   /* @Test
    void pushAndPop() {

        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        assertEquals(20,st.pop());
    }*/
}