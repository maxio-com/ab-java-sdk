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
 * ListSubscriptionGroupPrepaymentDateField to be used.
 */
public enum ListSubscriptionGroupPrepaymentDateField {
    CREATED_AT,

    APPLICATION_AT;


    private static TreeMap<String, ListSubscriptionGroupPrepaymentDateField> valueMap = new TreeMap<>();
    private String value;

    static {
        CREATED_AT.value = "created_at";
        APPLICATION_AT.value = "application_at";

        valueMap.put("created_at", CREATED_AT);
        valueMap.put("application_at", APPLICATION_AT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ListSubscriptionGroupPrepaymentDateField constructFromString(String toConvert) throws IOException {
        ListSubscriptionGroupPrepaymentDateField enumValue = fromString(toConvert);
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
    public static ListSubscriptionGroupPrepaymentDateField fromString(String toConvert) {
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
     * Convert list of ListSubscriptionGroupPrepaymentDateField values to list of string values.
     * @param toConvert The list of ListSubscriptionGroupPrepaymentDateField values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ListSubscriptionGroupPrepaymentDateField> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ListSubscriptionGroupPrepaymentDateField enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 