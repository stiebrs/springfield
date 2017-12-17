package com.shirtec.playground.converter;

import com.shirtec.playground.Currency;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class CurrencyConverter implements AttributeConverter<Currency, String> {
    @Override
    public String convertToDatabaseColumn(Currency attribute) {
        if (attribute != null) {
            switch (attribute) {
                case US_DOLLAR:
                    return "USD";
                case EURO:
                    return "EUR";
                case RUSSIAN_RUBLE:
                    return "RUR";
                default:
                    throw new IllegalArgumentException("Unknown " + attribute);
            }
        }
        return null;
    }

    @Override
    public Currency convertToEntityAttribute(String dbData) {
        if (dbData != null) {
            switch (dbData) {
                case "USD":
                    return Currency.US_DOLLAR;
                case "EUR":
                    return Currency.EURO;
                case "RUR":
                    return Currency.RUSSIAN_RUBLE;
                default:
                    throw new IllegalArgumentException("Cannot map db value " + dbData + " to Currency enum");
            }
        }
        return null;
    }
}
