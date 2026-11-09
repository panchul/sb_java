package com.example.appusingmaven.app;

import com.example.appusingmaven.common.ValidationUtils;
import com.example.appusingmaven.pricing.PricingCalculator;
import java.math.BigDecimal;

public class OrderService {

    private final PricingCalculator pricingCalculator;

    public OrderService(PricingCalculator pricingCalculator) {
        this.pricingCalculator = pricingCalculator;
    }

    public BigDecimal quote(String orderId, BigDecimal subtotal, BigDecimal discountRate) {
        ValidationUtils.requireNonBlank(orderId, "orderId");
        ValidationUtils.requirePositive(subtotal, "subtotal");
        return pricingCalculator.calculateTotal(subtotal, discountRate);
    }
}
