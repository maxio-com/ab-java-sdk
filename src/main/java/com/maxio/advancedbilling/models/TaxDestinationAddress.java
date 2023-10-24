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
 * TaxDestinationAddress to be used.
 */
public enum TaxDestinationAddress {
    SHIPPING_THEN_BILLING,

    BILLING_THEN_SHIPPING,

    SHIPPING_ONLY,

    BILLING_ONLY;


    private static TreeMap<String, TaxDestinationAddress> valueMap = new TreeMap<>();
    private String value;

    static {
        SHIPPING_THEN_BILLING.value = "shipping_then_billing";
        BILLING_THEN_SHIPPING.value = "billing_then_shipping";
        SHIPPING_ONLY.value = "shipping_only";
        BILLING_ONLY.value = "billing_only";

        valueMap.put("shipping_then_billing", SHIPPING_THEN_BILLING);
        valueMap.put("billing_then_shipping", BILLING_THEN_SHIPPING);
        valueMap.put("shipping_only", SHIPPING_ONLY);
        valueMap.put("billing_only", BILLING_ONLY);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TaxDestinationAddress constructFromString(String toConvert) throws IOException {
        TaxDestinationAddress enumValue = fromString(toConvert);
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
    public static TaxDestinationAddress fromString(String toConvert) {
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
     * Convert list of TaxDestinationAddress values to list of string values.
     * @param toConvert The list of TaxDestinationAddress values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TaxDestinationAddress> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TaxDestinationAddress enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 