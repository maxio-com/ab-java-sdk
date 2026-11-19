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
 * Origin to be used.
 */
public enum Origin {
    RECURRING,

    MANUAL,

    INITIAL_BALANCE,

    ALLOWANCE_INCREASE,

    PURCHASE;

    private static TreeMap<String, Origin> valueMap = new TreeMap<>();
    private String value;

    static {
        RECURRING.value = "recurring";
        MANUAL.value = "manual";
        INITIAL_BALANCE.value = "initial_balance";
        ALLOWANCE_INCREASE.value = "allowance_increase";
        PURCHASE.value = "purchase";

        valueMap.put("recurring", RECURRING);
        valueMap.put("manual", MANUAL);
        valueMap.put("initial_balance", INITIAL_BALANCE);
        valueMap.put("allowance_increase", ALLOWANCE_INCREASE);
        valueMap.put("purchase", PURCHASE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static Origin constructFromString(String toConvert) throws IOException {
        Origin enumValue = fromString(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static Origin fromString(String toConvert) {
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
     * Convert list of Origin values to list of string values.
     * @param toConvert The list of Origin values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Origin> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Origin enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 