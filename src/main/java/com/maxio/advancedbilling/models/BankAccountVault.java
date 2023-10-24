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
 * BankAccountVault to be used.
 */
public enum BankAccountVault {
    BOGUS,

    AUTHORIZENET,

    STRIPE_CONNECT,

    BRAINTREE_BLUE,

    GOCARDLESS;


    private static TreeMap<String, BankAccountVault> valueMap = new TreeMap<>();
    private String value;

    static {
        BOGUS.value = "bogus";
        AUTHORIZENET.value = "authorizenet";
        STRIPE_CONNECT.value = "stripe_connect";
        BRAINTREE_BLUE.value = "braintree_blue";
        GOCARDLESS.value = "gocardless";

        valueMap.put("bogus", BOGUS);
        valueMap.put("authorizenet", AUTHORIZENET);
        valueMap.put("stripe_connect", STRIPE_CONNECT);
        valueMap.put("braintree_blue", BRAINTREE_BLUE);
        valueMap.put("gocardless", GOCARDLESS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static BankAccountVault constructFromString(String toConvert) throws IOException {
        BankAccountVault enumValue = fromString(toConvert);
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
    public static BankAccountVault fromString(String toConvert) {
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
     * Convert list of BankAccountVault values to list of string values.
     * @param toConvert The list of BankAccountVault values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<BankAccountVault> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (BankAccountVault enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 