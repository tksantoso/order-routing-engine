package com.supply.routing.model;

public enum Carrier {
    EXPRESS_AIR_LOGISTICS("Transporte Aéreo Expresso (Entrega até 24h)"),
    HEAVY_CARGO_FREIGHT("Transportadora Carga Pesada / Rodoviário"),
    STANDARD_SURFACE_DELIVERY("Entrega Padrão Urbana / Last Mile");

    private final String description;

    Carrier(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}