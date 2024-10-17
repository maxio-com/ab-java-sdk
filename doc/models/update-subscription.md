
# Update Subscription

## Structure

`UpdateSubscription`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreditCardAttributes` | [`CreditCardAttributes`](../../doc/models/credit-card-attributes.md) | Optional | - | CreditCardAttributes getCreditCardAttributes() | setCreditCardAttributes(CreditCardAttributes creditCardAttributes) |
| `ProductHandle` | `String` | Optional | Set to the handle of a different product to change the subscription's product | String getProductHandle() | setProductHandle(String productHandle) |
| `ProductId` | `Integer` | Optional | Set to the id of a different product to change the subscription's product | Integer getProductId() | setProductId(Integer productId) |
| `ProductChangeDelayed` | `Boolean` | Optional | - | Boolean getProductChangeDelayed() | setProductChangeDelayed(Boolean productChangeDelayed) |
| `NextProductId` | `String` | Optional | Set to an empty string to cancel a delayed product change. | String getNextProductId() | setNextProductId(String nextProductId) |
| `NextProductPricePointId` | `String` | Optional | - | String getNextProductPricePointId() | setNextProductPricePointId(String nextProductPricePointId) |
| `SnapDay` | [`UpdateSubscriptionSnapDay`](../../doc/models/containers/update-subscription-snap-day.md) | Optional | This is a container for one-of cases. | UpdateSubscriptionSnapDay getSnapDay() | setSnapDay(UpdateSubscriptionSnapDay snapDay) |
| `NextBillingAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getNextBillingAt() | setNextBillingAt(ZonedDateTime nextBillingAt) |
| `PaymentCollectionMethod` | `String` | Optional | - | String getPaymentCollectionMethod() | setPaymentCollectionMethod(String paymentCollectionMethod) |
| `ReceivesInvoiceEmails` | `Boolean` | Optional | - | Boolean getReceivesInvoiceEmails() | setReceivesInvoiceEmails(Boolean receivesInvoiceEmails) |
| `NetTerms` | [`UpdateSubscriptionNetTerms`](../../doc/models/containers/update-subscription-net-terms.md) | Optional | This is a container for one-of cases. | UpdateSubscriptionNetTerms getNetTerms() | setNetTerms(UpdateSubscriptionNetTerms netTerms) |
| `StoredCredentialTransactionId` | `Integer` | Optional | - | Integer getStoredCredentialTransactionId() | setStoredCredentialTransactionId(Integer storedCredentialTransactionId) |
| `Reference` | `String` | Optional | - | String getReference() | setReference(String reference) |
| `CustomPrice` | [`SubscriptionCustomPrice`](../../doc/models/subscription-custom-price.md) | Optional | (Optional) Used in place of `product_price_point_id` to define a custom price point unique to the subscription | SubscriptionCustomPrice getCustomPrice() | setCustomPrice(SubscriptionCustomPrice customPrice) |
| `Components` | [`List<UpdateSubscriptionComponent>`](../../doc/models/update-subscription-component.md) | Optional | (Optional) An array of component ids and custom prices to be added to the subscription. | List<UpdateSubscriptionComponent> getComponents() | setComponents(List<UpdateSubscriptionComponent> components) |
| `DunningCommunicationDelayEnabled` | `Boolean` | Optional | Enable Communication Delay feature, making sure no communication (email or SMS) is sent to the Customer between 9PM and 8AM in time zone set by the `dunning_communication_delay_time_zone` attribute. | Boolean getDunningCommunicationDelayEnabled() | setDunningCommunicationDelayEnabled(Boolean dunningCommunicationDelayEnabled) |
| `DunningCommunicationDelayTimeZone` | `String` | Optional | Time zone for the Dunning Communication Delay feature. | String getDunningCommunicationDelayTimeZone() | setDunningCommunicationDelayTimeZone(String dunningCommunicationDelayTimeZone) |
| `ProductPricePointId` | `Integer` | Optional | Set to change the current product's price point. | Integer getProductPricePointId() | setProductPricePointId(Integer productPricePointId) |
| `ProductPricePointHandle` | `String` | Optional | Set to change the current product's price point. | String getProductPricePointHandle() | setProductPricePointHandle(String productPricePointHandle) |

## Example (as JSON)

```json
{
  "dunning_communication_delay_time_zone": "\"Eastern Time (US & Canada)\"",
  "credit_card_attributes": {
    "full_number": "full_number2",
    "expiration_month": "expiration_month6",
    "expiration_year": "expiration_year2"
  },
  "product_handle": "product_handle2",
  "product_id": 114,
  "product_change_delayed": false,
  "next_product_id": "next_product_id8"
}
```

