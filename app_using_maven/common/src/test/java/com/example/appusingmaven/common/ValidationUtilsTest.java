package com.example.appusingmaven.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class ValidationUtilsTest {

    @Test
    void requireNonBlankReturnsValueWhenValid() {
        assertEquals("order-1", ValidationUtils.requireNonBlank("order-1", "orderId"));
    }

    @Test
    void requireNonBlankThrowsWhenBlank() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> ValidationUtils.requireNonBlank("   ", "orderId")
        );
        assertEquals("orderId must not be blank", ex.getMessage());
    }

    @Test
    void requirePositiveReturnsValueWhenValid() {
        BigDecimal value = new BigDecimal("10.00");
        assertEquals(value, ValidationUtils.requirePositive(value, "amount"));
    }

    @Test
    void requirePositiveThrowsWhenZero() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> ValidationUtils.requirePositive(BigDecimal.ZERO, "amount")
        );
        assertEquals("amount must be greater than zero", ex.getMessage());
    }
}
