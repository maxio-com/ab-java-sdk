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
 * This is a model class for UpdatedPaymentProfile type.
 */
public class UpdatedPaymentProfile {
    private Integer id;
    private String firstName;
    private String lastName;
    private String cardType;
    private Integer expirationMonth;
    private Integer expirationYear;
    private Integer customerId;
    private CurrentVault currentVault;
    private String vaultToken;
    private String billingAddress;
    private String billingAddress2;
    private String billingCity;
    private String billingState;
    private String billingZip;
    private String billingCountry;
    private String paymentType;
    private Integer siteGatewaySettingId;
    private OptionalNullable<String> gatewayHandle;
    private String maskedCardNumber;
    private OptionalNullable<String> customerVaultToken;

    /**
     * Default constructor.
     */
    public UpdatedPaymentProfile() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  cardType  String value for cardType.
     * @param  expirationMonth  Integer value for expirationMonth.
     * @param  expirationYear  Integer value for expirationYear.
     * @param  customerId  Integer value for customerId.
     * @param  currentVault  CurrentVault value for currentVault.
     * @param  vaultToken  String value for vaultToken.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingAddress2  String value for billingAddress2.
     * @param  billingCity  String value for billingCity.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  billingCountry  String value for billingCountry.
     * @param  paymentType  String value for paymentType.
     * @param  siteGatewaySettingId  Integer value for siteGatewaySettingId.
     * @param  gatewayHandle  String value for gatewayHandle.
     * @param  maskedCardNumber  String value for maskedCardNumber.
     * @param  customerVaultToken  String value for customerVaultToken.
     */
    public UpdatedPaymentProfile(
            Integer id,
            String firstName,
            String lastName,
            String cardType,
            Integer expirationMonth,
            Integer expirationYear,
            Integer customerId,
            CurrentVault currentVault,
            String vaultToken,
            String billingAddress,
            String billingAddress2,
            String billingCity,
            String billingState,
            String billingZip,
            String billingCountry,
            String paymentType,
            Integer siteGatewaySettingId,
            String gatewayHandle,
            String maskedCardNumber,
            String customerVaultToken) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardType = cardType;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.customerId = customerId;
        this.currentVault = currentVault;
        this.vaultToken = vaultToken;
        this.billingAddress = billingAddress;
        this.billingAddress2 = billingAddress2;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.billingCountry = billingCountry;
        this.paymentType = paymentType;
        this.siteGatewaySettingId = siteGatewaySettingId;
        this.gatewayHandle = OptionalNullable.of(gatewayHandle);
        this.maskedCardNumber = maskedCardNumber;
        this.customerVaultToken = OptionalNullable.of(customerVaultToken);
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  cardType  String value for cardType.
     * @param  expirationMonth  Integer value for expirationMonth.
     * @param  expirationYear  Integer value for expirationYear.
     * @param  customerId  Integer value for customerId.
     * @param  currentVault  CurrentVault value for currentVault.
     * @param  vaultToken  String value for vaultToken.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingAddress2  String value for billingAddress2.
     * @param  billingCity  String value for billingCity.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  billingCountry  String value for billingCountry.
     * @param  paymentType  String value for paymentType.
     * @param  siteGatewaySettingId  Integer value for siteGatewaySettingId.
     * @param  gatewayHandle  String value for gatewayHandle.
     * @param  maskedCardNumber  String value for maskedCardNumber.
     * @param  customerVaultToken  String value for customerVaultToken.
     */

