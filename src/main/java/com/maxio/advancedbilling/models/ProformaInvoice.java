/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * This is a model class for ProformaInvoice type.
 */
public class ProformaInvoice
        extends BaseModel {
    private String uid;
    private Integer siteId;
    private OptionalNullable<Integer> customerId;
    private OptionalNullable<Integer> subscriptionId;
    private OptionalNullable<Integer> number;
    private OptionalNullable<Integer> sequenceNumber;
    private ZonedDateTime createdAt;
    private LocalDate deliveryDate;
    private ProformaInvoiceStatus status;
    private CollectionMethod collectionMethod;
    private String paymentInstructions;
    private String currency;
    private InvoiceConsolidationLevel consolidationLevel;
    private String productName;
    private String productFamilyName;
    private ProformaInvoiceRole role;
    private InvoiceSeller seller;
    private InvoiceCustomer customer;
    private String memo;
    private InvoiceAddress billingAddress;
    private InvoiceAddress shippingAddress;
    private String subtotalAmount;
    private String discountAmount;
    private String taxAmount;
    private String totalAmount;
    private String creditAmount;
    private String paidAmount;
    private String refundAmount;
    private String dueAmount;
    private List<InvoiceLineItem> lineItems;
    private List<ProformaInvoiceDiscount> discounts;
    private List<ProformaInvoiceTax> taxes;
    private List<ProformaInvoiceCredit> credits;
    private List<ProformaInvoicePayment> payments;
    private List<InvoiceCustomField> customFields;
    private OptionalNullable<String> publicUrl;

    /**
     * Default constructor.
     */
    public ProformaInvoice() {
        collectionMethod = CollectionMethod.AUTOMATIC;
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  siteId  Integer value for siteId.
     * @param  customerId  Integer value for customerId.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  number  Integer value for number.
     * @param  sequenceNumber  Integer value for sequenceNumber.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  deliveryDate  LocalDate value for deliveryDate.
     * @param  status  ProformaInvoiceStatus value for status.
     * @param  collectionMethod  CollectionMethod value for collectionMethod.
     * @param  paymentInstructions  String value for paymentInstructions.
     * @param  currency  String value for currency.
     * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
     * @param  productName  String value for productName.
     * @param  productFamilyName  String value for productFamilyName.
     * @param  role  ProformaInvoiceRole value for role.
     * @param  seller  InvoiceSeller value for seller.
     * @param  customer  InvoiceCustomer value for customer.
     * @param  memo  String value for memo.
     * @param  billingAddress  InvoiceAddress value for billingAddress.
     * @param  shippingAddress  InvoiceAddress value for shippingAddress.
     * @param  subtotalAmount  String value for subtotalAmount.
     * @param  discountAmount  String value for discountAmount.
     * @param  taxAmount  String value for taxAmount.
     * @param  totalAmount  String value for totalAmount.
     * @param  creditAmount  String value for creditAmount.
     * @param  paidAmount  String value for paidAmount.
     * @param  refundAmount  String value for refundAmount.
     * @param  dueAmount  String value for dueAmount.
     * @param  lineItems  List of InvoiceLineItem value for lineItems.
     * @param  discounts  List of ProformaInvoiceDiscount value for discounts.
     * @param  taxes  List of ProformaInvoiceTax value for taxes.
     * @param  credits  List of ProformaInvoiceCredit value for credits.
     * @param  payments  List of ProformaInvoicePayment value for payments.
     * @param  customFields  List of InvoiceCustomField value for customFields.
     * @param  publicUrl  String value for publicUrl.
     */
    public ProformaInvoice(
            String uid,
            Integer siteId,
            Integer customerId,
            Integer subscriptionId,
            Integer number,
            Integer sequenceNumber,
            ZonedDateTime createdAt,
            LocalDate deliveryDate,
            ProformaInvoiceStatus status,
            CollectionMethod collectionMethod,
            String paymentInstructions,
            String currency,
            InvoiceConsolidationLevel consolidationLevel,
            String productName,
            String productFamilyName,
            ProformaInvoiceRole role,
            InvoiceSeller seller,
            InvoiceCustomer customer,
            String memo,
            InvoiceAddress billingAddress,
            InvoiceAddress shippingAddress,
            String subtotalAmount,
            String discountAmount,
            String taxAmount,
            String totalAmount,
            String creditAmount,
            String paidAmount,
            String refundAmount,
            String dueAmount,
            List<InvoiceLineItem> lineItems,
            List<ProformaInvoiceDiscount> discounts,
            List<ProformaInvoiceTax> taxes,
            List<ProformaInvoiceCredit> credits,
            List<ProformaInvoicePayment> payments,
            List<InvoiceCustomField> customFields,
            String publicUrl) {
        this.uid = uid;
        this.siteId = siteId;
        this.customerId = OptionalNullable.of(customerId);
        this.subscriptionId = OptionalNullable.of(subscriptionId);
        this.number = OptionalNullable.of(number);
        this.sequenceNumber = OptionalNullable.of(sequenceNumber);
        this.createdAt = createdAt;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.collectionMethod = collectionMethod;
        this.paymentInstructions = paymentInstructions;
        this.currency = currency;
        this.consolidationLevel = consolidationLevel;
        this.productName = productName;
        this.productFamilyName = productFamilyName;
        this.role = role;
        this.seller = seller;
        this.customer = customer;
        this.memo = memo;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.subtotalAmount = subtotalAmount;
        this.discountAmount = discountAmount;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount;
        this.creditAmount = creditAmount;
        this.paidAmount = paidAmount;
        this.refundAmount = refundAmount;
        this.dueAmount = dueAmount;
        this.lineItems = lineItems;
        this.discounts = discounts;
        this.taxes = taxes;
        this.credits = credits;
        this.payments = payments;
        this.customFields = customFields;
        this.publicUrl = OptionalNullable.of(publicUrl);
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  siteId  Integer value for siteId.
     * @param  customerId  Integer value for customerId.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  number  Integer value for number.
     * @param  sequenceNumber  Integer value for sequenceNumber.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  deliveryDate  LocalDate value for deliveryDate.
     * @param  status  ProformaInvoiceStatus value for status.
     * @param  collectionMethod  CollectionMethod value for collectionMethod.
     * @param  paymentInstructions  String value for paymentInstructions.
     * @param  currency  String value for currency.
     * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
     * @param  productName  String value for productName.
     * @param  productFamilyName  String value for productFamilyName.
     * @param  role  ProformaInvoiceRole value for role.
     * @param  seller  InvoiceSeller value for seller.
     * @param  customer  InvoiceCustomer value for customer.
     * @param  memo  String value for memo.
     * @param  billingAddress  InvoiceAddress value for billingAddress.
     * @param  shippingAddress  InvoiceAddress value for shippingAddress.
     * @param  subtotalAmount  String value for subtotalAmount.
     * @param  discountAmount  String value for discountAmount.
     * @param  taxAmount  String value for taxAmount.
     * @param  totalAmount  String value for totalAmount.
     * @param  creditAmount  String value for creditAmount.
     * @param  paidAmount  String value for paidAmount.
     * @param  refundAmount  String value for refundAmount.
     * @param  dueAmount  String value for dueAmount.
     * @param  lineItems  List of InvoiceLineItem value for lineItems.
     * @param  discounts  List of ProformaInvoiceDiscount value for discounts.
     * @param  taxes  List of ProformaInvoiceTax value for taxes.
     * @param  credits  List of ProformaInvoiceCredit value for credits.
     * @param  payments  List of ProformaInvoicePayment value for payments.
     * @param  customFields  List of InvoiceCustomField value for customFields.
     * @param  publicUrl  String value for publicUrl.
     */

    protected ProformaInvoice(String uid, Integer siteId, OptionalNullable<Integer> customerId,
            OptionalNullable<Integer> subscriptionId, OptionalNullable<Integer> number,
            OptionalNullable<Integer> sequenceNumber, ZonedDateTime createdAt,
            LocalDate deliveryDate, ProformaInvoiceStatus status, CollectionMethod collectionMethod,
            String paymentInstructions, String currency,
            InvoiceConsolidationLevel consolidationLevel, String productName,
            String productFamilyName, ProformaInvoiceRole role, InvoiceSeller seller,
            InvoiceCustomer customer, String memo, InvoiceAddress billingAddress,
            InvoiceAddress shippingAddress, String subtotalAmount, String discountAmount,
            String taxAmount, String totalAmount, String creditAmount, String paidAmount,
            String refundAmount, String dueAmount, List<InvoiceLineItem> lineItems,
            List<ProformaInvoiceDiscount> discounts, List<ProformaInvoiceTax> taxes,
            List<ProformaInvoiceCredit> credits, List<ProformaInvoicePayment> payments,
            List<InvoiceCustomField> customFields, OptionalNullable<String> publicUrl) {
        this.uid = uid;
        this.siteId = siteId;
        this.customerId = customerId;
        this.subscriptionId = subscriptionId;
        this.number = number;
        this.sequenceNumber = sequenceNumber;
        this.createdAt = createdAt;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.collectionMethod = collectionMethod;
        this.paymentInstructions = paymentInstructions;
        this.currency = currency;
        this.consolidationLevel = consolidationLevel;
        this.productName = productName;
        this.productFamilyName = productFamilyName;
        this.role = role;
        this.seller = seller;
        this.customer = customer;
        this.memo = memo;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.subtotalAmount = subtotalAmount;
        this.discountAmount = discountAmount;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount;
        this.creditAmount = creditAmount;
        this.paidAmount = paidAmount;
        this.refundAmount = refundAmount;
        this.dueAmount = dueAmount;
        this.lineItems = lineItems;
        this.discounts = discounts;
        this.taxes = taxes;
        this.credits = credits;
        this.payments = payments;
        this.customFields = customFields;
        this.publicUrl = publicUrl;
    }

    /**
     * Getter for Uid.
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Getter for SiteId.
     * @return Returns the Integer
     */
    @JsonGetter("site_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * Setter for SiteId.
     * @param siteId Value for Integer
     */
    @JsonSetter("site_id")
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * Internal Getter for CustomerId.
     * @return Returns the Internal Integer
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetCustomerId() {
        return this.customerId;
    }

    /**
     * Getter for CustomerId.
     * @return Returns the Integer
     */
    public Integer getCustomerId() {
        return OptionalNullable.getFrom(customerId);
    }

    /**
     * Setter for CustomerId.
     * @param customerId Value for Integer
     */
    @JsonSetter("customer_id")
    public void setCustomerId(Integer customerId) {
        this.customerId = OptionalNullable.of(customerId);
    }

    /**
     * UnSetter for CustomerId.
     */
    public void unsetCustomerId() {
        customerId = null;
    }

    /**
     * Internal Getter for SubscriptionId.
     * @return Returns the Internal Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Getter for SubscriptionId.
     * @return Returns the Integer
     */
    public Integer getSubscriptionId() {
        return OptionalNullable.getFrom(subscriptionId);
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = OptionalNullable.of(subscriptionId);
    }

    /**
     * UnSetter for SubscriptionId.
     */
    public void unsetSubscriptionId() {
        subscriptionId = null;
    }

    /**
     * Internal Getter for Number.
     * @return Returns the Internal Integer
     */
    @JsonGetter("number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetNumber() {
        return this.number;
    }

    /**
     * Getter for Number.
     * @return Returns the Integer
     */
    public Integer getNumber() {
        return OptionalNullable.getFrom(number);
    }

    /**
     * Setter for Number.
     * @param number Value for Integer
     */
    @JsonSetter("number")
    public void setNumber(Integer number) {
        this.number = OptionalNullable.of(number);
    }

    /**
     * UnSetter for Number.
     */
    public void unsetNumber() {
        number = null;
    }

    /**
     * Internal Getter for SequenceNumber.
     * @return Returns the Internal Integer
     */
    @JsonGetter("sequence_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * Getter for SequenceNumber.
     * @return Returns the Integer
     */
    public Integer getSequenceNumber() {
        return OptionalNullable.getFrom(sequenceNumber);
    }

    /**
     * Setter for SequenceNumber.
     * @param sequenceNumber Value for Integer
     */
    @JsonSetter("sequence_number")
    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = OptionalNullable.of(sequenceNumber);
    }

    /**
     * UnSetter for SequenceNumber.
     */
    public void unsetSequenceNumber() {
        sequenceNumber = null;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for ZonedDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for DeliveryDate.
     * @return Returns the LocalDate
     */
    @JsonGetter("delivery_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Setter for DeliveryDate.
     * @param deliveryDate Value for LocalDate
     */
    @JsonSetter("delivery_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    /**
     * Getter for Status.
     * @return Returns the ProformaInvoiceStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProformaInvoiceStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for ProformaInvoiceStatus
     */
    @JsonSetter("status")
    public void setStatus(ProformaInvoiceStatus status) {
        this.status = status;
    }

    /**
     * Getter for CollectionMethod.
     * The type of payment collection to be used in the subscription. For legacy Statements
     * Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing
     * Architecture valid options are - `remittance`, `automatic`, `prepaid`.
     * @return Returns the CollectionMethod
     */
    @JsonGetter("collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CollectionMethod getCollectionMethod() {
        return collectionMethod;
    }

    /**
     * Setter for CollectionMethod.
     * The type of payment collection to be used in the subscription. For legacy Statements
     * Architecture valid options are - `invoice`, `automatic`. For current Relationship Invoicing
     * Architecture valid options are - `remittance`, `automatic`, `prepaid`.
     * @param collectionMethod Value for CollectionMethod
     */
    @JsonSetter("collection_method")
    public void setCollectionMethod(CollectionMethod collectionMethod) {
        this.collectionMethod = collectionMethod;
    }

    /**
     * Getter for PaymentInstructions.
     * @return Returns the String
     */
    @JsonGetter("payment_instructions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaymentInstructions() {
        return paymentInstructions;
    }

    /**
     * Setter for PaymentInstructions.
     * @param paymentInstructions Value for String
     */
    @JsonSetter("payment_instructions")
    public void setPaymentInstructions(String paymentInstructions) {
        this.paymentInstructions = paymentInstructions;
    }

    /**
     * Getter for Currency.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for ConsolidationLevel.
     * Consolidation level of the invoice, which is applicable to invoice consolidation. It will
     * hold one of the following values: * "none": A normal invoice with no consolidation. *
     * "child": An invoice segment which has been combined into a consolidated invoice. * "parent":
     * A consolidated invoice, whose contents are composed of invoice segments. "Parent" invoices do
     * not have lines of their own, but they have subtotals and totals which aggregate the member
     * invoice segments. See also the [invoice consolidation
     * documentation](https://chargify.zendesk.com/hc/en-us/articles/4407746391835).
     * @return Returns the InvoiceConsolidationLevel
     */
    @JsonGetter("consolidation_level")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceConsolidationLevel getConsolidationLevel() {
        return consolidationLevel;
    }

    /**
     * Setter for ConsolidationLevel.
     * Consolidation level of the invoice, which is applicable to invoice consolidation. It will
     * hold one of the following values: * "none": A normal invoice with no consolidation. *
     * "child": An invoice segment which has been combined into a consolidated invoice. * "parent":
     * A consolidated invoice, whose contents are composed of invoice segments. "Parent" invoices do
     * not have lines of their own, but they have subtotals and totals which aggregate the member
     * invoice segments. See also the [invoice consolidation
     * documentation](https://chargify.zendesk.com/hc/en-us/articles/4407746391835).
     * @param consolidationLevel Value for InvoiceConsolidationLevel
     */
    @JsonSetter("consolidation_level")
    public void setConsolidationLevel(InvoiceConsolidationLevel consolidationLevel) {
        this.consolidationLevel = consolidationLevel;
    }

    /**
     * Getter for ProductName.
     * @return Returns the String
     */
    @JsonGetter("product_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductName() {
        return productName;
    }

    /**
     * Setter for ProductName.
     * @param productName Value for String
     */
    @JsonSetter("product_name")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Getter for ProductFamilyName.
     * @return Returns the String
     */
    @JsonGetter("product_family_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductFamilyName() {
        return productFamilyName;
    }

    /**
     * Setter for ProductFamilyName.
     * @param productFamilyName Value for String
     */
    @JsonSetter("product_family_name")
    public void setProductFamilyName(String productFamilyName) {
        this.productFamilyName = productFamilyName;
    }

    /**
     * Getter for Role.
     * 'proforma' value is deprecated in favor of proforma_adhoc and proforma_automatic
     * @return Returns the ProformaInvoiceRole
     */
    @JsonGetter("role")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProformaInvoiceRole getRole() {
        return role;
    }

    /**
     * Setter for Role.
     * 'proforma' value is deprecated in favor of proforma_adhoc and proforma_automatic
     * @param role Value for ProformaInvoiceRole
     */
    @JsonSetter("role")
    public void setRole(ProformaInvoiceRole role) {
        this.role = role;
    }

    /**
     * Getter for Seller.
     * Information about the seller (merchant) listed on the masthead of the invoice.
     * @return Returns the InvoiceSeller
     */
    @JsonGetter("seller")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceSeller getSeller() {
        return seller;
    }

    /**
     * Setter for Seller.
     * Information about the seller (merchant) listed on the masthead of the invoice.
     * @param seller Value for InvoiceSeller
     */
    @JsonSetter("seller")
    public void setSeller(InvoiceSeller seller) {
        this.seller = seller;
    }

    /**
     * Getter for Customer.
     * Information about the customer who is owner or recipient the invoiced subscription.
     * @return Returns the InvoiceCustomer
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceCustomer getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * Information about the customer who is owner or recipient the invoiced subscription.
     * @param customer Value for InvoiceCustomer
     */
    @JsonSetter("customer")
    public void setCustomer(InvoiceCustomer customer) {
        this.customer = customer;
    }

    /**
     * Getter for Memo.
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for BillingAddress.
     * @return Returns the InvoiceAddress
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * @param billingAddress Value for InvoiceAddress
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(InvoiceAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for ShippingAddress.
     * @return Returns the InvoiceAddress
     */
    @JsonGetter("shipping_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Setter for ShippingAddress.
     * @param shippingAddress Value for InvoiceAddress
     */
    @JsonSetter("shipping_address")
    public void setShippingAddress(InvoiceAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * Getter for SubtotalAmount.
     * @return Returns the String
     */
    @JsonGetter("subtotal_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubtotalAmount() {
        return subtotalAmount;
    }

    /**
     * Setter for SubtotalAmount.
     * @param subtotalAmount Value for String
     */
    @JsonSetter("subtotal_amount")
    public void setSubtotalAmount(String subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }

    /**
     * Getter for DiscountAmount.
     * @return Returns the String
     */
    @JsonGetter("discount_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Setter for DiscountAmount.
     * @param discountAmount Value for String
     */
    @JsonSetter("discount_amount")
    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * Getter for TaxAmount.
     * @return Returns the String
     */
    @JsonGetter("tax_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Setter for TaxAmount.
     * @param taxAmount Value for String
     */
    @JsonSetter("tax_amount")
    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * Getter for TotalAmount.
     * @return Returns the String
     */
    @JsonGetter("total_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Setter for TotalAmount.
     * @param totalAmount Value for String
     */
    @JsonSetter("total_amount")
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Getter for CreditAmount.
     * @return Returns the String
     */
    @JsonGetter("credit_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreditAmount() {
        return creditAmount;
    }

    /**
     * Setter for CreditAmount.
     * @param creditAmount Value for String
     */
    @JsonSetter("credit_amount")
    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    /**
     * Getter for PaidAmount.
     * @return Returns the String
     */
    @JsonGetter("paid_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaidAmount() {
        return paidAmount;
    }

    /**
     * Setter for PaidAmount.
     * @param paidAmount Value for String
     */
    @JsonSetter("paid_amount")
    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * Getter for RefundAmount.
     * @return Returns the String
     */
    @JsonGetter("refund_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRefundAmount() {
        return refundAmount;
    }

    /**
     * Setter for RefundAmount.
     * @param refundAmount Value for String
     */
    @JsonSetter("refund_amount")
    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * Getter for DueAmount.
     * @return Returns the String
     */
    @JsonGetter("due_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDueAmount() {
        return dueAmount;
    }

    /**
     * Setter for DueAmount.
     * @param dueAmount Value for String
     */
    @JsonSetter("due_amount")
    public void setDueAmount(String dueAmount) {
        this.dueAmount = dueAmount;
    }

    /**
     * Getter for LineItems.
     * @return Returns the List of InvoiceLineItem
     */
    @JsonGetter("line_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceLineItem> getLineItems() {
        return lineItems;
    }

    /**
     * Setter for LineItems.
     * @param lineItems Value for List of InvoiceLineItem
     */
    @JsonSetter("line_items")
    public void setLineItems(List<InvoiceLineItem> lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * Getter for Discounts.
     * @return Returns the List of ProformaInvoiceDiscount
     */
    @JsonGetter("discounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ProformaInvoiceDiscount> getDiscounts() {
        return discounts;
    }

    /**
     * Setter for Discounts.
     * @param discounts Value for List of ProformaInvoiceDiscount
     */
    @JsonSetter("discounts")
    public void setDiscounts(List<ProformaInvoiceDiscount> discounts) {
        this.discounts = discounts;
    }

    /**
     * Getter for Taxes.
     * @return Returns the List of ProformaInvoiceTax
     */
    @JsonGetter("taxes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ProformaInvoiceTax> getTaxes() {
        return taxes;
    }

    /**
     * Setter for Taxes.
     * @param taxes Value for List of ProformaInvoiceTax
     */
    @JsonSetter("taxes")
    public void setTaxes(List<ProformaInvoiceTax> taxes) {
        this.taxes = taxes;
    }

    /**
     * Getter for Credits.
     * @return Returns the List of ProformaInvoiceCredit
     */
    @JsonGetter("credits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ProformaInvoiceCredit> getCredits() {
        return credits;
    }

    /**
     * Setter for Credits.
     * @param credits Value for List of ProformaInvoiceCredit
     */
    @JsonSetter("credits")
    public void setCredits(List<ProformaInvoiceCredit> credits) {
        this.credits = credits;
    }

    /**
     * Getter for Payments.
     * @return Returns the List of ProformaInvoicePayment
     */
    @JsonGetter("payments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ProformaInvoicePayment> getPayments() {
        return payments;
    }

    /**
     * Setter for Payments.
     * @param payments Value for List of ProformaInvoicePayment
     */
    @JsonSetter("payments")
    public void setPayments(List<ProformaInvoicePayment> payments) {
        this.payments = payments;
    }

    /**
     * Getter for CustomFields.
     * @return Returns the List of InvoiceCustomField
     */
    @JsonGetter("custom_fields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceCustomField> getCustomFields() {
        return customFields;
    }

    /**
     * Setter for CustomFields.
     * @param customFields Value for List of InvoiceCustomField
     */
    @JsonSetter("custom_fields")
    public void setCustomFields(List<InvoiceCustomField> customFields) {
        this.customFields = customFields;
    }

    /**
     * Internal Getter for PublicUrl.
     * @return Returns the Internal String
     */
    @JsonGetter("public_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPublicUrl() {
        return this.publicUrl;
    }

    /**
     * Getter for PublicUrl.
     * @return Returns the String
     */
    public String getPublicUrl() {
        return OptionalNullable.getFrom(publicUrl);
    }

    /**
     * Setter for PublicUrl.
     * @param publicUrl Value for String
     */
    @JsonSetter("public_url")
    public void setPublicUrl(String publicUrl) {
        this.publicUrl = OptionalNullable.of(publicUrl);
    }

    /**
     * UnSetter for PublicUrl.
     */
    public void unsetPublicUrl() {
        publicUrl = null;
    }

    /**
     * Converts this ProformaInvoice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProformaInvoice [" + "uid=" + uid + ", siteId=" + siteId + ", customerId="
                + customerId + ", subscriptionId=" + subscriptionId + ", number=" + number
                + ", sequenceNumber=" + sequenceNumber + ", createdAt=" + createdAt
                + ", deliveryDate=" + deliveryDate + ", status=" + status + ", collectionMethod="
                + collectionMethod + ", paymentInstructions=" + paymentInstructions + ", currency="
                + currency + ", consolidationLevel=" + consolidationLevel + ", productName="
                + productName + ", productFamilyName=" + productFamilyName + ", role=" + role
                + ", seller=" + seller + ", customer=" + customer + ", memo=" + memo
                + ", billingAddress=" + billingAddress + ", shippingAddress=" + shippingAddress
                + ", subtotalAmount=" + subtotalAmount + ", discountAmount=" + discountAmount
                + ", taxAmount=" + taxAmount + ", totalAmount=" + totalAmount + ", creditAmount="
                + creditAmount + ", paidAmount=" + paidAmount + ", refundAmount=" + refundAmount
                + ", dueAmount=" + dueAmount + ", lineItems=" + lineItems + ", discounts="
                + discounts + ", taxes=" + taxes + ", credits=" + credits + ", payments=" + payments
                + ", customFields=" + customFields + ", publicUrl=" + publicUrl
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ProformaInvoice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProformaInvoice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .siteId(getSiteId())
                .createdAt(getCreatedAt())
                .deliveryDate(getDeliveryDate())
                .status(getStatus())
                .collectionMethod(getCollectionMethod())
                .paymentInstructions(getPaymentInstructions())
                .currency(getCurrency())
                .consolidationLevel(getConsolidationLevel())
                .productName(getProductName())
                .productFamilyName(getProductFamilyName())
                .role(getRole())
                .seller(getSeller())
                .customer(getCustomer())
                .memo(getMemo())
                .billingAddress(getBillingAddress())
                .shippingAddress(getShippingAddress())
                .subtotalAmount(getSubtotalAmount())
                .discountAmount(getDiscountAmount())
                .taxAmount(getTaxAmount())
                .totalAmount(getTotalAmount())
                .creditAmount(getCreditAmount())
                .paidAmount(getPaidAmount())
                .refundAmount(getRefundAmount())
                .dueAmount(getDueAmount())
                .lineItems(getLineItems())
                .discounts(getDiscounts())
                .taxes(getTaxes())
                .credits(getCredits())
                .payments(getPayments())
                .customFields(getCustomFields());
        builder.customerId = internalGetCustomerId();
        builder.subscriptionId = internalGetSubscriptionId();
        builder.number = internalGetNumber();
        builder.sequenceNumber = internalGetSequenceNumber();
        builder.publicUrl = internalGetPublicUrl();
        return builder;
    }

    /**
     * Class to build instances of {@link ProformaInvoice}.
     */
    public static class Builder {
        private String uid;
        private Integer siteId;
        private OptionalNullable<Integer> customerId;
        private OptionalNullable<Integer> subscriptionId;
        private OptionalNullable<Integer> number;
        private OptionalNullable<Integer> sequenceNumber;
        private ZonedDateTime createdAt;
        private LocalDate deliveryDate;
        private ProformaInvoiceStatus status;
        private CollectionMethod collectionMethod = CollectionMethod.AUTOMATIC;
        private String paymentInstructions;
        private String currency;
        private InvoiceConsolidationLevel consolidationLevel;
        private String productName;
        private String productFamilyName;
        private ProformaInvoiceRole role;
        private InvoiceSeller seller;
        private InvoiceCustomer customer;
        private String memo;
        private InvoiceAddress billingAddress;
        private InvoiceAddress shippingAddress;
        private String subtotalAmount;
        private String discountAmount;
        private String taxAmount;
        private String totalAmount;
        private String creditAmount;
        private String paidAmount;
        private String refundAmount;
        private String dueAmount;
        private List<InvoiceLineItem> lineItems;
        private List<ProformaInvoiceDiscount> discounts;
        private List<ProformaInvoiceTax> taxes;
        private List<ProformaInvoiceCredit> credits;
        private List<ProformaInvoicePayment> payments;
        private List<InvoiceCustomField> customFields;
        private OptionalNullable<String> publicUrl;



        /**
         * Setter for uid.
         * @param  uid  String value for uid.
         * @return Builder
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Setter for siteId.
         * @param  siteId  Integer value for siteId.
         * @return Builder
         */
        public Builder siteId(Integer siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * Setter for customerId.
         * @param  customerId  Integer value for customerId.
         * @return Builder
         */
        public Builder customerId(Integer customerId) {
            this.customerId = OptionalNullable.of(customerId);
            return this;
        }

        /**
         * UnSetter for customerId.
         * @return Builder
         */
        public Builder unsetCustomerId() {
            customerId = null;
            return this;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = OptionalNullable.of(subscriptionId);
            return this;
        }

        /**
         * UnSetter for subscriptionId.
         * @return Builder
         */
        public Builder unsetSubscriptionId() {
            subscriptionId = null;
            return this;
        }

        /**
         * Setter for number.
         * @param  number  Integer value for number.
         * @return Builder
         */
        public Builder number(Integer number) {
            this.number = OptionalNullable.of(number);
            return this;
        }

        /**
         * UnSetter for number.
         * @return Builder
         */
        public Builder unsetNumber() {
            number = null;
            return this;
        }

        /**
         * Setter for sequenceNumber.
         * @param  sequenceNumber  Integer value for sequenceNumber.
         * @return Builder
         */
        public Builder sequenceNumber(Integer sequenceNumber) {
            this.sequenceNumber = OptionalNullable.of(sequenceNumber);
            return this;
        }

        /**
         * UnSetter for sequenceNumber.
         * @return Builder
         */
        public Builder unsetSequenceNumber() {
            sequenceNumber = null;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for deliveryDate.
         * @param  deliveryDate  LocalDate value for deliveryDate.
         * @return Builder
         */
        public Builder deliveryDate(LocalDate deliveryDate) {
            this.deliveryDate = deliveryDate;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  ProformaInvoiceStatus value for status.
         * @return Builder
         */
        public Builder status(ProformaInvoiceStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for collectionMethod.
         * @param  collectionMethod  CollectionMethod value for collectionMethod.
         * @return Builder
         */
        public Builder collectionMethod(CollectionMethod collectionMethod) {
            this.collectionMethod = collectionMethod;
            return this;
        }

        /**
         * Setter for paymentInstructions.
         * @param  paymentInstructions  String value for paymentInstructions.
         * @return Builder
         */
        public Builder paymentInstructions(String paymentInstructions) {
            this.paymentInstructions = paymentInstructions;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for consolidationLevel.
         * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
         * @return Builder
         */
        public Builder consolidationLevel(InvoiceConsolidationLevel consolidationLevel) {
            this.consolidationLevel = consolidationLevel;
            return this;
        }

        /**
         * Setter for productName.
         * @param  productName  String value for productName.
         * @return Builder
         */
        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        /**
         * Setter for productFamilyName.
         * @param  productFamilyName  String value for productFamilyName.
         * @return Builder
         */
        public Builder productFamilyName(String productFamilyName) {
            this.productFamilyName = productFamilyName;
            return this;
        }

        /**
         * Setter for role.
         * @param  role  ProformaInvoiceRole value for role.
         * @return Builder
         */
        public Builder role(ProformaInvoiceRole role) {
            this.role = role;
            return this;
        }

        /**
         * Setter for seller.
         * @param  seller  InvoiceSeller value for seller.
         * @return Builder
         */
        public Builder seller(InvoiceSeller seller) {
            this.seller = seller;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  InvoiceCustomer value for customer.
         * @return Builder
         */
        public Builder customer(InvoiceCustomer customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  InvoiceAddress value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(InvoiceAddress billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for shippingAddress.
         * @param  shippingAddress  InvoiceAddress value for shippingAddress.
         * @return Builder
         */
        public Builder shippingAddress(InvoiceAddress shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        /**
         * Setter for subtotalAmount.
         * @param  subtotalAmount  String value for subtotalAmount.
         * @return Builder
         */
        public Builder subtotalAmount(String subtotalAmount) {
            this.subtotalAmount = subtotalAmount;
            return this;
        }

        /**
         * Setter for discountAmount.
         * @param  discountAmount  String value for discountAmount.
         * @return Builder
         */
        public Builder discountAmount(String discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }

        /**
         * Setter for taxAmount.
         * @param  taxAmount  String value for taxAmount.
         * @return Builder
         */
        public Builder taxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }

        /**
         * Setter for totalAmount.
         * @param  totalAmount  String value for totalAmount.
         * @return Builder
         */
        public Builder totalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        /**
         * Setter for creditAmount.
         * @param  creditAmount  String value for creditAmount.
         * @return Builder
         */
        public Builder creditAmount(String creditAmount) {
            this.creditAmount = creditAmount;
            return this;
        }

        /**
         * Setter for paidAmount.
         * @param  paidAmount  String value for paidAmount.
         * @return Builder
         */
        public Builder paidAmount(String paidAmount) {
            this.paidAmount = paidAmount;
            return this;
        }

        /**
         * Setter for refundAmount.
         * @param  refundAmount  String value for refundAmount.
         * @return Builder
         */
        public Builder refundAmount(String refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }

        /**
         * Setter for dueAmount.
         * @param  dueAmount  String value for dueAmount.
         * @return Builder
         */
        public Builder dueAmount(String dueAmount) {
            this.dueAmount = dueAmount;
            return this;
        }

        /**
         * Setter for lineItems.
         * @param  lineItems  List of InvoiceLineItem value for lineItems.
         * @return Builder
         */
        public Builder lineItems(List<InvoiceLineItem> lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        /**
         * Setter for discounts.
         * @param  discounts  List of ProformaInvoiceDiscount value for discounts.
         * @return Builder
         */
        public Builder discounts(List<ProformaInvoiceDiscount> discounts) {
            this.discounts = discounts;
            return this;
        }

        /**
         * Setter for taxes.
         * @param  taxes  List of ProformaInvoiceTax value for taxes.
         * @return Builder
         */
        public Builder taxes(List<ProformaInvoiceTax> taxes) {
            this.taxes = taxes;
            return this;
        }

        /**
         * Setter for credits.
         * @param  credits  List of ProformaInvoiceCredit value for credits.
         * @return Builder
         */
        public Builder credits(List<ProformaInvoiceCredit> credits) {
            this.credits = credits;
            return this;
        }

        /**
         * Setter for payments.
         * @param  payments  List of ProformaInvoicePayment value for payments.
         * @return Builder
         */
        public Builder payments(List<ProformaInvoicePayment> payments) {
            this.payments = payments;
            return this;
        }

        /**
         * Setter for customFields.
         * @param  customFields  List of InvoiceCustomField value for customFields.
         * @return Builder
         */
        public Builder customFields(List<InvoiceCustomField> customFields) {
            this.customFields = customFields;
            return this;
        }

        /**
         * Setter for publicUrl.
         * @param  publicUrl  String value for publicUrl.
         * @return Builder
         */
        public Builder publicUrl(String publicUrl) {
            this.publicUrl = OptionalNullable.of(publicUrl);
            return this;
        }

        /**
         * UnSetter for publicUrl.
         * @return Builder
         */
        public Builder unsetPublicUrl() {
            publicUrl = null;
            return this;
        }

        /**
         * Builds a new {@link ProformaInvoice} object using the set fields.
         * @return {@link ProformaInvoice}
         */
        public ProformaInvoice build() {
            return new ProformaInvoice(uid, siteId, customerId, subscriptionId, number,
                    sequenceNumber, createdAt, deliveryDate, status, collectionMethod,
                    paymentInstructions, currency, consolidationLevel, productName,
                    productFamilyName, role, seller, customer, memo, billingAddress,
                    shippingAddress, subtotalAmount, discountAmount, taxAmount, totalAmount,
                    creditAmount, paidAmount, refundAmount, dueAmount, lineItems, discounts, taxes,
                    credits, payments, customFields, publicUrl);
        }
    }
}
