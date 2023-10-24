
# Change Invoice Collection Method Event Data

Example schema for an `change_invoice_collection_method` event

## Structure

`ChangeInvoiceCollectionMethodEventData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FromCollectionMethod` | `String` | Optional | The previous collection method of the invoice. | String getFromCollectionMethod() | setFromCollectionMethod(String fromCollectionMethod) |
| `ToCollectionMethod` | `String` | Optional | The new collection method of the invoice. | String getToCollectionMethod() | setToCollectionMethod(String toCollectionMethod) |

## Example (as JSON)

```json
{
  "from_collection_method": "from_collection_method4",
  "to_collection_method": "to_collection_method2"
}
```

