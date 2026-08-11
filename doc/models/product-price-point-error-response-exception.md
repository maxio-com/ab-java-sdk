
# Product Price Point Error Response Exception

## Structure

`ProductPricePointErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`ProductPricePointErrors`](../../doc/models/product-price-point-errors.md) | Required | - | ProductPricePointErrors getErrors() | setErrors(ProductPricePointErrors errors) |

## Example

```java
try {
    // make the API call
} catch (ProductPricePointErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

