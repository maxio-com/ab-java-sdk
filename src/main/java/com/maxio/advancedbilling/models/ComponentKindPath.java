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
 * ComponentKindPath to be used.
 */
public enum ComponentKindPath {
    METERED_COMPONENTS,

    QUANTITY_BASED_COMPONENTS,

    ON_OFF_COMPONENTS,

    PREPAID_USAGE_COMPONENTS,

    EVENT_BASED_COMPONENTS;


    private static TreeMap<String, ComponentKindPath> valueMap = new TreeMap<>();
    private String value;

    static {
        METERED_COMPONENTS.value = "metered_components";
        QUANTITY_BASED_COMPONENTS.value = "quantity_based_components";
        ON_OFF_COMPONENTS.value = "on_off_components";
        PREPAID_USAGE_COMPONENTS.value = "prepaid_usage_components";
        EVENT_BASED_COMPONENTS.value = "event_based_components";

        valueMap.put("metered_components", METERED_COMPONENTS);
        valueMap.put("quantity_based_components", QUANTITY_BASED_COMPONENTS);
        valueMap.put("on_off_components", ON_OFF_COMPONENTS);
        valueMap.put("prepaid_usage_components", PREPAID_USAGE_COMPONENTS);
        valueMap.put("event_based_components", EVENT_BASED_COMPONENTS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ComponentKindPath constructFromString(String toConvert) throws IOException {
        ComponentKindPath enumValue = fromString(toConvert);
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
    public static ComponentKindPath fromString(String toConvert) {
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
     * Convert list of ComponentKindPath values to list of string values.
     * @param toConvert The list of ComponentKindPath values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ComponentKindPath> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ComponentKindPath enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 