/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * CurrencyPriceRole to be used.
 */
public enum CurrencyPriceRole {
    BASELINE,

    TRIAL,

    INITIAL;


    private static TreeMap<String, CurrencyPriceRole> valueMap = new TreeMap<>();
    private String value;

    static {
        BASELINE.value = "baseline";
        TRIAL.value = "trial";
        INITIAL.value = "initial";

        valueMap.put("baseline", BASELINE);
        valueMap.put("trial", TRIAL);
        valueMap.put("initial", INITIAL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CurrencyPriceRole constructFromString(String toConvert) throws IOException {
        CurrencyPriceRole enumValue = fromString(toConvert);
        if (enumValue == null)
        {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static CurrencyPriceRole fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of CurrencyPriceRole values to list of string values.
     * @param toConvert The list of CurrencyPriceRole values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CurrencyPriceRole> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CurrencyPriceRole enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 