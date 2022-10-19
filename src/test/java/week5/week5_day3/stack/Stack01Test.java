package week5.week5_day3.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Stack01Test {

    @Test
    void pushTest() {
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);

        int[] getArr = stack01.getArr();

        Assertions.assertEquals(10,getArr[0]);
        Assertions.assertEquals(20,getArr[1]);
    }

}