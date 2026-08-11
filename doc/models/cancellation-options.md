
# Cancellation Options

## Structure

`CancellationOptions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CancellationMessage` | `String` | Optional | An indication as to why the subscription is being canceled. For your internal use. | String getCancellationMessage() | setCancellationMessage(String cancellationMessage) |
| `ReasonCode` | `String` | Optional | The reason code associated with the cancellation. Use the [List Reason Codes](../../doc/controllers/reason-codes.md#list-reason-codes) endpoint to retrieve the reason codes associated with your site. | String getReasonCode() | setReasonCode(String reasonCode) |
| `CancelAtEndOfPeriod` | `Boolean` | Optional | When true, the subscription is cancelled at the current period end instead of immediately. To use this option, the Schedule Subscription Cancellation feature must be enabled on your site. | Boolean getCancelAtEndOfPeriod() | setCancelAtEndOfPeriod(Boolean cancelAtEndOfPeriod) |
| `ScheduledCancellationAt` | `ZonedDateTime` | Optional | Schedules the cancellation on the provided date. This option is not applicable for prepaid subscriptions. To use this option, the Schedule Subscription Cancellation feature must be enabled on your site. | ZonedDateTime getScheduledCancellationAt() | setScheduledCancellationAt(ZonedDateTime scheduledCancellationAt) |
| `RefundPrepaymentAccountBalance` | `Boolean` | Optional | Applies to prepaid subscriptions. When true, which is the default, the remaining prepaid balance is refunded as part of cancellation processing. When false, prepaid balance is not refunded as part of cancellation processing. To use this option, the Schedule Subscription Cancellation feature must be enabled on your site. | Boolean getRefundPrepaymentAccountBalance() | setRefundPrepaymentAccountBalance(Boolean refundPrepaymentAccountBalance) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.CancellationOptions;

CancellationOptions cancellationOptions = new CancellationOptions.Builder()
    .cancellationMessage("cancellation_message0")
    .reasonCode("reason_code6")
    .cancelAtEndOfPeriod(false)
    .scheduledCancellationAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .refundPrepaymentAccountBalance(false)
    .build();
```

