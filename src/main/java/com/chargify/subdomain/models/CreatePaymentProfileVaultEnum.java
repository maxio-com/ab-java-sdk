/*
 * MaxioAdvancedBillingFormerlyChargifyAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.chargify.subdomain.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * CreatePaymentProfileVaultEnum to be used.
 */
public enum CreatePaymentProfileVaultEnum {
    BOGUS,

    AUTHORIZENET,

    AUTHORIZENET_CIM,

    BEANSTREAM,

    BRAINTREE_BLUE,

    CYBERSOURCE,

    ELAVON,

    EWAY,

    EWAY_RAPID_STD,

    FIRSTDATA,

    FORTE,

    GOCARDLESS,

    LITLE,

    MONERIS,

    ORBITAL,

    PAYMENT_EXPRESS,

    PAYMILL,

    PIN,

    SQUARE,

    STRIPE_CONNECT,

    TRUST_COMMERCE,

    WIRECARD,

    CHECKOUT;


    private static TreeMap<String, CreatePaymentProfileVaultEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        BOGUS.value = "bogus";
        AUTHORIZENET.value = "authorizenet";
        AUTHORIZENET_CIM.value = "authorizenet_cim";
        BEANSTREAM.value = "beanstream";
        BRAINTREE_BLUE.value = "braintree_blue";
        CYBERSOURCE.value = "cybersource";
        ELAVON.value = "elavon";
        EWAY.value = "eway";
        EWAY_RAPID_STD.value = "eway_rapid_std";
        FIRSTDATA.value = "firstdata";
        FORTE.value = "forte";
        GOCARDLESS.value = "gocardless";
        LITLE.value = "litle";
        MONERIS.value = "moneris";
        ORBITAL.value = "orbital";
        PAYMENT_EXPRESS.value = "payment_express";
        PAYMILL.value = "paymill";
        PIN.value = "pin";
        SQUARE.value = "square";
        STRIPE_CONNECT.value = "stripe_connect";
        TRUST_COMMERCE.value = "trust_commerce";
        WIRECARD.value = "wirecard";
        CHECKOUT.value = "checkout";

        valueMap.put("bogus", BOGUS);
        valueMap.put("authorizenet", AUTHORIZENET);
        valueMap.put("authorizenet_cim", AUTHORIZENET_CIM);
        valueMap.put("beanstream", BEANSTREAM);
        valueMap.put("braintree_blue", BRAINTREE_BLUE);
        valueMap.put("cybersource", CYBERSOURCE);
        valueMap.put("elavon", ELAVON);
        valueMap.put("eway", EWAY);
        valueMap.put("eway_rapid_std", EWAY_RAPID_STD);
        valueMap.put("firstdata", FIRSTDATA);
        valueMap.put("forte", FORTE);
        valueMap.put("gocardless", GOCARDLESS);
        valueMap.put("litle", LITLE);
        valueMap.put("moneris", MONERIS);
        valueMap.put("orbital", ORBITAL);
        valueMap.put("payment_express", PAYMENT_EXPRESS);
        valueMap.put("paymill", PAYMILL);
        valueMap.put("pin", PIN);
        valueMap.put("square", SQUARE);
        valueMap.put("stripe_connect", STRIPE_CONNECT);
        valueMap.put("trust_commerce", TRUST_COMMERCE);
        valueMap.put("wirecard", WIRECARD);
        valueMap.put("checkout", CHECKOUT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CreatePaymentProfileVaultEnum constructFromString(String toConvert) throws IOException {
        CreatePaymentProfileVaultEnum enumValue = fromString(toConvert);
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
    public static CreatePaymentProfileVaultEnum fromString(String toConvert) {
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
     * Convert list of CreatePaymentProfileVaultEnum values to list of string values.
     * @param toConvert The list of CreatePaymentProfileVaultEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CreatePaymentProfileVaultEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CreatePaymentProfileVaultEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 