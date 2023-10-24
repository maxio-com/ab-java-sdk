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
 * ExtendedIntervalUnit to be used.
 */
public enum ExtendedIntervalUnit {
    DAY,

    MONTH,

    NEVER;


    private static TreeMap<String, ExtendedIntervalUnit> valueMap = new TreeMap<>();
    private String value;

    static {
        DAY.value = "day";
        MONTH.value = "month";
        NEVER.value = "never";

        valueMap.put("day", DAY);
        valueMap.put("month", MONTH);
        valueMap.put("never", NEVER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ExtendedIntervalUnit constructFromString(String toConvert) throws IOException {
        ExtendedIntervalUnit enumValue = fromString(toConvert);
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
    public static ExtendedIntervalUnit fromString(String toConvert) {
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
     * Convert list of ExtendedIntervalUnit values to list of string values.
     * @param toConvert The list of ExtendedIntervalUnit values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ExtendedIntervalUnit> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ExtendedIntervalUnit enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 