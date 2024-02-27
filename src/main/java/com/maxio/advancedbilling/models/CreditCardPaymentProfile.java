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
 * This is a model class for CreditCardPaymentProfile type.
 */
public class CreditCardPaymentProfile
        extends BaseModel {
    private Integer id;
    private String firstName;
    private String lastName;
    private String maskedCardNumber;
    private CardType cardType;
    private Integer expirationMonth;
    private Integer expirationYear;
    private Integer customerId;
    private CurrentVault currentVault;
    private OptionalNullable<String> vaultToken;
    private OptionalNullable<String> billingAddress;
    private OptionalNullable<String> billingCity;
    private OptionalNullable<String> billingState;
    private OptionalNullable<String> billingZip;
    private OptionalNullable<String> billingCountry;
    private OptionalNullable<String> customerVaultToken;
    private OptionalNullable<String> billingAddress2;
    private PaymentType paymentType;
    private Boolean disabled;
    private String chargifyToken;
    private OptionalNullable<Integer> siteGatewaySettingId;
    private OptionalNullable<String> gatewayHandle;

    /**
     * Default constructor.
     */
    public CreditCardPaymentProfile() {
    }

    /**
     * Initialization constructor.
     * @param  maskedCardNumber  String value for maskedCardNumber.
     * @param  id  Integer value for id.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  cardType  CardType value for cardType.
     * @param  expirationMonth  Integer value for expirationMonth.
     * @param  expirationYear  Integer value for expirationYear.
     * @param  customerId  Integer value for customerId.
     * @param  currentVault  CurrentVault value for currentVault.
     * @param  vaultToken  String value for vaultToken.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingCity  String value for billingCity.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  billingCountry  String value for billingCountry.
     * @param  customerVaultToken  String value for customerVaultToken.
     * @param  billingAddress2  String value for billingAddress2.
     * @param  paymentType  PaymentType value for paymentType.
     * @param  disabled  Boolean value for disabled.
     * @param  chargifyToken  String value for chargifyToken.
     * @param  siteGatewaySettingId  Integer value for siteGatewaySettingId.
     * @param  gatewayHandle  String value for gatewayHandle.
     */
    public CreditCardPaymentProfile(
            String maskedCardNumber,
            Integer id,
            String firstName,
            String lastName,
            CardType cardType,
            Integer expirationMonth,
            Integer expirationYear,
            Integer customerId,
            CurrentVault currentVault,
            String vaultToken,
            String billingAddress,
            String billingCity,
            String billingState,
            String billingZip,
            String billingCountry,
            String customerVaultToken,
            String billingAddress2,
            PaymentType paymentType,
            Boolean disabled,
            String chargifyToken,
            Integer siteGatewaySettingId,
            String gatewayHandle) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.maskedCardNumber = maskedCardNumber;
        this.cardType = cardType;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.customerId = customerId;
        this.currentVault = currentVault;
        this.vaultToken = OptionalNullable.of(vaultToken);
        this.billingAddress = OptionalNullable.of(billingAddress);
        this.billingCity = OptionalNullable.of(billingCity);
        this.billingState = OptionalNullable.of(billingState);
        this.billingZip = OptionalNullable.of(billingZip);
        this.billingCountry = OptionalNullable.of(billingCountry);
        this.customerVaultToken = OptionalNullable.of(customerVaultToken);
        this.billingAddress2 = OptionalNullable.of(billingAddress2);
        this.paymentType = paymentType;
        this.disabled = disabled;
        this.chargifyToken = chargifyToken;
        this.siteGatewaySettingId = OptionalNullable.of(siteGatewaySettingId);
        this.gatewayHandle = OptionalNullable.of(gatewayHandle);
    }

    /**
     * Initialization constructor.
     * @param  maskedCardNumber  String value for maskedCardNumber.
     * @param  id  Integer value for id.
     * @param  firstName  String value for firstName.
     * @param  lastName  String value for lastName.
     * @param  cardType  CardType value for cardType.
     * @param  expirationMonth  Integer value for expirationMonth.
     * @param  expirationYear  Integer value for expirationYear.
     * @param  customerId  Integer value for customerId.
     * @param  currentVault  CurrentVault value for currentVault.
     * @param  vaultToken  String value for vaultToken.
     * @param  billingAddress  String value for billingAddress.
     * @param  billingCity  String value for billingCity.
     * @param  billingState  String value for billingState.
     * @param  billingZip  String value for billingZip.
     * @param  billingCountry  String value for billingCountry.
     * @param  customerVaultToken  String value for customerVaultToken.
     * @param  billingAddress2  String value for billingAddress2.
     * @param  paymentType  PaymentType value for paymentType.
     * @param  disabled  Boolean value for disabled.
     * @param  chargifyToken  String value for chargifyToken.
     * @param  siteGatewaySettingId  Integer value for siteGatewaySettingId.
     * @param  gatewayHandle  String value for gatewayHandle.
     */

    protected CreditCardPaymentProfile(String maskedCardNumber, Integer id, String firstName,
            String lastName, CardType cardType, Integer expirationMonth, Integer expirationYear,
            Integer customerId, CurrentVault currentVault, OptionalNullable<String> vaultToken,
            OptionalNullable<String> billingAddress, OptionalNullable<String> billingCity,
            OptionalNullable<String> billingState, OptionalNullable<String> billingZip,
            OptionalNullable<String> billingCountry, OptionalNullable<String> customerVaultToken,
            OptionalNullable<String> billingAddress2, PaymentType paymentType, Boolean disabled,
            String chargifyToken, OptionalNullable<Integer> siteGatewaySettingId,
            OptionalNullable<String> gatewayHandle) {
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
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.billingCountry = billingCountry;
        this.customerVaultToken = customerVaultToken;
        this.billingAddress2 = billingAddress2;
        this.paymentType = paymentType;
        this.disabled = disabled;
        this.chargifyToken = chargifyToken;
        this.siteGatewaySettingId = siteGatewaySettingId;
        this.gatewayHandle = gatewayHandle;
    }

    /**
     * Initialization constructor.
     * @param  maskedCardNumber  String value for maskedCardNumber.
     */
    @JsonCreator
    protected CreditCardPaymentProfile(
            @JsonProperty("masked_card_number") String maskedCardNumber) {
        this(maskedCardNumber, null, null, null, null, null, null, null, null,
                OptionalNullable.of(null), OptionalNullable.of(null), OptionalNullable.of(null),
                OptionalNullable.of(null), OptionalNullable.of(null), OptionalNullable.of(null),
                OptionalNullable.of(null), OptionalNullable.of(null), null, null, null,
                OptionalNullable.of(null), OptionalNullable.of(null));
        unsetVaultToken();
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
     * The Chargify-assigned ID of the stored card. This value can be used as an input to
     * payment_profile_id when creating a subscription, in order to re-use a stored payment profile
     * for the same customer.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The Chargify-assigned ID of the stored card. This value can be used as an input to
     * payment_profile_id when creating a subscription, in order to re-use a stored payment profile
     * for the same customer.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for FirstName.
     * The first name of the card holder.
     * @return Returns the String
     */
    @JsonGetter("first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for FirstName.
     * The first name of the card holder.
     * @param firstName Value for String
     */
    @JsonSetter("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for LastName.
     * The last name of the card holder.
     * @return Returns the String
     */
    @JsonGetter("last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for LastName.
     * The last name of the card holder.
     * @param lastName Value for String
     */
    @JsonSetter("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for MaskedCardNumber.
     * A string representation of the credit card number with all but the last 4 digits masked with
     * X’s (i.e. ‘XXXX-XXXX-XXXX-1234’).
     * @return Returns the String
     */
    @JsonGetter("masked_card_number")
    public String getMaskedCardNumber() {
        return maskedCardNumber;
    }

    /**
     * Setter for MaskedCardNumber.
     * A string representation of the credit card number with all but the last 4 digits masked with
     * X’s (i.e. ‘XXXX-XXXX-XXXX-1234’).
     * @param maskedCardNumber Value for String
     */
    @JsonSetter("masked_card_number")
    public void setMaskedCardNumber(String maskedCardNumber) {
        this.maskedCardNumber = maskedCardNumber;
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
     * An integer representing the expiration month of the card(1 – 12).
     * @return Returns the Integer
     */
    @JsonGetter("expiration_month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Setter for ExpirationMonth.
     * An integer representing the expiration month of the card(1 – 12).
     * @param expirationMonth Value for Integer
     */
    @JsonSetter("expiration_month")
    public void setExpirationMonth(Integer expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    /**
     * Getter for ExpirationYear.
     * An integer representing the 4-digit expiration year of the card(i.e. ‘2012’).
     * @return Returns the Integer
     */
    @JsonGetter("expiration_year")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getExpirationYear() {
        return expirationYear;
    }

    /**
     * Setter for ExpirationYear.
     * An integer representing the 4-digit expiration year of the card(i.e. ‘2012’).
     * @param expirationYear Value for Integer
     */
    @JsonSetter("expiration_year")
    public void setExpirationYear(Integer expirationYear) {
        this.expirationYear = expirationYear;
    }

    /**
     * Getter for CustomerId.
     * The Chargify-assigned id for the customer record to which the card belongs.
     * @return Returns the Integer
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * The Chargify-assigned id for the customer record to which the card belongs.
     * @param customerId Value for Integer
     */
    @JsonSetter("customer_id")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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
     * Internal Getter for VaultToken.
     * The “token” provided by your vault storage for an already stored payment profile.
     * @return Returns the Internal String
     */
    @JsonGetter("vault_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetVaultToken() {
        return this.vaultToken;
    }

    /**
     * Getter for VaultToken.
     * The “token” provided by your vault storage for an already stored payment profile.
     * @return Returns the String
     */
    public String getVaultToken() {
        return OptionalNullable.getFrom(vaultToken);
    }

    /**
     * Setter for VaultToken.
     * The “token” provided by your vault storage for an already stored payment profile.
     * @param vaultToken Value for String
     */
    @JsonSetter("vault_token")
    public void setVaultToken(String vaultToken) {
        this.vaultToken = OptionalNullable.of(vaultToken);
    }

    /**
     * UnSetter for VaultToken.
     * The “token” provided by your vault storage for an already stored payment profile.
     */
    public void unsetVaultToken() {
        vaultToken = null;
    }

    /**
     * Internal Getter for BillingAddress.
     * The current billing street address for the card.
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
     * The current billing street address for the card.
     * @return Returns the String
     */
    public String getBillingAddress() {
        return OptionalNullable.getFrom(billingAddress);
    }

    /**
     * Setter for BillingAddress.
     * The current billing street address for the card.
     * @param billingAddress Value for String
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = OptionalNullable.of(billingAddress);
    }

    /**
     * UnSetter for BillingAddress.
     * The current billing street address for the card.
     */
    public void unsetBillingAddress() {
        billingAddress = null;
    }

    /**
     * Internal Getter for BillingCity.
     * The current billing address city for the card.
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
     * The current billing address city for the card.
     * @return Returns the String
     */
    public String getBillingCity() {
        return OptionalNullable.getFrom(billingCity);
    }

    /**
     * Setter for BillingCity.
     * The current billing address city for the card.
     * @param billingCity Value for String
     */
    @JsonSetter("billing_city")
    public void setBillingCity(String billingCity) {
        this.billingCity = OptionalNullable.of(billingCity);
    }

    /**
     * UnSetter for BillingCity.
     * The current billing address city for the card.
     */
    public void unsetBillingCity() {
        billingCity = null;
    }

    /**
     * Internal Getter for BillingState.
     * The current billing address state for the card.
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
     * The current billing address state for the card.
     * @return Returns the String
     */
    public String getBillingState() {
        return OptionalNullable.getFrom(billingState);
    }

    /**
     * Setter for BillingState.
     * The current billing address state for the card.
     * @param billingState Value for String
     */
    @JsonSetter("billing_state")
    public void setBillingState(String billingState) {
        this.billingState = OptionalNullable.of(billingState);
    }

    /**
     * UnSetter for BillingState.
     * The current billing address state for the card.
     */
    public void unsetBillingState() {
        billingState = null;
    }

    /**
     * Internal Getter for BillingZip.
     * The current billing address zip code for the card.
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
     * The current billing address zip code for the card.
     * @return Returns the String
     */
    public String getBillingZip() {
        return OptionalNullable.getFrom(billingZip);
    }

    /**
     * Setter for BillingZip.
     * The current billing address zip code for the card.
     * @param billingZip Value for String
     */
    @JsonSetter("billing_zip")
    public void setBillingZip(String billingZip) {
        this.billingZip = OptionalNullable.of(billingZip);
    }

    /**
     * UnSetter for BillingZip.
     * The current billing address zip code for the card.
     */
    public void unsetBillingZip() {
        billingZip = null;
    }

    /**
     * Internal Getter for BillingCountry.
     * The current billing address country for the card.
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
     * The current billing address country for the card.
     * @return Returns the String
     */
    public String getBillingCountry() {
        return OptionalNullable.getFrom(billingCountry);
    }

    /**
     * Setter for BillingCountry.
     * The current billing address country for the card.
     * @param billingCountry Value for String
     */
    @JsonSetter("billing_country")
    public void setBillingCountry(String billingCountry) {
        this.billingCountry = OptionalNullable.of(billingCountry);
    }

    /**
     * UnSetter for BillingCountry.
     * The current billing address country for the card.
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
     * The current billing street address, second line, for the card.
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
     * The current billing street address, second line, for the card.
     * @return Returns the String
     */
    public String getBillingAddress2() {
        return OptionalNullable.getFrom(billingAddress2);
    }

    /**
     * Setter for BillingAddress2.
     * The current billing street address, second line, for the card.
     * @param billingAddress2 Value for String
     */
    @JsonSetter("billing_address_2")
    public void setBillingAddress2(String billingAddress2) {
        this.billingAddress2 = OptionalNullable.of(billingAddress2);
    }

    /**
     * UnSetter for BillingAddress2.
     * The current billing street address, second line, for the card.
     */
    public void unsetBillingAddress2() {
        billingAddress2 = null;
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
     * Getter for Disabled.
     * @return Returns the Boolean
     */
    @JsonGetter("disabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * Setter for Disabled.
     * @param disabled Value for Boolean
     */
    @JsonSetter("disabled")
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * Getter for ChargifyToken.
     * Token received after sending billing information using chargify.js. This token will only be
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
     * Token received after sending billing information using chargify.js. This token will only be
     * received if passed as a sole attribute of credit_card_attributes (i.e.
     * tok_9g6hw85pnpt6knmskpwp4ttt)
     * @param chargifyToken Value for String
     */
    @JsonSetter("chargify_token")
    public void setChargifyToken(String chargifyToken) {
        this.chargifyToken = chargifyToken;
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
     * An identifier of connected gateway.
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
     * An identifier of connected gateway.
     * @return Returns the String
     */
    public String getGatewayHandle() {
        return OptionalNullable.getFrom(gatewayHandle);
    }

    /**
     * Setter for GatewayHandle.
     * An identifier of connected gateway.
     * @param gatewayHandle Value for String
     */
    @JsonSetter("gateway_handle")
    public void setGatewayHandle(String gatewayHandle) {
        this.gatewayHandle = OptionalNullable.of(gatewayHandle);
    }

    /**
     * UnSetter for GatewayHandle.
     * An identifier of connected gateway.
     */
    public void unsetGatewayHandle() {
        gatewayHandle = null;
    }

    /**
     * Converts this CreditCardPaymentProfile into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreditCardPaymentProfile [" + "maskedCardNumber=" + maskedCardNumber + ", id=" + id
                + ", firstName=" + firstName + ", lastName=" + lastName + ", cardType=" + cardType
                + ", expirationMonth=" + expirationMonth + ", expirationYear=" + expirationYear
                + ", customerId=" + customerId + ", currentVault=" + currentVault + ", vaultToken="
                + vaultToken + ", billingAddress=" + billingAddress + ", billingCity=" + billingCity
                + ", billingState=" + billingState + ", billingZip=" + billingZip
                + ", billingCountry=" + billingCountry + ", customerVaultToken="
                + customerVaultToken + ", billingAddress2=" + billingAddress2 + ", paymentType="
                + paymentType + ", disabled=" + disabled + ", chargifyToken=" + chargifyToken
                + ", siteGatewaySettingId=" + siteGatewaySettingId + ", gatewayHandle="
                + gatewayHandle + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link CreditCardPaymentProfile.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreditCardPaymentProfile.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(maskedCardNumber)
                .id(getId())
                .firstName(getFirstName())
                .lastName(getLastName())
                .cardType(getCardType())
                .expirationMonth(getExpirationMonth())
                .expirationYear(getExpirationYear())
                .customerId(getCustomerId())
                .currentVault(getCurrentVault())
                .paymentType(getPaymentType())
                .disabled(getDisabled())
                .chargifyToken(getChargifyToken());
        builder.vaultToken = internalGetVaultToken();
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
     * Class to build instances of {@link CreditCardPaymentProfile}.
     */
    public static class Builder {
        private String maskedCardNumber;
        private Integer id;
        private String firstName;
        private String lastName;
        private CardType cardType;
        private Integer expirationMonth;
        private Integer expirationYear;
        private Integer customerId;
        private CurrentVault currentVault;
        private OptionalNullable<String> vaultToken;
        private OptionalNullable<String> billingAddress;
        private OptionalNullable<String> billingCity;
        private OptionalNullable<String> billingState;
        private OptionalNullable<String> billingZip;
        private OptionalNullable<String> billingCountry;
        private OptionalNullable<String> customerVaultToken;
        private OptionalNullable<String> billingAddress2;
        private PaymentType paymentType;
        private Boolean disabled;
        private String chargifyToken;
        private OptionalNullable<Integer> siteGatewaySettingId;
        private OptionalNullable<String> gatewayHandle;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  maskedCardNumber  String value for maskedCardNumber.
         */
        public Builder(String maskedCardNumber) {
            this.maskedCardNumber = maskedCardNumber;
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
         * @param  expirationMonth  Integer value for expirationMonth.
         * @return Builder
         */
        public Builder expirationMonth(Integer expirationMonth) {
            this.expirationMonth = expirationMonth;
            return this;
        }

        /**
         * Setter for expirationYear.
         * @param  expirationYear  Integer value for expirationYear.
         * @return Builder
         */
        public Builder expirationYear(Integer expirationYear) {
            this.expirationYear = expirationYear;
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
            this.vaultToken = OptionalNullable.of(vaultToken);
            return this;
        }

        /**
         * UnSetter for vaultToken.
         * @return Builder
         */
        public Builder unsetVaultToken() {
            vaultToken = null;
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
         * Setter for paymentType.
         * @param  paymentType  PaymentType value for paymentType.
         * @return Builder
         */
        public Builder paymentType(PaymentType paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Setter for disabled.
         * @param  disabled  Boolean value for disabled.
         * @return Builder
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = disabled;
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
         * Builds a new {@link CreditCardPaymentProfile} object using the set fields.
         * @return {@link CreditCardPaymentProfile}
         */
        public CreditCardPaymentProfile build() {
            return new CreditCardPaymentProfile(maskedCardNumber, id, firstName, lastName, cardType,
                    expirationMonth, expirationYear, customerId, currentVault, vaultToken,
                    billingAddress, billingCity, billingState, billingZip, billingCountry,
                    customerVaultToken, billingAddress2, paymentType, disabled, chargifyToken,
                    siteGatewaySettingId, gatewayHandle);
        }
    }
}
