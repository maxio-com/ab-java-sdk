
# Subscription Group Signup Item

## Structure

`SubscriptionGroupSignupItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductHandle` | `String` | Optional | The API Handle of the product for which you are creating a subscription. Required, unless a `product_id` is given instead. | String getProductHandle() | setProductHandle(String productHandle) |
| `ProductId` | `Integer` | Optional | The Product ID of the product for which you are creating a subscription. You can pass either `product_id` or `product_handle`. | Integer getProductId() | setProductId(Integer productId) |
| `ProductPricePointId` | `Integer` | Optional | The ID of the particular price point on the product. | Integer getProductPricePointId() | setProductPricePointId(Integer productPricePointId) |
| `ProductPricePointHandle` | `String` | Optional | The user-friendly API handle of a product's particular price point. | String getProductPricePointHandle() | setProductPricePointHandle(String productPricePointHandle) |
| `OfferId` | `Integer` | Optional | Use in place of passing product and component information to set up the subscription with an existing offer. May be either the Chargify ID of the offer or its handle prefixed with `handle:` | Integer getOfferId() | setOfferId(Integer offerId) |
| `Reference` | `String` | Optional | The reference value (provided by your app) for the subscription itelf. | String getReference() | setReference(String reference) |
| `Primary` | `Boolean` | Optional | One of the subscriptions must be marked as primary in the group. | Boolean getPrimary() | setPrimary(Boolean primary) |
| `Currency` | `String` | Optional | (Optional) If Multi-Currency is enabled and the currency is configured in Chargify, pass it at signup to create a subscription on a non-default currency. Note that you cannot update the currency of an existing subscription. | String getCurrency() | setCurrency(String currency) |
| `CouponCodes` | `List<String>` | Optional | An array for all the coupons attached to the subscription. | List<String> getCouponCodes() | setCouponCodes(List<String> couponCodes) |
| `Components` | [`List<SubscriptionGroupSignupComponent>`](../../doc/models/subscription-group-signup-component.md) | Optional | - | List<SubscriptionGroupSignupComponent> getComponents() | setComponents(List<SubscriptionGroupSignupComponent> components) |
| `CustomPrice` | [`CustomPriceUsedForSubscriptionCreateUpdate`](../../doc/models/custom-price-used-for-subscription-create-update.md) | Optional | (Optional) Used in place of `product_price_point_id` to define a custom price point unique to the subscription | CustomPriceUsedForSubscriptionCreateUpdate getCustomPrice() | setCustomPrice(CustomPriceUsedForSubscriptionCreateUpdate customPrice) |
| `CalendarBilling` | [`CalendarBilling`](../../doc/models/calendar-billing.md) | Optional | (Optional). Cannot be used when also specifying next_billing_at | CalendarBilling getCalendarBilling() | setCalendarBilling(CalendarBilling calendarBilling) |
| `Metafields` | `Map<String, String>` | Optional | (Optional) A set of key/value pairs representing custom fields and their values. Metafields will be created “on-the-fly” in your site for a given key, if they have not been created yet. | Map<String, String> getMetafields() | setMetafields(Map<String, String> metafields) |

## Example (as JSON)

```json
{
  "metafields": {
    "custom_field_name_1": "custom_field_value_1",
    "custom_field_name_2": "custom_field_value_2"
  },
  "product_handle": "product_handle2",
  "product_id": 34,
  "product_price_point_id": 214,
  "product_price_point_handle": "product_price_point_handle4",
  "offer_id": 150
}
```

