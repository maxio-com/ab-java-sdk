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
import com.maxio.advancedbilling.models.containers.CreatePaymentProfileExpirationMonth;
import com.maxio.advancedbilling.models.containers.CreatePaymentProfileExpirationYear;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for CreatePaymentProfile type.
 */
public class CreatePaymentProfile {
    private String chargifyToken;
    private Integer id;
    private PaymentType paymentType;
    private String firstName;
    private String lastName;
    private String maskedCardNumber;
    private String fullNumber;
    private CardType cardType;
    private CreatePaymentProfileExpirationMonth expirationMonth;
    private CreatePaymentProfileExpirationYear expirationYear;
    private String billingAddress;
    private OptionalNullable<String> billingAddress2;
    private String billingCity;
    private String billingState;
    private String billingCountry;
    private String billingZip;
    private CurrentVault currentVault;
    private String vaultToken;
    private String customerVaultToken;
    private Integer customerId;
    private String paypalEmail;
    private String paymentMethodNonce;
    private String gatewayHandle;
    private String cvv;
    private String bankName;
    private String bankIban;
    private String bankRoutingNumber;
    private String bankAccountNumber;
    private String bankBranchCode;
    private String bankAccountType;
    private String bankAccountHolderType;
    private String lastFour;

    /**
     * Default constructor.
     */
    public CreatePaymentProfile() {
        paymentType = PaymentType.CREDIT_CARD;
    }

    /**
     * Initialization constructor.
     * @param  chargifyToken  String value for chargifyToken.
     * @param  id  Integer value for id.
     * @param  paymentType  PaymentType value for paymentType.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  maskedCardNumber  String value for maskedCardNumber.
     * @param  fullNumber  String value for fullNumber.
     * @param  cardType  CardType value for cardType.
     * @param  expirationMonth  CreatePaymentProfileExpirationMonth value for expirationMonth.
     * @param  expirationYear  CreatePaymentProfileExpirationYear value for expirationYear.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingAddress2  String value for billingAddress2.
     * @param  billingCity  String value for billingCity.
     * @param  billingState  String value for billingState.
     * @param  billingCountry  String value for billingCountry.
     * @param  billingZip  String value for billingZip.
     * @param  currentVault  CurrentVault value for currentVault.
     * @param  vaultToken  String value for vaultToken.
     * @param  customerVaultToken  String value for customerVaultToken.
     * @param  customerId  Integer value for customerId.
     * @param  paypalEmail  String value for paypalEmail.
     * @param  paymentMethodNonce  String value for paymentMethodNonce.
     * @param  gatewayHandle  String value for gatewayHandle.
     * @param  cvv  String value for cvv.
     * @param  bankName  String value for bankName.
     * @param  bankIban  String value for bankIban.
     * @param  bankRoutingNumber  String value for bankRoutingNumber.
     * @param  bankAccountNumber  String value for bankAccountNumber.
     * @param  bankBranchCode  String value for bankBranchCode.
     * @param  bankAccountType  String value for bankAccountType.
     * @param  bankAccountHolderType  String value for bankAccountHolderType.
     * @param  lastFour  String value for lastFour.
     */
    public CreatePaymentProfile(
            String chargifyToken,
            Integer id,
            PaymentType paymentType,
            String firstName,
            String lastName,
            String maskedCardNumber,
            String fullNumber,
            CardType cardType,
            CreatePaymentProfileExpirationMonth expirationMonth,
            CreatePaymentProfileExpirationYear expirationYear,
            String billingAddress,
            String billingAddress2,
            String billingCity,
            String billingState,
            String billingCountry,
            String billingZip,
            CurrentVault currentVault,
            String vaultToken,
            String customerVaultToken,
            Integer customerId,
            String paypalEmail,
            String paymentMethodNonce,
            String gatewayHandle,
            String cvv,
            String bankName,
            String bankIban,
            String bankRoutingNumber,
            String bankAccountNumber,
            String bankBranchCode,
            String bankAccountType,
            String bankAccountHolderType,
            String lastFour) {
        this.chargifyToken = chargifyToken;
        this.id = id;
        this.paymentType = paymentType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.maskedCardNumber = maskedCardNumber;
        this.fullNumber = fullNumber;
        this.cardType = cardType;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.billingAddress = billingAddress;
        this.billingAddress2 = OptionalNullable.of(billingAddress2);
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingCountry = billingCountry;
        this.billingZip = billingZip;
        this.currentVault = currentVault;
        this.vaultToken = vaultToken;
        this.customerVaultToken = customerVaultToken;
        this.customerId = customerId;
        this.paypalEmail = paypalEmail;
        this.paymentMethodNonce = paymentMethodNonce;
        this.gatewayHandle = gatewayHandle;
        this.cvv = cvv;
        this.bankName = bankName;
        this.bankIban = bankIban;
        this.bankRoutingNumber = bankRoutingNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.bankBranchCode = bankBranchCode;
        this.bankAccountType = bankAccountType;
        this.bankAccountHolderType = bankAccountHolderType;
        this.lastFour = lastFour;
    }

