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
 * This is a model class for SubscriptionBankAccount type.
 */
public class SubscriptionBankAccount {
    private String bankAccountHolderType;
    private String bankAccountType;
    private String bankName;
    private String billingAddress;
    private String billingAddress2;
    private String billingCity;
    private String billingState;
    private String billingZip;
    private String billingCountry;
    private BankAccountVault currentVault;
    private Integer customerId;
    private String customerVaultToken;
    private String firstName;
    private String lastName;
    private Integer id;
    private String maskedBankAccountNumber;
    private String maskedBankRoutingNumber;
    private String vaultToken;
    private String chargifyToken;
    private Integer siteGatewaySettingId;
    private String gatewayHandle;

    /**
     * Default constructor.
     */
    public SubscriptionBankAccount() {
    }

    /**
     * Initialization constructor.
     * @param  bankAccountHolderType  String value for bankAccountHolderType.
     * @param  bankAccountType  String value for bankAccountType.
     * @param  bankName  String value for bankName.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingAddress2  String value for billingAddress2.
     * @param  billingCity  String value for billingCity.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  billingCountry  String value for billingCountry.
     * @param  currentVault  BankAccountVault value for currentVault.
     * @param  customerId  Integer value for customerId.
     * @param  customerVaultToken  String value for customerVaultToken.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  id  Integer value for id.
     * @param  maskedBankAccountNumber  String value for maskedBankAccountNumber.
     * @param  maskedBankRoutingNumber  String value for maskedBankRoutingNumber.
     * @param  vaultToken  String value for vaultToken.
     * @param  chargifyToken  String value for chargifyToken.
     * @param  siteGatewaySettingId  Integer value for siteGatewaySettingId.
     * @param  gatewayHandle  String value for gatewayHandle.
     */
    public SubscriptionBankAccount(
            String bankAccountHolderType,
            String bankAccountType,
            String bankName,
            String billingAddress,
            String billingAddress2,
            String billingCity,
            String billingState,
            String billingZip,
            String billingCountry,
            BankAccountVault currentVault,
            Integer customerId,
            String customerVaultToken,
            String firstName,
            String lastName,
            Integer id,
            String maskedBankAccountNumber,
            String maskedBankRoutingNumber,
            String vaultToken,
            String chargifyToken,
            Integer siteGatewaySettingId,
            String gatewayHandle) {
        this.bankAccountHolderType = bankAccountHolderType;
        this.bankAccountType = bankAccountType;
        this.bankName = bankName;
        this.billingAddress = billingAddress;
        this.billingAddress2 = billingAddress2;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.billingCountry = billingCountry;
        this.currentVault = currentVault;
        this.customerId = customerId;
        this.customerVaultToken = customerVaultToken;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.maskedBankAccountNumber = maskedBankAccountNumber;
        this.maskedBankRoutingNumber = maskedBankRoutingNumber;
        this.vaultToken = vaultToken;
        this.chargifyToken = chargifyToken;
        this.siteGatewaySettingId = siteGatewaySettingId;
        this.gatewayHandle = gatewayHandle;
    }

    /**
     * Getter for BankAccountHolderType.
     * Defaults to personal
     * @return Returns the String
     */
    @JsonGetter("bank_account_holder_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankAccountHolderType() {
        return bankAccountHolderType;
    }

    /**
     * Setter for BankAccountHolderType.
     * Defaults to personal
     * @param bankAccountHolderType Value for String
     */
    @JsonSetter("bank_account_holder_type")
    public void setBankAccountHolderType(String bankAccountHolderType) {
        this.bankAccountHolderType = bankAccountHolderType;
    }

    /**
     * Getter for BankAccountType.
     * Defaults to checking
     * @return Returns the String
     */
    @JsonGetter("bank_account_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankAccountType() {
        return bankAccountType;
    }

    /**
     * Setter for BankAccountType.
     * Defaults to checking
     * @param bankAccountType Value for String
     */
    @JsonSetter("bank_account_type")
    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    /**
     * Getter for BankName.
     * The bank where the account resides
     * @return Returns the String
     */
    @JsonGetter("bank_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankName() {
        return bankName;
    }

    /**
     * Setter for BankName.
     * The bank where the account resides
     * @param bankName Value for String
     */
    @JsonSetter("bank_name")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * Getter for BillingAddress.
     * The current billing street address for the bank account
     * @return Returns the String
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * The current billing street address for the bank account
     * @param billingAddress Value for String
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for BillingAddress2.
     * The current billing street address, second line, for the bank account
     * @return Returns the String
     */
    @JsonGetter("billing_address_2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingAddress2() {
        return billingAddress2;
    }

    /**
     * Setter for BillingAddress2.
     * The current billing street address, second line, for the bank account
     * @param billingAddress2 Value for String
     */
    @JsonSetter("billing_address_2")
    public void setBillingAddress2(String billingAddress2) {
        this.billingAddress2 = billingAddress2;
    }

