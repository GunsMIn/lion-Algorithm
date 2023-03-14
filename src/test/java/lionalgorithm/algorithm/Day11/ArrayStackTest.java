package lionalgorithm.algorithm.Day11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    @Test
    void pushAndPop() {
        ArrayStack st = new ArrayStack();
        st.push(10);
        st.push(20);
        assertEquals(20, st.pop());
    }
}