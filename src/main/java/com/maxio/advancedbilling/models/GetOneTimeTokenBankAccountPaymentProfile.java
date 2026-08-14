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
 * This is a model class for GetOneTimeTokenBankAccountPaymentProfile type.
 */
public class GetOneTimeTokenBankAccountPaymentProfile
        extends BaseModel {
    private OptionalNullable<String> id;
    private String firstName;
    private String lastName;
    private OptionalNullable<String> customerId;
    private BankAccountVault currentVault;
    private String vaultToken;
    private String billingAddress;
    private String billingAddress2;
    private String billingCity;
    private String billingCountry;
    private String billingState;
    private String billingZip;
    private String bankName;
    private String maskedBankRoutingNumber;
    private String maskedBankAccountNumber;
    private BankAccountType bankAccountType;
    private BankAccountHolderType bankAccountHolderType;
    private String paymentType;
    private boolean disabled;
    private int siteGatewaySettingId;
    private OptionalNullable<String> customerVaultToken;
    private OptionalNullable<String> gatewayHandle;
    private OptionalNullable<Boolean> verified;

    /**
     * Default constructor.
     */
    public GetOneTimeTokenBankAccountPaymentProfile() {
    }

    /**
     * Initialization constructor.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  currentVault  BankAccountVault value for currentVault.
     * @param  vaultToken  String value for vaultToken.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingCity  String value for billingCity.
     * @param  billingCountry  String value for billingCountry.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  bankName  String value for bankName.
     * @param  maskedBankRoutingNumber  String value for maskedBankRoutingNumber.
     * @param  maskedBankAccountNumber  String value for maskedBankAccountNumber.
     * @param  bankAccountType  BankAccountType value for bankAccountType.
     * @param  bankAccountHolderType  BankAccountHolderType value for bankAccountHolderType.
     * @param  paymentType  String value for paymentType.
     * @param  disabled  boolean value for disabled.
     * @param  siteGatewaySettingId  int value for siteGatewaySettingId.
     * @param  id  String value for id.
     * @param  customerId  String value for customerId.
     * @param  billingAddress2  String value for billingAddress2.
     * @param  customerVaultToken  String value for customerVaultToken.
     * @param  gatewayHandle  String value for gatewayHandle.
     * @param  verified  Boolean value for verified.
     */
    public GetOneTimeTokenBankAccountPaymentProfile(
            String firstName,
            String lastName,
            BankAccountVault currentVault,
            String vaultToken,
            String billingAddress,
            String billingCity,
            String billingCountry,
            String billingState,
            String billingZip,
            String bankName,
            String maskedBankRoutingNumber,
            String maskedBankAccountNumber,
            BankAccountType bankAccountType,
            BankAccountHolderType bankAccountHolderType,
            String paymentType,
            boolean disabled,
            int siteGatewaySettingId,
            String id,
            String customerId,
            String billingAddress2,
            String customerVaultToken,
            String gatewayHandle,
            Boolean verified) {
        this.id = OptionalNullable.of(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerId = OptionalNullable.of(customerId);
        this.currentVault = currentVault;
        this.vaultToken = vaultToken;
        this.billingAddress = billingAddress;
        this.billingAddress2 = billingAddress2;
        this.billingCity = billingCity;
        this.billingCountry = billingCountry;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.bankName = bankName;
        this.maskedBankRoutingNumber = maskedBankRoutingNumber;
        this.maskedBankAccountNumber = maskedBankAccountNumber;
        this.bankAccountType = bankAccountType;
        this.bankAccountHolderType = bankAccountHolderType;
        this.paymentType = paymentType;
        this.disabled = disabled;
        this.siteGatewaySettingId = siteGatewaySettingId;
        this.customerVaultToken = OptionalNullable.of(customerVaultToken);
        this.gatewayHandle = OptionalNullable.of(gatewayHandle);
        this.verified = OptionalNullable.of(verified);
    }

    /**
     * Initialization constructor.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  currentVault  BankAccountVault value for currentVault.
     * @param  vaultToken  String value for vaultToken.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingCity  String value for billingCity.
     * @param  billingCountry  String value for billingCountry.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  bankName  String value for bankName.
     * @param  maskedBankRoutingNumber  String value for maskedBankRoutingNumber.
     * @param  maskedBankAccountNumber  String value for maskedBankAccountNumber.
     * @param  bankAccountType  BankAccountType value for bankAccountType.
     * @param  bankAccountHolderType  BankAccountHolderType value for bankAccountHolderType.
     * @param  paymentType  String value for paymentType.
     * @param  disabled  boolean value for disabled.
     * @param  siteGatewaySettingId  int value for siteGatewaySettingId.
     * @param  id  String value for id.
     * @param  customerId  String value for customerId.
     * @param  billingAddress2  String value for billingAddress2.
     * @param  customerVaultToken  String value for customerVaultToken.
     * @param  gatewayHandle  String value for gatewayHandle.
     * @param  verified  Boolean value for verified.
     */

    protected GetOneTimeTokenBankAccountPaymentProfile(String firstName, String lastName,
            BankAccountVault currentVault, String vaultToken, String billingAddress,
            String billingCity, String billingCountry, String billingState, String billingZip,
            String bankName, String maskedBankRoutingNumber, String maskedBankAccountNumber,
            BankAccountType bankAccountType, BankAccountHolderType bankAccountHolderType,
            String paymentType, boolean disabled, int siteGatewaySettingId,
            OptionalNullable<String> id, OptionalNullable<String> customerId,
            String billingAddress2, OptionalNullable<String> customerVaultToken,
            OptionalNullable<String> gatewayHandle, OptionalNullable<Boolean> verified) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerId = customerId;
        this.currentVault = currentVault;
        this.vaultToken = vaultToken;
        this.billingAddress = billingAddress;
        this.billingAddress2 = billingAddress2;
        this.billingCity = billingCity;
        this.billingCountry = billingCountry;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.bankName = bankName;
        this.maskedBankRoutingNumber = maskedBankRoutingNumber;
        this.maskedBankAccountNumber = maskedBankAccountNumber;
        this.bankAccountType = bankAccountType;
        this.bankAccountHolderType = bankAccountHolderType;
        this.paymentType = paymentType;
        this.disabled = disabled;
        this.siteGatewaySettingId = siteGatewaySettingId;
        this.customerVaultToken = customerVaultToken;
        this.gatewayHandle = gatewayHandle;
        this.verified = verified;
    }

    /**
     * Initialization constructor.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  currentVault  BankAccountVault value for currentVault.
     * @param  vaultToken  String value for vaultToken.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingCity  String value for billingCity.
     * @param  billingCountry  String value for billingCountry.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  bankName  String value for bankName.
     * @param  maskedBankRoutingNumber  String value for maskedBankRoutingNumber.
     * @param  maskedBankAccountNumber  String value for maskedBankAccountNumber.
     * @param  bankAccountType  BankAccountType value for bankAccountType.
     * @param  bankAccountHolderType  BankAccountHolderType value for bankAccountHolderType.
     * @param  paymentType  String value for paymentType.
     * @param  disabled  boolean value for disabled.
     * @param  siteGatewaySettingId  int value for siteGatewaySettingId.
     */
    @JsonCreator
    protected GetOneTimeTokenBankAccountPaymentProfile(
            @JsonProperty("first_name") String firstName,
            @JsonProperty("last_name") String lastName,
            @JsonProperty("current_vault") BankAccountVault currentVault,
            @JsonProperty("vault_token") String vaultToken,
            @JsonProperty("billing_address") String billingAddress,
            @JsonProperty("billing_city") String billingCity,
            @JsonProperty("billing_country") String billingCountry,
            @JsonProperty("billing_state") String billingState,
            @JsonProperty("billing_zip") String billingZip,
            @JsonProperty("bank_name") String bankName,
            @JsonProperty("masked_bank_routing_number") String maskedBankRoutingNumber,
            @JsonProperty("masked_bank_account_number") String maskedBankAccountNumber,
            @JsonProperty("bank_account_type") BankAccountType bankAccountType,
            @JsonProperty("bank_account_holder_type") BankAccountHolderType bankAccountHolderType,
            @JsonProperty("payment_type") String paymentType,
            @JsonProperty("disabled") boolean disabled,
            @JsonProperty("site_gateway_setting_id") int siteGatewaySettingId) {
        this(firstName, lastName, currentVault, vaultToken, billingAddress, billingCity,
                billingCountry, billingState, billingZip, bankName, maskedBankRoutingNumber,
                maskedBankAccountNumber, bankAccountType, bankAccountHolderType, paymentType,
                disabled, siteGatewaySettingId, OptionalNullable.of(null),
                OptionalNullable.of(null), null, OptionalNullable.of(null),
                OptionalNullable.of(null), OptionalNullable.of(null));
        unsetId();
        unsetCustomerId();
        unsetCustomerVaultToken();
        unsetGatewayHandle();
        unsetVerified();
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
     * The vault that stores the payment profile with the provided vault_token. Use `bogus` for
     * testing.
     * @return Returns the BankAccountVault
     */
    @JsonGetter("current_vault")
    public BankAccountVault getCurrentVault() {
        return currentVault;
    }

    /**
     * Setter for CurrentVault.
     * The vault that stores the payment profile with the provided vault_token. Use `bogus` for
     * testing.
     * @param currentVault Value for BankAccountVault
     */
    @JsonSetter("current_vault")
    public void setCurrentVault(BankAccountVault currentVault) {
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
     * Getter for BankName.
     * @return Returns the String
     */
    @JsonGetter("bank_name")
    public String getBankName() {
        return bankName;
    }

    /**
     * Setter for BankName.
     * @param bankName Value for String
     */
    @JsonSetter("bank_name")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * Getter for MaskedBankRoutingNumber.
     * @return Returns the String
     */
    @JsonGetter("masked_bank_routing_number")
    public String getMaskedBankRoutingNumber() {
        return maskedBankRoutingNumber;
    }

    /**
     * Setter for MaskedBankRoutingNumber.
     * @param maskedBankRoutingNumber Value for String
     */
    @JsonSetter("masked_bank_routing_number")
    public void setMaskedBankRoutingNumber(String maskedBankRoutingNumber) {
        this.maskedBankRoutingNumber = maskedBankRoutingNumber;
    }

    /**
     * Getter for MaskedBankAccountNumber.
     * @return Returns the String
     */
    @JsonGetter("masked_bank_account_number")
    public String getMaskedBankAccountNumber() {
        return maskedBankAccountNumber;
    }

    /**
     * Setter for MaskedBankAccountNumber.
     * @param maskedBankAccountNumber Value for String
     */
    @JsonSetter("masked_bank_account_number")
    public void setMaskedBankAccountNumber(String maskedBankAccountNumber) {
        this.maskedBankAccountNumber = maskedBankAccountNumber;
    }

    /**
     * Getter for BankAccountType.
     * Defaults to checking
     * @return Returns the BankAccountType
     */
    @JsonGetter("bank_account_type")
    public BankAccountType getBankAccountType() {
        return bankAccountType;
    }

    /**
     * Setter for BankAccountType.
     * Defaults to checking
     * @param bankAccountType Value for BankAccountType
     */
    @JsonSetter("bank_account_type")
    public void setBankAccountType(BankAccountType bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    /**
     * Getter for BankAccountHolderType.
     * Defaults to personal
     * @return Returns the BankAccountHolderType
     */
    @JsonGetter("bank_account_holder_type")
    public BankAccountHolderType getBankAccountHolderType() {
        return bankAccountHolderType;
    }

    /**
     * Setter for BankAccountHolderType.
     * Defaults to personal
     * @param bankAccountHolderType Value for BankAccountHolderType
     */
    @JsonSetter("bank_account_holder_type")
    public void setBankAccountHolderType(BankAccountHolderType bankAccountHolderType) {
        this.bankAccountHolderType = bankAccountHolderType;
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
     * Internal Getter for Verified.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("verified")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetVerified() {
        return this.verified;
    }

    /**
     * Getter for Verified.
     * @return Returns the Boolean
     */
    public Boolean getVerified() {
        return OptionalNullable.getFrom(verified);
    }

    /**
     * Setter for Verified.
     * @param verified Value for Boolean
     */
    @JsonSetter("verified")
    public void setVerified(Boolean verified) {
        this.verified = OptionalNullable.of(verified);
    }

    /**
     * UnSetter for Verified.
     */
    public void unsetVerified() {
        verified = null;
    }

    /**
     * Converts this GetOneTimeTokenBankAccountPaymentProfile into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetOneTimeTokenBankAccountPaymentProfile [" + "firstName=" + firstName
                + ", lastName=" + lastName + ", currentVault=" + currentVault + ", vaultToken="
                + vaultToken + ", billingAddress=" + billingAddress + ", billingCity=" + billingCity
                + ", billingCountry=" + billingCountry + ", billingState=" + billingState
                + ", billingZip=" + billingZip + ", bankName=" + bankName
                + ", maskedBankRoutingNumber=" + maskedBankRoutingNumber
                + ", maskedBankAccountNumber=" + maskedBankAccountNumber + ", bankAccountType="
                + bankAccountType + ", bankAccountHolderType=" + bankAccountHolderType
                + ", paymentType=" + paymentType + ", disabled=" + disabled
                + ", siteGatewaySettingId=" + siteGatewaySettingId + ", id=" + id + ", customerId="
                + customerId + ", billingAddress2=" + billingAddress2 + ", customerVaultToken="
                + customerVaultToken + ", gatewayHandle=" + gatewayHandle + ", verified=" + verified
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link GetOneTimeTokenBankAccountPaymentProfile.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetOneTimeTokenBankAccountPaymentProfile.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(firstName, lastName, currentVault, vaultToken, billingAddress,
                billingCity, billingCountry, billingState, billingZip, bankName,
                maskedBankRoutingNumber, maskedBankAccountNumber, bankAccountType,
                bankAccountHolderType, paymentType, disabled, siteGatewaySettingId)
                .billingAddress2(getBillingAddress2());
        builder.id = internalGetId();
        builder.customerId = internalGetCustomerId();
        builder.customerVaultToken = internalGetCustomerVaultToken();
        builder.gatewayHandle = internalGetGatewayHandle();
        builder.verified = internalGetVerified();
        return builder;
    }

    /**
     * Class to build instances of {@link GetOneTimeTokenBankAccountPaymentProfile}.
     */
    public static class Builder {
        private String firstName;
        private String lastName;
        private BankAccountVault currentVault;
        private String vaultToken;
        private String billingAddress;
        private String billingCity;
        private String billingCountry;
        private String billingState;
        private String billingZip;
        private String bankName;
        private String maskedBankRoutingNumber;
        private String maskedBankAccountNumber;
        private BankAccountType bankAccountType;
        private BankAccountHolderType bankAccountHolderType;
        private String paymentType;
        private boolean disabled;
        private int siteGatewaySettingId;
        private OptionalNullable<String> id;
        private OptionalNullable<String> customerId;
        private String billingAddress2;
        private OptionalNullable<String> customerVaultToken;
        private OptionalNullable<String> gatewayHandle;
        private OptionalNullable<Boolean> verified;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  firstName  String value for firstName.
         * @param  lastName  String value for lastName.
         * @param  currentVault  BankAccountVault value for currentVault.
         * @param  vaultToken  String value for vaultToken.
         * @param  billingAddress  String value for billingAddress.
         * @param  billingCity  String value for billingCity.
         * @param  billingCountry  String value for billingCountry.
         * @param  billingState  String value for billingState.
         * @param  billingZip  String value for billingZip.
         * @param  bankName  String value for bankName.
         * @param  maskedBankRoutingNumber  String value for maskedBankRoutingNumber.
         * @param  maskedBankAccountNumber  String value for maskedBankAccountNumber.
         * @param  bankAccountType  BankAccountType value for bankAccountType.
         * @param  bankAccountHolderType  BankAccountHolderType value for bankAccountHolderType.
         * @param  paymentType  String value for paymentType.
         * @param  disabled  boolean value for disabled.
         * @param  siteGatewaySettingId  int value for siteGatewaySettingId.
         */
        public Builder(String firstName, String lastName, BankAccountVault currentVault,
                String vaultToken, String billingAddress, String billingCity, String billingCountry,
                String billingState, String billingZip, String bankName,
                String maskedBankRoutingNumber, String maskedBankAccountNumber,
                BankAccountType bankAccountType, BankAccountHolderType bankAccountHolderType,
                String paymentType, boolean disabled, int siteGatewaySettingId) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.currentVault = currentVault;
            this.vaultToken = vaultToken;
            this.billingAddress = billingAddress;
            this.billingCity = billingCity;
            this.billingCountry = billingCountry;
            this.billingState = billingState;
            this.billingZip = billingZip;
            this.bankName = bankName;
            this.maskedBankRoutingNumber = maskedBankRoutingNumber;
            this.maskedBankAccountNumber = maskedBankAccountNumber;
            this.bankAccountType = bankAccountType;
            this.bankAccountHolderType = bankAccountHolderType;
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
         * Setter for currentVault.
         * @param  currentVault  BankAccountVault value for currentVault.
         * @return Builder
         */
        public Builder currentVault(BankAccountVault currentVault) {
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
         * Setter for bankName.
         * @param  bankName  String value for bankName.
         * @return Builder
         */
        public Builder bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        /**
         * Setter for maskedBankRoutingNumber.
         * @param  maskedBankRoutingNumber  String value for maskedBankRoutingNumber.
         * @return Builder
         */
        public Builder maskedBankRoutingNumber(String maskedBankRoutingNumber) {
            this.maskedBankRoutingNumber = maskedBankRoutingNumber;
            return this;
        }

        /**
         * Setter for maskedBankAccountNumber.
         * @param  maskedBankAccountNumber  String value for maskedBankAccountNumber.
         * @return Builder
         */
        public Builder maskedBankAccountNumber(String maskedBankAccountNumber) {
            this.maskedBankAccountNumber = maskedBankAccountNumber;
            return this;
        }

        /**
         * Setter for bankAccountType.
         * @param  bankAccountType  BankAccountType value for bankAccountType.
         * @return Builder
         */
        public Builder bankAccountType(BankAccountType bankAccountType) {
            this.bankAccountType = bankAccountType;
            return this;
        }

        /**
         * Setter for bankAccountHolderType.
         * @param  bankAccountHolderType  BankAccountHolderType value for bankAccountHolderType.
         * @return Builder
         */
        public Builder bankAccountHolderType(BankAccountHolderType bankAccountHolderType) {
            this.bankAccountHolderType = bankAccountHolderType;
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
         * Setter for verified.
         * @param  verified  Boolean value for verified.
         * @return Builder
         */
        public Builder verified(Boolean verified) {
            this.verified = OptionalNullable.of(verified);
            return this;
        }

        /**
         * UnSetter for verified.
         * @return Builder
         */
        public Builder unsetVerified() {
            verified = null;
            return this;
        }

        /**
         * Builds a new {@link GetOneTimeTokenBankAccountPaymentProfile} object using the set
         * fields.
         * @return {@link GetOneTimeTokenBankAccountPaymentProfile}
         */
        public GetOneTimeTokenBankAccountPaymentProfile build() {
            return new GetOneTimeTokenBankAccountPaymentProfile(firstName, lastName, currentVault,
                    vaultToken, billingAddress, billingCity, billingCountry, billingState,
                    billingZip, bankName, maskedBankRoutingNumber, maskedBankAccountNumber,
                    bankAccountType, bankAccountHolderType, paymentType, disabled,
                    siteGatewaySettingId, id, customerId, billingAddress2, customerVaultToken,
                    gatewayHandle, verified);
        }
    }
}
