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
 * InvoiceRole to be used.
 */
public enum InvoiceRole {
    UNSET,

    SIGNUP,

    RENEWAL,

    USAGE,

    REACTIVATION,

    PRORATION,

    MIGRATION,

    ADHOC,

    BACKPORT,

    BACKPORTBALANCERECONCILIATION;


    private static TreeMap<String, InvoiceRole> valueMap = new TreeMap<>();
    private String value;

    static {
        UNSET.value = "unset";
        SIGNUP.value = "signup";
        RENEWAL.value = "renewal";
        USAGE.value = "usage";
        REACTIVATION.value = "reactivation";
        PRORATION.value = "proration";
        MIGRATION.value = "migration";
        ADHOC.value = "adhoc";
        BACKPORT.value = "backport";
        BACKPORTBALANCERECONCILIATION.value = "backport-balance-reconciliation";

        valueMap.put("unset", UNSET);
        valueMap.put("signup", SIGNUP);
        valueMap.put("renewal", RENEWAL);
        valueMap.put("usage", USAGE);
        valueMap.put("reactivation", REACTIVATION);
        valueMap.put("proration", PRORATION);
        valueMap.put("migration", MIGRATION);
        valueMap.put("adhoc", ADHOC);
        valueMap.put("backport", BACKPORT);
        valueMap.put("backport-balance-reconciliation", BACKPORTBALANCERECONCILIATION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InvoiceRole constructFromString(String toConvert) throws IOException {
        InvoiceRole enumValue = fromString(toConvert);
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
    public static InvoiceRole fromString(String toConvert) {
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
     * Convert list of InvoiceRole values to list of string values.
     * @param toConvert The list of InvoiceRole values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InvoiceRole> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InvoiceRole enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 