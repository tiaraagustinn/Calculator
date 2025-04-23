package com.example.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorUnitTest {

    /* Test case untuk menjumlahkan dua angka positif */
    @Test
    public void addition_isCorrect() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    /* Test case untuk menjumlahkan angka negatif dan positif */
    @Test
    public void addition_withNegative() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.add(2, -2));
    }
}
