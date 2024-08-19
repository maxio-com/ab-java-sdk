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
 * CreditCardVault to be used.
 */
public enum CreditCardVault {
    ADYEN,

    AUTHORIZENET,

    BEANSTREAM,

    BLUE_SNAP,

    BOGUS,

    BRAINTREE1,

    BRAINTREE_BLUE,

    CHECKOUT,

    CYBERSOURCE,

    ELAVON,

    EWAY,

    EWAY_RAPID,

    EWAY_RAPID_STD,

    FIRSTDATA,

    FORTE,

    LITLE,

    MAXIO_PAYMENTS,

    MAXP,

    MODUSLINK,

    MONERIS,

    NMI,

    ORBITAL,

    PAYMENT_EXPRESS,

    PAYMILL,

    PAYPAL,

    PAYPAL_COMPLETE,

    PIN,

    SQUARE,

    STRIPE,

    STRIPE_CONNECT,

    TRUST_COMMERCE,

    UNIPAAS,

    WIRECARD;


    private static TreeMap<String, CreditCardVault> valueMap = new TreeMap<>();
    private String value;

    static {
        ADYEN.value = "adyen";
        AUTHORIZENET.value = "authorizenet";
        BEANSTREAM.value = "beanstream";
        BLUE_SNAP.value = "blue_snap";
        BOGUS.value = "bogus";
        BRAINTREE1.value = "braintree1";
        BRAINTREE_BLUE.value = "braintree_blue";
        CHECKOUT.value = "checkout";
        CYBERSOURCE.value = "cybersource";
        ELAVON.value = "elavon";
        EWAY.value = "eway";
        EWAY_RAPID.value = "eway_rapid";
        EWAY_RAPID_STD.value = "eway_rapid_std";
        FIRSTDATA.value = "firstdata";
        FORTE.value = "forte";
        LITLE.value = "litle";
        MAXIO_PAYMENTS.value = "maxio_payments";
        MAXP.value = "maxp";
        MODUSLINK.value = "moduslink";
        MONERIS.value = "moneris";
        NMI.value = "nmi";
        ORBITAL.value = "orbital";
        PAYMENT_EXPRESS.value = "payment_express";
        PAYMILL.value = "paymill";
        PAYPAL.value = "paypal";
        PAYPAL_COMPLETE.value = "paypal_complete";
        PIN.value = "pin";
        SQUARE.value = "square";
        STRIPE.value = "stripe";
        STRIPE_CONNECT.value = "stripe_connect";
        TRUST_COMMERCE.value = "trust_commerce";
        UNIPAAS.value = "unipaas";
        WIRECARD.value = "wirecard";

        valueMap.put("adyen", ADYEN);
        valueMap.put("authorizenet", AUTHORIZENET);
        valueMap.put("beanstream", BEANSTREAM);
        valueMap.put("blue_snap", BLUE_SNAP);
        valueMap.put("bogus", BOGUS);
        valueMap.put("braintree1", BRAINTREE1);
        valueMap.put("braintree_blue", BRAINTREE_BLUE);
        valueMap.put("checkout", CHECKOUT);
        valueMap.put("cybersource", CYBERSOURCE);
        valueMap.put("elavon", ELAVON);
        valueMap.put("eway", EWAY);
        valueMap.put("eway_rapid", EWAY_RAPID);
        valueMap.put("eway_rapid_std", EWAY_RAPID_STD);
        valueMap.put("firstdata", FIRSTDATA);
        valueMap.put("forte", FORTE);
        valueMap.put("litle", LITLE);
        valueMap.put("maxio_payments", MAXIO_PAYMENTS);
        valueMap.put("maxp", MAXP);
        valueMap.put("moduslink", MODUSLINK);
        valueMap.put("moneris", MONERIS);
        valueMap.put("nmi", NMI);
        valueMap.put("orbital", ORBITAL);
        valueMap.put("payment_express", PAYMENT_EXPRESS);
        valueMap.put("paymill", PAYMILL);
        valueMap.put("paypal", PAYPAL);
        valueMap.put("paypal_complete", PAYPAL_COMPLETE);
        valueMap.put("pin", PIN);
        valueMap.put("square", SQUARE);
        valueMap.put("stripe", STRIPE);
        valueMap.put("stripe_connect", STRIPE_CONNECT);
        valueMap.put("trust_commerce", TRUST_COMMERCE);
        valueMap.put("unipaas", UNIPAAS);
        valueMap.put("wirecard", WIRECARD);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CreditCardVault constructFromString(String toConvert) throws IOException {
        CreditCardVault enumValue = fromString(toConvert);
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
    public static CreditCardVault fromString(String toConvert) {
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
     * Convert list of CreditCardVault values to list of string values.
     * @param toConvert The list of CreditCardVault values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CreditCardVault> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CreditCardVault enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 