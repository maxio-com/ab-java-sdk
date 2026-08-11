
# Change Invoice Collection Method Event Data

Example schema for an `change_invoice_collection_method` event

## Structure

`ChangeInvoiceCollectionMethodEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FromCollectionMethod` | `String` | Required | The previous collection method of the invoice. | String getFromCollectionMethod() | setFromCollectionMethod(String fromCollectionMethod) |
| `ToCollectionMethod` | `String` | Required | The new collection method of the invoice. | String getToCollectionMethod() | setToCollectionMethod(String toCollectionMethod) |

## Example

```java
import com.maxio.advancedbilling.models.ChangeInvoiceCollectionMethodEventData;

ChangeInvoiceCollectionMethodEventData changeInvoiceCollectionMethodEventData = new ChangeInvoiceCollectionMethodEventData.Builder(
    "from_collection_method8",
    "to_collection_method4"
)
.build();
```

