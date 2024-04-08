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
 * CreateSignupProformaPreviewInclude to be used.
 */
public enum CreateSignupProformaPreviewInclude {
    NEXT_PROFORMA_INVOICE;


    private static TreeMap<String, CreateSignupProformaPreviewInclude> valueMap = new TreeMap<>();
    private String value;

    static {
        NEXT_PROFORMA_INVOICE.value = "next_proforma_invoice";

        valueMap.put("next_proforma_invoice", NEXT_PROFORMA_INVOICE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CreateSignupProformaPreviewInclude constructFromString(String toConvert) throws IOException {
        CreateSignupProformaPreviewInclude enumValue = fromString(toConvert);
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
    public static CreateSignupProformaPreviewInclude fromString(String toConvert) {
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
     * Convert list of CreateSignupProformaPreviewInclude values to list of string values.
     * @param toConvert The list of CreateSignupProformaPreviewInclude values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CreateSignupProformaPreviewInclude> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CreateSignupProformaPreviewInclude enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 