package com.supply.routing.dto;

import com.supply.routing.model.CustomerType;

public record OrderEventDTO(
    String orderId,
    String customerId,
    CustomerType customerType,
    double weightKg,
    double totalValue,
    double distanceKm,
    boolean isExpressRequested
) {}