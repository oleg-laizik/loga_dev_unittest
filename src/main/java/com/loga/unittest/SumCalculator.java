package com.loga.unittest;

public class SumCalculator {
    public int sum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Must be positive");
        }
        return n * (n + 1) / 2;

    }
}
