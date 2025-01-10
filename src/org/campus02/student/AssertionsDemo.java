package org.campus02.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsDemo {

    int a;
    String s;
    boolean b;

    @BeforeEach
    void setup() {
        a = 1; // für jede Testmethode wird a = 1 gesetzt!!!!
        s = "Hallo Welt";
        b = true;

        System.out.println();
        System.out.println("Setup! Vor jeder Testmethode");
    }

    @Test
    void testAIs1() {
        //assertEquals(2, a);
        assertEquals(1, a);
    }

    @Test
    void testALessThan3() {
        System.out.println("A < 3");
        boolean result = a < 3;
        //assertFalse(result);
        assertTrue(a < 3);
    }

    @Test
    @DisplayName("Test s auf Hallo Welt und Länge")
    void testS() {
        String expected = "Hallo Welt";
        assertEquals(expected, s);
        assertTrue(s.length() == 10);
    }
}
