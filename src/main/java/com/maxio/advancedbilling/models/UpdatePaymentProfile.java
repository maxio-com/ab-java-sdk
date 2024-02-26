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
 * This is a model class for UpdatePaymentProfile type.
 */
public class UpdatePaymentProfile {
    private String firstName;
    private String lastName;
    private String fullNumber;
    private CardType cardType;
    private String expirationMonth;
    private String expirationYear;
    private CurrentVault currentVault;
    private String billingAddress;
    private String billingCity;
    private String billingState;
    private String billingZip;
    private String billingCountry;
    private OptionalNullable<String> billingAddress2;

    /**
     * Default constructor.
     */
    public UpdatePaymentProfile() {
    }

    /**
     * Initialization constructor.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  fullNumber  String value for fullNumber.
     * @param  cardType  CardType value for cardType.
     * @param  expirationMonth  String value for expirationMonth.
     * @param  expirationYear  String value for expirationYear.
     * @param  currentVault  CurrentVault value for currentVault.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingCity  String value for billingCity.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  billingCountry  String value for billingCountry.
     * @param  billingAddress2  String value for billingAddress2.
     */
    public UpdatePaymentProfile(
            String firstName,
            String lastName,
            String fullNumber,
            CardType cardType,
            String expirationMonth,
            String expirationYear,
            CurrentVault currentVault,
            String billingAddress,
            String billingCity,
            String billingState,
            String billingZip,
            String billingCountry,
            String billingAddress2) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullNumber = fullNumber;
        this.cardType = cardType;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.currentVault = currentVault;
        this.billingAddress = billingAddress;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.billingCountry = billingCountry;
        this.billingAddress2 = OptionalNullable.of(billingAddress2);
    }

    /**
     * Initialization constructor.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  fullNumber  String value for fullNumber.
     * @param  cardType  CardType value for cardType.
     * @param  expirationMonth  String value for expirationMonth.
     * @param  expirationYear  String value for expirationYear.
     * @param  currentVault  CurrentVault value for currentVault.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingCity  String value for billingCity.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  billingCountry  String value for billingCountry.
     * @param  billingAddress2  String value for billingAddress2.
     */

    protected UpdatePaymentProfile(String firstName, String lastName, String fullNumber,
            CardType cardType, String expirationMonth, String expirationYear,
            CurrentVault currentVault, String billingAddress, String billingCity,
            String billingState, String billingZip, String billingCountry,
            OptionalNullable<String> billingAddress2) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullNumber = fullNumber;
        this.cardType = cardType;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.currentVault = currentVault;
        this.billingAddress = billingAddress;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.billingCountry = billingCountry;
        this.billingAddress2 = billingAddress2;
    }

    /**
     * Getter for FirstName.
     * The first name of the card holder.
     * @return Returns the String
     */
    @JsonGetter("first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * The first name of the card holder.
     * @param firstName Value for String
     */
    @JsonSetter("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * The last name of the card holder.
     * @return Returns the String
     */
    @JsonGetter("last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * The last name of the card holder.
     * @param lastName Value for String
     */
    @JsonSetter("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for FullNumber.
     * The full credit card number
     * @return Returns the String
     */
    @JsonGetter("full_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFullNumber() {
        return fullNumber;
    }

    /**
     * Setter for FullNumber.
     * The full credit card number
     * @param fullNumber Value for String
     */
    @JsonSetter("full_number")
    public void setFullNumber(String fullNumber) {
        this.fullNumber = fullNumber;
    }

    /**
     * Getter for CardType.
     * The type of card used.
     * @return Returns the CardType
     */
    @JsonGetter("card_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardType getCardType() {
        return cardType;
    }

    /**
     * Setter for CardType.
     * The type of card used.
     * @param cardType Value for CardType
     */
    @JsonSetter("card_type")
    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    /**
     * Getter for ExpirationMonth.
     * (Optional when performing an Import via vault_token, required otherwise) The 1- or 2-digit
     * credit card expiration month, as an integer or string, i.e. 5
     * @return Returns the String
     */
    @JsonGetter("expiration_month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Setter for ExpirationMonth.
     * (Optional when performing an Import via vault_token, required otherwise) The 1- or 2-digit
     * credit card expiration month, as an integer or string, i.e. 5
     * @param expirationMonth Value for String
     */
    @JsonSetter("expiration_month")
    public void setExpirationMonth(String expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    /**
     * Getter for ExpirationYear.
     * (Optional when performing a Import via vault_token, required otherwise) The 4-digit credit
     * card expiration year, as an integer or string, i.e. 2012
     * @return Returns the String
     */
    @JsonGetter("expiration_year")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpirationYear() {
        return expirationYear;
    }

    /**
     * Setter for ExpirationYear.
     * (Optional when performing a Import via vault_token, required otherwise) The 4-digit credit
     * card expiration year, as an integer or string, i.e. 2012
     * @param expirationYear Value for String
     */
    @JsonSetter("expiration_year")
    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
    }

    /**
     * Getter for CurrentVault.
     * The vault that stores the payment profile with the provided `vault_token`. Use `bogus` for
     * testing.
     * @return Returns the CurrentVault
     */
    @JsonGetter("current_vault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CurrentVault getCurrentVault() {
        return currentVault;
    }

    /**
     * Setter for CurrentVault.
     * The vault that stores the payment profile with the provided `vault_token`. Use `bogus` for
     * testing.
     * @param currentVault Value for CurrentVault
     */
    @JsonSetter("current_vault")
    public void setCurrentVault(CurrentVault currentVault) {
        this.currentVault = currentVault;
    }

    /**
     * Getter for BillingAddress.
     * The credit card or bank account billing street address (i.e. 123 Main St.). This value is
     * merely passed through to the payment gateway.
     * @return Returns the String
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * The credit card or bank account billing street address (i.e. 123 Main St.). This value is
     * merely passed through to the payment gateway.
     * @param billingAddress Value for String
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for BillingCity.
     * The credit card or bank account billing address city (i.e. “Boston”). This value is merely
     * passed through to the payment gateway.
     * @return Returns the String
     */
    @JsonGetter("billing_city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * Setter for BillingCity.
     * The credit card or bank account billing address city (i.e. “Boston”). This value is merely
     * passed through to the payment gateway.
     * @param billingCity Value for String
     */
    @JsonSetter("billing_city")
    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    /**
     * Getter for BillingState.
     * The credit card or bank account billing address state (i.e. MA). This value is merely passed
     * through to the payment gateway. This must conform to the
     * [ISO_3166-1](https://en.wikipedia.org/wiki/ISO_3166-1#Current_codes) in order to be valid for
     * tax locale purposes.
     * @return Returns the String
     */
    @JsonGetter("billing_state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingState() {
        return billingState;
    }

    /**
     * Setter for BillingState.
     * The credit card or bank account billing address state (i.e. MA). This value is merely passed
     * through to the payment gateway. This must conform to the
     * [ISO_3166-1](https://en.wikipedia.org/wiki/ISO_3166-1#Current_codes) in order to be valid for
     * tax locale purposes.
     * @param billingState Value for String
     */
    @JsonSetter("billing_state")
    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    /**
     * Getter for BillingZip.
     * The credit card or bank account billing address zip code (i.e. 12345). This value is merely
     * passed through to the payment gateway.
     * @return Returns the String
     */
    @JsonGetter("billing_zip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingZip() {
        return billingZip;
    }

    /**
     * Setter for BillingZip.
     * The credit card or bank account billing address zip code (i.e. 12345). This value is merely
     * passed through to the payment gateway.
     * @param billingZip Value for String
     */
    @JsonSetter("billing_zip")
    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    /**
     * Getter for BillingCountry.
     * The credit card or bank account billing address country, required in [ISO_3166-1
     * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format (i.e. “US”). This value is
     * merely passed through to the payment gateway. Some gateways require country codes in a
     * specific format. Please check your gateway’s documentation. If creating an ACH subscription,
     * only US is supported at this time.
     * @return Returns the String
     */
    @JsonGetter("billing_country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingCountry() {
        return billingCountry;
    }

    /**
     * Setter for BillingCountry.
     * The credit card or bank account billing address country, required in [ISO_3166-1
     * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format (i.e. “US”). This value is
     * merely passed through to the payment gateway. Some gateways require country codes in a
     * specific format. Please check your gateway’s documentation. If creating an ACH subscription,
     * only US is supported at this time.
     * @param billingCountry Value for String
     */
    @JsonSetter("billing_country")
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    /**
     * Internal Getter for BillingAddress2.
     * Second line of the customer’s billing address i.e. Apt. 100
     * @return Returns the Internal String
     */
    @JsonGetter("billing_address_2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBillingAddress2() {
        return this.billingAddress2;
    }

    /**
     * Getter for BillingAddress2.
     * Second line of the customer’s billing address i.e. Apt. 100
     * @return Returns the String
     */
    public String getBillingAddress2() {
        return OptionalNullable.getFrom(billingAddress2);
    }

    /**
     * Setter for BillingAddress2.
     * Second line of the customer’s billing address i.e. Apt. 100
     * @param billingAddress2 Value for String
     */
    @JsonSetter("billing_address_2")
    public void setBillingAddress2(String billingAddress2) {
        this.billingAddress2 = OptionalNullable.of(billingAddress2);
    }

    /**
     * UnSetter for BillingAddress2.
     * Second line of the customer’s billing address i.e. Apt. 100
     */
    public void unsetBillingAddress2() {
        billingAddress2 = null;
    }

    /**
     * Converts this UpdatePaymentProfile into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdatePaymentProfile [" + "firstName=" + firstName + ", lastName=" + lastName
                + ", fullNumber=" + fullNumber + ", cardType=" + cardType + ", expirationMonth="
                + expirationMonth + ", expirationYear=" + expirationYear + ", currentVault="
                + currentVault + ", billingAddress=" + billingAddress + ", billingCity="
                + billingCity + ", billingState=" + billingState + ", billingZip=" + billingZip
                + ", billingCountry=" + billingCountry + ", billingAddress2=" + billingAddress2
                + "]";
    }

    /**
     * Builds a new {@link UpdatePaymentProfile.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdatePaymentProfile.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .firstName(getFirstName())
                .lastName(getLastName())
                .fullNumber(getFullNumber())
                .cardType(getCardType())
                .expirationMonth(getExpirationMonth())
                .expirationYear(getExpirationYear())
                .currentVault(getCurrentVault())
                .billingAddress(getBillingAddress())
                .billingCity(getBillingCity())
                .billingState(getBillingState())
                .billingZip(getBillingZip())
                .billingCountry(getBillingCountry());
        builder.billingAddress2 = internalGetBillingAddress2();
        return builder;
    }

    /**
     * Class to build instances of {@link UpdatePaymentProfile}.
     */
    public static class Builder {
        private String firstName;
        private String lastName;
        private String fullNumber;
        private CardType cardType;
        private String expirationMonth;
        private String expirationYear;
        private CurrentVault currentVault;
        private String billingAddress;
        private String billingCity;
        private String billingState;
        private String billingZip;
        private String billingCountry;
        private OptionalNullable<String> billingAddress2;



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
         * Setter for fullNumber.
         * @param  fullNumber  String value for fullNumber.
         * @return Builder
         */
        public Builder fullNumber(String fullNumber) {
            this.fullNumber = fullNumber;
            return this;
        }

        /**
         * Setter for cardType.
         * @param  cardType  CardType value for cardType.
         * @return Builder
         */
        public Builder cardType(CardType cardType) {
            this.cardType = cardType;
            return this;
        }

        /**
         * Setter for expirationMonth.
         * @param  expirationMonth  String value for expirationMonth.
         * @return Builder
         */
        public Builder expirationMonth(String expirationMonth) {
            this.expirationMonth = expirationMonth;
            return this;
        }

        /**
         * Setter for expirationYear.
         * @param  expirationYear  String value for expirationYear.
         * @return Builder
         */
        public Builder expirationYear(String expirationYear) {
            this.expirationYear = expirationYear;
            return this;
        }

        /**
         * Setter for currentVault.
         * @param  currentVault  CurrentVault value for currentVault.
         * @return Builder
         */
        public Builder currentVault(CurrentVault currentVault) {
            this.currentVault = currentVault;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  String value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(String billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for billingCity.
         * @param  billingCity  String value for billingCity.
         * @return Builder
         */
        public Builder billingCity(String billingCity) {
            this.billingCity = billingCity;
            return this;
        }

        /**
         * Setter for billingState.
         * @param  billingState  String value for billingState.
         * @return Builder
         */
        public Builder billingState(String billingState) {
            this.billingState = billingState;
            return this;
        }

        /**
         * Setter for billingZip.
         * @param  billingZip  String value for billingZip.
         * @return Builder
         */
        public Builder billingZip(String billingZip) {
            this.billingZip = billingZip;
            return this;
        }

        /**
         * Setter for billingCountry.
         * @param  billingCountry  String value for billingCountry.
         * @return Builder
         */
        public Builder billingCountry(String billingCountry) {
            this.billingCountry = billingCountry;
            return this;
        }

        /**
         * Setter for billingAddress2.
         * @param  billingAddress2  String value for billingAddress2.
         * @return Builder
         */
        public Builder billingAddress2(String billingAddress2) {
            this.billingAddress2 = OptionalNullable.of(billingAddress2);
            return this;
        }

        /**
         * UnSetter for billingAddress2.
         * @return Builder
         */
        public Builder unsetBillingAddress2() {
            billingAddress2 = null;
            return this;
        }

        /**
         * Builds a new {@link UpdatePaymentProfile} object using the set fields.
         * @return {@link UpdatePaymentProfile}
         */
        public UpdatePaymentProfile build() {
            return new UpdatePaymentProfile(firstName, lastName, fullNumber, cardType,
                    expirationMonth, expirationYear, currentVault, billingAddress, billingCity,
                    billingState, billingZip, billingCountry, billingAddress2);
        }
    }
}
