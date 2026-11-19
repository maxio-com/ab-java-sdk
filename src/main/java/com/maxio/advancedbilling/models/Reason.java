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
 * Reason to be used.
 */
public enum Reason {
    ENTITLEMENT_MISSING,

    WALLET_ARCHIVED,

    SUBSCRIPTION_TERMINATED,

    FEATURE_REMOVED,

    WALLET_BEHAVIOR_DISABLED,

    SUPERSEDED_BY_REPLACEMENT,

    SUBSCRIPTION_PREPAID,

    ALLOWANCE_NOT_REPRESENTABLE,

    BALANCE_AT_CAPACITY;

    private static TreeMap<String, Reason> valueMap = new TreeMap<>();
    private String value;

    static {
        ENTITLEMENT_MISSING.value = "entitlement_missing";
        WALLET_ARCHIVED.value = "wallet_archived";
        SUBSCRIPTION_TERMINATED.value = "subscription_terminated";
        FEATURE_REMOVED.value = "feature_removed";
        WALLET_BEHAVIOR_DISABLED.value = "wallet_behavior_disabled";
        SUPERSEDED_BY_REPLACEMENT.value = "superseded_by_replacement";
        SUBSCRIPTION_PREPAID.value = "subscription_prepaid";
        ALLOWANCE_NOT_REPRESENTABLE.value = "allowance_not_representable";
        BALANCE_AT_CAPACITY.value = "balance_at_capacity";

        valueMap.put("entitlement_missing", ENTITLEMENT_MISSING);
        valueMap.put("wallet_archived", WALLET_ARCHIVED);
        valueMap.put("subscription_terminated", SUBSCRIPTION_TERMINATED);
        valueMap.put("feature_removed", FEATURE_REMOVED);
        valueMap.put("wallet_behavior_disabled", WALLET_BEHAVIOR_DISABLED);
        valueMap.put("superseded_by_replacement", SUPERSEDED_BY_REPLACEMENT);
        valueMap.put("subscription_prepaid", SUBSCRIPTION_PREPAID);
        valueMap.put("allowance_not_representable", ALLOWANCE_NOT_REPRESENTABLE);
        valueMap.put("balance_at_capacity", BALANCE_AT_CAPACITY);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static Reason constructFromString(String toConvert) throws IOException {
        Reason enumValue = fromString(toConvert);
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
    public static Reason fromString(String toConvert) {
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
     * Convert list of Reason values to list of string values.
     * @param toConvert The list of Reason values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Reason> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Reason enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 