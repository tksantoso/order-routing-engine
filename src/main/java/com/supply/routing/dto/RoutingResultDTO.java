package com.supply.routing.dto;

import com.supply.routing.model.Carrier;

public record RoutingResultDTO(
    String orderId,
    int priorityScore,
    Carrier selectedCarrier,
    String routingReason,
    String queueDestination
) {}