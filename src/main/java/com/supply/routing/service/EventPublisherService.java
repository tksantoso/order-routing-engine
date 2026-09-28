package com.supply.routing.service;

import com.supply.routing.dto.RoutingResultDTO;
import org.springframework.stereotype.Service;

@Service
public class EventPublisherService {

    public void publishToMessageBroker(RoutingResultDTO result) {
        System.out.println("\n📡 [BROKER EVENT PUBLISHED]");
        System.out.printf(" ↳ Fila de Destino: %s\n", result.queueDestination());
        System.out.printf(" ↳ Order ID: %s | Prioridade: %d\n", result.orderId(), result.priorityScore());
        System.out.printf(" ↳ Transportadora: %s\n", result.selectedCarrier());
        System.out.printf(" ↳ Motivo do Roteamento: %s\n\n", result.routingReason());
    }
}