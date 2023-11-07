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
import com.maxio.advancedbilling.models.containers.SubscriptionCancellationMethod;
import com.maxio.advancedbilling.models.containers.SubscriptionGroup2;
import com.maxio.advancedbilling.models.containers.SubscriptionPaymentCollectionMethod;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for Subscription type.
 */
public class Subscription {
    private Integer id;
    private String state;
    private Integer balanceInCents;
    private Integer totalRevenueInCents;
    private Integer productPriceInCents;
    private Integer productVersionNumber;
    private String currentPeriodEndsAt;
    private String nextAssessmentAt;
    private OptionalNullable<String> trialStartedAt;
    private OptionalNullable<String> trialEndedAt;
    private String activatedAt;
    private OptionalNullable<String> expiresAt;
    private String createdAt;
    private String updatedAt;
    private OptionalNullable<String> cancellationMessage;
    private OptionalNullable<SubscriptionCancellationMethod> cancellationMethod;
    private OptionalNullable<Boolean> cancelAtEndOfPeriod;
    private OptionalNullable<String> canceledAt;
    private String currentPeriodStartedAt;
    private String previousState;
    private Integer signupPaymentId;
    private String signupRevenue;
    private OptionalNullable<String> delayedCancelAt;
    private OptionalNullable<String> couponCode;
    private OptionalNullable<String> snapDay;
    private OptionalNullable<SubscriptionPaymentCollectionMethod> paymentCollectionMethod;
    private Customer customer;
    private Product product;
    private PaymentProfile creditCard;
    private OptionalNullable<SubscriptionGroup2> group;
    private SubscriptionBankAccount bankAccount;
    private OptionalNullable<String> paymentType;
    private OptionalNullable<String> referralCode;
    private OptionalNullable<Integer> nextProductId;
    private OptionalNullable<String> nextProductHandle;
    private OptionalNullable<Integer> couponUseCount;
    private OptionalNullable<Integer> couponUsesAllowed;
    private OptionalNullable<String> reasonCode;
    private OptionalNullable<String> automaticallyResumeAt;
    private List<String> couponCodes;
    private OptionalNullable<Integer> offerId;
    private Integer payerId;
    private Integer currentBillingAmountInCents;
    private Integer productPricePointId;
    private String productPricePointType;
    private OptionalNullable<Integer> nextProductPricePointId;
    private OptionalNullable<Integer> netTerms;
    private OptionalNullable<Integer> storedCredentialTransactionId;
    private OptionalNullable<String> reference;
    private OptionalNullable<String> onHoldAt;
    private Boolean prepaidDunning;
    private List<SubscriptionIncludedCoupon> coupons;
    private Boolean dunningCommunicationDelayEnabled;
    private OptionalNullable<String> dunningCommunicationDelayTimeZone;
    private OptionalNullable<Boolean> receivesInvoiceEmails;
    private OptionalNullable<String> locale;
    private String currency;
    private OptionalNullable<String> scheduledCancellationAt;
    private Integer creditBalanceInCents;
    private Integer prepaymentBalanceInCents;

