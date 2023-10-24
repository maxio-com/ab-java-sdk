
# Create or Update Product

## Structure

`CreateOrUpdateProduct`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Handle` | `String` | Optional | - | String getHandle() | setHandle(String handle) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `AccountingCode` | `String` | Optional | - | String getAccountingCode() | setAccountingCode(String accountingCode) |
| `RequireCreditCard` | `Boolean` | Optional | - | Boolean getRequireCreditCard() | setRequireCreditCard(Boolean requireCreditCard) |
| `PriceInCents` | `int` | Required | - | int getPriceInCents() | setPriceInCents(int priceInCents) |
| `Interval` | `int` | Required | - | int getInterval() | setInterval(int interval) |
| `IntervalUnit` | `String` | Required | - | String getIntervalUnit() | setIntervalUnit(String intervalUnit) |
| `AutoCreateSignupPage` | `Boolean` | Optional | - | Boolean getAutoCreateSignupPage() | setAutoCreateSignupPage(Boolean autoCreateSignupPage) |
| `TaxCode` | `String` | Optional | - | String getTaxCode() | setTaxCode(String taxCode) |

## Example (as JSON)

```json
{
  "name": "name8",
  "handle": "handle4",
  "description": "description8",
  "accounting_code": "accounting_code4",
  "require_credit_card": false,
  "price_in_cents": 190,
  "interval": 174,
  "interval_unit": "interval_unit8",
  "auto_create_signup_page": false,
  "tax_code": "tax_code6"
}
```

