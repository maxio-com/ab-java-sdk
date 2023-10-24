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
 * TaxConfigurationKind to be used.
 */
public enum TaxConfigurationKind {
    CUSTOM,

    ENUM_MANAGED_AVALARA,

    ENUM_LINKED_AVALARA,

    ENUM_DIGITAL_RIVER;


    private static TreeMap<String, TaxConfigurationKind> valueMap = new TreeMap<>();
    private String value;

    static {
        CUSTOM.value = "custom";
        ENUM_MANAGED_AVALARA.value = "managed avalara";
        ENUM_LINKED_AVALARA.value = "linked avalara";
        ENUM_DIGITAL_RIVER.value = "digital river";

        valueMap.put("custom", CUSTOM);
        valueMap.put("managed avalara", ENUM_MANAGED_AVALARA);
        valueMap.put("linked avalara", ENUM_LINKED_AVALARA);
        valueMap.put("digital river", ENUM_DIGITAL_RIVER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TaxConfigurationKind constructFromString(String toConvert) throws IOException {
        TaxConfigurationKind enumValue = fromString(toConvert);
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
    public static TaxConfigurationKind fromString(String toConvert) {
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
     * Convert list of TaxConfigurationKind values to list of string values.
     * @param toConvert The list of TaxConfigurationKind values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TaxConfigurationKind> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TaxConfigurationKind enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 