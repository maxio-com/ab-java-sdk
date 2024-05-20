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
 * DebitNoteStatus to be used.
 */
public enum DebitNoteStatus {
    OPEN,

    APPLIED,

    BANISHED,

    PAID;


    private static TreeMap<String, DebitNoteStatus> valueMap = new TreeMap<>();
    private String value;

    static {
        OPEN.value = "open";
        APPLIED.value = "applied";
        BANISHED.value = "banished";
        PAID.value = "paid";

        valueMap.put("open", OPEN);
        valueMap.put("applied", APPLIED);
        valueMap.put("banished", BANISHED);
        valueMap.put("paid", PAID);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static DebitNoteStatus constructFromString(String toConvert) throws IOException {
        DebitNoteStatus enumValue = fromString(toConvert);
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
    public static DebitNoteStatus fromString(String toConvert) {
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
     * Convert list of DebitNoteStatus values to list of string values.
     * @param toConvert The list of DebitNoteStatus values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DebitNoteStatus> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DebitNoteStatus enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 