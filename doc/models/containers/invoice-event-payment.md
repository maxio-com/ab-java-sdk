
# Invoice Event Payment

A nested data structure detailing the method of payment

## Class Name

`InvoiceEventPayment`

## Cases

| Type | Factory Method |
|  --- | --- |
| [`PaymentMethodApplePay`](../../../doc/models/payment-method-apple-pay.md) | InvoiceEventPayment.fromPaymentMethodApplePay(PaymentMethodApplePay paymentMethodApplePay) |
| [`PaymentMethodBankAccount`](../../../doc/models/payment-method-bank-account.md) | InvoiceEventPayment.fromPaymentMethodBankAccount(PaymentMethodBankAccount paymentMethodBankAccount) |
| [`PaymentMethodCreditCard`](../../../doc/models/payment-method-credit-card.md) | InvoiceEventPayment.fromPaymentMethodCreditCard(PaymentMethodCreditCard paymentMethodCreditCard) |
| [`PaymentMethodExternal`](../../../doc/models/payment-method-external.md) | InvoiceEventPayment.fromPaymentMethodExternal(PaymentMethodExternal paymentMethodExternal) |
| [`PaymentMethodPaypal`](../../../doc/models/payment-method-paypal.md) | InvoiceEventPayment.fromPaymentMethodPaypal(PaymentMethodPaypal paymentMethodPaypal) |

## PaymentMethodApplePay

### Initialization Code

#### Example

```java
InvoiceEventPayment.fromPaymentMethodApplePay(
        new PaymentMethodApplePay.Builder(
            InvoiceEventPaymentMethod.APPLE_PAY
        )
        .build()
    )
```

## PaymentMethodBankAccount

### Initialization Code

#### Example

```java
InvoiceEventPayment.fromPaymentMethodBankAccount(
        new PaymentMethodBankAccount.Builder(
            "masked_account_number2",
            "masked_routing_number2",
            InvoiceEventPaymentMethod.BANK_ACCOUNT
        )
        .build()
    )
```

## PaymentMethodCreditCard

### Initialization Code

#### Example

```java
InvoiceEventPayment.fromPaymentMethodCreditCard(
        new PaymentMethodCreditCard.Builder(
            "card_brand4",
            "masked_card_number0",
            InvoiceEventPaymentMethod.CREDIT_CARD
        )
        .build()
    )
```

## PaymentMethodExternal

### Initialization Code

#### Example

```java
InvoiceEventPayment.fromPaymentMethodExternal(
        new PaymentMethodExternal.Builder(
            "details4",
            "kind2",
            "memo8",
            InvoiceEventPaymentMethod.EXTERNAL
        )
        .build()
    )
```

## PaymentMethodPaypal

### Initialization Code

#### Example

```java
InvoiceEventPayment.fromPaymentMethodPaypal(
        new PaymentMethodPaypal.Builder(
            "email2",
            InvoiceEventPaymentMethod.PAYPAL_ACCOUNT
        )
        .build()
    )
```

