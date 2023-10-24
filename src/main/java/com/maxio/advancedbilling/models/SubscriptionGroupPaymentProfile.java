/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SubscriptionGroupPaymentProfile type.
 */
public class SubscriptionGroupPaymentProfile {
    private Integer id;
    private String firstName;
    private String lastName;
    private String maskedCardNumber;

    /**
     * Default constructor.
     */
    public SubscriptionGroupPaymentProfile() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  maskedCardNumber  String value for maskedCardNumber.
     */
    public SubscriptionGroupPaymentProfile(
            Integer id,
            String firstName,
            String lastName,
            String maskedCardNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.maskedCardNumber = maskedCardNumber;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
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
     * Converts this SubscriptionGroupPaymentProfile into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupPaymentProfile [" + "id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", maskedCardNumber=" + maskedCardNumber + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupPaymentProfile.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupPaymentProfile.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .firstName(getFirstName())
                .lastName(getLastName())
                .maskedCardNumber(getMaskedCardNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupPaymentProfile}.
     */
    public static class Builder {
        private Integer id;
        private String firstName;
        private String lastName;
        private String maskedCardNumber;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

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
         * Setter for maskedCardNumber.
         * @param  maskedCardNumber  String value for maskedCardNumber.
         * @return Builder
         */
        public Builder maskedCardNumber(String maskedCardNumber) {
            this.maskedCardNumber = maskedCardNumber;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupPaymentProfile} object using the set fields.
         * @return {@link SubscriptionGroupPaymentProfile}
         */
        public SubscriptionGroupPaymentProfile build() {
            return new SubscriptionGroupPaymentProfile(id, firstName, lastName, maskedCardNumber);
        }
    }
}
