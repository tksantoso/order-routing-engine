package com.supply.routing.config;

import com.supply.routing.rules.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutingChainConfig {

    @Bean
    public RoutingRuleHandler routingChain() {
        RoutingRuleHandler vipRule = new VipPriorityRule();
        RoutingRuleHandler heavyRule = new HeavyFreightCarrierRule();
        RoutingRuleHandler expressRule = new ExpressCarrierRule();
        RoutingRuleHandler standardRule = new StandardCarrierRule();

        // Montagem da cadeia de responsabilidades
        vipRule.setNext(heavyRule)
               .setNext(expressRule)
               .setNext(standardRule);

        return vipRule;
    }
}