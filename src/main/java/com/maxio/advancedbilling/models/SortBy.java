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
 * SortBy to be used.
 */
public enum SortBy {
    NAME,

    UPDATED_AT,

    KIND,

    VALUE_TYPE;

    private static TreeMap<String, SortBy> valueMap = new TreeMap<>();
    private String value;

    static {
        NAME.value = "name";
        UPDATED_AT.value = "updated_at";
        KIND.value = "kind";
        VALUE_TYPE.value = "value_type";

        valueMap.put("name", NAME);
        valueMap.put("updated_at", UPDATED_AT);
        valueMap.put("kind", KIND);
        valueMap.put("value_type", VALUE_TYPE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static SortBy constructFromString(String toConvert) throws IOException {
        SortBy enumValue = fromString(toConvert);
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
    public static SortBy fromString(String toConvert) {
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
     * Convert list of SortBy values to list of string values.
     * @param toConvert The list of SortBy values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SortBy> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SortBy enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 