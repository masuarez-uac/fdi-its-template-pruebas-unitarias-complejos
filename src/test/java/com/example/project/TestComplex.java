package com.example.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestComplex {
    Complex complex;
    Complex other;

    @BeforeEach
    public void setUp() {
        complex = new Complex(3, 2);
        other = new Complex(-1, 2);
    }

    @Test
    public void testConstructor() {
        assertEquals(3, complex.getReal());
        assertEquals(2, complex.getImaginary());
    }

    @Test
    public void testSetters() {
        complex.setReal(5);
        complex.setImaginary(6);
        assertEquals(5, complex.getReal());
        assertEquals(6, complex.getImaginary());
    }

    @Test
    public void testAddition() {
        Complex result = complex.add(other);
        assertEquals(2, result.getReal());
        assertEquals(4, result.getImaginary());
    }

    @Test
    public void testSubtraction() {
        Complex result = complex.sub(other);
        assertEquals(4, result.getReal());
        assertEquals(0, result.getImaginary());
    }

    @Test
    public void testMultiplication() {
        Complex result = complex.multiply(other);
        assertEquals(-7, result.getReal());
        assertEquals(4, result.getImaginary());
    }

    @Test
    public void testDivision() {
        Complex result = complex.divide(other);
        assertEquals(0.2, result.getReal());
        assertEquals(-1.6, result.getImaginary());
    }

    @Test
    public void testConjugate() {
        Complex result = complex.conjugate();
        assertEquals(3, result.getReal());
        assertEquals(-2, result.getImaginary());
    }
}
