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
 * InvoiceEventType to be used.
 */
public enum InvoiceEventType {
    ISSUE_INVOICE,

    APPLY_CREDIT_NOTE,

    APPLY_PAYMENT,

    APPLY_DEBIT_NOTE,

    REFUND_INVOICE,

    VOID_INVOICE,

    VOID_REMAINDER,

    BACKPORT_INVOICE,

    CHANGE_INVOICE_STATUS,

    CHANGE_INVOICE_COLLECTION_METHOD,

    REMOVE_PAYMENT;


    private static TreeMap<String, InvoiceEventType> valueMap = new TreeMap<>();
    private String value;

    static {
        ISSUE_INVOICE.value = "issue_invoice";
        APPLY_CREDIT_NOTE.value = "apply_credit_note";
        APPLY_PAYMENT.value = "apply_payment";
        APPLY_DEBIT_NOTE.value = "apply_debit_note";
        REFUND_INVOICE.value = "refund_invoice";
        VOID_INVOICE.value = "void_invoice";
        VOID_REMAINDER.value = "void_remainder";
        BACKPORT_INVOICE.value = "backport_invoice";
        CHANGE_INVOICE_STATUS.value = "change_invoice_status";
        CHANGE_INVOICE_COLLECTION_METHOD.value = "change_invoice_collection_method";
        REMOVE_PAYMENT.value = "remove_payment";

        valueMap.put("issue_invoice", ISSUE_INVOICE);
        valueMap.put("apply_credit_note", APPLY_CREDIT_NOTE);
        valueMap.put("apply_payment", APPLY_PAYMENT);
        valueMap.put("apply_debit_note", APPLY_DEBIT_NOTE);
        valueMap.put("refund_invoice", REFUND_INVOICE);
        valueMap.put("void_invoice", VOID_INVOICE);
        valueMap.put("void_remainder", VOID_REMAINDER);
        valueMap.put("backport_invoice", BACKPORT_INVOICE);
        valueMap.put("change_invoice_status", CHANGE_INVOICE_STATUS);
        valueMap.put("change_invoice_collection_method", CHANGE_INVOICE_COLLECTION_METHOD);
        valueMap.put("remove_payment", REMOVE_PAYMENT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InvoiceEventType constructFromString(String toConvert) throws IOException {
        InvoiceEventType enumValue = fromString(toConvert);
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
    public static InvoiceEventType fromString(String toConvert) {
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
     * Convert list of InvoiceEventType values to list of string values.
     * @param toConvert The list of InvoiceEventType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InvoiceEventType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InvoiceEventType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 