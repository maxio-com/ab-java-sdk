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
 * This is a model class for BankAccountPaymentProfile type.
 */
public class BankAccountPaymentProfile
        extends BaseModel {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer customerId;
    private BankAccountVault currentVault;
    private String vaultToken;
    private OptionalNullable<String> billingAddress;
    private OptionalNullable<String> billingCity;
    private OptionalNullable<String> billingState;
    private OptionalNullable<String> billingZip;
    private OptionalNullable<String> billingCountry;
    private OptionalNullable<String> customerVaultToken;
    private OptionalNullable<String> billingAddress2;
    private String bankName;
    private String maskedBankRoutingNumber;
    private String maskedBankAccountNumber;
    private BankAccountType bankAccountType;
    private BankAccountHolderType bankAccountHolderType;
    private PaymentType paymentType;
    private Boolean verified;
    private OptionalNullable<Integer> siteGatewaySettingId;
    private OptionalNullable<String> gatewayHandle;

    /**
     * Default constructor.
     */
    public BankAccountPaymentProfile() {
        verified = false;
    }

    /**
     * Initialization constructor.
     * @param  maskedBankRoutingNumber  String value for maskedBankRoutingNumber.
     * @param  maskedBankAccountNumber  String value for maskedBankAccountNumber.
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
     * @param  bankAccountType  BankAccountType value for bankAccountType.
     * @param  bankAccountHolderType  BankAccountHolderType value for bankAccountHolderType.
     * @param  paymentType  PaymentType value for paymentType.
     * @param  verified  Boolean value for verified.
     * @param  siteGatewaySettingId  Integer value for siteGatewaySettingId.
     * @param  gatewayHandle  String value for gatewayHandle.
     */
    public BankAccountPaymentProfile(
            String maskedBankRoutingNumber,
            String maskedBankAccountNumber,
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
            BankAccountType bankAccountType,
            BankAccountHolderType bankAccountHolderType,
            PaymentType paymentType,
            Boolean verified,
            Integer siteGatewaySettingId,
            String gatewayHandle) {
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
        this.bankName = bankName;
        this.maskedBankRoutingNumber = maskedBankRoutingNumber;
        this.maskedBankAccountNumber = maskedBankAccountNumber;
        this.bankAccountType = bankAccountType;
        this.bankAccountHolderType = bankAccountHolderType;
        this.paymentType = paymentType;
        this.verified = verified;
        this.siteGatewaySettingId = OptionalNullable.of(siteGatewaySettingId);
        this.gatewayHandle = OptionalNullable.of(gatewayHandle);
    }

    /**
     * Initialization constructor.
     * @param  maskedBankRoutingNumber  String value for maskedBankRoutingNumber.
     * @param  maskedBankAccountNumber  String value for maskedBankAccountNumber.
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
     * @param  bankAccountType  BankAccountType value for bankAccountType.
     * @param  bankAccountHolderType  BankAccountHolderType value for bankAccountHolderType.
     * @param  paymentType  PaymentType value for paymentType.
     * @param  verified  Boolean value for verified.
     * @param  siteGatewaySettingId  Integer value for siteGatewaySettingId.
     * @param  gatewayHandle  String value for gatewayHandle.
     */

    protected BankAccountPaymentProfile(String maskedBankRoutingNumber,
            String maskedBankAccountNumber, Integer id, String firstName, String lastName,
            Integer customerId, BankAccountVault currentVault, String vaultToken,
            OptionalNullable<String> billingAddress, OptionalNullable<String> billingCity,
            OptionalNullable<String> billingState, OptionalNullable<String> billingZip,
            OptionalNullable<String> billingCountry, OptionalNullable<String> customerVaultToken,
            OptionalNullable<String> billingAddress2, String bankName,
            BankAccountType bankAccountType, BankAccountHolderType bankAccountHolderType,
            PaymentType paymentType, Boolean verified,
            OptionalNullable<Integer> siteGatewaySettingId,
            OptionalNullable<String> gatewayHandle) {
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
     * Initialization constructor.
     * @param  maskedBankRoutingNumber  String value for maskedBankRoutingNumber.
     * @param  maskedBankAccountNumber  String value for maskedBankAccountNumber.
     */
    @JsonCreator
    protected BankAccountPaymentProfile(
            @JsonProperty("masked_bank_routing_number") String maskedBankRoutingNumber,
            @JsonProperty("masked_bank_account_number") String maskedBankAccountNumber) {
        this(maskedBankRoutingNumber, maskedBankAccountNumber, null, null, null, null, null, null,
                OptionalNullable.of(null), OptionalNullable.of(null), OptionalNullable.of(null),
                OptionalNullable.of(null), OptionalNullable.of(null), OptionalNullable.of(null),
                OptionalNullable.of(null), null, null, null, null, null, OptionalNullable.of(null),
                OptionalNullable.of(null));
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
     * The current billing street address for the bank account
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
     * The current billing street address for the bank account
     * @return Returns the String
     */
    public String getBillingAddress() {
        return OptionalNullable.getFrom(billingAddress);
    }

    /**
     * Setter for BillingAddress.
     * The current billing street address for the bank account
     * @param billingAddress Value for String
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = OptionalNullable.of(billingAddress);
    }

    /**
     * UnSetter for BillingAddress.
     * The current billing street address for the bank account
     */
    public void unsetBillingAddress() {
        billingAddress = null;
    }

    /**
     * Internal Getter for BillingCity.
     * The current billing address city for the bank account
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
     * The current billing address city for the bank account
     * @return Returns the String
     */
    public String getBillingCity() {
        return OptionalNullable.getFrom(billingCity);
    }

    /**
     * Setter for BillingCity.
     * The current billing address city for the bank account
     * @param billingCity Value for String
     */
    @JsonSetter("billing_city")
    public void setBillingCity(String billingCity) {
        this.billingCity = OptionalNullable.of(billingCity);
    }

    /**
     * UnSetter for BillingCity.
     * The current billing address city for the bank account
     */
    public void unsetBillingCity() {
        billingCity = null;
    }

    /**
     * Internal Getter for BillingState.
     * The current billing address state for the bank account
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
     * The current billing address state for the bank account
     * @return Returns the String
     */
    public String getBillingState() {
        return OptionalNullable.getFrom(billingState);
    }

    /**
     * Setter for BillingState.
     * The current billing address state for the bank account
     * @param billingState Value for String
     */
    @JsonSetter("billing_state")
    public void setBillingState(String billingState) {
        this.billingState = OptionalNullable.of(billingState);
    }

    /**
     * UnSetter for BillingState.
     * The current billing address state for the bank account
     */
    public void unsetBillingState() {
        billingState = null;
    }

    /**
     * Internal Getter for BillingZip.
     * The current billing address zip code for the bank account
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
     * The current billing address zip code for the bank account
     * @return Returns the String
     */
    public String getBillingZip() {
        return OptionalNullable.getFrom(billingZip);
    }

    /**
     * Setter for BillingZip.
     * The current billing address zip code for the bank account
     * @param billingZip Value for String
     */
    @JsonSetter("billing_zip")
    public void setBillingZip(String billingZip) {
        this.billingZip = OptionalNullable.of(billingZip);
    }

    /**
     * UnSetter for BillingZip.
     * The current billing address zip code for the bank account
     */
    public void unsetBillingZip() {
        billingZip = null;
    }

    /**
     * Internal Getter for BillingCountry.
     * The current billing address country for the bank account
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
     * The current billing address country for the bank account
     * @return Returns the String
     */
    public String getBillingCountry() {
        return OptionalNullable.getFrom(billingCountry);
    }

    /**
     * Setter for BillingCountry.
     * The current billing address country for the bank account
     * @param billingCountry Value for String
     */
    @JsonSetter("billing_country")
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = OptionalNullable.of(billingCountry);
    }

    /**
     * UnSetter for BillingCountry.
     * The current billing address country for the bank account
     */
    public void unsetBillingCountry() {
        billingCountry = null;
    }

    /**
     * Internal Getter for CustomerVaultToken.
     * (only for Authorize.Net CIM storage): the customerProfileId for the owner of the
     * customerPaymentProfileId provided as the vault_token.
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
     * (only for Authorize.Net CIM storage): the customerProfileId for the owner of the
     * customerPaymentProfileId provided as the vault_token.
     * @return Returns the String
     */
    public String getCustomerVaultToken() {
        return OptionalNullable.getFrom(customerVaultToken);
    }

    /**
     * Setter for CustomerVaultToken.
     * (only for Authorize.Net CIM storage): the customerProfileId for the owner of the
     * customerPaymentProfileId provided as the vault_token.
     * @param customerVaultToken Value for String
     */
    @JsonSetter("customer_vault_token")
    public void setCustomerVaultToken(String customerVaultToken) {
        this.customerVaultToken = OptionalNullable.of(customerVaultToken);
    }

    /**
     * UnSetter for CustomerVaultToken.
     * (only for Authorize.Net CIM storage): the customerProfileId for the owner of the
     * customerPaymentProfileId provided as the vault_token.
     */
    public void unsetCustomerVaultToken() {
        customerVaultToken = null;
    }

    /**
     * Internal Getter for BillingAddress2.
     * The current billing street address, second line, for the bank account
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
     * The current billing street address, second line, for the bank account
     * @return Returns the String
     */
    public String getBillingAddress2() {
        return OptionalNullable.getFrom(billingAddress2);
    }

    /**
     * Setter for BillingAddress2.
     * The current billing street address, second line, for the bank account
     * @param billingAddress2 Value for String
     */
    @JsonSetter("billing_address_2")
    public void setBillingAddress2(String billingAddress2) {
        this.billingAddress2 = OptionalNullable.of(billingAddress2);
    }

    /**
     * UnSetter for BillingAddress2.
     * The current billing street address, second line, for the bank account
     */
    public void unsetBillingAddress2() {
        billingAddress2 = null;
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
     * Getter for MaskedBankRoutingNumber.
     * A string representation of the stored bank routing number with all but the last 4 digits
     * marked with X’s (i.e. ‘XXXXXXX1111’). payment_type will be bank_account
     * @return Returns the String
     */
    @JsonGetter("masked_bank_routing_number")
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
     * Getter for MaskedBankAccountNumber.
     * A string representation of the stored bank account number with all but the last 4 digits
     * marked with X’s (i.e. ‘XXXXXXX1111’)
     * @return Returns the String
     */
    @JsonGetter("masked_bank_account_number")
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
     * Getter for BankAccountType.
     * Defaults to checking
     * @return Returns the BankAccountType
     */
    @JsonGetter("bank_account_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * @return Returns the PaymentType
     */
    @JsonGetter("payment_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this BankAccountPaymentProfile into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccountPaymentProfile [" + "maskedBankRoutingNumber=" + maskedBankRoutingNumber
                + ", maskedBankAccountNumber=" + maskedBankAccountNumber + ", id=" + id
                + ", firstName=" + firstName + ", lastName=" + lastName + ", customerId="
                + customerId + ", currentVault=" + currentVault + ", vaultToken=" + vaultToken
                + ", billingAddress=" + billingAddress + ", billingCity=" + billingCity
                + ", billingState=" + billingState + ", billingZip=" + billingZip
                + ", billingCountry=" + billingCountry + ", customerVaultToken="
                + customerVaultToken + ", billingAddress2=" + billingAddress2 + ", bankName="
                + bankName + ", bankAccountType=" + bankAccountType + ", bankAccountHolderType="
                + bankAccountHolderType + ", paymentType=" + paymentType + ", verified=" + verified
                + ", siteGatewaySettingId=" + siteGatewaySettingId + ", gatewayHandle="
                + gatewayHandle + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(maskedBankRoutingNumber, maskedBankAccountNumber)
                .id(getId())
                .firstName(getFirstName())
                .lastName(getLastName())
                .customerId(getCustomerId())
                .currentVault(getCurrentVault())
                .vaultToken(getVaultToken())
                .bankName(getBankName())
                .bankAccountType(getBankAccountType())
                .bankAccountHolderType(getBankAccountHolderType())
                .paymentType(getPaymentType())
                .verified(getVerified());
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
     * Class to build instances of {@link BankAccountPaymentProfile}.
     */
    public static class Builder {
        private String maskedBankRoutingNumber;
        private String maskedBankAccountNumber;
        private Integer id;
        private String firstName;
        private String lastName;
        private Integer customerId;
        private BankAccountVault currentVault;
        private String vaultToken;
        private OptionalNullable<String> billingAddress;
        private OptionalNullable<String> billingCity;
        private OptionalNullable<String> billingState;
        private OptionalNullable<String> billingZip;
        private OptionalNullable<String> billingCountry;
        private OptionalNullable<String> customerVaultToken;
        private OptionalNullable<String> billingAddress2;
        private String bankName;
        private BankAccountType bankAccountType;
        private BankAccountHolderType bankAccountHolderType;
        private PaymentType paymentType;
        private Boolean verified = false;
        private OptionalNullable<Integer> siteGatewaySettingId;
        private OptionalNullable<String> gatewayHandle;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  maskedBankRoutingNumber  String value for maskedBankRoutingNumber.
         * @param  maskedBankAccountNumber  String value for maskedBankAccountNumber.
         */
        public Builder(String maskedBankRoutingNumber, String maskedBankAccountNumber) {
            this.maskedBankRoutingNumber = maskedBankRoutingNumber;
            this.maskedBankAccountNumber = maskedBankAccountNumber;
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
         * Setter for bankName.
         * @param  bankName  String value for bankName.
         * @return Builder
         */
        public Builder bankName(String bankName) {
            this.bankName = bankName;
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
         * @param  paymentType  PaymentType value for paymentType.
         * @return Builder
         */
        public Builder paymentType(PaymentType paymentType) {
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
         * Builds a new {@link BankAccountPaymentProfile} object using the set fields.
         * @return {@link BankAccountPaymentProfile}
         */
        public BankAccountPaymentProfile build() {
            return new BankAccountPaymentProfile(maskedBankRoutingNumber, maskedBankAccountNumber,
                    id, firstName, lastName, customerId, currentVault, vaultToken, billingAddress,
                    billingCity, billingState, billingZip, billingCountry, customerVaultToken,
                    billingAddress2, bankName, bankAccountType, bankAccountHolderType, paymentType,
                    verified, siteGatewaySettingId, gatewayHandle);
        }
    }
}
