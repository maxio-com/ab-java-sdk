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
 * CardType to be used.
 */
public enum CardType {
    BOGUS,

    VISA,

    MASTER,

    DISCOVER,

    AMERICAN_EXPRESS,

    DINERS_CLUB,

    JCB,

    ENUM_SWITCH,

    SOLO,

    DANKORT,

    MAESTRO,

    LASER,

    FORBRUGSFORENINGEN;


    private static TreeMap<String, CardType> valueMap = new TreeMap<>();
    private String value;

    static {
        BOGUS.value = "bogus";
        VISA.value = "visa";
        MASTER.value = "master";
        DISCOVER.value = "discover";
        AMERICAN_EXPRESS.value = "american_express";
        DINERS_CLUB.value = "diners_club";
        JCB.value = "jcb";
        ENUM_SWITCH.value = "switch";
        SOLO.value = "solo";
        DANKORT.value = "dankort";
        MAESTRO.value = "maestro";
        LASER.value = "laser";
        FORBRUGSFORENINGEN.value = "forbrugsforeningen";

        valueMap.put("bogus", BOGUS);
        valueMap.put("visa", VISA);
        valueMap.put("master", MASTER);
        valueMap.put("discover", DISCOVER);
        valueMap.put("american_express", AMERICAN_EXPRESS);
        valueMap.put("diners_club", DINERS_CLUB);
        valueMap.put("jcb", JCB);
        valueMap.put("switch", ENUM_SWITCH);
        valueMap.put("solo", SOLO);
        valueMap.put("dankort", DANKORT);
        valueMap.put("maestro", MAESTRO);
        valueMap.put("laser", LASER);
        valueMap.put("forbrugsforeningen", FORBRUGSFORENINGEN);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CardType constructFromString(String toConvert) throws IOException {
        CardType enumValue = fromString(toConvert);
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
    public static CardType fromString(String toConvert) {
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
     * Convert list of CardType values to list of string values.
     * @param toConvert The list of CardType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CardType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CardType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 