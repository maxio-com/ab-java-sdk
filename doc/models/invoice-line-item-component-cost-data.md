
# Invoice Line Item Component Cost Data

## Structure

`InvoiceLineItemComponentCostData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Rates` | [`List<ComponentCostData>`](../../doc/models/component-cost-data.md) | Optional | - | List<ComponentCostData> getRates() | setRates(List<ComponentCostData> rates) |

## Example

```java
import com.maxio.advancedbilling.models.ComponentCostData;
import com.maxio.advancedbilling.models.InvoiceLineItemComponentCostData;
import java.util.Arrays;

InvoiceLineItemComponentCostData invoiceLineItemComponentCostData = new InvoiceLineItemComponentCostData.Builder()
    .rates(Arrays.asList(
        new ComponentCostData.Builder()
            .componentCodeId(116)
            .pricePointId(226)
            .productId(94)
            .quantity("quantity0")
            .amount("amount6")
            .build(),
        new ComponentCostData.Builder()
            .componentCodeId(116)
            .pricePointId(226)
            .productId(94)
            .quantity("quantity0")
            .amount("amount6")
            .build()
    ))
    .build();
```

