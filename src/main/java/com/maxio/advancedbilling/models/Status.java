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
 * Status to be used.
 */
public enum Status {
    DRAFT,

    SCHEDULED,

    PENDING,

    CANCELED,

    ACTIVE,

    FULFILLED;


    private static TreeMap<String, Status> valueMap = new TreeMap<>();
    private String value;

    static {
        DRAFT.value = "draft";
        SCHEDULED.value = "scheduled";
        PENDING.value = "pending";
        CANCELED.value = "canceled";
        ACTIVE.value = "active";
        FULFILLED.value = "fulfilled";

        valueMap.put("draft", DRAFT);
        valueMap.put("scheduled", SCHEDULED);
        valueMap.put("pending", PENDING);
        valueMap.put("canceled", CANCELED);
        valueMap.put("active", ACTIVE);
        valueMap.put("fulfilled", FULFILLED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static Status constructFromString(String toConvert) throws IOException {
        Status enumValue = fromString(toConvert);
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
    public static Status fromString(String toConvert) {
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
     * Convert list of Status values to list of string values.
     * @param toConvert The list of Status values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Status> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Status enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 