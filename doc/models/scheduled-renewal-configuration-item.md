
# Scheduled Renewal Configuration Item

## Structure

`ScheduledRenewalConfigurationItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `SubscriptionId` | `Integer` | Optional | - | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |
| `SubscriptionRenewalConfigurationId` | `Integer` | Optional | - | Integer getSubscriptionRenewalConfigurationId() | setSubscriptionRenewalConfigurationId(Integer subscriptionRenewalConfigurationId) |
| `ItemId` | `Integer` | Optional | - | Integer getItemId() | setItemId(Integer itemId) |
| `ItemType` | `String` | Optional | - | String getItemType() | setItemType(String itemType) |
| `ItemSubclass` | `String` | Optional | - | String getItemSubclass() | setItemSubclass(String itemSubclass) |
| `PricePointId` | `Integer` | Optional | - | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `PricePointType` | `String` | Optional | - | String getPricePointType() | setPricePointType(String pricePointType) |
| `Quantity` | `Integer` | Optional | - | Integer getQuantity() | setQuantity(Integer quantity) |
| `DecimalQuantity` | `String` | Optional | - | String getDecimalQuantity() | setDecimalQuantity(String decimalQuantity) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |

## Example (as JSON)

```json
{
  "id": 146,
  "subscription_id": 0,
  "subscription_renewal_configuration_id": 156,
  "item_id": 38,
  "item_type": "item_type4"
}
```

