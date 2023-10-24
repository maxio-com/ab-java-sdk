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
 * SubscriptionInclude to be used.
 */
public enum SubscriptionInclude {
    COUPONS,

    SELF_SERVICE_PAGE_TOKEN;


    private static TreeMap<String, SubscriptionInclude> valueMap = new TreeMap<>();
    private String value;

    static {
        COUPONS.value = "coupons";
        SELF_SERVICE_PAGE_TOKEN.value = "self_service_page_token";

        valueMap.put("coupons", COUPONS);
        valueMap.put("self_service_page_token", SELF_SERVICE_PAGE_TOKEN);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static SubscriptionInclude constructFromString(String toConvert) throws IOException {
        SubscriptionInclude enumValue = fromString(toConvert);
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
    public static SubscriptionInclude fromString(String toConvert) {
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
     * Convert list of SubscriptionInclude values to list of string values.
     * @param toConvert The list of SubscriptionInclude values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SubscriptionInclude> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SubscriptionInclude enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 