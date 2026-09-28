package com.supply.routing.service;

import com.supply.routing.dto.OrderEventDTO;
import com.supply.routing.dto.RoutingResultDTO;
import com.supply.routing.model.OrderContext;
import com.supply.routing.rules.RoutingRuleHandler;
import org.springframework.stereotype.Service;

@Service
public class OrderRoutingService {

    private final RoutingRuleHandler routingChain;
    private final EventPublisherService publisherService;

    public OrderRoutingService(RoutingRuleHandler routingChain, EventPublisherService publisherService) {
        this.routingChain = routingChain;
        this.publisherService = publisherService;
    }

    public RoutingResultDTO processAndRouteOrder(OrderEventDTO event) {
        OrderContext context = new OrderContext(event);

        // Executa a cadeia de regras
        routingChain.process(context);

        String destinationQueue = context.getPriorityScore() >= 70 
            ? "queue.fulfillment.priority" 
            : "queue.fulfillment.standard";

        RoutingResultDTO result = new RoutingResultDTO(
            event.orderId(),
            context.getPriorityScore(),
            context.getSelectedCarrier(),
            context.getRoutingReason(),
            destinationQueue
        );

        // Simula envio para o broker de mensagens
        publisherService.publishToMessageBroker(result);

        return result;
    }
}