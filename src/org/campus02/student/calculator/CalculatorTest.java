package org.campus02.student.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class CalculatorTest {

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
    }

    @Test
    void multiply() {
    }


}