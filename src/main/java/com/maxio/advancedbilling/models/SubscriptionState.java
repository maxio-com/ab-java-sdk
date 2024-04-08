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
 * SubscriptionState to be used.
 */
public enum SubscriptionState {
    PENDING,

    FAILED_TO_CREATE,

    TRIALING,

    ASSESSING,

    ACTIVE,

    SOFT_FAILURE,

    PAST_DUE,

    SUSPENDED,

    CANCELED,

    EXPIRED,

    PAUSED,

    UNPAID,

    TRIAL_ENDED,

    ON_HOLD,

    AWAITING_SIGNUP;


    private static TreeMap<String, SubscriptionState> valueMap = new TreeMap<>();
    private String value;

    static {
        PENDING.value = "pending";
        FAILED_TO_CREATE.value = "failed_to_create";
        TRIALING.value = "trialing";
        ASSESSING.value = "assessing";
        ACTIVE.value = "active";
        SOFT_FAILURE.value = "soft_failure";
        PAST_DUE.value = "past_due";
        SUSPENDED.value = "suspended";
        CANCELED.value = "canceled";
        EXPIRED.value = "expired";
        PAUSED.value = "paused";
        UNPAID.value = "unpaid";
        TRIAL_ENDED.value = "trial_ended";
        ON_HOLD.value = "on_hold";
        AWAITING_SIGNUP.value = "awaiting_signup";

        valueMap.put("pending", PENDING);
        valueMap.put("failed_to_create", FAILED_TO_CREATE);
        valueMap.put("trialing", TRIALING);
        valueMap.put("assessing", ASSESSING);
        valueMap.put("active", ACTIVE);
        valueMap.put("soft_failure", SOFT_FAILURE);
        valueMap.put("past_due", PAST_DUE);
        valueMap.put("suspended", SUSPENDED);
        valueMap.put("canceled", CANCELED);
        valueMap.put("expired", EXPIRED);
        valueMap.put("paused", PAUSED);
        valueMap.put("unpaid", UNPAID);
        valueMap.put("trial_ended", TRIAL_ENDED);
        valueMap.put("on_hold", ON_HOLD);
        valueMap.put("awaiting_signup", AWAITING_SIGNUP);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static SubscriptionState constructFromString(String toConvert) throws IOException {
        SubscriptionState enumValue = fromString(toConvert);
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
    public static SubscriptionState fromString(String toConvert) {
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
     * Convert list of SubscriptionState values to list of string values.
     * @param toConvert The list of SubscriptionState values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SubscriptionState> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SubscriptionState enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 