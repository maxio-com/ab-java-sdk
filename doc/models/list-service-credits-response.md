
# List Service Credits Response

## Structure

`ListServiceCreditsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ServiceCredits` | [`List<ServiceCredit1>`](../../doc/models/service-credit-1.md) | Optional | - | List<ServiceCredit1> getServiceCredits() | setServiceCredits(List<ServiceCredit1> serviceCredits) |

## Example

```java
import com.maxio.advancedbilling.models.ListServiceCreditsResponse;
import com.maxio.advancedbilling.models.ServiceCredit1;
import com.maxio.advancedbilling.models.ServiceCreditType;
import java.util.Arrays;

ListServiceCreditsResponse listServiceCreditsResponse = new ListServiceCreditsResponse.Builder()
    .serviceCredits(Arrays.asList(
        new ServiceCredit1.Builder()
            .id(224)
            .amountInCents(54L)
            .endingBalanceInCents(94L)
            .entryType(ServiceCreditType.CREDIT)
            .memo("memo2")
            .build(),
        new ServiceCredit1.Builder()
            .id(224)
            .amountInCents(54L)
            .endingBalanceInCents(94L)
            .entryType(ServiceCreditType.CREDIT)
            .memo("memo2")
            .build(),
        new ServiceCredit1.Builder()
            .id(224)
            .amountInCents(54L)
            .endingBalanceInCents(94L)
            .entryType(ServiceCreditType.CREDIT)
            .memo("memo2")
            .build()
    ))
    .build();
```

