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
 * PaymentCollectionMethodAllocateComponents to be used.
 */
public enum PaymentCollectionMethodAllocateComponents {
    AUTOMATIC,

    REMITTANCE,

    PREPAID,

    INVOICE;


    private static TreeMap<String, PaymentCollectionMethodAllocateComponents> valueMap = new TreeMap<>();
    private String value;

    static {
        AUTOMATIC.value = "automatic";
        REMITTANCE.value = "remittance";
        PREPAID.value = "prepaid";
        INVOICE.value = "invoice";

        valueMap.put("automatic", AUTOMATIC);
        valueMap.put("remittance", REMITTANCE);
        valueMap.put("prepaid", PREPAID);
        valueMap.put("invoice", INVOICE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PaymentCollectionMethodAllocateComponents constructFromString(String toConvert) throws IOException {
        PaymentCollectionMethodAllocateComponents enumValue = fromString(toConvert);
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
    public static PaymentCollectionMethodAllocateComponents fromString(String toConvert) {
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
     * Convert list of PaymentCollectionMethodAllocateComponents values to list of string values.
     * @param toConvert The list of PaymentCollectionMethodAllocateComponents values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PaymentCollectionMethodAllocateComponents> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PaymentCollectionMethodAllocateComponents enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 