    /**
     * Initialization constructor.
     * @param  chargifyToken  String value for chargifyToken.
     * @param  id  Integer value for id.
     * @param  paymentType  PaymentType value for paymentType.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  maskedCardNumber  String value for maskedCardNumber.
     * @param  fullNumber  String value for fullNumber.
     * @param  cardType  CardType value for cardType.
     * @param  expirationMonth  CreatePaymentProfileExpirationMonth value for expirationMonth.
     * @param  expirationYear  CreatePaymentProfileExpirationYear value for expirationYear.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingAddress2  String value for billingAddress2.
     * @param  billingCity  String value for billingCity.
     * @param  billingState  String value for billingState.
     * @param  billingCountry  String value for billingCountry.
     * @param  billingZip  String value for billingZip.
     * @param  currentVault  CurrentVault value for currentVault.
     * @param  vaultToken  String value for vaultToken.
     * @param  customerVaultToken  String value for customerVaultToken.
     * @param  customerId  Integer value for customerId.
     * @param  paypalEmail  String value for paypalEmail.
     * @param  paymentMethodNonce  String value for paymentMethodNonce.
     * @param  gatewayHandle  String value for gatewayHandle.
     * @param  cvv  String value for cvv.
     * @param  bankName  String value for bankName.
     * @param  bankIban  String value for bankIban.
     * @param  bankRoutingNumber  String value for bankRoutingNumber.
     * @param  bankAccountNumber  String value for bankAccountNumber.
     * @param  bankBranchCode  String value for bankBranchCode.
     * @param  bankAccountType  String value for bankAccountType.
     * @param  bankAccountHolderType  String value for bankAccountHolderType.
     * @param  lastFour  String value for lastFour.
     */

    protected CreatePaymentProfile(String chargifyToken, Integer id, PaymentType paymentType,
            String firstName, String lastName, String maskedCardNumber, String fullNumber,
            CardType cardType, CreatePaymentProfileExpirationMonth expirationMonth,
            CreatePaymentProfileExpirationYear expirationYear, String billingAddress,
            OptionalNullable<String> billingAddress2, String billingCity, String billingState,
            String billingCountry, String billingZip, CurrentVault currentVault, String vaultToken,
            String customerVaultToken, Integer customerId, String paypalEmail,
            String paymentMethodNonce, String gatewayHandle, String cvv, String bankName,
            String bankIban, String bankRoutingNumber, String bankAccountNumber,
            String bankBranchCode, String bankAccountType, String bankAccountHolderType,
            String lastFour) {
        this.chargifyToken = chargifyToken;
        this.id = id;
        this.paymentType = paymentType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.maskedCardNumber = maskedCardNumber;
        this.fullNumber = fullNumber;
        this.cardType = cardType;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.billingAddress = billingAddress;
        this.billingAddress2 = billingAddress2;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingCountry = billingCountry;
        this.billingZip = billingZip;
        this.currentVault = currentVault;
        this.vaultToken = vaultToken;
        this.customerVaultToken = customerVaultToken;
        this.customerId = customerId;
        this.paypalEmail = paypalEmail;
        this.paymentMethodNonce = paymentMethodNonce;
        this.gatewayHandle = gatewayHandle;
        this.cvv = cvv;
        this.bankName = bankName;
        this.bankIban = bankIban;
        this.bankRoutingNumber = bankRoutingNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.bankBranchCode = bankBranchCode;
        this.bankAccountType = bankAccountType;
        this.bankAccountHolderType = bankAccountHolderType;
        this.lastFour = lastFour;
    }

