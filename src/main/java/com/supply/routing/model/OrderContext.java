package com.supply.routing.model;

import com.supply.routing.dto.OrderEventDTO;

public class OrderContext {
    private final OrderEventDTO event;
    private int priorityScore = 0;
    private Carrier selectedCarrier;
    private String routingReason;

    public OrderContext(OrderEventDTO event) {
        this.event = event;
    }

    public OrderEventDTO getEvent() { return event; }
    public int getPriorityScore() { return priorityScore; }
    public void addPriorityScore(int points) { this.priorityScore += points; }
    public Carrier getSelectedCarrier() { return selectedCarrier; }
    public void setSelectedCarrier(Carrier selectedCarrier) { this.selectedCarrier = selectedCarrier; }
    public String getRoutingReason() { return routingReason; }
    public void setRoutingReason(String routingReason) { this.routingReason = routingReason; }
}