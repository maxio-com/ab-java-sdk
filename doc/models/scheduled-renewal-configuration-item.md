
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

## Example

```java
import com.maxio.advancedbilling.models.ScheduledRenewalConfigurationItem;

ScheduledRenewalConfigurationItem scheduledRenewalConfigurationItem = new ScheduledRenewalConfigurationItem.Builder()
    .id(54)
    .subscriptionId(164)
    .subscriptionRenewalConfigurationId(64)
    .itemId(202)
    .itemType("item_type0")
    .build();
```

