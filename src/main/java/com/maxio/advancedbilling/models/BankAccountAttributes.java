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
 * This is a model class for BankAccountAttributes type.
 */
public class BankAccountAttributes {
    private String chargifyToken;
    private String bankName;
    private String bankRoutingNumber;
    private String bankAccountNumber;
    private String bankAccountType;
    private String bankBranchCode;
    private String bankIban;
    private String bankAccountHolderType;
    private String paymentType;
    private BankAccountVault currentVault;
    private String vaultToken;
    private String customerVaultToken;

    /**
     * Default constructor.
     */
    public BankAccountAttributes() {
    }

    /**
     * Initialization constructor.
     * @param  chargifyToken  String value for chargifyToken.
     * @param  bankName  String value for bankName.
     * @param  bankRoutingNumber  String value for bankRoutingNumber.
     * @param  bankAccountNumber  String value for bankAccountNumber.
     * @param  bankAccountType  String value for bankAccountType.
     * @param  bankBranchCode  String value for bankBranchCode.
     * @param  bankIban  String value for bankIban.
     * @param  bankAccountHolderType  String value for bankAccountHolderType.
     * @param  paymentType  String value for paymentType.
     * @param  currentVault  BankAccountVault value for currentVault.
     * @param  vaultToken  String value for vaultToken.
     * @param  customerVaultToken  String value for customerVaultToken.
     */
    public BankAccountAttributes(
            String chargifyToken,
            String bankName,
            String bankRoutingNumber,
            String bankAccountNumber,
            String bankAccountType,
            String bankBranchCode,
            String bankIban,
            String bankAccountHolderType,
            String paymentType,
            BankAccountVault currentVault,
            String vaultToken,
            String customerVaultToken) {
        this.chargifyToken = chargifyToken;
        this.bankName = bankName;
        this.bankRoutingNumber = bankRoutingNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.bankAccountType = bankAccountType;
        this.bankBranchCode = bankBranchCode;
        this.bankIban = bankIban;
        this.bankAccountHolderType = bankAccountHolderType;
        this.paymentType = paymentType;
        this.currentVault = currentVault;
        this.vaultToken = vaultToken;
        this.customerVaultToken = customerVaultToken;
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
     * Getter for CustomerVaultToken.
     * (only for Authorize.Net CIM storage or Square) The customerProfileId for the owner of the
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
     * (only for Authorize.Net CIM storage or Square) The customerProfileId for the owner of the
     * customerPaymentProfileId provided as the vault_token
     * @param customerVaultToken Value for String
     */
    @JsonSetter("customer_vault_token")
    public void setCustomerVaultToken(String customerVaultToken) {
        this.customerVaultToken = customerVaultToken;
    }

    /**
     * Converts this BankAccountAttributes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccountAttributes [" + "chargifyToken=" + chargifyToken + ", bankName="
                + bankName + ", bankRoutingNumber=" + bankRoutingNumber + ", bankAccountNumber="
                + bankAccountNumber + ", bankAccountType=" + bankAccountType + ", bankBranchCode="
                + bankBranchCode + ", bankIban=" + bankIban + ", bankAccountHolderType="
                + bankAccountHolderType + ", paymentType=" + paymentType + ", currentVault="
                + currentVault + ", vaultToken=" + vaultToken + ", customerVaultToken="
                + customerVaultToken + "]";
    }

    /**
     * Builds a new {@link BankAccountAttributes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankAccountAttributes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .chargifyToken(getChargifyToken())
                .bankName(getBankName())
                .bankRoutingNumber(getBankRoutingNumber())
                .bankAccountNumber(getBankAccountNumber())
                .bankAccountType(getBankAccountType())
                .bankBranchCode(getBankBranchCode())
                .bankIban(getBankIban())
                .bankAccountHolderType(getBankAccountHolderType())
                .paymentType(getPaymentType())
                .currentVault(getCurrentVault())
                .vaultToken(getVaultToken())
                .customerVaultToken(getCustomerVaultToken());
        return builder;
    }

    /**
     * Class to build instances of {@link BankAccountAttributes}.
     */
    public static class Builder {
        private String chargifyToken;
        private String bankName;
        private String bankRoutingNumber;
        private String bankAccountNumber;
        private String bankAccountType;
        private String bankBranchCode;
        private String bankIban;
        private String bankAccountHolderType;
        private String paymentType;
        private BankAccountVault currentVault;
        private String vaultToken;
        private String customerVaultToken;



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
         * Setter for bankName.
         * @param  bankName  String value for bankName.
         * @return Builder
         */
        public Builder bankName(String bankName) {
            this.bankName = bankName;
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
         * Setter for bankAccountNumber.
         * @param  bankAccountNumber  String value for bankAccountNumber.
         * @return Builder
         */
        public Builder bankAccountNumber(String bankAccountNumber) {
            this.bankAccountNumber = bankAccountNumber;
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
         * Setter for bankBranchCode.
         * @param  bankBranchCode  String value for bankBranchCode.
         * @return Builder
         */
        public Builder bankBranchCode(String bankBranchCode) {
            this.bankBranchCode = bankBranchCode;
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
         * Setter for customerVaultToken.
         * @param  customerVaultToken  String value for customerVaultToken.
         * @return Builder
         */
        public Builder customerVaultToken(String customerVaultToken) {
            this.customerVaultToken = customerVaultToken;
            return this;
        }

        /**
         * Builds a new {@link BankAccountAttributes} object using the set fields.
         * @return {@link BankAccountAttributes}
         */
        public BankAccountAttributes build() {
            return new BankAccountAttributes(chargifyToken, bankName, bankRoutingNumber,
                    bankAccountNumber, bankAccountType, bankBranchCode, bankIban,
                    bankAccountHolderType, paymentType, currentVault, vaultToken,
                    customerVaultToken);
        }
    }
}
