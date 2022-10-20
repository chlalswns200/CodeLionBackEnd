package week5.week5_day3.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Stack02Test {

    @BeforeEach
    void setUp() {
        System.out.println("before each");
    }

    @Test
    @DisplayName("push, pop이 잘 되는지")
    void pushAndPop() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);

        assertEquals(20, st.pop());
        assertEquals(10, st.pop());
    }

}