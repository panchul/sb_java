package com.example.appusinggradle.app;

import com.example.appusinggradle.pricing.PricingCalculator;
import java.math.BigDecimal;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        OrderService orderService = new OrderService(new PricingCalculator());
        BigDecimal total = orderService.quote("order-1001", new BigDecimal("199.99"), new BigDecimal("0.10"));
        System.out.println("Final total: " + total);
    }
}
