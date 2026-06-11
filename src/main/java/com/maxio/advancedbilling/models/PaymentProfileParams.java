/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for PaymentProfileParams type.
 */
public class PaymentProfileParams
        extends BaseModel {
    private String firstName;
    private String lastName;
    private String cardType;

    /**
     * Default constructor.
     */
    public PaymentProfileParams() {
    }

    /**
     * Initialization constructor.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  cardType  String value for cardType.
     */
    public PaymentProfileParams(
            String firstName,
            String lastName,
            String cardType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardType = cardType;
    }

    /**
     * Getter for FirstName.
     * @return Returns the String
     */
    @JsonGetter("first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * @param firstName Value for String
     */
    @JsonSetter("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * @return Returns the String
     */
    @JsonGetter("last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * @param lastName Value for String
     */
    @JsonSetter("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for CardType.
     * @return Returns the String
     */
    @JsonGetter("card_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardType() {
        return cardType;
    }

    /**
     * Setter for CardType.
     * @param cardType Value for String
     */
    @JsonSetter("card_type")
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * Converts this PaymentProfileParams into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentProfileParams [" + "firstName=" + firstName + ", lastName=" + lastName
                + ", cardType=" + cardType + ", additionalProperties=" + getAdditionalProperties()
                + "]";
    }

    /**
     * Builds a new {@link PaymentProfileParams.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentProfileParams.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .firstName(getFirstName())
                .lastName(getLastName())
                .cardType(getCardType());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentProfileParams}.
     */
    public static class Builder {
        private String firstName;
        private String lastName;
        private String cardType;



        /**
         * Setter for firstName.
         * @param  firstName  String value for firstName.
         * @return Builder
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Setter for lastName.
         * @param  lastName  String value for lastName.
         * @return Builder
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Setter for cardType.
         * @param  cardType  String value for cardType.
         * @return Builder
         */
        public Builder cardType(String cardType) {
            this.cardType = cardType;
            return this;
        }

        /**
         * Builds a new {@link PaymentProfileParams} object using the set fields.
         * @return {@link PaymentProfileParams}
         */
        public PaymentProfileParams build() {
            return new PaymentProfileParams(firstName, lastName, cardType);
        }
    }
}