    /**
     * Default constructor.
     */
    public Subscription() {
        dunningCommunicationDelayEnabled = false;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  state  String value for state.
     * @param  balanceInCents  Integer value for balanceInCents.
     * @param  totalRevenueInCents  Integer value for totalRevenueInCents.
     * @param  productPriceInCents  Integer value for productPriceInCents.
     * @param  productVersionNumber  Integer value for productVersionNumber.
     * @param  currentPeriodEndsAt  String value for currentPeriodEndsAt.
     * @param  nextAssessmentAt  String value for nextAssessmentAt.
     * @param  trialStartedAt  String value for trialStartedAt.
     * @param  trialEndedAt  String value for trialEndedAt.
     * @param  activatedAt  String value for activatedAt.
     * @param  expiresAt  String value for expiresAt.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  cancellationMessage  String value for cancellationMessage.
     * @param  cancellationMethod  SubscriptionCancellationMethod value for cancellationMethod.
     * @param  cancelAtEndOfPeriod  Boolean value for cancelAtEndOfPeriod.
     * @param  canceledAt  String value for canceledAt.
     * @param  currentPeriodStartedAt  String value for currentPeriodStartedAt.
     * @param  previousState  String value for previousState.
     * @param  signupPaymentId  Integer value for signupPaymentId.
     * @param  signupRevenue  String value for signupRevenue.
     * @param  delayedCancelAt  String value for delayedCancelAt.
     * @param  couponCode  String value for couponCode.
     * @param  snapDay  String value for snapDay.
     * @param  paymentCollectionMethod  SubscriptionPaymentCollectionMethod value for
     *         paymentCollectionMethod.
     * @param  customer  Customer value for customer.
     * @param  product  Product value for product.
     * @param  creditCard  PaymentProfile value for creditCard.
     * @param  group  SubscriptionGroup2 value for group.
     * @param  bankAccount  SubscriptionBankAccount value for bankAccount.
     * @param  paymentType  String value for paymentType.
     * @param  referralCode  String value for referralCode.
     * @param  nextProductId  Integer value for nextProductId.
     * @param  nextProductHandle  String value for nextProductHandle.
     * @param  couponUseCount  Integer value for couponUseCount.
     * @param  couponUsesAllowed  Integer value for couponUsesAllowed.
     * @param  reasonCode  String value for reasonCode.
     * @param  automaticallyResumeAt  String value for automaticallyResumeAt.
     * @param  couponCodes  List of String value for couponCodes.
     * @param  offerId  Integer value for offerId.
     * @param  payerId  Integer value for payerId.
     * @param  currentBillingAmountInCents  Integer value for currentBillingAmountInCents.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  productPricePointType  String value for productPricePointType.
     * @param  nextProductPricePointId  Integer value for nextProductPricePointId.
     * @param  netTerms  Integer value for netTerms.
     * @param  storedCredentialTransactionId  Integer value for storedCredentialTransactionId.
     * @param  reference  String value for reference.
     * @param  onHoldAt  String value for onHoldAt.
     * @param  prepaidDunning  Boolean value for prepaidDunning.
     * @param  coupons  List of SubscriptionIncludedCoupon value for coupons.
     * @param  dunningCommunicationDelayEnabled  Boolean value for dunningCommunicationDelayEnabled.
     * @param  dunningCommunicationDelayTimeZone  String value for
     *         dunningCommunicationDelayTimeZone.
     * @param  receivesInvoiceEmails  Boolean value for receivesInvoiceEmails.
     * @param  locale  String value for locale.
     * @param  currency  String value for currency.
     * @param  scheduledCancellationAt  String value for scheduledCancellationAt.
     * @param  creditBalanceInCents  Integer value for creditBalanceInCents.
     * @param  prepaymentBalanceInCents  Integer value for prepaymentBalanceInCents.
     */
    public Subscription(
            Integer id,
            String state,
            Integer balanceInCents,
            Integer totalRevenueInCents,
            Integer productPriceInCents,
            Integer productVersionNumber,
            String currentPeriodEndsAt,
            String nextAssessmentAt,
            String trialStartedAt,
            String trialEndedAt,
            String activatedAt,
            String expiresAt,
            String createdAt,
            String updatedAt,
            String cancellationMessage,
            SubscriptionCancellationMethod cancellationMethod,
            Boolean cancelAtEndOfPeriod,
            String canceledAt,
            String currentPeriodStartedAt,
            String previousState,
            Integer signupPaymentId,
            String signupRevenue,
            String delayedCancelAt,
            String couponCode,
            String snapDay,
            SubscriptionPaymentCollectionMethod paymentCollectionMethod,
            Customer customer,
            Product product,
            PaymentProfile creditCard,
            SubscriptionGroup2 group,
            SubscriptionBankAccount bankAccount,
            String paymentType,
            String referralCode,
            Integer nextProductId,
            String nextProductHandle,
            Integer couponUseCount,
            Integer couponUsesAllowed,
            String reasonCode,
            String automaticallyResumeAt,
            List<String> couponCodes,
            Integer offerId,
            Integer payerId,
            Integer currentBillingAmountInCents,
            Integer productPricePointId,
            String productPricePointType,
            Integer nextProductPricePointId,
            Integer netTerms,
            Integer storedCredentialTransactionId,
            String reference,
            String onHoldAt,
            Boolean prepaidDunning,
            List<SubscriptionIncludedCoupon> coupons,
            Boolean dunningCommunicationDelayEnabled,
            String dunningCommunicationDelayTimeZone,
            Boolean receivesInvoiceEmails,
            String locale,
            String currency,
            String scheduledCancellationAt,
            Integer creditBalanceInCents,
            Integer prepaymentBalanceInCents) {
        this.id = id;
        this.state = state;
        this.balanceInCents = balanceInCents;
        this.totalRevenueInCents = totalRevenueInCents;
        this.productPriceInCents = productPriceInCents;
        this.productVersionNumber = productVersionNumber;
        this.currentPeriodEndsAt = currentPeriodEndsAt;
        this.nextAssessmentAt = nextAssessmentAt;
        this.trialStartedAt = OptionalNullable.of(trialStartedAt);
        this.trialEndedAt = OptionalNullable.of(trialEndedAt);
        this.activatedAt = activatedAt;
        this.expiresAt = OptionalNullable.of(expiresAt);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.cancellationMessage = OptionalNullable.of(cancellationMessage);
        this.cancellationMethod = OptionalNullable.of(cancellationMethod);
        this.cancelAtEndOfPeriod = OptionalNullable.of(cancelAtEndOfPeriod);
        this.canceledAt = OptionalNullable.of(canceledAt);
        this.currentPeriodStartedAt = currentPeriodStartedAt;
        this.previousState = previousState;
        this.signupPaymentId = signupPaymentId;
        this.signupRevenue = signupRevenue;
        this.delayedCancelAt = OptionalNullable.of(delayedCancelAt);
        this.couponCode = OptionalNullable.of(couponCode);
        this.snapDay = OptionalNullable.of(snapDay);
        this.paymentCollectionMethod = OptionalNullable.of(paymentCollectionMethod);
        this.customer = customer;
        this.product = product;
        this.creditCard = creditCard;
        this.group = OptionalNullable.of(group);
        this.bankAccount = bankAccount;
        this.paymentType = OptionalNullable.of(paymentType);
        this.referralCode = OptionalNullable.of(referralCode);
        this.nextProductId = OptionalNullable.of(nextProductId);
        this.nextProductHandle = OptionalNullable.of(nextProductHandle);
        this.couponUseCount = OptionalNullable.of(couponUseCount);
        this.couponUsesAllowed = OptionalNullable.of(couponUsesAllowed);
        this.reasonCode = OptionalNullable.of(reasonCode);
        this.automaticallyResumeAt = OptionalNullable.of(automaticallyResumeAt);
        this.couponCodes = couponCodes;
        this.offerId = OptionalNullable.of(offerId);
        this.payerId = payerId;
        this.currentBillingAmountInCents = currentBillingAmountInCents;
        this.productPricePointId = productPricePointId;
        this.productPricePointType = productPricePointType;
        this.nextProductPricePointId = OptionalNullable.of(nextProductPricePointId);
        this.netTerms = OptionalNullable.of(netTerms);
        this.storedCredentialTransactionId = OptionalNullable.of(storedCredentialTransactionId);
        this.reference = OptionalNullable.of(reference);
        this.onHoldAt = OptionalNullable.of(onHoldAt);
        this.prepaidDunning = prepaidDunning;
        this.coupons = coupons;
        this.dunningCommunicationDelayEnabled = dunningCommunicationDelayEnabled;
        this.dunningCommunicationDelayTimeZone =
                OptionalNullable.of(dunningCommunicationDelayTimeZone);
        this.receivesInvoiceEmails = OptionalNullable.of(receivesInvoiceEmails);
        this.locale = OptionalNullable.of(locale);
        this.currency = currency;
        this.scheduledCancellationAt = OptionalNullable.of(scheduledCancellationAt);
        this.creditBalanceInCents = creditBalanceInCents;
        this.prepaymentBalanceInCents = prepaymentBalanceInCents;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  state  String value for state.
     * @param  balanceInCents  Integer value for balanceInCents.
     * @param  totalRevenueInCents  Integer value for totalRevenueInCents.
     * @param  productPriceInCents  Integer value for productPriceInCents.
     * @param  productVersionNumber  Integer value for productVersionNumber.
     * @param  currentPeriodEndsAt  String value for currentPeriodEndsAt.
     * @param  nextAssessmentAt  String value for nextAssessmentAt.
     * @param  trialStartedAt  String value for trialStartedAt.
     * @param  trialEndedAt  String value for trialEndedAt.
     * @param  activatedAt  String value for activatedAt.
     * @param  expiresAt  String value for expiresAt.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  cancellationMessage  String value for cancellationMessage.
     * @param  cancellationMethod  SubscriptionCancellationMethod value for cancellationMethod.
     * @param  cancelAtEndOfPeriod  Boolean value for cancelAtEndOfPeriod.
     * @param  canceledAt  String value for canceledAt.
     * @param  currentPeriodStartedAt  String value for currentPeriodStartedAt.
     * @param  previousState  String value for previousState.
     * @param  signupPaymentId  Integer value for signupPaymentId.
     * @param  signupRevenue  String value for signupRevenue.
     * @param  delayedCancelAt  String value for delayedCancelAt.
     * @param  couponCode  String value for couponCode.
     * @param  snapDay  String value for snapDay.
     * @param  paymentCollectionMethod  SubscriptionPaymentCollectionMethod value for
     *         paymentCollectionMethod.
     * @param  customer  Customer value for customer.
     * @param  product  Product value for product.
     * @param  creditCard  PaymentProfile value for creditCard.
     * @param  group  SubscriptionGroup2 value for group.
     * @param  bankAccount  SubscriptionBankAccount value for bankAccount.
     * @param  paymentType  String value for paymentType.
     * @param  referralCode  String value for referralCode.
     * @param  nextProductId  Integer value for nextProductId.
     * @param  nextProductHandle  String value for nextProductHandle.
     * @param  couponUseCount  Integer value for couponUseCount.
     * @param  couponUsesAllowed  Integer value for couponUsesAllowed.
     * @param  reasonCode  String value for reasonCode.
     * @param  automaticallyResumeAt  String value for automaticallyResumeAt.
     * @param  couponCodes  List of String value for couponCodes.
     * @param  offerId  Integer value for offerId.
     * @param  payerId  Integer value for payerId.
     * @param  currentBillingAmountInCents  Integer value for currentBillingAmountInCents.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  productPricePointType  String value for productPricePointType.
     * @param  nextProductPricePointId  Integer value for nextProductPricePointId.
     * @param  netTerms  Integer value for netTerms.
     * @param  storedCredentialTransactionId  Integer value for storedCredentialTransactionId.
     * @param  reference  String value for reference.
     * @param  onHoldAt  String value for onHoldAt.
     * @param  prepaidDunning  Boolean value for prepaidDunning.
     * @param  coupons  List of SubscriptionIncludedCoupon value for coupons.
     * @param  dunningCommunicationDelayEnabled  Boolean value for dunningCommunicationDelayEnabled.
     * @param  dunningCommunicationDelayTimeZone  String value for
     *         dunningCommunicationDelayTimeZone.
     * @param  receivesInvoiceEmails  Boolean value for receivesInvoiceEmails.
     * @param  locale  String value for locale.
     * @param  currency  String value for currency.
     * @param  scheduledCancellationAt  String value for scheduledCancellationAt.
     * @param  creditBalanceInCents  Integer value for creditBalanceInCents.
     * @param  prepaymentBalanceInCents  Integer value for prepaymentBalanceInCents.
     */

    protected Subscription(Integer id, String state, Integer balanceInCents,
            Integer totalRevenueInCents, Integer productPriceInCents, Integer productVersionNumber,
            String currentPeriodEndsAt, String nextAssessmentAt,
            OptionalNullable<String> trialStartedAt, OptionalNullable<String> trialEndedAt,
            String activatedAt, OptionalNullable<String> expiresAt, String createdAt,
            String updatedAt, OptionalNullable<String> cancellationMessage,
            OptionalNullable<SubscriptionCancellationMethod> cancellationMethod,
            OptionalNullable<Boolean> cancelAtEndOfPeriod, OptionalNullable<String> canceledAt,
            String currentPeriodStartedAt, String previousState, Integer signupPaymentId,
            String signupRevenue, OptionalNullable<String> delayedCancelAt,
            OptionalNullable<String> couponCode, OptionalNullable<String> snapDay,
            OptionalNullable<SubscriptionPaymentCollectionMethod> paymentCollectionMethod,
            Customer customer, Product product, PaymentProfile creditCard,
            OptionalNullable<SubscriptionGroup2> group, SubscriptionBankAccount bankAccount,
            OptionalNullable<String> paymentType, OptionalNullable<String> referralCode,
            OptionalNullable<Integer> nextProductId, OptionalNullable<String> nextProductHandle,
            OptionalNullable<Integer> couponUseCount, OptionalNullable<Integer> couponUsesAllowed,
            OptionalNullable<String> reasonCode, OptionalNullable<String> automaticallyResumeAt,
            List<String> couponCodes, OptionalNullable<Integer> offerId, Integer payerId,
            Integer currentBillingAmountInCents, Integer productPricePointId,
            String productPricePointType, OptionalNullable<Integer> nextProductPricePointId,
            OptionalNullable<Integer> netTerms,
            OptionalNullable<Integer> storedCredentialTransactionId,
            OptionalNullable<String> reference, OptionalNullable<String> onHoldAt,
            Boolean prepaidDunning, List<SubscriptionIncludedCoupon> coupons,
            Boolean dunningCommunicationDelayEnabled,
            OptionalNullable<String> dunningCommunicationDelayTimeZone,
            OptionalNullable<Boolean> receivesInvoiceEmails, OptionalNullable<String> locale,
            String currency, OptionalNullable<String> scheduledCancellationAt,
            Integer creditBalanceInCents, Integer prepaymentBalanceInCents) {
        this.id = id;
        this.state = state;
        this.balanceInCents = balanceInCents;
        this.totalRevenueInCents = totalRevenueInCents;
        this.productPriceInCents = productPriceInCents;
        this.productVersionNumber = productVersionNumber;
        this.currentPeriodEndsAt = currentPeriodEndsAt;
        this.nextAssessmentAt = nextAssessmentAt;
        this.trialStartedAt = trialStartedAt;
        this.trialEndedAt = trialEndedAt;
        this.activatedAt = activatedAt;
        this.expiresAt = expiresAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.cancellationMessage = cancellationMessage;
        this.cancellationMethod = cancellationMethod;
        this.cancelAtEndOfPeriod = cancelAtEndOfPeriod;
        this.canceledAt = canceledAt;
        this.currentPeriodStartedAt = currentPeriodStartedAt;
        this.previousState = previousState;
        this.signupPaymentId = signupPaymentId;
        this.signupRevenue = signupRevenue;
        this.delayedCancelAt = delayedCancelAt;
        this.couponCode = couponCode;
        this.snapDay = snapDay;
        this.paymentCollectionMethod = paymentCollectionMethod;
        this.customer = customer;
        this.product = product;
        this.creditCard = creditCard;
        this.group = group;
        this.bankAccount = bankAccount;
        this.paymentType = paymentType;
        this.referralCode = referralCode;
        this.nextProductId = nextProductId;
        this.nextProductHandle = nextProductHandle;
        this.couponUseCount = couponUseCount;
        this.couponUsesAllowed = couponUsesAllowed;
        this.reasonCode = reasonCode;
        this.automaticallyResumeAt = automaticallyResumeAt;
        this.couponCodes = couponCodes;
        this.offerId = offerId;
        this.payerId = payerId;
        this.currentBillingAmountInCents = currentBillingAmountInCents;
        this.productPricePointId = productPricePointId;
        this.productPricePointType = productPricePointType;
        this.nextProductPricePointId = nextProductPricePointId;
        this.netTerms = netTerms;
        this.storedCredentialTransactionId = storedCredentialTransactionId;
        this.reference = reference;
        this.onHoldAt = onHoldAt;
        this.prepaidDunning = prepaidDunning;
        this.coupons = coupons;
        this.dunningCommunicationDelayEnabled = dunningCommunicationDelayEnabled;
        this.dunningCommunicationDelayTimeZone = dunningCommunicationDelayTimeZone;
        this.receivesInvoiceEmails = receivesInvoiceEmails;
        this.locale = locale;
        this.currency = currency;
        this.scheduledCancellationAt = scheduledCancellationAt;
        this.creditBalanceInCents = creditBalanceInCents;
        this.prepaymentBalanceInCents = prepaymentBalanceInCents;
    }

    /**
     * Getter for Id.
     * The subscription unique id within Chargify.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The subscription unique id within Chargify.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for State.
     * The current state of the subscription. Please see the documentation for [Subscription
     * States](https://help.chargify.com/subscriptions/subscription-states.html)
     * @return Returns the String
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * The current state of the subscription. Please see the documentation for [Subscription
     * States](https://help.chargify.com/subscriptions/subscription-states.html)
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter for BalanceInCents.
     * Gives the current outstanding subscription balance in the number of cents.
     * @return Returns the Integer
     */
    @JsonGetter("balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getBalanceInCents() {
        return balanceInCents;
    }

    /**
     * Setter for BalanceInCents.
     * Gives the current outstanding subscription balance in the number of cents.
     * @param balanceInCents Value for Integer
     */
    @JsonSetter("balance_in_cents")
    public void setBalanceInCents(Integer balanceInCents) {
        this.balanceInCents = balanceInCents;
    }

    /**
     * Getter for TotalRevenueInCents.
     * Gives the total revenue from the subscription in the number of cents.
     * @return Returns the Integer
     */
    @JsonGetter("total_revenue_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalRevenueInCents() {
        return totalRevenueInCents;
    }

    /**
     * Setter for TotalRevenueInCents.
     * Gives the total revenue from the subscription in the number of cents.
     * @param totalRevenueInCents Value for Integer
     */
    @JsonSetter("total_revenue_in_cents")
    public void setTotalRevenueInCents(Integer totalRevenueInCents) {
        this.totalRevenueInCents = totalRevenueInCents;
    }

    /**
     * Getter for ProductPriceInCents.
     * (Added Nov 5 2013) The recurring amount of the product (and version),currently subscribed.
     * NOTE: this may differ from the current price of,the product, if you’ve changed the price of
     * the product but haven’t,moved this subscription to a newer version.
     * @return Returns the Integer
     */
    @JsonGetter("product_price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductPriceInCents() {
        return productPriceInCents;
    }

    /**
     * Setter for ProductPriceInCents.
     * (Added Nov 5 2013) The recurring amount of the product (and version),currently subscribed.
     * NOTE: this may differ from the current price of,the product, if you’ve changed the price of
     * the product but haven’t,moved this subscription to a newer version.
     * @param productPriceInCents Value for Integer
     */
    @JsonSetter("product_price_in_cents")
    public void setProductPriceInCents(Integer productPriceInCents) {
        this.productPriceInCents = productPriceInCents;
    }

    /**
     * Getter for ProductVersionNumber.
     * The version of the product for the subscription. Note that this is a deprecated field kept
     * for backwards-compatibility.
     * @return Returns the Integer
     */
    @JsonGetter("product_version_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductVersionNumber() {
        return productVersionNumber;
    }

    /**
     * Setter for ProductVersionNumber.
     * The version of the product for the subscription. Note that this is a deprecated field kept
     * for backwards-compatibility.
     * @param productVersionNumber Value for Integer
     */
    @JsonSetter("product_version_number")
    public void setProductVersionNumber(Integer productVersionNumber) {
        this.productVersionNumber = productVersionNumber;
    }

    /**
     * Getter for CurrentPeriodEndsAt.
     * Timestamp relating to the end of the current (recurring) period (i.e.,when the next regularly
     * scheduled attempted charge will occur)
     * @return Returns the String
     */
    @JsonGetter("current_period_ends_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrentPeriodEndsAt() {
        return currentPeriodEndsAt;
    }

    /**
     * Setter for CurrentPeriodEndsAt.
     * Timestamp relating to the end of the current (recurring) period (i.e.,when the next regularly
     * scheduled attempted charge will occur)
     * @param currentPeriodEndsAt Value for String
     */
    @JsonSetter("current_period_ends_at")
    public void setCurrentPeriodEndsAt(String currentPeriodEndsAt) {
        this.currentPeriodEndsAt = currentPeriodEndsAt;
    }

    /**
     * Getter for NextAssessmentAt.
     * Timestamp that indicates when capture of payment will be tried or,retried. This value will
     * usually track the current_period_ends_at, but,will diverge if a renewal payment fails and
     * must be retried. In that,case, the current_period_ends_at will advance to the end of the
     * next,period (time doesn’t stop because a payment was missed) but the,next_assessment_at will
     * be scheduled for the auto-retry time (i.e. 24,hours in the future, in some cases)
     * @return Returns the String
     */
    @JsonGetter("next_assessment_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNextAssessmentAt() {
        return nextAssessmentAt;
    }

    /**
     * Setter for NextAssessmentAt.
     * Timestamp that indicates when capture of payment will be tried or,retried. This value will
     * usually track the current_period_ends_at, but,will diverge if a renewal payment fails and
     * must be retried. In that,case, the current_period_ends_at will advance to the end of the
     * next,period (time doesn’t stop because a payment was missed) but the,next_assessment_at will
     * be scheduled for the auto-retry time (i.e. 24,hours in the future, in some cases)
     * @param nextAssessmentAt Value for String
     */
    @JsonSetter("next_assessment_at")
    public void setNextAssessmentAt(String nextAssessmentAt) {
        this.nextAssessmentAt = nextAssessmentAt;
    }

    /**
     * Internal Getter for TrialStartedAt.
     * Timestamp for when the trial period (if any) began
     * @return Returns the Internal String
     */
    @JsonGetter("trial_started_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetTrialStartedAt() {
        return this.trialStartedAt;
    }

    /**
     * Getter for TrialStartedAt.
     * Timestamp for when the trial period (if any) began
     * @return Returns the String
     */
    public String getTrialStartedAt() {
        return OptionalNullable.getFrom(trialStartedAt);
    }

    /**
     * Setter for TrialStartedAt.
     * Timestamp for when the trial period (if any) began
     * @param trialStartedAt Value for String
     */
    @JsonSetter("trial_started_at")
    public void setTrialStartedAt(String trialStartedAt) {
        this.trialStartedAt = OptionalNullable.of(trialStartedAt);
    }

    /**
     * UnSetter for TrialStartedAt.
     * Timestamp for when the trial period (if any) began
     */
    public void unsetTrialStartedAt() {
        trialStartedAt = null;
    }

    /**
     * Internal Getter for TrialEndedAt.
     * Timestamp for when the trial period (if any) ended
     * @return Returns the Internal String
     */
    @JsonGetter("trial_ended_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetTrialEndedAt() {
        return this.trialEndedAt;
    }

    /**
     * Getter for TrialEndedAt.
     * Timestamp for when the trial period (if any) ended
     * @return Returns the String
     */
    public String getTrialEndedAt() {
        return OptionalNullable.getFrom(trialEndedAt);
    }

    /**
     * Setter for TrialEndedAt.
     * Timestamp for when the trial period (if any) ended
     * @param trialEndedAt Value for String
     */
    @JsonSetter("trial_ended_at")
    public void setTrialEndedAt(String trialEndedAt) {
        this.trialEndedAt = OptionalNullable.of(trialEndedAt);
    }

    /**
     * UnSetter for TrialEndedAt.
     * Timestamp for when the trial period (if any) ended
     */
    public void unsetTrialEndedAt() {
        trialEndedAt = null;
    }

    /**
     * Getter for ActivatedAt.
     * Timestamp for when the subscription began (i.e. when it came out of trial, or when it began
     * in the case of no trial)
     * @return Returns the String
     */
    @JsonGetter("activated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getActivatedAt() {
        return activatedAt;
    }

    /**
     * Setter for ActivatedAt.
     * Timestamp for when the subscription began (i.e. when it came out of trial, or when it began
     * in the case of no trial)
     * @param activatedAt Value for String
     */
    @JsonSetter("activated_at")
    public void setActivatedAt(String activatedAt) {
        this.activatedAt = activatedAt;
    }

    /**
     * Internal Getter for ExpiresAt.
     * Timestamp giving the expiration date of this subscription (if any)
     * @return Returns the Internal String
     */
    @JsonGetter("expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetExpiresAt() {
        return this.expiresAt;
    }

    /**
     * Getter for ExpiresAt.
     * Timestamp giving the expiration date of this subscription (if any)
     * @return Returns the String
     */
    public String getExpiresAt() {
        return OptionalNullable.getFrom(expiresAt);
    }

    /**
     * Setter for ExpiresAt.
     * Timestamp giving the expiration date of this subscription (if any)
     * @param expiresAt Value for String
     */
    @JsonSetter("expires_at")
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = OptionalNullable.of(expiresAt);
    }

    /**
     * UnSetter for ExpiresAt.
     * Timestamp giving the expiration date of this subscription (if any)
     */
    public void unsetExpiresAt() {
        expiresAt = null;
    }

    /**
     * Getter for CreatedAt.
     * The creation date for this subscription
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * The creation date for this subscription
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * The date of last update for this subscription
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * The date of last update for this subscription
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Internal Getter for CancellationMessage.
     * Seller-provided reason for, or note about, the cancellation.
     * @return Returns the Internal String
     */
    @JsonGetter("cancellation_message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCancellationMessage() {
        return this.cancellationMessage;
    }

    /**
     * Getter for CancellationMessage.
     * Seller-provided reason for, or note about, the cancellation.
     * @return Returns the String
     */
    public String getCancellationMessage() {
        return OptionalNullable.getFrom(cancellationMessage);
    }

    /**
     * Setter for CancellationMessage.
     * Seller-provided reason for, or note about, the cancellation.
     * @param cancellationMessage Value for String
     */
    @JsonSetter("cancellation_message")
    public void setCancellationMessage(String cancellationMessage) {
        this.cancellationMessage = OptionalNullable.of(cancellationMessage);
    }

    /**
     * UnSetter for CancellationMessage.
     * Seller-provided reason for, or note about, the cancellation.
     */
    public void unsetCancellationMessage() {
        cancellationMessage = null;
    }

    /**
     * Internal Getter for CancellationMethod.
     * The process used to cancel the subscription, if the subscription has been canceled. It is nil
     * if the subscription's state is not canceled.
     * @return Returns the Internal SubscriptionCancellationMethod
     */
    @JsonGetter("cancellation_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<SubscriptionCancellationMethod> internalGetCancellationMethod() {
        return this.cancellationMethod;
    }

    /**
     * Getter for CancellationMethod.
     * The process used to cancel the subscription, if the subscription has been canceled. It is nil
     * if the subscription's state is not canceled.
     * @return Returns the SubscriptionCancellationMethod
     */
    public SubscriptionCancellationMethod getCancellationMethod() {
        return OptionalNullable.getFrom(cancellationMethod);
    }

    /**
     * Setter for CancellationMethod.
     * The process used to cancel the subscription, if the subscription has been canceled. It is nil
     * if the subscription's state is not canceled.
     * @param cancellationMethod Value for SubscriptionCancellationMethod
     */
    @JsonSetter("cancellation_method")
    public void setCancellationMethod(SubscriptionCancellationMethod cancellationMethod) {
        this.cancellationMethod = OptionalNullable.of(cancellationMethod);
    }

    /**
     * UnSetter for CancellationMethod.
     * The process used to cancel the subscription, if the subscription has been canceled. It is nil
     * if the subscription's state is not canceled.
     */
    public void unsetCancellationMethod() {
        cancellationMethod = null;
    }

    /**
     * Internal Getter for CancelAtEndOfPeriod.
     * Whether or not the subscription will (or has) canceled at the end of the period.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("cancel_at_end_of_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetCancelAtEndOfPeriod() {
        return this.cancelAtEndOfPeriod;
    }

    /**
     * Getter for CancelAtEndOfPeriod.
     * Whether or not the subscription will (or has) canceled at the end of the period.
     * @return Returns the Boolean
     */
    public Boolean getCancelAtEndOfPeriod() {
        return OptionalNullable.getFrom(cancelAtEndOfPeriod);
    }

    /**
     * Setter for CancelAtEndOfPeriod.
     * Whether or not the subscription will (or has) canceled at the end of the period.
     * @param cancelAtEndOfPeriod Value for Boolean
     */
    @JsonSetter("cancel_at_end_of_period")
    public void setCancelAtEndOfPeriod(Boolean cancelAtEndOfPeriod) {
        this.cancelAtEndOfPeriod = OptionalNullable.of(cancelAtEndOfPeriod);
    }

    /**
     * UnSetter for CancelAtEndOfPeriod.
     * Whether or not the subscription will (or has) canceled at the end of the period.
     */
    public void unsetCancelAtEndOfPeriod() {
        cancelAtEndOfPeriod = null;
    }

    /**
     * Internal Getter for CanceledAt.
     * The timestamp of the most recent cancellation
     * @return Returns the Internal String
     */
    @JsonGetter("canceled_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCanceledAt() {
        return this.canceledAt;
    }

    /**
     * Getter for CanceledAt.
     * The timestamp of the most recent cancellation
     * @return Returns the String
     */
    public String getCanceledAt() {
        return OptionalNullable.getFrom(canceledAt);
    }

    /**
     * Setter for CanceledAt.
     * The timestamp of the most recent cancellation
     * @param canceledAt Value for String
     */
    @JsonSetter("canceled_at")
    public void setCanceledAt(String canceledAt) {
        this.canceledAt = OptionalNullable.of(canceledAt);
    }

    /**
     * UnSetter for CanceledAt.
     * The timestamp of the most recent cancellation
     */
    public void unsetCanceledAt() {
        canceledAt = null;
    }

    /**
     * Getter for CurrentPeriodStartedAt.
     * Timestamp relating to the start of the current (recurring) period
     * @return Returns the String
     */
    @JsonGetter("current_period_started_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrentPeriodStartedAt() {
        return currentPeriodStartedAt;
    }

    /**
     * Setter for CurrentPeriodStartedAt.
     * Timestamp relating to the start of the current (recurring) period
     * @param currentPeriodStartedAt Value for String
     */
    @JsonSetter("current_period_started_at")
    public void setCurrentPeriodStartedAt(String currentPeriodStartedAt) {
        this.currentPeriodStartedAt = currentPeriodStartedAt;
    }

    /**
     * Getter for PreviousState.
     * Only valid for webhook payloads The previous state for webhooks that have indicated a change
     * in state. For normal API calls, this will always be the same as the state (current state)
     * @return Returns the String
     */
    @JsonGetter("previous_state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPreviousState() {
        return previousState;
    }

    /**
     * Setter for PreviousState.
     * Only valid for webhook payloads The previous state for webhooks that have indicated a change
     * in state. For normal API calls, this will always be the same as the state (current state)
     * @param previousState Value for String
     */
    @JsonSetter("previous_state")
    public void setPreviousState(String previousState) {
        this.previousState = previousState;
    }

    /**
     * Getter for SignupPaymentId.
     * The ID of the transaction that generated the revenue
     * @return Returns the Integer
     */
    @JsonGetter("signup_payment_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSignupPaymentId() {
        return signupPaymentId;
    }

    /**
     * Setter for SignupPaymentId.
     * The ID of the transaction that generated the revenue
     * @param signupPaymentId Value for Integer
     */
    @JsonSetter("signup_payment_id")
    public void setSignupPaymentId(Integer signupPaymentId) {
        this.signupPaymentId = signupPaymentId;
    }

    /**
     * Getter for SignupRevenue.
     * The revenue, formatted as a string of decimal separated dollars and,cents, from the
     * subscription signup ($50.00 would be formatted as,50.00)
     * @return Returns the String
     */
    @JsonGetter("signup_revenue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSignupRevenue() {
        return signupRevenue;
    }

    /**
     * Setter for SignupRevenue.
     * The revenue, formatted as a string of decimal separated dollars and,cents, from the
     * subscription signup ($50.00 would be formatted as,50.00)
     * @param signupRevenue Value for String
     */
    @JsonSetter("signup_revenue")
    public void setSignupRevenue(String signupRevenue) {
        this.signupRevenue = signupRevenue;
    }

    /**
     * Internal Getter for DelayedCancelAt.
     * Timestamp for when the subscription is currently set to cancel.
     * @return Returns the Internal String
     */
    @JsonGetter("delayed_cancel_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDelayedCancelAt() {
        return this.delayedCancelAt;
    }

    /**
     * Getter for DelayedCancelAt.
     * Timestamp for when the subscription is currently set to cancel.
     * @return Returns the String
     */
    public String getDelayedCancelAt() {
        return OptionalNullable.getFrom(delayedCancelAt);
    }

    /**
     * Setter for DelayedCancelAt.
     * Timestamp for when the subscription is currently set to cancel.
     * @param delayedCancelAt Value for String
     */
    @JsonSetter("delayed_cancel_at")
    public void setDelayedCancelAt(String delayedCancelAt) {
        this.delayedCancelAt = OptionalNullable.of(delayedCancelAt);
    }

    /**
     * UnSetter for DelayedCancelAt.
     * Timestamp for when the subscription is currently set to cancel.
     */
    public void unsetDelayedCancelAt() {
        delayedCancelAt = null;
    }

    /**
     * Internal Getter for CouponCode.
     * (deprecated) The coupon code of the single coupon currently applied to the subscription. See
     * coupon_codes instead as subscriptions can now have more than one coupon.
     * @return Returns the Internal String
     */
    @JsonGetter("coupon_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCouponCode() {
        return this.couponCode;
    }

    /**
     * Getter for CouponCode.
     * (deprecated) The coupon code of the single coupon currently applied to the subscription. See
     * coupon_codes instead as subscriptions can now have more than one coupon.
     * @return Returns the String
     */
    public String getCouponCode() {
        return OptionalNullable.getFrom(couponCode);
    }

    /**
     * Setter for CouponCode.
     * (deprecated) The coupon code of the single coupon currently applied to the subscription. See
     * coupon_codes instead as subscriptions can now have more than one coupon.
     * @param couponCode Value for String
     */
    @JsonSetter("coupon_code")
    public void setCouponCode(String couponCode) {
        this.couponCode = OptionalNullable.of(couponCode);
    }

    /**
     * UnSetter for CouponCode.
     * (deprecated) The coupon code of the single coupon currently applied to the subscription. See
     * coupon_codes instead as subscriptions can now have more than one coupon.
     */
    public void unsetCouponCode() {
        couponCode = null;
    }

    /**
     * Internal Getter for SnapDay.
     * The day of the month that the subscription will charge according to calendar billing rules,
     * if used.
     * @return Returns the Internal String
     */
    @JsonGetter("snap_day")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetSnapDay() {
        return this.snapDay;
    }

    /**
     * Getter for SnapDay.
     * The day of the month that the subscription will charge according to calendar billing rules,
     * if used.
     * @return Returns the String
     */
    public String getSnapDay() {
        return OptionalNullable.getFrom(snapDay);
    }

    /**
     * Setter for SnapDay.
     * The day of the month that the subscription will charge according to calendar billing rules,
     * if used.
     * @param snapDay Value for String
     */
    @JsonSetter("snap_day")
    public void setSnapDay(String snapDay) {
        this.snapDay = OptionalNullable.of(snapDay);
    }

    /**
     * UnSetter for SnapDay.
     * The day of the month that the subscription will charge according to calendar billing rules,
     * if used.
     */
    public void unsetSnapDay() {
        snapDay = null;
    }

    /**
     * Internal Getter for PaymentCollectionMethod.
     * @return Returns the Internal SubscriptionPaymentCollectionMethod
     */
    @JsonGetter("payment_collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<SubscriptionPaymentCollectionMethod> internalGetPaymentCollectionMethod() {
        return this.paymentCollectionMethod;
    }

    /**
     * Getter for PaymentCollectionMethod.
     * @return Returns the SubscriptionPaymentCollectionMethod
     */
    public SubscriptionPaymentCollectionMethod getPaymentCollectionMethod() {
        return OptionalNullable.getFrom(paymentCollectionMethod);
    }

    /**
     * Setter for PaymentCollectionMethod.
     * @param paymentCollectionMethod Value for SubscriptionPaymentCollectionMethod
     */
    @JsonSetter("payment_collection_method")
    public void setPaymentCollectionMethod(SubscriptionPaymentCollectionMethod paymentCollectionMethod) {
        this.paymentCollectionMethod = OptionalNullable.of(paymentCollectionMethod);
    }

    /**
     * UnSetter for PaymentCollectionMethod.
     */
    public void unsetPaymentCollectionMethod() {
        paymentCollectionMethod = null;
    }

    /**
     * Getter for Customer.
     * @return Returns the Customer
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * @param customer Value for Customer
     */
    @JsonSetter("customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Getter for Product.
     * @return Returns the Product
     */
    @JsonGetter("product")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Product getProduct() {
        return product;
    }

    /**
     * Setter for Product.
     * @param product Value for Product
     */
    @JsonSetter("product")
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Getter for CreditCard.
     * @return Returns the PaymentProfile
     */
    @JsonGetter("credit_card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentProfile getCreditCard() {
        return creditCard;
    }

    /**
     * Setter for CreditCard.
     * @param creditCard Value for PaymentProfile
     */
    @JsonSetter("credit_card")
    public void setCreditCard(PaymentProfile creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * Internal Getter for Group.
     * @return Returns the Internal SubscriptionGroup2
     */
    @JsonGetter("group")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<SubscriptionGroup2> internalGetGroup() {
        return this.group;
    }

    /**
     * Getter for Group.
     * @return Returns the SubscriptionGroup2
     */
    public SubscriptionGroup2 getGroup() {
        return OptionalNullable.getFrom(group);
    }

    /**
     * Setter for Group.
     * @param group Value for SubscriptionGroup2
     */
    @JsonSetter("group")
    public void setGroup(SubscriptionGroup2 group) {
        this.group = OptionalNullable.of(group);
    }

    /**
     * UnSetter for Group.
     */
    public void unsetGroup() {
        group = null;
    }

    /**
     * Getter for BankAccount.
     * @return Returns the SubscriptionBankAccount
     */
    @JsonGetter("bank_account")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionBankAccount getBankAccount() {
        return bankAccount;
    }

    /**
     * Setter for BankAccount.
     * @param bankAccount Value for SubscriptionBankAccount
     */
    @JsonSetter("bank_account")
    public void setBankAccount(SubscriptionBankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * Internal Getter for PaymentType.
     * The payment profile type for the active profile on file.
     * @return Returns the Internal String
     */
    @JsonGetter("payment_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPaymentType() {
        return this.paymentType;
    }

    /**
     * Getter for PaymentType.
     * The payment profile type for the active profile on file.
     * @return Returns the String
     */
    public String getPaymentType() {
        return OptionalNullable.getFrom(paymentType);
    }

    /**
     * Setter for PaymentType.
     * The payment profile type for the active profile on file.
     * @param paymentType Value for String
     */
    @JsonSetter("payment_type")
    public void setPaymentType(String paymentType) {
        this.paymentType = OptionalNullable.of(paymentType);
    }

    /**
     * UnSetter for PaymentType.
     * The payment profile type for the active profile on file.
     */
    public void unsetPaymentType() {
        paymentType = null;
    }

    /**
     * Internal Getter for ReferralCode.
     * The subscription's unique code that can be given to referrals.
     * @return Returns the Internal String
     */
    @JsonGetter("referral_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetReferralCode() {
        return this.referralCode;
    }

    /**
     * Getter for ReferralCode.
     * The subscription's unique code that can be given to referrals.
     * @return Returns the String
     */
    public String getReferralCode() {
        return OptionalNullable.getFrom(referralCode);
    }

    /**
     * Setter for ReferralCode.
     * The subscription's unique code that can be given to referrals.
     * @param referralCode Value for String
     */
    @JsonSetter("referral_code")
    public void setReferralCode(String referralCode) {
        this.referralCode = OptionalNullable.of(referralCode);
    }

    /**
     * UnSetter for ReferralCode.
     * The subscription's unique code that can be given to referrals.
     */
    public void unsetReferralCode() {
        referralCode = null;
    }

    /**
     * Internal Getter for NextProductId.
     * If a delayed product change is scheduled, the ID of the product that the subscription will be
     * changed to at the next renewal.
     * @return Returns the Internal Integer
     */
    @JsonGetter("next_product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetNextProductId() {
        return this.nextProductId;
    }

    /**
     * Getter for NextProductId.
     * If a delayed product change is scheduled, the ID of the product that the subscription will be
     * changed to at the next renewal.
     * @return Returns the Integer
     */
    public Integer getNextProductId() {
        return OptionalNullable.getFrom(nextProductId);
    }

    /**
     * Setter for NextProductId.
     * If a delayed product change is scheduled, the ID of the product that the subscription will be
     * changed to at the next renewal.
     * @param nextProductId Value for Integer
     */
    @JsonSetter("next_product_id")
    public void setNextProductId(Integer nextProductId) {
        this.nextProductId = OptionalNullable.of(nextProductId);
    }

    /**
     * UnSetter for NextProductId.
     * If a delayed product change is scheduled, the ID of the product that the subscription will be
     * changed to at the next renewal.
     */
    public void unsetNextProductId() {
        nextProductId = null;
    }

    /**
     * Internal Getter for NextProductHandle.
     * If a delayed product change is scheduled, the handle of the product that the subscription
     * will be changed to at the next renewal.
     * @return Returns the Internal String
     */
    @JsonGetter("next_product_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetNextProductHandle() {
        return this.nextProductHandle;
    }

    /**
     * Getter for NextProductHandle.
     * If a delayed product change is scheduled, the handle of the product that the subscription
     * will be changed to at the next renewal.
     * @return Returns the String
     */
    public String getNextProductHandle() {
        return OptionalNullable.getFrom(nextProductHandle);
    }

    /**
     * Setter for NextProductHandle.
     * If a delayed product change is scheduled, the handle of the product that the subscription
     * will be changed to at the next renewal.
     * @param nextProductHandle Value for String
     */
    @JsonSetter("next_product_handle")
    public void setNextProductHandle(String nextProductHandle) {
        this.nextProductHandle = OptionalNullable.of(nextProductHandle);
    }

    /**
     * UnSetter for NextProductHandle.
     * If a delayed product change is scheduled, the handle of the product that the subscription
     * will be changed to at the next renewal.
     */
    public void unsetNextProductHandle() {
        nextProductHandle = null;
    }

    /**
     * Internal Getter for CouponUseCount.
     * (deprecated) How many times the subscription's single coupon has been used. This field has no
     * replacement for multiple coupons.
     * @return Returns the Internal Integer
     */
    @JsonGetter("coupon_use_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetCouponUseCount() {
        return this.couponUseCount;
    }

    /**
     * Getter for CouponUseCount.
     * (deprecated) How many times the subscription's single coupon has been used. This field has no
     * replacement for multiple coupons.
     * @return Returns the Integer
     */
    public Integer getCouponUseCount() {
        return OptionalNullable.getFrom(couponUseCount);
    }

    /**
     * Setter for CouponUseCount.
     * (deprecated) How many times the subscription's single coupon has been used. This field has no
     * replacement for multiple coupons.
     * @param couponUseCount Value for Integer
     */
    @JsonSetter("coupon_use_count")
    public void setCouponUseCount(Integer couponUseCount) {
        this.couponUseCount = OptionalNullable.of(couponUseCount);
    }

    /**
     * UnSetter for CouponUseCount.
     * (deprecated) How many times the subscription's single coupon has been used. This field has no
     * replacement for multiple coupons.
     */
    public void unsetCouponUseCount() {
        couponUseCount = null;
    }

    /**
     * Internal Getter for CouponUsesAllowed.
     * (deprecated) How many times the subscription's single coupon may be used. This field has no
     * replacement for multiple coupons.
     * @return Returns the Internal Integer
     */
    @JsonGetter("coupon_uses_allowed")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetCouponUsesAllowed() {
        return this.couponUsesAllowed;
    }

    /**
     * Getter for CouponUsesAllowed.
     * (deprecated) How many times the subscription's single coupon may be used. This field has no
     * replacement for multiple coupons.
     * @return Returns the Integer
     */
    public Integer getCouponUsesAllowed() {
        return OptionalNullable.getFrom(couponUsesAllowed);
    }

    /**
     * Setter for CouponUsesAllowed.
     * (deprecated) How many times the subscription's single coupon may be used. This field has no
     * replacement for multiple coupons.
     * @param couponUsesAllowed Value for Integer
     */
    @JsonSetter("coupon_uses_allowed")
    public void setCouponUsesAllowed(Integer couponUsesAllowed) {
        this.couponUsesAllowed = OptionalNullable.of(couponUsesAllowed);
    }

    /**
     * UnSetter for CouponUsesAllowed.
     * (deprecated) How many times the subscription's single coupon may be used. This field has no
     * replacement for multiple coupons.
     */
    public void unsetCouponUsesAllowed() {
        couponUsesAllowed = null;
    }

    /**
     * Internal Getter for ReasonCode.
     * If the subscription is canceled, this is their churn code.
     * @return Returns the Internal String
     */
    @JsonGetter("reason_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetReasonCode() {
        return this.reasonCode;
    }

    /**
     * Getter for ReasonCode.
     * If the subscription is canceled, this is their churn code.
     * @return Returns the String
     */
    public String getReasonCode() {
        return OptionalNullable.getFrom(reasonCode);
    }

    /**
     * Setter for ReasonCode.
     * If the subscription is canceled, this is their churn code.
     * @param reasonCode Value for String
     */
    @JsonSetter("reason_code")
    public void setReasonCode(String reasonCode) {
        this.reasonCode = OptionalNullable.of(reasonCode);
    }

    /**
     * UnSetter for ReasonCode.
     * If the subscription is canceled, this is their churn code.
     */
    public void unsetReasonCode() {
        reasonCode = null;
    }

    /**
     * Internal Getter for AutomaticallyResumeAt.
     * The date the subscription is scheduled to automatically resume from the on_hold state.
     * @return Returns the Internal String
     */
    @JsonGetter("automatically_resume_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAutomaticallyResumeAt() {
        return this.automaticallyResumeAt;
    }

    /**
     * Getter for AutomaticallyResumeAt.
     * The date the subscription is scheduled to automatically resume from the on_hold state.
     * @return Returns the String
     */
    public String getAutomaticallyResumeAt() {
        return OptionalNullable.getFrom(automaticallyResumeAt);
    }

    /**
     * Setter for AutomaticallyResumeAt.
     * The date the subscription is scheduled to automatically resume from the on_hold state.
     * @param automaticallyResumeAt Value for String
     */
    @JsonSetter("automatically_resume_at")
    public void setAutomaticallyResumeAt(String automaticallyResumeAt) {
        this.automaticallyResumeAt = OptionalNullable.of(automaticallyResumeAt);
    }

    /**
     * UnSetter for AutomaticallyResumeAt.
     * The date the subscription is scheduled to automatically resume from the on_hold state.
     */
    public void unsetAutomaticallyResumeAt() {
        automaticallyResumeAt = null;
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
     * Internal Getter for OfferId.
     * The ID of the offer associated with the subscription.
     * @return Returns the Internal Integer
     */
    @JsonGetter("offer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetOfferId() {
        return this.offerId;
    }

    /**
     * Getter for OfferId.
     * The ID of the offer associated with the subscription.
     * @return Returns the Integer
     */
    public Integer getOfferId() {
        return OptionalNullable.getFrom(offerId);
    }

    /**
     * Setter for OfferId.
     * The ID of the offer associated with the subscription.
     * @param offerId Value for Integer
     */
    @JsonSetter("offer_id")
    public void setOfferId(Integer offerId) {
        this.offerId = OptionalNullable.of(offerId);
    }

    /**
     * UnSetter for OfferId.
     * The ID of the offer associated with the subscription.
     */
    public void unsetOfferId() {
        offerId = null;
    }

    /**
     * Getter for PayerId.
     * On Relationship Invoicing, the ID of the individual paying for the subscription. Defaults to
     * the Customer ID unless the 'Customer Hierarchies &amp; WhoPays' feature is enabled.
     * @return Returns the Integer
     */
    @JsonGetter("payer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPayerId() {
        return payerId;
    }

    /**
     * Setter for PayerId.
     * On Relationship Invoicing, the ID of the individual paying for the subscription. Defaults to
     * the Customer ID unless the 'Customer Hierarchies &amp; WhoPays' feature is enabled.
     * @param payerId Value for Integer
     */
    @JsonSetter("payer_id")
    public void setPayerId(Integer payerId) {
        this.payerId = payerId;
    }

    /**
     * Getter for CurrentBillingAmountInCents.
     * The balance in cents plus the estimated renewal amount in cents.
     * @return Returns the Integer
     */
    @JsonGetter("current_billing_amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCurrentBillingAmountInCents() {
        return currentBillingAmountInCents;
    }

    /**
     * Setter for CurrentBillingAmountInCents.
     * The balance in cents plus the estimated renewal amount in cents.
     * @param currentBillingAmountInCents Value for Integer
     */
    @JsonSetter("current_billing_amount_in_cents")
    public void setCurrentBillingAmountInCents(Integer currentBillingAmountInCents) {
        this.currentBillingAmountInCents = currentBillingAmountInCents;
    }

    /**
     * Getter for ProductPricePointId.
     * The product price point currently subscribed to.
     * @return Returns the Integer
     */
    @JsonGetter("product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductPricePointId() {
        return productPricePointId;
    }

    /**
     * Setter for ProductPricePointId.
     * The product price point currently subscribed to.
     * @param productPricePointId Value for Integer
     */
    @JsonSetter("product_price_point_id")
    public void setProductPricePointId(Integer productPricePointId) {
        this.productPricePointId = productPricePointId;
    }

    /**
     * Getter for ProductPricePointType.
     * One of the following: custom, default, catalog.
     * @return Returns the String
     */
    @JsonGetter("product_price_point_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductPricePointType() {
        return productPricePointType;
    }

    /**
     * Setter for ProductPricePointType.
     * One of the following: custom, default, catalog.
     * @param productPricePointType Value for String
     */
    @JsonSetter("product_price_point_type")
    public void setProductPricePointType(String productPricePointType) {
        this.productPricePointType = productPricePointType;
    }

    /**
     * Internal Getter for NextProductPricePointId.
     * If a delayed product change is scheduled, the ID of the product price point that the
     * subscription will be changed to at the next renewal.
     * @return Returns the Internal Integer
     */
    @JsonGetter("next_product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetNextProductPricePointId() {
        return this.nextProductPricePointId;
    }

    /**
     * Getter for NextProductPricePointId.
     * If a delayed product change is scheduled, the ID of the product price point that the
     * subscription will be changed to at the next renewal.
     * @return Returns the Integer
     */
    public Integer getNextProductPricePointId() {
        return OptionalNullable.getFrom(nextProductPricePointId);
    }

    /**
     * Setter for NextProductPricePointId.
     * If a delayed product change is scheduled, the ID of the product price point that the
     * subscription will be changed to at the next renewal.
     * @param nextProductPricePointId Value for Integer
     */
    @JsonSetter("next_product_price_point_id")
    public void setNextProductPricePointId(Integer nextProductPricePointId) {
        this.nextProductPricePointId = OptionalNullable.of(nextProductPricePointId);
    }

    /**
     * UnSetter for NextProductPricePointId.
     * If a delayed product change is scheduled, the ID of the product price point that the
     * subscription will be changed to at the next renewal.
     */
    public void unsetNextProductPricePointId() {
        nextProductPricePointId = null;
    }

    /**
     * Internal Getter for NetTerms.
     * On Relationship Invoicing, the number of days before a renewal invoice is due.
     * @return Returns the Internal Integer
     */
    @JsonGetter("net_terms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetNetTerms() {
        return this.netTerms;
    }

    /**
     * Getter for NetTerms.
     * On Relationship Invoicing, the number of days before a renewal invoice is due.
     * @return Returns the Integer
     */
    public Integer getNetTerms() {
        return OptionalNullable.getFrom(netTerms);
    }

    /**
     * Setter for NetTerms.
     * On Relationship Invoicing, the number of days before a renewal invoice is due.
     * @param netTerms Value for Integer
     */
    @JsonSetter("net_terms")
    public void setNetTerms(Integer netTerms) {
        this.netTerms = OptionalNullable.of(netTerms);
    }

    /**
     * UnSetter for NetTerms.
     * On Relationship Invoicing, the number of days before a renewal invoice is due.
     */
    public void unsetNetTerms() {
        netTerms = null;
    }

    /**
     * Internal Getter for StoredCredentialTransactionId.
     * For European sites subject to PSD2 and using 3D Secure, this can be used to reference a
     * previous transaction for the customer. This will ensure the card will be charged successfully
     * at renewal.
     * @return Returns the Internal Integer
     */
    @JsonGetter("stored_credential_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetStoredCredentialTransactionId() {
        return this.storedCredentialTransactionId;
    }

    /**
     * Getter for StoredCredentialTransactionId.
     * For European sites subject to PSD2 and using 3D Secure, this can be used to reference a
     * previous transaction for the customer. This will ensure the card will be charged successfully
     * at renewal.
     * @return Returns the Integer
     */
    public Integer getStoredCredentialTransactionId() {
        return OptionalNullable.getFrom(storedCredentialTransactionId);
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
        this.storedCredentialTransactionId = OptionalNullable.of(storedCredentialTransactionId);
    }

    /**
     * UnSetter for StoredCredentialTransactionId.
     * For European sites subject to PSD2 and using 3D Secure, this can be used to reference a
     * previous transaction for the customer. This will ensure the card will be charged successfully
     * at renewal.
     */
    public void unsetStoredCredentialTransactionId() {
        storedCredentialTransactionId = null;
    }

    /**
     * Internal Getter for Reference.
     * The reference value (provided by your app) for the subscription itelf.
     * @return Returns the Internal String
     */
    @JsonGetter("reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetReference() {
        return this.reference;
    }

    /**
     * Getter for Reference.
     * The reference value (provided by your app) for the subscription itelf.
     * @return Returns the String
     */
    public String getReference() {
        return OptionalNullable.getFrom(reference);
    }

    /**
     * Setter for Reference.
     * The reference value (provided by your app) for the subscription itelf.
     * @param reference Value for String
     */
    @JsonSetter("reference")
    public void setReference(String reference) {
        this.reference = OptionalNullable.of(reference);
    }

    /**
     * UnSetter for Reference.
     * The reference value (provided by your app) for the subscription itelf.
     */
    public void unsetReference() {
        reference = null;
    }

    /**
     * Internal Getter for OnHoldAt.
     * The timestamp of the most recent on hold action.
     * @return Returns the Internal String
     */
    @JsonGetter("on_hold_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetOnHoldAt() {
        return this.onHoldAt;
    }

    /**
     * Getter for OnHoldAt.
     * The timestamp of the most recent on hold action.
     * @return Returns the String
     */
    public String getOnHoldAt() {
        return OptionalNullable.getFrom(onHoldAt);
    }

    /**
     * Setter for OnHoldAt.
     * The timestamp of the most recent on hold action.
     * @param onHoldAt Value for String
     */
    @JsonSetter("on_hold_at")
    public void setOnHoldAt(String onHoldAt) {
        this.onHoldAt = OptionalNullable.of(onHoldAt);
    }

    /**
     * UnSetter for OnHoldAt.
     * The timestamp of the most recent on hold action.
     */
    public void unsetOnHoldAt() {
        onHoldAt = null;
    }

    /**
     * Getter for PrepaidDunning.
     * Boolean representing whether the subscription is prepaid and currently in dunning. Only
     * returned for Relationship Invoicing sites with the feature enabled
     * @return Returns the Boolean
     */
    @JsonGetter("prepaid_dunning")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPrepaidDunning() {
        return prepaidDunning;
    }

    /**
     * Setter for PrepaidDunning.
     * Boolean representing whether the subscription is prepaid and currently in dunning. Only
     * returned for Relationship Invoicing sites with the feature enabled
     * @param prepaidDunning Value for Boolean
     */
    @JsonSetter("prepaid_dunning")
    public void setPrepaidDunning(Boolean prepaidDunning) {
        this.prepaidDunning = prepaidDunning;
    }

    /**
     * Getter for Coupons.
     * Additional coupon data. To use this data you also have to include the following param in the
     * request`include[]=coupons`. Only in Read Subscription Endpoint.
     * @return Returns the List of SubscriptionIncludedCoupon
     */
    @JsonGetter("coupons")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SubscriptionIncludedCoupon> getCoupons() {
        return coupons;
    }

    /**
     * Setter for Coupons.
     * Additional coupon data. To use this data you also have to include the following param in the
     * request`include[]=coupons`. Only in Read Subscription Endpoint.
     * @param coupons Value for List of SubscriptionIncludedCoupon
     */
    @JsonSetter("coupons")
    public void setCoupons(List<SubscriptionIncludedCoupon> coupons) {
        this.coupons = coupons;
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
     * Internal Getter for ReceivesInvoiceEmails.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("receives_invoice_emails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetReceivesInvoiceEmails() {
        return this.receivesInvoiceEmails;
    }

    /**
     * Getter for ReceivesInvoiceEmails.
     * @return Returns the Boolean
     */
    public Boolean getReceivesInvoiceEmails() {
        return OptionalNullable.getFrom(receivesInvoiceEmails);
    }

    /**
     * Setter for ReceivesInvoiceEmails.
     * @param receivesInvoiceEmails Value for Boolean
     */
    @JsonSetter("receives_invoice_emails")
    public void setReceivesInvoiceEmails(Boolean receivesInvoiceEmails) {
        this.receivesInvoiceEmails = OptionalNullable.of(receivesInvoiceEmails);
    }

    /**
     * UnSetter for ReceivesInvoiceEmails.
     */
    public void unsetReceivesInvoiceEmails() {
        receivesInvoiceEmails = null;
    }

    /**
     * Internal Getter for Locale.
     * @return Returns the Internal String
     */
    @JsonGetter("locale")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLocale() {
        return this.locale;
    }

    /**
     * Getter for Locale.
     * @return Returns the String
     */
    public String getLocale() {
        return OptionalNullable.getFrom(locale);
    }

    /**
     * Setter for Locale.
     * @param locale Value for String
     */
    @JsonSetter("locale")
    public void setLocale(String locale) {
        this.locale = OptionalNullable.of(locale);
    }

    /**
     * UnSetter for Locale.
     */
    public void unsetLocale() {
        locale = null;
    }

    /**
     * Getter for Currency.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Internal Getter for ScheduledCancellationAt.
     * @return Returns the Internal String
     */
    @JsonGetter("scheduled_cancellation_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetScheduledCancellationAt() {
        return this.scheduledCancellationAt;
    }

    /**
     * Getter for ScheduledCancellationAt.
     * @return Returns the String
     */
    public String getScheduledCancellationAt() {
        return OptionalNullable.getFrom(scheduledCancellationAt);
    }

    /**
     * Setter for ScheduledCancellationAt.
     * @param scheduledCancellationAt Value for String
     */
    @JsonSetter("scheduled_cancellation_at")
    public void setScheduledCancellationAt(String scheduledCancellationAt) {
        this.scheduledCancellationAt = OptionalNullable.of(scheduledCancellationAt);
    }

    /**
     * UnSetter for ScheduledCancellationAt.
     */
    public void unsetScheduledCancellationAt() {
        scheduledCancellationAt = null;
    }

    /**
     * Getter for CreditBalanceInCents.
     * @return Returns the Integer
     */
    @JsonGetter("credit_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCreditBalanceInCents() {
        return creditBalanceInCents;
    }

    /**
     * Setter for CreditBalanceInCents.
     * @param creditBalanceInCents Value for Integer
     */
    @JsonSetter("credit_balance_in_cents")
    public void setCreditBalanceInCents(Integer creditBalanceInCents) {
        this.creditBalanceInCents = creditBalanceInCents;
    }

    /**
     * Getter for PrepaymentBalanceInCents.
     * @return Returns the Integer
     */
    @JsonGetter("prepayment_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPrepaymentBalanceInCents() {
        return prepaymentBalanceInCents;
    }

    /**
     * Setter for PrepaymentBalanceInCents.
     * @param prepaymentBalanceInCents Value for Integer
     */
    @JsonSetter("prepayment_balance_in_cents")
    public void setPrepaymentBalanceInCents(Integer prepaymentBalanceInCents) {
        this.prepaymentBalanceInCents = prepaymentBalanceInCents;
    }

    /**
     * Converts this Subscription into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Subscription [" + "id=" + id + ", state=" + state + ", balanceInCents="
                + balanceInCents + ", totalRevenueInCents=" + totalRevenueInCents
                + ", productPriceInCents=" + productPriceInCents + ", productVersionNumber="
                + productVersionNumber + ", currentPeriodEndsAt=" + currentPeriodEndsAt
                + ", nextAssessmentAt=" + nextAssessmentAt + ", trialStartedAt=" + trialStartedAt
                + ", trialEndedAt=" + trialEndedAt + ", activatedAt=" + activatedAt + ", expiresAt="
                + expiresAt + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
                + ", cancellationMessage=" + cancellationMessage + ", cancellationMethod="
                + cancellationMethod + ", cancelAtEndOfPeriod=" + cancelAtEndOfPeriod
                + ", canceledAt=" + canceledAt + ", currentPeriodStartedAt="
                + currentPeriodStartedAt + ", previousState=" + previousState + ", signupPaymentId="
                + signupPaymentId + ", signupRevenue=" + signupRevenue + ", delayedCancelAt="
                + delayedCancelAt + ", couponCode=" + couponCode + ", snapDay=" + snapDay
                + ", paymentCollectionMethod=" + paymentCollectionMethod + ", customer=" + customer
                + ", product=" + product + ", creditCard=" + creditCard + ", group=" + group
                + ", bankAccount=" + bankAccount + ", paymentType=" + paymentType
                + ", referralCode=" + referralCode + ", nextProductId=" + nextProductId
                + ", nextProductHandle=" + nextProductHandle + ", couponUseCount=" + couponUseCount
                + ", couponUsesAllowed=" + couponUsesAllowed + ", reasonCode=" + reasonCode
                + ", automaticallyResumeAt=" + automaticallyResumeAt + ", couponCodes="
                + couponCodes + ", offerId=" + offerId + ", payerId=" + payerId
                + ", currentBillingAmountInCents=" + currentBillingAmountInCents
                + ", productPricePointId=" + productPricePointId + ", productPricePointType="
                + productPricePointType + ", nextProductPricePointId=" + nextProductPricePointId
                + ", netTerms=" + netTerms + ", storedCredentialTransactionId="
                + storedCredentialTransactionId + ", reference=" + reference + ", onHoldAt="
                + onHoldAt + ", prepaidDunning=" + prepaidDunning + ", coupons=" + coupons
                + ", dunningCommunicationDelayEnabled=" + dunningCommunicationDelayEnabled
                + ", dunningCommunicationDelayTimeZone=" + dunningCommunicationDelayTimeZone
                + ", receivesInvoiceEmails=" + receivesInvoiceEmails + ", locale=" + locale
                + ", currency=" + currency + ", scheduledCancellationAt=" + scheduledCancellationAt
                + ", creditBalanceInCents=" + creditBalanceInCents + ", prepaymentBalanceInCents="
                + prepaymentBalanceInCents + "]";
    }

    /**
     * Builds a new {@link Subscription.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Subscription.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .state(getState())
                .balanceInCents(getBalanceInCents())
                .totalRevenueInCents(getTotalRevenueInCents())
                .productPriceInCents(getProductPriceInCents())
                .productVersionNumber(getProductVersionNumber())
                .currentPeriodEndsAt(getCurrentPeriodEndsAt())
                .nextAssessmentAt(getNextAssessmentAt())
                .activatedAt(getActivatedAt())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .currentPeriodStartedAt(getCurrentPeriodStartedAt())
                .previousState(getPreviousState())
                .signupPaymentId(getSignupPaymentId())
                .signupRevenue(getSignupRevenue())
                .customer(getCustomer())
                .product(getProduct())
                .creditCard(getCreditCard())
                .bankAccount(getBankAccount())
                .couponCodes(getCouponCodes())
                .payerId(getPayerId())
                .currentBillingAmountInCents(getCurrentBillingAmountInCents())
                .productPricePointId(getProductPricePointId())
                .productPricePointType(getProductPricePointType())
                .prepaidDunning(getPrepaidDunning())
                .coupons(getCoupons())
                .dunningCommunicationDelayEnabled(getDunningCommunicationDelayEnabled())
                .currency(getCurrency())
                .creditBalanceInCents(getCreditBalanceInCents())
                .prepaymentBalanceInCents(getPrepaymentBalanceInCents());
        builder.trialStartedAt = internalGetTrialStartedAt();
        builder.trialEndedAt = internalGetTrialEndedAt();
        builder.expiresAt = internalGetExpiresAt();
        builder.cancellationMessage = internalGetCancellationMessage();
        builder.cancellationMethod = internalGetCancellationMethod();
        builder.cancelAtEndOfPeriod = internalGetCancelAtEndOfPeriod();
        builder.canceledAt = internalGetCanceledAt();
        builder.delayedCancelAt = internalGetDelayedCancelAt();
        builder.couponCode = internalGetCouponCode();
        builder.snapDay = internalGetSnapDay();
        builder.paymentCollectionMethod = internalGetPaymentCollectionMethod();
        builder.group = internalGetGroup();
        builder.paymentType = internalGetPaymentType();
        builder.referralCode = internalGetReferralCode();
        builder.nextProductId = internalGetNextProductId();
        builder.nextProductHandle = internalGetNextProductHandle();
        builder.couponUseCount = internalGetCouponUseCount();
        builder.couponUsesAllowed = internalGetCouponUsesAllowed();
        builder.reasonCode = internalGetReasonCode();
        builder.automaticallyResumeAt = internalGetAutomaticallyResumeAt();
        builder.offerId = internalGetOfferId();
        builder.nextProductPricePointId = internalGetNextProductPricePointId();
        builder.netTerms = internalGetNetTerms();
        builder.storedCredentialTransactionId = internalGetStoredCredentialTransactionId();
        builder.reference = internalGetReference();
        builder.onHoldAt = internalGetOnHoldAt();
        builder.dunningCommunicationDelayTimeZone = internalGetDunningCommunicationDelayTimeZone();
        builder.receivesInvoiceEmails = internalGetReceivesInvoiceEmails();
        builder.locale = internalGetLocale();
        builder.scheduledCancellationAt = internalGetScheduledCancellationAt();
        return builder;
    }

    /**
     * Class to build instances of {@link Subscription}.
     */
    public static class Builder {
        private Integer id;
        private String state;
        private Integer balanceInCents;
        private Integer totalRevenueInCents;
        private Integer productPriceInCents;
        private Integer productVersionNumber;
        private String currentPeriodEndsAt;
        private String nextAssessmentAt;
        private OptionalNullable<String> trialStartedAt;
        private OptionalNullable<String> trialEndedAt;
        private String activatedAt;
        private OptionalNullable<String> expiresAt;
        private String createdAt;
        private String updatedAt;
        private OptionalNullable<String> cancellationMessage;
        private OptionalNullable<SubscriptionCancellationMethod> cancellationMethod;
        private OptionalNullable<Boolean> cancelAtEndOfPeriod;
        private OptionalNullable<String> canceledAt;
        private String currentPeriodStartedAt;
        private String previousState;
        private Integer signupPaymentId;
        private String signupRevenue;
        private OptionalNullable<String> delayedCancelAt;
        private OptionalNullable<String> couponCode;
        private OptionalNullable<String> snapDay;
        private OptionalNullable<SubscriptionPaymentCollectionMethod> paymentCollectionMethod;
        private Customer customer;
        private Product product;
        private PaymentProfile creditCard;
        private OptionalNullable<SubscriptionGroup2> group;
        private SubscriptionBankAccount bankAccount;
        private OptionalNullable<String> paymentType;
        private OptionalNullable<String> referralCode;
        private OptionalNullable<Integer> nextProductId;
        private OptionalNullable<String> nextProductHandle;
        private OptionalNullable<Integer> couponUseCount;
        private OptionalNullable<Integer> couponUsesAllowed;
        private OptionalNullable<String> reasonCode;
        private OptionalNullable<String> automaticallyResumeAt;
        private List<String> couponCodes;
        private OptionalNullable<Integer> offerId;
        private Integer payerId;
        private Integer currentBillingAmountInCents;
        private Integer productPricePointId;
        private String productPricePointType;
        private OptionalNullable<Integer> nextProductPricePointId;
        private OptionalNullable<Integer> netTerms;
        private OptionalNullable<Integer> storedCredentialTransactionId;
        private OptionalNullable<String> reference;
        private OptionalNullable<String> onHoldAt;
        private Boolean prepaidDunning;
        private List<SubscriptionIncludedCoupon> coupons;
        private Boolean dunningCommunicationDelayEnabled = false;
        private OptionalNullable<String> dunningCommunicationDelayTimeZone;
        private OptionalNullable<Boolean> receivesInvoiceEmails;
        private OptionalNullable<String> locale;
        private String currency;
        private OptionalNullable<String> scheduledCancellationAt;
        private Integer creditBalanceInCents;
        private Integer prepaymentBalanceInCents;



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
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for balanceInCents.
         * @param  balanceInCents  Integer value for balanceInCents.
         * @return Builder
         */
        public Builder balanceInCents(Integer balanceInCents) {
            this.balanceInCents = balanceInCents;
            return this;
        }

        /**
         * Setter for totalRevenueInCents.
         * @param  totalRevenueInCents  Integer value for totalRevenueInCents.
         * @return Builder
         */
        public Builder totalRevenueInCents(Integer totalRevenueInCents) {
            this.totalRevenueInCents = totalRevenueInCents;
            return this;
        }

        /**
         * Setter for productPriceInCents.
         * @param  productPriceInCents  Integer value for productPriceInCents.
         * @return Builder
         */
        public Builder productPriceInCents(Integer productPriceInCents) {
            this.productPriceInCents = productPriceInCents;
            return this;
        }

        /**
         * Setter for productVersionNumber.
         * @param  productVersionNumber  Integer value for productVersionNumber.
         * @return Builder
         */
        public Builder productVersionNumber(Integer productVersionNumber) {
            this.productVersionNumber = productVersionNumber;
            return this;
        }

        /**
         * Setter for currentPeriodEndsAt.
         * @param  currentPeriodEndsAt  String value for currentPeriodEndsAt.
         * @return Builder
         */
        public Builder currentPeriodEndsAt(String currentPeriodEndsAt) {
            this.currentPeriodEndsAt = currentPeriodEndsAt;
            return this;
        }

        /**
         * Setter for nextAssessmentAt.
         * @param  nextAssessmentAt  String value for nextAssessmentAt.
         * @return Builder
         */
        public Builder nextAssessmentAt(String nextAssessmentAt) {
            this.nextAssessmentAt = nextAssessmentAt;
            return this;
        }

        /**
         * Setter for trialStartedAt.
         * @param  trialStartedAt  String value for trialStartedAt.
         * @return Builder
         */
        public Builder trialStartedAt(String trialStartedAt) {
            this.trialStartedAt = OptionalNullable.of(trialStartedAt);
            return this;
        }

        /**
         * UnSetter for trialStartedAt.
         * @return Builder
         */
        public Builder unsetTrialStartedAt() {
            trialStartedAt = null;
            return this;
        }

        /**
         * Setter for trialEndedAt.
         * @param  trialEndedAt  String value for trialEndedAt.
         * @return Builder
         */
        public Builder trialEndedAt(String trialEndedAt) {
            this.trialEndedAt = OptionalNullable.of(trialEndedAt);
            return this;
        }

        /**
         * UnSetter for trialEndedAt.
         * @return Builder
         */
        public Builder unsetTrialEndedAt() {
            trialEndedAt = null;
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
         * Setter for expiresAt.
         * @param  expiresAt  String value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = OptionalNullable.of(expiresAt);
            return this;
        }

        /**
         * UnSetter for expiresAt.
         * @return Builder
         */
        public Builder unsetExpiresAt() {
            expiresAt = null;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for cancellationMessage.
         * @param  cancellationMessage  String value for cancellationMessage.
         * @return Builder
         */
        public Builder cancellationMessage(String cancellationMessage) {
            this.cancellationMessage = OptionalNullable.of(cancellationMessage);
            return this;
        }

        /**
         * UnSetter for cancellationMessage.
         * @return Builder
         */
        public Builder unsetCancellationMessage() {
            cancellationMessage = null;
            return this;
        }

        /**
         * Setter for cancellationMethod.
         * @param  cancellationMethod  SubscriptionCancellationMethod value for cancellationMethod.
         * @return Builder
         */
        public Builder cancellationMethod(SubscriptionCancellationMethod cancellationMethod) {
            this.cancellationMethod = OptionalNullable.of(cancellationMethod);
            return this;
        }

        /**
         * UnSetter for cancellationMethod.
         * @return Builder
         */
        public Builder unsetCancellationMethod() {
            cancellationMethod = null;
            return this;
        }

        /**
         * Setter for cancelAtEndOfPeriod.
         * @param  cancelAtEndOfPeriod  Boolean value for cancelAtEndOfPeriod.
         * @return Builder
         */
        public Builder cancelAtEndOfPeriod(Boolean cancelAtEndOfPeriod) {
            this.cancelAtEndOfPeriod = OptionalNullable.of(cancelAtEndOfPeriod);
            return this;
        }

        /**
         * UnSetter for cancelAtEndOfPeriod.
         * @return Builder
         */
        public Builder unsetCancelAtEndOfPeriod() {
            cancelAtEndOfPeriod = null;
            return this;
        }

        /**
         * Setter for canceledAt.
         * @param  canceledAt  String value for canceledAt.
         * @return Builder
         */
        public Builder canceledAt(String canceledAt) {
            this.canceledAt = OptionalNullable.of(canceledAt);
            return this;
        }

        /**
         * UnSetter for canceledAt.
         * @return Builder
         */
        public Builder unsetCanceledAt() {
            canceledAt = null;
            return this;
        }

        /**
         * Setter for currentPeriodStartedAt.
         * @param  currentPeriodStartedAt  String value for currentPeriodStartedAt.
         * @return Builder
         */
        public Builder currentPeriodStartedAt(String currentPeriodStartedAt) {
            this.currentPeriodStartedAt = currentPeriodStartedAt;
            return this;
        }

        /**
         * Setter for previousState.
         * @param  previousState  String value for previousState.
         * @return Builder
         */
        public Builder previousState(String previousState) {
            this.previousState = previousState;
            return this;
        }

        /**
         * Setter for signupPaymentId.
         * @param  signupPaymentId  Integer value for signupPaymentId.
         * @return Builder
         */
        public Builder signupPaymentId(Integer signupPaymentId) {
            this.signupPaymentId = signupPaymentId;
            return this;
        }

        /**
         * Setter for signupRevenue.
         * @param  signupRevenue  String value for signupRevenue.
         * @return Builder
         */
        public Builder signupRevenue(String signupRevenue) {
            this.signupRevenue = signupRevenue;
            return this;
        }

        /**
         * Setter for delayedCancelAt.
         * @param  delayedCancelAt  String value for delayedCancelAt.
         * @return Builder
         */
        public Builder delayedCancelAt(String delayedCancelAt) {
            this.delayedCancelAt = OptionalNullable.of(delayedCancelAt);
            return this;
        }

        /**
         * UnSetter for delayedCancelAt.
         * @return Builder
         */
        public Builder unsetDelayedCancelAt() {
            delayedCancelAt = null;
            return this;
        }

        /**
         * Setter for couponCode.
         * @param  couponCode  String value for couponCode.
         * @return Builder
         */
        public Builder couponCode(String couponCode) {
            this.couponCode = OptionalNullable.of(couponCode);
            return this;
        }

        /**
         * UnSetter for couponCode.
         * @return Builder
         */
        public Builder unsetCouponCode() {
            couponCode = null;
            return this;
        }

        /**
         * Setter for snapDay.
         * @param  snapDay  String value for snapDay.
         * @return Builder
         */
        public Builder snapDay(String snapDay) {
            this.snapDay = OptionalNullable.of(snapDay);
            return this;
        }

        /**
         * UnSetter for snapDay.
         * @return Builder
         */
        public Builder unsetSnapDay() {
            snapDay = null;
            return this;
        }

        /**
         * Setter for paymentCollectionMethod.
         * @param  paymentCollectionMethod  SubscriptionPaymentCollectionMethod value for
         *         paymentCollectionMethod.
         * @return Builder
         */
        public Builder paymentCollectionMethod(
                SubscriptionPaymentCollectionMethod paymentCollectionMethod) {
            this.paymentCollectionMethod = OptionalNullable.of(paymentCollectionMethod);
            return this;
        }

        /**
         * UnSetter for paymentCollectionMethod.
         * @return Builder
         */
        public Builder unsetPaymentCollectionMethod() {
            paymentCollectionMethod = null;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  Customer value for customer.
         * @return Builder
         */
        public Builder customer(Customer customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for product.
         * @param  product  Product value for product.
         * @return Builder
         */
        public Builder product(Product product) {
            this.product = product;
            return this;
        }

        /**
         * Setter for creditCard.
         * @param  creditCard  PaymentProfile value for creditCard.
         * @return Builder
         */
        public Builder creditCard(PaymentProfile creditCard) {
            this.creditCard = creditCard;
            return this;
        }

        /**
         * Setter for group.
         * @param  group  SubscriptionGroup2 value for group.
         * @return Builder
         */
        public Builder group(SubscriptionGroup2 group) {
            this.group = OptionalNullable.of(group);
            return this;
        }

        /**
         * UnSetter for group.
         * @return Builder
         */
        public Builder unsetGroup() {
            group = null;
            return this;
        }

        /**
         * Setter for bankAccount.
         * @param  bankAccount  SubscriptionBankAccount value for bankAccount.
         * @return Builder
         */
        public Builder bankAccount(SubscriptionBankAccount bankAccount) {
            this.bankAccount = bankAccount;
            return this;
        }

        /**
         * Setter for paymentType.
         * @param  paymentType  String value for paymentType.
         * @return Builder
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = OptionalNullable.of(paymentType);
            return this;
        }

        /**
         * UnSetter for paymentType.
         * @return Builder
         */
        public Builder unsetPaymentType() {
            paymentType = null;
            return this;
        }

        /**
         * Setter for referralCode.
         * @param  referralCode  String value for referralCode.
         * @return Builder
         */
        public Builder referralCode(String referralCode) {
            this.referralCode = OptionalNullable.of(referralCode);
            return this;
        }

        /**
         * UnSetter for referralCode.
         * @return Builder
         */
        public Builder unsetReferralCode() {
            referralCode = null;
            return this;
        }

        /**
         * Setter for nextProductId.
         * @param  nextProductId  Integer value for nextProductId.
         * @return Builder
         */
        public Builder nextProductId(Integer nextProductId) {
            this.nextProductId = OptionalNullable.of(nextProductId);
            return this;
        }

        /**
         * UnSetter for nextProductId.
         * @return Builder
         */
        public Builder unsetNextProductId() {
            nextProductId = null;
            return this;
        }

        /**
         * Setter for nextProductHandle.
         * @param  nextProductHandle  String value for nextProductHandle.
         * @return Builder
         */
        public Builder nextProductHandle(String nextProductHandle) {
            this.nextProductHandle = OptionalNullable.of(nextProductHandle);
            return this;
        }

        /**
         * UnSetter for nextProductHandle.
         * @return Builder
         */
        public Builder unsetNextProductHandle() {
            nextProductHandle = null;
            return this;
        }

        /**
         * Setter for couponUseCount.
         * @param  couponUseCount  Integer value for couponUseCount.
         * @return Builder
         */
        public Builder couponUseCount(Integer couponUseCount) {
            this.couponUseCount = OptionalNullable.of(couponUseCount);
            return this;
        }

        /**
         * UnSetter for couponUseCount.
         * @return Builder
         */
        public Builder unsetCouponUseCount() {
            couponUseCount = null;
            return this;
        }

        /**
         * Setter for couponUsesAllowed.
         * @param  couponUsesAllowed  Integer value for couponUsesAllowed.
         * @return Builder
         */
        public Builder couponUsesAllowed(Integer couponUsesAllowed) {
            this.couponUsesAllowed = OptionalNullable.of(couponUsesAllowed);
            return this;
        }

        /**
         * UnSetter for couponUsesAllowed.
         * @return Builder
         */
        public Builder unsetCouponUsesAllowed() {
            couponUsesAllowed = null;
            return this;
        }

        /**
         * Setter for reasonCode.
         * @param  reasonCode  String value for reasonCode.
         * @return Builder
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = OptionalNullable.of(reasonCode);
            return this;
        }

        /**
         * UnSetter for reasonCode.
         * @return Builder
         */
        public Builder unsetReasonCode() {
            reasonCode = null;
            return this;
        }

        /**
         * Setter for automaticallyResumeAt.
         * @param  automaticallyResumeAt  String value for automaticallyResumeAt.
         * @return Builder
         */
        public Builder automaticallyResumeAt(String automaticallyResumeAt) {
            this.automaticallyResumeAt = OptionalNullable.of(automaticallyResumeAt);
            return this;
        }

        /**
         * UnSetter for automaticallyResumeAt.
         * @return Builder
         */
        public Builder unsetAutomaticallyResumeAt() {
            automaticallyResumeAt = null;
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
         * Setter for offerId.
         * @param  offerId  Integer value for offerId.
         * @return Builder
         */
        public Builder offerId(Integer offerId) {
            this.offerId = OptionalNullable.of(offerId);
            return this;
        }

        /**
         * UnSetter for offerId.
         * @return Builder
         */
        public Builder unsetOfferId() {
            offerId = null;
            return this;
        }

        /**
         * Setter for payerId.
         * @param  payerId  Integer value for payerId.
         * @return Builder
         */
        public Builder payerId(Integer payerId) {
            this.payerId = payerId;
            return this;
        }

        /**
         * Setter for currentBillingAmountInCents.
         * @param  currentBillingAmountInCents  Integer value for currentBillingAmountInCents.
         * @return Builder
         */
        public Builder currentBillingAmountInCents(Integer currentBillingAmountInCents) {
            this.currentBillingAmountInCents = currentBillingAmountInCents;
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
         * Setter for productPricePointType.
         * @param  productPricePointType  String value for productPricePointType.
         * @return Builder
         */
        public Builder productPricePointType(String productPricePointType) {
            this.productPricePointType = productPricePointType;
            return this;
        }

        /**
         * Setter for nextProductPricePointId.
         * @param  nextProductPricePointId  Integer value for nextProductPricePointId.
         * @return Builder
         */
        public Builder nextProductPricePointId(Integer nextProductPricePointId) {
            this.nextProductPricePointId = OptionalNullable.of(nextProductPricePointId);
            return this;
        }

        /**
         * UnSetter for nextProductPricePointId.
         * @return Builder
         */
        public Builder unsetNextProductPricePointId() {
            nextProductPricePointId = null;
            return this;
        }

        /**
         * Setter for netTerms.
         * @param  netTerms  Integer value for netTerms.
         * @return Builder
         */
        public Builder netTerms(Integer netTerms) {
            this.netTerms = OptionalNullable.of(netTerms);
            return this;
        }

        /**
         * UnSetter for netTerms.
         * @return Builder
         */
        public Builder unsetNetTerms() {
            netTerms = null;
            return this;
        }

        /**
         * Setter for storedCredentialTransactionId.
         * @param  storedCredentialTransactionId  Integer value for storedCredentialTransactionId.
         * @return Builder
         */
        public Builder storedCredentialTransactionId(Integer storedCredentialTransactionId) {
            this.storedCredentialTransactionId = OptionalNullable.of(storedCredentialTransactionId);
            return this;
        }

        /**
         * UnSetter for storedCredentialTransactionId.
         * @return Builder
         */
        public Builder unsetStoredCredentialTransactionId() {
            storedCredentialTransactionId = null;
            return this;
        }

        /**
         * Setter for reference.
         * @param  reference  String value for reference.
         * @return Builder
         */
        public Builder reference(String reference) {
            this.reference = OptionalNullable.of(reference);
            return this;
        }

        /**
         * UnSetter for reference.
         * @return Builder
         */
        public Builder unsetReference() {
            reference = null;
            return this;
        }

        /**
         * Setter for onHoldAt.
         * @param  onHoldAt  String value for onHoldAt.
         * @return Builder
         */
        public Builder onHoldAt(String onHoldAt) {
            this.onHoldAt = OptionalNullable.of(onHoldAt);
            return this;
        }

        /**
         * UnSetter for onHoldAt.
         * @return Builder
         */
        public Builder unsetOnHoldAt() {
            onHoldAt = null;
            return this;
        }

        /**
         * Setter for prepaidDunning.
         * @param  prepaidDunning  Boolean value for prepaidDunning.
         * @return Builder
         */
        public Builder prepaidDunning(Boolean prepaidDunning) {
            this.prepaidDunning = prepaidDunning;
            return this;
        }

        /**
         * Setter for coupons.
         * @param  coupons  List of SubscriptionIncludedCoupon value for coupons.
         * @return Builder
         */
        public Builder coupons(List<SubscriptionIncludedCoupon> coupons) {
            this.coupons = coupons;
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
         * Setter for receivesInvoiceEmails.
         * @param  receivesInvoiceEmails  Boolean value for receivesInvoiceEmails.
         * @return Builder
         */
        public Builder receivesInvoiceEmails(Boolean receivesInvoiceEmails) {
            this.receivesInvoiceEmails = OptionalNullable.of(receivesInvoiceEmails);
            return this;
        }

        /**
         * UnSetter for receivesInvoiceEmails.
         * @return Builder
         */
        public Builder unsetReceivesInvoiceEmails() {
            receivesInvoiceEmails = null;
            return this;
        }

        /**
         * Setter for locale.
         * @param  locale  String value for locale.
         * @return Builder
         */
        public Builder locale(String locale) {
            this.locale = OptionalNullable.of(locale);
            return this;
        }

        /**
         * UnSetter for locale.
         * @return Builder
         */
        public Builder unsetLocale() {
            locale = null;
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
         * Setter for scheduledCancellationAt.
         * @param  scheduledCancellationAt  String value for scheduledCancellationAt.
         * @return Builder
         */
        public Builder scheduledCancellationAt(String scheduledCancellationAt) {
            this.scheduledCancellationAt = OptionalNullable.of(scheduledCancellationAt);
            return this;
        }

        /**
         * UnSetter for scheduledCancellationAt.
         * @return Builder
         */
        public Builder unsetScheduledCancellationAt() {
            scheduledCancellationAt = null;
            return this;
        }

        /**
         * Setter for creditBalanceInCents.
         * @param  creditBalanceInCents  Integer value for creditBalanceInCents.
         * @return Builder
         */
        public Builder creditBalanceInCents(Integer creditBalanceInCents) {
            this.creditBalanceInCents = creditBalanceInCents;
            return this;
        }

        /**
         * Setter for prepaymentBalanceInCents.
         * @param  prepaymentBalanceInCents  Integer value for prepaymentBalanceInCents.
         * @return Builder
         */
        public Builder prepaymentBalanceInCents(Integer prepaymentBalanceInCents) {
            this.prepaymentBalanceInCents = prepaymentBalanceInCents;
            return this;
        }

        /**
         * Builds a new {@link Subscription} object using the set fields.
         * @return {@link Subscription}
         */
        public Subscription build() {
            return new Subscription(id, state, balanceInCents, totalRevenueInCents,
                    productPriceInCents, productVersionNumber, currentPeriodEndsAt,
                    nextAssessmentAt, trialStartedAt, trialEndedAt, activatedAt, expiresAt,
                    createdAt, updatedAt, cancellationMessage, cancellationMethod,
                    cancelAtEndOfPeriod, canceledAt, currentPeriodStartedAt, previousState,
                    signupPaymentId, signupRevenue, delayedCancelAt, couponCode, snapDay,
                    paymentCollectionMethod, customer, product, creditCard, group, bankAccount,
                    paymentType, referralCode, nextProductId, nextProductHandle, couponUseCount,
                    couponUsesAllowed, reasonCode, automaticallyResumeAt, couponCodes, offerId,
                    payerId, currentBillingAmountInCents, productPricePointId,
                    productPricePointType, nextProductPricePointId, netTerms,
                    storedCredentialTransactionId, reference, onHoldAt, prepaidDunning, coupons,
                    dunningCommunicationDelayEnabled, dunningCommunicationDelayTimeZone,
                    receivesInvoiceEmails, locale, currency, scheduledCancellationAt,
                    creditBalanceInCents, prepaymentBalanceInCents);
        }
    }
}
