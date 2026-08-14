
# Update Invoice

Attributes of a draft ad hoc invoice which can be updated. Only the submitted attributes are changed.

## Structure

`UpdateInvoice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LineItems` | [`List<UpdateInvoiceItem>`](../../doc/models/update-invoice-item.md) | Optional | Line item changes to apply. Line items without a `uid` are added, line items with a `uid` are updated, and line items with a `uid` and `_destroy` set to `true` are removed. Existing line items not referenced in the array remain unchanged. | List<UpdateInvoiceItem> getLineItems() | setLineItems(List<UpdateInvoiceItem> lineItems) |
| `IssueDate` | `LocalDate` | Optional | New issue date for the invoice (format YYYY-MM-DD). This date is interpreted and validated in your site's time zone. It must be today or a date in the past — future dates are not accepted. The due date is recalculated from the issue date and net terms. | LocalDate getIssueDate() | setIssueDate(LocalDate issueDate) |
| `NetTerms` | `Integer` | Optional | Number of days after the issue date on which the invoice is due. The due date is recalculated when net terms or the issue date change. | Integer getNetTerms() | setNetTerms(Integer netTerms) |
| `PaymentInstructions` | `String` | Optional | Custom payment instructions displayed on the invoice. | String getPaymentInstructions() | setPaymentInstructions(String paymentInstructions) |
| `Memo` | `String` | Optional | A custom memo displayed on the invoice. | String getMemo() | setMemo(String memo) |
| `SellerAddress` | [`CreateInvoiceAddress`](../../doc/models/create-invoice-address.md) | Optional | Replaces the seller address on the invoice | CreateInvoiceAddress getSellerAddress() | setSellerAddress(CreateInvoiceAddress sellerAddress) |
| `BillingAddress` | [`CreateInvoiceAddress`](../../doc/models/create-invoice-address.md) | Optional | Replaces the billing address on the invoice | CreateInvoiceAddress getBillingAddress() | setBillingAddress(CreateInvoiceAddress billingAddress) |
| `ShippingAddress` | [`CreateInvoiceAddress`](../../doc/models/create-invoice-address.md) | Optional | Replaces the shipping address on the invoice | CreateInvoiceAddress getShippingAddress() | setShippingAddress(CreateInvoiceAddress shippingAddress) |
| `Coupons` | [`List<CreateInvoiceCoupon>`](../../doc/models/create-invoice-coupon.md) | Optional | When present, replaces all discounts currently applied to the invoice. Send an empty array to remove all discounts. | List<CreateInvoiceCoupon> getCoupons() | setCoupons(List<CreateInvoiceCoupon> coupons) |

## Example

```java
import com.maxio.advancedbilling.DateTimeHelper;
import com.maxio.advancedbilling.models.UpdateInvoice;
import com.maxio.advancedbilling.models.UpdateInvoiceItem;
import com.maxio.advancedbilling.models.containers.UpdateInvoiceItemQuantity;
import com.maxio.advancedbilling.models.containers.UpdateInvoiceItemUnitPrice;
import java.util.Arrays;

UpdateInvoice updateInvoice = new UpdateInvoice.Builder()
    .lineItems(Arrays.asList(
        new UpdateInvoiceItem.Builder()
            .title("title4")
            .quantity(UpdateInvoiceItemQuantity.fromPrecision(
                56.68D
            ))
            .unitPrice(UpdateInvoiceItemUnitPrice.fromPrecision(
                39.9D
            ))
            .taxable(false)
            .taxCode("tax_code6")
            .build()
    ))
    .issueDate(DateTimeHelper.fromSimpleDate("2024-01-01"))
    .netTerms(46)
    .paymentInstructions("payment_instructions6")
    .memo("memo2")
    .build();
```

