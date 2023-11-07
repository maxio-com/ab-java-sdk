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
 * This is a model class for GetOneTimeTokenPaymentProfile type.
 */
public class GetOneTimeTokenPaymentProfile {
    private OptionalNullable<String> id;
    private String firstName;
    private String lastName;
    private String maskedCardNumber;
    private String cardType;
    private double expirationMonth;
    private double expirationYear;
    private OptionalNullable<String> customerId;
    private CurrentVault currentVault;
    private String vaultToken;
    private String billingAddress;
    private String billingAddress2;
    private String billingCity;
    private String billingCountry;
    private String billingState;
    private String billingZip;
    private String paymentType;
    private boolean disabled;
    private int siteGatewaySettingId;
    private OptionalNullable<String> customerVaultToken;
    private OptionalNullable<String> gatewayHandle;

    /**
     * Default constructor.
     */
    public GetOneTimeTokenPaymentProfile() {
    }

    /**
     * Initialization constructor.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  maskedCardNumber  String value for maskedCardNumber.
     * @param  cardType  String value for cardType.
     * @param  expirationMonth  double value for expirationMonth.
     * @param  expirationYear  double value for expirationYear.
     * @param  currentVault  CurrentVault value for currentVault.
     * @param  vaultToken  String value for vaultToken.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingCity  String value for billingCity.
     * @param  billingCountry  String value for billingCountry.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  paymentType  String value for paymentType.
     * @param  disabled  boolean value for disabled.
     * @param  siteGatewaySettingId  int value for siteGatewaySettingId.
     * @param  id  String value for id.
     * @param  customerId  String value for customerId.
     * @param  billingAddress2  String value for billingAddress2.
     * @param  customerVaultToken  String value for customerVaultToken.
     * @param  gatewayHandle  String value for gatewayHandle.
     */
    public GetOneTimeTokenPaymentProfile(
            String firstName,
            String lastName,
            String maskedCardNumber,
            String cardType,
            double expirationMonth,
            double expirationYear,
            CurrentVault currentVault,
            String vaultToken,
            String billingAddress,
            String billingCity,
            String billingCountry,
            String billingState,
            String billingZip,
            String paymentType,
            boolean disabled,
            int siteGatewaySettingId,
            String id,
            String customerId,
            String billingAddress2,
            String customerVaultToken,
            String gatewayHandle) {
        this.id = OptionalNullable.of(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.maskedCardNumber = maskedCardNumber;
        this.cardType = cardType;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.customerId = OptionalNullable.of(customerId);
        this.currentVault = currentVault;
        this.vaultToken = vaultToken;
        this.billingAddress = billingAddress;
        this.billingAddress2 = billingAddress2;
        this.billingCity = billingCity;
        this.billingCountry = billingCountry;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.paymentType = paymentType;
        this.disabled = disabled;
        this.siteGatewaySettingId = siteGatewaySettingId;
        this.customerVaultToken = OptionalNullable.of(customerVaultToken);
        this.gatewayHandle = OptionalNullable.of(gatewayHandle);
    }

    /**
     * Initialization constructor.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  maskedCardNumber  String value for maskedCardNumber.
     * @param  cardType  String value for cardType.
     * @param  expirationMonth  double value for expirationMonth.
     * @param  expirationYear  double value for expirationYear.
     * @param  currentVault  CurrentVault value for currentVault.
     * @param  vaultToken  String value for vaultToken.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingCity  String value for billingCity.
     * @param  billingCountry  String value for billingCountry.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  paymentType  String value for paymentType.
     * @param  disabled  boolean value for disabled.
     * @param  siteGatewaySettingId  int value for siteGatewaySettingId.
     * @param  id  String value for id.
     * @param  customerId  String value for customerId.
     * @param  billingAddress2  String value for billingAddress2.
     * @param  customerVaultToken  String value for customerVaultToken.
     * @param  gatewayHandle  String value for gatewayHandle.
     */

    protected GetOneTimeTokenPaymentProfile(String firstName, String lastName,
            String maskedCardNumber, String cardType, double expirationMonth, double expirationYear,
            CurrentVault currentVault, String vaultToken, String billingAddress, String billingCity,
            String billingCountry, String billingState, String billingZip, String paymentType,
            boolean disabled, int siteGatewaySettingId, OptionalNullable<String> id,
            OptionalNullable<String> customerId, String billingAddress2,
            OptionalNullable<String> customerVaultToken, OptionalNullable<String> gatewayHandle) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.maskedCardNumber = maskedCardNumber;
        this.cardType = cardType;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.customerId = customerId;
        this.currentVault = currentVault;
        this.vaultToken = vaultToken;
        this.billingAddress = billingAddress;
        this.billingAddress2 = billingAddress2;
        this.billingCity = billingCity;
        this.billingCountry = billingCountry;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.paymentType = paymentType;
        this.disabled = disabled;
        this.siteGatewaySettingId = siteGatewaySettingId;
        this.customerVaultToken = customerVaultToken;
        this.gatewayHandle = gatewayHandle;
    }

