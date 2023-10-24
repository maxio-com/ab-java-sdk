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
 * CurrentVault to be used.
 */
public enum CurrentVault {
    ADYEN,

    AUTHORIZENET,

    AVALARA,

    BEANSTREAM,

    BLUE_SNAP,

    BOGUS,

    BRAINTREE_BLUE,

    CHECKOUT,

    CYBERSOURCE,

    ELAVON,

    EWAY,

    EWAY_RAPID_STD,

    FIRSTDATA,

    FORTE,

    GOCARDLESS,

    LITLE,

    MAXIO_PAYMENTS,

    MODUSLINK,

    MONERIS,

    NMI,

    ORBITAL,

    PAYMENT_EXPRESS,

    PIN,

    SQUARE,

    STRIPE_CONNECT,

    TRUST_COMMERCE,

    UNIPAAS;


    private static TreeMap<String, CurrentVault> valueMap = new TreeMap<>();
    private String value;

    static {
        ADYEN.value = "adyen";
        AUTHORIZENET.value = "authorizenet";
        AVALARA.value = "avalara";
        BEANSTREAM.value = "beanstream";
        BLUE_SNAP.value = "blue_snap";
        BOGUS.value = "bogus";
        BRAINTREE_BLUE.value = "braintree_blue";
        CHECKOUT.value = "checkout";
        CYBERSOURCE.value = "cybersource";
        ELAVON.value = "elavon";
        EWAY.value = "eway";
        EWAY_RAPID_STD.value = "eway_rapid_std";
        FIRSTDATA.value = "firstdata";
        FORTE.value = "forte";
        GOCARDLESS.value = "gocardless";
        LITLE.value = "litle";
        MAXIO_PAYMENTS.value = "maxio_payments";
        MODUSLINK.value = "moduslink";
        MONERIS.value = "moneris";
        NMI.value = "nmi";
        ORBITAL.value = "orbital";
        PAYMENT_EXPRESS.value = "payment_express";
        PIN.value = "pin";
        SQUARE.value = "square";
        STRIPE_CONNECT.value = "stripe_connect";
        TRUST_COMMERCE.value = "trust_commerce";
        UNIPAAS.value = "unipaas";

        valueMap.put("adyen", ADYEN);
        valueMap.put("authorizenet", AUTHORIZENET);
        valueMap.put("avalara", AVALARA);
        valueMap.put("beanstream", BEANSTREAM);
        valueMap.put("blue_snap", BLUE_SNAP);
        valueMap.put("bogus", BOGUS);
        valueMap.put("braintree_blue", BRAINTREE_BLUE);
        valueMap.put("checkout", CHECKOUT);
        valueMap.put("cybersource", CYBERSOURCE);
        valueMap.put("elavon", ELAVON);
        valueMap.put("eway", EWAY);
        valueMap.put("eway_rapid_std", EWAY_RAPID_STD);
        valueMap.put("firstdata", FIRSTDATA);
        valueMap.put("forte", FORTE);
        valueMap.put("gocardless", GOCARDLESS);
        valueMap.put("litle", LITLE);
        valueMap.put("maxio_payments", MAXIO_PAYMENTS);
        valueMap.put("moduslink", MODUSLINK);
        valueMap.put("moneris", MONERIS);
        valueMap.put("nmi", NMI);
        valueMap.put("orbital", ORBITAL);
        valueMap.put("payment_express", PAYMENT_EXPRESS);
        valueMap.put("pin", PIN);
        valueMap.put("square", SQUARE);
        valueMap.put("stripe_connect", STRIPE_CONNECT);
        valueMap.put("trust_commerce", TRUST_COMMERCE);
        valueMap.put("unipaas", UNIPAAS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CurrentVault constructFromString(String toConvert) throws IOException {
        CurrentVault enumValue = fromString(toConvert);
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
    public static CurrentVault fromString(String toConvert) {
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
     * Convert list of CurrentVault values to list of string values.
     * @param toConvert The list of CurrentVault values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CurrentVault> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CurrentVault enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 