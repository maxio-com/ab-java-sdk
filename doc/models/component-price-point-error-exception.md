
# Component Price Point Error Exception

## Structure

`ComponentPricePointErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Errors` | [`List<ComponentPricePointErrorItem>`](../../doc/models/component-price-point-error-item.md) | Optional | - | List<ComponentPricePointErrorItem> getErrors() | setErrors(List<ComponentPricePointErrorItem> errors) |

## Example

```java
try {
    // make the API call
} catch (ComponentPricePointErrorException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

