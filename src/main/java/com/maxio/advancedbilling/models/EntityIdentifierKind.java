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
 * EntityIdentifierKind to be used.
 */
public enum EntityIdentifierKind {
    VAT_EU,

    NATIONAL_TAX,

    COMPANY_REG,

    GLN,

    DUNS,

    LEI;

    private static TreeMap<String, EntityIdentifierKind> valueMap = new TreeMap<>();
    private String value;

    static {
        VAT_EU.value = "vat_eu";
        NATIONAL_TAX.value = "national_tax";
        COMPANY_REG.value = "company_reg";
        GLN.value = "gln";
        DUNS.value = "duns";
        LEI.value = "lei";

        valueMap.put("vat_eu", VAT_EU);
        valueMap.put("national_tax", NATIONAL_TAX);
        valueMap.put("company_reg", COMPANY_REG);
        valueMap.put("gln", GLN);
        valueMap.put("duns", DUNS);
        valueMap.put("lei", LEI);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static EntityIdentifierKind constructFromString(String toConvert) throws IOException {
        EntityIdentifierKind enumValue = fromString(toConvert);
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
    public static EntityIdentifierKind fromString(String toConvert) {
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
     * Convert list of EntityIdentifierKind values to list of string values.
     * @param toConvert The list of EntityIdentifierKind values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<EntityIdentifierKind> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (EntityIdentifierKind enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 