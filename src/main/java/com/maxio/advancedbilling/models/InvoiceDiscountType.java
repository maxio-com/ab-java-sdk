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
 * InvoiceDiscountType to be used.
 */
public enum InvoiceDiscountType {
    PERCENTAGE,

    FLAT_AMOUNT,

    ROLLOVER;


    private static TreeMap<String, InvoiceDiscountType> valueMap = new TreeMap<>();
    private String value;

    static {
        PERCENTAGE.value = "percentage";
        FLAT_AMOUNT.value = "flat_amount";
        ROLLOVER.value = "rollover";

        valueMap.put("percentage", PERCENTAGE);
        valueMap.put("flat_amount", FLAT_AMOUNT);
        valueMap.put("rollover", ROLLOVER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InvoiceDiscountType constructFromString(String toConvert) throws IOException {
        InvoiceDiscountType enumValue = fromString(toConvert);
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
    public static InvoiceDiscountType fromString(String toConvert) {
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
     * Convert list of InvoiceDiscountType values to list of string values.
     * @param toConvert The list of InvoiceDiscountType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InvoiceDiscountType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InvoiceDiscountType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 