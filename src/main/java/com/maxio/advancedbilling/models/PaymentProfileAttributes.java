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
import com.maxio.advancedbilling.models.containers.PaymentProfileAttributesExpirationMonth;
import com.maxio.advancedbilling.models.containers.PaymentProfileAttributesExpirationYear;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for PaymentProfileAttributes type.
 */
public class PaymentProfileAttributes {
    private String chargifyToken;
    private Integer id;
    private String paymentType;
    private String firstName;
    private String lastName;
    private String maskedCardNumber;
    private String fullNumber;
    private CardType cardType;
    private PaymentProfileAttributesExpirationMonth expirationMonth;
    private PaymentProfileAttributesExpirationYear expirationYear;
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
    private String lastFour;

    /**
     * Default constructor.
     */
    public PaymentProfileAttributes() {
    }

    /**
     * Initialization constructor.
     * @param  chargifyToken  String value for chargifyToken.
     * @param  id  Integer value for id.
     * @param  paymentType  String value for paymentType.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  maskedCardNumber  String value for maskedCardNumber.
     * @param  fullNumber  String value for fullNumber.
     * @param  cardType  CardType value for cardType.
     * @param  expirationMonth  PaymentProfileAttributesExpirationMonth value for expirationMonth.
     * @param  expirationYear  PaymentProfileAttributesExpirationYear value for expirationYear.
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
     * @param  lastFour  String value for lastFour.
     */
    public PaymentProfileAttributes(
            String chargifyToken,
            Integer id,
            String paymentType,
            String firstName,
            String lastName,
            String maskedCardNumber,
            String fullNumber,
            CardType cardType,
            PaymentProfileAttributesExpirationMonth expirationMonth,
            PaymentProfileAttributesExpirationYear expirationYear,
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
        this.lastFour = lastFour;
    }

    /**
     * Initialization constructor.
     * @param  chargifyToken  String value for chargifyToken.
     * @param  id  Integer value for id.
     * @param  paymentType  String value for paymentType.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  maskedCardNumber  String value for maskedCardNumber.
     * @param  fullNumber  String value for fullNumber.
     * @param  cardType  CardType value for cardType.
     * @param  expirationMonth  PaymentProfileAttributesExpirationMonth value for expirationMonth.
     * @param  expirationYear  PaymentProfileAttributesExpirationYear value for expirationYear.
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
     * @param  lastFour  String value for lastFour.
     */

    protected PaymentProfileAttributes(String chargifyToken, Integer id, String paymentType,
            String firstName, String lastName, String maskedCardNumber, String fullNumber,
            CardType cardType, PaymentProfileAttributesExpirationMonth expirationMonth,
            PaymentProfileAttributesExpirationYear expirationYear, String billingAddress,
            OptionalNullable<String> billingAddress2, String billingCity, String billingState,
            String billingCountry, String billingZip, CurrentVault currentVault, String vaultToken,
            String customerVaultToken, Integer customerId, String paypalEmail,
            String paymentMethodNonce, String gatewayHandle, String cvv, String lastFour) {
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
        this.lastFour = lastFour;
    }

