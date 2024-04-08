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
 * InvoiceDiscountSourceType to be used.
 */
public enum InvoiceDiscountSourceType {
    COUPON,

    REFERRAL,

    ENUM_AD_HOC_COUPON;


    private static TreeMap<String, InvoiceDiscountSourceType> valueMap = new TreeMap<>();
    private String value;

    static {
        COUPON.value = "Coupon";
        REFERRAL.value = "Referral";
        ENUM_AD_HOC_COUPON.value = "Ad Hoc Coupon";

        valueMap.put("Coupon", COUPON);
        valueMap.put("Referral", REFERRAL);
        valueMap.put("Ad Hoc Coupon", ENUM_AD_HOC_COUPON);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InvoiceDiscountSourceType constructFromString(String toConvert) throws IOException {
        InvoiceDiscountSourceType enumValue = fromString(toConvert);
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
    public static InvoiceDiscountSourceType fromString(String toConvert) {
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
     * Convert list of InvoiceDiscountSourceType values to list of string values.
     * @param toConvert The list of InvoiceDiscountSourceType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InvoiceDiscountSourceType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InvoiceDiscountSourceType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 