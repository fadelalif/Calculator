/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author fadel
 */
public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testTambah() {
        assertEquals(10, calculator.tambah(10, 5));
        assertEquals(0, calculator.tambah(-5, 5));
        assertEquals(-10, calculator.tambah(-5, -5));
    }

    @Test
    public void testKurang() {
        assertEquals(5, calculator.kurang(10, 5));
        assertEquals(-10, calculator.kurang(-5, 5));
        assertEquals(0, calculator.kurang(-5, -5));
    }

    @Test
    public void testKali() {
        assertEquals(50, calculator.kali(10, 5));
        assertEquals(-25, calculator.kali(-5, 5));
        assertEquals(25, calculator.kali(-5, -5));
    }

    @Test
    public void testBagi() {
        assertEquals(2, calculator.bagi(10, 5));
        assertEquals(-2, calculator.bagi(-10, 5));
        assertEquals(2, calculator.bagi(-10, -5));
    }

}
