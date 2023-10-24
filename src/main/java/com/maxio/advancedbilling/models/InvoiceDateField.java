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
 * InvoiceDateField to be used.
 */
public enum InvoiceDateField {
    CREATED_AT,

    DUE_DATE,

    ISSUE_DATE,

    UPDATED_AT,

    PAID_DATE;


    private static TreeMap<String, InvoiceDateField> valueMap = new TreeMap<>();
    private String value;

    static {
        CREATED_AT.value = "created_at";
        DUE_DATE.value = "due_date";
        ISSUE_DATE.value = "issue_date";
        UPDATED_AT.value = "updated_at";
        PAID_DATE.value = "paid_date";

        valueMap.put("created_at", CREATED_AT);
        valueMap.put("due_date", DUE_DATE);
        valueMap.put("issue_date", ISSUE_DATE);
        valueMap.put("updated_at", UPDATED_AT);
        valueMap.put("paid_date", PAID_DATE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InvoiceDateField constructFromString(String toConvert) throws IOException {
        InvoiceDateField enumValue = fromString(toConvert);
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
    public static InvoiceDateField fromString(String toConvert) {
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
     * Convert list of InvoiceDateField values to list of string values.
     * @param toConvert The list of InvoiceDateField values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InvoiceDateField> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InvoiceDateField enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 