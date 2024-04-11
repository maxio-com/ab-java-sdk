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
 * IncludeNullOrNotNull to be used.
 */
public enum IncludeNullOrNotNull {
    NOT_NULL,

    ENUM_NULL;


    private static TreeMap<String, IncludeNullOrNotNull> valueMap = new TreeMap<>();
    private String value;

    static {
        NOT_NULL.value = "not_null";
        ENUM_NULL.value = "null";

        valueMap.put("not_null", NOT_NULL);
        valueMap.put("null", ENUM_NULL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static IncludeNullOrNotNull constructFromString(String toConvert) throws IOException {
        IncludeNullOrNotNull enumValue = fromString(toConvert);
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
    public static IncludeNullOrNotNull fromString(String toConvert) {
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
     * Convert list of IncludeNullOrNotNull values to list of string values.
     * @param toConvert The list of IncludeNullOrNotNull values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<IncludeNullOrNotNull> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (IncludeNullOrNotNull enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 