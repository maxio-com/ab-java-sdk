
# Service Credit Response

## Structure

`ServiceCreditResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ServiceCredit` | [`ServiceCredit`](../../doc/models/service-credit.md) | Required | - | ServiceCredit getServiceCredit() | setServiceCredit(ServiceCredit serviceCredit) |

## Example

```java
import com.maxio.advancedbilling.models.ServiceCredit;
import com.maxio.advancedbilling.models.ServiceCreditResponse;
import com.maxio.advancedbilling.models.ServiceCreditType;

ServiceCreditResponse serviceCreditResponse = new ServiceCreditResponse.Builder(
    new ServiceCredit.Builder()
        .id(38)
        .amountInCents(124L)
        .endingBalanceInCents(164L)
        .entryType(ServiceCreditType.CREDIT)
        .memo("memo0")
        .build()
)
.build();
```

