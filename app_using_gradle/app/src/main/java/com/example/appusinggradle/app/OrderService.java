package com.example.appusinggradle.app;

import com.example.appusinggradle.common.ValidationUtils;
import com.example.appusinggradle.pricing.PricingCalculator;
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
