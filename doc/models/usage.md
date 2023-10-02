
# Usage

## Structure

`Usage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Memo` | `String` | Optional | - | String getMemo() | setMemo(String memo) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `PricePointId` | `Integer` | Optional | - | Integer getPricePointId() | setPricePointId(Integer pricePointId) |
| `Quantity` | [`UsageQuantity`](../../doc/models/containers/usage-quantity.md) | Optional | This is a container for one-of cases. | UsageQuantity getQuantity() | setQuantity(UsageQuantity quantity) |
| `OverageQuantity` | `Integer` | Optional | - | Integer getOverageQuantity() | setOverageQuantity(Integer overageQuantity) |
| `ComponentId` | `Integer` | Optional | - | Integer getComponentId() | setComponentId(Integer componentId) |
| `ComponentHandle` | `String` | Optional | - | String getComponentHandle() | setComponentHandle(String componentHandle) |
| `SubscriptionId` | `Integer` | Optional | - | Integer getSubscriptionId() | setSubscriptionId(Integer subscriptionId) |

## Example (as JSON)

```json
{
  "id": 252,
  "memo": "memo8",
  "created_at": "created_at2",
  "price_point_id": 126,
  "quantity": 130
}
```

