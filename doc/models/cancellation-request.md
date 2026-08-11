
# Cancellation Request

## Structure

`CancellationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscription` | [`CancellationOptions`](../../doc/models/cancellation-options.md) | Required | - | CancellationOptions getSubscription() | setSubscription(CancellationOptions subscription) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.CancellationOptions;
import com.maxio.advancedbilling.models.CancellationRequest;

CancellationRequest cancellationRequest = new CancellationRequest.Builder(
    new CancellationOptions.Builder()
        .cancellationMessage("cancellation_message2")
        .reasonCode("reason_code8")
        .cancelAtEndOfPeriod(false)
        .scheduledCancellationAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .refundPrepaymentAccountBalance(false)
        .build()
)
.build();
```

