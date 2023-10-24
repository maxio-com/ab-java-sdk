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
 * This is a model class for SubscriptionGroupBankAccount type.
 */
public class SubscriptionGroupBankAccount {
    private String bankName;
    private String bankAccountNumber;
    private String bankRoutingNumber;
    private String bankIban;
    private String bankBranchCode;
    private BankAccountType bankAccountType;
    private HolderType bankAccountHolderType;
    private String paymentType;
    private String billingAddress;
    private String billingCity;
    private String billingState;
    private String billingZip;
    private String billingCountry;
    private String chargifyToken;
    private BankAccountVault currentVault;
    private String gatewayHandle;

    /**
     * Default constructor.
     */
    public SubscriptionGroupBankAccount() {
        bankAccountType = BankAccountType.CHECKING;
    }

    /**
     * Initialization constructor.
     * @param  bankName  String value for bankName.
     * @param  bankAccountNumber  String value for bankAccountNumber.
     * @param  bankRoutingNumber  String value for bankRoutingNumber.
     * @param  bankIban  String value for bankIban.
     * @param  bankBranchCode  String value for bankBranchCode.
     * @param  bankAccountType  BankAccountType value for bankAccountType.
     * @param  bankAccountHolderType  HolderType value for bankAccountHolderType.
     * @param  paymentType  String value for paymentType.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingCity  String value for billingCity.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  billingCountry  String value for billingCountry.
     * @param  chargifyToken  String value for chargifyToken.
     * @param  currentVault  BankAccountVault value for currentVault.
     * @param  gatewayHandle  String value for gatewayHandle.
     */
    public SubscriptionGroupBankAccount(
            String bankName,
            String bankAccountNumber,
            String bankRoutingNumber,
            String bankIban,
            String bankBranchCode,
            BankAccountType bankAccountType,
            HolderType bankAccountHolderType,
            String paymentType,
            String billingAddress,
            String billingCity,
            String billingState,
            String billingZip,
            String billingCountry,
            String chargifyToken,
            BankAccountVault currentVault,
            String gatewayHandle) {
        this.bankName = bankName;
        this.bankAccountNumber = bankAccountNumber;
        this.bankRoutingNumber = bankRoutingNumber;
        this.bankIban = bankIban;
        this.bankBranchCode = bankBranchCode;
        this.bankAccountType = bankAccountType;
        this.bankAccountHolderType = bankAccountHolderType;
        this.paymentType = paymentType;
        this.billingAddress = billingAddress;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.billingCountry = billingCountry;
        this.chargifyToken = chargifyToken;
        this.currentVault = currentVault;
        this.gatewayHandle = gatewayHandle;
    }

    /**
     * Getter for BankName.
     * (Required when creating a subscription with ACH or GoCardless) The name of the bank where the
     * customer’s account resides
     * @return Returns the String
     */
    @JsonGetter("bank_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankName() {
        return bankName;
    }

