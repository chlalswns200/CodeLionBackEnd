package week5.week5_day3.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Stack01Test {

    @BeforeEach
    void setUp() {
        System.out.println("before each");
    }


    @Test
    @DisplayName("push가 잘 되는지")
    void pushTest() {
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);

        int[] getArr = stack01.getArr();

        assertEquals(10,getArr[0]);
        assertEquals(20,getArr[1]);
    }

    @Test
    @DisplayName("push, pop이 잘 되는지")
    void pushAndPop() {
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);

        assertEquals(20, stack01.pop());
        assertEquals(10, stack01.pop());

        stack01.push(30);
        assertEquals(30, stack01.pop());
    }

}