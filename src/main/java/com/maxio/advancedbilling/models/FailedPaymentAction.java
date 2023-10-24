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
 * FailedPaymentAction to be used.
 */
public enum FailedPaymentAction {
    LEAVE_OPEN_INVOICE,

    ROLLBACK_TO_PENDING,

    INITIATE_DUNNING;


    private static TreeMap<String, FailedPaymentAction> valueMap = new TreeMap<>();
    private String value;

    static {
        LEAVE_OPEN_INVOICE.value = "leave_open_invoice";
        ROLLBACK_TO_PENDING.value = "rollback_to_pending";
        INITIATE_DUNNING.value = "initiate_dunning";

        valueMap.put("leave_open_invoice", LEAVE_OPEN_INVOICE);
        valueMap.put("rollback_to_pending", ROLLBACK_TO_PENDING);
        valueMap.put("initiate_dunning", INITIATE_DUNNING);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static FailedPaymentAction constructFromString(String toConvert) throws IOException {
        FailedPaymentAction enumValue = fromString(toConvert);
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
    public static FailedPaymentAction fromString(String toConvert) {
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
     * Convert list of FailedPaymentAction values to list of string values.
     * @param toConvert The list of FailedPaymentAction values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<FailedPaymentAction> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (FailedPaymentAction enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 