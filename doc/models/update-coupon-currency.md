
# Update Coupon Currency

## Structure

`UpdateCouponCurrency`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Currency` | `String` | Required | ISO code for the site defined currency. | String getCurrency() | setCurrency(String currency) |
| `Price` | `int` | Required | Price for the given currency. | int getPrice() | setPrice(int price) |

## Example (as JSON)

```json
{
  "currency": "currency4",
  "price": 146
}
```

