package org.example;

import org.junit.jupiter.api.Test;

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

    @Test
    void root() {
         assertEquals(2, calculator.root(36), "  6");

    }
}