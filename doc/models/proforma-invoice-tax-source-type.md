
# Proforma Invoice Tax Source Type

The source of the tax. `Tax` is a tax configured in Advanced Billing. The other values identify the tax service that calculated the tax.

## Enumeration

`ProformaInvoiceTaxSourceType`

## Fields

| Name |
|  --- |
| `TAX` |
| `AVALARA` |
| `ANROK` |
| `TAXJAR` |
| `NUMERAL` |
| `SPHERE` |
| `TAXWIRE` |

## Example

```java
import com.maxio.advancedbilling.models.ProformaInvoiceTaxSourceType;

ProformaInvoiceTaxSourceType proformaInvoiceTaxSourceType = ProformaInvoiceTaxSourceType.TAXJAR;
```

