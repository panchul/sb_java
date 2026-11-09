package com.example.appusinggradle.pricing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class PricingCalculatorTest {

    private final PricingCalculator pricingCalculator = new PricingCalculator();

    @Test
    void calculateTotalAppliesDiscount() {
        BigDecimal total = pricingCalculator.calculateTotal(new BigDecimal("120.00"), new BigDecimal("0.25"));
        assertEquals(new BigDecimal("90.00"), total);
    }

    @Test
    void calculateTotalThrowsWhenDiscountRateInvalid() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> pricingCalculator.calculateTotal(new BigDecimal("50.00"), new BigDecimal("1.1"))
        );
        assertEquals("discountRate must be between 0 and 1", ex.getMessage());
    }
}
