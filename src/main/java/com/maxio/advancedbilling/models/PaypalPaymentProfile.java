/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for PaypalPaymentProfile type.
 */
public class PaypalPaymentProfile
        extends BaseModel {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer customerId;
    private PayPalVault currentVault;
    private String vaultToken;
    private OptionalNullable<String> billingAddress;
    private OptionalNullable<String> billingCity;
    private OptionalNullable<String> billingState;
    private OptionalNullable<String> billingZip;
    private OptionalNullable<String> billingCountry;
    private OptionalNullable<String> customerVaultToken;
    private OptionalNullable<String> billingAddress2;
    private PaymentType paymentType;
    private OptionalNullable<Integer> siteGatewaySettingId;
    private OptionalNullable<String> gatewayHandle;
    private String paypalEmail;

    /**
     * Default constructor.
     */
    public PaypalPaymentProfile() {
        paymentType = PaymentType.PAYPAL_ACCOUNT;
    }

    /**
     * Initialization constructor.
     * @param  paymentType  PaymentType value for paymentType.
     * @param  id  Integer value for id.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  customerId  Integer value for customerId.
     * @param  currentVault  PayPalVault value for currentVault.
     * @param  vaultToken  String value for vaultToken.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingCity  String value for billingCity.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  billingCountry  String value for billingCountry.
     * @param  customerVaultToken  String value for customerVaultToken.
     * @param  billingAddress2  String value for billingAddress2.
     * @param  siteGatewaySettingId  Integer value for siteGatewaySettingId.
     * @param  gatewayHandle  String value for gatewayHandle.
     * @param  paypalEmail  String value for paypalEmail.
     */
    public PaypalPaymentProfile(
            PaymentType paymentType,
            Integer id,
            String firstName,
            String lastName,
            Integer customerId,
            PayPalVault currentVault,
            String vaultToken,
            String billingAddress,
            String billingCity,
            String billingState,
            String billingZip,
            String billingCountry,
            String customerVaultToken,
            String billingAddress2,
            Integer siteGatewaySettingId,
            String gatewayHandle,
            String paypalEmail) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerId = customerId;
        this.currentVault = currentVault;
        this.vaultToken = vaultToken;
        this.billingAddress = OptionalNullable.of(billingAddress);
        this.billingCity = OptionalNullable.of(billingCity);
        this.billingState = OptionalNullable.of(billingState);
        this.billingZip = OptionalNullable.of(billingZip);
        this.billingCountry = OptionalNullable.of(billingCountry);
        this.customerVaultToken = OptionalNullable.of(customerVaultToken);
        this.billingAddress2 = OptionalNullable.of(billingAddress2);
        this.paymentType = paymentType;
        this.siteGatewaySettingId = OptionalNullable.of(siteGatewaySettingId);
        this.gatewayHandle = OptionalNullable.of(gatewayHandle);
        this.paypalEmail = paypalEmail;
    }

    /**
     * Initialization constructor.
     * @param  paymentType  PaymentType value for paymentType.
     * @param  id  Integer value for id.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  customerId  Integer value for customerId.
     * @param  currentVault  PayPalVault value for currentVault.
     * @param  vaultToken  String value for vaultToken.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingCity  String value for billingCity.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  billingCountry  String value for billingCountry.
     * @param  customerVaultToken  String value for customerVaultToken.
     * @param  billingAddress2  String value for billingAddress2.
     * @param  siteGatewaySettingId  Integer value for siteGatewaySettingId.
     * @param  gatewayHandle  String value for gatewayHandle.
     * @param  paypalEmail  String value for paypalEmail.
     */

    protected PaypalPaymentProfile(PaymentType paymentType, Integer id, String firstName,
            String lastName, Integer customerId, PayPalVault currentVault, String vaultToken,
            OptionalNullable<String> billingAddress, OptionalNullable<String> billingCity,
            OptionalNullable<String> billingState, OptionalNullable<String> billingZip,
            OptionalNullable<String> billingCountry, OptionalNullable<String> customerVaultToken,
            OptionalNullable<String> billingAddress2,
            OptionalNullable<Integer> siteGatewaySettingId, OptionalNullable<String> gatewayHandle,
            String paypalEmail) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerId = customerId;
        this.currentVault = currentVault;
        this.vaultToken = vaultToken;
        this.billingAddress = billingAddress;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.billingCountry = billingCountry;
        this.customerVaultToken = customerVaultToken;
        this.billingAddress2 = billingAddress2;
        this.paymentType = paymentType;
        this.siteGatewaySettingId = siteGatewaySettingId;
        this.gatewayHandle = gatewayHandle;
        this.paypalEmail = paypalEmail;
    }

    /**
     * Initialization constructor.
     * @param  paymentType  PaymentType value for paymentType.
     */
    @JsonCreator
    protected PaypalPaymentProfile(
            @JsonProperty("payment_type") PaymentType paymentType) {
        this(paymentType, null, null, null, null, null, null, OptionalNullable.of(null),
                OptionalNullable.of(null), OptionalNullable.of(null), OptionalNullable.of(null),
                OptionalNullable.of(null), OptionalNullable.of(null), OptionalNullable.of(null),
                OptionalNullable.of(null), OptionalNullable.of(null), null);
        unsetBillingAddress();
        unsetBillingCity();
        unsetBillingState();
        unsetBillingZip();
        unsetBillingCountry();
        unsetCustomerVaultToken();
        unsetBillingAddress2();
        unsetSiteGatewaySettingId();
        unsetGatewayHandle();
    }

    /**
     * Getter for Id.
     * The Chargify-assigned ID of the stored PayPal payment profile.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The Chargify-assigned ID of the stored PayPal payment profile.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for FirstName.
     * The first name of the PayPal account holder
     * @return Returns the String
     */
    @JsonGetter("first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * The first name of the PayPal account holder
     * @param firstName Value for String
     */
    @JsonSetter("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * The last name of the PayPal account holder
     * @return Returns the String
     */
    @JsonGetter("last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * The last name of the PayPal account holder
     * @param lastName Value for String
     */
    @JsonSetter("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for CustomerId.
     * The Chargify-assigned id for the customer record to which the PayPal account belongs
     * @return Returns the Integer
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * The Chargify-assigned id for the customer record to which the PayPal account belongs
     * @param customerId Value for Integer
     */
    @JsonSetter("customer_id")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for CurrentVault.
     * The vault that stores the payment profile with the provided vault_token.
     * @return Returns the PayPalVault
     */
    @JsonGetter("current_vault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayPalVault getCurrentVault() {
        return currentVault;
    }

    /**
     * Setter for CurrentVault.
     * The vault that stores the payment profile with the provided vault_token.
     * @param currentVault Value for PayPalVault
     */
    @JsonSetter("current_vault")
    public void setCurrentVault(PayPalVault currentVault) {
        this.currentVault = currentVault;
    }

    /**
     * Getter for VaultToken.
     * The “token” provided by your vault storage for an already stored payment profile
     * @return Returns the String
     */
    @JsonGetter("vault_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVaultToken() {
        return vaultToken;
    }

    /**
     * Setter for VaultToken.
     * The “token” provided by your vault storage for an already stored payment profile
     * @param vaultToken Value for String
     */
    @JsonSetter("vault_token")
    public void setVaultToken(String vaultToken) {
        this.vaultToken = vaultToken;
    }

    /**
     * Internal Getter for BillingAddress.
     * The current billing street address for the PayPal account
     * @return Returns the Internal String
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBillingAddress() {
        return this.billingAddress;
    }

    /**
     * Getter for BillingAddress.
     * The current billing street address for the PayPal account
     * @return Returns the String
     */
    public String getBillingAddress() {
        return OptionalNullable.getFrom(billingAddress);
    }

    /**
     * Setter for BillingAddress.
     * The current billing street address for the PayPal account
     * @param billingAddress Value for String
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = OptionalNullable.of(billingAddress);
    }

    /**
     * UnSetter for BillingAddress.
     * The current billing street address for the PayPal account
     */
    public void unsetBillingAddress() {
        billingAddress = null;
    }

    /**
     * Internal Getter for BillingCity.
     * The current billing address city for the PayPal account
     * @return Returns the Internal String
     */
    @JsonGetter("billing_city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBillingCity() {
        return this.billingCity;
    }

    /**
     * Getter for BillingCity.
     * The current billing address city for the PayPal account
     * @return Returns the String
     */
    public String getBillingCity() {
        return OptionalNullable.getFrom(billingCity);
    }

    /**
     * Setter for BillingCity.
     * The current billing address city for the PayPal account
     * @param billingCity Value for String
     */
    @JsonSetter("billing_city")
    public void setBillingCity(String billingCity) {
        this.billingCity = OptionalNullable.of(billingCity);
    }

    /**
     * UnSetter for BillingCity.
     * The current billing address city for the PayPal account
     */
    public void unsetBillingCity() {
        billingCity = null;
    }

    /**
     * Internal Getter for BillingState.
     * The current billing address state for the PayPal account
     * @return Returns the Internal String
     */
    @JsonGetter("billing_state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBillingState() {
        return this.billingState;
    }

    /**
     * Getter for BillingState.
     * The current billing address state for the PayPal account
     * @return Returns the String
     */
    public String getBillingState() {
        return OptionalNullable.getFrom(billingState);
    }

    /**
     * Setter for BillingState.
     * The current billing address state for the PayPal account
     * @param billingState Value for String
     */
    @JsonSetter("billing_state")
    public void setBillingState(String billingState) {
        this.billingState = OptionalNullable.of(billingState);
    }

    /**
     * UnSetter for BillingState.
     * The current billing address state for the PayPal account
     */
    public void unsetBillingState() {
        billingState = null;
    }

    /**
     * Internal Getter for BillingZip.
     * The current billing address zip code for the PayPal account
     * @return Returns the Internal String
     */
    @JsonGetter("billing_zip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBillingZip() {
        return this.billingZip;
    }

    /**
     * Getter for BillingZip.
     * The current billing address zip code for the PayPal account
     * @return Returns the String
     */
    public String getBillingZip() {
        return OptionalNullable.getFrom(billingZip);
    }

    /**
     * Setter for BillingZip.
     * The current billing address zip code for the PayPal account
     * @param billingZip Value for String
     */
    @JsonSetter("billing_zip")
    public void setBillingZip(String billingZip) {
        this.billingZip = OptionalNullable.of(billingZip);
    }

    /**
     * UnSetter for BillingZip.
     * The current billing address zip code for the PayPal account
     */
    public void unsetBillingZip() {
        billingZip = null;
    }

    /**
     * Internal Getter for BillingCountry.
     * The current billing address country for the PayPal account
     * @return Returns the Internal String
     */
    @JsonGetter("billing_country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBillingCountry() {
        return this.billingCountry;
    }

    /**
     * Getter for BillingCountry.
     * The current billing address country for the PayPal account
     * @return Returns the String
     */
    public String getBillingCountry() {
        return OptionalNullable.getFrom(billingCountry);
    }

    /**
     * Setter for BillingCountry.
     * The current billing address country for the PayPal account
     * @param billingCountry Value for String
     */
    @JsonSetter("billing_country")
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = OptionalNullable.of(billingCountry);
    }

    /**
     * UnSetter for BillingCountry.
     * The current billing address country for the PayPal account
     */
    public void unsetBillingCountry() {
        billingCountry = null;
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
     * Internal Getter for BillingAddress2.
     * The current billing street address, second line, for the PayPal account
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
     * The current billing street address, second line, for the PayPal account
     * @return Returns the String
     */
    public String getBillingAddress2() {
        return OptionalNullable.getFrom(billingAddress2);
    }

    /**
     * Setter for BillingAddress2.
     * The current billing street address, second line, for the PayPal account
     * @param billingAddress2 Value for String
     */
    @JsonSetter("billing_address_2")
    public void setBillingAddress2(String billingAddress2) {
        this.billingAddress2 = OptionalNullable.of(billingAddress2);
    }

    /**
     * UnSetter for BillingAddress2.
     * The current billing street address, second line, for the PayPal account
     */
    public void unsetBillingAddress2() {
        billingAddress2 = null;
    }

    /**
     * Getter for PaymentType.
     * @return Returns the PaymentType
     */
    @JsonGetter("payment_type")
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Setter for PaymentType.
     * @param paymentType Value for PaymentType
     */
    @JsonSetter("payment_type")
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Internal Getter for SiteGatewaySettingId.
     * @return Returns the Internal Integer
     */
    @JsonGetter("site_gateway_setting_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetSiteGatewaySettingId() {
        return this.siteGatewaySettingId;
    }

    /**
     * Getter for SiteGatewaySettingId.
     * @return Returns the Integer
     */
    public Integer getSiteGatewaySettingId() {
        return OptionalNullable.getFrom(siteGatewaySettingId);
    }

    /**
     * Setter for SiteGatewaySettingId.
     * @param siteGatewaySettingId Value for Integer
     */
    @JsonSetter("site_gateway_setting_id")
    public void setSiteGatewaySettingId(Integer siteGatewaySettingId) {
        this.siteGatewaySettingId = OptionalNullable.of(siteGatewaySettingId);
    }

    /**
     * UnSetter for SiteGatewaySettingId.
     */
    public void unsetSiteGatewaySettingId() {
        siteGatewaySettingId = null;
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
     * Getter for PaypalEmail.
     * @return Returns the String
     */
    @JsonGetter("paypal_email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaypalEmail() {
        return paypalEmail;
    }

    /**
     * Setter for PaypalEmail.
     * @param paypalEmail Value for String
     */
    @JsonSetter("paypal_email")
    public void setPaypalEmail(String paypalEmail) {
        this.paypalEmail = paypalEmail;
    }

    /**
     * Converts this PaypalPaymentProfile into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaypalPaymentProfile [" + "paymentType=" + paymentType + ", id=" + id
                + ", firstName=" + firstName + ", lastName=" + lastName + ", customerId="
                + customerId + ", currentVault=" + currentVault + ", vaultToken=" + vaultToken
                + ", billingAddress=" + billingAddress + ", billingCity=" + billingCity
                + ", billingState=" + billingState + ", billingZip=" + billingZip
                + ", billingCountry=" + billingCountry + ", customerVaultToken="
                + customerVaultToken + ", billingAddress2=" + billingAddress2
                + ", siteGatewaySettingId=" + siteGatewaySettingId + ", gatewayHandle="
                + gatewayHandle + ", paypalEmail=" + paypalEmail + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link PaypalPaymentProfile.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaypalPaymentProfile.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentType)
                .id(getId())
                .firstName(getFirstName())
                .lastName(getLastName())
                .customerId(getCustomerId())
                .currentVault(getCurrentVault())
                .vaultToken(getVaultToken())
                .paypalEmail(getPaypalEmail());
        builder.billingAddress = internalGetBillingAddress();
        builder.billingCity = internalGetBillingCity();
        builder.billingState = internalGetBillingState();
        builder.billingZip = internalGetBillingZip();
        builder.billingCountry = internalGetBillingCountry();
        builder.customerVaultToken = internalGetCustomerVaultToken();
        builder.billingAddress2 = internalGetBillingAddress2();
        builder.siteGatewaySettingId = internalGetSiteGatewaySettingId();
        builder.gatewayHandle = internalGetGatewayHandle();
        return builder;
    }

    /**
     * Class to build instances of {@link PaypalPaymentProfile}.
     */
    public static class Builder {
        private PaymentType paymentType = PaymentType.PAYPAL_ACCOUNT;
        private Integer id;
        private String firstName;
        private String lastName;
        private Integer customerId;
        private PayPalVault currentVault;
        private String vaultToken;
        private OptionalNullable<String> billingAddress;
        private OptionalNullable<String> billingCity;
        private OptionalNullable<String> billingState;
        private OptionalNullable<String> billingZip;
        private OptionalNullable<String> billingCountry;
        private OptionalNullable<String> customerVaultToken;
        private OptionalNullable<String> billingAddress2;
        private OptionalNullable<Integer> siteGatewaySettingId;
        private OptionalNullable<String> gatewayHandle;
        private String paypalEmail;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentType  PaymentType value for paymentType.
         */
        public Builder(PaymentType paymentType) {
            this.paymentType = paymentType;
        }

        /**
         * Setter for paymentType.
         * @param  paymentType  PaymentType value for paymentType.
         * @return Builder
         */
        public Builder paymentType(PaymentType paymentType) {
            this.paymentType = paymentType;
            return this;
        }

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
         * @param  currentVault  PayPalVault value for currentVault.
         * @return Builder
         */
        public Builder currentVault(PayPalVault currentVault) {
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
            this.billingAddress = OptionalNullable.of(billingAddress);
            return this;
        }

        /**
         * UnSetter for billingAddress.
         * @return Builder
         */
        public Builder unsetBillingAddress() {
            billingAddress = null;
            return this;
        }

        /**
         * Setter for billingCity.
         * @param  billingCity  String value for billingCity.
         * @return Builder
         */
        public Builder billingCity(String billingCity) {
            this.billingCity = OptionalNullable.of(billingCity);
            return this;
        }

        /**
         * UnSetter for billingCity.
         * @return Builder
         */
        public Builder unsetBillingCity() {
            billingCity = null;
            return this;
        }

        /**
         * Setter for billingState.
         * @param  billingState  String value for billingState.
         * @return Builder
         */
        public Builder billingState(String billingState) {
            this.billingState = OptionalNullable.of(billingState);
            return this;
        }

        /**
         * UnSetter for billingState.
         * @return Builder
         */
        public Builder unsetBillingState() {
            billingState = null;
            return this;
        }

        /**
         * Setter for billingZip.
         * @param  billingZip  String value for billingZip.
         * @return Builder
         */
        public Builder billingZip(String billingZip) {
            this.billingZip = OptionalNullable.of(billingZip);
            return this;
        }

        /**
         * UnSetter for billingZip.
         * @return Builder
         */
        public Builder unsetBillingZip() {
            billingZip = null;
            return this;
        }

        /**
         * Setter for billingCountry.
         * @param  billingCountry  String value for billingCountry.
         * @return Builder
         */
        public Builder billingCountry(String billingCountry) {
            this.billingCountry = OptionalNullable.of(billingCountry);
            return this;
        }

        /**
         * UnSetter for billingCountry.
         * @return Builder
         */
        public Builder unsetBillingCountry() {
            billingCountry = null;
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
         * Setter for siteGatewaySettingId.
         * @param  siteGatewaySettingId  Integer value for siteGatewaySettingId.
         * @return Builder
         */
        public Builder siteGatewaySettingId(Integer siteGatewaySettingId) {
            this.siteGatewaySettingId = OptionalNullable.of(siteGatewaySettingId);
            return this;
        }

        /**
         * UnSetter for siteGatewaySettingId.
         * @return Builder
         */
        public Builder unsetSiteGatewaySettingId() {
            siteGatewaySettingId = null;
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
         * Setter for paypalEmail.
         * @param  paypalEmail  String value for paypalEmail.
         * @return Builder
         */
        public Builder paypalEmail(String paypalEmail) {
            this.paypalEmail = paypalEmail;
            return this;
        }

        /**
         * Builds a new {@link PaypalPaymentProfile} object using the set fields.
         * @return {@link PaypalPaymentProfile}
         */
        public PaypalPaymentProfile build() {
            return new PaypalPaymentProfile(paymentType, id, firstName, lastName, customerId,
                    currentVault, vaultToken, billingAddress, billingCity, billingState, billingZip,
                    billingCountry, customerVaultToken, billingAddress2, siteGatewaySettingId,
                    gatewayHandle, paypalEmail);
        }
    }
}
