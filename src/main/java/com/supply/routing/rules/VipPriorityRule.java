package com.supply.routing.rules;

import com.supply.routing.model.CustomerType;
import com.supply.routing.model.OrderContext;

public class VipPriorityRule extends RoutingRuleHandler {

    @Override
    public void process(OrderContext context) {
        if (context.getEvent().customerType() == CustomerType.VIP || 
            context.getEvent().customerType() == CustomerType.ENTERPRISE) {
            context.addPriorityScore(50);
        }
        
        if (context.getEvent().totalValue() > 5000.0) {
            context.addPriorityScore(30);
        }

        processNext(context);
    }
}