    /**
     * Getter for ChargifyToken.
     * (Optional) Token received after sending billing informations using chargify.js. This token
     * must be passed as a sole attribute of `payment_profile_attributes` (i.e.
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
     * (Optional) Token received after sending billing informations using chargify.js. This token
     * must be passed as a sole attribute of `payment_profile_attributes` (i.e.
     * tok_9g6hw85pnpt6knmskpwp4ttt)
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
     * Getter for FirstName.
     * (Optional) First name on card or bank account. If omitted, the first_name from customer
     * attributes will be used.
     * @return Returns the String
     */
    @JsonGetter("first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * (Optional) First name on card or bank account. If omitted, the first_name from customer
     * attributes will be used.
     * @param firstName Value for String
     */
    @JsonSetter("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * (Optional) Last name on card or bank account. If omitted, the last_name from customer
     * attributes will be used.
     * @return Returns the String
     */
    @JsonGetter("last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * (Optional) Last name on card or bank account. If omitted, the last_name from customer
     * attributes will be used.
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
     * The full credit card number (string representation, i.e. 5424000000000015)
     * @return Returns the String
     */
    @JsonGetter("full_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFullNumber() {
        return fullNumber;
    }

    /**
     * Setter for FullNumber.
     * The full credit card number (string representation, i.e. 5424000000000015)
     * @param fullNumber Value for String
     */
    @JsonSetter("full_number")
    public void setFullNumber(String fullNumber) {
        this.fullNumber = fullNumber;
    }

    /**
     * Getter for CardType.
     * (Optional, used only for Subscription Import) If you know the card type (i.e. Visa, MC, etc)
     * you may supply it here so that we may display the card type in the UI.
     * @return Returns the CardType
     */
    @JsonGetter("card_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardType getCardType() {
        return cardType;
    }

    /**
     * Setter for CardType.
     * (Optional, used only for Subscription Import) If you know the card type (i.e. Visa, MC, etc)
     * you may supply it here so that we may display the card type in the UI.
     * @param cardType Value for CardType
     */
    @JsonSetter("card_type")
    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    /**
     * Getter for ExpirationMonth.
     * (Optional when performing a Subscription Import via vault_token, required otherwise) The 1-
     * or 2-digit credit card expiration month, as an integer or string, i.e. 5
     * @return Returns the PaymentProfileAttributesExpirationMonth
     */
    @JsonGetter("expiration_month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentProfileAttributesExpirationMonth getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Setter for ExpirationMonth.
     * (Optional when performing a Subscription Import via vault_token, required otherwise) The 1-
     * or 2-digit credit card expiration month, as an integer or string, i.e. 5
     * @param expirationMonth Value for PaymentProfileAttributesExpirationMonth
     */
    @JsonSetter("expiration_month")
    public void setExpirationMonth(PaymentProfileAttributesExpirationMonth expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    /**
     * Getter for ExpirationYear.
     * (Optional when performing a Subscription Import via vault_token, required otherwise) The
     * 4-digit credit card expiration year, as an integer or string, i.e. 2012
     * @return Returns the PaymentProfileAttributesExpirationYear
     */
    @JsonGetter("expiration_year")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentProfileAttributesExpirationYear getExpirationYear() {
        return expirationYear;
    }

    /**
     * Setter for ExpirationYear.
     * (Optional when performing a Subscription Import via vault_token, required otherwise) The
     * 4-digit credit card expiration year, as an integer or string, i.e. 2012
     * @param expirationYear Value for PaymentProfileAttributesExpirationYear
     */
    @JsonSetter("expiration_year")
    public void setExpirationYear(PaymentProfileAttributesExpirationYear expirationYear) {
        this.expirationYear = expirationYear;
    }

    /**
     * Getter for BillingAddress.
     * (Optional, may be required by your product configuration or gateway settings) The credit card
     * or bank account billing street address (i.e. 123 Main St.). This value is merely passed
     * through to the payment gateway.
     * @return Returns the String
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * (Optional, may be required by your product configuration or gateway settings) The credit card
     * or bank account billing street address (i.e. 123 Main St.). This value is merely passed
     * through to the payment gateway.
     * @param billingAddress Value for String
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Internal Getter for BillingAddress2.
     * (Optional) Second line of the customer’s billing address i.e. Apt. 100
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
     * (Optional) Second line of the customer’s billing address i.e. Apt. 100
     * @return Returns the String
     */
    public String getBillingAddress2() {
        return OptionalNullable.getFrom(billingAddress2);
    }

    /**
     * Setter for BillingAddress2.
     * (Optional) Second line of the customer’s billing address i.e. Apt. 100
     * @param billingAddress2 Value for String
     */
    @JsonSetter("billing_address_2")
    public void setBillingAddress2(String billingAddress2) {
        this.billingAddress2 = OptionalNullable.of(billingAddress2);
    }

    /**
     * UnSetter for BillingAddress2.
     * (Optional) Second line of the customer’s billing address i.e. Apt. 100
     */
    public void unsetBillingAddress2() {
        billingAddress2 = null;
    }

    /**
     * Getter for BillingCity.
     * (Optional, may be required by your product configuration or gateway settings) The credit card
     * or bank account billing address city (i.e. “Boston”). This value is merely passed through to
     * the payment gateway.
     * @return Returns the String
     */
    @JsonGetter("billing_city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * Setter for BillingCity.
     * (Optional, may be required by your product configuration or gateway settings) The credit card
     * or bank account billing address city (i.e. “Boston”). This value is merely passed through to
     * the payment gateway.
     * @param billingCity Value for String
     */
    @JsonSetter("billing_city")
    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    /**
     * Getter for BillingState.
     * (Optional, may be required by your product configuration or gateway settings) The credit card
     * or bank account billing address state (i.e. MA). This value is merely passed through to the
     * payment gateway. This must conform to the
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
     * (Optional, may be required by your product configuration or gateway settings) The credit card
     * or bank account billing address state (i.e. MA). This value is merely passed through to the
     * payment gateway. This must conform to the
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
     * (Optional, may be required by your product configuration or gateway settings) The credit card
     * or bank account billing address country, required in [ISO_3166-1
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
     * (Optional, may be required by your product configuration or gateway settings) The credit card
     * or bank account billing address country, required in [ISO_3166-1
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
     * (Optional, may be required by your product configuration or gateway settings) The credit card
     * or bank account billing address zip code (i.e. 12345). This value is merely passed through to
     * the payment gateway.
     * @return Returns the String
     */
    @JsonGetter("billing_zip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingZip() {
        return billingZip;
    }

    /**
     * Setter for BillingZip.
     * (Optional, may be required by your product configuration or gateway settings) The credit card
     * or bank account billing address zip code (i.e. 12345). This value is merely passed through to
     * the payment gateway.
     * @param billingZip Value for String
     */
    @JsonSetter("billing_zip")
    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    /**
     * Getter for CurrentVault.
     * (Optional, used only for Subscription Import) The vault that stores the payment profile with
     * the provided vault_token.
     * @return Returns the CurrentVault
     */
    @JsonGetter("current_vault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CurrentVault getCurrentVault() {
        return currentVault;
    }

    /**
     * Setter for CurrentVault.
     * (Optional, used only for Subscription Import) The vault that stores the payment profile with
     * the provided vault_token.
     * @param currentVault Value for CurrentVault
     */
    @JsonSetter("current_vault")
    public void setCurrentVault(CurrentVault currentVault) {
        this.currentVault = currentVault;
    }

    /**
     * Getter for VaultToken.
     * (Optional, used only for Subscription Import) The “token” provided by your vault storage for
     * an already stored payment profile
     * @return Returns the String
     */
    @JsonGetter("vault_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVaultToken() {
        return vaultToken;
    }

    /**
     * Setter for VaultToken.
     * (Optional, used only for Subscription Import) The “token” provided by your vault storage for
     * an already stored payment profile
     * @param vaultToken Value for String
     */
    @JsonSetter("vault_token")
    public void setVaultToken(String vaultToken) {
        this.vaultToken = vaultToken;
    }

    /**
     * Getter for CustomerVaultToken.
     * (Optional, used only for Subscription Import) (only for Authorize.Net CIM storage or Square)
     * The customerProfileId for the owner of the customerPaymentProfileId provided as the
     * vault_token
     * @return Returns the String
     */
    @JsonGetter("customer_vault_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomerVaultToken() {
        return customerVaultToken;
    }

    /**
     * Setter for CustomerVaultToken.
     * (Optional, used only for Subscription Import) (only for Authorize.Net CIM storage or Square)
     * The customerProfileId for the owner of the customerPaymentProfileId provided as the
     * vault_token
     * @param customerVaultToken Value for String
     */
    @JsonSetter("customer_vault_token")
    public void setCustomerVaultToken(String customerVaultToken) {
        this.customerVaultToken = customerVaultToken;
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
     * Getter for PaymentMethodNonce.
     * (Required for Square unless importing with vault_token and customer_vault_token) The nonce
     * generated by the Square Javascript library (SqPaymentForm)
     * @return Returns the String
     */
    @JsonGetter("payment_method_nonce")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaymentMethodNonce() {
        return paymentMethodNonce;
    }

    /**
     * Setter for PaymentMethodNonce.
     * (Required for Square unless importing with vault_token and customer_vault_token) The nonce
     * generated by the Square Javascript library (SqPaymentForm)
     * @param paymentMethodNonce Value for String
     */
    @JsonSetter("payment_method_nonce")
    public void setPaymentMethodNonce(String paymentMethodNonce) {
        this.paymentMethodNonce = paymentMethodNonce;
    }

    /**
     * Getter for GatewayHandle.
     * (Optional) This attribute is only available if MultiGateway feature is enabled for your Site.
     * This feature is in the Private Beta currently. gateway_handle is used to directly select a
     * gateway where a payment profile will be stored in. Every connected gateway must have a unique
     * gateway handle specified. Read [Multigateway
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
     * (Optional) This attribute is only available if MultiGateway feature is enabled for your Site.
     * This feature is in the Private Beta currently. gateway_handle is used to directly select a
     * gateway where a payment profile will be stored in. Every connected gateway must have a unique
     * gateway handle specified. Read [Multigateway
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
     * (Optional, may be required by your gateway settings) The 3- or 4-digit Card Verification
     * Value. This value is merely passed through to the payment gateway.
     * @return Returns the String
     */
    @JsonGetter("cvv")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCvv() {
        return cvv;
    }

    /**
     * Setter for Cvv.
     * (Optional, may be required by your gateway settings) The 3- or 4-digit Card Verification
     * Value. This value is merely passed through to the payment gateway.
     * @param cvv Value for String
     */
    @JsonSetter("cvv")
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    /**
     * Getter for LastFour.
     * (Optional, used only for Subscription Import) If you have the last 4 digits of the credit
     * card number, you may supply them here so that we may create a masked card number (i.e.
     * XXXX-XXXX-XXXX-1234) for display in the UI. Last 4 digits are required for refunds in
     * Auth.Net.
     * @return Returns the String
     */
    @JsonGetter("last_four")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastFour() {
        return lastFour;
    }

    /**
     * Setter for LastFour.
     * (Optional, used only for Subscription Import) If you have the last 4 digits of the credit
     * card number, you may supply them here so that we may create a masked card number (i.e.
     * XXXX-XXXX-XXXX-1234) for display in the UI. Last 4 digits are required for refunds in
     * Auth.Net.
     * @param lastFour Value for String
     */
    @JsonSetter("last_four")
    public void setLastFour(String lastFour) {
        this.lastFour = lastFour;
    }

    /**
     * Converts this PaymentProfileAttributes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentProfileAttributes [" + "chargifyToken=" + chargifyToken + ", id=" + id
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
                + ", lastFour=" + lastFour + "]";
    }

    /**
     * Builds a new {@link PaymentProfileAttributes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentProfileAttributes.Builder} object
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
                .lastFour(getLastFour());
        builder.billingAddress2 = internalGetBillingAddress2();
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentProfileAttributes}.
     */
    public static class Builder {
        private String chargifyToken;
        private Integer id;
        private String paymentType;
        private String firstName;
        private String lastName;
        private String maskedCardNumber;
        private String fullNumber;
        private CardType cardType;
        private PaymentProfileAttributesExpirationMonth expirationMonth;
        private PaymentProfileAttributesExpirationYear expirationYear;
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
         * @param  paymentType  String value for paymentType.
         * @return Builder
         */
        public Builder paymentType(String paymentType) {
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
         * @param  expirationMonth  PaymentProfileAttributesExpirationMonth value for
         *         expirationMonth.
         * @return Builder
         */
        public Builder expirationMonth(PaymentProfileAttributesExpirationMonth expirationMonth) {
            this.expirationMonth = expirationMonth;
            return this;
        }

        /**
         * Setter for expirationYear.
         * @param  expirationYear  PaymentProfileAttributesExpirationYear value for expirationYear.
         * @return Builder
         */
        public Builder expirationYear(PaymentProfileAttributesExpirationYear expirationYear) {
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
         * Setter for lastFour.
         * @param  lastFour  String value for lastFour.
         * @return Builder
         */
        public Builder lastFour(String lastFour) {
            this.lastFour = lastFour;
            return this;
        }

        /**
         * Builds a new {@link PaymentProfileAttributes} object using the set fields.
         * @return {@link PaymentProfileAttributes}
         */
        public PaymentProfileAttributes build() {
            return new PaymentProfileAttributes(chargifyToken, id, paymentType, firstName, lastName,
                    maskedCardNumber, fullNumber, cardType, expirationMonth, expirationYear,
                    billingAddress, billingAddress2, billingCity, billingState, billingCountry,
                    billingZip, currentVault, vaultToken, customerVaultToken, customerId,
                    paypalEmail, paymentMethodNonce, gatewayHandle, cvv, lastFour);
        }
    }
}
