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
 * CreatePrepaymentMethod to be used.
 */
public enum CreatePrepaymentMethod {
    CHECK,

    CASH,

    MONEY_ORDER,

    ACH,

    PAYPAL_ACCOUNT,

    CREDIT_CARD,

    CREDIT_CARD_ON_FILE,

    OTHER;


    private static TreeMap<String, CreatePrepaymentMethod> valueMap = new TreeMap<>();
    private String value;

    static {
        CHECK.value = "check";
        CASH.value = "cash";
        MONEY_ORDER.value = "money_order";
        ACH.value = "ach";
        PAYPAL_ACCOUNT.value = "paypal_account";
        CREDIT_CARD.value = "credit_card";
        CREDIT_CARD_ON_FILE.value = "credit_card_on_file";
        OTHER.value = "other";

        valueMap.put("check", CHECK);
        valueMap.put("cash", CASH);
        valueMap.put("money_order", MONEY_ORDER);
        valueMap.put("ach", ACH);
        valueMap.put("paypal_account", PAYPAL_ACCOUNT);
        valueMap.put("credit_card", CREDIT_CARD);
        valueMap.put("credit_card_on_file", CREDIT_CARD_ON_FILE);
        valueMap.put("other", OTHER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CreatePrepaymentMethod constructFromString(String toConvert) throws IOException {
        CreatePrepaymentMethod enumValue = fromString(toConvert);
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
    public static CreatePrepaymentMethod fromString(String toConvert) {
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
     * Convert list of CreatePrepaymentMethod values to list of string values.
     * @param toConvert The list of CreatePrepaymentMethod values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CreatePrepaymentMethod> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CreatePrepaymentMethod enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 