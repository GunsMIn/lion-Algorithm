package lionalgorithm.algorithm.Day11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack01Test {

    @Test
    void pushAndPop() {

        Stack01 st = new Stack01();
        st.push(10);
        st.push(20);
        assertEquals(20, st.pop());
    }

}