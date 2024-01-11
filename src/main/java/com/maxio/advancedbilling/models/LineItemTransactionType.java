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
 * LineItemTransactionType to be used.
 */
public enum LineItemTransactionType {
    CHARGE,

    CREDIT,

    ADJUSTMENT,

    PAYMENT,

    REFUND,

    INFO_TRANSACTION,

    PAYMENT_AUTHORIZATION;


    private static TreeMap<String, LineItemTransactionType> valueMap = new TreeMap<>();
    private String value;

    static {
        CHARGE.value = "charge";
        CREDIT.value = "credit";
        ADJUSTMENT.value = "adjustment";
        PAYMENT.value = "payment";
        REFUND.value = "refund";
        INFO_TRANSACTION.value = "info_transaction";
        PAYMENT_AUTHORIZATION.value = "payment_authorization";

        valueMap.put("charge", CHARGE);
        valueMap.put("credit", CREDIT);
        valueMap.put("adjustment", ADJUSTMENT);
        valueMap.put("payment", PAYMENT);
        valueMap.put("refund", REFUND);
        valueMap.put("info_transaction", INFO_TRANSACTION);
        valueMap.put("payment_authorization", PAYMENT_AUTHORIZATION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static LineItemTransactionType constructFromString(String toConvert) throws IOException {
        LineItemTransactionType enumValue = fromString(toConvert);
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
    public static LineItemTransactionType fromString(String toConvert) {
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
     * Convert list of LineItemTransactionType values to list of string values.
     * @param toConvert The list of LineItemTransactionType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<LineItemTransactionType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (LineItemTransactionType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 