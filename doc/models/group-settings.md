
# Group Settings

## Structure

`GroupSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Target` | [`GroupTarget`](../../doc/models/group-target.md) | Required | Attributes of the target customer who will be the responsible payer of the created subscription. Required. | GroupTarget getTarget() | setTarget(GroupTarget target) |
| `Billing` | [`GroupBilling`](../../doc/models/group-billing.md) | Optional | (Optional) Attributes related to billing date and accrual. Note: Only applicable for new subscriptions. | GroupBilling getBilling() | setBilling(GroupBilling billing) |

## Example

```java
import com.maxio.advancedbilling.models.GroupBilling;
import com.maxio.advancedbilling.models.GroupSettings;
import com.maxio.advancedbilling.models.GroupTarget;
import com.maxio.advancedbilling.models.GroupTargetType;

GroupSettings groupSettings = new GroupSettings.Builder(
    new GroupTarget.Builder(
        GroupTargetType.PARENT
    )
    .id(236)
    .build()
)
.billing(new GroupBilling.Builder()
        .accrue(false)
        .alignDate(false)
        .prorate(false)
        .build())
.build();
```

