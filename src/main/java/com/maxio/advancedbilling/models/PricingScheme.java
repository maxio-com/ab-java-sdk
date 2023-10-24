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
 * PricingScheme to be used.
 */
public enum PricingScheme {
    STAIRSTEP,

    VOLUME,

    PER_UNIT,

    TIERED;


    private static TreeMap<String, PricingScheme> valueMap = new TreeMap<>();
    private String value;

    static {
        STAIRSTEP.value = "stairstep";
        VOLUME.value = "volume";
        PER_UNIT.value = "per_unit";
        TIERED.value = "tiered";

        valueMap.put("stairstep", STAIRSTEP);
        valueMap.put("volume", VOLUME);
        valueMap.put("per_unit", PER_UNIT);
        valueMap.put("tiered", TIERED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PricingScheme constructFromString(String toConvert) throws IOException {
        PricingScheme enumValue = fromString(toConvert);
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
    public static PricingScheme fromString(String toConvert) {
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
     * Convert list of PricingScheme values to list of string values.
     * @param toConvert The list of PricingScheme values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PricingScheme> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PricingScheme enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 