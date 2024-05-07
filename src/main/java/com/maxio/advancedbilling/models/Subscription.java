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
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * This is a model class for Subscription type.
 */
public class Subscription
        extends BaseModel {
    private Integer id;
    private SubscriptionState state;
    private Long balanceInCents;
    private Long totalRevenueInCents;
    private Long productPriceInCents;
    private Integer productVersionNumber;
    private OptionalNullable<ZonedDateTime> currentPeriodEndsAt;
    private OptionalNullable<ZonedDateTime> nextAssessmentAt;
    private OptionalNullable<ZonedDateTime> trialStartedAt;
    private OptionalNullable<ZonedDateTime> trialEndedAt;
    private OptionalNullable<ZonedDateTime> activatedAt;
    private OptionalNullable<ZonedDateTime> expiresAt;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
    private OptionalNullable<String> cancellationMessage;
    private OptionalNullable<CancellationMethod> cancellationMethod;
    private OptionalNullable<Boolean> cancelAtEndOfPeriod;
    private OptionalNullable<ZonedDateTime> canceledAt;
    private OptionalNullable<ZonedDateTime> currentPeriodStartedAt;
    private SubscriptionState previousState;
    private Integer signupPaymentId;
    private String signupRevenue;
    private OptionalNullable<ZonedDateTime> delayedCancelAt;
    private OptionalNullable<String> couponCode;
    private OptionalNullable<String> snapDay;
    private CollectionMethod paymentCollectionMethod;
    private Customer customer;
    private Product product;
    private CreditCardPaymentProfile creditCard;
    private OptionalNullable<NestedSubscriptionGroup> group;
    private BankAccountPaymentProfile bankAccount;
    private OptionalNullable<String> paymentType;
    private OptionalNullable<String> referralCode;
    private OptionalNullable<Integer> nextProductId;
    private OptionalNullable<String> nextProductHandle;
    private OptionalNullable<Integer> couponUseCount;
    private OptionalNullable<Integer> couponUsesAllowed;
    private OptionalNullable<String> reasonCode;
    private OptionalNullable<ZonedDateTime> automaticallyResumeAt;
    private List<String> couponCodes;
    private OptionalNullable<Integer> offerId;
    private OptionalNullable<Integer> payerId;
    private Long currentBillingAmountInCents;
    private Integer productPricePointId;
    private PricePointType productPricePointType;
    private OptionalNullable<Integer> nextProductPricePointId;
    private OptionalNullable<Integer> netTerms;
    private OptionalNullable<Integer> storedCredentialTransactionId;
    private OptionalNullable<String> reference;
    private OptionalNullable<ZonedDateTime> onHoldAt;
    private Boolean prepaidDunning;
    private List<SubscriptionIncludedCoupon> coupons;
    private Boolean dunningCommunicationDelayEnabled;
    private OptionalNullable<String> dunningCommunicationDelayTimeZone;
    private OptionalNullable<Boolean> receivesInvoiceEmails;
    private OptionalNullable<String> locale;
    private String currency;
    private OptionalNullable<ZonedDateTime> scheduledCancellationAt;
    private Long creditBalanceInCents;
    private Long prepaymentBalanceInCents;
    private OptionalNullable<PrepaidConfiguration> prepaidConfiguration;
    private String selfServicePageToken;

    /**
     * Default constructor.
     */
    public Subscription() {
        paymentCollectionMethod = CollectionMethod.AUTOMATIC;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  state  SubscriptionState value for state.
     * @param  balanceInCents  Long value for balanceInCents.
     * @param  totalRevenueInCents  Long value for totalRevenueInCents.
     * @param  productPriceInCents  Long value for productPriceInCents.
     * @param  productVersionNumber  Integer value for productVersionNumber.
     * @param  currentPeriodEndsAt  ZonedDateTime value for currentPeriodEndsAt.
     * @param  nextAssessmentAt  ZonedDateTime value for nextAssessmentAt.
     * @param  trialStartedAt  ZonedDateTime value for trialStartedAt.
     * @param  trialEndedAt  ZonedDateTime value for trialEndedAt.
     * @param  activatedAt  ZonedDateTime value for activatedAt.
     * @param  expiresAt  ZonedDateTime value for expiresAt.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     * @param  cancellationMessage  String value for cancellationMessage.
     * @param  cancellationMethod  CancellationMethod value for cancellationMethod.
     * @param  cancelAtEndOfPeriod  Boolean value for cancelAtEndOfPeriod.
     * @param  canceledAt  ZonedDateTime value for canceledAt.
     * @param  currentPeriodStartedAt  ZonedDateTime value for currentPeriodStartedAt.
     * @param  previousState  SubscriptionState value for previousState.
     * @param  signupPaymentId  Integer value for signupPaymentId.
     * @param  signupRevenue  String value for signupRevenue.
     * @param  delayedCancelAt  ZonedDateTime value for delayedCancelAt.
     * @param  couponCode  String value for couponCode.
     * @param  snapDay  String value for snapDay.
     * @param  paymentCollectionMethod  CollectionMethod value for paymentCollectionMethod.
     * @param  customer  Customer value for customer.
     * @param  product  Product value for product.
     * @param  creditCard  CreditCardPaymentProfile value for creditCard.
     * @param  group  NestedSubscriptionGroup value for group.
     * @param  bankAccount  BankAccountPaymentProfile value for bankAccount.
     * @param  paymentType  String value for paymentType.
     * @param  referralCode  String value for referralCode.
     * @param  nextProductId  Integer value for nextProductId.
     * @param  nextProductHandle  String value for nextProductHandle.
     * @param  couponUseCount  Integer value for couponUseCount.
     * @param  couponUsesAllowed  Integer value for couponUsesAllowed.
     * @param  reasonCode  String value for reasonCode.
     * @param  automaticallyResumeAt  ZonedDateTime value for automaticallyResumeAt.
     * @param  couponCodes  List of String value for couponCodes.
     * @param  offerId  Integer value for offerId.
     * @param  payerId  Integer value for payerId.
     * @param  currentBillingAmountInCents  Long value for currentBillingAmountInCents.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  productPricePointType  PricePointType value for productPricePointType.
     * @param  nextProductPricePointId  Integer value for nextProductPricePointId.
     * @param  netTerms  Integer value for netTerms.
     * @param  storedCredentialTransactionId  Integer value for storedCredentialTransactionId.
     * @param  reference  String value for reference.
     * @param  onHoldAt  ZonedDateTime value for onHoldAt.
     * @param  prepaidDunning  Boolean value for prepaidDunning.
     * @param  coupons  List of SubscriptionIncludedCoupon value for coupons.
     * @param  dunningCommunicationDelayEnabled  Boolean value for dunningCommunicationDelayEnabled.
     * @param  dunningCommunicationDelayTimeZone  String value for
     *         dunningCommunicationDelayTimeZone.
     * @param  receivesInvoiceEmails  Boolean value for receivesInvoiceEmails.
     * @param  locale  String value for locale.
     * @param  currency  String value for currency.
     * @param  scheduledCancellationAt  ZonedDateTime value for scheduledCancellationAt.
     * @param  creditBalanceInCents  Long value for creditBalanceInCents.
     * @param  prepaymentBalanceInCents  Long value for prepaymentBalanceInCents.
     * @param  prepaidConfiguration  PrepaidConfiguration value for prepaidConfiguration.
     * @param  selfServicePageToken  String value for selfServicePageToken.
     */
    public Subscription(
            Integer id,
            SubscriptionState state,
            Long balanceInCents,
            Long totalRevenueInCents,
            Long productPriceInCents,
            Integer productVersionNumber,
            ZonedDateTime currentPeriodEndsAt,
            ZonedDateTime nextAssessmentAt,
            ZonedDateTime trialStartedAt,
            ZonedDateTime trialEndedAt,
            ZonedDateTime activatedAt,
            ZonedDateTime expiresAt,
            ZonedDateTime createdAt,
            ZonedDateTime updatedAt,
            String cancellationMessage,
            CancellationMethod cancellationMethod,
            Boolean cancelAtEndOfPeriod,
            ZonedDateTime canceledAt,
            ZonedDateTime currentPeriodStartedAt,
            SubscriptionState previousState,
            Integer signupPaymentId,
            String signupRevenue,
            ZonedDateTime delayedCancelAt,
            String couponCode,
            String snapDay,
            CollectionMethod paymentCollectionMethod,
            Customer customer,
            Product product,
            CreditCardPaymentProfile creditCard,
            NestedSubscriptionGroup group,
            BankAccountPaymentProfile bankAccount,
            String paymentType,
            String referralCode,
            Integer nextProductId,
            String nextProductHandle,
            Integer couponUseCount,
            Integer couponUsesAllowed,
            String reasonCode,
            ZonedDateTime automaticallyResumeAt,
            List<String> couponCodes,
            Integer offerId,
            Integer payerId,
            Long currentBillingAmountInCents,
            Integer productPricePointId,
            PricePointType productPricePointType,
            Integer nextProductPricePointId,
            Integer netTerms,
            Integer storedCredentialTransactionId,
            String reference,
            ZonedDateTime onHoldAt,
            Boolean prepaidDunning,
            List<SubscriptionIncludedCoupon> coupons,
            Boolean dunningCommunicationDelayEnabled,
            String dunningCommunicationDelayTimeZone,
            Boolean receivesInvoiceEmails,
            String locale,
            String currency,
            ZonedDateTime scheduledCancellationAt,
            Long creditBalanceInCents,
            Long prepaymentBalanceInCents,
            PrepaidConfiguration prepaidConfiguration,
            String selfServicePageToken) {
        this.id = id;
        this.state = state;
        this.balanceInCents = balanceInCents;
        this.totalRevenueInCents = totalRevenueInCents;
        this.productPriceInCents = productPriceInCents;
        this.productVersionNumber = productVersionNumber;
        this.currentPeriodEndsAt = OptionalNullable.of(currentPeriodEndsAt);
        this.nextAssessmentAt = OptionalNullable.of(nextAssessmentAt);
        this.trialStartedAt = OptionalNullable.of(trialStartedAt);
        this.trialEndedAt = OptionalNullable.of(trialEndedAt);
        this.activatedAt = OptionalNullable.of(activatedAt);
        this.expiresAt = OptionalNullable.of(expiresAt);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.cancellationMessage = OptionalNullable.of(cancellationMessage);
        this.cancellationMethod = OptionalNullable.of(cancellationMethod);
        this.cancelAtEndOfPeriod = OptionalNullable.of(cancelAtEndOfPeriod);
        this.canceledAt = OptionalNullable.of(canceledAt);
        this.currentPeriodStartedAt = OptionalNullable.of(currentPeriodStartedAt);
        this.previousState = previousState;
        this.signupPaymentId = signupPaymentId;
        this.signupRevenue = signupRevenue;
        this.delayedCancelAt = OptionalNullable.of(delayedCancelAt);
        this.couponCode = OptionalNullable.of(couponCode);
        this.snapDay = OptionalNullable.of(snapDay);
        this.paymentCollectionMethod = paymentCollectionMethod;
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
        this.payerId = OptionalNullable.of(payerId);
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
        this.prepaidConfiguration = OptionalNullable.of(prepaidConfiguration);
        this.selfServicePageToken = selfServicePageToken;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  state  SubscriptionState value for state.
     * @param  balanceInCents  Long value for balanceInCents.
     * @param  totalRevenueInCents  Long value for totalRevenueInCents.
     * @param  productPriceInCents  Long value for productPriceInCents.
     * @param  productVersionNumber  Integer value for productVersionNumber.
     * @param  currentPeriodEndsAt  ZonedDateTime value for currentPeriodEndsAt.
     * @param  nextAssessmentAt  ZonedDateTime value for nextAssessmentAt.
     * @param  trialStartedAt  ZonedDateTime value for trialStartedAt.
     * @param  trialEndedAt  ZonedDateTime value for trialEndedAt.
     * @param  activatedAt  ZonedDateTime value for activatedAt.
     * @param  expiresAt  ZonedDateTime value for expiresAt.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     * @param  cancellationMessage  String value for cancellationMessage.
     * @param  cancellationMethod  CancellationMethod value for cancellationMethod.
     * @param  cancelAtEndOfPeriod  Boolean value for cancelAtEndOfPeriod.
     * @param  canceledAt  ZonedDateTime value for canceledAt.
     * @param  currentPeriodStartedAt  ZonedDateTime value for currentPeriodStartedAt.
     * @param  previousState  SubscriptionState value for previousState.
     * @param  signupPaymentId  Integer value for signupPaymentId.
     * @param  signupRevenue  String value for signupRevenue.
     * @param  delayedCancelAt  ZonedDateTime value for delayedCancelAt.
     * @param  couponCode  String value for couponCode.
     * @param  snapDay  String value for snapDay.
     * @param  paymentCollectionMethod  CollectionMethod value for paymentCollectionMethod.
     * @param  customer  Customer value for customer.
     * @param  product  Product value for product.
     * @param  creditCard  CreditCardPaymentProfile value for creditCard.
     * @param  group  NestedSubscriptionGroup value for group.
     * @param  bankAccount  BankAccountPaymentProfile value for bankAccount.
     * @param  paymentType  String value for paymentType.
     * @param  referralCode  String value for referralCode.
     * @param  nextProductId  Integer value for nextProductId.
     * @param  nextProductHandle  String value for nextProductHandle.
     * @param  couponUseCount  Integer value for couponUseCount.
     * @param  couponUsesAllowed  Integer value for couponUsesAllowed.
     * @param  reasonCode  String value for reasonCode.
     * @param  automaticallyResumeAt  ZonedDateTime value for automaticallyResumeAt.
     * @param  couponCodes  List of String value for couponCodes.
     * @param  offerId  Integer value for offerId.
     * @param  payerId  Integer value for payerId.
     * @param  currentBillingAmountInCents  Long value for currentBillingAmountInCents.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  productPricePointType  PricePointType value for productPricePointType.
     * @param  nextProductPricePointId  Integer value for nextProductPricePointId.
     * @param  netTerms  Integer value for netTerms.
     * @param  storedCredentialTransactionId  Integer value for storedCredentialTransactionId.
     * @param  reference  String value for reference.
     * @param  onHoldAt  ZonedDateTime value for onHoldAt.
     * @param  prepaidDunning  Boolean value for prepaidDunning.
     * @param  coupons  List of SubscriptionIncludedCoupon value for coupons.
     * @param  dunningCommunicationDelayEnabled  Boolean value for dunningCommunicationDelayEnabled.
     * @param  dunningCommunicationDelayTimeZone  String value for
     *         dunningCommunicationDelayTimeZone.
     * @param  receivesInvoiceEmails  Boolean value for receivesInvoiceEmails.
     * @param  locale  String value for locale.
     * @param  currency  String value for currency.
     * @param  scheduledCancellationAt  ZonedDateTime value for scheduledCancellationAt.
     * @param  creditBalanceInCents  Long value for creditBalanceInCents.
     * @param  prepaymentBalanceInCents  Long value for prepaymentBalanceInCents.
     * @param  prepaidConfiguration  PrepaidConfiguration value for prepaidConfiguration.
     * @param  selfServicePageToken  String value for selfServicePageToken.
     */

    protected Subscription(Integer id, SubscriptionState state, Long balanceInCents,
            Long totalRevenueInCents, Long productPriceInCents, Integer productVersionNumber,
            OptionalNullable<ZonedDateTime> currentPeriodEndsAt,
            OptionalNullable<ZonedDateTime> nextAssessmentAt,
            OptionalNullable<ZonedDateTime> trialStartedAt,
            OptionalNullable<ZonedDateTime> trialEndedAt,
            OptionalNullable<ZonedDateTime> activatedAt, OptionalNullable<ZonedDateTime> expiresAt,
            ZonedDateTime createdAt, ZonedDateTime updatedAt,
            OptionalNullable<String> cancellationMessage,
            OptionalNullable<CancellationMethod> cancellationMethod,
            OptionalNullable<Boolean> cancelAtEndOfPeriod,
            OptionalNullable<ZonedDateTime> canceledAt,
            OptionalNullable<ZonedDateTime> currentPeriodStartedAt, SubscriptionState previousState,
            Integer signupPaymentId, String signupRevenue,
            OptionalNullable<ZonedDateTime> delayedCancelAt, OptionalNullable<String> couponCode,
            OptionalNullable<String> snapDay, CollectionMethod paymentCollectionMethod,
            Customer customer, Product product, CreditCardPaymentProfile creditCard,
            OptionalNullable<NestedSubscriptionGroup> group, BankAccountPaymentProfile bankAccount,
            OptionalNullable<String> paymentType, OptionalNullable<String> referralCode,
            OptionalNullable<Integer> nextProductId, OptionalNullable<String> nextProductHandle,
            OptionalNullable<Integer> couponUseCount, OptionalNullable<Integer> couponUsesAllowed,
            OptionalNullable<String> reasonCode,
            OptionalNullable<ZonedDateTime> automaticallyResumeAt, List<String> couponCodes,
            OptionalNullable<Integer> offerId, OptionalNullable<Integer> payerId,
            Long currentBillingAmountInCents, Integer productPricePointId,
            PricePointType productPricePointType, OptionalNullable<Integer> nextProductPricePointId,
            OptionalNullable<Integer> netTerms,
            OptionalNullable<Integer> storedCredentialTransactionId,
            OptionalNullable<String> reference, OptionalNullable<ZonedDateTime> onHoldAt,
            Boolean prepaidDunning, List<SubscriptionIncludedCoupon> coupons,
            Boolean dunningCommunicationDelayEnabled,
            OptionalNullable<String> dunningCommunicationDelayTimeZone,
            OptionalNullable<Boolean> receivesInvoiceEmails, OptionalNullable<String> locale,
            String currency, OptionalNullable<ZonedDateTime> scheduledCancellationAt,
            Long creditBalanceInCents, Long prepaymentBalanceInCents,
            OptionalNullable<PrepaidConfiguration> prepaidConfiguration,
            String selfServicePageToken) {
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
        this.prepaidConfiguration = prepaidConfiguration;
        this.selfServicePageToken = selfServicePageToken;
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
     * The state of a subscription. * **Live States** * `active` - A normal, active subscription. It
     * is not in a trial and is paid and up to date. * `assessing` - An internal (transient) state
     * that indicates a subscription is in the middle of periodic assessment. Do not base any access
     * decisions in your app on this state, as it may not always be exposed. * `pending` - An
     * internal (transient) state that indicates a subscription is in the creation process. Do not
     * base any access decisions in your app on this state, as it may not always be exposed. *
     * `trialing` - A subscription in trialing state has a valid trial subscription. This type of
     * subscription may transition to active once payment is received when the trial has ended.
     * Otherwise, it may go to a Problem or End of Life state. * `paused` - An internal state that
     * indicates that your account with Advanced Billing is in arrears. * **Problem States** *
     * `past_due` - Indicates that the most recent payment has failed, and payment is past due for
     * this subscription. If you have enabled our automated dunning, this subscription will be in
     * the dunning process (additional status and callbacks from the dunning process will be
     * available in the future). If you are handling dunning and payment updates yourself, you will
     * want to use this state to initiate a payment update from your customers. * `soft_failure` -
     * Indicates that normal assessment/processing of the subscription has failed for a reason that
     * cannot be fixed by the Customer. For example, a Soft Fail may result from a timeout at the
     * gateway or incorrect credentials on your part. The subscriptions should be retried
     * automatically. An interface is being built for you to review problems resulting from these
     * events to take manual action when needed. * `unpaid` - Indicates an unpaid subscription. A
     * subscription is marked unpaid if the retry period expires and you have configured your
     * [Dunning](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405505141005) settings to
     * have a Final Action of `mark the subscription unpaid`. * **End of Life States** * `canceled`
     * - Indicates a canceled subscription. This may happen at your request (via the API or the web
     * interface) or due to the expiration of the
     * [Dunning](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405505141005) process without
     * payment. See the
     * [Reactivation](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404559291021)
     * documentation for info on how to restart a canceled subscription. While a subscription is
     * canceled, its period will not advance, it will not accrue any new charges, and Advanced
     * Billing will not attempt to collect the overdue balance. * `expired` - Indicates a
     * subscription that has expired due to running its normal life cycle. Some products may be
     * configured to have an expiration period. An expired subscription then is one that stayed
     * active until it fulfilled its full period. * `failed_to_create` - Indicates that signup has
     * failed. (You may see this state in a signup_failure webhook.) * `on_hold` - Indicates that a
     * subscription’s billing has been temporarily stopped. While it is expected that the
     * subscription will resume and return to active status, this is still treated as an “End of
     * Life” state because the customer is not paying for services during this time. * `suspended` -
     * Indicates that a prepaid subscription has used up all their prepayment balance. If a
     * prepayment is applied, it will return to an active state. * `trial_ended` - A subscription in
     * a trial_ended state is a subscription that completed a no-obligation trial and did not have a
     * card on file at the expiration of the trial period. See [Product Pricing – No Obligation
     * Trials](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405246782221) for more details.
     * See [Subscription States](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404222005773)
     * for more info about subscription states and state transitions.
     * @return Returns the SubscriptionState
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionState getState() {
        return state;
    }

    /**
     * Setter for State.
     * The state of a subscription. * **Live States** * `active` - A normal, active subscription. It
     * is not in a trial and is paid and up to date. * `assessing` - An internal (transient) state
     * that indicates a subscription is in the middle of periodic assessment. Do not base any access
     * decisions in your app on this state, as it may not always be exposed. * `pending` - An
     * internal (transient) state that indicates a subscription is in the creation process. Do not
     * base any access decisions in your app on this state, as it may not always be exposed. *
     * `trialing` - A subscription in trialing state has a valid trial subscription. This type of
     * subscription may transition to active once payment is received when the trial has ended.
     * Otherwise, it may go to a Problem or End of Life state. * `paused` - An internal state that
     * indicates that your account with Advanced Billing is in arrears. * **Problem States** *
     * `past_due` - Indicates that the most recent payment has failed, and payment is past due for
     * this subscription. If you have enabled our automated dunning, this subscription will be in
     * the dunning process (additional status and callbacks from the dunning process will be
     * available in the future). If you are handling dunning and payment updates yourself, you will
     * want to use this state to initiate a payment update from your customers. * `soft_failure` -
     * Indicates that normal assessment/processing of the subscription has failed for a reason that
     * cannot be fixed by the Customer. For example, a Soft Fail may result from a timeout at the
     * gateway or incorrect credentials on your part. The subscriptions should be retried
     * automatically. An interface is being built for you to review problems resulting from these
     * events to take manual action when needed. * `unpaid` - Indicates an unpaid subscription. A
     * subscription is marked unpaid if the retry period expires and you have configured your
     * [Dunning](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405505141005) settings to
     * have a Final Action of `mark the subscription unpaid`. * **End of Life States** * `canceled`
     * - Indicates a canceled subscription. This may happen at your request (via the API or the web
     * interface) or due to the expiration of the
     * [Dunning](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405505141005) process without
     * payment. See the
     * [Reactivation](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404559291021)
     * documentation for info on how to restart a canceled subscription. While a subscription is
     * canceled, its period will not advance, it will not accrue any new charges, and Advanced
     * Billing will not attempt to collect the overdue balance. * `expired` - Indicates a
     * subscription that has expired due to running its normal life cycle. Some products may be
     * configured to have an expiration period. An expired subscription then is one that stayed
     * active until it fulfilled its full period. * `failed_to_create` - Indicates that signup has
     * failed. (You may see this state in a signup_failure webhook.) * `on_hold` - Indicates that a
     * subscription’s billing has been temporarily stopped. While it is expected that the
     * subscription will resume and return to active status, this is still treated as an “End of
     * Life” state because the customer is not paying for services during this time. * `suspended` -
     * Indicates that a prepaid subscription has used up all their prepayment balance. If a
     * prepayment is applied, it will return to an active state. * `trial_ended` - A subscription in
     * a trial_ended state is a subscription that completed a no-obligation trial and did not have a
     * card on file at the expiration of the trial period. See [Product Pricing – No Obligation
     * Trials](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405246782221) for more details.
     * See [Subscription States](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404222005773)
     * for more info about subscription states and state transitions.
     * @param state Value for SubscriptionState
     */
    @JsonSetter("state")
    public void setState(SubscriptionState state) {
        this.state = state;
    }

    /**
     * Getter for BalanceInCents.
     * Gives the current outstanding subscription balance in the number of cents.
     * @return Returns the Long
     */
    @JsonGetter("balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getBalanceInCents() {
        return balanceInCents;
    }

    /**
     * Setter for BalanceInCents.
     * Gives the current outstanding subscription balance in the number of cents.
     * @param balanceInCents Value for Long
     */
    @JsonSetter("balance_in_cents")
    public void setBalanceInCents(Long balanceInCents) {
        this.balanceInCents = balanceInCents;
    }

    /**
     * Getter for TotalRevenueInCents.
     * Gives the total revenue from the subscription in the number of cents.
     * @return Returns the Long
     */
    @JsonGetter("total_revenue_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getTotalRevenueInCents() {
        return totalRevenueInCents;
    }

    /**
     * Setter for TotalRevenueInCents.
     * Gives the total revenue from the subscription in the number of cents.
     * @param totalRevenueInCents Value for Long
     */
    @JsonSetter("total_revenue_in_cents")
    public void setTotalRevenueInCents(Long totalRevenueInCents) {
        this.totalRevenueInCents = totalRevenueInCents;
    }

    /**
     * Getter for ProductPriceInCents.
     * (Added Nov 5 2013) The recurring amount of the product (and version),currently subscribed.
     * NOTE: this may differ from the current price of,the product, if you’ve changed the price of
     * the product but haven’t,moved this subscription to a newer version.
     * @return Returns the Long
     */
    @JsonGetter("product_price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getProductPriceInCents() {
        return productPriceInCents;
    }

    /**
     * Setter for ProductPriceInCents.
     * (Added Nov 5 2013) The recurring amount of the product (and version),currently subscribed.
     * NOTE: this may differ from the current price of,the product, if you’ve changed the price of
     * the product but haven’t,moved this subscription to a newer version.
     * @param productPriceInCents Value for Long
     */
    @JsonSetter("product_price_in_cents")
    public void setProductPriceInCents(Long productPriceInCents) {
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
     * Internal Getter for CurrentPeriodEndsAt.
     * Timestamp relating to the end of the current (recurring) period (i.e.,when the next regularly
     * scheduled attempted charge will occur)
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("current_period_ends_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetCurrentPeriodEndsAt() {
        return this.currentPeriodEndsAt;
    }

    /**
     * Getter for CurrentPeriodEndsAt.
     * Timestamp relating to the end of the current (recurring) period (i.e.,when the next regularly
     * scheduled attempted charge will occur)
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getCurrentPeriodEndsAt() {
        return OptionalNullable.getFrom(currentPeriodEndsAt);
    }

    /**
     * Setter for CurrentPeriodEndsAt.
     * Timestamp relating to the end of the current (recurring) period (i.e.,when the next regularly
     * scheduled attempted charge will occur)
     * @param currentPeriodEndsAt Value for ZonedDateTime
     */
    @JsonSetter("current_period_ends_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCurrentPeriodEndsAt(ZonedDateTime currentPeriodEndsAt) {
        this.currentPeriodEndsAt = OptionalNullable.of(currentPeriodEndsAt);
    }

    /**
     * UnSetter for CurrentPeriodEndsAt.
     * Timestamp relating to the end of the current (recurring) period (i.e.,when the next regularly
     * scheduled attempted charge will occur)
     */
    public void unsetCurrentPeriodEndsAt() {
        currentPeriodEndsAt = null;
    }

    /**
     * Internal Getter for NextAssessmentAt.
     * Timestamp that indicates when capture of payment will be tried or,retried. This value will
     * usually track the current_period_ends_at, but,will diverge if a renewal payment fails and
     * must be retried. In that,case, the current_period_ends_at will advance to the end of the
     * next,period (time doesn’t stop because a payment was missed) but the,next_assessment_at will
     * be scheduled for the auto-retry time (i.e. 24,hours in the future, in some cases)
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("next_assessment_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetNextAssessmentAt() {
        return this.nextAssessmentAt;
    }

    /**
     * Getter for NextAssessmentAt.
     * Timestamp that indicates when capture of payment will be tried or,retried. This value will
     * usually track the current_period_ends_at, but,will diverge if a renewal payment fails and
     * must be retried. In that,case, the current_period_ends_at will advance to the end of the
     * next,period (time doesn’t stop because a payment was missed) but the,next_assessment_at will
     * be scheduled for the auto-retry time (i.e. 24,hours in the future, in some cases)
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getNextAssessmentAt() {
        return OptionalNullable.getFrom(nextAssessmentAt);
    }

    /**
     * Setter for NextAssessmentAt.
     * Timestamp that indicates when capture of payment will be tried or,retried. This value will
     * usually track the current_period_ends_at, but,will diverge if a renewal payment fails and
     * must be retried. In that,case, the current_period_ends_at will advance to the end of the
     * next,period (time doesn’t stop because a payment was missed) but the,next_assessment_at will
     * be scheduled for the auto-retry time (i.e. 24,hours in the future, in some cases)
     * @param nextAssessmentAt Value for ZonedDateTime
     */
    @JsonSetter("next_assessment_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setNextAssessmentAt(ZonedDateTime nextAssessmentAt) {
        this.nextAssessmentAt = OptionalNullable.of(nextAssessmentAt);
    }

    /**
     * UnSetter for NextAssessmentAt.
     * Timestamp that indicates when capture of payment will be tried or,retried. This value will
     * usually track the current_period_ends_at, but,will diverge if a renewal payment fails and
     * must be retried. In that,case, the current_period_ends_at will advance to the end of the
     * next,period (time doesn’t stop because a payment was missed) but the,next_assessment_at will
     * be scheduled for the auto-retry time (i.e. 24,hours in the future, in some cases)
     */
    public void unsetNextAssessmentAt() {
        nextAssessmentAt = null;
    }

    /**
     * Internal Getter for TrialStartedAt.
     * Timestamp for when the trial period (if any) began
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("trial_started_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetTrialStartedAt() {
        return this.trialStartedAt;
    }

    /**
     * Getter for TrialStartedAt.
     * Timestamp for when the trial period (if any) began
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getTrialStartedAt() {
        return OptionalNullable.getFrom(trialStartedAt);
    }

    /**
     * Setter for TrialStartedAt.
     * Timestamp for when the trial period (if any) began
     * @param trialStartedAt Value for ZonedDateTime
     */
    @JsonSetter("trial_started_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTrialStartedAt(ZonedDateTime trialStartedAt) {
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
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("trial_ended_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetTrialEndedAt() {
        return this.trialEndedAt;
    }

    /**
     * Getter for TrialEndedAt.
     * Timestamp for when the trial period (if any) ended
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getTrialEndedAt() {
        return OptionalNullable.getFrom(trialEndedAt);
    }

    /**
     * Setter for TrialEndedAt.
     * Timestamp for when the trial period (if any) ended
     * @param trialEndedAt Value for ZonedDateTime
     */
    @JsonSetter("trial_ended_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTrialEndedAt(ZonedDateTime trialEndedAt) {
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
     * Internal Getter for ActivatedAt.
     * Timestamp for when the subscription began (i.e. when it came out of trial, or when it began
     * in the case of no trial)
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("activated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetActivatedAt() {
        return this.activatedAt;
    }

    /**
     * Getter for ActivatedAt.
     * Timestamp for when the subscription began (i.e. when it came out of trial, or when it began
     * in the case of no trial)
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getActivatedAt() {
        return OptionalNullable.getFrom(activatedAt);
    }

    /**
     * Setter for ActivatedAt.
     * Timestamp for when the subscription began (i.e. when it came out of trial, or when it began
     * in the case of no trial)
     * @param activatedAt Value for ZonedDateTime
     */
    @JsonSetter("activated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setActivatedAt(ZonedDateTime activatedAt) {
        this.activatedAt = OptionalNullable.of(activatedAt);
    }

    /**
     * UnSetter for ActivatedAt.
     * Timestamp for when the subscription began (i.e. when it came out of trial, or when it began
     * in the case of no trial)
     */
    public void unsetActivatedAt() {
        activatedAt = null;
    }

    /**
     * Internal Getter for ExpiresAt.
     * Timestamp giving the expiration date of this subscription (if any)
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetExpiresAt() {
        return this.expiresAt;
    }

    /**
     * Getter for ExpiresAt.
     * Timestamp giving the expiration date of this subscription (if any)
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getExpiresAt() {
        return OptionalNullable.getFrom(expiresAt);
    }

    /**
     * Setter for ExpiresAt.
     * Timestamp giving the expiration date of this subscription (if any)
     * @param expiresAt Value for ZonedDateTime
     */
    @JsonSetter("expires_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpiresAt(ZonedDateTime expiresAt) {
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
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * The creation date for this subscription
     * @param createdAt Value for ZonedDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * The date of last update for this subscription
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * The date of last update for this subscription
     * @param updatedAt Value for ZonedDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(ZonedDateTime updatedAt) {
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
     * @return Returns the Internal CancellationMethod
     */
    @JsonGetter("cancellation_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CancellationMethod> internalGetCancellationMethod() {
        return this.cancellationMethod;
    }

    /**
     * Getter for CancellationMethod.
     * The process used to cancel the subscription, if the subscription has been canceled. It is nil
     * if the subscription's state is not canceled.
     * @return Returns the CancellationMethod
     */
    public CancellationMethod getCancellationMethod() {
        return OptionalNullable.getFrom(cancellationMethod);
    }

    /**
     * Setter for CancellationMethod.
     * The process used to cancel the subscription, if the subscription has been canceled. It is nil
     * if the subscription's state is not canceled.
     * @param cancellationMethod Value for CancellationMethod
     */
    @JsonSetter("cancellation_method")
    public void setCancellationMethod(CancellationMethod cancellationMethod) {
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
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("canceled_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetCanceledAt() {
        return this.canceledAt;
    }

    /**
     * Getter for CanceledAt.
     * The timestamp of the most recent cancellation
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getCanceledAt() {
        return OptionalNullable.getFrom(canceledAt);
    }

    /**
     * Setter for CanceledAt.
     * The timestamp of the most recent cancellation
     * @param canceledAt Value for ZonedDateTime
     */
    @JsonSetter("canceled_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCanceledAt(ZonedDateTime canceledAt) {
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
     * Internal Getter for CurrentPeriodStartedAt.
     * Timestamp relating to the start of the current (recurring) period
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("current_period_started_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetCurrentPeriodStartedAt() {
        return this.currentPeriodStartedAt;
    }

    /**
     * Getter for CurrentPeriodStartedAt.
     * Timestamp relating to the start of the current (recurring) period
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getCurrentPeriodStartedAt() {
        return OptionalNullable.getFrom(currentPeriodStartedAt);
    }

    /**
     * Setter for CurrentPeriodStartedAt.
     * Timestamp relating to the start of the current (recurring) period
     * @param currentPeriodStartedAt Value for ZonedDateTime
     */
    @JsonSetter("current_period_started_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCurrentPeriodStartedAt(ZonedDateTime currentPeriodStartedAt) {
        this.currentPeriodStartedAt = OptionalNullable.of(currentPeriodStartedAt);
    }

    /**
     * UnSetter for CurrentPeriodStartedAt.
     * Timestamp relating to the start of the current (recurring) period
     */
    public void unsetCurrentPeriodStartedAt() {
        currentPeriodStartedAt = null;
    }

    /**
     * Getter for PreviousState.
     * Only valid for webhook payloads The previous state for webhooks that have indicated a change
     * in state. For normal API calls, this will always be the same as the state (current state)
     * @return Returns the SubscriptionState
     */
    @JsonGetter("previous_state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionState getPreviousState() {
        return previousState;
    }

    /**
     * Setter for PreviousState.
     * Only valid for webhook payloads The previous state for webhooks that have indicated a change
     * in state. For normal API calls, this will always be the same as the state (current state)
     * @param previousState Value for SubscriptionState
     */
    @JsonSetter("previous_state")
    public void setPreviousState(SubscriptionState previousState) {
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
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("delayed_cancel_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetDelayedCancelAt() {
        return this.delayedCancelAt;
    }

    /**
     * Getter for DelayedCancelAt.
     * Timestamp for when the subscription is currently set to cancel.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getDelayedCancelAt() {
        return OptionalNullable.getFrom(delayedCancelAt);
    }

    /**
     * Setter for DelayedCancelAt.
     * Timestamp for when the subscription is currently set to cancel.
     * @param delayedCancelAt Value for ZonedDateTime
     */
    @JsonSetter("delayed_cancel_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDelayedCancelAt(ZonedDateTime delayedCancelAt) {
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
     * Getter for PaymentCollectionMethod.
     * The type of payment collection to be used in the subscription. For legacy Statements
     * Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing
     * Architecture valid options are - `remittance`, `automatic`, `prepaid`.
     * @return Returns the CollectionMethod
     */
    @JsonGetter("payment_collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CollectionMethod getPaymentCollectionMethod() {
        return paymentCollectionMethod;
    }

    /**
     * Setter for PaymentCollectionMethod.
     * The type of payment collection to be used in the subscription. For legacy Statements
     * Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing
     * Architecture valid options are - `remittance`, `automatic`, `prepaid`.
     * @param paymentCollectionMethod Value for CollectionMethod
     */
    @JsonSetter("payment_collection_method")
    public void setPaymentCollectionMethod(CollectionMethod paymentCollectionMethod) {
        this.paymentCollectionMethod = paymentCollectionMethod;
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
     * @return Returns the CreditCardPaymentProfile
     */
    @JsonGetter("credit_card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreditCardPaymentProfile getCreditCard() {
        return creditCard;
    }

    /**
     * Setter for CreditCard.
     * @param creditCard Value for CreditCardPaymentProfile
     */
    @JsonSetter("credit_card")
    public void setCreditCard(CreditCardPaymentProfile creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * Internal Getter for Group.
     * @return Returns the Internal NestedSubscriptionGroup
     */
    @JsonGetter("group")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<NestedSubscriptionGroup> internalGetGroup() {
        return this.group;
    }

    /**
     * Getter for Group.
     * @return Returns the NestedSubscriptionGroup
     */
    public NestedSubscriptionGroup getGroup() {
        return OptionalNullable.getFrom(group);
    }

    /**
     * Setter for Group.
     * @param group Value for NestedSubscriptionGroup
     */
    @JsonSetter("group")
    public void setGroup(NestedSubscriptionGroup group) {
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
     * @return Returns the BankAccountPaymentProfile
     */
    @JsonGetter("bank_account")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankAccountPaymentProfile getBankAccount() {
        return bankAccount;
    }

    /**
     * Setter for BankAccount.
     * @param bankAccount Value for BankAccountPaymentProfile
     */
    @JsonSetter("bank_account")
    public void setBankAccount(BankAccountPaymentProfile bankAccount) {
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
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("automatically_resume_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetAutomaticallyResumeAt() {
        return this.automaticallyResumeAt;
    }

    /**
     * Getter for AutomaticallyResumeAt.
     * The date the subscription is scheduled to automatically resume from the on_hold state.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getAutomaticallyResumeAt() {
        return OptionalNullable.getFrom(automaticallyResumeAt);
    }

    /**
     * Setter for AutomaticallyResumeAt.
     * The date the subscription is scheduled to automatically resume from the on_hold state.
     * @param automaticallyResumeAt Value for ZonedDateTime
     */
    @JsonSetter("automatically_resume_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setAutomaticallyResumeAt(ZonedDateTime automaticallyResumeAt) {
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
     * Internal Getter for PayerId.
     * On Relationship Invoicing, the ID of the individual paying for the subscription. Defaults to
     * the Customer ID unless the 'Customer Hierarchies &amp; WhoPays' feature is enabled.
     * @return Returns the Internal Integer
     */
    @JsonGetter("payer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetPayerId() {
        return this.payerId;
    }

    /**
     * Getter for PayerId.
     * On Relationship Invoicing, the ID of the individual paying for the subscription. Defaults to
     * the Customer ID unless the 'Customer Hierarchies &amp; WhoPays' feature is enabled.
     * @return Returns the Integer
     */
    public Integer getPayerId() {
        return OptionalNullable.getFrom(payerId);
    }

    /**
     * Setter for PayerId.
     * On Relationship Invoicing, the ID of the individual paying for the subscription. Defaults to
     * the Customer ID unless the 'Customer Hierarchies &amp; WhoPays' feature is enabled.
     * @param payerId Value for Integer
     */
    @JsonSetter("payer_id")
    public void setPayerId(Integer payerId) {
        this.payerId = OptionalNullable.of(payerId);
    }

    /**
     * UnSetter for PayerId.
     * On Relationship Invoicing, the ID of the individual paying for the subscription. Defaults to
     * the Customer ID unless the 'Customer Hierarchies &amp; WhoPays' feature is enabled.
     */
    public void unsetPayerId() {
        payerId = null;
    }

    /**
     * Getter for CurrentBillingAmountInCents.
     * The balance in cents plus the estimated renewal amount in cents. Returned ONLY for
     * readSubscription operation as it's compute intensive operation.
     * @return Returns the Long
     */
    @JsonGetter("current_billing_amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getCurrentBillingAmountInCents() {
        return currentBillingAmountInCents;
    }

    /**
     * Setter for CurrentBillingAmountInCents.
     * The balance in cents plus the estimated renewal amount in cents. Returned ONLY for
     * readSubscription operation as it's compute intensive operation.
     * @param currentBillingAmountInCents Value for Long
     */
    @JsonSetter("current_billing_amount_in_cents")
    public void setCurrentBillingAmountInCents(Long currentBillingAmountInCents) {
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
     * Price point type. We expose the following types: 1. **default**: a price point that is marked
     * as a default price for a certain product. 2. **custom**: a custom price point. 3.
     * **catalog**: a price point that is **not** marked as a default price for a certain product
     * and is **not** a custom one.
     * @return Returns the PricePointType
     */
    @JsonGetter("product_price_point_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PricePointType getProductPricePointType() {
        return productPricePointType;
    }

    /**
     * Setter for ProductPricePointType.
     * Price point type. We expose the following types: 1. **default**: a price point that is marked
     * as a default price for a certain product. 2. **custom**: a custom price point. 3.
     * **catalog**: a price point that is **not** marked as a default price for a certain product
     * and is **not** a custom one.
     * @param productPricePointType Value for PricePointType
     */
    @JsonSetter("product_price_point_type")
    public void setProductPricePointType(PricePointType productPricePointType) {
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
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("on_hold_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetOnHoldAt() {
        return this.onHoldAt;
    }

    /**
     * Getter for OnHoldAt.
     * The timestamp of the most recent on hold action.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getOnHoldAt() {
        return OptionalNullable.getFrom(onHoldAt);
    }

    /**
     * Setter for OnHoldAt.
     * The timestamp of the most recent on hold action.
     * @param onHoldAt Value for ZonedDateTime
     */
    @JsonSetter("on_hold_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setOnHoldAt(ZonedDateTime onHoldAt) {
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
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("scheduled_cancellation_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetScheduledCancellationAt() {
        return this.scheduledCancellationAt;
    }

    /**
     * Getter for ScheduledCancellationAt.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getScheduledCancellationAt() {
        return OptionalNullable.getFrom(scheduledCancellationAt);
    }

    /**
     * Setter for ScheduledCancellationAt.
     * @param scheduledCancellationAt Value for ZonedDateTime
     */
    @JsonSetter("scheduled_cancellation_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setScheduledCancellationAt(ZonedDateTime scheduledCancellationAt) {
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
     * @return Returns the Long
     */
    @JsonGetter("credit_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getCreditBalanceInCents() {
        return creditBalanceInCents;
    }

    /**
     * Setter for CreditBalanceInCents.
     * @param creditBalanceInCents Value for Long
     */
    @JsonSetter("credit_balance_in_cents")
    public void setCreditBalanceInCents(Long creditBalanceInCents) {
        this.creditBalanceInCents = creditBalanceInCents;
    }

    /**
     * Getter for PrepaymentBalanceInCents.
     * @return Returns the Long
     */
    @JsonGetter("prepayment_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getPrepaymentBalanceInCents() {
        return prepaymentBalanceInCents;
    }

    /**
     * Setter for PrepaymentBalanceInCents.
     * @param prepaymentBalanceInCents Value for Long
     */
    @JsonSetter("prepayment_balance_in_cents")
    public void setPrepaymentBalanceInCents(Long prepaymentBalanceInCents) {
        this.prepaymentBalanceInCents = prepaymentBalanceInCents;
    }

    /**
     * Internal Getter for PrepaidConfiguration.
     * @return Returns the Internal PrepaidConfiguration
     */
    @JsonGetter("prepaid_configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<PrepaidConfiguration> internalGetPrepaidConfiguration() {
        return this.prepaidConfiguration;
    }

    /**
     * Getter for PrepaidConfiguration.
     * @return Returns the PrepaidConfiguration
     */
    public PrepaidConfiguration getPrepaidConfiguration() {
        return OptionalNullable.getFrom(prepaidConfiguration);
    }

    /**
     * Setter for PrepaidConfiguration.
     * @param prepaidConfiguration Value for PrepaidConfiguration
     */
    @JsonSetter("prepaid_configuration")
    public void setPrepaidConfiguration(PrepaidConfiguration prepaidConfiguration) {
        this.prepaidConfiguration = OptionalNullable.of(prepaidConfiguration);
    }

    /**
     * UnSetter for PrepaidConfiguration.
     */
    public void unsetPrepaidConfiguration() {
        prepaidConfiguration = null;
    }

    /**
     * Getter for SelfServicePageToken.
     * Returned only for list/read Subscription operation when `include[]=self_service_page_token`
     * parameter is provided.
     * @return Returns the String
     */
    @JsonGetter("self_service_page_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSelfServicePageToken() {
        return selfServicePageToken;
    }

    /**
     * Setter for SelfServicePageToken.
     * Returned only for list/read Subscription operation when `include[]=self_service_page_token`
     * parameter is provided.
     * @param selfServicePageToken Value for String
     */
    @JsonSetter("self_service_page_token")
    public void setSelfServicePageToken(String selfServicePageToken) {
        this.selfServicePageToken = selfServicePageToken;
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
                + prepaymentBalanceInCents + ", prepaidConfiguration=" + prepaidConfiguration
                + ", selfServicePageToken=" + selfServicePageToken + ", additionalProperties="
                + getAdditionalProperties() + "]";
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
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .previousState(getPreviousState())
                .signupPaymentId(getSignupPaymentId())
                .signupRevenue(getSignupRevenue())
                .paymentCollectionMethod(getPaymentCollectionMethod())
                .customer(getCustomer())
                .product(getProduct())
                .creditCard(getCreditCard())
                .bankAccount(getBankAccount())
                .couponCodes(getCouponCodes())
                .currentBillingAmountInCents(getCurrentBillingAmountInCents())
                .productPricePointId(getProductPricePointId())
                .productPricePointType(getProductPricePointType())
                .prepaidDunning(getPrepaidDunning())
                .coupons(getCoupons())
                .dunningCommunicationDelayEnabled(getDunningCommunicationDelayEnabled())
                .currency(getCurrency())
                .creditBalanceInCents(getCreditBalanceInCents())
                .prepaymentBalanceInCents(getPrepaymentBalanceInCents())
                .selfServicePageToken(getSelfServicePageToken());
        builder.currentPeriodEndsAt = internalGetCurrentPeriodEndsAt();
        builder.nextAssessmentAt = internalGetNextAssessmentAt();
        builder.trialStartedAt = internalGetTrialStartedAt();
        builder.trialEndedAt = internalGetTrialEndedAt();
        builder.activatedAt = internalGetActivatedAt();
        builder.expiresAt = internalGetExpiresAt();
        builder.cancellationMessage = internalGetCancellationMessage();
        builder.cancellationMethod = internalGetCancellationMethod();
        builder.cancelAtEndOfPeriod = internalGetCancelAtEndOfPeriod();
        builder.canceledAt = internalGetCanceledAt();
        builder.currentPeriodStartedAt = internalGetCurrentPeriodStartedAt();
        builder.delayedCancelAt = internalGetDelayedCancelAt();
        builder.couponCode = internalGetCouponCode();
        builder.snapDay = internalGetSnapDay();
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
        builder.payerId = internalGetPayerId();
        builder.nextProductPricePointId = internalGetNextProductPricePointId();
        builder.netTerms = internalGetNetTerms();
        builder.storedCredentialTransactionId = internalGetStoredCredentialTransactionId();
        builder.reference = internalGetReference();
        builder.onHoldAt = internalGetOnHoldAt();
        builder.dunningCommunicationDelayTimeZone = internalGetDunningCommunicationDelayTimeZone();
        builder.receivesInvoiceEmails = internalGetReceivesInvoiceEmails();
        builder.locale = internalGetLocale();
        builder.scheduledCancellationAt = internalGetScheduledCancellationAt();
        builder.prepaidConfiguration = internalGetPrepaidConfiguration();
        return builder;
    }

    /**
     * Class to build instances of {@link Subscription}.
     */
    public static class Builder {
        private Integer id;
        private SubscriptionState state;
        private Long balanceInCents;
        private Long totalRevenueInCents;
        private Long productPriceInCents;
        private Integer productVersionNumber;
        private OptionalNullable<ZonedDateTime> currentPeriodEndsAt;
        private OptionalNullable<ZonedDateTime> nextAssessmentAt;
        private OptionalNullable<ZonedDateTime> trialStartedAt;
        private OptionalNullable<ZonedDateTime> trialEndedAt;
        private OptionalNullable<ZonedDateTime> activatedAt;
        private OptionalNullable<ZonedDateTime> expiresAt;
        private ZonedDateTime createdAt;
        private ZonedDateTime updatedAt;
        private OptionalNullable<String> cancellationMessage;
        private OptionalNullable<CancellationMethod> cancellationMethod;
        private OptionalNullable<Boolean> cancelAtEndOfPeriod;
        private OptionalNullable<ZonedDateTime> canceledAt;
        private OptionalNullable<ZonedDateTime> currentPeriodStartedAt;
        private SubscriptionState previousState;
        private Integer signupPaymentId;
        private String signupRevenue;
        private OptionalNullable<ZonedDateTime> delayedCancelAt;
        private OptionalNullable<String> couponCode;
        private OptionalNullable<String> snapDay;
        private CollectionMethod paymentCollectionMethod = CollectionMethod.AUTOMATIC;
        private Customer customer;
        private Product product;
        private CreditCardPaymentProfile creditCard;
        private OptionalNullable<NestedSubscriptionGroup> group;
        private BankAccountPaymentProfile bankAccount;
        private OptionalNullable<String> paymentType;
        private OptionalNullable<String> referralCode;
        private OptionalNullable<Integer> nextProductId;
        private OptionalNullable<String> nextProductHandle;
        private OptionalNullable<Integer> couponUseCount;
        private OptionalNullable<Integer> couponUsesAllowed;
        private OptionalNullable<String> reasonCode;
        private OptionalNullable<ZonedDateTime> automaticallyResumeAt;
        private List<String> couponCodes;
        private OptionalNullable<Integer> offerId;
        private OptionalNullable<Integer> payerId;
        private Long currentBillingAmountInCents;
        private Integer productPricePointId;
        private PricePointType productPricePointType;
        private OptionalNullable<Integer> nextProductPricePointId;
        private OptionalNullable<Integer> netTerms;
        private OptionalNullable<Integer> storedCredentialTransactionId;
        private OptionalNullable<String> reference;
        private OptionalNullable<ZonedDateTime> onHoldAt;
        private Boolean prepaidDunning;
        private List<SubscriptionIncludedCoupon> coupons;
        private Boolean dunningCommunicationDelayEnabled;
        private OptionalNullable<String> dunningCommunicationDelayTimeZone;
        private OptionalNullable<Boolean> receivesInvoiceEmails;
        private OptionalNullable<String> locale;
        private String currency;
        private OptionalNullable<ZonedDateTime> scheduledCancellationAt;
        private Long creditBalanceInCents;
        private Long prepaymentBalanceInCents;
        private OptionalNullable<PrepaidConfiguration> prepaidConfiguration;
        private String selfServicePageToken;



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
         * @param  state  SubscriptionState value for state.
         * @return Builder
         */
        public Builder state(SubscriptionState state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for balanceInCents.
         * @param  balanceInCents  Long value for balanceInCents.
         * @return Builder
         */
        public Builder balanceInCents(Long balanceInCents) {
            this.balanceInCents = balanceInCents;
            return this;
        }

        /**
         * Setter for totalRevenueInCents.
         * @param  totalRevenueInCents  Long value for totalRevenueInCents.
         * @return Builder
         */
        public Builder totalRevenueInCents(Long totalRevenueInCents) {
            this.totalRevenueInCents = totalRevenueInCents;
            return this;
        }

        /**
         * Setter for productPriceInCents.
         * @param  productPriceInCents  Long value for productPriceInCents.
         * @return Builder
         */
        public Builder productPriceInCents(Long productPriceInCents) {
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
         * @param  currentPeriodEndsAt  ZonedDateTime value for currentPeriodEndsAt.
         * @return Builder
         */
        public Builder currentPeriodEndsAt(ZonedDateTime currentPeriodEndsAt) {
            this.currentPeriodEndsAt = OptionalNullable.of(currentPeriodEndsAt);
            return this;
        }

        /**
         * UnSetter for currentPeriodEndsAt.
         * @return Builder
         */
        public Builder unsetCurrentPeriodEndsAt() {
            currentPeriodEndsAt = null;
            return this;
        }

        /**
         * Setter for nextAssessmentAt.
         * @param  nextAssessmentAt  ZonedDateTime value for nextAssessmentAt.
         * @return Builder
         */
        public Builder nextAssessmentAt(ZonedDateTime nextAssessmentAt) {
            this.nextAssessmentAt = OptionalNullable.of(nextAssessmentAt);
            return this;
        }

        /**
         * UnSetter for nextAssessmentAt.
         * @return Builder
         */
        public Builder unsetNextAssessmentAt() {
            nextAssessmentAt = null;
            return this;
        }

        /**
         * Setter for trialStartedAt.
         * @param  trialStartedAt  ZonedDateTime value for trialStartedAt.
         * @return Builder
         */
        public Builder trialStartedAt(ZonedDateTime trialStartedAt) {
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
         * @param  trialEndedAt  ZonedDateTime value for trialEndedAt.
         * @return Builder
         */
        public Builder trialEndedAt(ZonedDateTime trialEndedAt) {
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
         * @param  activatedAt  ZonedDateTime value for activatedAt.
         * @return Builder
         */
        public Builder activatedAt(ZonedDateTime activatedAt) {
            this.activatedAt = OptionalNullable.of(activatedAt);
            return this;
        }

        /**
         * UnSetter for activatedAt.
         * @return Builder
         */
        public Builder unsetActivatedAt() {
            activatedAt = null;
            return this;
        }

        /**
         * Setter for expiresAt.
         * @param  expiresAt  ZonedDateTime value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(ZonedDateTime expiresAt) {
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
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  ZonedDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(ZonedDateTime updatedAt) {
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
         * @param  cancellationMethod  CancellationMethod value for cancellationMethod.
         * @return Builder
         */
        public Builder cancellationMethod(CancellationMethod cancellationMethod) {
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
         * @param  canceledAt  ZonedDateTime value for canceledAt.
         * @return Builder
         */
        public Builder canceledAt(ZonedDateTime canceledAt) {
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
         * @param  currentPeriodStartedAt  ZonedDateTime value for currentPeriodStartedAt.
         * @return Builder
         */
        public Builder currentPeriodStartedAt(ZonedDateTime currentPeriodStartedAt) {
            this.currentPeriodStartedAt = OptionalNullable.of(currentPeriodStartedAt);
            return this;
        }

        /**
         * UnSetter for currentPeriodStartedAt.
         * @return Builder
         */
        public Builder unsetCurrentPeriodStartedAt() {
            currentPeriodStartedAt = null;
            return this;
        }

        /**
         * Setter for previousState.
         * @param  previousState  SubscriptionState value for previousState.
         * @return Builder
         */
        public Builder previousState(SubscriptionState previousState) {
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
         * @param  delayedCancelAt  ZonedDateTime value for delayedCancelAt.
         * @return Builder
         */
        public Builder delayedCancelAt(ZonedDateTime delayedCancelAt) {
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
         * @param  paymentCollectionMethod  CollectionMethod value for paymentCollectionMethod.
         * @return Builder
         */
        public Builder paymentCollectionMethod(CollectionMethod paymentCollectionMethod) {
            this.paymentCollectionMethod = paymentCollectionMethod;
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
         * @param  creditCard  CreditCardPaymentProfile value for creditCard.
         * @return Builder
         */
        public Builder creditCard(CreditCardPaymentProfile creditCard) {
            this.creditCard = creditCard;
            return this;
        }

        /**
         * Setter for group.
         * @param  group  NestedSubscriptionGroup value for group.
         * @return Builder
         */
        public Builder group(NestedSubscriptionGroup group) {
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
         * @param  bankAccount  BankAccountPaymentProfile value for bankAccount.
         * @return Builder
         */
        public Builder bankAccount(BankAccountPaymentProfile bankAccount) {
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
         * @param  automaticallyResumeAt  ZonedDateTime value for automaticallyResumeAt.
         * @return Builder
         */
        public Builder automaticallyResumeAt(ZonedDateTime automaticallyResumeAt) {
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
            this.payerId = OptionalNullable.of(payerId);
            return this;
        }

        /**
         * UnSetter for payerId.
         * @return Builder
         */
        public Builder unsetPayerId() {
            payerId = null;
            return this;
        }

        /**
         * Setter for currentBillingAmountInCents.
         * @param  currentBillingAmountInCents  Long value for currentBillingAmountInCents.
         * @return Builder
         */
        public Builder currentBillingAmountInCents(Long currentBillingAmountInCents) {
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
         * @param  productPricePointType  PricePointType value for productPricePointType.
         * @return Builder
         */
        public Builder productPricePointType(PricePointType productPricePointType) {
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
         * @param  onHoldAt  ZonedDateTime value for onHoldAt.
         * @return Builder
         */
        public Builder onHoldAt(ZonedDateTime onHoldAt) {
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
         * @param  scheduledCancellationAt  ZonedDateTime value for scheduledCancellationAt.
         * @return Builder
         */
        public Builder scheduledCancellationAt(ZonedDateTime scheduledCancellationAt) {
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
         * @param  creditBalanceInCents  Long value for creditBalanceInCents.
         * @return Builder
         */
        public Builder creditBalanceInCents(Long creditBalanceInCents) {
            this.creditBalanceInCents = creditBalanceInCents;
            return this;
        }

        /**
         * Setter for prepaymentBalanceInCents.
         * @param  prepaymentBalanceInCents  Long value for prepaymentBalanceInCents.
         * @return Builder
         */
        public Builder prepaymentBalanceInCents(Long prepaymentBalanceInCents) {
            this.prepaymentBalanceInCents = prepaymentBalanceInCents;
            return this;
        }

        /**
         * Setter for prepaidConfiguration.
         * @param  prepaidConfiguration  PrepaidConfiguration value for prepaidConfiguration.
         * @return Builder
         */
        public Builder prepaidConfiguration(PrepaidConfiguration prepaidConfiguration) {
            this.prepaidConfiguration = OptionalNullable.of(prepaidConfiguration);
            return this;
        }

        /**
         * UnSetter for prepaidConfiguration.
         * @return Builder
         */
        public Builder unsetPrepaidConfiguration() {
            prepaidConfiguration = null;
            return this;
        }

        /**
         * Setter for selfServicePageToken.
         * @param  selfServicePageToken  String value for selfServicePageToken.
         * @return Builder
         */
        public Builder selfServicePageToken(String selfServicePageToken) {
            this.selfServicePageToken = selfServicePageToken;
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
                    creditBalanceInCents, prepaymentBalanceInCents, prepaidConfiguration,
                    selfServicePageToken);
        }
    }
}
