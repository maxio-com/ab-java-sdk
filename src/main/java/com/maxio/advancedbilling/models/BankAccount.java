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
 * This is a model class for BankAccount type.
 */
public class BankAccount {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer customerId;
    private BankAccountVault currentVault;
    private String vaultToken;
    private String billingAddress;
    private String billingCity;
    private String billingState;
    private String billingZip;
    private String billingCountry;
    private OptionalNullable<String> customerVaultToken;
    private String billingAddress2;
    private String bankName;
    private String maskedBankRoutingNumber;
    private String maskedBankAccountNumber;
    private String bankAccountType;
    private String bankAccountHolderType;
    private String paymentType;
    private Boolean verified;
    private Integer siteGatewaySettingId;
    private String gatewayHandle;

    /**
     * Default constructor.
     */
    public BankAccount() {
        verified = false;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  customerId  Integer value for customerId.
     * @param  currentVault  BankAccountVault value for currentVault.
     * @param  vaultToken  String value for vaultToken.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingCity  String value for billingCity.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  billingCountry  String value for billingCountry.
     * @param  customerVaultToken  String value for customerVaultToken.
     * @param  billingAddress2  String value for billingAddress2.
     * @param  bankName  String value for bankName.
     * @param  maskedBankRoutingNumber  String value for maskedBankRoutingNumber.
     * @param  maskedBankAccountNumber  String value for maskedBankAccountNumber.
     * @param  bankAccountType  String value for bankAccountType.
     * @param  bankAccountHolderType  String value for bankAccountHolderType.
     * @param  paymentType  String value for paymentType.
     * @param  verified  Boolean value for verified.
     * @param  siteGatewaySettingId  Integer value for siteGatewaySettingId.
     * @param  gatewayHandle  String value for gatewayHandle.
     */
    public BankAccount(
            Integer id,
            String firstName,
            String lastName,
            Integer customerId,
            BankAccountVault currentVault,
            String vaultToken,
            String billingAddress,
            String billingCity,
            String billingState,
            String billingZip,
            String billingCountry,
            String customerVaultToken,
            String billingAddress2,
            String bankName,
            String maskedBankRoutingNumber,
            String maskedBankAccountNumber,
            String bankAccountType,
            String bankAccountHolderType,
            String paymentType,
            Boolean verified,
            Integer siteGatewaySettingId,
            String gatewayHandle) {
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
        this.customerVaultToken = OptionalNullable.of(customerVaultToken);
        this.billingAddress2 = billingAddress2;
        this.bankName = bankName;
        this.maskedBankRoutingNumber = maskedBankRoutingNumber;
        this.maskedBankAccountNumber = maskedBankAccountNumber;
        this.bankAccountType = bankAccountType;
        this.bankAccountHolderType = bankAccountHolderType;
        this.paymentType = paymentType;
        this.verified = verified;
        this.siteGatewaySettingId = siteGatewaySettingId;
        this.gatewayHandle = gatewayHandle;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  customerId  Integer value for customerId.
     * @param  currentVault  BankAccountVault value for currentVault.
     * @param  vaultToken  String value for vaultToken.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingCity  String value for billingCity.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  billingCountry  String value for billingCountry.
     * @param  customerVaultToken  String value for customerVaultToken.
     * @param  billingAddress2  String value for billingAddress2.
     * @param  bankName  String value for bankName.
     * @param  maskedBankRoutingNumber  String value for maskedBankRoutingNumber.
     * @param  maskedBankAccountNumber  String value for maskedBankAccountNumber.
     * @param  bankAccountType  String value for bankAccountType.
     * @param  bankAccountHolderType  String value for bankAccountHolderType.
     * @param  paymentType  String value for paymentType.
     * @param  verified  Boolean value for verified.
     * @param  siteGatewaySettingId  Integer value for siteGatewaySettingId.
     * @param  gatewayHandle  String value for gatewayHandle.
     */

    protected BankAccount(Integer id, String firstName, String lastName, Integer customerId,
            BankAccountVault currentVault, String vaultToken, String billingAddress,
            String billingCity, String billingState, String billingZip, String billingCountry,
            OptionalNullable<String> customerVaultToken, String billingAddress2, String bankName,
            String maskedBankRoutingNumber, String maskedBankAccountNumber, String bankAccountType,
            String bankAccountHolderType, String paymentType, Boolean verified,
            Integer siteGatewaySettingId, String gatewayHandle) {
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
        this.bankName = bankName;
        this.maskedBankRoutingNumber = maskedBankRoutingNumber;
        this.maskedBankAccountNumber = maskedBankAccountNumber;
        this.bankAccountType = bankAccountType;
        this.bankAccountHolderType = bankAccountHolderType;
        this.paymentType = paymentType;
        this.verified = verified;
        this.siteGatewaySettingId = siteGatewaySettingId;
        this.gatewayHandle = gatewayHandle;
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
     * The vault that stores the payment profile with the provided vault_token.
     * @return Returns the BankAccountVault
     */
    @JsonGetter("current_vault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankAccountVault getCurrentVault() {
        return currentVault;
    }

    /**
     * Setter for CurrentVault.
     * The vault that stores the payment profile with the provided vault_token.
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
     * Getter for BankName.
     * @return Returns the String
     */
    @JsonGetter("bank_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * @return Returns the String
     */
    @JsonGetter("bank_account_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankAccountType() {
        return bankAccountType;
    }

    /**
     * Setter for BankAccountType.
     * @param bankAccountType Value for String
     */
    @JsonSetter("bank_account_type")
    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    /**
     * Getter for BankAccountHolderType.
     * @return Returns the String
     */
    @JsonGetter("bank_account_holder_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankAccountHolderType() {
        return bankAccountHolderType;
    }

    /**
     * Setter for BankAccountHolderType.
     * @param bankAccountHolderType Value for String
     */
    @JsonSetter("bank_account_holder_type")
    public void setBankAccountHolderType(String bankAccountHolderType) {
        this.bankAccountHolderType = bankAccountHolderType;
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
     * Getter for Verified.
     * denotes whether a bank account has been verified by providing the amounts of two small
     * deposits made into the account
     * @return Returns the Boolean
     */
    @JsonGetter("verified")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getVerified() {
        return verified;
    }

    /**
     * Setter for Verified.
     * denotes whether a bank account has been verified by providing the amounts of two small
     * deposits made into the account
     * @param verified Value for Boolean
     */
    @JsonSetter("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
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
     * Converts this BankAccount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccount [" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
                + ", customerId=" + customerId + ", currentVault=" + currentVault + ", vaultToken="
                + vaultToken + ", billingAddress=" + billingAddress + ", billingCity=" + billingCity
                + ", billingState=" + billingState + ", billingZip=" + billingZip
                + ", billingCountry=" + billingCountry + ", customerVaultToken="
                + customerVaultToken + ", billingAddress2=" + billingAddress2 + ", bankName="
                + bankName + ", maskedBankRoutingNumber=" + maskedBankRoutingNumber
                + ", maskedBankAccountNumber=" + maskedBankAccountNumber + ", bankAccountType="
                + bankAccountType + ", bankAccountHolderType=" + bankAccountHolderType
                + ", paymentType=" + paymentType + ", verified=" + verified
                + ", siteGatewaySettingId=" + siteGatewaySettingId + ", gatewayHandle="
                + gatewayHandle + "]";
    }

    /**
     * Builds a new {@link BankAccount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankAccount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .firstName(getFirstName())
                .lastName(getLastName())
                .customerId(getCustomerId())
                .currentVault(getCurrentVault())
                .vaultToken(getVaultToken())
                .billingAddress(getBillingAddress())
                .billingCity(getBillingCity())
                .billingState(getBillingState())
                .billingZip(getBillingZip())
                .billingCountry(getBillingCountry())
                .billingAddress2(getBillingAddress2())
                .bankName(getBankName())
                .maskedBankRoutingNumber(getMaskedBankRoutingNumber())
                .maskedBankAccountNumber(getMaskedBankAccountNumber())
                .bankAccountType(getBankAccountType())
                .bankAccountHolderType(getBankAccountHolderType())
                .paymentType(getPaymentType())
                .verified(getVerified())
                .siteGatewaySettingId(getSiteGatewaySettingId())
                .gatewayHandle(getGatewayHandle());
        builder.customerVaultToken = internalGetCustomerVaultToken();
        return builder;
    }

    /**
     * Class to build instances of {@link BankAccount}.
     */
    public static class Builder {
        private Integer id;
        private String firstName;
        private String lastName;
        private Integer customerId;
        private BankAccountVault currentVault;
        private String vaultToken;
        private String billingAddress;
        private String billingCity;
        private String billingState;
        private String billingZip;
        private String billingCountry;
        private OptionalNullable<String> customerVaultToken;
        private String billingAddress2;
        private String bankName;
        private String maskedBankRoutingNumber;
        private String maskedBankAccountNumber;
        private String bankAccountType;
        private String bankAccountHolderType;
        private String paymentType;
        private Boolean verified = false;
        private Integer siteGatewaySettingId;
        private String gatewayHandle;



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
            this.billingAddress2 = billingAddress2;
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
         * @param  bankAccountType  String value for bankAccountType.
         * @return Builder
         */
        public Builder bankAccountType(String bankAccountType) {
            this.bankAccountType = bankAccountType;
            return this;
        }

        /**
         * Setter for bankAccountHolderType.
         * @param  bankAccountHolderType  String value for bankAccountHolderType.
         * @return Builder
         */
        public Builder bankAccountHolderType(String bankAccountHolderType) {
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
         * Setter for verified.
         * @param  verified  Boolean value for verified.
         * @return Builder
         */
        public Builder verified(Boolean verified) {
            this.verified = verified;
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
            this.gatewayHandle = gatewayHandle;
            return this;
        }

        /**
         * Builds a new {@link BankAccount} object using the set fields.
         * @return {@link BankAccount}
         */
        public BankAccount build() {
            return new BankAccount(id, firstName, lastName, customerId, currentVault, vaultToken,
                    billingAddress, billingCity, billingState, billingZip, billingCountry,
                    customerVaultToken, billingAddress2, bankName, maskedBankRoutingNumber,
                    maskedBankAccountNumber, bankAccountType, bankAccountHolderType, paymentType,
                    verified, siteGatewaySettingId, gatewayHandle);
        }
    }
}
