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
 * SubscriptionSort to be used.
 */
public enum SubscriptionSort {
    SIGNUP_DATE,

    PERIOD_START,

    PERIOD_END,

    NEXT_ASSESSMENT,

    UPDATED_AT,

    CREATED_AT;


    private static TreeMap<String, SubscriptionSort> valueMap = new TreeMap<>();
    private String value;

    static {
        SIGNUP_DATE.value = "signup_date";
        PERIOD_START.value = "period_start";
        PERIOD_END.value = "period_end";
        NEXT_ASSESSMENT.value = "next_assessment";
        UPDATED_AT.value = "updated_at";
        CREATED_AT.value = "created_at";

        valueMap.put("signup_date", SIGNUP_DATE);
        valueMap.put("period_start", PERIOD_START);
        valueMap.put("period_end", PERIOD_END);
        valueMap.put("next_assessment", NEXT_ASSESSMENT);
        valueMap.put("updated_at", UPDATED_AT);
        valueMap.put("created_at", CREATED_AT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static SubscriptionSort constructFromString(String toConvert) throws IOException {
        SubscriptionSort enumValue = fromString(toConvert);
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
    public static SubscriptionSort fromString(String toConvert) {
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
     * Convert list of SubscriptionSort values to list of string values.
     * @param toConvert The list of SubscriptionSort values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SubscriptionSort> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SubscriptionSort enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 