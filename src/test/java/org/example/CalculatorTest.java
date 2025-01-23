package org.example;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();
    @org.junit.jupiter.api.Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3), " 5");
    }

    @org.junit.jupiter.api.Test
    void testSubtraction() {
        assertEquals(1, calculator.substract(3, 2), " 1");
    }

    @org.junit.jupiter.api.Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3), " 6");
    }

    @org.junit.jupiter.api.Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3), "  2");
    }

    @org.junit.jupiter.api.Test
    void testSquare() {
        assertEquals(36, calculator.square(6));
        assertNotEquals(36, calculator.square(5));
    }
}