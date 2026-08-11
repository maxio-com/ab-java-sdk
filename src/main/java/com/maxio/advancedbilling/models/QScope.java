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
 * QScope to be used.
 */
public enum QScope {
    FULL_NAME,

    FIRST_NAME,

    LAST_NAME,

    ORGANIZATION,

    CUSTOMER_REFERENCE,

    SUBSCRIPTION_REFERENCE,

    LAST_FOUR;

    private static TreeMap<String, QScope> valueMap = new TreeMap<>();
    private String value;

    static {
        FULL_NAME.value = "full_name";
        FIRST_NAME.value = "first_name";
        LAST_NAME.value = "last_name";
        ORGANIZATION.value = "organization";
        CUSTOMER_REFERENCE.value = "customer_reference";
        SUBSCRIPTION_REFERENCE.value = "subscription_reference";
        LAST_FOUR.value = "last_four";

        valueMap.put("full_name", FULL_NAME);
        valueMap.put("first_name", FIRST_NAME);
        valueMap.put("last_name", LAST_NAME);
        valueMap.put("organization", ORGANIZATION);
        valueMap.put("customer_reference", CUSTOMER_REFERENCE);
        valueMap.put("subscription_reference", SUBSCRIPTION_REFERENCE);
        valueMap.put("last_four", LAST_FOUR);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static QScope constructFromString(String toConvert) throws IOException {
        QScope enumValue = fromString(toConvert);
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
    public static QScope fromString(String toConvert) {
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
     * Convert list of QScope values to list of string values.
     * @param toConvert The list of QScope values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<QScope> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (QScope enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 