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
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponents;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionGroup2;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionOfferId;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;
import java.util.Map;

/**
 * This is a model class for CreateSubscription type.
 */
public class CreateSubscription {
    private String productHandle;
    private String productId;
    private String productPricePointHandle;
    private String productPricePointId;
    private CustomPriceUsedForSubscriptionCreateUpdate customPrice;
    private String couponCode;
    private List<String> couponCodes;
    private PaymentCollectionMethod paymentCollectionMethod;
    private String receivesInvoiceEmails;
    private String netTerms;
    private Integer customerId;
    private String nextBillingAt;
    private String initialBillingAt;
    private Integer storedCredentialTransactionId;
    private Integer salesRepId;
    private Integer paymentProfileId;
    private String reference;
    private CustomerAttributes customerAttributes;
    private PaymentProfileAttributes paymentProfileAttributes;
    private PaymentProfileAttributes creditCardAttributes;
    private BankAccountAttributes bankAccountAttributes;
    private List<CreateSubscriptionComponents> components;
    private CalendarBilling calendarBilling;
    private Map<String, String> metafields;
    private String customerReference;
    private CreateSubscriptionGroup2 group;
    private String ref;
    private String cancellationMessage;
    private String cancellationMethod;
    private String currency;
    private String expiresAt;
    private String expirationTracksNextBillingChange;
    private String agreementTerms;
    private String authorizerFirstName;
    private String authorizerLastName;
    private String calendarBillingFirstCharge;
    private String reasonCode;
    private Boolean productChangeDelayed;
    private CreateSubscriptionOfferId offerId;
    private UpsertPrepaidConfiguration prepaidSubscriptionConfiguration;
    private String previousBillingAt;
    private Boolean importMrr;
    private String canceledAt;
    private String activatedAt;
    private AgreementAcceptance agreementAcceptance;
    private ACHAgreement achAgreement;
    private OptionalNullable<Boolean> dunningCommunicationDelayEnabled;
    private OptionalNullable<String> dunningCommunicationDelayTimeZone;
    private Boolean skipBillingManifestTaxes;

    /**
     * Default constructor.
     */
    public CreateSubscription() {
        paymentCollectionMethod = PaymentCollectionMethod.AUTOMATIC;
        dunningCommunicationDelayEnabled = OptionalNullable.of(false);
        skipBillingManifestTaxes = false;
    }

    /**
     * Initialization constructor.
     * @param  productHandle  String value for productHandle.
     * @param  productId  String value for productId.
     * @param  productPricePointHandle  String value for productPricePointHandle.
     * @param  productPricePointId  String value for productPricePointId.
     * @param  customPrice  CustomPriceUsedForSubscriptionCreateUpdate value for customPrice.
     * @param  couponCode  String value for couponCode.
     * @param  couponCodes  List of String value for couponCodes.
     * @param  paymentCollectionMethod  PaymentCollectionMethod value for paymentCollectionMethod.
     * @param  receivesInvoiceEmails  String value for receivesInvoiceEmails.
     * @param  netTerms  String value for netTerms.
     * @param  customerId  Integer value for customerId.
     * @param  nextBillingAt  String value for nextBillingAt.
     * @param  initialBillingAt  String value for initialBillingAt.
     * @param  storedCredentialTransactionId  Integer value for storedCredentialTransactionId.
     * @param  salesRepId  Integer value for salesRepId.
     * @param  paymentProfileId  Integer value for paymentProfileId.
     * @param  reference  String value for reference.
     * @param  customerAttributes  CustomerAttributes value for customerAttributes.
     * @param  paymentProfileAttributes  PaymentProfileAttributes value for
     *         paymentProfileAttributes.
     * @param  creditCardAttributes  PaymentProfileAttributes value for creditCardAttributes.
     * @param  bankAccountAttributes  BankAccountAttributes value for bankAccountAttributes.
     * @param  components  List of CreateSubscriptionComponents value for components.
     * @param  calendarBilling  CalendarBilling value for calendarBilling.
     * @param  metafields  Map of String, value for metafields.
     * @param  customerReference  String value for customerReference.
     * @param  group  CreateSubscriptionGroup2 value for group.
     * @param  ref  String value for ref.
     * @param  cancellationMessage  String value for cancellationMessage.
     * @param  cancellationMethod  String value for cancellationMethod.
     * @param  currency  String value for currency.
     * @param  expiresAt  String value for expiresAt.
     * @param  expirationTracksNextBillingChange  String value for
     *         expirationTracksNextBillingChange.
     * @param  agreementTerms  String value for agreementTerms.
     * @param  authorizerFirstName  String value for authorizerFirstName.
     * @param  authorizerLastName  String value for authorizerLastName.
     * @param  calendarBillingFirstCharge  String value for calendarBillingFirstCharge.
     * @param  reasonCode  String value for reasonCode.
     * @param  productChangeDelayed  Boolean value for productChangeDelayed.
     * @param  offerId  CreateSubscriptionOfferId value for offerId.
     * @param  prepaidSubscriptionConfiguration  UpsertPrepaidConfiguration value for
     *         prepaidSubscriptionConfiguration.
     * @param  previousBillingAt  String value for previousBillingAt.
     * @param  importMrr  Boolean value for importMrr.
     * @param  canceledAt  String value for canceledAt.
     * @param  activatedAt  String value for activatedAt.
     * @param  agreementAcceptance  AgreementAcceptance value for agreementAcceptance.
     * @param  achAgreement  ACHAgreement value for achAgreement.
     * @param  dunningCommunicationDelayEnabled  Boolean value for dunningCommunicationDelayEnabled.
     * @param  dunningCommunicationDelayTimeZone  String value for
     *         dunningCommunicationDelayTimeZone.
     * @param  skipBillingManifestTaxes  Boolean value for skipBillingManifestTaxes.
     */
    public CreateSubscription(
            String productHandle,
            String productId,
            String productPricePointHandle,
            String productPricePointId,
            CustomPriceUsedForSubscriptionCreateUpdate customPrice,
            String couponCode,
            List<String> couponCodes,
            PaymentCollectionMethod paymentCollectionMethod,
            String receivesInvoiceEmails,
            String netTerms,
            Integer customerId,
            String nextBillingAt,
            String initialBillingAt,
            Integer storedCredentialTransactionId,
            Integer salesRepId,
            Integer paymentProfileId,
            String reference,
            CustomerAttributes customerAttributes,
            PaymentProfileAttributes paymentProfileAttributes,
            PaymentProfileAttributes creditCardAttributes,
            BankAccountAttributes bankAccountAttributes,
            List<CreateSubscriptionComponents> components,
            CalendarBilling calendarBilling,
            Map<String, String> metafields,
            String customerReference,
            CreateSubscriptionGroup2 group,
            String ref,
            String cancellationMessage,
            String cancellationMethod,
            String currency,
            String expiresAt,
            String expirationTracksNextBillingChange,
            String agreementTerms,
            String authorizerFirstName,
            String authorizerLastName,
            String calendarBillingFirstCharge,
            String reasonCode,
            Boolean productChangeDelayed,
            CreateSubscriptionOfferId offerId,
            UpsertPrepaidConfiguration prepaidSubscriptionConfiguration,
            String previousBillingAt,
            Boolean importMrr,
            String canceledAt,
            String activatedAt,
            AgreementAcceptance agreementAcceptance,
            ACHAgreement achAgreement,
            Boolean dunningCommunicationDelayEnabled,
            String dunningCommunicationDelayTimeZone,
            Boolean skipBillingManifestTaxes) {
        this.productHandle = productHandle;
        this.productId = productId;
        this.productPricePointHandle = productPricePointHandle;
        this.productPricePointId = productPricePointId;
        this.customPrice = customPrice;
        this.couponCode = couponCode;
        this.couponCodes = couponCodes;
        this.paymentCollectionMethod = paymentCollectionMethod;
        this.receivesInvoiceEmails = receivesInvoiceEmails;
        this.netTerms = netTerms;
        this.customerId = customerId;
        this.nextBillingAt = nextBillingAt;
        this.initialBillingAt = initialBillingAt;
        this.storedCredentialTransactionId = storedCredentialTransactionId;
        this.salesRepId = salesRepId;
        this.paymentProfileId = paymentProfileId;
        this.reference = reference;
        this.customerAttributes = customerAttributes;
        this.paymentProfileAttributes = paymentProfileAttributes;
        this.creditCardAttributes = creditCardAttributes;
        this.bankAccountAttributes = bankAccountAttributes;
        this.components = components;
        this.calendarBilling = calendarBilling;
        this.metafields = metafields;
        this.customerReference = customerReference;
        this.group = group;
        this.ref = ref;
        this.cancellationMessage = cancellationMessage;
        this.cancellationMethod = cancellationMethod;
        this.currency = currency;
        this.expiresAt = expiresAt;
        this.expirationTracksNextBillingChange = expirationTracksNextBillingChange;
        this.agreementTerms = agreementTerms;
        this.authorizerFirstName = authorizerFirstName;
        this.authorizerLastName = authorizerLastName;
        this.calendarBillingFirstCharge = calendarBillingFirstCharge;
        this.reasonCode = reasonCode;
        this.productChangeDelayed = productChangeDelayed;
        this.offerId = offerId;
        this.prepaidSubscriptionConfiguration = prepaidSubscriptionConfiguration;
        this.previousBillingAt = previousBillingAt;
        this.importMrr = importMrr;
        this.canceledAt = canceledAt;
        this.activatedAt = activatedAt;
        this.agreementAcceptance = agreementAcceptance;
        this.achAgreement = achAgreement;
        this.dunningCommunicationDelayEnabled =
                OptionalNullable.of(dunningCommunicationDelayEnabled);
        this.dunningCommunicationDelayTimeZone =
                OptionalNullable.of(dunningCommunicationDelayTimeZone);
        this.skipBillingManifestTaxes = skipBillingManifestTaxes;
    }

