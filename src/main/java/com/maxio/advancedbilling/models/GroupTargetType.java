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
 * GroupTargetType to be used.
 */
public enum GroupTargetType {
    CUSTOMER,

    SUBSCRIPTION,

    SELF,

    PARENT,

    ELDEST;


    private static TreeMap<String, GroupTargetType> valueMap = new TreeMap<>();
    private String value;

    static {
        CUSTOMER.value = "customer";
        SUBSCRIPTION.value = "subscription";
        SELF.value = "self";
        PARENT.value = "parent";
        ELDEST.value = "eldest";

        valueMap.put("customer", CUSTOMER);
        valueMap.put("subscription", SUBSCRIPTION);
        valueMap.put("self", SELF);
        valueMap.put("parent", PARENT);
        valueMap.put("eldest", ELDEST);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static GroupTargetType constructFromString(String toConvert) throws IOException {
        GroupTargetType enumValue = fromString(toConvert);
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
    public static GroupTargetType fromString(String toConvert) {
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
     * Convert list of GroupTargetType values to list of string values.
     * @param toConvert The list of GroupTargetType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<GroupTargetType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (GroupTargetType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 