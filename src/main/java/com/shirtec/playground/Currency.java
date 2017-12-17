package com.shirtec.playground;

public enum Currency {
    US_DOLLAR("USD"),
    RUSSIAN_RUBLE("RUR"),
    EURO("EUR");

    private String code;

    Currency(String c) {}

    @Override
    public String toString() {
        return this.name();
    }
}
