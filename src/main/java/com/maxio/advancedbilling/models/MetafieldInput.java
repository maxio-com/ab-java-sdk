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
 * MetafieldInput to be used.
 */
public enum MetafieldInput {
    BALANCE_TRACKER,

    TEXT,

    RADIO,

    DROPDOWN;


    private static TreeMap<String, MetafieldInput> valueMap = new TreeMap<>();
    private String value;

    static {
        BALANCE_TRACKER.value = "balance_tracker";
        TEXT.value = "text";
        RADIO.value = "radio";
        DROPDOWN.value = "dropdown";

        valueMap.put("balance_tracker", BALANCE_TRACKER);
        valueMap.put("text", TEXT);
        valueMap.put("radio", RADIO);
        valueMap.put("dropdown", DROPDOWN);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static MetafieldInput constructFromString(String toConvert) throws IOException {
        MetafieldInput enumValue = fromString(toConvert);
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
    public static MetafieldInput fromString(String toConvert) {
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
     * Convert list of MetafieldInput values to list of string values.
     * @param toConvert The list of MetafieldInput values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<MetafieldInput> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (MetafieldInput enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 