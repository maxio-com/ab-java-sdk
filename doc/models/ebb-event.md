
# EBB Event

## Structure

`EBBEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Chargify` | [`ChargifyEBB`](../../doc/models/chargify-ebb.md) | Optional | - | ChargifyEBB getChargify() | setChargify(ChargifyEBB chargify) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.ChargifyEBB;
import com.maxio.advancedbilling.models.EBBEvent;

EBBEvent eBBEvent = new EBBEvent.Builder()
    .chargify(new ChargifyEBB.Builder()
        .timestamp(DateTimeHelper.fromRfc8601DateTime("2020-02-27T17:45:50-05:00"))
        .subscriptionId(1)
        .build())
    .build();
```