    /**
     * Setter for BankName.
     * (Required when creating a subscription with ACH or GoCardless) The name of the bank where the
     * customer’s account resides
     * @param bankName Value for String
     */
    @JsonSetter("bank_name")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * Getter for BankAccountNumber.
     * (Required when creating a subscription with ACH. Required when creating a subscription with
     * GoCardless and bank_iban is blank) The customerʼs bank account number
     * @return Returns the String
     */
    @JsonGetter("bank_account_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Setter for BankAccountNumber.
     * (Required when creating a subscription with ACH. Required when creating a subscription with
     * GoCardless and bank_iban is blank) The customerʼs bank account number
     * @param bankAccountNumber Value for String
     */
    @JsonSetter("bank_account_number")
    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    /**
     * Getter for BankRoutingNumber.
     * (Required when creating a subscription with ACH. Optional when creating a subscription with
     * GoCardless). The routing number of the bank. It becomes bank_code while passing via
     * GoCardless API
     * @return Returns the String
     */
    @JsonGetter("bank_routing_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankRoutingNumber() {
        return bankRoutingNumber;
    }

    /**
     * Setter for BankRoutingNumber.
     * (Required when creating a subscription with ACH. Optional when creating a subscription with
     * GoCardless). The routing number of the bank. It becomes bank_code while passing via
     * GoCardless API
     * @param bankRoutingNumber Value for String
     */
    @JsonSetter("bank_routing_number")
    public void setBankRoutingNumber(String bankRoutingNumber) {
        this.bankRoutingNumber = bankRoutingNumber;
    }

    /**
     * Getter for BankIban.
     * (Optional when creating a subscription with GoCardless). International Bank Account Number.
     * Alternatively, local bank details can be provided
     * @return Returns the String
     */
    @JsonGetter("bank_iban")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankIban() {
        return bankIban;
    }

    /**
     * Setter for BankIban.
     * (Optional when creating a subscription with GoCardless). International Bank Account Number.
     * Alternatively, local bank details can be provided
     * @param bankIban Value for String
     */
    @JsonSetter("bank_iban")
    public void setBankIban(String bankIban) {
        this.bankIban = bankIban;
    }

    /**
     * Getter for BankBranchCode.
     * (Optional when creating a subscription with GoCardless) Branch code. Alternatively, an IBAN
     * can be provided
     * @return Returns the String
     */
    @JsonGetter("bank_branch_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankBranchCode() {
        return bankBranchCode;
    }

    /**
     * Setter for BankBranchCode.
     * (Optional when creating a subscription with GoCardless) Branch code. Alternatively, an IBAN
     * can be provided
     * @param bankBranchCode Value for String
     */
    @JsonSetter("bank_branch_code")
    public void setBankBranchCode(String bankBranchCode) {
        this.bankBranchCode = bankBranchCode;
    }

    /**
     * Getter for BankAccountType.
     * @return Returns the BankAccountType
     */
    @JsonGetter("bank_account_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankAccountType getBankAccountType() {
        return bankAccountType;
    }

    /**
     * Setter for BankAccountType.
     * @param bankAccountType Value for BankAccountType
     */
    @JsonSetter("bank_account_type")
    public void setBankAccountType(BankAccountType bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    /**
     * Getter for BankAccountHolderType.
     * @return Returns the HolderType
     */
    @JsonGetter("bank_account_holder_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public HolderType getBankAccountHolderType() {
        return bankAccountHolderType;
    }

    /**
     * Setter for BankAccountHolderType.
     * @param bankAccountHolderType Value for HolderType
     */
    @JsonSetter("bank_account_holder_type")
    public void setBankAccountHolderType(HolderType bankAccountHolderType) {
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
     * Converts this SubscriptionGroupBankAccount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionGroupBankAccount [" + "bankName=" + bankName + ", bankAccountNumber="
                + bankAccountNumber + ", bankRoutingNumber=" + bankRoutingNumber + ", bankIban="
                + bankIban + ", bankBranchCode=" + bankBranchCode + ", bankAccountType="
                + bankAccountType + ", bankAccountHolderType=" + bankAccountHolderType
                + ", paymentType=" + paymentType + ", billingAddress=" + billingAddress
                + ", billingCity=" + billingCity + ", billingState=" + billingState
                + ", billingZip=" + billingZip + ", billingCountry=" + billingCountry
                + ", chargifyToken=" + chargifyToken + ", currentVault=" + currentVault
                + ", gatewayHandle=" + gatewayHandle + "]";
    }

    /**
     * Builds a new {@link SubscriptionGroupBankAccount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionGroupBankAccount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .bankName(getBankName())
                .bankAccountNumber(getBankAccountNumber())
                .bankRoutingNumber(getBankRoutingNumber())
                .bankIban(getBankIban())
                .bankBranchCode(getBankBranchCode())
                .bankAccountType(getBankAccountType())
                .bankAccountHolderType(getBankAccountHolderType())
                .paymentType(getPaymentType())
                .billingAddress(getBillingAddress())
                .billingCity(getBillingCity())
                .billingState(getBillingState())
                .billingZip(getBillingZip())
                .billingCountry(getBillingCountry())
                .chargifyToken(getChargifyToken())
                .currentVault(getCurrentVault())
                .gatewayHandle(getGatewayHandle());
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionGroupBankAccount}.
     */
    public static class Builder {
        private String bankName;
        private String bankAccountNumber;
        private String bankRoutingNumber;
        private String bankIban;
        private String bankBranchCode;
        private BankAccountType bankAccountType = BankAccountType.CHECKING;
        private HolderType bankAccountHolderType;
        private String paymentType;
        private String billingAddress;
        private String billingCity;
        private String billingState;
        private String billingZip;
        private String billingCountry;
        private String chargifyToken;
        private BankAccountVault currentVault;
        private String gatewayHandle;



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
         * Setter for bankAccountNumber.
         * @param  bankAccountNumber  String value for bankAccountNumber.
         * @return Builder
         */
        public Builder bankAccountNumber(String bankAccountNumber) {
            this.bankAccountNumber = bankAccountNumber;
            return this;
        }

        /**
         * Setter for bankRoutingNumber.
         * @param  bankRoutingNumber  String value for bankRoutingNumber.
         * @return Builder
         */
        public Builder bankRoutingNumber(String bankRoutingNumber) {
            this.bankRoutingNumber = bankRoutingNumber;
            return this;
        }

        /**
         * Setter for bankIban.
         * @param  bankIban  String value for bankIban.
         * @return Builder
         */
        public Builder bankIban(String bankIban) {
            this.bankIban = bankIban;
            return this;
        }

        /**
         * Setter for bankBranchCode.
         * @param  bankBranchCode  String value for bankBranchCode.
         * @return Builder
         */
        public Builder bankBranchCode(String bankBranchCode) {
            this.bankBranchCode = bankBranchCode;
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
         * @param  bankAccountHolderType  HolderType value for bankAccountHolderType.
         * @return Builder
         */
        public Builder bankAccountHolderType(HolderType bankAccountHolderType) {
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
         * Setter for chargifyToken.
         * @param  chargifyToken  String value for chargifyToken.
         * @return Builder
         */
        public Builder chargifyToken(String chargifyToken) {
            this.chargifyToken = chargifyToken;
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
         * Setter for gatewayHandle.
         * @param  gatewayHandle  String value for gatewayHandle.
         * @return Builder
         */
        public Builder gatewayHandle(String gatewayHandle) {
            this.gatewayHandle = gatewayHandle;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionGroupBankAccount} object using the set fields.
         * @return {@link SubscriptionGroupBankAccount}
         */
        public SubscriptionGroupBankAccount build() {
            return new SubscriptionGroupBankAccount(bankName, bankAccountNumber, bankRoutingNumber,
                    bankIban, bankBranchCode, bankAccountType, bankAccountHolderType, paymentType,
                    billingAddress, billingCity, billingState, billingZip, billingCountry,
                    chargifyToken, currentVault, gatewayHandle);
        }
    }
}
