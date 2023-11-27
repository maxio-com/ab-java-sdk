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
 * PricePointType2 to be used.
 */
public enum PricePointType2 {
    CATALOG,

    ENUM_DEFAULT,

    CUSTOM;


    private static TreeMap<String, PricePointType2> valueMap = new TreeMap<>();
    private String value;

    static {
        CATALOG.value = "catalog";
        ENUM_DEFAULT.value = "default";
        CUSTOM.value = "custom";

        valueMap.put("catalog", CATALOG);
        valueMap.put("default", ENUM_DEFAULT);
        valueMap.put("custom", CUSTOM);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PricePointType2 constructFromString(String toConvert) throws IOException {
        PricePointType2 enumValue = fromString(toConvert);
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
    public static PricePointType2 fromString(String toConvert) {
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
     * Convert list of PricePointType2 values to list of string values.
     * @param toConvert The list of PricePointType2 values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PricePointType2> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PricePointType2 enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 