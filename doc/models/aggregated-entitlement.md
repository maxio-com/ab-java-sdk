
# Aggregated Entitlement

One entitlement in a subscriber's aggregated entitlements list. Entries are aggregated per feature key and periodicity window, not per feature key alone. A `usage_limit` feature granted with two different periodicities yields two entries sharing one `feature_key`. Use `periodicity_key` to identify an entry uniquely.

## Structure

`AggregatedEntitlement`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FeatureKey` | `String` | Optional | The feature's key, prefixed by kind: `feature.*` for `access_right`, `usage.*` for `usage_limit`, `service.*` for `service_right`. | String getFeatureKey() | setFeatureKey(String featureKey) |
| `PeriodicityKey` | `String` | Optional | Uniquely identifies this aggregated entry: the prefixed feature key, suffixed with `:{interval}:{unit}` when the entitlement has a periodicity window. Equal to `feature_key` when `periodicity` is `null`. | String getPeriodicityKey() | setPeriodicityKey(String periodicityKey) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Type` | [`FeatureKind`](../../doc/models/feature-kind.md) | Optional | The behavior of a feature:<br><br>- `access_right`: a boolean entitlement. A subscriber either has access or does not.<br>- `usage_limit`: a quantified allowance measured over a recurring period (for example, "10,000 API calls per month").<br>- `service_right`: a free-form value (text, boolean, or number) that isn't a simple access flag or a metered limit. | FeatureKind getType() | setType(FeatureKind type) |
| `Value` | [`AggregatedEntitlementValue`](../../doc/models/containers/aggregated-entitlement-value.md) | Optional | This is a container for one-of cases. | AggregatedEntitlementValue getValue() | setValue(AggregatedEntitlementValue value) |
| `Enabled` | `Boolean` | Optional | `true` only when the aggregated value is truthy for this feature's kind, and the subscription is in a live state (`active`, `trialing`, `assessing`, `past_due`, or `soft_failure`). `false` otherwise, including for `awaiting_signup`, canceled, expired, and on-hold subscriptions. Entitlements deliberately stay enabled through dunning. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `Periodicity` | [`AggregatedEntitlementPeriodicity`](../../doc/models/aggregated-entitlement-periodicity.md) | Optional | - | AggregatedEntitlementPeriodicity getPeriodicity() | setPeriodicity(AggregatedEntitlementPeriodicity periodicity) |
| `SourceProducts` | `List<String>` | Optional | The names of the products/components contributing to this entitlement. For `access_right` features, only contributors that granted `true` are listed. | List<String> getSourceProducts() | setSourceProducts(List<String> sourceProducts) |

## Example

```java
import com.maxio.advancedbilling.models.AggregatedEntitlement;
import com.maxio.advancedbilling.models.FeatureKind;
import com.maxio.advancedbilling.models.containers.AggregatedEntitlementValue;

AggregatedEntitlement aggregatedEntitlement = new AggregatedEntitlement.Builder()
    .featureKey("feature.sso")
    .periodicityKey("usage.api_calls:1:month")
    .name("name2")
    .type(FeatureKind.ACCESS_RIGHT)
    .value(AggregatedEntitlementValue.fromBoolean(
        true
    ))
    .build();
```

