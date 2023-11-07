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
 * RecurringScheme to be used.
 */
public enum RecurringScheme {
    DO_NOT_RECUR,

    RECUR_INDEFINITELY,

    RECUR_WITH_DURATION;


    private static TreeMap<String, RecurringScheme> valueMap = new TreeMap<>();
    private String value;

    static {
        DO_NOT_RECUR.value = "do_not_recur";
        RECUR_INDEFINITELY.value = "recur_indefinitely";
        RECUR_WITH_DURATION.value = "recur_with_duration";

        valueMap.put("do_not_recur", DO_NOT_RECUR);
        valueMap.put("recur_indefinitely", RECUR_INDEFINITELY);
        valueMap.put("recur_with_duration", RECUR_WITH_DURATION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static RecurringScheme constructFromString(String toConvert) throws IOException {
        RecurringScheme enumValue = fromString(toConvert);
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
    public static RecurringScheme fromString(String toConvert) {
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
     * Convert list of RecurringScheme values to list of string values.
     * @param toConvert The list of RecurringScheme values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<RecurringScheme> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (RecurringScheme enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 