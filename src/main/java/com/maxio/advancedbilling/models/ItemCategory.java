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
 * ItemCategory to be used.
 */
public enum ItemCategory {
    ENUM_BUSINESS_SOFTWARE,

    ENUM_CONSUMER_SOFTWARE,

    ENUM_DIGITAL_SERVICES,

    ENUM_PHYSICAL_GOODS,

    OTHER;


    private static TreeMap<String, ItemCategory> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_BUSINESS_SOFTWARE.value = "Business Software";
        ENUM_CONSUMER_SOFTWARE.value = "Consumer Software";
        ENUM_DIGITAL_SERVICES.value = "Digital Services";
        ENUM_PHYSICAL_GOODS.value = "Physical Goods";
        OTHER.value = "Other";

        valueMap.put("Business Software", ENUM_BUSINESS_SOFTWARE);
        valueMap.put("Consumer Software", ENUM_CONSUMER_SOFTWARE);
        valueMap.put("Digital Services", ENUM_DIGITAL_SERVICES);
        valueMap.put("Physical Goods", ENUM_PHYSICAL_GOODS);
        valueMap.put("Other", OTHER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ItemCategory constructFromString(String toConvert) throws IOException {
        ItemCategory enumValue = fromString(toConvert);
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
    public static ItemCategory fromString(String toConvert) {
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
     * Convert list of ItemCategory values to list of string values.
     * @param toConvert The list of ItemCategory values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ItemCategory> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ItemCategory enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 