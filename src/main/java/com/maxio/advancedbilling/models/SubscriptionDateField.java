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
 * SubscriptionDateField to be used.
 */
public enum SubscriptionDateField {
    CURRENT_PERIOD_ENDS_AT,

    CURRENT_PERIOD_STARTS_AT,

    CREATED_AT,

    ACTIVATED_AT,

    CANCELED_AT,

    EXPIRES_AT,

    TRIAL_STARTED_AT,

    TRIAL_ENDED_AT,

    UPDATED_AT;


    private static TreeMap<String, SubscriptionDateField> valueMap = new TreeMap<>();
    private String value;

    static {
        CURRENT_PERIOD_ENDS_AT.value = "current_period_ends_at";
        CURRENT_PERIOD_STARTS_AT.value = "current_period_starts_at";
        CREATED_AT.value = "created_at";
        ACTIVATED_AT.value = "activated_at";
        CANCELED_AT.value = "canceled_at";
        EXPIRES_AT.value = "expires_at";
        TRIAL_STARTED_AT.value = "trial_started_at";
        TRIAL_ENDED_AT.value = "trial_ended_at";
        UPDATED_AT.value = "updated_at";

        valueMap.put("current_period_ends_at", CURRENT_PERIOD_ENDS_AT);
        valueMap.put("current_period_starts_at", CURRENT_PERIOD_STARTS_AT);
        valueMap.put("created_at", CREATED_AT);
        valueMap.put("activated_at", ACTIVATED_AT);
        valueMap.put("canceled_at", CANCELED_AT);
        valueMap.put("expires_at", EXPIRES_AT);
        valueMap.put("trial_started_at", TRIAL_STARTED_AT);
        valueMap.put("trial_ended_at", TRIAL_ENDED_AT);
        valueMap.put("updated_at", UPDATED_AT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static SubscriptionDateField constructFromString(String toConvert) throws IOException {
        SubscriptionDateField enumValue = fromString(toConvert);
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
    public static SubscriptionDateField fromString(String toConvert) {
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
     * Convert list of SubscriptionDateField values to list of string values.
     * @param toConvert The list of SubscriptionDateField values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SubscriptionDateField> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SubscriptionDateField enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 