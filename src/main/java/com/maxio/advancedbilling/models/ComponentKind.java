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
 * ComponentKind to be used.
 */
public enum ComponentKind {
    METERED_COMPONENT,

    QUANTITY_BASED_COMPONENT,

    ON_OFF_COMPONENT,

    PREPAID_USAGE_COMPONENT,

    EVENT_BASED_COMPONENT;


    private static TreeMap<String, ComponentKind> valueMap = new TreeMap<>();
    private String value;

    static {
        METERED_COMPONENT.value = "metered_component";
        QUANTITY_BASED_COMPONENT.value = "quantity_based_component";
        ON_OFF_COMPONENT.value = "on_off_component";
        PREPAID_USAGE_COMPONENT.value = "prepaid_usage_component";
        EVENT_BASED_COMPONENT.value = "event_based_component";

        valueMap.put("metered_component", METERED_COMPONENT);
        valueMap.put("quantity_based_component", QUANTITY_BASED_COMPONENT);
        valueMap.put("on_off_component", ON_OFF_COMPONENT);
        valueMap.put("prepaid_usage_component", PREPAID_USAGE_COMPONENT);
        valueMap.put("event_based_component", EVENT_BASED_COMPONENT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ComponentKind constructFromString(String toConvert) throws IOException {
        ComponentKind enumValue = fromString(toConvert);
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
    public static ComponentKind fromString(String toConvert) {
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
     * Convert list of ComponentKind values to list of string values.
     * @param toConvert The list of ComponentKind values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ComponentKind> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ComponentKind enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 