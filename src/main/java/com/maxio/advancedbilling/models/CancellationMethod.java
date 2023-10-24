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
 * CancellationMethod to be used.
 */
public enum CancellationMethod {
    MERCHANT_UI,

    MERCHANT_API,

    DUNNING,

    BILLING_PORTAL;


    private static TreeMap<String, CancellationMethod> valueMap = new TreeMap<>();
    private String value;

    static {
        MERCHANT_UI.value = "merchant_ui";
        MERCHANT_API.value = "merchant_api";
        DUNNING.value = "dunning";
        BILLING_PORTAL.value = "billing_portal";

        valueMap.put("merchant_ui", MERCHANT_UI);
        valueMap.put("merchant_api", MERCHANT_API);
        valueMap.put("dunning", DUNNING);
        valueMap.put("billing_portal", BILLING_PORTAL);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CancellationMethod constructFromString(String toConvert) throws IOException {
        CancellationMethod enumValue = fromString(toConvert);
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
    public static CancellationMethod fromString(String toConvert) {
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
     * Convert list of CancellationMethod values to list of string values.
     * @param toConvert The list of CancellationMethod values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CancellationMethod> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CancellationMethod enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 