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
    VISA,

    MASTER,

    ELO,

    CABAL,

    ALELO,

    DISCOVER,

    AMERICAN_EXPRESS,

    NARANJA,

    DINERS_CLUB,

    JCB,

    DANKORT,

    MAESTRO,

    MAESTRO_NO_LUHN,

    FORBRUGSFORENINGEN,

    SODEXO,

    ALIA,

    VR,

    UNIONPAY,

    CARNET,

    CARTES_BANCAIRES,

    OLIMPICA,

    CREDITEL,

    CONFIABLE,

    SYNCHRONY,

    ROUTEX,

    MADA,

    BP_PLUS,

    PASSCARD,

    EDENRED,

    ANDA,

    TARJETAD,

    HIPERCARD,

    BOGUS,

    ENUM_SWITCH,

    SOLO,

    LASER;


    private static TreeMap<String, CardType> valueMap = new TreeMap<>();
    private String value;

    static {
        VISA.value = "visa";
        MASTER.value = "master";
        ELO.value = "elo";
        CABAL.value = "cabal";
        ALELO.value = "alelo";
        DISCOVER.value = "discover";
        AMERICAN_EXPRESS.value = "american_express";
        NARANJA.value = "naranja";
        DINERS_CLUB.value = "diners_club";
        JCB.value = "jcb";
        DANKORT.value = "dankort";
        MAESTRO.value = "maestro";
        MAESTRO_NO_LUHN.value = "maestro_no_luhn";
        FORBRUGSFORENINGEN.value = "forbrugsforeningen";
        SODEXO.value = "sodexo";
        ALIA.value = "alia";
        VR.value = "vr";
        UNIONPAY.value = "unionpay";
        CARNET.value = "carnet";
        CARTES_BANCAIRES.value = "cartes_bancaires";
        OLIMPICA.value = "olimpica";
        CREDITEL.value = "creditel";
        CONFIABLE.value = "confiable";
        SYNCHRONY.value = "synchrony";
        ROUTEX.value = "routex";
        MADA.value = "mada";
        BP_PLUS.value = "bp_plus";
        PASSCARD.value = "passcard";
        EDENRED.value = "edenred";
        ANDA.value = "anda";
        TARJETAD.value = "tarjeta-d";
        HIPERCARD.value = "hipercard";
        BOGUS.value = "bogus";
        ENUM_SWITCH.value = "switch";
        SOLO.value = "solo";
        LASER.value = "laser";

        valueMap.put("visa", VISA);
        valueMap.put("master", MASTER);
        valueMap.put("elo", ELO);
        valueMap.put("cabal", CABAL);
        valueMap.put("alelo", ALELO);
        valueMap.put("discover", DISCOVER);
        valueMap.put("american_express", AMERICAN_EXPRESS);
        valueMap.put("naranja", NARANJA);
        valueMap.put("diners_club", DINERS_CLUB);
        valueMap.put("jcb", JCB);
        valueMap.put("dankort", DANKORT);
        valueMap.put("maestro", MAESTRO);
        valueMap.put("maestro_no_luhn", MAESTRO_NO_LUHN);
        valueMap.put("forbrugsforeningen", FORBRUGSFORENINGEN);
        valueMap.put("sodexo", SODEXO);
        valueMap.put("alia", ALIA);
        valueMap.put("vr", VR);
        valueMap.put("unionpay", UNIONPAY);
        valueMap.put("carnet", CARNET);
        valueMap.put("cartes_bancaires", CARTES_BANCAIRES);
        valueMap.put("olimpica", OLIMPICA);
        valueMap.put("creditel", CREDITEL);
        valueMap.put("confiable", CONFIABLE);
        valueMap.put("synchrony", SYNCHRONY);
        valueMap.put("routex", ROUTEX);
        valueMap.put("mada", MADA);
        valueMap.put("bp_plus", BP_PLUS);
        valueMap.put("passcard", PASSCARD);
        valueMap.put("edenred", EDENRED);
        valueMap.put("anda", ANDA);
        valueMap.put("tarjeta-d", TARJETAD);
        valueMap.put("hipercard", HIPERCARD);
        valueMap.put("bogus", BOGUS);
        valueMap.put("switch", ENUM_SWITCH);
        valueMap.put("solo", SOLO);
        valueMap.put("laser", LASER);
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