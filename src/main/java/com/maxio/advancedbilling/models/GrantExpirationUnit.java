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
 * GrantExpirationUnit to be used.
 */
public enum GrantExpirationUnit {
    DAY,

    MONTH,

    UNTIL_NEXT_REFILL;

    private static TreeMap<String, GrantExpirationUnit> valueMap = new TreeMap<>();
    private String value;

    static {
        DAY.value = "day";
        MONTH.value = "month";
        UNTIL_NEXT_REFILL.value = "until_next_refill";

        valueMap.put("day", DAY);
        valueMap.put("month", MONTH);
        valueMap.put("until_next_refill", UNTIL_NEXT_REFILL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static GrantExpirationUnit constructFromString(String toConvert) throws IOException {
        GrantExpirationUnit enumValue = fromString(toConvert);
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
    public static GrantExpirationUnit fromString(String toConvert) {
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
     * Convert list of GrantExpirationUnit values to list of string values.
     * @param toConvert The list of GrantExpirationUnit values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<GrantExpirationUnit> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (GrantExpirationUnit enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 