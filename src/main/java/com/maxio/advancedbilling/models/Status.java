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

    OPEN,

    PAID,

    PENDING,

    VOIDED,

    CANCELED;


    private static TreeMap<String, Status> valueMap = new TreeMap<>();
    private String value;

    static {
        DRAFT.value = "draft";
        OPEN.value = "open";
        PAID.value = "paid";
        PENDING.value = "pending";
        VOIDED.value = "voided";
        CANCELED.value = "canceled";

        valueMap.put("draft", DRAFT);
        valueMap.put("open", OPEN);
        valueMap.put("paid", PAID);
        valueMap.put("pending", PENDING);
        valueMap.put("voided", VOIDED);
        valueMap.put("canceled", CANCELED);
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