package com.supply.routing.rules;

import com.supply.routing.model.Carrier;
import com.supply.routing.model.OrderContext;

public class StandardCarrierRule extends RoutingRuleHandler {

    @Override
    public void process(OrderContext context) {
        if (context.getSelectedCarrier() == null) {
            context.setSelectedCarrier(Carrier.STANDARD_SURFACE_DELIVERY);
            context.setRoutingReason("Atribuído transporte Rodoviário Padrão.");
        }
    }
}