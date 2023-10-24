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
 * SubscriptionPurgeType to be used.
 */
public enum SubscriptionPurgeType {
    CUSTOMER,

    PAYMENT_PROFILE;


    private static TreeMap<String, SubscriptionPurgeType> valueMap = new TreeMap<>();
    private String value;

    static {
        CUSTOMER.value = "customer";
        PAYMENT_PROFILE.value = "payment_profile";

        valueMap.put("customer", CUSTOMER);
        valueMap.put("payment_profile", PAYMENT_PROFILE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static SubscriptionPurgeType constructFromString(String toConvert) throws IOException {
        SubscriptionPurgeType enumValue = fromString(toConvert);
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
    public static SubscriptionPurgeType fromString(String toConvert) {
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
     * Convert list of SubscriptionPurgeType values to list of string values.
     * @param toConvert The list of SubscriptionPurgeType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SubscriptionPurgeType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SubscriptionPurgeType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 