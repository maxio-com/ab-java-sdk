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
 * ProformaInvoiceRole to be used.
 */
public enum ProformaInvoiceRole {
    UNSET,

    PROFORMA,

    PROFORMA_ADHOC,

    PROFORMA_AUTOMATIC;


    private static TreeMap<String, ProformaInvoiceRole> valueMap = new TreeMap<>();
    private String value;

    static {
        UNSET.value = "unset";
        PROFORMA.value = "proforma";
        PROFORMA_ADHOC.value = "proforma_adhoc";
        PROFORMA_AUTOMATIC.value = "proforma_automatic";

        valueMap.put("unset", UNSET);
        valueMap.put("proforma", PROFORMA);
        valueMap.put("proforma_adhoc", PROFORMA_ADHOC);
        valueMap.put("proforma_automatic", PROFORMA_AUTOMATIC);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ProformaInvoiceRole constructFromString(String toConvert) throws IOException {
        ProformaInvoiceRole enumValue = fromString(toConvert);
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
    public static ProformaInvoiceRole fromString(String toConvert) {
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
     * Convert list of ProformaInvoiceRole values to list of string values.
     * @param toConvert The list of ProformaInvoiceRole values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ProformaInvoiceRole> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ProformaInvoiceRole enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 