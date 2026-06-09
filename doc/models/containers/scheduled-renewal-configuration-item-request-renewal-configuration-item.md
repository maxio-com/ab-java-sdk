
# Scheduled Renewal Configuration Item Request Renewal Configuration Item

## Class Name

`ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem`

## Cases

| Type | Factory Method |
|  --- | --- |
| [`ScheduledRenewalItemRequestBodyComponent`](../../../doc/models/scheduled-renewal-item-request-body-component.md) | ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem.fromScheduledRenewalItemRequestBodyComponent(ScheduledRenewalItemRequestBodyComponent scheduledRenewalItemRequestBodyComponent) |
| [`ScheduledRenewalItemRequestBodyProduct`](../../../doc/models/scheduled-renewal-item-request-body-product.md) | ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem.fromScheduledRenewalItemRequestBodyProduct(ScheduledRenewalItemRequestBodyProduct scheduledRenewalItemRequestBodyProduct) |

## ScheduledRenewalItemRequestBodyComponent

### Initialization Code

#### Example

```java
ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem.fromScheduledRenewalItemRequestBodyComponent(
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
ScheduledRenewalConfigurationItemRequestRenewalConfigurationItem.fromScheduledRenewalItemRequestBodyProduct(
        new ScheduledRenewalItemRequestBodyProduct.Builder(
            "Product",
            32
        )
        .build()
    )
```

