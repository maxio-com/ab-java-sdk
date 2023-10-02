
# Metafield Scope

Warning: When updating a metafield's scope attribute, all scope attributes must be passed. Partially complete scope attributes will override the existing settings.

## Structure

`MetafieldScope`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Csv` | [`IncludeOptionEnum`](../../doc/models/include-option-enum.md) | Optional | Include (1) or exclude (0) metafields from the csv export. | IncludeOptionEnum getCsv() | setCsv(IncludeOptionEnum csv) |
| `Invoices` | [`IncludeOptionEnum`](../../doc/models/include-option-enum.md) | Optional | Include (1) or exclude (0) metafields from invoices. | IncludeOptionEnum getInvoices() | setInvoices(IncludeOptionEnum invoices) |
| `Statements` | [`IncludeOptionEnum`](../../doc/models/include-option-enum.md) | Optional | Include (1) or exclude (0) metafields from statements. | IncludeOptionEnum getStatements() | setStatements(IncludeOptionEnum statements) |
| `Portal` | [`IncludeOptionEnum`](../../doc/models/include-option-enum.md) | Optional | Include (1) or exclude (0) metafields from the portal. | IncludeOptionEnum getPortal() | setPortal(IncludeOptionEnum portal) |
| `PublicShow` | [`IncludeOptionEnum`](../../doc/models/include-option-enum.md) | Optional | Include (1) or exclude (0) metafields from being viewable by your ecosystem. | IncludeOptionEnum getPublicShow() | setPublicShow(IncludeOptionEnum publicShow) |
| `PublicEdit` | [`IncludeOptionEnum`](../../doc/models/include-option-enum.md) | Optional | Include (1) or exclude (0) metafields from being edited by your ecosystem. | IncludeOptionEnum getPublicEdit() | setPublicEdit(IncludeOptionEnum publicEdit) |

## Example (as JSON)

```json
{
  "csv": "0",
  "invoices": "0",
  "statements": "0",
  "portal": "0",
  "public_show": "0"
}
```