    /**
     * Getter for BillingCity.
     * The current billing address city for the bank account
     * @return Returns the String
     */
    @JsonGetter("billing_city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * Setter for BillingCity.
     * The current billing address city for the bank account
     * @param billingCity Value for String
     */
    @JsonSetter("billing_city")
    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    /**
     * Getter for BillingState.
     * The current billing address state for the bank account
     * @return Returns the String
     */
    @JsonGetter("billing_state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingState() {
        return billingState;
    }

    /**
     * Setter for BillingState.
     * The current billing address state for the bank account
     * @param billingState Value for String
     */
    @JsonSetter("billing_state")
    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    /**
     * Getter for BillingZip.
     * The current billing address zip code for the bank account
     * @return Returns the String
     */
    @JsonGetter("billing_zip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingZip() {
        return billingZip;
    }

    /**
     * Setter for BillingZip.
     * The current billing address zip code for the bank account
     * @param billingZip Value for String
     */
    @JsonSetter("billing_zip")
    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    /**
     * Getter for BillingCountry.
     * The current billing address country for the bank account
     * @return Returns the String
     */
    @JsonGetter("billing_country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingCountry() {
        return billingCountry;
    }

    /**
     * Setter for BillingCountry.
     * The current billing address country for the bank account
     * @param billingCountry Value for String
     */
    @JsonSetter("billing_country")
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
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
     * Getter for CustomerId.
     * The Chargify-assigned id for the customer record to which the bank account belongs
     * @return Returns the Integer
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * The Chargify-assigned id for the customer record to which the bank account belongs
     * @param customerId Value for Integer
     */
    @JsonSetter("customer_id")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for CustomerVaultToken.
     * (only for Authorize.Net CIM storage): the customerProfileId for the owner of the
     * customerPaymentProfileId provided as the vault_token
     * @return Returns the String
     */
    @JsonGetter("customer_vault_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomerVaultToken() {
        return customerVaultToken;
    }

    /**
     * Setter for CustomerVaultToken.
     * (only for Authorize.Net CIM storage): the customerProfileId for the owner of the
     * customerPaymentProfileId provided as the vault_token
     * @param customerVaultToken Value for String
     */
    @JsonSetter("customer_vault_token")
    public void setCustomerVaultToken(String customerVaultToken) {
        this.customerVaultToken = customerVaultToken;
    }

    /**
     * Getter for FirstName.
     * The first name of the bank account holder
     * @return Returns the String
     */
    @JsonGetter("first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * The first name of the bank account holder
     * @param firstName Value for String
     */
    @JsonSetter("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * The last name of the bank account holder
     * @return Returns the String
     */
    @JsonGetter("last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * The last name of the bank account holder
     * @param lastName Value for String
     */
    @JsonSetter("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for Id.
     * The Chargify-assigned ID of the stored bank account. This value can be used as an input to
     * payment_profile_id when creating a subscription, in order to re-use a stored payment profile
     * for the same customer
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The Chargify-assigned ID of the stored bank account. This value can be used as an input to
     * payment_profile_id when creating a subscription, in order to re-use a stored payment profile
     * for the same customer
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for MaskedBankAccountNumber.
     * A string representation of the stored bank account number with all but the last 4 digits
     * marked with X’s (i.e. ‘XXXXXXX1111’)
     * @return Returns the String
     */
    @JsonGetter("masked_bank_account_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMaskedBankAccountNumber() {
        return maskedBankAccountNumber;
    }

    /**
     * Setter for MaskedBankAccountNumber.
     * A string representation of the stored bank account number with all but the last 4 digits
     * marked with X’s (i.e. ‘XXXXXXX1111’)
     * @param maskedBankAccountNumber Value for String
     */
    @JsonSetter("masked_bank_account_number")
    public void setMaskedBankAccountNumber(String maskedBankAccountNumber) {
        this.maskedBankAccountNumber = maskedBankAccountNumber;
    }

    /**
     * Getter for MaskedBankRoutingNumber.
     * A string representation of the stored bank routing number with all but the last 4 digits
     * marked with X’s (i.e. ‘XXXXXXX1111’). payment_type will be bank_account
     * @return Returns the String
     */
    @JsonGetter("masked_bank_routing_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMaskedBankRoutingNumber() {
        return maskedBankRoutingNumber;
    }

    /**
     * Setter for MaskedBankRoutingNumber.
     * A string representation of the stored bank routing number with all but the last 4 digits
     * marked with X’s (i.e. ‘XXXXXXX1111’). payment_type will be bank_account
     * @param maskedBankRoutingNumber Value for String
     */
    @JsonSetter("masked_bank_routing_number")
    public void setMaskedBankRoutingNumber(String maskedBankRoutingNumber) {
        this.maskedBankRoutingNumber = maskedBankRoutingNumber;
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
     * Getter for ChargifyToken.
     * Token received after sending billing informations using chargify.js. This token will only be
     * received if passed as a sole attribute of credit_card_attributes (i.e.
     * tok_9g6hw85pnpt6knmskpwp4ttt)
     * @return Returns the String
     */
    @JsonGetter("chargify_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getChargifyToken() {
        return chargifyToken;
    }

    /**
     * Setter for ChargifyToken.
     * Token received after sending billing informations using chargify.js. This token will only be
     * received if passed as a sole attribute of credit_card_attributes (i.e.
     * tok_9g6hw85pnpt6knmskpwp4ttt)
     * @param chargifyToken Value for String
     */
    @JsonSetter("chargify_token")
    public void setChargifyToken(String chargifyToken) {
        this.chargifyToken = chargifyToken;
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
     * Converts this SubscriptionBankAccount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionBankAccount [" + "bankAccountHolderType=" + bankAccountHolderType
                + ", bankAccountType=" + bankAccountType + ", bankName=" + bankName
                + ", billingAddress=" + billingAddress + ", billingAddress2=" + billingAddress2
                + ", billingCity=" + billingCity + ", billingState=" + billingState
                + ", billingZip=" + billingZip + ", billingCountry=" + billingCountry
                + ", currentVault=" + currentVault + ", customerId=" + customerId
                + ", customerVaultToken=" + customerVaultToken + ", firstName=" + firstName
                + ", lastName=" + lastName + ", id=" + id + ", maskedBankAccountNumber="
                + maskedBankAccountNumber + ", maskedBankRoutingNumber=" + maskedBankRoutingNumber
                + ", vaultToken=" + vaultToken + ", chargifyToken=" + chargifyToken
                + ", siteGatewaySettingId=" + siteGatewaySettingId + ", gatewayHandle="
                + gatewayHandle + "]";
    }

    /**
     * Builds a new {@link SubscriptionBankAccount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionBankAccount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .bankAccountHolderType(getBankAccountHolderType())
                .bankAccountType(getBankAccountType())
                .bankName(getBankName())
                .billingAddress(getBillingAddress())
                .billingAddress2(getBillingAddress2())
                .billingCity(getBillingCity())
                .billingState(getBillingState())
                .billingZip(getBillingZip())
                .billingCountry(getBillingCountry())
                .currentVault(getCurrentVault())
                .customerId(getCustomerId())
                .customerVaultToken(getCustomerVaultToken())
                .firstName(getFirstName())
                .lastName(getLastName())
                .id(getId())
                .maskedBankAccountNumber(getMaskedBankAccountNumber())
                .maskedBankRoutingNumber(getMaskedBankRoutingNumber())
                .vaultToken(getVaultToken())
                .chargifyToken(getChargifyToken())
                .siteGatewaySettingId(getSiteGatewaySettingId())
                .gatewayHandle(getGatewayHandle());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionBankAccount}.
     */
    public static class Builder {
        private String bankAccountHolderType;
        private String bankAccountType;
        private String bankName;
        private String billingAddress;
        private String billingAddress2;
        private String billingCity;
        private String billingState;
        private String billingZip;
        private String billingCountry;
        private BankAccountVault currentVault;
        private Integer customerId;
        private String customerVaultToken;
        private String firstName;
        private String lastName;
        private Integer id;
        private String maskedBankAccountNumber;
        private String maskedBankRoutingNumber;
        private String vaultToken;
        private String chargifyToken;
        private Integer siteGatewaySettingId;
        private String gatewayHandle;



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
         * Setter for bankAccountType.
         * @param  bankAccountType  String value for bankAccountType.
         * @return Builder
         */
        public Builder bankAccountType(String bankAccountType) {
            this.bankAccountType = bankAccountType;
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
         * Setter for currentVault.
         * @param  currentVault  BankAccountVault value for currentVault.
         * @return Builder
         */
        public Builder currentVault(BankAccountVault currentVault) {
            this.currentVault = currentVault;
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
         * Setter for customerVaultToken.
         * @param  customerVaultToken  String value for customerVaultToken.
         * @return Builder
         */
        public Builder customerVaultToken(String customerVaultToken) {
            this.customerVaultToken = customerVaultToken;
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
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
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
         * Setter for maskedBankRoutingNumber.
         * @param  maskedBankRoutingNumber  String value for maskedBankRoutingNumber.
         * @return Builder
         */
        public Builder maskedBankRoutingNumber(String maskedBankRoutingNumber) {
            this.maskedBankRoutingNumber = maskedBankRoutingNumber;
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
         * Setter for chargifyToken.
         * @param  chargifyToken  String value for chargifyToken.
         * @return Builder
         */
        public Builder chargifyToken(String chargifyToken) {
            this.chargifyToken = chargifyToken;
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
         * Builds a new {@link SubscriptionBankAccount} object using the set fields.
         * @return {@link SubscriptionBankAccount}
         */
        public SubscriptionBankAccount build() {
            return new SubscriptionBankAccount(bankAccountHolderType, bankAccountType, bankName,
                    billingAddress, billingAddress2, billingCity, billingState, billingZip,
                    billingCountry, currentVault, customerId, customerVaultToken, firstName,
                    lastName, id, maskedBankAccountNumber, maskedBankRoutingNumber, vaultToken,
                    chargifyToken, siteGatewaySettingId, gatewayHandle);
        }
    }
}
