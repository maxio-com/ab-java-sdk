
# Aggregated Entitlements Response

## Structure

`AggregatedEntitlementsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SubscriptionId` | `int` | Required | - | int getSubscriptionId() | setSubscriptionId(int subscriptionId) |
| `CustomerId` | `int` | Required | - | int getCustomerId() | setCustomerId(int customerId) |
| `Status` | `String` | Required | The subscription's current state, e.g. `active`, `trialing`, `canceled`. | String getStatus() | setStatus(String status) |
| `Entitlements` | [`List<AggregatedEntitlement>`](../../doc/models/aggregated-entitlement.md) | Required | - | List<AggregatedEntitlement> getEntitlements() | setEntitlements(List<AggregatedEntitlement> entitlements) |

## Example

```java
import com.maxio.advancedbilling.models.AggregatedEntitlement;
import com.maxio.advancedbilling.models.AggregatedEntitlementsResponse;
import com.maxio.advancedbilling.models.FeatureKind;
import com.maxio.advancedbilling.models.containers.AggregatedEntitlementValue;
import java.util.Arrays;

AggregatedEntitlementsResponse aggregatedEntitlementsResponse = new AggregatedEntitlementsResponse.Builder(
    114,
    42,
    "status6",
    Arrays.asList(
        new AggregatedEntitlement.Builder()
            .featureKey("feature.sso")
            .periodicityKey("usage.api_calls:1:month")
            .name("name6")
            .type(FeatureKind.SERVICE_RIGHT)
            .value(AggregatedEntitlementValue.fromBoolean(
                true
            ))
            .build()
    )
)
.build();
```

