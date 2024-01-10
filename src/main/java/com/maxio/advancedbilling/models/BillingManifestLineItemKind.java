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
 * BillingManifestLineItemKind to be used.
 */
public enum BillingManifestLineItemKind {
    BASELINE,

    INITIAL,

    TRIAL,

    COUPON,

    COMPONENT,

    TAX;


    private static TreeMap<String, BillingManifestLineItemKind> valueMap = new TreeMap<>();
    private String value;

    static {
        BASELINE.value = "baseline";
        INITIAL.value = "initial";
        TRIAL.value = "trial";
        COUPON.value = "coupon";
        COMPONENT.value = "component";
        TAX.value = "tax";

        valueMap.put("baseline", BASELINE);
        valueMap.put("initial", INITIAL);
        valueMap.put("trial", TRIAL);
        valueMap.put("coupon", COUPON);
        valueMap.put("component", COMPONENT);
        valueMap.put("tax", TAX);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static BillingManifestLineItemKind constructFromString(String toConvert) throws IOException {
        BillingManifestLineItemKind enumValue = fromString(toConvert);
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
    public static BillingManifestLineItemKind fromString(String toConvert) {
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
     * Convert list of BillingManifestLineItemKind values to list of string values.
     * @param toConvert The list of BillingManifestLineItemKind values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<BillingManifestLineItemKind> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (BillingManifestLineItemKind enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 