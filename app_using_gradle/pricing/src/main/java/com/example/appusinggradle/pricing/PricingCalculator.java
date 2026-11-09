package com.example.appusinggradle.pricing;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PricingCalculator {

    private static final int SCALE = 2;

    public BigDecimal calculateTotal(BigDecimal subtotal, BigDecimal discountRate) {
        if (subtotal == null || discountRate == null) {
            throw new IllegalArgumentException("subtotal and discountRate are required");
        }
        if (subtotal.signum() < 0) {
            throw new IllegalArgumentException("subtotal must not be negative");
        }
        if (discountRate.compareTo(BigDecimal.ZERO) < 0 || discountRate.compareTo(BigDecimal.ONE) > 0) {
            throw new IllegalArgumentException("discountRate must be between 0 and 1");
        }

        BigDecimal discount = subtotal.multiply(discountRate);
        return subtotal.subtract(discount).setScale(SCALE, RoundingMode.HALF_UP);
    }
}
