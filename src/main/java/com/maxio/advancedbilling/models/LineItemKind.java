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
 * LineItemKind to be used.
 */
public enum LineItemKind {
    BASELINE,

    INITIAL,

    TRIAL,

    QUANTITY_BASED_COMPONENT,

    PREPAID_USAGE_COMPONENT,

    ON_OFF_COMPONENT,

    METERED_COMPONENT,

    EVENT_BASED_COMPONENT,

    COUPON,

    TAX;


    private static TreeMap<String, LineItemKind> valueMap = new TreeMap<>();
    private String value;

    static {
        BASELINE.value = "baseline";
        INITIAL.value = "initial";
        TRIAL.value = "trial";
        QUANTITY_BASED_COMPONENT.value = "quantity_based_component";
        PREPAID_USAGE_COMPONENT.value = "prepaid_usage_component";
        ON_OFF_COMPONENT.value = "on_off_component";
        METERED_COMPONENT.value = "metered_component";
        EVENT_BASED_COMPONENT.value = "event_based_component";
        COUPON.value = "coupon";
        TAX.value = "tax";

        valueMap.put("baseline", BASELINE);
        valueMap.put("initial", INITIAL);
        valueMap.put("trial", TRIAL);
        valueMap.put("quantity_based_component", QUANTITY_BASED_COMPONENT);
        valueMap.put("prepaid_usage_component", PREPAID_USAGE_COMPONENT);
        valueMap.put("on_off_component", ON_OFF_COMPONENT);
        valueMap.put("metered_component", METERED_COMPONENT);
        valueMap.put("event_based_component", EVENT_BASED_COMPONENT);
        valueMap.put("coupon", COUPON);
        valueMap.put("tax", TAX);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static LineItemKind constructFromString(String toConvert) throws IOException {
        LineItemKind enumValue = fromString(toConvert);
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
    public static LineItemKind fromString(String toConvert) {
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
     * Convert list of LineItemKind values to list of string values.
     * @param toConvert The list of LineItemKind values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<LineItemKind> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (LineItemKind enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 