    /**
     * Getter for ChargifyToken.
     * Token received after sending billing informations using chargify.js.
     * @return Returns the String
     */
    @JsonGetter("chargify_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getChargifyToken() {
        return chargifyToken;
    }

    /**
     * Setter for ChargifyToken.
     * Token received after sending billing informations using chargify.js.
     * @param chargifyToken Value for String
     */
    @JsonSetter("chargify_token")
    public void setChargifyToken(String chargifyToken) {
        this.chargifyToken = chargifyToken;
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
     * Getter for FirstName.
     * First name on card or bank account. If omitted, the first_name from customer attributes will
     * be used.
     * @return Returns the String
     */
    @JsonGetter("first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * First name on card or bank account. If omitted, the first_name from customer attributes will
     * be used.
     * @param firstName Value for String
     */
    @JsonSetter("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * Last name on card or bank account. If omitted, the last_name from customer attributes will be
     * used.
     * @return Returns the String
     */
    @JsonGetter("last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * Last name on card or bank account. If omitted, the last_name from customer attributes will be
     * used.
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
     * Getter for FullNumber.
     * The full credit card number
     * @return Returns the String
     */
    @JsonGetter("full_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFullNumber() {
        return fullNumber;
    }

    /**
     * Setter for FullNumber.
     * The full credit card number
     * @param fullNumber Value for String
     */
    @JsonSetter("full_number")
    public void setFullNumber(String fullNumber) {
        this.fullNumber = fullNumber;
    }

    /**
     * Getter for CardType.
     * The type of card used.
     * @return Returns the CardType
     */
    @JsonGetter("card_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardType getCardType() {
        return cardType;
    }

    /**
     * Setter for CardType.
     * The type of card used.
     * @param cardType Value for CardType
     */
    @JsonSetter("card_type")
    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    /**
     * Getter for ExpirationMonth.
     * (Optional when performing an Import via vault_token, required otherwise) The 1- or 2-digit
     * credit card expiration month, as an integer or string, i.e. 5
     * @return Returns the CreatePaymentProfileExpirationMonth
     */
    @JsonGetter("expiration_month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreatePaymentProfileExpirationMonth getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Setter for ExpirationMonth.
     * (Optional when performing an Import via vault_token, required otherwise) The 1- or 2-digit
     * credit card expiration month, as an integer or string, i.e. 5
     * @param expirationMonth Value for CreatePaymentProfileExpirationMonth
     */
    @JsonSetter("expiration_month")
    public void setExpirationMonth(CreatePaymentProfileExpirationMonth expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    /**
     * Getter for ExpirationYear.
     * (Optional when performing a Import via vault_token, required otherwise) The 4-digit credit
     * card expiration year, as an integer or string, i.e. 2012
     * @return Returns the CreatePaymentProfileExpirationYear
     */
    @JsonGetter("expiration_year")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreatePaymentProfileExpirationYear getExpirationYear() {
        return expirationYear;
    }

    /**
     * Setter for ExpirationYear.
     * (Optional when performing a Import via vault_token, required otherwise) The 4-digit credit
     * card expiration year, as an integer or string, i.e. 2012
     * @param expirationYear Value for CreatePaymentProfileExpirationYear
     */
    @JsonSetter("expiration_year")
    public void setExpirationYear(CreatePaymentProfileExpirationYear expirationYear) {
        this.expirationYear = expirationYear;
    }

    /**
     * Getter for BillingAddress.
     * The credit card or bank account billing street address (i.e. 123 Main St.). This value is
     * merely passed through to the payment gateway.
     * @return Returns the String
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * The credit card or bank account billing street address (i.e. 123 Main St.). This value is
     * merely passed through to the payment gateway.
     * @param billingAddress Value for String
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Internal Getter for BillingAddress2.
     * Second line of the customer’s billing address i.e. Apt. 100
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
     * Second line of the customer’s billing address i.e. Apt. 100
     * @return Returns the String
     */
    public String getBillingAddress2() {
        return OptionalNullable.getFrom(billingAddress2);
    }

    /**
     * Setter for BillingAddress2.
     * Second line of the customer’s billing address i.e. Apt. 100
     * @param billingAddress2 Value for String
     */
    @JsonSetter("billing_address_2")
    public void setBillingAddress2(String billingAddress2) {
        this.billingAddress2 = OptionalNullable.of(billingAddress2);
    }

    /**
     * UnSetter for BillingAddress2.
     * Second line of the customer’s billing address i.e. Apt. 100
     */
    public void unsetBillingAddress2() {
        billingAddress2 = null;
    }

    /**
     * Getter for BillingCity.
     * The credit card or bank account billing address city (i.e. “Boston”). This value is merely
     * passed through to the payment gateway.
     * @return Returns the String
     */
    @JsonGetter("billing_city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * Setter for BillingCity.
     * The credit card or bank account billing address city (i.e. “Boston”). This value is merely
     * passed through to the payment gateway.
     * @param billingCity Value for String
     */
    @JsonSetter("billing_city")
    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    /**
     * Getter for BillingState.
     * The credit card or bank account billing address state (i.e. MA). This value is merely passed
     * through to the payment gateway. This must conform to the
     * [ISO_3166-1](https://en.wikipedia.org/wiki/ISO_3166-1#Current_codes) in order to be valid for
     * tax locale purposes.
     * @return Returns the String
     */
    @JsonGetter("billing_state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingState() {
        return billingState;
    }

    /**
     * Setter for BillingState.
     * The credit card or bank account billing address state (i.e. MA). This value is merely passed
     * through to the payment gateway. This must conform to the
     * [ISO_3166-1](https://en.wikipedia.org/wiki/ISO_3166-1#Current_codes) in order to be valid for
     * tax locale purposes.
     * @param billingState Value for String
     */
    @JsonSetter("billing_state")
    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    /**
     * Getter for BillingCountry.
     * The credit card or bank account billing address country, required in [ISO_3166-1
     * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format (i.e. “US”). This value is
     * merely passed through to the payment gateway. Some gateways require country codes in a
     * specific format. Please check your gateway’s documentation. If creating an ACH subscription,
     * only US is supported at this time.
     * @return Returns the String
     */
    @JsonGetter("billing_country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingCountry() {
        return billingCountry;
    }

    /**
     * Setter for BillingCountry.
     * The credit card or bank account billing address country, required in [ISO_3166-1
     * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format (i.e. “US”). This value is
     * merely passed through to the payment gateway. Some gateways require country codes in a
     * specific format. Please check your gateway’s documentation. If creating an ACH subscription,
     * only US is supported at this time.
     * @param billingCountry Value for String
     */
    @JsonSetter("billing_country")
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    /**
     * Getter for BillingZip.
     * The credit card or bank account billing address zip code (i.e. 12345). This value is merely
     * passed through to the payment gateway.
     * @return Returns the String
     */
    @JsonGetter("billing_zip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingZip() {
        return billingZip;
    }

    /**
     * Setter for BillingZip.
     * The credit card or bank account billing address zip code (i.e. 12345). This value is merely
     * passed through to the payment gateway.
     * @param billingZip Value for String
     */
    @JsonSetter("billing_zip")
    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
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
     * Getter for CustomerId.
     * (Required when creating a new payment profile) The Chargify customer id.
     * @return Returns the Integer
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * (Required when creating a new payment profile) The Chargify customer id.
     * @param customerId Value for Integer
     */
    @JsonSetter("customer_id")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for PaypalEmail.
     * used by merchants that implemented BraintreeBlue javaScript libraries on their own. We
     * recommend using Chargify.js instead.
     * @return Returns the String
     */
    @JsonGetter("paypal_email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaypalEmail() {
        return paypalEmail;
    }

    /**
     * Setter for PaypalEmail.
     * used by merchants that implemented BraintreeBlue javaScript libraries on their own. We
     * recommend using Chargify.js instead.
     * @param paypalEmail Value for String
     */
    @JsonSetter("paypal_email")
    public void setPaypalEmail(String paypalEmail) {
        this.paypalEmail = paypalEmail;
    }

    /**
     * Getter for PaymentMethodNonce.
     * used by merchants that implemented BraintreeBlue javaScript libraries on their own. We
     * recommend using Chargify.js instead.
     * @return Returns the String
     */
    @JsonGetter("payment_method_nonce")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaymentMethodNonce() {
        return paymentMethodNonce;
    }

    /**
     * Setter for PaymentMethodNonce.
     * used by merchants that implemented BraintreeBlue javaScript libraries on their own. We
     * recommend using Chargify.js instead.
     * @param paymentMethodNonce Value for String
     */
    @JsonSetter("payment_method_nonce")
    public void setPaymentMethodNonce(String paymentMethodNonce) {
        this.paymentMethodNonce = paymentMethodNonce;
    }

    /**
     * Getter for GatewayHandle.
     * This attribute is only available if MultiGateway feature is enabled for your Site. This
     * feature is in the Private Beta currently. gateway_handle is used to directly select a gateway
     * where a payment profile will be stored in. Every connected gateway must have a unique gateway
     * handle specified. Read [Multigateway
     * description](https://chargify.zendesk.com/hc/en-us/articles/4407761759643#connecting-with-multiple-gateways)
     * to learn more about new concepts that MultiGateway introduces and the default behavior when
     * this attribute is not passed.
     * @return Returns the String
     */
    @JsonGetter("gateway_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGatewayHandle() {
        return gatewayHandle;
    }

    /**
     * Setter for GatewayHandle.
     * This attribute is only available if MultiGateway feature is enabled for your Site. This
     * feature is in the Private Beta currently. gateway_handle is used to directly select a gateway
     * where a payment profile will be stored in. Every connected gateway must have a unique gateway
     * handle specified. Read [Multigateway
     * description](https://chargify.zendesk.com/hc/en-us/articles/4407761759643#connecting-with-multiple-gateways)
     * to learn more about new concepts that MultiGateway introduces and the default behavior when
     * this attribute is not passed.
     * @param gatewayHandle Value for String
     */
    @JsonSetter("gateway_handle")
    public void setGatewayHandle(String gatewayHandle) {
        this.gatewayHandle = gatewayHandle;
    }

    /**
     * Getter for Cvv.
     * The 3- or 4-digit Card Verification Value. This value is merely passed through to the payment
     * gateway.
     * @return Returns the String
     */
    @JsonGetter("cvv")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCvv() {
        return cvv;
    }

    /**
     * Setter for Cvv.
     * The 3- or 4-digit Card Verification Value. This value is merely passed through to the payment
     * gateway.
     * @param cvv Value for String
     */
    @JsonSetter("cvv")
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    /**
     * Getter for BankName.
     * (Required when creating with ACH or GoCardless, optional with Stripe Direct Debit). The name
     * of the bank where the customerʼs account resides
     * @return Returns the String
     */
    @JsonGetter("bank_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankName() {
        return bankName;
    }

    /**
     * Setter for BankName.
     * (Required when creating with ACH or GoCardless, optional with Stripe Direct Debit). The name
     * of the bank where the customerʼs account resides
     * @param bankName Value for String
     */
    @JsonSetter("bank_name")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * Getter for BankIban.
     * (Optional when creating with GoCardless, required with Stripe Direct Debit). International
     * Bank Account Number. Alternatively, local bank details can be provided
     * @return Returns the String
     */
    @JsonGetter("bank_iban")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankIban() {
        return bankIban;
    }

    /**
     * Setter for BankIban.
     * (Optional when creating with GoCardless, required with Stripe Direct Debit). International
     * Bank Account Number. Alternatively, local bank details can be provided
     * @param bankIban Value for String
     */
    @JsonSetter("bank_iban")
    public void setBankIban(String bankIban) {
        this.bankIban = bankIban;
    }

    /**
     * Getter for BankRoutingNumber.
     * (Required when creating with ACH. Optional when creating a subscription with GoCardless). The
     * routing number of the bank. It becomes bank_code while passing via GoCardless API
     * @return Returns the String
     */
    @JsonGetter("bank_routing_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankRoutingNumber() {
        return bankRoutingNumber;
    }

    /**
     * Setter for BankRoutingNumber.
     * (Required when creating with ACH. Optional when creating a subscription with GoCardless). The
     * routing number of the bank. It becomes bank_code while passing via GoCardless API
     * @param bankRoutingNumber Value for String
     */
    @JsonSetter("bank_routing_number")
    public void setBankRoutingNumber(String bankRoutingNumber) {
        this.bankRoutingNumber = bankRoutingNumber;
    }

    /**
     * Getter for BankAccountNumber.
     * (Required when creating with ACH, GoCardless, Stripe BECS Direct Debit and bank_iban is
     * blank) The customerʼs bank account number
     * @return Returns the String
     */
    @JsonGetter("bank_account_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Setter for BankAccountNumber.
     * (Required when creating with ACH, GoCardless, Stripe BECS Direct Debit and bank_iban is
     * blank) The customerʼs bank account number
     * @param bankAccountNumber Value for String
     */
    @JsonSetter("bank_account_number")
    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    /**
     * Getter for BankBranchCode.
     * (Optional when creating with GoCardless, required with Stripe BECS Direct Debit) Branch code.
     * Alternatively, an IBAN can be provided
     * @return Returns the String
     */
    @JsonGetter("bank_branch_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBankBranchCode() {
        return bankBranchCode;
    }

    /**
     * Setter for BankBranchCode.
     * (Optional when creating with GoCardless, required with Stripe BECS Direct Debit) Branch code.
     * Alternatively, an IBAN can be provided
     * @param bankBranchCode Value for String
     */
    @JsonSetter("bank_branch_code")
    public void setBankBranchCode(String bankBranchCode) {
        this.bankBranchCode = bankBranchCode;
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
     * Getter for LastFour.
     * (Optional) Used for creating subscription with payment profile imported using vault_token,
     * for proper display in Advanced Billing UI
     * @return Returns the String
     */
    @JsonGetter("last_four")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastFour() {
        return lastFour;
    }

    /**
     * Setter for LastFour.
     * (Optional) Used for creating subscription with payment profile imported using vault_token,
     * for proper display in Advanced Billing UI
     * @param lastFour Value for String
     */
    @JsonSetter("last_four")
    public void setLastFour(String lastFour) {
        this.lastFour = lastFour;
    }

    /**
     * Converts this CreatePaymentProfile into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePaymentProfile [" + "chargifyToken=" + chargifyToken + ", id=" + id
                + ", paymentType=" + paymentType + ", firstName=" + firstName + ", lastName="
                + lastName + ", maskedCardNumber=" + maskedCardNumber + ", fullNumber=" + fullNumber
                + ", cardType=" + cardType + ", expirationMonth=" + expirationMonth
                + ", expirationYear=" + expirationYear + ", billingAddress=" + billingAddress
                + ", billingAddress2=" + billingAddress2 + ", billingCity=" + billingCity
                + ", billingState=" + billingState + ", billingCountry=" + billingCountry
                + ", billingZip=" + billingZip + ", currentVault=" + currentVault + ", vaultToken="
                + vaultToken + ", customerVaultToken=" + customerVaultToken + ", customerId="
                + customerId + ", paypalEmail=" + paypalEmail + ", paymentMethodNonce="
                + paymentMethodNonce + ", gatewayHandle=" + gatewayHandle + ", cvv=" + cvv
                + ", bankName=" + bankName + ", bankIban=" + bankIban + ", bankRoutingNumber="
                + bankRoutingNumber + ", bankAccountNumber=" + bankAccountNumber
                + ", bankBranchCode=" + bankBranchCode + ", bankAccountType=" + bankAccountType
                + ", bankAccountHolderType=" + bankAccountHolderType + ", lastFour=" + lastFour
                + "]";
    }

    /**
     * Builds a new {@link CreatePaymentProfile.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatePaymentProfile.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .chargifyToken(getChargifyToken())
                .id(getId())
                .paymentType(getPaymentType())
                .firstName(getFirstName())
                .lastName(getLastName())
                .maskedCardNumber(getMaskedCardNumber())
                .fullNumber(getFullNumber())
                .cardType(getCardType())
                .expirationMonth(getExpirationMonth())
                .expirationYear(getExpirationYear())
                .billingAddress(getBillingAddress())
                .billingCity(getBillingCity())
                .billingState(getBillingState())
                .billingCountry(getBillingCountry())
                .billingZip(getBillingZip())
                .currentVault(getCurrentVault())
                .vaultToken(getVaultToken())
                .customerVaultToken(getCustomerVaultToken())
                .customerId(getCustomerId())
                .paypalEmail(getPaypalEmail())
                .paymentMethodNonce(getPaymentMethodNonce())
                .gatewayHandle(getGatewayHandle())
                .cvv(getCvv())
                .bankName(getBankName())
                .bankIban(getBankIban())
                .bankRoutingNumber(getBankRoutingNumber())
                .bankAccountNumber(getBankAccountNumber())
                .bankBranchCode(getBankBranchCode())
                .bankAccountType(getBankAccountType())
                .bankAccountHolderType(getBankAccountHolderType())
                .lastFour(getLastFour());
        builder.billingAddress2 = internalGetBillingAddress2();
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePaymentProfile}.
     */
    public static class Builder {
        private String chargifyToken;
        private Integer id;
        private PaymentType paymentType = PaymentType.CREDIT_CARD;
        private String firstName;
        private String lastName;
        private String maskedCardNumber;
        private String fullNumber;
        private CardType cardType;
        private CreatePaymentProfileExpirationMonth expirationMonth;
        private CreatePaymentProfileExpirationYear expirationYear;
        private String billingAddress;
        private OptionalNullable<String> billingAddress2;
        private String billingCity;
        private String billingState;
        private String billingCountry;
        private String billingZip;
        private CurrentVault currentVault;
        private String vaultToken;
        private String customerVaultToken;
        private Integer customerId;
        private String paypalEmail;
        private String paymentMethodNonce;
        private String gatewayHandle;
        private String cvv;
        private String bankName;
        private String bankIban;
        private String bankRoutingNumber;
        private String bankAccountNumber;
        private String bankBranchCode;
        private String bankAccountType;
        private String bankAccountHolderType;
        private String lastFour;



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
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
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
         * Setter for fullNumber.
         * @param  fullNumber  String value for fullNumber.
         * @return Builder
         */
        public Builder fullNumber(String fullNumber) {
            this.fullNumber = fullNumber;
            return this;
        }

        /**
         * Setter for cardType.
         * @param  cardType  CardType value for cardType.
         * @return Builder
         */
        public Builder cardType(CardType cardType) {
            this.cardType = cardType;
            return this;
        }

        /**
         * Setter for expirationMonth.
         * @param  expirationMonth  CreatePaymentProfileExpirationMonth value for expirationMonth.
         * @return Builder
         */
        public Builder expirationMonth(CreatePaymentProfileExpirationMonth expirationMonth) {
            this.expirationMonth = expirationMonth;
            return this;
        }

        /**
         * Setter for expirationYear.
         * @param  expirationYear  CreatePaymentProfileExpirationYear value for expirationYear.
         * @return Builder
         */
        public Builder expirationYear(CreatePaymentProfileExpirationYear expirationYear) {
            this.expirationYear = expirationYear;
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
         * Setter for billingCountry.
         * @param  billingCountry  String value for billingCountry.
         * @return Builder
         */
        public Builder billingCountry(String billingCountry) {
            this.billingCountry = billingCountry;
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
         * Setter for customerVaultToken.
         * @param  customerVaultToken  String value for customerVaultToken.
         * @return Builder
         */
        public Builder customerVaultToken(String customerVaultToken) {
            this.customerVaultToken = customerVaultToken;
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
         * Setter for paypalEmail.
         * @param  paypalEmail  String value for paypalEmail.
         * @return Builder
         */
        public Builder paypalEmail(String paypalEmail) {
            this.paypalEmail = paypalEmail;
            return this;
        }

        /**
         * Setter for paymentMethodNonce.
         * @param  paymentMethodNonce  String value for paymentMethodNonce.
         * @return Builder
         */
        public Builder paymentMethodNonce(String paymentMethodNonce) {
            this.paymentMethodNonce = paymentMethodNonce;
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
         * Setter for cvv.
         * @param  cvv  String value for cvv.
         * @return Builder
         */
        public Builder cvv(String cvv) {
            this.cvv = cvv;
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
         * Setter for bankIban.
         * @param  bankIban  String value for bankIban.
         * @return Builder
         */
        public Builder bankIban(String bankIban) {
            this.bankIban = bankIban;
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
         * Setter for lastFour.
         * @param  lastFour  String value for lastFour.
         * @return Builder
         */
        public Builder lastFour(String lastFour) {
            this.lastFour = lastFour;
            return this;
        }

        /**
         * Builds a new {@link CreatePaymentProfile} object using the set fields.
         * @return {@link CreatePaymentProfile}
         */
        public CreatePaymentProfile build() {
            return new CreatePaymentProfile(chargifyToken, id, paymentType, firstName, lastName,
                    maskedCardNumber, fullNumber, cardType, expirationMonth, expirationYear,
                    billingAddress, billingAddress2, billingCity, billingState, billingCountry,
                    billingZip, currentVault, vaultToken, customerVaultToken, customerId,
                    paypalEmail, paymentMethodNonce, gatewayHandle, cvv, bankName, bankIban,
                    bankRoutingNumber, bankAccountNumber, bankBranchCode, bankAccountType,
                    bankAccountHolderType, lastFour);
        }
    }
}
