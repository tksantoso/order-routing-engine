package com.supply.routing.rules;

import com.supply.routing.model.Carrier;
import com.supply.routing.model.OrderContext;

public class ExpressCarrierRule extends RoutingRuleHandler {

    @Override
    public void process(OrderContext context) {
        if (context.getEvent().isExpressRequested() || context.getPriorityScore() >= 70) {
            context.setSelectedCarrier(Carrier.EXPRESS_AIR_LOGISTICS);
            context.setRoutingReason("Atribuído envio Expresso Aéreo por alta prioridade ou solicitação expressa.");
            return;
        }

        processNext(context);
    }
}