package com.example.appusingmaven.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.example.appusingmaven.pricing.PricingCalculator;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class OrderServiceTest {

    private final OrderService orderService = new OrderService(new PricingCalculator());

    @Test
    void quoteReturnsDiscountedAmount() {
        BigDecimal total = orderService.quote("id-1", new BigDecimal("50.00"), new BigDecimal("0.20"));
        assertEquals(new BigDecimal("40.00"), total);
    }

    @Test
    void quoteThrowsWhenOrderIdMissing() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> orderService.quote(" ", new BigDecimal("50.00"), new BigDecimal("0.20"))
        );
        assertEquals("orderId must not be blank", ex.getMessage());
    }
}
