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
 * InvoiceStatus to be used.
 */
public enum InvoiceStatus {
    DRAFT,

    OPEN,

    PAID,

    PENDING,

    VOIDED,

    CANCELED,

    PROCESSING;


    private static TreeMap<String, InvoiceStatus> valueMap = new TreeMap<>();
    private String value;

    static {
        DRAFT.value = "draft";
        OPEN.value = "open";
        PAID.value = "paid";
        PENDING.value = "pending";
        VOIDED.value = "voided";
        CANCELED.value = "canceled";
        PROCESSING.value = "processing";

        valueMap.put("draft", DRAFT);
        valueMap.put("open", OPEN);
        valueMap.put("paid", PAID);
        valueMap.put("pending", PENDING);
        valueMap.put("voided", VOIDED);
        valueMap.put("canceled", CANCELED);
        valueMap.put("processing", PROCESSING);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InvoiceStatus constructFromString(String toConvert) throws IOException {
        InvoiceStatus enumValue = fromString(toConvert);
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
    public static InvoiceStatus fromString(String toConvert) {
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
     * Convert list of InvoiceStatus values to list of string values.
     * @param toConvert The list of InvoiceStatus values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InvoiceStatus> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InvoiceStatus enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 