    /**
     * Initialization constructor.
     * @param  productHandle  String value for productHandle.
     * @param  productId  String value for productId.
     * @param  productPricePointHandle  String value for productPricePointHandle.
     * @param  productPricePointId  String value for productPricePointId.
     * @param  customPrice  CustomPriceUsedForSubscriptionCreateUpdate value for customPrice.
     * @param  couponCode  String value for couponCode.
     * @param  couponCodes  List of String value for couponCodes.
     * @param  paymentCollectionMethod  PaymentCollectionMethod value for paymentCollectionMethod.
     * @param  receivesInvoiceEmails  String value for receivesInvoiceEmails.
     * @param  netTerms  String value for netTerms.
     * @param  customerId  Integer value for customerId.
     * @param  nextBillingAt  String value for nextBillingAt.
     * @param  initialBillingAt  String value for initialBillingAt.
     * @param  storedCredentialTransactionId  Integer value for storedCredentialTransactionId.
     * @param  salesRepId  Integer value for salesRepId.
     * @param  paymentProfileId  Integer value for paymentProfileId.
     * @param  reference  String value for reference.
     * @param  customerAttributes  CustomerAttributes value for customerAttributes.
     * @param  paymentProfileAttributes  PaymentProfileAttributes value for
     *         paymentProfileAttributes.
     * @param  creditCardAttributes  PaymentProfileAttributes value for creditCardAttributes.
     * @param  bankAccountAttributes  BankAccountAttributes value for bankAccountAttributes.
     * @param  components  List of CreateSubscriptionComponents value for components.
     * @param  calendarBilling  CalendarBilling value for calendarBilling.
     * @param  metafields  Map of String, value for metafields.
     * @param  customerReference  String value for customerReference.
     * @param  group  CreateSubscriptionGroup2 value for group.
     * @param  ref  String value for ref.
     * @param  cancellationMessage  String value for cancellationMessage.
     * @param  cancellationMethod  String value for cancellationMethod.
     * @param  currency  String value for currency.
     * @param  expiresAt  String value for expiresAt.
     * @param  expirationTracksNextBillingChange  String value for
     *         expirationTracksNextBillingChange.
     * @param  agreementTerms  String value for agreementTerms.
     * @param  authorizerFirstName  String value for authorizerFirstName.
     * @param  authorizerLastName  String value for authorizerLastName.
     * @param  calendarBillingFirstCharge  String value for calendarBillingFirstCharge.
     * @param  reasonCode  String value for reasonCode.
     * @param  productChangeDelayed  Boolean value for productChangeDelayed.
     * @param  offerId  CreateSubscriptionOfferId value for offerId.
     * @param  prepaidSubscriptionConfiguration  UpsertPrepaidConfiguration value for
     *         prepaidSubscriptionConfiguration.
     * @param  previousBillingAt  String value for previousBillingAt.
     * @param  importMrr  Boolean value for importMrr.
     * @param  canceledAt  String value for canceledAt.
     * @param  activatedAt  String value for activatedAt.
     * @param  agreementAcceptance  AgreementAcceptance value for agreementAcceptance.
     * @param  achAgreement  ACHAgreement value for achAgreement.
     * @param  dunningCommunicationDelayEnabled  Boolean value for dunningCommunicationDelayEnabled.
     * @param  dunningCommunicationDelayTimeZone  String value for
     *         dunningCommunicationDelayTimeZone.
     * @param  skipBillingManifestTaxes  Boolean value for skipBillingManifestTaxes.
     */

    protected CreateSubscription(String productHandle, String productId,
            String productPricePointHandle, String productPricePointId,
            CustomPriceUsedForSubscriptionCreateUpdate customPrice, String couponCode,
            List<String> couponCodes, PaymentCollectionMethod paymentCollectionMethod,
            String receivesInvoiceEmails, String netTerms, Integer customerId, String nextBillingAt,
            String initialBillingAt, Integer storedCredentialTransactionId, Integer salesRepId,
            Integer paymentProfileId, String reference, CustomerAttributes customerAttributes,
            PaymentProfileAttributes paymentProfileAttributes,
            PaymentProfileAttributes creditCardAttributes,
            BankAccountAttributes bankAccountAttributes,
            List<CreateSubscriptionComponents> components, CalendarBilling calendarBilling,
            Map<String, String> metafields, String customerReference,
            CreateSubscriptionGroup2 group, String ref, String cancellationMessage,
            String cancellationMethod, String currency, String expiresAt,
            String expirationTracksNextBillingChange, String agreementTerms,
            String authorizerFirstName, String authorizerLastName,
            String calendarBillingFirstCharge, String reasonCode, Boolean productChangeDelayed,
            CreateSubscriptionOfferId offerId,
            UpsertPrepaidConfiguration prepaidSubscriptionConfiguration, String previousBillingAt,
            Boolean importMrr, String canceledAt, String activatedAt,
            AgreementAcceptance agreementAcceptance, ACHAgreement achAgreement,
            OptionalNullable<Boolean> dunningCommunicationDelayEnabled,
            OptionalNullable<String> dunningCommunicationDelayTimeZone,
            Boolean skipBillingManifestTaxes) {
        this.productHandle = productHandle;
        this.productId = productId;
        this.productPricePointHandle = productPricePointHandle;
        this.productPricePointId = productPricePointId;
        this.customPrice = customPrice;
        this.couponCode = couponCode;
        this.couponCodes = couponCodes;
        this.paymentCollectionMethod = paymentCollectionMethod;
        this.receivesInvoiceEmails = receivesInvoiceEmails;
        this.netTerms = netTerms;
        this.customerId = customerId;
        this.nextBillingAt = nextBillingAt;
        this.initialBillingAt = initialBillingAt;
        this.storedCredentialTransactionId = storedCredentialTransactionId;
        this.salesRepId = salesRepId;
        this.paymentProfileId = paymentProfileId;
        this.reference = reference;
        this.customerAttributes = customerAttributes;
        this.paymentProfileAttributes = paymentProfileAttributes;
        this.creditCardAttributes = creditCardAttributes;
        this.bankAccountAttributes = bankAccountAttributes;
        this.components = components;
        this.calendarBilling = calendarBilling;
        this.metafields = metafields;
        this.customerReference = customerReference;
        this.group = group;
        this.ref = ref;
        this.cancellationMessage = cancellationMessage;
        this.cancellationMethod = cancellationMethod;
        this.currency = currency;
        this.expiresAt = expiresAt;
        this.expirationTracksNextBillingChange = expirationTracksNextBillingChange;
        this.agreementTerms = agreementTerms;
        this.authorizerFirstName = authorizerFirstName;
        this.authorizerLastName = authorizerLastName;
        this.calendarBillingFirstCharge = calendarBillingFirstCharge;
        this.reasonCode = reasonCode;
        this.productChangeDelayed = productChangeDelayed;
        this.offerId = offerId;
        this.prepaidSubscriptionConfiguration = prepaidSubscriptionConfiguration;
        this.previousBillingAt = previousBillingAt;
        this.importMrr = importMrr;
        this.canceledAt = canceledAt;
        this.activatedAt = activatedAt;
        this.agreementAcceptance = agreementAcceptance;
        this.achAgreement = achAgreement;
        this.dunningCommunicationDelayEnabled = dunningCommunicationDelayEnabled;
        this.dunningCommunicationDelayTimeZone = dunningCommunicationDelayTimeZone;
        this.skipBillingManifestTaxes = skipBillingManifestTaxes;
    }

    /**
     * Getter for ProductHandle.
     * The API Handle of the product for which you are creating a subscription. Required, unless a
     * `product_id` is given instead.
     * @return Returns the String
     */
    @JsonGetter("product_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductHandle() {
        return productHandle;
    }

