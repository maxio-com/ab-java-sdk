
# MRR Movement

## Structure

`MRRMovement`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `Integer` | Optional | - | Integer getAmount() | setAmount(Integer amount) |
| `Category` | `String` | Optional | - | String getCategory() | setCategory(String category) |
| `SubscriberDelta` | `Integer` | Optional | - | Integer getSubscriberDelta() | setSubscriberDelta(Integer subscriberDelta) |
| `LeadDelta` | `Integer` | Optional | - | Integer getLeadDelta() | setLeadDelta(Integer leadDelta) |

## Example

```java
import com.maxio.advancedbilling.models.MRRMovement;

MRRMovement mRRMovement = new MRRMovement.Builder()
    .amount(116)
    .category("category4")
    .subscriberDelta(100)
    .leadDelta(128)
    .build();
```

