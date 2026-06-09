
# Scheduled Renewal Update Request Renewal Configuration Item

## Class Name

`ScheduledRenewalUpdateRequestRenewalConfigurationItem`

## Cases

| Type | Factory Method |
|  --- | --- |
| [`ScheduledRenewalItemRequestBodyComponent`](../../../doc/models/scheduled-renewal-item-request-body-component.md) | ScheduledRenewalUpdateRequestRenewalConfigurationItem.fromScheduledRenewalItemRequestBodyComponent(ScheduledRenewalItemRequestBodyComponent scheduledRenewalItemRequestBodyComponent) |
| [`ScheduledRenewalItemRequestBodyProduct`](../../../doc/models/scheduled-renewal-item-request-body-product.md) | ScheduledRenewalUpdateRequestRenewalConfigurationItem.fromScheduledRenewalItemRequestBodyProduct(ScheduledRenewalItemRequestBodyProduct scheduledRenewalItemRequestBodyProduct) |

## ScheduledRenewalItemRequestBodyComponent

### Initialization Code

#### Example

```java
ScheduledRenewalUpdateRequestRenewalConfigurationItem.fromScheduledRenewalItemRequestBodyComponent(
        new ScheduledRenewalItemRequestBodyComponent.Builder(
            "Component",
            108
        )
        .build()
    )
```

## ScheduledRenewalItemRequestBodyProduct

### Initialization Code

#### Example

```java
ScheduledRenewalUpdateRequestRenewalConfigurationItem.fromScheduledRenewalItemRequestBodyProduct(
        new ScheduledRenewalItemRequestBodyProduct.Builder(
            "Product",
            32
        )
        .build()
    )
```

