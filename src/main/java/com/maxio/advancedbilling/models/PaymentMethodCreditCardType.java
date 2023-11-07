/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for PaymentMethodCreditCardType type.
 */
public class PaymentMethodCreditCardType {
    private String cardBrand;
    private String cardExpiration;
    private OptionalNullable<String> lastFour;
    private String maskedCardNumber;
    private String type;

    /**
     * Default constructor.
     */
    public PaymentMethodCreditCardType() {
        type = "credit_card";
    }

    /**
     * Initialization constructor.
     * @param  cardBrand  String value for cardBrand.
     * @param  cardExpiration  String value for cardExpiration.
     * @param  lastFour  String value for lastFour.
     * @param  maskedCardNumber  String value for maskedCardNumber.
     * @param  type  String value for type.
     */
    public PaymentMethodCreditCardType(
            String cardBrand,
            String cardExpiration,
            String lastFour,
            String maskedCardNumber,
            String type) {
        this.cardBrand = cardBrand;
        this.cardExpiration = cardExpiration;
        this.lastFour = OptionalNullable.of(lastFour);
        this.maskedCardNumber = maskedCardNumber;
        this.type = type;
    }

    /**
     * Initialization constructor.
     * @param  cardBrand  String value for cardBrand.
     * @param  cardExpiration  String value for cardExpiration.
     * @param  lastFour  String value for lastFour.
     * @param  maskedCardNumber  String value for maskedCardNumber.
     * @param  type  String value for type.
     */

    protected PaymentMethodCreditCardType(String cardBrand, String cardExpiration,
            OptionalNullable<String> lastFour, String maskedCardNumber, String type) {
        this.cardBrand = cardBrand;
        this.cardExpiration = cardExpiration;
        this.lastFour = lastFour;
        this.maskedCardNumber = maskedCardNumber;
        this.type = type;
    }

    /**
     * Getter for CardBrand.
     * @return Returns the String
     */
    @JsonGetter("card_brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardBrand() {
        return cardBrand;
    }

    /**
     * Setter for CardBrand.
     * @param cardBrand Value for String
     */
    @JsonSetter("card_brand")
    public void setCardBrand(String cardBrand) {
        this.cardBrand = cardBrand;
    }

    /**
     * Getter for CardExpiration.
     * @return Returns the String
     */
    @JsonGetter("card_expiration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardExpiration() {
        return cardExpiration;
    }

    /**
     * Setter for CardExpiration.
     * @param cardExpiration Value for String
     */
    @JsonSetter("card_expiration")
    public void setCardExpiration(String cardExpiration) {
        this.cardExpiration = cardExpiration;
    }

    /**
     * Internal Getter for LastFour.
     * @return Returns the Internal String
     */
    @JsonGetter("last_four")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLastFour() {
        return this.lastFour;
    }

    /**
     * Getter for LastFour.
     * @return Returns the String
     */
    public String getLastFour() {
        return OptionalNullable.getFrom(lastFour);
    }

    /**
     * Setter for LastFour.
     * @param lastFour Value for String
     */
    @JsonSetter("last_four")
    public void setLastFour(String lastFour) {
        this.lastFour = OptionalNullable.of(lastFour);
    }

    /**
     * UnSetter for LastFour.
     */
    public void unsetLastFour() {
        lastFour = null;
    }

    /**
     * Getter for MaskedCardNumber.
     * @return Returns the String
     */
    @JsonGetter("masked_card_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMaskedCardNumber() {
        return maskedCardNumber;
    }

    /**
     * Setter for MaskedCardNumber.
     * @param maskedCardNumber Value for String
     */
    @JsonSetter("masked_card_number")
    public void setMaskedCardNumber(String maskedCardNumber) {
        this.maskedCardNumber = maskedCardNumber;
    }

    /**
     * Getter for Type.
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Converts this PaymentMethodCreditCardType into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentMethodCreditCardType [" + "cardBrand=" + cardBrand + ", cardExpiration="
                + cardExpiration + ", lastFour=" + lastFour + ", maskedCardNumber="
                + maskedCardNumber + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link PaymentMethodCreditCardType.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentMethodCreditCardType.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cardBrand(getCardBrand())
                .cardExpiration(getCardExpiration())
                .maskedCardNumber(getMaskedCardNumber())
                .type(getType());
        builder.lastFour = internalGetLastFour();
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentMethodCreditCardType}.
     */
    public static class Builder {
        private String cardBrand;
        private String cardExpiration;
        private OptionalNullable<String> lastFour;
        private String maskedCardNumber;
        private String type = "credit_card";



        /**
         * Setter for cardBrand.
         * @param  cardBrand  String value for cardBrand.
         * @return Builder
         */
        public Builder cardBrand(String cardBrand) {
            this.cardBrand = cardBrand;
            return this;
        }

        /**
         * Setter for cardExpiration.
         * @param  cardExpiration  String value for cardExpiration.
         * @return Builder
         */
        public Builder cardExpiration(String cardExpiration) {
            this.cardExpiration = cardExpiration;
            return this;
        }

        /**
         * Setter for lastFour.
         * @param  lastFour  String value for lastFour.
         * @return Builder
         */
        public Builder lastFour(String lastFour) {
            this.lastFour = OptionalNullable.of(lastFour);
            return this;
        }

        /**
         * UnSetter for lastFour.
         * @return Builder
         */
        public Builder unsetLastFour() {
            lastFour = null;
            return this;
        }

        /**
         * Setter for maskedCardNumber.
         * @param  maskedCardNumber  String value for maskedCardNumber.
         * @return Builder
         */
        public Builder maskedCardNumber(String maskedCardNumber) {
            this.maskedCardNumber = maskedCardNumber;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link PaymentMethodCreditCardType} object using the set fields.
         * @return {@link PaymentMethodCreditCardType}
         */
        public PaymentMethodCreditCardType build() {
            return new PaymentMethodCreditCardType(cardBrand, cardExpiration, lastFour,
                    maskedCardNumber, type);
        }
    }
}
