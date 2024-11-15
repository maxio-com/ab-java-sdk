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
 * CompoundingStrategy1 to be used.
 */
public enum CompoundingStrategy1 {
    COMPOUND,

    FULLPRICE;


    private static TreeMap<String, CompoundingStrategy1> valueMap = new TreeMap<>();
    private String value;

    static {
        COMPOUND.value = "compound";
        FULLPRICE.value = "full-price";

        valueMap.put("compound", COMPOUND);
        valueMap.put("full-price", FULLPRICE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CompoundingStrategy1 constructFromString(String toConvert) throws IOException {
        CompoundingStrategy1 enumValue = fromString(toConvert);
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
    public static CompoundingStrategy1 fromString(String toConvert) {
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
     * Convert list of CompoundingStrategy1 values to list of string values.
     * @param toConvert The list of CompoundingStrategy1 values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CompoundingStrategy1> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CompoundingStrategy1 enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 