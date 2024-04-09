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
 * AllocationPreviewLineItemKind to be used.
 */
public enum AllocationPreviewLineItemKind {
    QUANTITY_BASED_COMPONENT,

    ON_OFF_COMPONENT,

    COUPON,

    TAX;


    private static TreeMap<String, AllocationPreviewLineItemKind> valueMap = new TreeMap<>();
    private String value;

    static {
        QUANTITY_BASED_COMPONENT.value = "quantity_based_component";
        ON_OFF_COMPONENT.value = "on_off_component";
        COUPON.value = "coupon";
        TAX.value = "tax";

        valueMap.put("quantity_based_component", QUANTITY_BASED_COMPONENT);
        valueMap.put("on_off_component", ON_OFF_COMPONENT);
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
    public static AllocationPreviewLineItemKind constructFromString(String toConvert) throws IOException {
        AllocationPreviewLineItemKind enumValue = fromString(toConvert);
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
    public static AllocationPreviewLineItemKind fromString(String toConvert) {
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
     * Convert list of AllocationPreviewLineItemKind values to list of string values.
     * @param toConvert The list of AllocationPreviewLineItemKind values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AllocationPreviewLineItemKind> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AllocationPreviewLineItemKind enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 