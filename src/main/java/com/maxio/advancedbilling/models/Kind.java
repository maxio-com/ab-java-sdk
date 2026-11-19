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
 * Kind to be used.
 */
public enum Kind {
    ACCESS_RIGHT,

    USAGE_LIMIT,

    SERVICE_RIGHT,

    ALL;

    private static TreeMap<String, Kind> valueMap = new TreeMap<>();
    private String value;

    static {
        ACCESS_RIGHT.value = "access_right";
        USAGE_LIMIT.value = "usage_limit";
        SERVICE_RIGHT.value = "service_right";
        ALL.value = "all";

        valueMap.put("access_right", ACCESS_RIGHT);
        valueMap.put("usage_limit", USAGE_LIMIT);
        valueMap.put("service_right", SERVICE_RIGHT);
        valueMap.put("all", ALL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static Kind constructFromString(String toConvert) throws IOException {
        Kind enumValue = fromString(toConvert);
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
    public static Kind fromString(String toConvert) {
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
     * Convert list of Kind values to list of string values.
     * @param toConvert The list of Kind values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Kind> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Kind enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 