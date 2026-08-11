
# Change Chargeback Status Event Data

Example schema for an `change_chargeback_status` event

## Structure

`ChangeChargebackStatusEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ChargebackStatus` | [`ChargebackStatus`](../../doc/models/chargeback-status.md) | Required | - | ChargebackStatus getChargebackStatus() | setChargebackStatus(ChargebackStatus chargebackStatus) |

## Example

```java
import com.maxio.advancedbilling.models.ChangeChargebackStatusEventData;
import com.maxio.advancedbilling.models.ChargebackStatus;

ChangeChargebackStatusEventData changeChargebackStatusEventData = new ChangeChargebackStatusEventData.Builder(
    ChargebackStatus.WON
)
.build();
```

