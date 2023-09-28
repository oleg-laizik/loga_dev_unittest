package com.loga.unittest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    void sum_returnsOne_forOne() {
        assertEquals(1, calculator.sum(1));
    }

    @Test
    void sum_returnsSix_forThree() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    void sum_throwsIllegalArgumentException_forZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}
