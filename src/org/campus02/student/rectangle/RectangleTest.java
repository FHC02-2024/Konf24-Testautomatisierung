package org.campus02.student.rectangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    Rectangle r;

    @BeforeEach
    void setUp() {
        r = new Rectangle(2, 4);
    }

    @Test
    void testConstructor() {
        assertEquals(2, r.getA());
        assertEquals(4, r.getB());
    }

    @Test
    void testConstructorALessThanZero() {
        Rectangle r2 = new Rectangle(-1, 4);
        assertEquals(1, r2.getA());
        assertEquals(4, r2.getB());
    }

    @Test
    void berechneUmfang() {
        int umfang = r.berechneUmfang();
        assertEquals(12, umfang);
    }

    @Test
    void berechneFlaeche() {
        assertEquals(8, r.berechneFlaeche());
    }
}