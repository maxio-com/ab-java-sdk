/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.containers.UpdateSubscriptionNetTerms;
import com.maxio.advancedbilling.models.containers.UpdateSubscriptionSnapDay;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * This is a model class for UpdateSubscription type.
 */
public class UpdateSubscription
        extends BaseModel {
    private CreditCardAttributes creditCardAttributes;
    private String productHandle;
    private Integer productId;
    private Boolean productChangeDelayed;
    private String nextProductId;
    private String nextProductPricePointId;
    private UpdateSubscriptionSnapDay snapDay;
    private ZonedDateTime initialBillingAt;
    private Boolean deferSignup;
    private ZonedDateTime nextBillingAt;
    private ZonedDateTime expiresAt;
    private String paymentCollectionMethod;
    private Boolean receivesInvoiceEmails;
    private UpdateSubscriptionNetTerms netTerms;
    private Integer storedCredentialTransactionId;
    private String reference;
    private SubscriptionCustomPrice customPrice;
    private List<UpdateSubscriptionComponent> components;
    private Boolean dunningCommunicationDelayEnabled;
    private OptionalNullable<String> dunningCommunicationDelayTimeZone;
    private Integer productPricePointId;
    private String productPricePointHandle;

    /**
     * Default constructor.
     */
    public UpdateSubscription() {
        deferSignup = false;
    }

    /**
     * Initialization constructor.
     * @param  creditCardAttributes  CreditCardAttributes value for creditCardAttributes.
     * @param  productHandle  String value for productHandle.
     * @param  productId  Integer value for productId.
     * @param  productChangeDelayed  Boolean value for productChangeDelayed.
     * @param  nextProductId  String value for nextProductId.
     * @param  nextProductPricePointId  String value for nextProductPricePointId.
     * @param  snapDay  UpdateSubscriptionSnapDay value for snapDay.
     * @param  initialBillingAt  ZonedDateTime value for initialBillingAt.
     * @param  deferSignup  Boolean value for deferSignup.
     * @param  nextBillingAt  ZonedDateTime value for nextBillingAt.
     * @param  expiresAt  ZonedDateTime value for expiresAt.
     * @param  paymentCollectionMethod  String value for paymentCollectionMethod.
     * @param  receivesInvoiceEmails  Boolean value for receivesInvoiceEmails.
     * @param  netTerms  UpdateSubscriptionNetTerms value for netTerms.
     * @param  storedCredentialTransactionId  Integer value for storedCredentialTransactionId.
     * @param  reference  String value for reference.
     * @param  customPrice  SubscriptionCustomPrice value for customPrice.
     * @param  components  List of UpdateSubscriptionComponent value for components.
     * @param  dunningCommunicationDelayEnabled  Boolean value for dunningCommunicationDelayEnabled.
     * @param  dunningCommunicationDelayTimeZone  String value for
     *         dunningCommunicationDelayTimeZone.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  productPricePointHandle  String value for productPricePointHandle.
     */
    public UpdateSubscription(
            CreditCardAttributes creditCardAttributes,
            String productHandle,
            Integer productId,
            Boolean productChangeDelayed,
            String nextProductId,
            String nextProductPricePointId,
            UpdateSubscriptionSnapDay snapDay,
            ZonedDateTime initialBillingAt,
            Boolean deferSignup,
            ZonedDateTime nextBillingAt,
            ZonedDateTime expiresAt,
            String paymentCollectionMethod,
            Boolean receivesInvoiceEmails,
            UpdateSubscriptionNetTerms netTerms,
            Integer storedCredentialTransactionId,
            String reference,
            SubscriptionCustomPrice customPrice,
            List<UpdateSubscriptionComponent> components,
            Boolean dunningCommunicationDelayEnabled,
            String dunningCommunicationDelayTimeZone,
            Integer productPricePointId,
            String productPricePointHandle) {
        this.creditCardAttributes = creditCardAttributes;
        this.productHandle = productHandle;
        this.productId = productId;
        this.productChangeDelayed = productChangeDelayed;
        this.nextProductId = nextProductId;
        this.nextProductPricePointId = nextProductPricePointId;
        this.snapDay = snapDay;
        this.initialBillingAt = initialBillingAt;
        this.deferSignup = deferSignup;
        this.nextBillingAt = nextBillingAt;
        this.expiresAt = expiresAt;
        this.paymentCollectionMethod = paymentCollectionMethod;
        this.receivesInvoiceEmails = receivesInvoiceEmails;
        this.netTerms = netTerms;
        this.storedCredentialTransactionId = storedCredentialTransactionId;
        this.reference = reference;
        this.customPrice = customPrice;
        this.components = components;
        this.dunningCommunicationDelayEnabled = dunningCommunicationDelayEnabled;
        this.dunningCommunicationDelayTimeZone =
                OptionalNullable.of(dunningCommunicationDelayTimeZone);
        this.productPricePointId = productPricePointId;
        this.productPricePointHandle = productPricePointHandle;
    }

    /**
     * Initialization constructor.
     * @param  creditCardAttributes  CreditCardAttributes value for creditCardAttributes.
     * @param  productHandle  String value for productHandle.
     * @param  productId  Integer value for productId.
     * @param  productChangeDelayed  Boolean value for productChangeDelayed.
     * @param  nextProductId  String value for nextProductId.
     * @param  nextProductPricePointId  String value for nextProductPricePointId.
     * @param  snapDay  UpdateSubscriptionSnapDay value for snapDay.
     * @param  initialBillingAt  ZonedDateTime value for initialBillingAt.
     * @param  deferSignup  Boolean value for deferSignup.
     * @param  nextBillingAt  ZonedDateTime value for nextBillingAt.
     * @param  expiresAt  ZonedDateTime value for expiresAt.
     * @param  paymentCollectionMethod  String value for paymentCollectionMethod.
     * @param  receivesInvoiceEmails  Boolean value for receivesInvoiceEmails.
     * @param  netTerms  UpdateSubscriptionNetTerms value for netTerms.
     * @param  storedCredentialTransactionId  Integer value for storedCredentialTransactionId.
     * @param  reference  String value for reference.
     * @param  customPrice  SubscriptionCustomPrice value for customPrice.
     * @param  components  List of UpdateSubscriptionComponent value for components.
     * @param  dunningCommunicationDelayEnabled  Boolean value for dunningCommunicationDelayEnabled.
     * @param  dunningCommunicationDelayTimeZone  String value for
     *         dunningCommunicationDelayTimeZone.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  productPricePointHandle  String value for productPricePointHandle.
     */

    protected UpdateSubscription(CreditCardAttributes creditCardAttributes, String productHandle,
            Integer productId, Boolean productChangeDelayed, String nextProductId,
            String nextProductPricePointId, UpdateSubscriptionSnapDay snapDay,
            ZonedDateTime initialBillingAt, Boolean deferSignup, ZonedDateTime nextBillingAt,
            ZonedDateTime expiresAt, String paymentCollectionMethod, Boolean receivesInvoiceEmails,
            UpdateSubscriptionNetTerms netTerms, Integer storedCredentialTransactionId,
            String reference, SubscriptionCustomPrice customPrice,
            List<UpdateSubscriptionComponent> components, Boolean dunningCommunicationDelayEnabled,
            OptionalNullable<String> dunningCommunicationDelayTimeZone, Integer productPricePointId,
            String productPricePointHandle) {
        this.creditCardAttributes = creditCardAttributes;
        this.productHandle = productHandle;
        this.productId = productId;
        this.productChangeDelayed = productChangeDelayed;
        this.nextProductId = nextProductId;
        this.nextProductPricePointId = nextProductPricePointId;
        this.snapDay = snapDay;
        this.initialBillingAt = initialBillingAt;
        this.deferSignup = deferSignup;
        this.nextBillingAt = nextBillingAt;
        this.expiresAt = expiresAt;
        this.paymentCollectionMethod = paymentCollectionMethod;
        this.receivesInvoiceEmails = receivesInvoiceEmails;
        this.netTerms = netTerms;
        this.storedCredentialTransactionId = storedCredentialTransactionId;
        this.reference = reference;
        this.customPrice = customPrice;
        this.components = components;
        this.dunningCommunicationDelayEnabled = dunningCommunicationDelayEnabled;
        this.dunningCommunicationDelayTimeZone = dunningCommunicationDelayTimeZone;
        this.productPricePointId = productPricePointId;
        this.productPricePointHandle = productPricePointHandle;
    }

    /**
     * Getter for CreditCardAttributes.
     * @return Returns the CreditCardAttributes
     */
    @JsonGetter("credit_card_attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreditCardAttributes getCreditCardAttributes() {
        return creditCardAttributes;
    }

    /**
     * Setter for CreditCardAttributes.
     * @param creditCardAttributes Value for CreditCardAttributes
     */
    @JsonSetter("credit_card_attributes")
    public void setCreditCardAttributes(CreditCardAttributes creditCardAttributes) {
        this.creditCardAttributes = creditCardAttributes;
    }

    /**
     * Getter for ProductHandle.
     * Set to the handle of a different product to change the subscription's product
     * @return Returns the String
     */
    @JsonGetter("product_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductHandle() {
        return productHandle;
    }

    /**
     * Setter for ProductHandle.
     * Set to the handle of a different product to change the subscription's product
     * @param productHandle Value for String
     */
    @JsonSetter("product_handle")
    public void setProductHandle(String productHandle) {
        this.productHandle = productHandle;
    }

    /**
     * Getter for ProductId.
     * Set to the id of a different product to change the subscription's product
     * @return Returns the Integer
     */
    @JsonGetter("product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * Set to the id of a different product to change the subscription's product
     * @param productId Value for Integer
     */
    @JsonSetter("product_id")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * Getter for ProductChangeDelayed.
     * @return Returns the Boolean
     */
    @JsonGetter("product_change_delayed")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getProductChangeDelayed() {
        return productChangeDelayed;
    }

    /**
     * Setter for ProductChangeDelayed.
     * @param productChangeDelayed Value for Boolean
     */
    @JsonSetter("product_change_delayed")
    public void setProductChangeDelayed(Boolean productChangeDelayed) {
        this.productChangeDelayed = productChangeDelayed;
    }

    /**
     * Getter for NextProductId.
     * Set to an empty string to cancel a delayed product change.
     * @return Returns the String
     */
    @JsonGetter("next_product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNextProductId() {
        return nextProductId;
    }

    /**
     * Setter for NextProductId.
     * Set to an empty string to cancel a delayed product change.
     * @param nextProductId Value for String
     */
    @JsonSetter("next_product_id")
    public void setNextProductId(String nextProductId) {
        this.nextProductId = nextProductId;
    }

    /**
     * Getter for NextProductPricePointId.
     * @return Returns the String
     */
    @JsonGetter("next_product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNextProductPricePointId() {
        return nextProductPricePointId;
    }

    /**
     * Setter for NextProductPricePointId.
     * @param nextProductPricePointId Value for String
     */
    @JsonSetter("next_product_price_point_id")
    public void setNextProductPricePointId(String nextProductPricePointId) {
        this.nextProductPricePointId = nextProductPricePointId;
    }

    /**
     * Getter for SnapDay.
     * A day of month that subscription will be processed on. Can be 1 up to 28 or 'end'.
     * @return Returns the UpdateSubscriptionSnapDay
     */
    @JsonGetter("snap_day")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdateSubscriptionSnapDay getSnapDay() {
        return snapDay;
    }

    /**
     * Setter for SnapDay.
     * A day of month that subscription will be processed on. Can be 1 up to 28 or 'end'.
     * @param snapDay Value for UpdateSubscriptionSnapDay
     */
    @JsonSetter("snap_day")
    public void setSnapDay(UpdateSubscriptionSnapDay snapDay) {
        this.snapDay = snapDay;
    }

    /**
     * Getter for InitialBillingAt.
     * (Optional) Set this attribute to a future date/time to update a subscription in the Awaiting
     * Signup Date state, to Awaiting Signup. In the Awaiting Signup state, a subscription behaves
     * like any other. It can be canceled, allocated to, or have its billing date changed. etc. When
     * the `initial_billing_at` date hits, the subscription will transition to the expected state.
     * If the product has a trial, the subscription will enter a trial, otherwise it will go active.
     * Setup fees will be respected either before or after the trial, as configured on the price
     * point. If the payment is due at the initial_billing_at and it fails the subscription will be
     * immediately canceled. You can omit the initial_billing_at date to activate the subscription
     * immediately. See the [subscription
     * import](https://maxio.zendesk.com/hc/en-us/articles/24251489107213-Advanced-Billing-Subscription-Imports#date-format)
     * documentation for more information about Date/Time formats.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("initial_billing_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getInitialBillingAt() {
        return initialBillingAt;
    }

    /**
     * Setter for InitialBillingAt.
     * (Optional) Set this attribute to a future date/time to update a subscription in the Awaiting
     * Signup Date state, to Awaiting Signup. In the Awaiting Signup state, a subscription behaves
     * like any other. It can be canceled, allocated to, or have its billing date changed. etc. When
     * the `initial_billing_at` date hits, the subscription will transition to the expected state.
     * If the product has a trial, the subscription will enter a trial, otherwise it will go active.
     * Setup fees will be respected either before or after the trial, as configured on the price
     * point. If the payment is due at the initial_billing_at and it fails the subscription will be
     * immediately canceled. You can omit the initial_billing_at date to activate the subscription
     * immediately. See the [subscription
     * import](https://maxio.zendesk.com/hc/en-us/articles/24251489107213-Advanced-Billing-Subscription-Imports#date-format)
     * documentation for more information about Date/Time formats.
     * @param initialBillingAt Value for ZonedDateTime
     */
    @JsonSetter("initial_billing_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setInitialBillingAt(ZonedDateTime initialBillingAt) {
        this.initialBillingAt = initialBillingAt;
    }

    /**
     * Getter for DeferSignup.
     * (Optional) Set this attribute to true to move the subscription from Awaiting Signup, to
     * Awaiting Signup Date. Use this when you want to update a subscription that has an unknown
     * initial billing date. When the first billing date is known, update a subscription to set the
     * `initial_billing_at` date. The subscription moves to the awaiting signup with a scheduled
     * initial billing date. You can omit the initial_billing_at date to activate the subscription
     * immediately. See [Subscription
     * States](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404222005773-Subscription-States)
     * for more information.
     * @return Returns the Boolean
     */
    @JsonGetter("defer_signup")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDeferSignup() {
        return deferSignup;
    }

    /**
     * Setter for DeferSignup.
     * (Optional) Set this attribute to true to move the subscription from Awaiting Signup, to
     * Awaiting Signup Date. Use this when you want to update a subscription that has an unknown
     * initial billing date. When the first billing date is known, update a subscription to set the
     * `initial_billing_at` date. The subscription moves to the awaiting signup with a scheduled
     * initial billing date. You can omit the initial_billing_at date to activate the subscription
     * immediately. See [Subscription
     * States](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404222005773-Subscription-States)
     * for more information.
     * @param deferSignup Value for Boolean
     */
    @JsonSetter("defer_signup")
    public void setDeferSignup(Boolean deferSignup) {
        this.deferSignup = deferSignup;
    }

    /**
     * Getter for NextBillingAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("next_billing_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getNextBillingAt() {
        return nextBillingAt;
    }

    /**
     * Setter for NextBillingAt.
     * @param nextBillingAt Value for ZonedDateTime
     */
    @JsonSetter("next_billing_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNextBillingAt(ZonedDateTime nextBillingAt) {
        this.nextBillingAt = nextBillingAt;
    }

    /**
     * Getter for ExpiresAt.
     * Timestamp giving the expiration date of this subscription (if any). You may manually change
     * the expiration date at any point during a subscription period.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getExpiresAt() {
        return expiresAt;
    }

    /**
     * Setter for ExpiresAt.
     * Timestamp giving the expiration date of this subscription (if any). You may manually change
     * the expiration date at any point during a subscription period.
     * @param expiresAt Value for ZonedDateTime
     */
    @JsonSetter("expires_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpiresAt(ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Getter for PaymentCollectionMethod.
     * @return Returns the String
     */
    @JsonGetter("payment_collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaymentCollectionMethod() {
        return paymentCollectionMethod;
    }

    /**
     * Setter for PaymentCollectionMethod.
     * @param paymentCollectionMethod Value for String
     */
    @JsonSetter("payment_collection_method")
    public void setPaymentCollectionMethod(String paymentCollectionMethod) {
        this.paymentCollectionMethod = paymentCollectionMethod;
    }

    /**
     * Getter for ReceivesInvoiceEmails.
     * @return Returns the Boolean
     */
    @JsonGetter("receives_invoice_emails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getReceivesInvoiceEmails() {
        return receivesInvoiceEmails;
    }

    /**
     * Setter for ReceivesInvoiceEmails.
     * @param receivesInvoiceEmails Value for Boolean
     */
    @JsonSetter("receives_invoice_emails")
    public void setReceivesInvoiceEmails(Boolean receivesInvoiceEmails) {
        this.receivesInvoiceEmails = receivesInvoiceEmails;
    }

    /**
     * Getter for NetTerms.
     * @return Returns the UpdateSubscriptionNetTerms
     */
    @JsonGetter("net_terms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdateSubscriptionNetTerms getNetTerms() {
        return netTerms;
    }

    /**
     * Setter for NetTerms.
     * @param netTerms Value for UpdateSubscriptionNetTerms
     */
    @JsonSetter("net_terms")
    public void setNetTerms(UpdateSubscriptionNetTerms netTerms) {
        this.netTerms = netTerms;
    }

    /**
     * Getter for StoredCredentialTransactionId.
     * @return Returns the Integer
     */
    @JsonGetter("stored_credential_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getStoredCredentialTransactionId() {
        return storedCredentialTransactionId;
    }

    /**
     * Setter for StoredCredentialTransactionId.
     * @param storedCredentialTransactionId Value for Integer
     */
    @JsonSetter("stored_credential_transaction_id")
    public void setStoredCredentialTransactionId(Integer storedCredentialTransactionId) {
        this.storedCredentialTransactionId = storedCredentialTransactionId;
    }

    /**
     * Getter for Reference.
     * @return Returns the String
     */
    @JsonGetter("reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReference() {
        return reference;
    }

    /**
     * Setter for Reference.
     * @param reference Value for String
     */
    @JsonSetter("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Getter for CustomPrice.
     * (Optional) Used in place of `product_price_point_id` to define a custom price point unique to
     * the subscription. A subscription can have up to 30 custom price points. Exceeding this limit
     * will result in an API error.
     * @return Returns the SubscriptionCustomPrice
     */
    @JsonGetter("custom_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionCustomPrice getCustomPrice() {
        return customPrice;
    }

    /**
     * Setter for CustomPrice.
     * (Optional) Used in place of `product_price_point_id` to define a custom price point unique to
     * the subscription. A subscription can have up to 30 custom price points. Exceeding this limit
     * will result in an API error.
     * @param customPrice Value for SubscriptionCustomPrice
     */
    @JsonSetter("custom_price")
    public void setCustomPrice(SubscriptionCustomPrice customPrice) {
        this.customPrice = customPrice;
    }

    /**
     * Getter for Components.
     * (Optional) An array of component ids and custom prices to be added to the subscription.
     * @return Returns the List of UpdateSubscriptionComponent
     */
    @JsonGetter("components")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<UpdateSubscriptionComponent> getComponents() {
        return components;
    }

    /**
     * Setter for Components.
     * (Optional) An array of component ids and custom prices to be added to the subscription.
     * @param components Value for List of UpdateSubscriptionComponent
     */
    @JsonSetter("components")
    public void setComponents(List<UpdateSubscriptionComponent> components) {
        this.components = components;
    }

    /**
     * Getter for DunningCommunicationDelayEnabled.
     * Enable Communication Delay feature, making sure no communication (email or SMS) is sent to
     * the Customer between 9PM and 8AM in time zone set by the
     * `dunning_communication_delay_time_zone` attribute.
     * @return Returns the Boolean
     */
    @JsonGetter("dunning_communication_delay_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDunningCommunicationDelayEnabled() {
        return dunningCommunicationDelayEnabled;
    }

    /**
     * Setter for DunningCommunicationDelayEnabled.
     * Enable Communication Delay feature, making sure no communication (email or SMS) is sent to
     * the Customer between 9PM and 8AM in time zone set by the
     * `dunning_communication_delay_time_zone` attribute.
     * @param dunningCommunicationDelayEnabled Value for Boolean
     */
    @JsonSetter("dunning_communication_delay_enabled")
    public void setDunningCommunicationDelayEnabled(Boolean dunningCommunicationDelayEnabled) {
        this.dunningCommunicationDelayEnabled = dunningCommunicationDelayEnabled;
    }

    /**
     * Internal Getter for DunningCommunicationDelayTimeZone.
     * Time zone for the Dunning Communication Delay feature.
     * @return Returns the Internal String
     */
    @JsonGetter("dunning_communication_delay_time_zone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDunningCommunicationDelayTimeZone() {
        return this.dunningCommunicationDelayTimeZone;
    }

    /**
     * Getter for DunningCommunicationDelayTimeZone.
     * Time zone for the Dunning Communication Delay feature.
     * @return Returns the String
     */
    public String getDunningCommunicationDelayTimeZone() {
        return OptionalNullable.getFrom(dunningCommunicationDelayTimeZone);
    }

    /**
     * Setter for DunningCommunicationDelayTimeZone.
     * Time zone for the Dunning Communication Delay feature.
     * @param dunningCommunicationDelayTimeZone Value for String
     */
    @JsonSetter("dunning_communication_delay_time_zone")
    public void setDunningCommunicationDelayTimeZone(String dunningCommunicationDelayTimeZone) {
        this.dunningCommunicationDelayTimeZone = OptionalNullable.of(dunningCommunicationDelayTimeZone);
    }

    /**
     * UnSetter for DunningCommunicationDelayTimeZone.
     * Time zone for the Dunning Communication Delay feature.
     */
    public void unsetDunningCommunicationDelayTimeZone() {
        dunningCommunicationDelayTimeZone = null;
    }

    /**
     * Getter for ProductPricePointId.
     * Set to change the current product's price point.
     * @return Returns the Integer
     */
    @JsonGetter("product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductPricePointId() {
        return productPricePointId;
    }

    /**
     * Setter for ProductPricePointId.
     * Set to change the current product's price point.
     * @param productPricePointId Value for Integer
     */
    @JsonSetter("product_price_point_id")
    public void setProductPricePointId(Integer productPricePointId) {
        this.productPricePointId = productPricePointId;
    }

    /**
     * Getter for ProductPricePointHandle.
     * Set to change the current product's price point.
     * @return Returns the String
     */
    @JsonGetter("product_price_point_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductPricePointHandle() {
        return productPricePointHandle;
    }

    /**
     * Setter for ProductPricePointHandle.
     * Set to change the current product's price point.
     * @param productPricePointHandle Value for String
     */
    @JsonSetter("product_price_point_handle")
    public void setProductPricePointHandle(String productPricePointHandle) {
        this.productPricePointHandle = productPricePointHandle;
    }

    /**
     * Converts this UpdateSubscription into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateSubscription [" + "creditCardAttributes=" + creditCardAttributes
                + ", productHandle=" + productHandle + ", productId=" + productId
                + ", productChangeDelayed=" + productChangeDelayed + ", nextProductId="
                + nextProductId + ", nextProductPricePointId=" + nextProductPricePointId
                + ", snapDay=" + snapDay + ", initialBillingAt=" + initialBillingAt
                + ", deferSignup=" + deferSignup + ", nextBillingAt=" + nextBillingAt
                + ", expiresAt=" + expiresAt + ", paymentCollectionMethod="
                + paymentCollectionMethod + ", receivesInvoiceEmails=" + receivesInvoiceEmails
                + ", netTerms=" + netTerms + ", storedCredentialTransactionId="
                + storedCredentialTransactionId + ", reference=" + reference + ", customPrice="
                + customPrice + ", components=" + components + ", dunningCommunicationDelayEnabled="
                + dunningCommunicationDelayEnabled + ", dunningCommunicationDelayTimeZone="
                + dunningCommunicationDelayTimeZone + ", productPricePointId=" + productPricePointId
                + ", productPricePointHandle=" + productPricePointHandle + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UpdateSubscription.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateSubscription.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .creditCardAttributes(getCreditCardAttributes())
                .productHandle(getProductHandle())
                .productId(getProductId())
                .productChangeDelayed(getProductChangeDelayed())
                .nextProductId(getNextProductId())
                .nextProductPricePointId(getNextProductPricePointId())
                .snapDay(getSnapDay())
                .initialBillingAt(getInitialBillingAt())
                .deferSignup(getDeferSignup())
                .nextBillingAt(getNextBillingAt())
                .expiresAt(getExpiresAt())
                .paymentCollectionMethod(getPaymentCollectionMethod())
                .receivesInvoiceEmails(getReceivesInvoiceEmails())
                .netTerms(getNetTerms())
                .storedCredentialTransactionId(getStoredCredentialTransactionId())
                .reference(getReference())
                .customPrice(getCustomPrice())
                .components(getComponents())
                .dunningCommunicationDelayEnabled(getDunningCommunicationDelayEnabled())
                .productPricePointId(getProductPricePointId())
                .productPricePointHandle(getProductPricePointHandle());
        builder.dunningCommunicationDelayTimeZone = internalGetDunningCommunicationDelayTimeZone();
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateSubscription}.
     */
    public static class Builder {
        private CreditCardAttributes creditCardAttributes;
        private String productHandle;
        private Integer productId;
        private Boolean productChangeDelayed;
        private String nextProductId;
        private String nextProductPricePointId;
        private UpdateSubscriptionSnapDay snapDay;
        private ZonedDateTime initialBillingAt;
        private Boolean deferSignup = false;
        private ZonedDateTime nextBillingAt;
        private ZonedDateTime expiresAt;
        private String paymentCollectionMethod;
        private Boolean receivesInvoiceEmails;
        private UpdateSubscriptionNetTerms netTerms;
        private Integer storedCredentialTransactionId;
        private String reference;
        private SubscriptionCustomPrice customPrice;
        private List<UpdateSubscriptionComponent> components;
        private Boolean dunningCommunicationDelayEnabled;
        private OptionalNullable<String> dunningCommunicationDelayTimeZone;
        private Integer productPricePointId;
        private String productPricePointHandle;



        /**
         * Setter for creditCardAttributes.
         * @param  creditCardAttributes  CreditCardAttributes value for creditCardAttributes.
         * @return Builder
         */
        public Builder creditCardAttributes(CreditCardAttributes creditCardAttributes) {
            this.creditCardAttributes = creditCardAttributes;
            return this;
        }

        /**
         * Setter for productHandle.
         * @param  productHandle  String value for productHandle.
         * @return Builder
         */
        public Builder productHandle(String productHandle) {
            this.productHandle = productHandle;
            return this;
        }

        /**
         * Setter for productId.
         * @param  productId  Integer value for productId.
         * @return Builder
         */
        public Builder productId(Integer productId) {
            this.productId = productId;
            return this;
        }

        /**
         * Setter for productChangeDelayed.
         * @param  productChangeDelayed  Boolean value for productChangeDelayed.
         * @return Builder
         */
        public Builder productChangeDelayed(Boolean productChangeDelayed) {
            this.productChangeDelayed = productChangeDelayed;
            return this;
        }

        /**
         * Setter for nextProductId.
         * @param  nextProductId  String value for nextProductId.
         * @return Builder
         */
        public Builder nextProductId(String nextProductId) {
            this.nextProductId = nextProductId;
            return this;
        }

        /**
         * Setter for nextProductPricePointId.
         * @param  nextProductPricePointId  String value for nextProductPricePointId.
         * @return Builder
         */
        public Builder nextProductPricePointId(String nextProductPricePointId) {
            this.nextProductPricePointId = nextProductPricePointId;
            return this;
        }

        /**
         * Setter for snapDay.
         * @param  snapDay  UpdateSubscriptionSnapDay value for snapDay.
         * @return Builder
         */
        public Builder snapDay(UpdateSubscriptionSnapDay snapDay) {
            this.snapDay = snapDay;
            return this;
        }

        /**
         * Setter for initialBillingAt.
         * @param  initialBillingAt  ZonedDateTime value for initialBillingAt.
         * @return Builder
         */
        public Builder initialBillingAt(ZonedDateTime initialBillingAt) {
            this.initialBillingAt = initialBillingAt;
            return this;
        }

        /**
         * Setter for deferSignup.
         * @param  deferSignup  Boolean value for deferSignup.
         * @return Builder
         */
        public Builder deferSignup(Boolean deferSignup) {
            this.deferSignup = deferSignup;
            return this;
        }

        /**
         * Setter for nextBillingAt.
         * @param  nextBillingAt  ZonedDateTime value for nextBillingAt.
         * @return Builder
         */
        public Builder nextBillingAt(ZonedDateTime nextBillingAt) {
            this.nextBillingAt = nextBillingAt;
            return this;
        }

        /**
         * Setter for expiresAt.
         * @param  expiresAt  ZonedDateTime value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(ZonedDateTime expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Setter for paymentCollectionMethod.
         * @param  paymentCollectionMethod  String value for paymentCollectionMethod.
         * @return Builder
         */
        public Builder paymentCollectionMethod(String paymentCollectionMethod) {
            this.paymentCollectionMethod = paymentCollectionMethod;
            return this;
        }

        /**
         * Setter for receivesInvoiceEmails.
         * @param  receivesInvoiceEmails  Boolean value for receivesInvoiceEmails.
         * @return Builder
         */
        public Builder receivesInvoiceEmails(Boolean receivesInvoiceEmails) {
            this.receivesInvoiceEmails = receivesInvoiceEmails;
            return this;
        }

        /**
         * Setter for netTerms.
         * @param  netTerms  UpdateSubscriptionNetTerms value for netTerms.
         * @return Builder
         */
        public Builder netTerms(UpdateSubscriptionNetTerms netTerms) {
            this.netTerms = netTerms;
            return this;
        }

        /**
         * Setter for storedCredentialTransactionId.
         * @param  storedCredentialTransactionId  Integer value for storedCredentialTransactionId.
         * @return Builder
         */
        public Builder storedCredentialTransactionId(Integer storedCredentialTransactionId) {
            this.storedCredentialTransactionId = storedCredentialTransactionId;
            return this;
        }

        /**
         * Setter for reference.
         * @param  reference  String value for reference.
         * @return Builder
         */
        public Builder reference(String reference) {
            this.reference = reference;
            return this;
        }

        /**
         * Setter for customPrice.
         * @param  customPrice  SubscriptionCustomPrice value for customPrice.
         * @return Builder
         */
        public Builder customPrice(SubscriptionCustomPrice customPrice) {
            this.customPrice = customPrice;
            return this;
        }

        /**
         * Setter for components.
         * @param  components  List of UpdateSubscriptionComponent value for components.
         * @return Builder
         */
        public Builder components(List<UpdateSubscriptionComponent> components) {
            this.components = components;
            return this;
        }

        /**
         * Setter for dunningCommunicationDelayEnabled.
         * @param  dunningCommunicationDelayEnabled  Boolean value for
         *         dunningCommunicationDelayEnabled.
         * @return Builder
         */
        public Builder dunningCommunicationDelayEnabled(
                Boolean dunningCommunicationDelayEnabled) {
            this.dunningCommunicationDelayEnabled = dunningCommunicationDelayEnabled;
            return this;
        }

        /**
         * Setter for dunningCommunicationDelayTimeZone.
         * @param  dunningCommunicationDelayTimeZone  String value for
         *         dunningCommunicationDelayTimeZone.
         * @return Builder
         */
        public Builder dunningCommunicationDelayTimeZone(
                String dunningCommunicationDelayTimeZone) {
            this.dunningCommunicationDelayTimeZone =
                    OptionalNullable.of(dunningCommunicationDelayTimeZone);
            return this;
        }

        /**
         * UnSetter for dunningCommunicationDelayTimeZone.
         * @return Builder
         */
        public Builder unsetDunningCommunicationDelayTimeZone() {
            dunningCommunicationDelayTimeZone = null;
            return this;
        }

        /**
         * Setter for productPricePointId.
         * @param  productPricePointId  Integer value for productPricePointId.
         * @return Builder
         */
        public Builder productPricePointId(Integer productPricePointId) {
            this.productPricePointId = productPricePointId;
            return this;
        }

        /**
         * Setter for productPricePointHandle.
         * @param  productPricePointHandle  String value for productPricePointHandle.
         * @return Builder
         */
        public Builder productPricePointHandle(String productPricePointHandle) {
            this.productPricePointHandle = productPricePointHandle;
            return this;
        }

        /**
         * Builds a new {@link UpdateSubscription} object using the set fields.
         * @return {@link UpdateSubscription}
         */
        public UpdateSubscription build() {
            return new UpdateSubscription(creditCardAttributes, productHandle, productId,
                    productChangeDelayed, nextProductId, nextProductPricePointId, snapDay,
                    initialBillingAt, deferSignup, nextBillingAt, expiresAt,
                    paymentCollectionMethod, receivesInvoiceEmails, netTerms,
                    storedCredentialTransactionId, reference, customPrice, components,
                    dunningCommunicationDelayEnabled, dunningCommunicationDelayTimeZone,
                    productPricePointId, productPricePointHandle);
        }
    }
}
