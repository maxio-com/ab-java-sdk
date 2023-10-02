
# Update Subscription

## Structure

`UpdateSubscription`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreditCardAttributes` | [`CreditCardAttributes`](../../doc/models/credit-card-attributes.md) | Optional | - | CreditCardAttributes getCreditCardAttributes() | setCreditCardAttributes(CreditCardAttributes creditCardAttributes) |
| `ProductHandle` | `String` | Optional | Set to the handle of a different product to change the subscription's product | String getProductHandle() | setProductHandle(String productHandle) |
| `ProductId` | `Integer` | Optional | Set to the id of a different product to change the subscription's product | Integer getProductId() | setProductId(Integer productId) |
| `ProductChangeDelayed` | `Boolean` | Optional | **Default**: `false` | Boolean getProductChangeDelayed() | setProductChangeDelayed(Boolean productChangeDelayed) |
| `NextProductId` | `String` | Optional | Set to an empty string to cancel a delayed product change. | String getNextProductId() | setNextProductId(String nextProductId) |
| `NextProductPricePointId` | `String` | Optional | - | String getNextProductPricePointId() | setNextProductPricePointId(String nextProductPricePointId) |
| `SnapDay` | [`UpdateSubscriptionSnapDay`](../../doc/models/containers/update-subscription-snap-day.md) | Optional | This is a container for one-of cases. | UpdateSubscriptionSnapDay getSnapDay() | setSnapDay(UpdateSubscriptionSnapDay snapDay) |
| `NextBillingAt` | `String` | Optional | - | String getNextBillingAt() | setNextBillingAt(String nextBillingAt) |
| `PaymentCollectionMethod` | `String` | Optional | - | String getPaymentCollectionMethod() | setPaymentCollectionMethod(String paymentCollectionMethod) |
| `ReceivesInvoiceEmails` | `Boolean` | Optional | - | Boolean getReceivesInvoiceEmails() | setReceivesInvoiceEmails(Boolean receivesInvoiceEmails) |
| `NetTerms` | [`UpdateSubscriptionNetTerms`](../../doc/models/containers/update-subscription-net-terms.md) | Optional | This is a container for one-of cases. | UpdateSubscriptionNetTerms getNetTerms() | setNetTerms(UpdateSubscriptionNetTerms netTerms) |
| `StoredCredentialTransactionId` | `Integer` | Optional | - | Integer getStoredCredentialTransactionId() | setStoredCredentialTransactionId(Integer storedCredentialTransactionId) |
| `Reference` | `String` | Optional | - | String getReference() | setReference(String reference) |
| `CustomPrice` | [`CustomPriceUsedForSubscriptionCreateUpdate`](../../doc/models/custom-price-used-for-subscription-create-update.md) | Optional | (Optional) Used in place of `product_price_point_id` to define a custom price point unique to the subscription | CustomPriceUsedForSubscriptionCreateUpdate getCustomPrice() | setCustomPrice(CustomPriceUsedForSubscriptionCreateUpdate customPrice) |
| `Components` | [`List<UpdateSubscriptionComponent>`](../../doc/models/update-subscription-component.md) | Optional | (Optional) An array of component ids and custom prices to be added to the subscription. | List<UpdateSubscriptionComponent> getComponents() | setComponents(List<UpdateSubscriptionComponent> components) |
| `DunningCommunicationDelayEnabled` | `Boolean` | Optional | Enable Communication Delay feature, making sure no communication (email or SMS) is sent to the Customer between 9PM and 8AM in time zone set by the `dunning_communication_delay_time_zone` attribute.<br>**Default**: `false` | Boolean getDunningCommunicationDelayEnabled() | setDunningCommunicationDelayEnabled(Boolean dunningCommunicationDelayEnabled) |
| `DunningCommunicationDelayTimeZone` | `String` | Optional | Time zone for the Dunning Communication Delay feature. | String getDunningCommunicationDelayTimeZone() | setDunningCommunicationDelayTimeZone(String dunningCommunicationDelayTimeZone) |

## Example (as JSON)

```json
{
  "product_change_delayed": false,
  "dunning_communication_delay_enabled": false,
  "dunning_communication_delay_time_zone": "\"Eastern Time (US & Canada)\"",
  "credit_card_attributes": {
    "full_number": "full_number2",
    "expiration_month": "expiration_month6",
    "expiration_year": "expiration_year2"
  },
  "product_handle": "product_handle2",
  "product_id": 114,
  "next_product_id": "next_product_id8"
}
```