    /**
     * Setter for ProductHandle.
     * The API Handle of the product for which you are creating a subscription. Required, unless a
     * `product_id` is given instead.
     * @param productHandle Value for String
     */
    @JsonSetter("product_handle")
    public void setProductHandle(String productHandle) {
        this.productHandle = productHandle;
    }

    /**
     * Getter for ProductId.
     * The Product ID of the product for which you are creating a subscription. The product ID is
     * not currently published, so we recommend using the API Handle instead.
     * @return Returns the String
     */
    @JsonGetter("product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * The Product ID of the product for which you are creating a subscription. The product ID is
     * not currently published, so we recommend using the API Handle instead.
     * @param productId Value for String
     */
    @JsonSetter("product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Getter for ProductPricePointHandle.
     * The user-friendly API handle of a product's particular price point.
     * @return Returns the String
     */
    @JsonGetter("product_price_point_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductPricePointHandle() {
        return productPricePointHandle;
    }

    /**
     * Setter for ProductPricePointHandle.
     * The user-friendly API handle of a product's particular price point.
     * @param productPricePointHandle Value for String
     */
    @JsonSetter("product_price_point_handle")
    public void setProductPricePointHandle(String productPricePointHandle) {
        this.productPricePointHandle = productPricePointHandle;
    }

    /**
     * Getter for ProductPricePointId.
     * The ID of the particular price point on the product.
     * @return Returns the String
     */
    @JsonGetter("product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductPricePointId() {
        return productPricePointId;
    }

    /**
     * Setter for ProductPricePointId.
     * The ID of the particular price point on the product.
     * @param productPricePointId Value for String
     */
    @JsonSetter("product_price_point_id")
    public void setProductPricePointId(String productPricePointId) {
        this.productPricePointId = productPricePointId;
    }

    /**
     * Getter for CustomPrice.
     * (Optional) Used in place of `product_price_point_id` to define a custom price point unique to
     * the subscription
     * @return Returns the CustomPriceUsedForSubscriptionCreateUpdate
     */
    @JsonGetter("custom_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomPriceUsedForSubscriptionCreateUpdate getCustomPrice() {
        return customPrice;
    }

    /**
     * Setter for CustomPrice.
     * (Optional) Used in place of `product_price_point_id` to define a custom price point unique to
     * the subscription
     * @param customPrice Value for CustomPriceUsedForSubscriptionCreateUpdate
     */
    @JsonSetter("custom_price")
    public void setCustomPrice(CustomPriceUsedForSubscriptionCreateUpdate customPrice) {
        this.customPrice = customPrice;
    }

    /**
     * Getter for CouponCode.
     * (deprecated) The coupon code of the single coupon currently applied to the subscription. See
     * coupon_codes instead as subscriptions can now have more than one coupon.
     * @return Returns the String
     */
    @JsonGetter("coupon_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * Setter for CouponCode.
     * (deprecated) The coupon code of the single coupon currently applied to the subscription. See
     * coupon_codes instead as subscriptions can now have more than one coupon.
     * @param couponCode Value for String
     */
    @JsonSetter("coupon_code")
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    /**
     * Getter for CouponCodes.
     * An array for all the coupons attached to the subscription.
     * @return Returns the List of String
     */
    @JsonGetter("coupon_codes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getCouponCodes() {
        return couponCodes;
    }

    /**
     * Setter for CouponCodes.
     * An array for all the coupons attached to the subscription.
     * @param couponCodes Value for List of String
     */
    @JsonSetter("coupon_codes")
    public void setCouponCodes(List<String> couponCodes) {
        this.couponCodes = couponCodes;
    }

    /**
     * Getter for PaymentCollectionMethod.
     * The type of payment collection to be used in the subscription. For legacy Statements
     * Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing
     * Architecture valid options are - `remittance`, `automatic`, `prepaid`.
     * @return Returns the PaymentCollectionMethod
     */
    @JsonGetter("payment_collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentCollectionMethod getPaymentCollectionMethod() {
        return paymentCollectionMethod;
    }

    /**
     * Setter for PaymentCollectionMethod.
     * The type of payment collection to be used in the subscription. For legacy Statements
     * Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing
     * Architecture valid options are - `remittance`, `automatic`, `prepaid`.
     * @param paymentCollectionMethod Value for PaymentCollectionMethod
     */
    @JsonSetter("payment_collection_method")
    public void setPaymentCollectionMethod(PaymentCollectionMethod paymentCollectionMethod) {
        this.paymentCollectionMethod = paymentCollectionMethod;
    }

    /**
     * Getter for ReceivesInvoiceEmails.
     * (Optional) Default: True - Whether or not this subscription is set to receive emails related
     * to this subscription.
     * @return Returns the String
     */
    @JsonGetter("receives_invoice_emails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReceivesInvoiceEmails() {
        return receivesInvoiceEmails;
    }

    /**
     * Setter for ReceivesInvoiceEmails.
     * (Optional) Default: True - Whether or not this subscription is set to receive emails related
     * to this subscription.
     * @param receivesInvoiceEmails Value for String
     */
    @JsonSetter("receives_invoice_emails")
    public void setReceivesInvoiceEmails(String receivesInvoiceEmails) {
        this.receivesInvoiceEmails = receivesInvoiceEmails;
    }

    /**
     * Getter for NetTerms.
     * (Optional) Default: null The number of days after renewal (on invoice billing) that a
     * subscription is due. A value between 0 (due immediately) and 180.
     * @return Returns the String
     */
    @JsonGetter("net_terms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNetTerms() {
        return netTerms;
    }

    /**
     * Setter for NetTerms.
     * (Optional) Default: null The number of days after renewal (on invoice billing) that a
     * subscription is due. A value between 0 (due immediately) and 180.
     * @param netTerms Value for String
     */
    @JsonSetter("net_terms")
    public void setNetTerms(String netTerms) {
        this.netTerms = netTerms;
    }

    /**
     * Getter for CustomerId.
     * The ID of an existing customer within Chargify. Required, unless a `customer_reference` or a
     * set of `customer_attributes` is given.
     * @return Returns the Integer
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * The ID of an existing customer within Chargify. Required, unless a `customer_reference` or a
     * set of `customer_attributes` is given.
     * @param customerId Value for Integer
     */
    @JsonSetter("customer_id")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for NextBillingAt.
     * (Optional) Set this attribute to a future date/time to sync imported subscriptions to your
     * existing renewal schedule. See the notes on “Date/Time Format” in our [subscription import
     * documentation](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404863655821#date-format).
     * If you provide a next_billing_at timestamp that is in the future, no trial or initial charges
     * will be applied when you create the subscription. In fact, no payment will be captured at
     * all. The first payment will be captured, according to the prices defined by the product, near
     * the time specified by next_billing_at. If you do not provide a value for next_billing_at, any
     * trial and/or initial charges will be assessed and charged at the time of subscription
     * creation. If the card cannot be successfully charged, the subscription will not be created.
     * See further notes in the section on Importing Subscriptions.
     * @return Returns the String
     */
    @JsonGetter("next_billing_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNextBillingAt() {
        return nextBillingAt;
    }

    /**
     * Setter for NextBillingAt.
     * (Optional) Set this attribute to a future date/time to sync imported subscriptions to your
     * existing renewal schedule. See the notes on “Date/Time Format” in our [subscription import
     * documentation](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404863655821#date-format).
     * If you provide a next_billing_at timestamp that is in the future, no trial or initial charges
     * will be applied when you create the subscription. In fact, no payment will be captured at
     * all. The first payment will be captured, according to the prices defined by the product, near
     * the time specified by next_billing_at. If you do not provide a value for next_billing_at, any
     * trial and/or initial charges will be assessed and charged at the time of subscription
     * creation. If the card cannot be successfully charged, the subscription will not be created.
     * See further notes in the section on Importing Subscriptions.
     * @param nextBillingAt Value for String
     */
    @JsonSetter("next_billing_at")
    public void setNextBillingAt(String nextBillingAt) {
        this.nextBillingAt = nextBillingAt;
    }

    /**
     * Getter for InitialBillingAt.
     * (Optional) Set this attribute to a future date/time to create a subscription in the "Awaiting
     * Signup" state, rather than "Active" or "Trialing". See the notes on “Date/Time Format” in our
     * [subscription import
     * documentation](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404863655821#date-format).
     * In the "Awaiting Signup" state, a subscription behaves like any other. It can be canceled,
     * allocated to, had its billing date changed. etc. When the initial_billing_at date hits, the
     * subscription will transition to the expected state. If the product has a trial, the
     * subscription will enter a trial, otherwise it will go active. Setup fees will be respected
     * either before or after the trial, as configured on the price point. If the payment is due at
     * the initial_billing_at and it fails the subscription will be immediately canceled. See
     * further notes in the section on Delayed Signups.
     * @return Returns the String
     */
    @JsonGetter("initial_billing_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInitialBillingAt() {
        return initialBillingAt;
    }

    /**
     * Setter for InitialBillingAt.
     * (Optional) Set this attribute to a future date/time to create a subscription in the "Awaiting
     * Signup" state, rather than "Active" or "Trialing". See the notes on “Date/Time Format” in our
     * [subscription import
     * documentation](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404863655821#date-format).
     * In the "Awaiting Signup" state, a subscription behaves like any other. It can be canceled,
     * allocated to, had its billing date changed. etc. When the initial_billing_at date hits, the
     * subscription will transition to the expected state. If the product has a trial, the
     * subscription will enter a trial, otherwise it will go active. Setup fees will be respected
     * either before or after the trial, as configured on the price point. If the payment is due at
     * the initial_billing_at and it fails the subscription will be immediately canceled. See
     * further notes in the section on Delayed Signups.
     * @param initialBillingAt Value for String
     */
    @JsonSetter("initial_billing_at")
    public void setInitialBillingAt(String initialBillingAt) {
        this.initialBillingAt = initialBillingAt;
    }

    /**
     * Getter for StoredCredentialTransactionId.
     * For European sites subject to PSD2 and using 3D Secure, this can be used to reference a
     * previous transaction for the customer. This will ensure the card will be charged successfully
     * at renewal.
     * @return Returns the Integer
     */
    @JsonGetter("stored_credential_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getStoredCredentialTransactionId() {
        return storedCredentialTransactionId;
    }

    /**
     * Setter for StoredCredentialTransactionId.
     * For European sites subject to PSD2 and using 3D Secure, this can be used to reference a
     * previous transaction for the customer. This will ensure the card will be charged successfully
     * at renewal.
     * @param storedCredentialTransactionId Value for Integer
     */
    @JsonSetter("stored_credential_transaction_id")
    public void setStoredCredentialTransactionId(Integer storedCredentialTransactionId) {
        this.storedCredentialTransactionId = storedCredentialTransactionId;
    }

    /**
     * Getter for SalesRepId.
     * @return Returns the Integer
     */
    @JsonGetter("sales_rep_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSalesRepId() {
        return salesRepId;
    }

    /**
     * Setter for SalesRepId.
     * @param salesRepId Value for Integer
     */
    @JsonSetter("sales_rep_id")
    public void setSalesRepId(Integer salesRepId) {
        this.salesRepId = salesRepId;
    }

    /**
     * Getter for PaymentProfileId.
     * The Payment Profile ID of an existing card or bank account, which belongs to an existing
     * customer to use for payment for this subscription. If the card, bank account, or customer
     * does not exist already, or if you want to use a new (unstored) card or bank account for the
     * subscription, use `payment_profile_attributes` instead to create a new payment profile along
     * with the subscription. (This value is available on an existing subscription via the API as
     * `credit_card` &gt; id or `bank_account` &gt; id)
     * @return Returns the Integer
     */
    @JsonGetter("payment_profile_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPaymentProfileId() {
        return paymentProfileId;
    }

    /**
     * Setter for PaymentProfileId.
     * The Payment Profile ID of an existing card or bank account, which belongs to an existing
     * customer to use for payment for this subscription. If the card, bank account, or customer
     * does not exist already, or if you want to use a new (unstored) card or bank account for the
     * subscription, use `payment_profile_attributes` instead to create a new payment profile along
     * with the subscription. (This value is available on an existing subscription via the API as
     * `credit_card` &gt; id or `bank_account` &gt; id)
     * @param paymentProfileId Value for Integer
     */
    @JsonSetter("payment_profile_id")
    public void setPaymentProfileId(Integer paymentProfileId) {
        this.paymentProfileId = paymentProfileId;
    }

    /**
     * Getter for Reference.
     * The reference value (provided by your app) for the subscription itelf.
     * @return Returns the String
     */
    @JsonGetter("reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReference() {
        return reference;
    }

    /**
     * Setter for Reference.
     * The reference value (provided by your app) for the subscription itelf.
     * @param reference Value for String
     */
    @JsonSetter("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Getter for CustomerAttributes.
     * @return Returns the CustomerAttributes
     */
    @JsonGetter("customer_attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomerAttributes getCustomerAttributes() {
        return customerAttributes;
    }

    /**
     * Setter for CustomerAttributes.
     * @param customerAttributes Value for CustomerAttributes
     */
    @JsonSetter("customer_attributes")
    public void setCustomerAttributes(CustomerAttributes customerAttributes) {
        this.customerAttributes = customerAttributes;
    }

    /**
     * Getter for PaymentProfileAttributes.
     * alias to credit_card_attributes
     * @return Returns the PaymentProfileAttributes
     */
    @JsonGetter("payment_profile_attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentProfileAttributes getPaymentProfileAttributes() {
        return paymentProfileAttributes;
    }

    /**
     * Setter for PaymentProfileAttributes.
     * alias to credit_card_attributes
     * @param paymentProfileAttributes Value for PaymentProfileAttributes
     */
    @JsonSetter("payment_profile_attributes")
    public void setPaymentProfileAttributes(PaymentProfileAttributes paymentProfileAttributes) {
        this.paymentProfileAttributes = paymentProfileAttributes;
    }

    /**
     * Getter for CreditCardAttributes.
     * Credit Card data to create a new Subscription. Interchangeable with
     * `payment_profile_attributes` property.
     * @return Returns the PaymentProfileAttributes
     */
    @JsonGetter("credit_card_attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentProfileAttributes getCreditCardAttributes() {
        return creditCardAttributes;
    }

    /**
     * Setter for CreditCardAttributes.
     * Credit Card data to create a new Subscription. Interchangeable with
     * `payment_profile_attributes` property.
     * @param creditCardAttributes Value for PaymentProfileAttributes
     */
    @JsonSetter("credit_card_attributes")
    public void setCreditCardAttributes(PaymentProfileAttributes creditCardAttributes) {
        this.creditCardAttributes = creditCardAttributes;
    }

    /**
     * Getter for BankAccountAttributes.
     * @return Returns the BankAccountAttributes
     */
    @JsonGetter("bank_account_attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankAccountAttributes getBankAccountAttributes() {
        return bankAccountAttributes;
    }

    /**
     * Setter for BankAccountAttributes.
     * @param bankAccountAttributes Value for BankAccountAttributes
     */
    @JsonSetter("bank_account_attributes")
    public void setBankAccountAttributes(BankAccountAttributes bankAccountAttributes) {
        this.bankAccountAttributes = bankAccountAttributes;
    }

    /**
     * Getter for Components.
     * (Optional) An array of component ids and quantities to be added to the subscription. See
     * [Components](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405020625677) for more
     * information.
     * @return Returns the List of CreateSubscriptionComponents
     */
    @JsonGetter("components")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CreateSubscriptionComponents> getComponents() {
        return components;
    }

    /**
     * Setter for Components.
     * (Optional) An array of component ids and quantities to be added to the subscription. See
     * [Components](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405020625677) for more
     * information.
     * @param components Value for List of CreateSubscriptionComponents
     */
    @JsonSetter("components")
    public void setComponents(List<CreateSubscriptionComponents> components) {
        this.components = components;
    }

    /**
     * Getter for CalendarBilling.
     * (Optional). Cannot be used when also specifying next_billing_at
     * @return Returns the CalendarBilling
     */
    @JsonGetter("calendar_billing")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CalendarBilling getCalendarBilling() {
        return calendarBilling;
    }

    /**
     * Setter for CalendarBilling.
     * (Optional). Cannot be used when also specifying next_billing_at
     * @param calendarBilling Value for CalendarBilling
     */
    @JsonSetter("calendar_billing")
    public void setCalendarBilling(CalendarBilling calendarBilling) {
        this.calendarBilling = calendarBilling;
    }

    /**
     * Getter for Metafields.
     * (Optional) A set of key/value pairs representing custom fields and their values. Metafields
     * will be created “on-the-fly” in your site for a given key, if they have not been created yet.
     * @return Returns the Map of String, String
     */
    @JsonGetter("metafields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, String> getMetafields() {
        return metafields;
    }

    /**
     * Setter for Metafields.
     * (Optional) A set of key/value pairs representing custom fields and their values. Metafields
     * will be created “on-the-fly” in your site for a given key, if they have not been created yet.
     * @param metafields Value for Map of String, String
     */
    @JsonSetter("metafields")
    public void setMetafields(Map<String, String> metafields) {
        this.metafields = metafields;
    }

    /**
     * Getter for CustomerReference.
     * The reference value (provided by your app) of an existing customer within Chargify. Required,
     * unless a `customer_id` or a set of `customer_attributes` is given.
     * @return Returns the String
     */
    @JsonGetter("customer_reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Setter for CustomerReference.
     * The reference value (provided by your app) of an existing customer within Chargify. Required,
     * unless a `customer_id` or a set of `customer_attributes` is given.
     * @param customerReference Value for String
     */
    @JsonSetter("customer_reference")
    public void setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
    }

    /**
     * Getter for Group.
     * @return Returns the CreateSubscriptionGroup2
     */
    @JsonGetter("group")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateSubscriptionGroup2 getGroup() {
        return group;
    }

    /**
     * Setter for Group.
     * @param group Value for CreateSubscriptionGroup2
     */
    @JsonSetter("group")
    public void setGroup(CreateSubscriptionGroup2 group) {
        this.group = group;
    }

    /**
     * Getter for Ref.
     * A valid referral code. (optional, see
     * [Referrals](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405420204045-Referrals-Reference#how-to-obtain-referral-codes)
     * for more details). If supplied, must be valid, or else subscription creation will fail.
     * @return Returns the String
     */
    @JsonGetter("ref")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRef() {
        return ref;
    }

    /**
     * Setter for Ref.
     * A valid referral code. (optional, see
     * [Referrals](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405420204045-Referrals-Reference#how-to-obtain-referral-codes)
     * for more details). If supplied, must be valid, or else subscription creation will fail.
     * @param ref Value for String
     */
    @JsonSetter("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * Getter for CancellationMessage.
     * (Optional) Can be used when canceling a subscription (via the HTTP DELETE method) to make a
     * note about the reason for cancellation.
     * @return Returns the String
     */
    @JsonGetter("cancellation_message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCancellationMessage() {
        return cancellationMessage;
    }

    /**
     * Setter for CancellationMessage.
     * (Optional) Can be used when canceling a subscription (via the HTTP DELETE method) to make a
     * note about the reason for cancellation.
     * @param cancellationMessage Value for String
     */
    @JsonSetter("cancellation_message")
    public void setCancellationMessage(String cancellationMessage) {
        this.cancellationMessage = cancellationMessage;
    }

    /**
     * Getter for CancellationMethod.
     * (Optional) Can be used when canceling a subscription (via the HTTP DELETE method) to make a
     * note about how the subscription was canceled.
     * @return Returns the String
     */
    @JsonGetter("cancellation_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCancellationMethod() {
        return cancellationMethod;
    }

    /**
     * Setter for CancellationMethod.
     * (Optional) Can be used when canceling a subscription (via the HTTP DELETE method) to make a
     * note about how the subscription was canceled.
     * @param cancellationMethod Value for String
     */
    @JsonSetter("cancellation_method")
    public void setCancellationMethod(String cancellationMethod) {
        this.cancellationMethod = cancellationMethod;
    }

    /**
     * Getter for Currency.
     * (Optional) If Multi-Currency is enabled and the currency is configured in Chargify, pass it
     * at signup to create a subscription on a non-default currency. Note that you cannot update the
     * currency of an existing subscription.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * (Optional) If Multi-Currency is enabled and the currency is configured in Chargify, pass it
     * at signup to create a subscription on a non-default currency. Note that you cannot update the
     * currency of an existing subscription.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for ExpiresAt.
     * Timestamp giving the expiration date of this subscription (if any). You may manually change
     * the expiration date at any point during a subscription period.
     * @return Returns the String
     */
    @JsonGetter("expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpiresAt() {
        return expiresAt;
    }

    /**
     * Setter for ExpiresAt.
     * Timestamp giving the expiration date of this subscription (if any). You may manually change
     * the expiration date at any point during a subscription period.
     * @param expiresAt Value for String
     */
    @JsonSetter("expires_at")
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Getter for ExpirationTracksNextBillingChange.
     * (Optional, default false) When set to true, and when next_billing_at is present, if the
     * subscription expires, the expires_at will be shifted by the same amount of time as the
     * difference between the old and new “next billing” dates.
     * @return Returns the String
     */
    @JsonGetter("expiration_tracks_next_billing_change")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpirationTracksNextBillingChange() {
        return expirationTracksNextBillingChange;
    }

    /**
     * Setter for ExpirationTracksNextBillingChange.
     * (Optional, default false) When set to true, and when next_billing_at is present, if the
     * subscription expires, the expires_at will be shifted by the same amount of time as the
     * difference between the old and new “next billing” dates.
     * @param expirationTracksNextBillingChange Value for String
     */
    @JsonSetter("expiration_tracks_next_billing_change")
    public void setExpirationTracksNextBillingChange(String expirationTracksNextBillingChange) {
        this.expirationTracksNextBillingChange = expirationTracksNextBillingChange;
    }

    /**
     * Getter for AgreementTerms.
     * (Optional) The ACH authorization agreement terms. If enabled, an email will be sent to the
     * customer with a copy of the terms.
     * @return Returns the String
     */
    @JsonGetter("agreement_terms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAgreementTerms() {
        return agreementTerms;
    }

    /**
     * Setter for AgreementTerms.
     * (Optional) The ACH authorization agreement terms. If enabled, an email will be sent to the
     * customer with a copy of the terms.
     * @param agreementTerms Value for String
     */
    @JsonSetter("agreement_terms")
    public void setAgreementTerms(String agreementTerms) {
        this.agreementTerms = agreementTerms;
    }

    /**
     * Getter for AuthorizerFirstName.
     * (Optional) The first name of the person authorizing the ACH agreement.
     * @return Returns the String
     */
    @JsonGetter("authorizer_first_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAuthorizerFirstName() {
        return authorizerFirstName;
    }

    /**
     * Setter for AuthorizerFirstName.
     * (Optional) The first name of the person authorizing the ACH agreement.
     * @param authorizerFirstName Value for String
     */
    @JsonSetter("authorizer_first_name")
    public void setAuthorizerFirstName(String authorizerFirstName) {
        this.authorizerFirstName = authorizerFirstName;
    }

    /**
     * Getter for AuthorizerLastName.
     * (Optional) The last name of the person authorizing the ACH agreement.
     * @return Returns the String
     */
    @JsonGetter("authorizer_last_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAuthorizerLastName() {
        return authorizerLastName;
    }

    /**
     * Setter for AuthorizerLastName.
     * (Optional) The last name of the person authorizing the ACH agreement.
     * @param authorizerLastName Value for String
     */
    @JsonSetter("authorizer_last_name")
    public void setAuthorizerLastName(String authorizerLastName) {
        this.authorizerLastName = authorizerLastName;
    }

    /**
     * Getter for CalendarBillingFirstCharge.
     * (Optional) One of “prorated” (the default – the prorated product price will be charged
     * immediately), “immediate” (the full product price will be charged immediately), or “delayed”
     * (the full product price will be charged with the first scheduled renewal).
     * @return Returns the String
     */
    @JsonGetter("calendar_billing_first_charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCalendarBillingFirstCharge() {
        return calendarBillingFirstCharge;
    }

    /**
     * Setter for CalendarBillingFirstCharge.
     * (Optional) One of “prorated” (the default – the prorated product price will be charged
     * immediately), “immediate” (the full product price will be charged immediately), or “delayed”
     * (the full product price will be charged with the first scheduled renewal).
     * @param calendarBillingFirstCharge Value for String
     */
    @JsonSetter("calendar_billing_first_charge")
    public void setCalendarBillingFirstCharge(String calendarBillingFirstCharge) {
        this.calendarBillingFirstCharge = calendarBillingFirstCharge;
    }

    /**
     * Getter for ReasonCode.
     * (Optional) Can be used when canceling a subscription (via the HTTP DELETE method) to indicate
     * why a subscription was canceled.
     * @return Returns the String
     */
    @JsonGetter("reason_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Setter for ReasonCode.
     * (Optional) Can be used when canceling a subscription (via the HTTP DELETE method) to indicate
     * why a subscription was canceled.
     * @param reasonCode Value for String
     */
    @JsonSetter("reason_code")
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Getter for ProductChangeDelayed.
     * (Optional, used only for Delayed Product Change When set to true, indicates that a changed
     * value for product_handle should schedule the product change to the next subscription renewal.
     * @return Returns the Boolean
     */
    @JsonGetter("product_change_delayed")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getProductChangeDelayed() {
        return productChangeDelayed;
    }

    /**
     * Setter for ProductChangeDelayed.
     * (Optional, used only for Delayed Product Change When set to true, indicates that a changed
     * value for product_handle should schedule the product change to the next subscription renewal.
     * @param productChangeDelayed Value for Boolean
     */
    @JsonSetter("product_change_delayed")
    public void setProductChangeDelayed(Boolean productChangeDelayed) {
        this.productChangeDelayed = productChangeDelayed;
    }

    /**
     * Getter for OfferId.
     * Use in place of passing product and component information to set up the subscription with an
     * existing offer. May be either the Chargify id of the offer or its handle prefixed with
     * `handle:`.er
     * @return Returns the CreateSubscriptionOfferId
     */
    @JsonGetter("offer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateSubscriptionOfferId getOfferId() {
        return offerId;
    }

    /**
     * Setter for OfferId.
     * Use in place of passing product and component information to set up the subscription with an
     * existing offer. May be either the Chargify id of the offer or its handle prefixed with
     * `handle:`.er
     * @param offerId Value for CreateSubscriptionOfferId
     */
    @JsonSetter("offer_id")
    public void setOfferId(CreateSubscriptionOfferId offerId) {
        this.offerId = offerId;
    }

    /**
     * Getter for PrepaidSubscriptionConfiguration.
     * @return Returns the UpsertPrepaidConfiguration
     */
    @JsonGetter("prepaid_subscription_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpsertPrepaidConfiguration getPrepaidSubscriptionConfiguration() {
        return prepaidSubscriptionConfiguration;
    }

    /**
     * Setter for PrepaidSubscriptionConfiguration.
     * @param prepaidSubscriptionConfiguration Value for UpsertPrepaidConfiguration
     */
    @JsonSetter("prepaid_subscription_configuration")
    public void setPrepaidSubscriptionConfiguration(UpsertPrepaidConfiguration prepaidSubscriptionConfiguration) {
        this.prepaidSubscriptionConfiguration = prepaidSubscriptionConfiguration;
    }

    /**
     * Getter for PreviousBillingAt.
     * Providing a previous_billing_at that is in the past will set the current_period_starts_at
     * when the subscription is created. It will also set activated_at if not explicitly passed
     * during the subscription import. Can only be used if next_billing_at is also passed. Using
     * this option will allow you to set the period start for the subscription so mid period
     * component allocations have the correct prorated amount.
     * @return Returns the String
     */
    @JsonGetter("previous_billing_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPreviousBillingAt() {
        return previousBillingAt;
    }

    /**
     * Setter for PreviousBillingAt.
     * Providing a previous_billing_at that is in the past will set the current_period_starts_at
     * when the subscription is created. It will also set activated_at if not explicitly passed
     * during the subscription import. Can only be used if next_billing_at is also passed. Using
     * this option will allow you to set the period start for the subscription so mid period
     * component allocations have the correct prorated amount.
     * @param previousBillingAt Value for String
     */
    @JsonSetter("previous_billing_at")
    public void setPreviousBillingAt(String previousBillingAt) {
        this.previousBillingAt = previousBillingAt;
    }

    /**
     * Getter for ImportMrr.
     * Setting this attribute to true will cause the subscription's MRR to be added to your MRR
     * analytics immediately. For this value to be honored, a next_billing_at must be present and
     * set to a future date. This key/value will not be returned in the subscription response body.
     * @return Returns the Boolean
     */
    @JsonGetter("import_mrr")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getImportMrr() {
        return importMrr;
    }

    /**
     * Setter for ImportMrr.
     * Setting this attribute to true will cause the subscription's MRR to be added to your MRR
     * analytics immediately. For this value to be honored, a next_billing_at must be present and
     * set to a future date. This key/value will not be returned in the subscription response body.
     * @param importMrr Value for Boolean
     */
    @JsonSetter("import_mrr")
    public void setImportMrr(Boolean importMrr) {
        this.importMrr = importMrr;
    }

    /**
     * Getter for CanceledAt.
     * @return Returns the String
     */
    @JsonGetter("canceled_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCanceledAt() {
        return canceledAt;
    }

    /**
     * Setter for CanceledAt.
     * @param canceledAt Value for String
     */
    @JsonSetter("canceled_at")
    public void setCanceledAt(String canceledAt) {
        this.canceledAt = canceledAt;
    }

    /**
     * Getter for ActivatedAt.
     * @return Returns the String
     */
    @JsonGetter("activated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getActivatedAt() {
        return activatedAt;
    }

    /**
     * Setter for ActivatedAt.
     * @param activatedAt Value for String
     */
    @JsonSetter("activated_at")
    public void setActivatedAt(String activatedAt) {
        this.activatedAt = activatedAt;
    }

    /**
     * Getter for AgreementAcceptance.
     * Required when creating a subscription with Maxio Payments.
     * @return Returns the AgreementAcceptance
     */
    @JsonGetter("agreement_acceptance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AgreementAcceptance getAgreementAcceptance() {
        return agreementAcceptance;
    }

    /**
     * Setter for AgreementAcceptance.
     * Required when creating a subscription with Maxio Payments.
     * @param agreementAcceptance Value for AgreementAcceptance
     */
    @JsonSetter("agreement_acceptance")
    public void setAgreementAcceptance(AgreementAcceptance agreementAcceptance) {
        this.agreementAcceptance = agreementAcceptance;
    }

    /**
     * Getter for AchAgreement.
     * (Optional) If passed, the proof of the authorized ACH agreement terms will be persisted.
     * @return Returns the ACHAgreement
     */
    @JsonGetter("ach_agreement")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ACHAgreement getAchAgreement() {
        return achAgreement;
    }

    /**
     * Setter for AchAgreement.
     * (Optional) If passed, the proof of the authorized ACH agreement terms will be persisted.
     * @param achAgreement Value for ACHAgreement
     */
    @JsonSetter("ach_agreement")
    public void setAchAgreement(ACHAgreement achAgreement) {
        this.achAgreement = achAgreement;
    }

    /**
     * Internal Getter for DunningCommunicationDelayEnabled.
     * Enable Communication Delay feature, making sure no communication (email or SMS) is sent to
     * the Customer between 9PM and 8AM in time zone set by the
     * `dunning_communication_delay_time_zone` attribute.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("dunning_communication_delay_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetDunningCommunicationDelayEnabled() {
        return this.dunningCommunicationDelayEnabled;
    }

    /**
     * Getter for DunningCommunicationDelayEnabled.
     * Enable Communication Delay feature, making sure no communication (email or SMS) is sent to
     * the Customer between 9PM and 8AM in time zone set by the
     * `dunning_communication_delay_time_zone` attribute.
     * @return Returns the Boolean
     */
    public Boolean getDunningCommunicationDelayEnabled() {
        return OptionalNullable.getFrom(dunningCommunicationDelayEnabled);
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
        this.dunningCommunicationDelayEnabled = OptionalNullable.of(dunningCommunicationDelayEnabled);
    }

    /**
     * UnSetter for DunningCommunicationDelayEnabled.
     * Enable Communication Delay feature, making sure no communication (email or SMS) is sent to
     * the Customer between 9PM and 8AM in time zone set by the
     * `dunning_communication_delay_time_zone` attribute.
     */
    public void unsetDunningCommunicationDelayEnabled() {
        dunningCommunicationDelayEnabled = null;
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
     * Getter for SkipBillingManifestTaxes.
     * Valid only for the Subscription Preview endpoint. When set to `true` it skips calculating
     * taxes for the current and next billing manifests.
     * @return Returns the Boolean
     */
    @JsonGetter("skip_billing_manifest_taxes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getSkipBillingManifestTaxes() {
        return skipBillingManifestTaxes;
    }

    /**
     * Setter for SkipBillingManifestTaxes.
     * Valid only for the Subscription Preview endpoint. When set to `true` it skips calculating
     * taxes for the current and next billing manifests.
     * @param skipBillingManifestTaxes Value for Boolean
     */
    @JsonSetter("skip_billing_manifest_taxes")
    public void setSkipBillingManifestTaxes(Boolean skipBillingManifestTaxes) {
        this.skipBillingManifestTaxes = skipBillingManifestTaxes;
    }

    /**
     * Converts this CreateSubscription into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateSubscription [" + "productHandle=" + productHandle + ", productId="
                + productId + ", productPricePointHandle=" + productPricePointHandle
                + ", productPricePointId=" + productPricePointId + ", customPrice=" + customPrice
                + ", couponCode=" + couponCode + ", couponCodes=" + couponCodes
                + ", paymentCollectionMethod=" + paymentCollectionMethod
                + ", receivesInvoiceEmails=" + receivesInvoiceEmails + ", netTerms=" + netTerms
                + ", customerId=" + customerId + ", nextBillingAt=" + nextBillingAt
                + ", initialBillingAt=" + initialBillingAt + ", storedCredentialTransactionId="
                + storedCredentialTransactionId + ", salesRepId=" + salesRepId
                + ", paymentProfileId=" + paymentProfileId + ", reference=" + reference
                + ", customerAttributes=" + customerAttributes + ", paymentProfileAttributes="
                + paymentProfileAttributes + ", creditCardAttributes=" + creditCardAttributes
                + ", bankAccountAttributes=" + bankAccountAttributes + ", components=" + components
                + ", calendarBilling=" + calendarBilling + ", metafields=" + metafields
                + ", customerReference=" + customerReference + ", group=" + group + ", ref=" + ref
                + ", cancellationMessage=" + cancellationMessage + ", cancellationMethod="
                + cancellationMethod + ", currency=" + currency + ", expiresAt=" + expiresAt
                + ", expirationTracksNextBillingChange=" + expirationTracksNextBillingChange
                + ", agreementTerms=" + agreementTerms + ", authorizerFirstName="
                + authorizerFirstName + ", authorizerLastName=" + authorizerLastName
                + ", calendarBillingFirstCharge=" + calendarBillingFirstCharge + ", reasonCode="
                + reasonCode + ", productChangeDelayed=" + productChangeDelayed + ", offerId="
                + offerId + ", prepaidSubscriptionConfiguration=" + prepaidSubscriptionConfiguration
                + ", previousBillingAt=" + previousBillingAt + ", importMrr=" + importMrr
                + ", canceledAt=" + canceledAt + ", activatedAt=" + activatedAt
                + ", agreementAcceptance=" + agreementAcceptance + ", achAgreement=" + achAgreement
                + ", dunningCommunicationDelayEnabled=" + dunningCommunicationDelayEnabled
                + ", dunningCommunicationDelayTimeZone=" + dunningCommunicationDelayTimeZone
                + ", skipBillingManifestTaxes=" + skipBillingManifestTaxes + "]";
    }

    /**
     * Builds a new {@link CreateSubscription.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateSubscription.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .productHandle(getProductHandle())
                .productId(getProductId())
                .productPricePointHandle(getProductPricePointHandle())
                .productPricePointId(getProductPricePointId())
                .customPrice(getCustomPrice())
                .couponCode(getCouponCode())
                .couponCodes(getCouponCodes())
                .paymentCollectionMethod(getPaymentCollectionMethod())
                .receivesInvoiceEmails(getReceivesInvoiceEmails())
                .netTerms(getNetTerms())
                .customerId(getCustomerId())
                .nextBillingAt(getNextBillingAt())
                .initialBillingAt(getInitialBillingAt())
                .storedCredentialTransactionId(getStoredCredentialTransactionId())
                .salesRepId(getSalesRepId())
                .paymentProfileId(getPaymentProfileId())
                .reference(getReference())
                .customerAttributes(getCustomerAttributes())
                .paymentProfileAttributes(getPaymentProfileAttributes())
                .creditCardAttributes(getCreditCardAttributes())
                .bankAccountAttributes(getBankAccountAttributes())
                .components(getComponents())
                .calendarBilling(getCalendarBilling())
                .metafields(getMetafields())
                .customerReference(getCustomerReference())
                .group(getGroup())
                .ref(getRef())
                .cancellationMessage(getCancellationMessage())
                .cancellationMethod(getCancellationMethod())
                .currency(getCurrency())
                .expiresAt(getExpiresAt())
                .expirationTracksNextBillingChange(getExpirationTracksNextBillingChange())
                .agreementTerms(getAgreementTerms())
                .authorizerFirstName(getAuthorizerFirstName())
                .authorizerLastName(getAuthorizerLastName())
                .calendarBillingFirstCharge(getCalendarBillingFirstCharge())
                .reasonCode(getReasonCode())
                .productChangeDelayed(getProductChangeDelayed())
                .offerId(getOfferId())
                .prepaidSubscriptionConfiguration(getPrepaidSubscriptionConfiguration())
                .previousBillingAt(getPreviousBillingAt())
                .importMrr(getImportMrr())
                .canceledAt(getCanceledAt())
                .activatedAt(getActivatedAt())
                .agreementAcceptance(getAgreementAcceptance())
                .achAgreement(getAchAgreement())
                .skipBillingManifestTaxes(getSkipBillingManifestTaxes());
        builder.dunningCommunicationDelayEnabled = internalGetDunningCommunicationDelayEnabled();
        builder.dunningCommunicationDelayTimeZone = internalGetDunningCommunicationDelayTimeZone();
        return builder;
    }

    /**
     * Class to build instances of {@link CreateSubscription}.
     */
    public static class Builder {
        private String productHandle;
        private String productId;
        private String productPricePointHandle;
        private String productPricePointId;
        private CustomPriceUsedForSubscriptionCreateUpdate customPrice;
        private String couponCode;
        private List<String> couponCodes;
        private PaymentCollectionMethod paymentCollectionMethod = PaymentCollectionMethod.AUTOMATIC;
        private String receivesInvoiceEmails;
        private String netTerms;
        private Integer customerId;
        private String nextBillingAt;
        private String initialBillingAt;
        private Integer storedCredentialTransactionId;
        private Integer salesRepId;
        private Integer paymentProfileId;
        private String reference;
        private CustomerAttributes customerAttributes;
        private PaymentProfileAttributes paymentProfileAttributes;
        private PaymentProfileAttributes creditCardAttributes;
        private BankAccountAttributes bankAccountAttributes;
        private List<CreateSubscriptionComponents> components;
        private CalendarBilling calendarBilling;
        private Map<String, String> metafields;
        private String customerReference;
        private CreateSubscriptionGroup2 group;
        private String ref;
        private String cancellationMessage;
        private String cancellationMethod;
        private String currency;
        private String expiresAt;
        private String expirationTracksNextBillingChange;
        private String agreementTerms;
        private String authorizerFirstName;
        private String authorizerLastName;
        private String calendarBillingFirstCharge;
        private String reasonCode;
        private Boolean productChangeDelayed;
        private CreateSubscriptionOfferId offerId;
        private UpsertPrepaidConfiguration prepaidSubscriptionConfiguration;
        private String previousBillingAt;
        private Boolean importMrr;
        private String canceledAt;
        private String activatedAt;
        private AgreementAcceptance agreementAcceptance;
        private ACHAgreement achAgreement;
        private OptionalNullable<Boolean> dunningCommunicationDelayEnabled =
                OptionalNullable.of(false);
        private OptionalNullable<String> dunningCommunicationDelayTimeZone;
        private Boolean skipBillingManifestTaxes = false;



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
         * @param  productId  String value for productId.
         * @return Builder
         */
        public Builder productId(String productId) {
            this.productId = productId;
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
         * Setter for productPricePointId.
         * @param  productPricePointId  String value for productPricePointId.
         * @return Builder
         */
        public Builder productPricePointId(String productPricePointId) {
            this.productPricePointId = productPricePointId;
            return this;
        }

        /**
         * Setter for customPrice.
         * @param  customPrice  CustomPriceUsedForSubscriptionCreateUpdate value for customPrice.
         * @return Builder
         */
        public Builder customPrice(CustomPriceUsedForSubscriptionCreateUpdate customPrice) {
            this.customPrice = customPrice;
            return this;
        }

        /**
         * Setter for couponCode.
         * @param  couponCode  String value for couponCode.
         * @return Builder
         */
        public Builder couponCode(String couponCode) {
            this.couponCode = couponCode;
            return this;
        }

        /**
         * Setter for couponCodes.
         * @param  couponCodes  List of String value for couponCodes.
         * @return Builder
         */
        public Builder couponCodes(List<String> couponCodes) {
            this.couponCodes = couponCodes;
            return this;
        }

        /**
         * Setter for paymentCollectionMethod.
         * @param  paymentCollectionMethod  PaymentCollectionMethod value for
         *         paymentCollectionMethod.
         * @return Builder
         */
        public Builder paymentCollectionMethod(PaymentCollectionMethod paymentCollectionMethod) {
            this.paymentCollectionMethod = paymentCollectionMethod;
            return this;
        }

        /**
         * Setter for receivesInvoiceEmails.
         * @param  receivesInvoiceEmails  String value for receivesInvoiceEmails.
         * @return Builder
         */
        public Builder receivesInvoiceEmails(String receivesInvoiceEmails) {
            this.receivesInvoiceEmails = receivesInvoiceEmails;
            return this;
        }

        /**
         * Setter for netTerms.
         * @param  netTerms  String value for netTerms.
         * @return Builder
         */
        public Builder netTerms(String netTerms) {
            this.netTerms = netTerms;
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
         * Setter for nextBillingAt.
         * @param  nextBillingAt  String value for nextBillingAt.
         * @return Builder
         */
        public Builder nextBillingAt(String nextBillingAt) {
            this.nextBillingAt = nextBillingAt;
            return this;
        }

        /**
         * Setter for initialBillingAt.
         * @param  initialBillingAt  String value for initialBillingAt.
         * @return Builder
         */
        public Builder initialBillingAt(String initialBillingAt) {
            this.initialBillingAt = initialBillingAt;
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
         * Setter for salesRepId.
         * @param  salesRepId  Integer value for salesRepId.
         * @return Builder
         */
        public Builder salesRepId(Integer salesRepId) {
            this.salesRepId = salesRepId;
            return this;
        }

        /**
         * Setter for paymentProfileId.
         * @param  paymentProfileId  Integer value for paymentProfileId.
         * @return Builder
         */
        public Builder paymentProfileId(Integer paymentProfileId) {
            this.paymentProfileId = paymentProfileId;
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
         * Setter for customerAttributes.
         * @param  customerAttributes  CustomerAttributes value for customerAttributes.
         * @return Builder
         */
        public Builder customerAttributes(CustomerAttributes customerAttributes) {
            this.customerAttributes = customerAttributes;
            return this;
        }

        /**
         * Setter for paymentProfileAttributes.
         * @param  paymentProfileAttributes  PaymentProfileAttributes value for
         *         paymentProfileAttributes.
         * @return Builder
         */
        public Builder paymentProfileAttributes(
                PaymentProfileAttributes paymentProfileAttributes) {
            this.paymentProfileAttributes = paymentProfileAttributes;
            return this;
        }

        /**
         * Setter for creditCardAttributes.
         * @param  creditCardAttributes  PaymentProfileAttributes value for creditCardAttributes.
         * @return Builder
         */
        public Builder creditCardAttributes(PaymentProfileAttributes creditCardAttributes) {
            this.creditCardAttributes = creditCardAttributes;
            return this;
        }

        /**
         * Setter for bankAccountAttributes.
         * @param  bankAccountAttributes  BankAccountAttributes value for bankAccountAttributes.
         * @return Builder
         */
        public Builder bankAccountAttributes(BankAccountAttributes bankAccountAttributes) {
            this.bankAccountAttributes = bankAccountAttributes;
            return this;
        }

        /**
         * Setter for components.
         * @param  components  List of CreateSubscriptionComponents value for components.
         * @return Builder
         */
        public Builder components(List<CreateSubscriptionComponents> components) {
            this.components = components;
            return this;
        }

        /**
         * Setter for calendarBilling.
         * @param  calendarBilling  CalendarBilling value for calendarBilling.
         * @return Builder
         */
        public Builder calendarBilling(CalendarBilling calendarBilling) {
            this.calendarBilling = calendarBilling;
            return this;
        }

        /**
         * Setter for metafields.
         * @param  metafields  Map of String, value for metafields.
         * @return Builder
         */
        public Builder metafields(Map<String, String> metafields) {
            this.metafields = metafields;
            return this;
        }

        /**
         * Setter for customerReference.
         * @param  customerReference  String value for customerReference.
         * @return Builder
         */
        public Builder customerReference(String customerReference) {
            this.customerReference = customerReference;
            return this;
        }

        /**
         * Setter for group.
         * @param  group  CreateSubscriptionGroup2 value for group.
         * @return Builder
         */
        public Builder group(CreateSubscriptionGroup2 group) {
            this.group = group;
            return this;
        }

        /**
         * Setter for ref.
         * @param  ref  String value for ref.
         * @return Builder
         */
        public Builder ref(String ref) {
            this.ref = ref;
            return this;
        }

        /**
         * Setter for cancellationMessage.
         * @param  cancellationMessage  String value for cancellationMessage.
         * @return Builder
         */
        public Builder cancellationMessage(String cancellationMessage) {
            this.cancellationMessage = cancellationMessage;
            return this;
        }

        /**
         * Setter for cancellationMethod.
         * @param  cancellationMethod  String value for cancellationMethod.
         * @return Builder
         */
        public Builder cancellationMethod(String cancellationMethod) {
            this.cancellationMethod = cancellationMethod;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for expiresAt.
         * @param  expiresAt  String value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Setter for expirationTracksNextBillingChange.
         * @param  expirationTracksNextBillingChange  String value for
         *         expirationTracksNextBillingChange.
         * @return Builder
         */
        public Builder expirationTracksNextBillingChange(
                String expirationTracksNextBillingChange) {
            this.expirationTracksNextBillingChange = expirationTracksNextBillingChange;
            return this;
        }

        /**
         * Setter for agreementTerms.
         * @param  agreementTerms  String value for agreementTerms.
         * @return Builder
         */
        public Builder agreementTerms(String agreementTerms) {
            this.agreementTerms = agreementTerms;
            return this;
        }

        /**
         * Setter for authorizerFirstName.
         * @param  authorizerFirstName  String value for authorizerFirstName.
         * @return Builder
         */
        public Builder authorizerFirstName(String authorizerFirstName) {
            this.authorizerFirstName = authorizerFirstName;
            return this;
        }

        /**
         * Setter for authorizerLastName.
         * @param  authorizerLastName  String value for authorizerLastName.
         * @return Builder
         */
        public Builder authorizerLastName(String authorizerLastName) {
            this.authorizerLastName = authorizerLastName;
            return this;
        }

        /**
         * Setter for calendarBillingFirstCharge.
         * @param  calendarBillingFirstCharge  String value for calendarBillingFirstCharge.
         * @return Builder
         */
        public Builder calendarBillingFirstCharge(String calendarBillingFirstCharge) {
            this.calendarBillingFirstCharge = calendarBillingFirstCharge;
            return this;
        }

        /**
         * Setter for reasonCode.
         * @param  reasonCode  String value for reasonCode.
         * @return Builder
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
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
         * Setter for offerId.
         * @param  offerId  CreateSubscriptionOfferId value for offerId.
         * @return Builder
         */
        public Builder offerId(CreateSubscriptionOfferId offerId) {
            this.offerId = offerId;
            return this;
        }

        /**
         * Setter for prepaidSubscriptionConfiguration.
         * @param  prepaidSubscriptionConfiguration  UpsertPrepaidConfiguration value for
         *         prepaidSubscriptionConfiguration.
         * @return Builder
         */
        public Builder prepaidSubscriptionConfiguration(
                UpsertPrepaidConfiguration prepaidSubscriptionConfiguration) {
            this.prepaidSubscriptionConfiguration = prepaidSubscriptionConfiguration;
            return this;
        }

        /**
         * Setter for previousBillingAt.
         * @param  previousBillingAt  String value for previousBillingAt.
         * @return Builder
         */
        public Builder previousBillingAt(String previousBillingAt) {
            this.previousBillingAt = previousBillingAt;
            return this;
        }

        /**
         * Setter for importMrr.
         * @param  importMrr  Boolean value for importMrr.
         * @return Builder
         */
        public Builder importMrr(Boolean importMrr) {
            this.importMrr = importMrr;
            return this;
        }

        /**
         * Setter for canceledAt.
         * @param  canceledAt  String value for canceledAt.
         * @return Builder
         */
        public Builder canceledAt(String canceledAt) {
            this.canceledAt = canceledAt;
            return this;
        }

        /**
         * Setter for activatedAt.
         * @param  activatedAt  String value for activatedAt.
         * @return Builder
         */
        public Builder activatedAt(String activatedAt) {
            this.activatedAt = activatedAt;
            return this;
        }

        /**
         * Setter for agreementAcceptance.
         * @param  agreementAcceptance  AgreementAcceptance value for agreementAcceptance.
         * @return Builder
         */
        public Builder agreementAcceptance(AgreementAcceptance agreementAcceptance) {
            this.agreementAcceptance = agreementAcceptance;
            return this;
        }

        /**
         * Setter for achAgreement.
         * @param  achAgreement  ACHAgreement value for achAgreement.
         * @return Builder
         */
        public Builder achAgreement(ACHAgreement achAgreement) {
            this.achAgreement = achAgreement;
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
            this.dunningCommunicationDelayEnabled =
                    OptionalNullable.of(dunningCommunicationDelayEnabled);
            return this;
        }

        /**
         * UnSetter for dunningCommunicationDelayEnabled.
         * @return Builder
         */
        public Builder unsetDunningCommunicationDelayEnabled() {
            dunningCommunicationDelayEnabled = null;
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
         * Setter for skipBillingManifestTaxes.
         * @param  skipBillingManifestTaxes  Boolean value for skipBillingManifestTaxes.
         * @return Builder
         */
        public Builder skipBillingManifestTaxes(Boolean skipBillingManifestTaxes) {
            this.skipBillingManifestTaxes = skipBillingManifestTaxes;
            return this;
        }

        /**
         * Builds a new {@link CreateSubscription} object using the set fields.
         * @return {@link CreateSubscription}
         */
        public CreateSubscription build() {
            return new CreateSubscription(productHandle, productId, productPricePointHandle,
                    productPricePointId, customPrice, couponCode, couponCodes,
                    paymentCollectionMethod, receivesInvoiceEmails, netTerms, customerId,
                    nextBillingAt, initialBillingAt, storedCredentialTransactionId, salesRepId,
                    paymentProfileId, reference, customerAttributes, paymentProfileAttributes,
                    creditCardAttributes, bankAccountAttributes, components, calendarBilling,
                    metafields, customerReference, group, ref, cancellationMessage,
                    cancellationMethod, currency, expiresAt, expirationTracksNextBillingChange,
                    agreementTerms, authorizerFirstName, authorizerLastName,
                    calendarBillingFirstCharge, reasonCode, productChangeDelayed, offerId,
                    prepaidSubscriptionConfiguration, previousBillingAt, importMrr, canceledAt,
                    activatedAt, agreementAcceptance, achAgreement,
                    dunningCommunicationDelayEnabled, dunningCommunicationDelayTimeZone,
                    skipBillingManifestTaxes);
        }
    }
}
