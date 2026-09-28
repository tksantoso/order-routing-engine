package com.supply.routing.rules;

import com.supply.routing.model.Carrier;
import com.supply.routing.model.OrderContext;

public class HeavyFreightCarrierRule extends RoutingRuleHandler {

    @Override
    public void process(OrderContext context) {
        if (context.getEvent().weightKg() > 100.0) {
            context.setSelectedCarrier(Carrier.HEAVY_CARGO_FREIGHT);
            context.setRoutingReason("Atribuído Carga Pesada devido ao peso superior a 100kg.");
            // Regra terminal de peso: não avança na cadeia
            return;
        }

        processNext(context);
    }
}