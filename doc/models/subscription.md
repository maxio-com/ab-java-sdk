
# Subscription

## Structure

`Subscription`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | The subscription unique id within Chargify. | Integer getId() | setId(Integer id) |
| `State` | [`SubscriptionState`](../../doc/models/subscription-state.md) | Optional | The state of a subscription.<br><br>* **Live States**<br>  * `active` - A normal, active subscription. It is not in a trial and is paid and up to date.<br>  * `assessing` - An internal (transient) state that indicates a subscription is in the middle of periodic assessment. Do not base any access decisions in your app on this state, as it may not always be exposed.<br>  * `pending` - An internal (transient) state that indicates a subscription is in the creation process. Do not base any access decisions in your app on this state, as it may not always be exposed.<br>  * `trialing` - A subscription in trialing state has a valid trial subscription. This type of subscription may transition to active once payment is received when the trial has ended. Otherwise, it may go to a Problem or End of Life state.<br>  * `paused` - An internal state that indicates that your account with Advanced Billing is in arrears.<br>* **Problem States**<br>  * `past_due` - Indicates that the most recent payment has failed, and payment is past due for this subscription. If you have enabled our automated dunning, this subscription will be in the dunning process (additional status and callbacks from the dunning process will be available in the future). If you are handling dunning and payment updates yourself, you will want to use this state to initiate a payment update from your customers.<br>  * `soft_failure` - Indicates that normal assessment/processing of the subscription has failed for a reason that cannot be fixed by the Customer. For example, a Soft Fail may result from a timeout at the gateway or incorrect credentials on your part. The subscriptions should be retried automatically. An interface is being built for you to review problems resulting from these events to take manual action when needed.<br>  * `unpaid` - Indicates an unpaid subscription. A subscription is marked unpaid if the retry period expires and you have configured your [Dunning](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405505141005) settings to have a Final Action of `mark the subscription unpaid`.<br>* **End of Life States**<br>  * `canceled` - Indicates a canceled subscription. This may happen at your request (via the API or the web interface) or due to the expiration of the [Dunning](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405505141005) process without payment. See the [Reactivation](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404559291021) documentation for info on how to restart a canceled subscription.<br>    While a subscription is canceled, its period will not advance, it will not accrue any new charges, and Advanced Billing will not attempt to collect the overdue balance.<br>  * `expired` - Indicates a subscription that has expired due to running its normal life cycle. Some products may be configured to have an expiration period. An expired subscription then is one that stayed active until it fulfilled its full period.<br>  * `failed_to_create` - Indicates that signup has failed. (You may see this state in a signup_failure webhook.)<br>  * `on_hold` - Indicates that a subscription’s billing has been temporarily stopped. While it is expected that the subscription will resume and return to active status, this is still treated as an “End of Life” state because the customer is not paying for services during this time.<br>  * `suspended` - Indicates that a prepaid subscription has used up all their prepayment balance. If a prepayment is applied, it will return to an active state.<br>  * `trial_ended` - A subscription in a trial_ended state is a subscription that completed a no-obligation trial and did not have a card on file at the expiration of the trial period. See [Product Pricing – No Obligation Trials](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405246782221) for more details.<br><br>See [Subscription States](https://maxio-chargify.zendesk.com/hc/en-us/articles/5404222005773) for more info about subscription states and state transitions. | SubscriptionState getState() | setState(SubscriptionState state) |
| `BalanceInCents` | `Long` | Optional | Gives the current outstanding subscription balance in the number of cents. | Long getBalanceInCents() | setBalanceInCents(Long balanceInCents) |
| `TotalRevenueInCents` | `Long` | Optional | Gives the total revenue from the subscription in the number of cents. | Long getTotalRevenueInCents() | setTotalRevenueInCents(Long totalRevenueInCents) |
| `ProductPriceInCents` | `Long` | Optional | (Added Nov 5 2013) The recurring amount of the product (and version),currently subscribed. NOTE: this may differ from the current price of,the product, if you’ve changed the price of the product but haven’t,moved this subscription to a newer version. | Long getProductPriceInCents() | setProductPriceInCents(Long productPriceInCents) |
| `ProductVersionNumber` | `Integer` | Optional | The version of the product for the subscription. Note that this is a deprecated field kept for backwards-compatibility. | Integer getProductVersionNumber() | setProductVersionNumber(Integer productVersionNumber) |
| `CurrentPeriodEndsAt` | `ZonedDateTime` | Optional | Timestamp relating to the end of the current (recurring) period (i.e.,when the next regularly scheduled attempted charge will occur) | ZonedDateTime getCurrentPeriodEndsAt() | setCurrentPeriodEndsAt(ZonedDateTime currentPeriodEndsAt) |
| `NextAssessmentAt` | `ZonedDateTime` | Optional | Timestamp that indicates when capture of payment will be tried or,retried. This value will usually track the current_period_ends_at, but,will diverge if a renewal payment fails and must be retried. In that,case, the current_period_ends_at will advance to the end of the next,period (time doesn’t stop because a payment was missed) but the,next_assessment_at will be scheduled for the auto-retry time (i.e. 24,hours in the future, in some cases) | ZonedDateTime getNextAssessmentAt() | setNextAssessmentAt(ZonedDateTime nextAssessmentAt) |
| `TrialStartedAt` | `ZonedDateTime` | Optional | Timestamp for when the trial period (if any) began | ZonedDateTime getTrialStartedAt() | setTrialStartedAt(ZonedDateTime trialStartedAt) |
| `TrialEndedAt` | `ZonedDateTime` | Optional | Timestamp for when the trial period (if any) ended | ZonedDateTime getTrialEndedAt() | setTrialEndedAt(ZonedDateTime trialEndedAt) |
| `ActivatedAt` | `ZonedDateTime` | Optional | Timestamp for when the subscription began (i.e. when it came out of trial, or when it began in the case of no trial) | ZonedDateTime getActivatedAt() | setActivatedAt(ZonedDateTime activatedAt) |
| `ExpiresAt` | `ZonedDateTime` | Optional | Timestamp giving the expiration date of this subscription (if any) | ZonedDateTime getExpiresAt() | setExpiresAt(ZonedDateTime expiresAt) |
| `CreatedAt` | `ZonedDateTime` | Optional | The creation date for this subscription | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `UpdatedAt` | `ZonedDateTime` | Optional | The date of last update for this subscription | ZonedDateTime getUpdatedAt() | setUpdatedAt(ZonedDateTime updatedAt) |
| `CancellationMessage` | `String` | Optional | Seller-provided reason for, or note about, the cancellation. | String getCancellationMessage() | setCancellationMessage(String cancellationMessage) |
| `CancellationMethod` | [`CancellationMethod`](../../doc/models/cancellation-method.md) | Optional | The process used to cancel the subscription, if the subscription has been canceled. It is nil if the subscription's state is not canceled. | CancellationMethod getCancellationMethod() | setCancellationMethod(CancellationMethod cancellationMethod) |
| `CancelAtEndOfPeriod` | `Boolean` | Optional | Whether or not the subscription will (or has) canceled at the end of the period. | Boolean getCancelAtEndOfPeriod() | setCancelAtEndOfPeriod(Boolean cancelAtEndOfPeriod) |
| `CanceledAt` | `ZonedDateTime` | Optional | The timestamp of the most recent cancellation | ZonedDateTime getCanceledAt() | setCanceledAt(ZonedDateTime canceledAt) |
| `CurrentPeriodStartedAt` | `ZonedDateTime` | Optional | Timestamp relating to the start of the current (recurring) period | ZonedDateTime getCurrentPeriodStartedAt() | setCurrentPeriodStartedAt(ZonedDateTime currentPeriodStartedAt) |
| `PreviousState` | [`SubscriptionState`](../../doc/models/subscription-state.md) | Optional | Only valid for webhook payloads The previous state for webhooks that have indicated a change in state. For normal API calls, this will always be the same as the state (current state) | SubscriptionState getPreviousState() | setPreviousState(SubscriptionState previousState) |
| `SignupPaymentId` | `Integer` | Optional | The ID of the transaction that generated the revenue | Integer getSignupPaymentId() | setSignupPaymentId(Integer signupPaymentId) |
| `SignupRevenue` | `String` | Optional | The revenue, formatted as a string of decimal separated dollars and,cents, from the subscription signup ($50.00 would be formatted as,50.00) | String getSignupRevenue() | setSignupRevenue(String signupRevenue) |
| `DelayedCancelAt` | `ZonedDateTime` | Optional | Timestamp for when the subscription is currently set to cancel. | ZonedDateTime getDelayedCancelAt() | setDelayedCancelAt(ZonedDateTime delayedCancelAt) |
| `CouponCode` | `String` | Optional | (deprecated) The coupon code of the single coupon currently applied to the subscription. See coupon_codes instead as subscriptions can now have more than one coupon. | String getCouponCode() | setCouponCode(String couponCode) |
| `SnapDay` | `String` | Optional | The day of the month that the subscription will charge according to calendar billing rules, if used. | String getSnapDay() | setSnapDay(String snapDay) |
| `PaymentCollectionMethod` | [`CollectionMethod`](../../doc/models/collection-method.md) | Optional | The type of payment collection to be used in the subscription. For legacy Statements Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing Architecture valid options are - `remittance`, `automatic`, `prepaid`.<br>**Default**: `CollectionMethod.AUTOMATIC` | CollectionMethod getPaymentCollectionMethod() | setPaymentCollectionMethod(CollectionMethod paymentCollectionMethod) |
| `Customer` | [`Customer`](../../doc/models/customer.md) | Optional | - | Customer getCustomer() | setCustomer(Customer customer) |
| `Product` | [`Product`](../../doc/models/product.md) | Optional | - | Product getProduct() | setProduct(Product product) |
| `CreditCard` | [`CreditCardPaymentProfile`](../../doc/models/credit-card-payment-profile.md) | Optional | - | CreditCardPaymentProfile getCreditCard() | setCreditCard(CreditCardPaymentProfile creditCard) |
| `Group` | [`SubscriptionGroup2`](../../doc/models/containers/subscription-group-2.md) | Optional | This is a container for one-of cases. | SubscriptionGroup2 getGroup() | setGroup(SubscriptionGroup2 group) |
| `BankAccount` | [`BankAccountPaymentProfile`](../../doc/models/bank-account-payment-profile.md) | Optional | - | BankAccountPaymentProfile getBankAccount() | setBankAccount(BankAccountPaymentProfile bankAccount) |
| `PaymentType` | `String` | Optional | The payment profile type for the active profile on file. | String getPaymentType() | setPaymentType(String paymentType) |
| `ReferralCode` | `String` | Optional | The subscription's unique code that can be given to referrals. | String getReferralCode() | setReferralCode(String referralCode) |
| `NextProductId` | `Integer` | Optional | If a delayed product change is scheduled, the ID of the product that the subscription will be changed to at the next renewal. | Integer getNextProductId() | setNextProductId(Integer nextProductId) |
| `NextProductHandle` | `String` | Optional | If a delayed product change is scheduled, the handle of the product that the subscription will be changed to at the next renewal. | String getNextProductHandle() | setNextProductHandle(String nextProductHandle) |
| `CouponUseCount` | `Integer` | Optional | (deprecated) How many times the subscription's single coupon has been used. This field has no replacement for multiple coupons. | Integer getCouponUseCount() | setCouponUseCount(Integer couponUseCount) |
| `CouponUsesAllowed` | `Integer` | Optional | (deprecated) How many times the subscription's single coupon may be used. This field has no replacement for multiple coupons. | Integer getCouponUsesAllowed() | setCouponUsesAllowed(Integer couponUsesAllowed) |
| `ReasonCode` | `String` | Optional | If the subscription is canceled, this is their churn code. | String getReasonCode() | setReasonCode(String reasonCode) |
| `AutomaticallyResumeAt` | `ZonedDateTime` | Optional | The date the subscription is scheduled to automatically resume from the on_hold state. | ZonedDateTime getAutomaticallyResumeAt() | setAutomaticallyResumeAt(ZonedDateTime automaticallyResumeAt) |
| `CouponCodes` | `List<String>` | Optional | An array for all the coupons attached to the subscription. | List<String> getCouponCodes() | setCouponCodes(List<String> couponCodes) |
| `OfferId` | `Integer` | Optional | The ID of the offer associated with the subscription. | Integer getOfferId() | setOfferId(Integer offerId) |
| `PayerId` | `Integer` | Optional | On Relationship Invoicing, the ID of the individual paying for the subscription. Defaults to the Customer ID unless the 'Customer Hierarchies & WhoPays' feature is enabled. | Integer getPayerId() | setPayerId(Integer payerId) |
| `CurrentBillingAmountInCents` | `Long` | Optional | The balance in cents plus the estimated renewal amount in cents. | Long getCurrentBillingAmountInCents() | setCurrentBillingAmountInCents(Long currentBillingAmountInCents) |
| `ProductPricePointId` | `Integer` | Optional | The product price point currently subscribed to. | Integer getProductPricePointId() | setProductPricePointId(Integer productPricePointId) |
| `ProductPricePointType` | [`PricePointType`](../../doc/models/price-point-type.md) | Optional | Price point type. We expose the following types:<br><br>1. **default**: a price point that is marked as a default price for a certain product.<br>2. **custom**: a custom price point.<br>3. **catalog**: a price point that is **not** marked as a default price for a certain product and is **not** a custom one. | PricePointType getProductPricePointType() | setProductPricePointType(PricePointType productPricePointType) |
| `NextProductPricePointId` | `Integer` | Optional | If a delayed product change is scheduled, the ID of the product price point that the subscription will be changed to at the next renewal. | Integer getNextProductPricePointId() | setNextProductPricePointId(Integer nextProductPricePointId) |
| `NetTerms` | `Integer` | Optional | On Relationship Invoicing, the number of days before a renewal invoice is due. | Integer getNetTerms() | setNetTerms(Integer netTerms) |
| `StoredCredentialTransactionId` | `Integer` | Optional | For European sites subject to PSD2 and using 3D Secure, this can be used to reference a previous transaction for the customer. This will ensure the card will be charged successfully at renewal. | Integer getStoredCredentialTransactionId() | setStoredCredentialTransactionId(Integer storedCredentialTransactionId) |
| `Reference` | `String` | Optional | The reference value (provided by your app) for the subscription itelf. | String getReference() | setReference(String reference) |
| `OnHoldAt` | `ZonedDateTime` | Optional | The timestamp of the most recent on hold action. | ZonedDateTime getOnHoldAt() | setOnHoldAt(ZonedDateTime onHoldAt) |
| `PrepaidDunning` | `Boolean` | Optional | Boolean representing whether the subscription is prepaid and currently in dunning. Only returned for Relationship Invoicing sites with the feature enabled | Boolean getPrepaidDunning() | setPrepaidDunning(Boolean prepaidDunning) |
| `Coupons` | [`List<SubscriptionIncludedCoupon>`](../../doc/models/subscription-included-coupon.md) | Optional | Additional coupon data. To use this data you also have to include the following param in the request`include[]=coupons`.<br>Only in Read Subscription Endpoint. | List<SubscriptionIncludedCoupon> getCoupons() | setCoupons(List<SubscriptionIncludedCoupon> coupons) |
| `DunningCommunicationDelayEnabled` | `Boolean` | Optional | Enable Communication Delay feature, making sure no communication (email or SMS) is sent to the Customer between 9PM and 8AM in time zone set by the `dunning_communication_delay_time_zone` attribute. | Boolean getDunningCommunicationDelayEnabled() | setDunningCommunicationDelayEnabled(Boolean dunningCommunicationDelayEnabled) |
| `DunningCommunicationDelayTimeZone` | `String` | Optional | Time zone for the Dunning Communication Delay feature. | String getDunningCommunicationDelayTimeZone() | setDunningCommunicationDelayTimeZone(String dunningCommunicationDelayTimeZone) |
| `ReceivesInvoiceEmails` | `Boolean` | Optional | - | Boolean getReceivesInvoiceEmails() | setReceivesInvoiceEmails(Boolean receivesInvoiceEmails) |
| `Locale` | `String` | Optional | - | String getLocale() | setLocale(String locale) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `ScheduledCancellationAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getScheduledCancellationAt() | setScheduledCancellationAt(ZonedDateTime scheduledCancellationAt) |
| `CreditBalanceInCents` | `Long` | Optional | - | Long getCreditBalanceInCents() | setCreditBalanceInCents(Long creditBalanceInCents) |
| `PrepaymentBalanceInCents` | `Long` | Optional | - | Long getPrepaymentBalanceInCents() | setPrepaymentBalanceInCents(Long prepaymentBalanceInCents) |
| `PrepaidConfiguration` | [`PrepaidConfiguration`](../../doc/models/prepaid-configuration.md) | Optional | - | PrepaidConfiguration getPrepaidConfiguration() | setPrepaidConfiguration(PrepaidConfiguration prepaidConfiguration) |
| `SelfServicePageToken` | `String` | Optional | Returned only for list/read Subscription operation when `include[]=self_service_page_token` parameter is provided. | String getSelfServicePageToken() | setSelfServicePageToken(String selfServicePageToken) |

## Example (as JSON)

```json
{
  "payment_collection_method": "automatic",
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
  "dunning_communication_delay_time_zone": "\"Eastern Time (US & Canada)\"",
  "id": 96,
  "state": "soft_failure",
  "balance_in_cents": 212,
  "total_revenue_in_cents": 136,
  "product_price_in_cents": 70
}
```

