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
 * InvoicePaymentMethodType to be used.
 */
public enum InvoicePaymentMethodType {
    CREDIT_CARD,

    CHECK,

    CASH,

    MONEY_ORDER,

    ACH,

    OTHER;


    private static TreeMap<String, InvoicePaymentMethodType> valueMap = new TreeMap<>();
    private String value;

    static {
        CREDIT_CARD.value = "credit_card";
        CHECK.value = "check";
        CASH.value = "cash";
        MONEY_ORDER.value = "money_order";
        ACH.value = "ach";
        OTHER.value = "other";

        valueMap.put("credit_card", CREDIT_CARD);
        valueMap.put("check", CHECK);
        valueMap.put("cash", CASH);
        valueMap.put("money_order", MONEY_ORDER);
        valueMap.put("ach", ACH);
        valueMap.put("other", OTHER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InvoicePaymentMethodType constructFromString(String toConvert) throws IOException {
        InvoicePaymentMethodType enumValue = fromString(toConvert);
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
    public static InvoicePaymentMethodType fromString(String toConvert) {
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
     * Convert list of InvoicePaymentMethodType values to list of string values.
     * @param toConvert The list of InvoicePaymentMethodType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InvoicePaymentMethodType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InvoicePaymentMethodType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 