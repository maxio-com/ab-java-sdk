
# Usage

## Structure

`Usage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | **Constraints**: `>= 0` | Long getId() | setId(Long id) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `CreatedAt` | `ZonedDateTime` | Optional | - | ZonedDateTime getCreatedAt() | setCreatedAt(ZonedDateTime createdAt) |
| `PricePointId` | `Integer` | Optional | - | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `Quantity` | [`UsageQuantity`](../../doc/models/containers/usage-quantity.md) | Optional | This is a container for one-of cases. | UsageQuantity getQuantity() | setQuantity(UsageQuantity quantity) |
| `OverageQuantity` | `Integer` | Optional | - | Integer getOverageQuantity() | setOverageQuantity(Integer overageQuantity) |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `ComponentHandle` | `String` | Optional | - | String getComponentHandle() | setComponentHandle(String componentHandle) |
| `SubscriptionId` | `Integer` | Optional | - | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.Usage;
import com.maxio.advancedbilling.models.containers.UsageQuantity;

Usage usage = new Usage.Builder()
    .id(150L)
    .memo("memo2")
    .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .pricePointId(28)
    .quantity(UsageQuantity.fromNumber(
        28
    ))
    .build();
```

