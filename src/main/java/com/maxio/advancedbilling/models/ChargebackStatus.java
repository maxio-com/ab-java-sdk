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
 * ChargebackStatus to be used.
 */
public enum ChargebackStatus {
    OPEN,

    LOST,

    WON,

    CLOSED;


    private static TreeMap<String, ChargebackStatus> valueMap = new TreeMap<>();
    private String value;

    static {
        OPEN.value = "open";
        LOST.value = "lost";
        WON.value = "won";
        CLOSED.value = "closed";

        valueMap.put("open", OPEN);
        valueMap.put("lost", LOST);
        valueMap.put("won", WON);
        valueMap.put("closed", CLOSED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ChargebackStatus constructFromString(String toConvert) throws IOException {
        ChargebackStatus enumValue = fromString(toConvert);
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
    public static ChargebackStatus fromString(String toConvert) {
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
     * Convert list of ChargebackStatus values to list of string values.
     * @param toConvert The list of ChargebackStatus values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ChargebackStatus> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ChargebackStatus enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 