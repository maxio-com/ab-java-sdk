
# Get One Time Token Request Payment Profile

## Class Name

`GetOneTimeTokenRequestPaymentProfile`

## Cases

| Type | Factory Method |
|  --- | --- |
| [`GetOneTimeTokenPaymentProfile`](../../../doc/models/get-one-time-token-payment-profile.md) | GetOneTimeTokenRequestPaymentProfile.fromGetOneTimeTokenPaymentProfile(GetOneTimeTokenPaymentProfile getOneTimeTokenPaymentProfile) |
| [`GetOneTimeTokenBankAccountPaymentProfile`](../../../doc/models/get-one-time-token-bank-account-payment-profile.md) | GetOneTimeTokenRequestPaymentProfile.fromGetOneTimeTokenBankAccountPaymentProfile(GetOneTimeTokenBankAccountPaymentProfile getOneTimeTokenBankAccountPaymentProfile) |

## GetOneTimeTokenPaymentProfile

### Initialization Code

#### Example

```java
GetOneTimeTokenRequestPaymentProfile.fromGetOneTimeTokenPaymentProfile(
        new GetOneTimeTokenPaymentProfile.Builder(
            "first_name2",
            "last_name0",
            "masked_card_number0",
            CardType.ROUTEX,
            187.78D,
            164.44D,
            CreditCardVault.BRAINTREE_BLUE,
            "vault_token4",
            "billing_address4",
            "billing_city0",
            "billing_country6",
            "billing_state6",
            "billing_zip0",
            "payment_type2",
            false,
            232
        )
        .build()
    )
```

## GetOneTimeTokenBankAccountPaymentProfile

### Initialization Code

#### Example

```java
GetOneTimeTokenRequestPaymentProfile.fromGetOneTimeTokenBankAccountPaymentProfile(
        new GetOneTimeTokenBankAccountPaymentProfile.Builder(
            "first_name8",
            "last_name6",
            BankAccountVault.MAXP,
            "vault_token0",
            "billing_address0",
            "billing_city4",
            "billing_country2",
            "billing_state8",
            "billing_zip6",
            "bank_name6",
            "masked_bank_routing_number6",
            "masked_bank_account_number0",
            BankAccountType.CHECKING,
            BankAccountHolderType.PERSONAL,
            "payment_type2",
            false,
            254
        )
        .build()
    )
```

