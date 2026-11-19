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
 * WalletHardStopOverflow to be used.
 */
public enum WalletHardStopOverflow {
    DISCARD,

    ALLOW_NEGATIVE;

    private static TreeMap<String, WalletHardStopOverflow> valueMap = new TreeMap<>();
    private String value;

    static {
        DISCARD.value = "discard";
        ALLOW_NEGATIVE.value = "allow_negative";

        valueMap.put("discard", DISCARD);
        valueMap.put("allow_negative", ALLOW_NEGATIVE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static WalletHardStopOverflow constructFromString(String toConvert) throws IOException {
        WalletHardStopOverflow enumValue = fromString(toConvert);
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
    public static WalletHardStopOverflow fromString(String toConvert) {
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
     * Convert list of WalletHardStopOverflow values to list of string values.
     * @param toConvert The list of WalletHardStopOverflow values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<WalletHardStopOverflow> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (WalletHardStopOverflow enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 