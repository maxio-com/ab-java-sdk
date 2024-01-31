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
 * InvoiceEventPaymentMethod to be used.
 */
public enum InvoiceEventPaymentMethod {
    APPLE_PAY,

    BANK_ACCOUNT,

    CREDIT_CARD,

    EXTERNAL,

    PAYPAL_ACCOUNT;


    private static TreeMap<String, InvoiceEventPaymentMethod> valueMap = new TreeMap<>();
    private String value;

    static {
        APPLE_PAY.value = "apple_pay";
        BANK_ACCOUNT.value = "bank_account";
        CREDIT_CARD.value = "credit_card";
        EXTERNAL.value = "external";
        PAYPAL_ACCOUNT.value = "paypal_account";

        valueMap.put("apple_pay", APPLE_PAY);
        valueMap.put("bank_account", BANK_ACCOUNT);
        valueMap.put("credit_card", CREDIT_CARD);
        valueMap.put("external", EXTERNAL);
        valueMap.put("paypal_account", PAYPAL_ACCOUNT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InvoiceEventPaymentMethod constructFromString(String toConvert) throws IOException {
        InvoiceEventPaymentMethod enumValue = fromString(toConvert);
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
    public static InvoiceEventPaymentMethod fromString(String toConvert) {
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
     * Convert list of InvoiceEventPaymentMethod values to list of string values.
     * @param toConvert The list of InvoiceEventPaymentMethod values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InvoiceEventPaymentMethod> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InvoiceEventPaymentMethod enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 