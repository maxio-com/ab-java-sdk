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
 * InvoiceSortField to be used.
 */
public enum InvoiceSortField {
    STATUS,

    TOTAL_AMOUNT,

    DUE_AMOUNT,

    CREATED_AT,

    UPDATED_AT,

    ISSUE_DATE,

    DUE_DATE,

    NUMBER;


    private static TreeMap<String, InvoiceSortField> valueMap = new TreeMap<>();
    private String value;

    static {
        STATUS.value = "status";
        TOTAL_AMOUNT.value = "total_amount";
        DUE_AMOUNT.value = "due_amount";
        CREATED_AT.value = "created_at";
        UPDATED_AT.value = "updated_at";
        ISSUE_DATE.value = "issue_date";
        DUE_DATE.value = "due_date";
        NUMBER.value = "number";

        valueMap.put("status", STATUS);
        valueMap.put("total_amount", TOTAL_AMOUNT);
        valueMap.put("due_amount", DUE_AMOUNT);
        valueMap.put("created_at", CREATED_AT);
        valueMap.put("updated_at", UPDATED_AT);
        valueMap.put("issue_date", ISSUE_DATE);
        valueMap.put("due_date", DUE_DATE);
        valueMap.put("number", NUMBER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InvoiceSortField constructFromString(String toConvert) throws IOException {
        InvoiceSortField enumValue = fromString(toConvert);
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
    public static InvoiceSortField fromString(String toConvert) {
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
     * Convert list of InvoiceSortField values to list of string values.
     * @param toConvert The list of InvoiceSortField values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InvoiceSortField> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InvoiceSortField enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 