    protected UpdatedPaymentProfile(Integer id, String firstName, String lastName, String cardType,
            Integer expirationMonth, Integer expirationYear, Integer customerId,
            CurrentVault currentVault, String vaultToken, String billingAddress,
            String billingAddress2, String billingCity, String billingState, String billingZip,
            String billingCountry, String paymentType, Integer siteGatewaySettingId,
            OptionalNullable<String> gatewayHandle, String maskedCardNumber,
            OptionalNullable<String> customerVaultToken) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardType = cardType;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.customerId = customerId;
        this.currentVault = currentVault;
        this.vaultToken = vaultToken;
        this.billingAddress = billingAddress;
        this.billingAddress2 = billingAddress2;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.billingCountry = billingCountry;
        this.paymentType = paymentType;
        this.siteGatewaySettingId = siteGatewaySettingId;
        this.gatewayHandle = gatewayHandle;
        this.maskedCardNumber = maskedCardNumber;
        this.customerVaultToken = customerVaultToken;
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
     * Getter for ExpirationMonth.
     * @return Returns the Integer
     */
    @JsonGetter("expiration_month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Setter for ExpirationMonth.
     * @param expirationMonth Value for Integer
     */
    @JsonSetter("expiration_month")
    public void setExpirationMonth(Integer expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    /**
     * Getter for ExpirationYear.
     * @return Returns the Integer
     */
    @JsonGetter("expiration_year")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getExpirationYear() {
        return expirationYear;
    }

    /**
     * Setter for ExpirationYear.
     * @param expirationYear Value for Integer
     */
    @JsonSetter("expiration_year")
    public void setExpirationYear(Integer expirationYear) {
        this.expirationYear = expirationYear;
    }

    /**
     * Getter for CustomerId.
     * @return Returns the Integer
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * @param customerId Value for Integer
     */
    @JsonSetter("customer_id")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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
     * Getter for SiteGatewaySettingId.
     * @return Returns the Integer
     */
    @JsonGetter("site_gateway_setting_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSiteGatewaySettingId() {
        return siteGatewaySettingId;
    }

    /**
     * Setter for SiteGatewaySettingId.
     * @param siteGatewaySettingId Value for Integer
     */
    @JsonSetter("site_gateway_setting_id")
    public void setSiteGatewaySettingId(Integer siteGatewaySettingId) {
        this.siteGatewaySettingId = siteGatewaySettingId;
    }

    /**
     * Internal Getter for GatewayHandle.
     * @return Returns the Internal String
     */
    @JsonGetter("gateway_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetGatewayHandle() {
        return this.gatewayHandle;
    }

    /**
     * Getter for GatewayHandle.
     * @return Returns the String
     */
    public String getGatewayHandle() {
        return OptionalNullable.getFrom(gatewayHandle);
    }

    /**
     * Setter for GatewayHandle.
     * @param gatewayHandle Value for String
     */
    @JsonSetter("gateway_handle")
    public void setGatewayHandle(String gatewayHandle) {
        this.gatewayHandle = OptionalNullable.of(gatewayHandle);
    }

    /**
     * UnSetter for GatewayHandle.
     */
    public void unsetGatewayHandle() {
        gatewayHandle = null;
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
     * Internal Getter for CustomerVaultToken.
     * @return Returns the Internal String
     */
    @JsonGetter("customer_vault_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCustomerVaultToken() {
        return this.customerVaultToken;
    }

    /**
     * Getter for CustomerVaultToken.
     * @return Returns the String
     */
    public String getCustomerVaultToken() {
        return OptionalNullable.getFrom(customerVaultToken);
    }

    /**
     * Setter for CustomerVaultToken.
     * @param customerVaultToken Value for String
     */
    @JsonSetter("customer_vault_token")
    public void setCustomerVaultToken(String customerVaultToken) {
        this.customerVaultToken = OptionalNullable.of(customerVaultToken);
    }

    /**
     * UnSetter for CustomerVaultToken.
     */
    public void unsetCustomerVaultToken() {
        customerVaultToken = null;
    }

    /**
     * Converts this UpdatedPaymentProfile into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdatedPaymentProfile [" + "id=" + id + ", firstName=" + firstName + ", lastName="
                + lastName + ", cardType=" + cardType + ", expirationMonth=" + expirationMonth
                + ", expirationYear=" + expirationYear + ", customerId=" + customerId
                + ", currentVault=" + currentVault + ", vaultToken=" + vaultToken
                + ", billingAddress=" + billingAddress + ", billingAddress2=" + billingAddress2
                + ", billingCity=" + billingCity + ", billingState=" + billingState
                + ", billingZip=" + billingZip + ", billingCountry=" + billingCountry
                + ", paymentType=" + paymentType + ", siteGatewaySettingId=" + siteGatewaySettingId
                + ", gatewayHandle=" + gatewayHandle + ", maskedCardNumber=" + maskedCardNumber
                + ", customerVaultToken=" + customerVaultToken + "]";
    }

    /**
     * Builds a new {@link UpdatedPaymentProfile.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdatedPaymentProfile.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .firstName(getFirstName())
                .lastName(getLastName())
                .cardType(getCardType())
                .expirationMonth(getExpirationMonth())
                .expirationYear(getExpirationYear())
                .customerId(getCustomerId())
                .currentVault(getCurrentVault())
                .vaultToken(getVaultToken())
                .billingAddress(getBillingAddress())
                .billingAddress2(getBillingAddress2())
                .billingCity(getBillingCity())
                .billingState(getBillingState())
                .billingZip(getBillingZip())
                .billingCountry(getBillingCountry())
                .paymentType(getPaymentType())
                .siteGatewaySettingId(getSiteGatewaySettingId())
                .maskedCardNumber(getMaskedCardNumber());
        builder.gatewayHandle = internalGetGatewayHandle();
        builder.customerVaultToken = internalGetCustomerVaultToken();
        return builder;
    }

    /**
     * Class to build instances of {@link UpdatedPaymentProfile}.
     */
    public static class Builder {
        private Integer id;
        private String firstName;
        private String lastName;
        private String cardType;
        private Integer expirationMonth;
        private Integer expirationYear;
        private Integer customerId;
        private CurrentVault currentVault;
        private String vaultToken;
        private String billingAddress;
        private String billingAddress2;
        private String billingCity;
        private String billingState;
        private String billingZip;
        private String billingCountry;
        private String paymentType;
        private Integer siteGatewaySettingId;
        private OptionalNullable<String> gatewayHandle;
        private String maskedCardNumber;
        private OptionalNullable<String> customerVaultToken;



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
         * Setter for cardType.
         * @param  cardType  String value for cardType.
         * @return Builder
         */
        public Builder cardType(String cardType) {
            this.cardType = cardType;
            return this;
        }

        /**
         * Setter for expirationMonth.
         * @param  expirationMonth  Integer value for expirationMonth.
         * @return Builder
         */
        public Builder expirationMonth(Integer expirationMonth) {
            this.expirationMonth = expirationMonth;
            return this;
        }

        /**
         * Setter for expirationYear.
         * @param  expirationYear  Integer value for expirationYear.
         * @return Builder
         */
        public Builder expirationYear(Integer expirationYear) {
            this.expirationYear = expirationYear;
            return this;
        }

        /**
         * Setter for customerId.
         * @param  customerId  Integer value for customerId.
         * @return Builder
         */
        public Builder customerId(Integer customerId) {
            this.customerId = customerId;
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
         * Setter for vaultToken.
         * @param  vaultToken  String value for vaultToken.
         * @return Builder
         */
        public Builder vaultToken(String vaultToken) {
            this.vaultToken = vaultToken;
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
         * Setter for paymentType.
         * @param  paymentType  String value for paymentType.
         * @return Builder
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Setter for siteGatewaySettingId.
         * @param  siteGatewaySettingId  Integer value for siteGatewaySettingId.
         * @return Builder
         */
        public Builder siteGatewaySettingId(Integer siteGatewaySettingId) {
            this.siteGatewaySettingId = siteGatewaySettingId;
            return this;
        }

        /**
         * Setter for gatewayHandle.
         * @param  gatewayHandle  String value for gatewayHandle.
         * @return Builder
         */
        public Builder gatewayHandle(String gatewayHandle) {
            this.gatewayHandle = OptionalNullable.of(gatewayHandle);
            return this;
        }

        /**
         * UnSetter for gatewayHandle.
         * @return Builder
         */
        public Builder unsetGatewayHandle() {
            gatewayHandle = null;
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
         * Setter for customerVaultToken.
         * @param  customerVaultToken  String value for customerVaultToken.
         * @return Builder
         */
        public Builder customerVaultToken(String customerVaultToken) {
            this.customerVaultToken = OptionalNullable.of(customerVaultToken);
            return this;
        }

        /**
         * UnSetter for customerVaultToken.
         * @return Builder
         */
        public Builder unsetCustomerVaultToken() {
            customerVaultToken = null;
            return this;
        }

        /**
         * Builds a new {@link UpdatedPaymentProfile} object using the set fields.
         * @return {@link UpdatedPaymentProfile}
         */
        public UpdatedPaymentProfile build() {
            return new UpdatedPaymentProfile(id, firstName, lastName, cardType, expirationMonth,
                    expirationYear, customerId, currentVault, vaultToken, billingAddress,
                    billingAddress2, billingCity, billingState, billingZip, billingCountry,
                    paymentType, siteGatewaySettingId, gatewayHandle, maskedCardNumber,
                    customerVaultToken);
        }
    }
}
