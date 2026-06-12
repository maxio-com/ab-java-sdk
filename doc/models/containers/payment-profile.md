
# Payment Profile

## Class Name

`PaymentProfile`

## Cases

| Type | Factory Method |
|  --- | --- |
| [`ApplePayPaymentProfile`](../../../doc/models/apple-pay-payment-profile.md) | PaymentProfile.fromApplePayPaymentProfile(ApplePayPaymentProfile applePayPaymentProfile) |
| [`BankAccountPaymentProfile`](../../../doc/models/bank-account-payment-profile.md) | PaymentProfile.fromBankAccountPaymentProfile(BankAccountPaymentProfile bankAccountPaymentProfile) |
| [`CreditCardPaymentProfile`](../../../doc/models/credit-card-payment-profile.md) | PaymentProfile.fromCreditCardPaymentProfile(CreditCardPaymentProfile creditCardPaymentProfile) |
| [`PaypalPaymentProfile`](../../../doc/models/paypal-payment-profile.md) | PaymentProfile.fromPaypalPaymentProfile(PaypalPaymentProfile paypalPaymentProfile) |

## ApplePayPaymentProfile

### Initialization Code

#### Example

```java
PaymentProfile.fromApplePayPaymentProfile(
        new ApplePayPaymentProfile.Builder(
            PaymentType.APPLE_PAY
        )
        .build()
    )
```

## BankAccountPaymentProfile

### Initialization Code

#### Example

```java
PaymentProfile.fromBankAccountPaymentProfile(
        new BankAccountPaymentProfile.Builder(
            PaymentType.BANK_ACCOUNT
        )
        .verified(false)
        .build()
    )
```

## CreditCardPaymentProfile

### Initialization Code

#### Example

```java
PaymentProfile.fromCreditCardPaymentProfile(
        new CreditCardPaymentProfile.Builder(
            PaymentType.CREDIT_CARD
        )
        .id(10088716)
        .firstName("Test")
        .lastName("Subscription")
        .maskedCardNumber("XXXX-XXXX-XXXX-1")
        .cardType(CardType.BOGUS)
        .expirationMonth(1)
        .expirationYear(2022)
        .customerId(14543792)
        .currentVault(CreditCardVault.BOGUS)
        .vaultToken("1")
        .billingAddress("123 Montana Way")
        .billingCity("Billings")
        .billingState("MT")
        .billingZip("59101")
        .billingCountry("US")
        .customerVaultToken("customer_vault_token2")
        .billingAddress2("")
        .siteGatewaySettingId(1)
        .gatewayHandle("gateway_handle8")
        .build()
    )
```

## PaypalPaymentProfile

### Initialization Code

#### Example

```java
PaymentProfile.fromPaypalPaymentProfile(
        new PaypalPaymentProfile.Builder(
            PaymentType.PAYPAL_ACCOUNT
        )
        .build()
    )
```

