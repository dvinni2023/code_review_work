import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(18, calculator.add(11 , 7));
    }

    @Test
    void dif() {
        assertEquals(-3, calculator.dif(12 , 15));
    }

    @Test
    void div() {
        assertEquals(3, calculator.div(10 , 3));
    }

    @Test
    void times() {
        assertEquals(81, calculator.times(9, 9));
    }

    @Test
    void solver() {
        assertEquals(18, calculator.dif(calculator.add(calculator.times(2, 5), 10), calculator.div(calculator.add(5, 7), 5)));
    }
}