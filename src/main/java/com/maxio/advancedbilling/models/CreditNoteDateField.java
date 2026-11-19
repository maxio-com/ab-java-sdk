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
 * CreditNoteDateField to be used.
 */
public enum CreditNoteDateField {
    ISSUE_DATE,

    APPLIED_DATE,

    CREATED_AT,

    UPDATED_AT;

    private static TreeMap<String, CreditNoteDateField> valueMap = new TreeMap<>();
    private String value;

    static {
        ISSUE_DATE.value = "issue_date";
        APPLIED_DATE.value = "applied_date";
        CREATED_AT.value = "created_at";
        UPDATED_AT.value = "updated_at";

        valueMap.put("issue_date", ISSUE_DATE);
        valueMap.put("applied_date", APPLIED_DATE);
        valueMap.put("created_at", CREATED_AT);
        valueMap.put("updated_at", UPDATED_AT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CreditNoteDateField constructFromString(String toConvert) throws IOException {
        CreditNoteDateField enumValue = fromString(toConvert);
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
    public static CreditNoteDateField fromString(String toConvert) {
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
     * Convert list of CreditNoteDateField values to list of string values.
     * @param toConvert The list of CreditNoteDateField values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CreditNoteDateField> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CreditNoteDateField enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 