    /**
     * Internal Getter for Id.
     * @return Returns the Internal String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetId() {
        return this.id;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    public String getId() {
        return OptionalNullable.getFrom(id);
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = OptionalNullable.of(id);
    }

    /**
     * UnSetter for Id.
     */
    public void unsetId() {
        id = null;
    }

    /**
     * Getter for FirstName.
     * @return Returns the String
     */
    @JsonGetter("first_name")
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
     * Getter for CardType.
     * @return Returns the String
     */
    @JsonGetter("card_type")
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
     * @return Returns the double
     */
    @JsonGetter("expiration_month")
    public double getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Setter for ExpirationMonth.
     * @param expirationMonth Value for double
     */
    @JsonSetter("expiration_month")
    public void setExpirationMonth(double expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    /**
     * Getter for ExpirationYear.
     * @return Returns the double
     */
    @JsonGetter("expiration_year")
    public double getExpirationYear() {
        return expirationYear;
    }

    /**
     * Setter for ExpirationYear.
     * @param expirationYear Value for double
     */
    @JsonSetter("expiration_year")
    public void setExpirationYear(double expirationYear) {
        this.expirationYear = expirationYear;
    }

    /**
     * Internal Getter for CustomerId.
     * @return Returns the Internal String
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCustomerId() {
        return this.customerId;
    }

    /**
     * Getter for CustomerId.
     * @return Returns the String
     */
    public String getCustomerId() {
        return OptionalNullable.getFrom(customerId);
    }

    /**
     * Setter for CustomerId.
     * @param customerId Value for String
     */
    @JsonSetter("customer_id")
    public void setCustomerId(String customerId) {
        this.customerId = OptionalNullable.of(customerId);
    }

    /**
     * UnSetter for CustomerId.
     */
    public void unsetCustomerId() {
        customerId = null;
    }

    /**
     * Getter for CurrentVault.
     * The vault that stores the payment profile with the provided `vault_token`. Use `bogus` for
     * testing.
     * @return Returns the CurrentVault
     */
    @JsonGetter("current_vault")
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
     * Getter for BillingCountry.
     * @return Returns the String
     */
    @JsonGetter("billing_country")
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
     * Getter for BillingState.
     * @return Returns the String
     */
    @JsonGetter("billing_state")
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
     * Getter for PaymentType.
     * @return Returns the String
     */
    @JsonGetter("payment_type")
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
     * Getter for Disabled.
     * @return Returns the boolean
     */
    @JsonGetter("disabled")
    public boolean getDisabled() {
        return disabled;
    }

    /**
     * Setter for Disabled.
     * @param disabled Value for boolean
     */
    @JsonSetter("disabled")
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * Getter for SiteGatewaySettingId.
     * @return Returns the int
     */
    @JsonGetter("site_gateway_setting_id")
    public int getSiteGatewaySettingId() {
        return siteGatewaySettingId;
    }

    /**
     * Setter for SiteGatewaySettingId.
     * @param siteGatewaySettingId Value for int
     */
    @JsonSetter("site_gateway_setting_id")
    public void setSiteGatewaySettingId(int siteGatewaySettingId) {
        this.siteGatewaySettingId = siteGatewaySettingId;
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
     * Converts this GetOneTimeTokenPaymentProfile into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetOneTimeTokenPaymentProfile [" + "firstName=" + firstName + ", lastName="
                + lastName + ", maskedCardNumber=" + maskedCardNumber + ", cardType=" + cardType
                + ", expirationMonth=" + expirationMonth + ", expirationYear=" + expirationYear
                + ", currentVault=" + currentVault + ", vaultToken=" + vaultToken
                + ", billingAddress=" + billingAddress + ", billingCity=" + billingCity
                + ", billingCountry=" + billingCountry + ", billingState=" + billingState
                + ", billingZip=" + billingZip + ", paymentType=" + paymentType + ", disabled="
                + disabled + ", siteGatewaySettingId=" + siteGatewaySettingId + ", id=" + id
                + ", customerId=" + customerId + ", billingAddress2=" + billingAddress2
                + ", customerVaultToken=" + customerVaultToken + ", gatewayHandle=" + gatewayHandle
                + "]";
    }

    /**
     * Builds a new {@link GetOneTimeTokenPaymentProfile.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetOneTimeTokenPaymentProfile.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(firstName, lastName, maskedCardNumber, cardType,
                expirationMonth, expirationYear, currentVault, vaultToken, billingAddress,
                billingCity, billingCountry, billingState, billingZip, paymentType, disabled,
                siteGatewaySettingId)
                .billingAddress2(getBillingAddress2());
        builder.id = internalGetId();
        builder.customerId = internalGetCustomerId();
        builder.customerVaultToken = internalGetCustomerVaultToken();
        builder.gatewayHandle = internalGetGatewayHandle();
        return builder;
    }

    /**
     * Class to build instances of {@link GetOneTimeTokenPaymentProfile}.
     */
    public static class Builder {
        private String firstName;
        private String lastName;
        private String maskedCardNumber;
        private String cardType;
        private double expirationMonth;
        private double expirationYear;
        private CurrentVault currentVault;
        private String vaultToken;
        private String billingAddress;
        private String billingCity;
        private String billingCountry;
        private String billingState;
        private String billingZip;
        private String paymentType;
        private boolean disabled;
        private int siteGatewaySettingId;
        private OptionalNullable<String> id;
        private OptionalNullable<String> customerId;
        private String billingAddress2;
        private OptionalNullable<String> customerVaultToken;
        private OptionalNullable<String> gatewayHandle;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  firstName  String value for firstName.
         * @param  lastName  String value for lastName.
         * @param  maskedCardNumber  String value for maskedCardNumber.
         * @param  cardType  String value for cardType.
         * @param  expirationMonth  double value for expirationMonth.
         * @param  expirationYear  double value for expirationYear.
         * @param  currentVault  CurrentVault value for currentVault.
         * @param  vaultToken  String value for vaultToken.
         * @param  billingAddress  String value for billingAddress.
         * @param  billingCity  String value for billingCity.
         * @param  billingCountry  String value for billingCountry.
         * @param  billingState  String value for billingState.
         * @param  billingZip  String value for billingZip.
         * @param  paymentType  String value for paymentType.
         * @param  disabled  boolean value for disabled.
         * @param  siteGatewaySettingId  int value for siteGatewaySettingId.
         */
        public Builder(String firstName, String lastName, String maskedCardNumber, String cardType,
                double expirationMonth, double expirationYear, CurrentVault currentVault,
                String vaultToken, String billingAddress, String billingCity, String billingCountry,
                String billingState, String billingZip, String paymentType, boolean disabled,
                int siteGatewaySettingId) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.maskedCardNumber = maskedCardNumber;
            this.cardType = cardType;
            this.expirationMonth = expirationMonth;
            this.expirationYear = expirationYear;
            this.currentVault = currentVault;
            this.vaultToken = vaultToken;
            this.billingAddress = billingAddress;
            this.billingCity = billingCity;
            this.billingCountry = billingCountry;
            this.billingState = billingState;
            this.billingZip = billingZip;
            this.paymentType = paymentType;
            this.disabled = disabled;
            this.siteGatewaySettingId = siteGatewaySettingId;
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
         * @param  expirationMonth  double value for expirationMonth.
         * @return Builder
         */
        public Builder expirationMonth(double expirationMonth) {
            this.expirationMonth = expirationMonth;
            return this;
        }

        /**
         * Setter for expirationYear.
         * @param  expirationYear  double value for expirationYear.
         * @return Builder
         */
        public Builder expirationYear(double expirationYear) {
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
         * Setter for billingCity.
         * @param  billingCity  String value for billingCity.
         * @return Builder
         */
        public Builder billingCity(String billingCity) {
            this.billingCity = billingCity;
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
         * Setter for paymentType.
         * @param  paymentType  String value for paymentType.
         * @return Builder
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Setter for disabled.
         * @param  disabled  boolean value for disabled.
         * @return Builder
         */
        public Builder disabled(boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * Setter for siteGatewaySettingId.
         * @param  siteGatewaySettingId  int value for siteGatewaySettingId.
         * @return Builder
         */
        public Builder siteGatewaySettingId(int siteGatewaySettingId) {
            this.siteGatewaySettingId = siteGatewaySettingId;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = OptionalNullable.of(id);
            return this;
        }

        /**
         * UnSetter for id.
         * @return Builder
         */
        public Builder unsetId() {
            id = null;
            return this;
        }

        /**
         * Setter for customerId.
         * @param  customerId  String value for customerId.
         * @return Builder
         */
        public Builder customerId(String customerId) {
            this.customerId = OptionalNullable.of(customerId);
            return this;
        }

        /**
         * UnSetter for customerId.
         * @return Builder
         */
        public Builder unsetCustomerId() {
            customerId = null;
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
         * Builds a new {@link GetOneTimeTokenPaymentProfile} object using the set fields.
         * @return {@link GetOneTimeTokenPaymentProfile}
         */
        public GetOneTimeTokenPaymentProfile build() {
            return new GetOneTimeTokenPaymentProfile(firstName, lastName, maskedCardNumber,
                    cardType, expirationMonth, expirationYear, currentVault, vaultToken,
                    billingAddress, billingCity, billingCountry, billingState, billingZip,
                    paymentType, disabled, siteGatewaySettingId, id, customerId, billingAddress2,
                    customerVaultToken, gatewayHandle);
        }
    }
}
