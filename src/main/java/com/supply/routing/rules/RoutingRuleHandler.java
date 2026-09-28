package com.supply.routing.rules;

import com.supply.routing.model.OrderContext;

public abstract class RoutingRuleHandler {
    protected RoutingRuleHandler nextHandler;

    public RoutingRuleHandler setNext(RoutingRuleHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public abstract void process(OrderContext context);

    protected void processNext(OrderContext context) {
        if (nextHandler != null) {
            nextHandler.process(context);
        }
    }
}