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
 * GroupType to be used.
 */
public enum GroupType {
    SINGLE_CUSTOMER,

    MULTIPLE_CUSTOMERS;


    private static TreeMap<String, GroupType> valueMap = new TreeMap<>();
    private String value;

    static {
        SINGLE_CUSTOMER.value = "single_customer";
        MULTIPLE_CUSTOMERS.value = "multiple_customers";

        valueMap.put("single_customer", SINGLE_CUSTOMER);
        valueMap.put("multiple_customers", MULTIPLE_CUSTOMERS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static GroupType constructFromString(String toConvert) throws IOException {
        GroupType enumValue = fromString(toConvert);
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
    public static GroupType fromString(String toConvert) {
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
     * Convert list of GroupType values to list of string values.
     * @param toConvert The list of GroupType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<GroupType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (GroupType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 