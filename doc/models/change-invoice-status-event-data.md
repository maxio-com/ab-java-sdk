
# Change Invoice Status Event Data

Example schema for an `change_invoice_status` event

## Structure

`ChangeInvoiceStatusEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GatewayTransId` | `String` | Optional | Identifier for the transaction within the payment gateway. | String getGatewayTransId() | setGatewayTransId(String gatewayTransId) |
| `Amount` | `String` | Optional | The monetary value associated with the linked payment, expressed in dollars. | String getAmount() | setAmount(String amount) |
| `FromStatus` | [`InvoiceStatus`](../../doc/models/invoice-status.md) | Required | The status of the invoice before any changes occurred. See [Invoice Statuses](https://docs.maxio.com/billing/invoicing/overview/understand-how-invoices-are-generated#invoice-statuses) for more. | InvoiceStatus getFromStatus() | setFromStatus(InvoiceStatus fromStatus) |
| `ToStatus` | [`InvoiceStatus`](../../doc/models/invoice-status.md) | Required | The updated status of the invoice after changes have been made. See [Invoice Statuses](https://docs.maxio.com/billing/invoicing/overview/understand-how-invoices-are-generated#invoice-statuses) for more. | InvoiceStatus getToStatus() | setToStatus(InvoiceStatus toStatus) |
| `ConsolidationLevel` | [`InvoiceConsolidationLevel`](../../doc/models/invoice-consolidation-level.md) | Optional | - | InvoiceConsolidationLevel getConsolidationLevel() | setConsolidationLevel(InvoiceConsolidationLevel consolidationLevel) |

## Example

```java
import com.maxio.advancedbilling.models.ChangeInvoiceStatusEventData;
import com.maxio.advancedbilling.models.InvoiceConsolidationLevel;
import com.maxio.advancedbilling.models.InvoiceStatus;

ChangeInvoiceStatusEventData changeInvoiceStatusEventData = new ChangeInvoiceStatusEventData.Builder(
    InvoiceStatus.CANCELED,
    InvoiceStatus.PROCESSING
)
.gatewayTransId("gateway_trans_id4")
.amount("amount6")
.consolidationLevel(InvoiceConsolidationLevel.PARENT)
.build();
```

