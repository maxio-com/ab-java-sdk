
# Bank Account Verification Request

## Structure

`BankAccountVerificationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BankAccountVerification` | [`BankAccountVerification`](../../doc/models/bank-account-verification.md) | Required | - | BankAccountVerification getBankAccountVerification() | setBankAccountVerification(BankAccountVerification bankAccountVerification) |

## Example (as JSON)

```json
{
  "bank_account_verification": {
    "deposit_1_in_cents": 244,
    "deposit_2_in_cents": 6
  }
}
```

