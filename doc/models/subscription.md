
# Subscription

## Structure

`Subscription`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | The subscription unique id within Chargify. | Integer getId() | setId(Integer id) |
| `State` | `String` | Optional | The current state of the subscription. Please see the documentation for [Subscription States](https://help.chargify.com/subscriptions/subscription-states.html) | String getState() | setState(String state) |
| `BalanceInCents` | `Integer` | Optional | Gives the current outstanding subscription balance in the number of cents. | Integer getBalanceInCents() | setBalanceInCents(Integer balanceInCents) |
| `TotalRevenueInCents` | `Integer` | Optional | Gives the total revenue from the subscription in the number of cents. | Integer getTotalRevenueInCents() | setTotalRevenueInCents(Integer totalRevenueInCents) |
| `ProductPriceInCents` | `Integer` | Optional | (Added Nov 5 2013) The recurring amount of the product (and version),currently subscribed. NOTE: this may differ from the current price of,the product, if you’ve changed the price of the product but haven’t,moved this subscription to a newer version. | Integer getProductPriceInCents() | setProductPriceInCents(Integer productPriceInCents) |
| `ProductVersionNumber` | `Integer` | Optional | The version of the product for the subscription. Note that this is a deprecated field kept for backwards-compatibility. | Integer getProductVersionNumber() | setProductVersionNumber(Integer productVersionNumber) |
| `CurrentPeriodEndsAt` | `String` | Optional | Timestamp relating to the end of the current (recurring) period (i.e.,when the next regularly scheduled attempted charge will occur) | String getCurrentPeriodEndsAt() | setCurrentPeriodEndsAt(String currentPeriodEndsAt) |
| `NextAssessmentAt` | `String` | Optional | Timestamp that indicates when capture of payment will be tried or,retried. This value will usually track the current_period_ends_at, but,will diverge if a renewal payment fails and must be retried. In that,case, the current_period_ends_at will advance to the end of the next,period (time doesn’t stop because a payment was missed) but the,next_assessment_at will be scheduled for the auto-retry time (i.e. 24,hours in the future, in some cases) | String getNextAssessmentAt() | setNextAssessmentAt(String nextAssessmentAt) |
| `TrialStartedAt` | `String` | Optional | Timestamp for when the trial period (if any) began | String getTrialStartedAt() | setTrialStartedAt(String trialStartedAt) |
| `TrialEndedAt` | `String` | Optional | Timestamp for when the trial period (if any) ended | String getTrialEndedAt() | setTrialEndedAt(String trialEndedAt) |
| `ActivatedAt` | `String` | Optional | Timestamp for when the subscription began (i.e. when it came out of trial, or when it began in the case of no trial) | String getActivatedAt() | setActivatedAt(String activatedAt) |
| `ExpiresAt` | `String` | Optional | Timestamp giving the expiration date of this subscription (if any) | String getExpiresAt() | setExpiresAt(String expiresAt) |
| `CreatedAt` | `String` | Optional | The creation date for this subscription | String getCreatedAt() | setCreatedAt(String createdAt) |
| `UpdatedAt` | `String` | Optional | The date of last update for this subscription | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `CancellationMessage` | `String` | Optional | Seller-provided reason for, or note about, the cancellation. | String getCancellationMessage() | setCancellationMessage(String cancellationMessage) |
| `CancellationMethod` | [`SubscriptionCancellationMethod`](../../doc/models/containers/subscription-cancellation-method.md) | Optional | This is a container for one-of cases. | SubscriptionCancellationMethod getCancellationMethod() | setCancellationMethod(SubscriptionCancellationMethod cancellationMethod) |
| `CancelAtEndOfPeriod` | `Boolean` | Optional | Whether or not the subscription will (or has) canceled at the end of the period. | Boolean getCancelAtEndOfPeriod() | setCancelAtEndOfPeriod(Boolean cancelAtEndOfPeriod) |
| `CanceledAt` | `String` | Optional | The timestamp of the most recent cancellation | String getCanceledAt() | setCanceledAt(String canceledAt) |
| `CurrentPeriodStartedAt` | `String` | Optional | Timestamp relating to the start of the current (recurring) period | String getCurrentPeriodStartedAt() | setCurrentPeriodStartedAt(String currentPeriodStartedAt) |
| `PreviousState` | `String` | Optional | Only valid for webhook payloads The previous state for webhooks that have indicated a change in state. For normal API calls, this will always be the same as the state (current state) | String getPreviousState() | setPreviousState(String previousState) |
| `SignupPaymentId` | `Integer` | Optional | The ID of the transaction that generated the revenue | Integer getSignupPaymentId() | setSignupPaymentId(Integer signupPaymentId) |
| `SignupRevenue` | `String` | Optional | The revenue, formatted as a string of decimal separated dollars and,cents, from the subscription signup ($50.00 would be formatted as,50.00) | String getSignupRevenue() | setSignupRevenue(String signupRevenue) |
| `DelayedCancelAt` | `String` | Optional | Timestamp for when the subscription is currently set to cancel. | String getDelayedCancelAt() | setDelayedCancelAt(String delayedCancelAt) |
| `CouponCode` | `String` | Optional | (deprecated) The coupon code of the single coupon currently applied to the subscription. See coupon_codes instead as subscriptions can now have more than one coupon. | String getCouponCode() | setCouponCode(String couponCode) |
| `SnapDay` | `String` | Optional | The day of the month that the subscription will charge according to calendar billing rules, if used. | String getSnapDay() | setSnapDay(String snapDay) |
| `PaymentCollectionMethod` | [`SubscriptionPaymentCollectionMethod`](../../doc/models/containers/subscription-payment-collection-method.md) | Optional | This is a container for one-of cases. | SubscriptionPaymentCollectionMethod getPaymentCollectionMethod() | setPaymentCollectionMethod(SubscriptionPaymentCollectionMethod paymentCollectionMethod) |
| `Customer` | [`Customer`](../../doc/models/customer.md) | Optional | - | Customer getCustomer() | setCustomer(Customer customer) |
| `Product` | [`Product`](../../doc/models/product.md) | Optional | - | Product getProduct() | setProduct(Product product) |
| `CreditCard` | [`PaymentProfile`](../../doc/models/payment-profile.md) | Optional | - | PaymentProfile getCreditCard() | setCreditCard(PaymentProfile creditCard) |
| `Group` | [`SubscriptionGroup2`](../../doc/models/containers/subscription-group-2.md) | Optional | This is a container for one-of cases. | SubscriptionGroup2 getGroup() | setGroup(SubscriptionGroup2 group) |
| `BankAccount` | [`SubscriptionBankAccount`](../../doc/models/subscription-bank-account.md) | Optional | - | SubscriptionBankAccount getBankAccount() | setBankAccount(SubscriptionBankAccount bankAccount) |
| `PaymentType` | `String` | Optional | The payment profile type for the active profile on file. | String getPaymentType() | setPaymentType(String paymentType) |
| `ReferralCode` | `String` | Optional | The subscription's unique code that can be given to referrals. | String getReferralCode() | setReferralCode(String referralCode) |
| `NextProductId` | `Integer` | Optional | If a delayed product change is scheduled, the ID of the product that the subscription will be changed to at the next renewal. | Integer getNextProductId() | setNextProductId(Integer nextProductId) |
| `NextProductHandle` | `String` | Optional | If a delayed product change is scheduled, the handle of the product that the subscription will be changed to at the next renewal. | String getNextProductHandle() | setNextProductHandle(String nextProductHandle) |
| `CouponUseCount` | `Integer` | Optional | (deprecated) How many times the subscription's single coupon has been used. This field has no replacement for multiple coupons. | Integer getCouponUseCount() | setCouponUseCount(Integer couponUseCount) |
| `CouponUsesAllowed` | `Integer` | Optional | (deprecated) How many times the subscription's single coupon may be used. This field has no replacement for multiple coupons. | Integer getCouponUsesAllowed() | setCouponUsesAllowed(Integer couponUsesAllowed) |
| `ReasonCode` | `String` | Optional | If the subscription is canceled, this is their churn code. | String getReasonCode() | setReasonCode(String reasonCode) |
| `AutomaticallyResumeAt` | `String` | Optional | The date the subscription is scheduled to automatically resume from the on_hold state. | String getAutomaticallyResumeAt() | setAutomaticallyResumeAt(String automaticallyResumeAt) |
| `CouponCodes` | `List<String>` | Optional | An array for all the coupons attached to the subscription. | List<String> getCouponCodes() | setCouponCodes(List<String> couponCodes) |
| `OfferId` | `Integer` | Optional | The ID of the offer associated with the subscription. | Integer getOfferId() | setOfferId(Integer offerId) |
| `PayerId` | `Integer` | Optional | On Relationship Invoicing, the ID of the individual paying for the subscription. Defaults to the Customer ID unless the 'Customer Hierarchies & WhoPays' feature is enabled. | Integer getPayerId() | setPayerId(Integer payerId) |
| `CurrentBillingAmountInCents` | `Integer` | Optional | The balance in cents plus the estimated renewal amount in cents. | Integer getCurrentBillingAmountInCents() | setCurrentBillingAmountInCents(Integer currentBillingAmountInCents) |
| `ProductPricePointId` | `Integer` | Optional | The product price point currently subscribed to. | Integer getProductPricePointId() | setProductPricePointId(Integer productPricePointId) |
| `ProductPricePointType` | `String` | Optional | One of the following: custom, default, catalog. | String getProductPricePointType() | setProductPricePointType(String productPricePointType) |
| `NextProductPricePointId` | `Integer` | Optional | If a delayed product change is scheduled, the ID of the product price point that the subscription will be changed to at the next renewal. | Integer getNextProductPricePointId() | setNextProductPricePointId(Integer nextProductPricePointId) |
| `NetTerms` | `Integer` | Optional | On Relationship Invoicing, the number of days before a renewal invoice is due. | Integer getNetTerms() | setNetTerms(Integer netTerms) |
| `StoredCredentialTransactionId` | `Integer` | Optional | For European sites subject to PSD2 and using 3D Secure, this can be used to reference a previous transaction for the customer. This will ensure the card will be charged successfully at renewal. | Integer getStoredCredentialTransactionId() | setStoredCredentialTransactionId(Integer storedCredentialTransactionId) |
| `Reference` | `String` | Optional | The reference value (provided by your app) for the subscription itelf. | String getReference() | setReference(String reference) |
| `OnHoldAt` | `String` | Optional | The timestamp of the most recent on hold action. | String getOnHoldAt() | setOnHoldAt(String onHoldAt) |
| `PrepaidDunning` | `Boolean` | Optional | Boolean representing whether the subscription is prepaid and currently in dunning. Only returned for Relationship Invoicing sites with the feature enabled | Boolean getPrepaidDunning() | setPrepaidDunning(Boolean prepaidDunning) |
| `Coupons` | [`List<SubscriptionIncludedCoupon>`](../../doc/models/subscription-included-coupon.md) | Optional | Additional coupon data. To use this data you also have to include the following param in the request`include[]=coupons`.<br>Only in Read Subscription Endpoint. | List<SubscriptionIncludedCoupon> getCoupons() | setCoupons(List<SubscriptionIncludedCoupon> coupons) |
| `DunningCommunicationDelayEnabled` | `Boolean` | Optional | Enable Communication Delay feature, making sure no communication (email or SMS) is sent to the Customer between 9PM and 8AM in time zone set by the `dunning_communication_delay_time_zone` attribute.<br>**Default**: `false` | Boolean getDunningCommunicationDelayEnabled() | setDunningCommunicationDelayEnabled(Boolean dunningCommunicationDelayEnabled) |
| `DunningCommunicationDelayTimeZone` | `String` | Optional | Time zone for the Dunning Communication Delay feature. | String getDunningCommunicationDelayTimeZone() | setDunningCommunicationDelayTimeZone(String dunningCommunicationDelayTimeZone) |
| `ReceivesInvoiceEmails` | `Boolean` | Optional | - | Boolean getReceivesInvoiceEmails() | setReceivesInvoiceEmails(Boolean receivesInvoiceEmails) |
| `Locale` | `String` | Optional | - | String getLocale() | setLocale(String locale) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `ScheduledCancellationAt` | `String` | Optional | - | String getScheduledCancellationAt() | setScheduledCancellationAt(String scheduledCancellationAt) |
| `CreditBalanceInCents` | `Integer` | Optional | - | Integer getCreditBalanceInCents() | setCreditBalanceInCents(Integer creditBalanceInCents) |
| `PrepaymentBalanceInCents` | `Integer` | Optional | - | Integer getPrepaymentBalanceInCents() | setPrepaymentBalanceInCents(Integer prepaymentBalanceInCents) |

## Example (as JSON)

```json
{
  "credit_card": {
    "id": 10088716,
    "first_name": "Test",
    "last_name": "Subscription",
    "masked_card_number": "XXXX-XXXX-XXXX-1",
    "card_type": "bogus",
    "expiration_month": 1,
    "expiration_year": 2022,
    "customer_id": 14543792,
    "current_vault": "bogus",
    "vault_token": "1",
    "billing_address": "123 Montana Way",
    "billing_city": "Billings",
    "billing_state": "MT",
    "billing_zip": "59101",
    "billing_country": "US",
    "customer_vault_token": null,
    "billing_address_2": "",
    "payment_type": "credit_card",
    "site_gateway_setting_id": 1,
    "gateway_handle": null
  },
  "dunning_communication_delay_enabled": false,
  "dunning_communication_delay_time_zone": "\"Eastern Time (US & Canada)\"",
  "id": 96,
  "state": "state0",
  "balance_in_cents": 212,
  "total_revenue_in_cents": 136,
  "product_price_in_cents": 70
}
```

