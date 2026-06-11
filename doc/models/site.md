
# Site

## Structure

`Site`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Subdomain` | `String` | Optional | - | String getSubdomain() | setSubdomain(String subdomain) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `SellerId` | `Integer` | Optional | - | Integer getSellerId() | setSellerId(Integer sellerId) |
| `NonPrimaryCurrencies` | `List<String>` | Optional | - | List<String> getNonPrimaryCurrencies() | setNonPrimaryCurrencies(List<String> nonPrimaryCurrencies) |
| `RelationshipInvoicingEnabled` | `Boolean` | Optional | - | Boolean getRelationshipInvoicingEnabled() | setRelationshipInvoicingEnabled(Boolean relationshipInvoicingEnabled) |
| `ScheduleSubscriptionCancellationEnabled` | `Boolean` | Optional | - | Boolean getScheduleSubscriptionCancellationEnabled() | setScheduleSubscriptionCancellationEnabled(Boolean scheduleSubscriptionCancellationEnabled) |
| `CustomerHierarchyEnabled` | `Boolean` | Optional | - | Boolean getCustomerHierarchyEnabled() | setCustomerHierarchyEnabled(Boolean customerHierarchyEnabled) |
| `WhopaysEnabled` | `Boolean` | Optional | - | Boolean getWhopaysEnabled() | setWhopaysEnabled(Boolean whopaysEnabled) |
| `WhopaysDefaultPayer` | `String` | Optional | - | String getWhopaysDefaultPayer() | setWhopaysDefaultPayer(String whopaysDefaultPayer) |
| `AllocationSettings` | [`AllocationSettings`](../../doc/models/allocation-settings.md) | Optional | - | AllocationSettings getAllocationSettings() | setAllocationSettings(AllocationSettings allocationSettings) |
| `DefaultPaymentCollectionMethod` | `String` | Optional | - | String getDefaultPaymentCollectionMethod() | setDefaultPaymentCollectionMethod(String defaultPaymentCollectionMethod) |
| `OrganizationAddress` | [`OrganizationAddress`](../../doc/models/organization-address.md) | Optional | - | OrganizationAddress getOrganizationAddress() | setOrganizationAddress(OrganizationAddress organizationAddress) |
| `TaxConfiguration` | [`TaxConfiguration`](../../doc/models/tax-configuration.md) | Optional | - | TaxConfiguration getTaxConfiguration() | setTaxConfiguration(TaxConfiguration taxConfiguration) |
| `NetTerms` | [`NetTerms`](../../doc/models/net-terms.md) | Optional | - | NetTerms getNetTerms() | setNetTerms(NetTerms netTerms) |
| `MultiFrequencyEnabled` | `Boolean` | Optional | Whether the site has the multi-frequency billing feature enabled. Only present when relationship invoicing is active. | Boolean getMultiFrequencyEnabled() | setMultiFrequencyEnabled(Boolean multiFrequencyEnabled) |
| `AutoRenewalsEnabled` | `Boolean` | Optional | Whether the auto-renewals feature is enabled for this site. | Boolean getAutoRenewalsEnabled() | setAutoRenewalsEnabled(Boolean autoRenewalsEnabled) |
| `PortalEnabled` | `Boolean` | Optional | Whether the Billing Portal is enabled for this site. | Boolean getPortalEnabled() | setPortalEnabled(Boolean portalEnabled) |
| `Test` | `Boolean` | Optional | - | Boolean getTest() | setTest(Boolean test) |

## Example (as JSON)

```json
{
  "id": 34,
  "name": "name0",
  "subdomain": "subdomain4",
  "currency": "currency0",
  "seller_id": 198
}
```

