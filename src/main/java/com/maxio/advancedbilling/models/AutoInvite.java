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
 * AutoInvite to be used.
 */
public enum AutoInvite {
    /**
     * Do not send the invitation email.
     */
    NO,

    /**
     * Automatically send the invitation email.
     */
    YES;


    private static TreeMap<Integer, AutoInvite> valueMap = new TreeMap<>();
    private Integer value;

    static {
        NO.value = 0;
        YES.value = 1;

        valueMap.put(0, NO);
        valueMap.put(1, YES);
    }

    /**
     * Returns the enum member associated with the given integer value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given integer value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static AutoInvite constructFromInteger(Integer toConvert) throws IOException {
        AutoInvite enumValue = fromInteger(toConvert);
        if (enumValue == null)
        {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given integer value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given integer value.
     */
    public static AutoInvite fromInteger(Integer toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the integer value associated with the enum member.
     * @return The integer value against enum member.
     */
    @JsonValue
    public Integer value() {
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
     * Convert list of AutoInvite values to list of integer values.
     * @param toConvert The list of AutoInvite values to convert.
     * @return List of representative integer values.
     */
    public static List<Integer> toValue(List<AutoInvite> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<Integer> convertedValues = new ArrayList<>();
        for (AutoInvite enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 