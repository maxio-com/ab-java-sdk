/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupCreditCardExpirationMonth;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupCreditCardExpirationYear;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupCreditCardFullNumber;

/**
 * This is a model class for SubscriptionGroupCreditCard type.
 */
public class SubscriptionGroupCreditCard {
    private SubscriptionGroupCreditCardFullNumber fullNumber;
    private SubscriptionGroupCreditCardExpirationMonth expirationMonth;
    private SubscriptionGroupCreditCardExpirationYear expirationYear;
    private String chargifyToken;
    private String vaultToken;
    private CurrentVault currentVault;
    private String gatewayHandle;
    private String firstName;
    private String lastName;
    private String billingAddress;
    private String billingAddress2;
    private String billingCity;
    private String billingState;
    private String billingZip;
    private String billingCountry;
    private String lastFour;
    private String cardType;
    private String customerVaultToken;
    private String cvv;
    private String paymentType;

    /**
     * Default constructor.
     */
    public SubscriptionGroupCreditCard() {
    }

    /**
     * Initialization constructor.
     * @param  fullNumber  SubscriptionGroupCreditCardFullNumber value for fullNumber.
     * @param  expirationMonth  SubscriptionGroupCreditCardExpirationMonth value for
     *         expirationMonth.
     * @param  expirationYear  SubscriptionGroupCreditCardExpirationYear value for expirationYear.
     * @param  chargifyToken  String value for chargifyToken.
     * @param  vaultToken  String value for vaultToken.
     * @param  currentVault  CurrentVault value for currentVault.
     * @param  gatewayHandle  String value for gatewayHandle.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingAddress2  String value for billingAddress2.
     * @param  billingCity  String value for billingCity.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  billingCountry  String value for billingCountry.
     * @param  lastFour  String value for lastFour.
     * @param  cardType  String value for cardType.
     * @param  customerVaultToken  String value for customerVaultToken.
     * @param  cvv  String value for cvv.
     * @param  paymentType  String value for paymentType.
     */
    public SubscriptionGroupCreditCard(
            SubscriptionGroupCreditCardFullNumber fullNumber,
            SubscriptionGroupCreditCardExpirationMonth expirationMonth,
            SubscriptionGroupCreditCardExpirationYear expirationYear,
            String chargifyToken,
            String vaultToken,
            CurrentVault currentVault,
            String gatewayHandle,
            String firstName,
            String lastName,
            String billingAddress,
            String billingAddress2,
            String billingCity,
            String billingState,
            String billingZip,
            String billingCountry,
            String lastFour,
            String cardType,
            String customerVaultToken,
            String cvv,
            String paymentType) {
        this.fullNumber = fullNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.chargifyToken = chargifyToken;
        this.vaultToken = vaultToken;
        this.currentVault = currentVault;
        this.gatewayHandle = gatewayHandle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.billingAddress = billingAddress;
        this.billingAddress2 = billingAddress2;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.billingCountry = billingCountry;
        this.lastFour = lastFour;
        this.cardType = cardType;
        this.customerVaultToken = customerVaultToken;
        this.cvv = cvv;
        this.paymentType = paymentType;
    }

    /**
     * Getter for FullNumber.
     * @return Returns the SubscriptionGroupCreditCardFullNumber
     */
    @JsonGetter("full_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionGroupCreditCardFullNumber getFullNumber() {
        return fullNumber;
    }

    /**
     * Setter for FullNumber.
     * @param fullNumber Value for SubscriptionGroupCreditCardFullNumber
     */
    @JsonSetter("full_number")
    public void setFullNumber(SubscriptionGroupCreditCardFullNumber fullNumber) {
        this.fullNumber = fullNumber;
    }

