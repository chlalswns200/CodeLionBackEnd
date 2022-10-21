package week5.week5_day4.bracket;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracketTest {

    @Test
    @DisplayName("괄호가 잘 풀리는지 - indexOf 함수")
    void bracket() {
        SolveBracket sb = new SolveBracket();
        assertTrue(sb.solution("()()"));
        assertTrue(sb.solution("(()())()"));
        assertTrue(sb.solution("(())()"));
        assertFalse(sb.solution(")()("));
        assertFalse(sb.solution( "((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))))"));
    }

    @Test
    @DisplayName("괄호가 잘 풀리는지2 - split 함수")
    void bracket2() {
        SolveBracket sb = new SolveBracket();
        assertTrue(sb.solution2("()()"));
        assertTrue(sb.solution2("(()())()"));
        assertTrue(sb.solution2("(())()"));
        assertFalse(sb.solution2(")()("));
        assertFalse(sb.solution2( "((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))))"));

    }

    @Test
    @DisplayName("괄호가 잘 풀리는지3 - stack")
    void bracket3() {
        SolveBracket sb = new SolveBracket();
        assertTrue(sb.solution2("()()"));
        assertTrue(sb.solution2("(()())()"));
        assertTrue(sb.solution2("(())()"));
        assertFalse(sb.solution2(")()("));
        assertFalse(sb.solution2( "((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))))"));
    }

}