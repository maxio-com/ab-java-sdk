
# Subscription Migration Preview

## Structure

`SubscriptionMigrationPreview`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProratedAdjustmentInCents` | `Long` | Optional | The amount of the prorated adjustment that would be issued for the current subscription. | Long getProratedAdjustmentInCents() | setProratedAdjustmentInCents(Long proratedAdjustmentInCents) |
| `ChargeInCents` | `Long` | Optional | The amount of the charge that would be created for the new product. | Long getChargeInCents() | setChargeInCents(Long chargeInCents) |
| `PaymentDueInCents` | `Long` | Optional | The amount of the payment due in the case of an upgrade. | Long getPaymentDueInCents() | setPaymentDueInCents(Long paymentDueInCents) |
| `CreditAppliedInCents` | `Long` | Optional | Represents a credit in cents that is applied to your subscription as part of a migration process for a specific product, which reduces the amount owed for the subscription. | Long getCreditAppliedInCents() | setCreditAppliedInCents(Long creditAppliedInCents) |

## Example (as JSON)

```json
{
  "prorated_adjustment_in_cents": 134,
  "charge_in_cents": 16,
  "payment_due_in_cents": 188,
  "credit_applied_in_cents": 148
}
```

