package org.campus02.student.calculator;

import org.junit.jupiter.api.*;

class CalculatorTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Wird nur einmal am Beginn ausgeführt");
    }

    @BeforeEach
    void setUp() {

        System.out.println("Werde vor jedem Test aufgerufen");
    }

    @Test
    @DisplayName("test addition")
    void add() {
        int result = Calculator.add(2,3);
        int expected = 5;

        Assertions.assertEquals(expected, result);
    }

    @Test
    void subtract() {
        // int subtractResult = Calculator.subtract(3,2);
        // int expected = 1;
        Assertions.assertEquals(1, Calculator.subtract(3, 2));
    }

    @Test
    void multiply() {
        Assertions.assertEquals(6, Calculator.multiply(3,2));
    }


    @Test
    void isEquals() {
        Assertions.assertTrue(Calculator.isEquals(1,1));
    }

    @Test
    void isNotEquals() {
        Assertions.assertFalse(Calculator.isEquals(2, 1));
    }
}