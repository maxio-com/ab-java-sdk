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
 * ListProductsPricePointsInclude to be used.
 */
public enum ListProductsPricePointsInclude {
    CURRENCY_PRICES;


    private static TreeMap<String, ListProductsPricePointsInclude> valueMap = new TreeMap<>();
    private String value;

    static {
        CURRENCY_PRICES.value = "currency_prices";

        valueMap.put("currency_prices", CURRENCY_PRICES);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ListProductsPricePointsInclude constructFromString(String toConvert) throws IOException {
        ListProductsPricePointsInclude enumValue = fromString(toConvert);
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
    public static ListProductsPricePointsInclude fromString(String toConvert) {
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
     * Convert list of ListProductsPricePointsInclude values to list of string values.
     * @param toConvert The list of ListProductsPricePointsInclude values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ListProductsPricePointsInclude> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ListProductsPricePointsInclude enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 