    /**
     * Getter for ExpirationMonth.
     * @return Returns the SubscriptionGroupCreditCardExpirationMonth
     */
    @JsonGetter("expiration_month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionGroupCreditCardExpirationMonth getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Setter for ExpirationMonth.
     * @param expirationMonth Value for SubscriptionGroupCreditCardExpirationMonth
     */
    @JsonSetter("expiration_month")
    public void setExpirationMonth(SubscriptionGroupCreditCardExpirationMonth expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    /**
     * Getter for ExpirationYear.
     * @return Returns the SubscriptionGroupCreditCardExpirationYear
     */
    @JsonGetter("expiration_year")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionGroupCreditCardExpirationYear getExpirationYear() {
        return expirationYear;
    }

    /**
     * Setter for ExpirationYear.
     * @param expirationYear Value for SubscriptionGroupCreditCardExpirationYear
     */
    @JsonSetter("expiration_year")
    public void setExpirationYear(SubscriptionGroupCreditCardExpirationYear expirationYear) {
        this.expirationYear = expirationYear;
    }

    /**
     * Getter for ChargifyToken.
     * @return Returns the String
     */
    @JsonGetter("chargify_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getChargifyToken() {
        return chargifyToken;
    }

    /**
     * Setter for ChargifyToken.
     * @param chargifyToken Value for String
     */
    @JsonSetter("chargify_token")
    public void setChargifyToken(String chargifyToken) {
        this.chargifyToken = chargifyToken;
    }

    /**
     * Getter for VaultToken.
     * @return Returns the String
     */
    @JsonGetter("vault_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVaultToken() {
        return vaultToken;
    }

    /**
     * Setter for VaultToken.
     * @param vaultToken Value for String
     */
    @JsonSetter("vault_token")
    public void setVaultToken(String vaultToken) {
        this.vaultToken = vaultToken;
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
     * Getter for GatewayHandle.
     * @return Returns the String
     */
    @JsonGetter("gateway_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGatewayHandle() {
        return gatewayHandle;
    }

    /**
     * Setter for GatewayHandle.
     * @param gatewayHandle Value for String
     */
    @JsonSetter("gateway_handle")
    public void setGatewayHandle(String gatewayHandle) {
        this.gatewayHandle = gatewayHandle;
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
     * Getter for BillingAddress.
     * @return Returns the String
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * @param billingAddress Value for String
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for BillingAddress2.
     * @return Returns the String
     */
    @JsonGetter("billing_address_2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingAddress2() {
        return billingAddress2;
    }

    /**
     * Setter for BillingAddress2.
     * @param billingAddress2 Value for String
     */
    @JsonSetter("billing_address_2")
    public void setBillingAddress2(String billingAddress2) {
        this.billingAddress2 = billingAddress2;
    }

    /**
     * Getter for BillingCity.
     * @return Returns the String
     */
    @JsonGetter("billing_city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * Setter for BillingCity.
     * @param billingCity Value for String
     */
    @JsonSetter("billing_city")
    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    /**
     * Getter for BillingState.
     * @return Returns the String
     */
    @JsonGetter("billing_state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingState() {
        return billingState;
    }

    /**
     * Setter for BillingState.
     * @param billingState Value for String
     */
    @JsonSetter("billing_state")
    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    /**
     * Getter for BillingZip.
     * @return Returns the String
     */
    @JsonGetter("billing_zip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingZip() {
        return billingZip;
    }

    /**
     * Setter for BillingZip.
     * @param billingZip Value for String
     */
    @JsonSetter("billing_zip")
    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    /**
     * Getter for BillingCountry.
     * @return Returns the String
     */
    @JsonGetter("billing_country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingCountry() {
        return billingCountry;
    }

    /**
     * Setter for BillingCountry.
     * @param billingCountry Value for String
     */
    @JsonSetter("billing_country")
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    /**
     * Getter for LastFour.
     * @return Returns the String
     */
    @JsonGetter("last_four")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastFour() {
        return lastFour;
    }

    /**
     * Setter for LastFour.
     * @param lastFour Value for String
     */
    @JsonSetter("last_four")
    public void setLastFour(String lastFour) {
        this.lastFour = lastFour;
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
     * Getter for CustomerVaultToken.
     * @return Returns the String
     */
    @JsonGetter("customer_vault_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomerVaultToken() {
        return customerVaultToken;
    }

    /**
     * Setter for CustomerVaultToken.
     * @param customerVaultToken Value for String
     */
    @JsonSetter("customer_vault_token")
    public void setCustomerVaultToken(String customerVaultToken) {
        this.customerVaultToken = customerVaultToken;
    }

    /**
     * Getter for Cvv.
     * @return Returns the String
     */
    @JsonGetter("cvv")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCvv() {
        return cvv;
    }

    /**
     * Setter for Cvv.
     * @param cvv Value for String
     */
    @JsonSetter("cvv")
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    /**
     * Getter for PaymentType.
     * @return Returns the String
     */
    @JsonGetter("payment_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Setter for PaymentType.
     * @param paymentType Value for String
     */
    @JsonSetter("payment_type")
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Converts this SubscriptionGroupCreditCard into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupCreditCard [" + "fullNumber=" + fullNumber + ", expirationMonth="
                + expirationMonth + ", expirationYear=" + expirationYear + ", chargifyToken="
                + chargifyToken + ", vaultToken=" + vaultToken + ", currentVault=" + currentVault
                + ", gatewayHandle=" + gatewayHandle + ", firstName=" + firstName + ", lastName="
                + lastName + ", billingAddress=" + billingAddress + ", billingAddress2="
                + billingAddress2 + ", billingCity=" + billingCity + ", billingState="
                + billingState + ", billingZip=" + billingZip + ", billingCountry=" + billingCountry
                + ", lastFour=" + lastFour + ", cardType=" + cardType + ", customerVaultToken="
                + customerVaultToken + ", cvv=" + cvv + ", paymentType=" + paymentType + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupCreditCard.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupCreditCard.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .fullNumber(getFullNumber())
                .expirationMonth(getExpirationMonth())
                .expirationYear(getExpirationYear())
                .chargifyToken(getChargifyToken())
                .vaultToken(getVaultToken())
                .currentVault(getCurrentVault())
                .gatewayHandle(getGatewayHandle())
                .firstName(getFirstName())
                .lastName(getLastName())
                .billingAddress(getBillingAddress())
                .billingAddress2(getBillingAddress2())
                .billingCity(getBillingCity())
                .billingState(getBillingState())
                .billingZip(getBillingZip())
                .billingCountry(getBillingCountry())
                .lastFour(getLastFour())
                .cardType(getCardType())
                .customerVaultToken(getCustomerVaultToken())
                .cvv(getCvv())
                .paymentType(getPaymentType());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupCreditCard}.
     */
    public static class Builder {
        private SubscriptionGroupCreditCardFullNumber fullNumber;
        private SubscriptionGroupCreditCardExpirationMonth expirationMonth;
        private SubscriptionGroupCreditCardExpirationYear expirationYear;
        private String chargifyToken;
        private String vaultToken;
        private CurrentVault currentVault;
        private String gatewayHandle;
        private String firstName;
        private String lastName;
        private String billingAddress;
        private String billingAddress2;
        private String billingCity;
        private String billingState;
        private String billingZip;
        private String billingCountry;
        private String lastFour;
        private String cardType;
        private String customerVaultToken;
        private String cvv;
        private String paymentType;



        /**
         * Setter for fullNumber.
         * @param  fullNumber  SubscriptionGroupCreditCardFullNumber value for fullNumber.
         * @return Builder
         */
        public Builder fullNumber(SubscriptionGroupCreditCardFullNumber fullNumber) {
            this.fullNumber = fullNumber;
            return this;
        }

        /**
         * Setter for expirationMonth.
         * @param  expirationMonth  SubscriptionGroupCreditCardExpirationMonth value for
         *         expirationMonth.
         * @return Builder
         */
        public Builder expirationMonth(
                SubscriptionGroupCreditCardExpirationMonth expirationMonth) {
            this.expirationMonth = expirationMonth;
            return this;
        }

        /**
         * Setter for expirationYear.
         * @param  expirationYear  SubscriptionGroupCreditCardExpirationYear value for
         *         expirationYear.
         * @return Builder
         */
        public Builder expirationYear(SubscriptionGroupCreditCardExpirationYear expirationYear) {
            this.expirationYear = expirationYear;
            return this;
        }

        /**
         * Setter for chargifyToken.
         * @param  chargifyToken  String value for chargifyToken.
         * @return Builder
         */
        public Builder chargifyToken(String chargifyToken) {
            this.chargifyToken = chargifyToken;
            return this;
        }

        /**
         * Setter for vaultToken.
         * @param  vaultToken  String value for vaultToken.
         * @return Builder
         */
        public Builder vaultToken(String vaultToken) {
            this.vaultToken = vaultToken;
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
         * Setter for gatewayHandle.
         * @param  gatewayHandle  String value for gatewayHandle.
         * @return Builder
         */
        public Builder gatewayHandle(String gatewayHandle) {
            this.gatewayHandle = gatewayHandle;
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
         * Setter for billingAddress.
         * @param  billingAddress  String value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(String billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for billingAddress2.
         * @param  billingAddress2  String value for billingAddress2.
         * @return Builder
         */
        public Builder billingAddress2(String billingAddress2) {
            this.billingAddress2 = billingAddress2;
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
         * Setter for lastFour.
         * @param  lastFour  String value for lastFour.
         * @return Builder
         */
        public Builder lastFour(String lastFour) {
            this.lastFour = lastFour;
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
         * Setter for customerVaultToken.
         * @param  customerVaultToken  String value for customerVaultToken.
         * @return Builder
         */
        public Builder customerVaultToken(String customerVaultToken) {
            this.customerVaultToken = customerVaultToken;
            return this;
        }

        /**
         * Setter for cvv.
         * @param  cvv  String value for cvv.
         * @return Builder
         */
        public Builder cvv(String cvv) {
            this.cvv = cvv;
            return this;
        }

        /**
         * Setter for paymentType.
         * @param  paymentType  String value for paymentType.
         * @return Builder
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupCreditCard} object using the set fields.
         * @return {@link SubscriptionGroupCreditCard}
         */
        public SubscriptionGroupCreditCard build() {
            return new SubscriptionGroupCreditCard(fullNumber, expirationMonth, expirationYear,
                    chargifyToken, vaultToken, currentVault, gatewayHandle, firstName, lastName,
                    billingAddress, billingAddress2, billingCity, billingState, billingZip,
                    billingCountry, lastFour, cardType, customerVaultToken, cvv, paymentType);
        }
    }
}
