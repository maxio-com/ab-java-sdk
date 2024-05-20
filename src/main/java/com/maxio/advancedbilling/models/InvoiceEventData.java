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
import com.maxio.advancedbilling.models.containers.InvoiceEventDataPaymentMethod;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * This is a model class for InvoiceEventData type.
 */
public class InvoiceEventData
        extends BaseModel {
    private String uid;
    private String creditNoteNumber;
    private String creditNoteUid;
    private String originalAmount;
    private String appliedAmount;
    private ZonedDateTime transactionTime;
    private OptionalNullable<String> memo;
    private InvoiceRole1 role;
    private Boolean consolidatedInvoice;
    private List<AppliedCreditNoteData> appliedCreditNotes;
    private String debitNoteNumber;
    private String debitNoteUid;
    private InvoiceConsolidationLevel consolidationLevel;
    private InvoiceEventDataPaymentMethod paymentMethod;
    private Integer transactionId;
    private OptionalNullable<Integer> parentInvoiceNumber;
    private OptionalNullable<String> remainingPrepaymentAmount;
    private Boolean prepayment;
    private Boolean external;
    private String fromCollectionMethod;
    private String toCollectionMethod;
    private Object fromStatus;
    private Object toStatus;
    private String dueAmount;
    private String totalAmount;
    private Boolean applyCredit;
    private CreditNote1 creditNoteAttributes;
    private Integer paymentId;
    private String refundAmount;
    private Integer refundId;
    private Boolean isAdvanceInvoice;
    private String reason;
    private Long id;
    private Integer siteId;
    private Integer customerId;
    private Integer subscriptionId;
    private String number;
    private Integer sequenceNumber;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private OptionalNullable<LocalDate> paidDate;
    private InvoiceStatus status;
    private OptionalNullable<Integer> parentInvoiceId;
    private CollectionMethod collectionMethod;
    private String paymentInstructions;
    private String currency;
    private OptionalNullable<String> parentInvoiceUid;
    private OptionalNullable<Integer> subscriptionGroupId;
    private OptionalNullable<Integer> groupPrimarySubscriptionId;
    private String productName;
    private String productFamilyName;
    private InvoiceSeller seller;
    private InvoiceCustomer customer;
    private InvoicePayer payer;
    private List<String> recipientEmails;
    private Integer netTerms;
    private BillingAddress billingAddress;
    private ShippingAddress shippingAddress;
    private String subtotalAmount;
    private String discountAmount;
    private String taxAmount;
    private String creditAmount;
    private String paidAmount;
    private List<InvoiceLineItem1> lineItems;
    private List<InvoiceDiscount> discounts;
    private List<InvoiceTax> taxes;
    private List<InvoiceCredit> credits;
    private List<InvoiceRefund> refunds;
    private List<InvoicePayment> payments;
    private List<InvoiceCustomField> customFields;
    private InvoiceDisplaySettings displaySettings;
    private String publicUrl;
    private InvoicePreviousBalance previousBalanceData;
    private String gatewayTransId;
    private String amount;
    private Integer amountInCents;
    private String originCreditNoteUid;
    private String originCreditNoteNumber;
    private LocalDate appliedDate;
    private String remainingAmount;
    private List<CreditNoteApplication> applications;
    private List<OriginInvoice> originInvoices;
    private ChargebackStatus chargebackStatus;

    /**
     * Default constructor.
     */
    public InvoiceEventData() {
        collectionMethod = CollectionMethod.AUTOMATIC;
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  creditNoteNumber  String value for creditNoteNumber.
     * @param  creditNoteUid  String value for creditNoteUid.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     * @param  memo  String value for memo.
     * @param  role  InvoiceRole1 value for role.
     * @param  consolidatedInvoice  Boolean value for consolidatedInvoice.
     * @param  appliedCreditNotes  List of AppliedCreditNoteData value for appliedCreditNotes.
     * @param  debitNoteNumber  String value for debitNoteNumber.
     * @param  debitNoteUid  String value for debitNoteUid.
     * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
     * @param  paymentMethod  InvoiceEventDataPaymentMethod value for paymentMethod.
     * @param  transactionId  Integer value for transactionId.
     * @param  parentInvoiceNumber  Integer value for parentInvoiceNumber.
     * @param  remainingPrepaymentAmount  String value for remainingPrepaymentAmount.
     * @param  prepayment  Boolean value for prepayment.
     * @param  external  Boolean value for external.
     * @param  fromCollectionMethod  String value for fromCollectionMethod.
     * @param  toCollectionMethod  String value for toCollectionMethod.
     * @param  fromStatus  Object value for fromStatus.
     * @param  toStatus  Object value for toStatus.
     * @param  dueAmount  String value for dueAmount.
     * @param  totalAmount  String value for totalAmount.
     * @param  applyCredit  Boolean value for applyCredit.
     * @param  creditNoteAttributes  CreditNote1 value for creditNoteAttributes.
     * @param  paymentId  Integer value for paymentId.
     * @param  refundAmount  String value for refundAmount.
     * @param  refundId  Integer value for refundId.
     * @param  isAdvanceInvoice  Boolean value for isAdvanceInvoice.
     * @param  reason  String value for reason.
     * @param  id  Long value for id.
     * @param  siteId  Integer value for siteId.
     * @param  customerId  Integer value for customerId.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  number  String value for number.
     * @param  sequenceNumber  Integer value for sequenceNumber.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     * @param  issueDate  LocalDate value for issueDate.
     * @param  dueDate  LocalDate value for dueDate.
     * @param  paidDate  LocalDate value for paidDate.
     * @param  status  InvoiceStatus value for status.
     * @param  parentInvoiceId  Integer value for parentInvoiceId.
     * @param  collectionMethod  CollectionMethod value for collectionMethod.
     * @param  paymentInstructions  String value for paymentInstructions.
     * @param  currency  String value for currency.
     * @param  parentInvoiceUid  String value for parentInvoiceUid.
     * @param  subscriptionGroupId  Integer value for subscriptionGroupId.
     * @param  groupPrimarySubscriptionId  Integer value for groupPrimarySubscriptionId.
     * @param  productName  String value for productName.
     * @param  productFamilyName  String value for productFamilyName.
     * @param  seller  InvoiceSeller value for seller.
     * @param  customer  InvoiceCustomer value for customer.
     * @param  payer  InvoicePayer value for payer.
     * @param  recipientEmails  List of String value for recipientEmails.
     * @param  netTerms  Integer value for netTerms.
     * @param  billingAddress  BillingAddress value for billingAddress.
     * @param  shippingAddress  ShippingAddress value for shippingAddress.
     * @param  subtotalAmount  String value for subtotalAmount.
     * @param  discountAmount  String value for discountAmount.
     * @param  taxAmount  String value for taxAmount.
     * @param  creditAmount  String value for creditAmount.
     * @param  paidAmount  String value for paidAmount.
     * @param  lineItems  List of InvoiceLineItem1 value for lineItems.
     * @param  discounts  List of InvoiceDiscount value for discounts.
     * @param  taxes  List of InvoiceTax value for taxes.
     * @param  credits  List of InvoiceCredit value for credits.
     * @param  refunds  List of InvoiceRefund value for refunds.
     * @param  payments  List of InvoicePayment value for payments.
     * @param  customFields  List of InvoiceCustomField value for customFields.
     * @param  displaySettings  InvoiceDisplaySettings value for displaySettings.
     * @param  publicUrl  String value for publicUrl.
     * @param  previousBalanceData  InvoicePreviousBalance value for previousBalanceData.
     * @param  gatewayTransId  String value for gatewayTransId.
     * @param  amount  String value for amount.
     * @param  amountInCents  Integer value for amountInCents.
     * @param  originCreditNoteUid  String value for originCreditNoteUid.
     * @param  originCreditNoteNumber  String value for originCreditNoteNumber.
     * @param  appliedDate  LocalDate value for appliedDate.
     * @param  remainingAmount  String value for remainingAmount.
     * @param  applications  List of CreditNoteApplication value for applications.
     * @param  originInvoices  List of OriginInvoice value for originInvoices.
     * @param  chargebackStatus  ChargebackStatus value for chargebackStatus.
     */
    public InvoiceEventData(
            String uid,
            String creditNoteNumber,
            String creditNoteUid,
            String originalAmount,
            String appliedAmount,
            ZonedDateTime transactionTime,
            String memo,
            InvoiceRole1 role,
            Boolean consolidatedInvoice,
            List<AppliedCreditNoteData> appliedCreditNotes,
            String debitNoteNumber,
            String debitNoteUid,
            InvoiceConsolidationLevel consolidationLevel,
            InvoiceEventDataPaymentMethod paymentMethod,
            Integer transactionId,
            Integer parentInvoiceNumber,
            String remainingPrepaymentAmount,
            Boolean prepayment,
            Boolean external,
            String fromCollectionMethod,
            String toCollectionMethod,
            Object fromStatus,
            Object toStatus,
            String dueAmount,
            String totalAmount,
            Boolean applyCredit,
            CreditNote1 creditNoteAttributes,
            Integer paymentId,
            String refundAmount,
            Integer refundId,
            Boolean isAdvanceInvoice,
            String reason,
            Long id,
            Integer siteId,
            Integer customerId,
            Integer subscriptionId,
            String number,
            Integer sequenceNumber,
            ZonedDateTime createdAt,
            ZonedDateTime updatedAt,
            LocalDate issueDate,
            LocalDate dueDate,
            LocalDate paidDate,
            InvoiceStatus status,
            Integer parentInvoiceId,
            CollectionMethod collectionMethod,
            String paymentInstructions,
            String currency,
            String parentInvoiceUid,
            Integer subscriptionGroupId,
            Integer groupPrimarySubscriptionId,
            String productName,
            String productFamilyName,
            InvoiceSeller seller,
            InvoiceCustomer customer,
            InvoicePayer payer,
            List<String> recipientEmails,
            Integer netTerms,
            BillingAddress billingAddress,
            ShippingAddress shippingAddress,
            String subtotalAmount,
            String discountAmount,
            String taxAmount,
            String creditAmount,
            String paidAmount,
            List<InvoiceLineItem1> lineItems,
            List<InvoiceDiscount> discounts,
            List<InvoiceTax> taxes,
            List<InvoiceCredit> credits,
            List<InvoiceRefund> refunds,
            List<InvoicePayment> payments,
            List<InvoiceCustomField> customFields,
            InvoiceDisplaySettings displaySettings,
            String publicUrl,
            InvoicePreviousBalance previousBalanceData,
            String gatewayTransId,
            String amount,
            Integer amountInCents,
            String originCreditNoteUid,
            String originCreditNoteNumber,
            LocalDate appliedDate,
            String remainingAmount,
            List<CreditNoteApplication> applications,
            List<OriginInvoice> originInvoices,
            ChargebackStatus chargebackStatus) {
        this.uid = uid;
        this.creditNoteNumber = creditNoteNumber;
        this.creditNoteUid = creditNoteUid;
        this.originalAmount = originalAmount;
        this.appliedAmount = appliedAmount;
        this.transactionTime = transactionTime;
        this.memo = OptionalNullable.of(memo);
        this.role = role;
        this.consolidatedInvoice = consolidatedInvoice;
        this.appliedCreditNotes = appliedCreditNotes;
        this.debitNoteNumber = debitNoteNumber;
        this.debitNoteUid = debitNoteUid;
        this.consolidationLevel = consolidationLevel;
        this.paymentMethod = paymentMethod;
        this.transactionId = transactionId;
        this.parentInvoiceNumber = OptionalNullable.of(parentInvoiceNumber);
        this.remainingPrepaymentAmount = OptionalNullable.of(remainingPrepaymentAmount);
        this.prepayment = prepayment;
        this.external = external;
        this.fromCollectionMethod = fromCollectionMethod;
        this.toCollectionMethod = toCollectionMethod;
        this.fromStatus = fromStatus;
        this.toStatus = toStatus;
        this.dueAmount = dueAmount;
        this.totalAmount = totalAmount;
        this.applyCredit = applyCredit;
        this.creditNoteAttributes = creditNoteAttributes;
        this.paymentId = paymentId;
        this.refundAmount = refundAmount;
        this.refundId = refundId;
        this.isAdvanceInvoice = isAdvanceInvoice;
        this.reason = reason;
        this.id = id;
        this.siteId = siteId;
        this.customerId = customerId;
        this.subscriptionId = subscriptionId;
        this.number = number;
        this.sequenceNumber = sequenceNumber;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.paidDate = OptionalNullable.of(paidDate);
        this.status = status;
        this.parentInvoiceId = OptionalNullable.of(parentInvoiceId);
        this.collectionMethod = collectionMethod;
        this.paymentInstructions = paymentInstructions;
        this.currency = currency;
        this.parentInvoiceUid = OptionalNullable.of(parentInvoiceUid);
        this.subscriptionGroupId = OptionalNullable.of(subscriptionGroupId);
        this.groupPrimarySubscriptionId = OptionalNullable.of(groupPrimarySubscriptionId);
        this.productName = productName;
        this.productFamilyName = productFamilyName;
        this.seller = seller;
        this.customer = customer;
        this.payer = payer;
        this.recipientEmails = recipientEmails;
        this.netTerms = netTerms;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.subtotalAmount = subtotalAmount;
        this.discountAmount = discountAmount;
        this.taxAmount = taxAmount;
        this.creditAmount = creditAmount;
        this.paidAmount = paidAmount;
        this.lineItems = lineItems;
        this.discounts = discounts;
        this.taxes = taxes;
        this.credits = credits;
        this.refunds = refunds;
        this.payments = payments;
        this.customFields = customFields;
        this.displaySettings = displaySettings;
        this.publicUrl = publicUrl;
        this.previousBalanceData = previousBalanceData;
        this.gatewayTransId = gatewayTransId;
        this.amount = amount;
        this.amountInCents = amountInCents;
        this.originCreditNoteUid = originCreditNoteUid;
        this.originCreditNoteNumber = originCreditNoteNumber;
        this.appliedDate = appliedDate;
        this.remainingAmount = remainingAmount;
        this.applications = applications;
        this.originInvoices = originInvoices;
        this.chargebackStatus = chargebackStatus;
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  creditNoteNumber  String value for creditNoteNumber.
     * @param  creditNoteUid  String value for creditNoteUid.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  transactionTime  ZonedDateTime value for transactionTime.
     * @param  memo  String value for memo.
     * @param  role  InvoiceRole1 value for role.
     * @param  consolidatedInvoice  Boolean value for consolidatedInvoice.
     * @param  appliedCreditNotes  List of AppliedCreditNoteData value for appliedCreditNotes.
     * @param  debitNoteNumber  String value for debitNoteNumber.
     * @param  debitNoteUid  String value for debitNoteUid.
     * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
     * @param  paymentMethod  InvoiceEventDataPaymentMethod value for paymentMethod.
     * @param  transactionId  Integer value for transactionId.
     * @param  parentInvoiceNumber  Integer value for parentInvoiceNumber.
     * @param  remainingPrepaymentAmount  String value for remainingPrepaymentAmount.
     * @param  prepayment  Boolean value for prepayment.
     * @param  external  Boolean value for external.
     * @param  fromCollectionMethod  String value for fromCollectionMethod.
     * @param  toCollectionMethod  String value for toCollectionMethod.
     * @param  fromStatus  Object value for fromStatus.
     * @param  toStatus  Object value for toStatus.
     * @param  dueAmount  String value for dueAmount.
     * @param  totalAmount  String value for totalAmount.
     * @param  applyCredit  Boolean value for applyCredit.
     * @param  creditNoteAttributes  CreditNote1 value for creditNoteAttributes.
     * @param  paymentId  Integer value for paymentId.
     * @param  refundAmount  String value for refundAmount.
     * @param  refundId  Integer value for refundId.
     * @param  isAdvanceInvoice  Boolean value for isAdvanceInvoice.
     * @param  reason  String value for reason.
     * @param  id  Long value for id.
     * @param  siteId  Integer value for siteId.
     * @param  customerId  Integer value for customerId.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  number  String value for number.
     * @param  sequenceNumber  Integer value for sequenceNumber.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     * @param  issueDate  LocalDate value for issueDate.
     * @param  dueDate  LocalDate value for dueDate.
     * @param  paidDate  LocalDate value for paidDate.
     * @param  status  InvoiceStatus value for status.
     * @param  parentInvoiceId  Integer value for parentInvoiceId.
     * @param  collectionMethod  CollectionMethod value for collectionMethod.
     * @param  paymentInstructions  String value for paymentInstructions.
     * @param  currency  String value for currency.
     * @param  parentInvoiceUid  String value for parentInvoiceUid.
     * @param  subscriptionGroupId  Integer value for subscriptionGroupId.
     * @param  groupPrimarySubscriptionId  Integer value for groupPrimarySubscriptionId.
     * @param  productName  String value for productName.
     * @param  productFamilyName  String value for productFamilyName.
     * @param  seller  InvoiceSeller value for seller.
     * @param  customer  InvoiceCustomer value for customer.
     * @param  payer  InvoicePayer value for payer.
     * @param  recipientEmails  List of String value for recipientEmails.
     * @param  netTerms  Integer value for netTerms.
     * @param  billingAddress  BillingAddress value for billingAddress.
     * @param  shippingAddress  ShippingAddress value for shippingAddress.
     * @param  subtotalAmount  String value for subtotalAmount.
     * @param  discountAmount  String value for discountAmount.
     * @param  taxAmount  String value for taxAmount.
     * @param  creditAmount  String value for creditAmount.
     * @param  paidAmount  String value for paidAmount.
     * @param  lineItems  List of InvoiceLineItem1 value for lineItems.
     * @param  discounts  List of InvoiceDiscount value for discounts.
     * @param  taxes  List of InvoiceTax value for taxes.
     * @param  credits  List of InvoiceCredit value for credits.
     * @param  refunds  List of InvoiceRefund value for refunds.
     * @param  payments  List of InvoicePayment value for payments.
     * @param  customFields  List of InvoiceCustomField value for customFields.
     * @param  displaySettings  InvoiceDisplaySettings value for displaySettings.
     * @param  publicUrl  String value for publicUrl.
     * @param  previousBalanceData  InvoicePreviousBalance value for previousBalanceData.
     * @param  gatewayTransId  String value for gatewayTransId.
     * @param  amount  String value for amount.
     * @param  amountInCents  Integer value for amountInCents.
     * @param  originCreditNoteUid  String value for originCreditNoteUid.
     * @param  originCreditNoteNumber  String value for originCreditNoteNumber.
     * @param  appliedDate  LocalDate value for appliedDate.
     * @param  remainingAmount  String value for remainingAmount.
     * @param  applications  List of CreditNoteApplication value for applications.
     * @param  originInvoices  List of OriginInvoice value for originInvoices.
     * @param  chargebackStatus  ChargebackStatus value for chargebackStatus.
     */

    protected InvoiceEventData(String uid, String creditNoteNumber, String creditNoteUid,
            String originalAmount, String appliedAmount, ZonedDateTime transactionTime,
            OptionalNullable<String> memo, InvoiceRole1 role, Boolean consolidatedInvoice,
            List<AppliedCreditNoteData> appliedCreditNotes, String debitNoteNumber,
            String debitNoteUid, InvoiceConsolidationLevel consolidationLevel,
            InvoiceEventDataPaymentMethod paymentMethod, Integer transactionId,
            OptionalNullable<Integer> parentInvoiceNumber,
            OptionalNullable<String> remainingPrepaymentAmount, Boolean prepayment,
            Boolean external, String fromCollectionMethod, String toCollectionMethod,
            Object fromStatus, Object toStatus, String dueAmount, String totalAmount,
            Boolean applyCredit, CreditNote1 creditNoteAttributes, Integer paymentId,
            String refundAmount, Integer refundId, Boolean isAdvanceInvoice, String reason, Long id,
            Integer siteId, Integer customerId, Integer subscriptionId, String number,
            Integer sequenceNumber, ZonedDateTime createdAt, ZonedDateTime updatedAt,
            LocalDate issueDate, LocalDate dueDate, OptionalNullable<LocalDate> paidDate,
            InvoiceStatus status, OptionalNullable<Integer> parentInvoiceId,
            CollectionMethod collectionMethod, String paymentInstructions, String currency,
            OptionalNullable<String> parentInvoiceUid,
            OptionalNullable<Integer> subscriptionGroupId,
            OptionalNullable<Integer> groupPrimarySubscriptionId, String productName,
            String productFamilyName, InvoiceSeller seller, InvoiceCustomer customer,
            InvoicePayer payer, List<String> recipientEmails, Integer netTerms,
            BillingAddress billingAddress, ShippingAddress shippingAddress, String subtotalAmount,
            String discountAmount, String taxAmount, String creditAmount, String paidAmount,
            List<InvoiceLineItem1> lineItems, List<InvoiceDiscount> discounts,
            List<InvoiceTax> taxes, List<InvoiceCredit> credits, List<InvoiceRefund> refunds,
            List<InvoicePayment> payments, List<InvoiceCustomField> customFields,
            InvoiceDisplaySettings displaySettings, String publicUrl,
            InvoicePreviousBalance previousBalanceData, String gatewayTransId, String amount,
            Integer amountInCents, String originCreditNoteUid, String originCreditNoteNumber,
            LocalDate appliedDate, String remainingAmount, List<CreditNoteApplication> applications,
            List<OriginInvoice> originInvoices, ChargebackStatus chargebackStatus) {
        this.uid = uid;
        this.creditNoteNumber = creditNoteNumber;
        this.creditNoteUid = creditNoteUid;
        this.originalAmount = originalAmount;
        this.appliedAmount = appliedAmount;
        this.transactionTime = transactionTime;
        this.memo = memo;
        this.role = role;
        this.consolidatedInvoice = consolidatedInvoice;
        this.appliedCreditNotes = appliedCreditNotes;
        this.debitNoteNumber = debitNoteNumber;
        this.debitNoteUid = debitNoteUid;
        this.consolidationLevel = consolidationLevel;
        this.paymentMethod = paymentMethod;
        this.transactionId = transactionId;
        this.parentInvoiceNumber = parentInvoiceNumber;
        this.remainingPrepaymentAmount = remainingPrepaymentAmount;
        this.prepayment = prepayment;
        this.external = external;
        this.fromCollectionMethod = fromCollectionMethod;
        this.toCollectionMethod = toCollectionMethod;
        this.fromStatus = fromStatus;
        this.toStatus = toStatus;
        this.dueAmount = dueAmount;
        this.totalAmount = totalAmount;
        this.applyCredit = applyCredit;
        this.creditNoteAttributes = creditNoteAttributes;
        this.paymentId = paymentId;
        this.refundAmount = refundAmount;
        this.refundId = refundId;
        this.isAdvanceInvoice = isAdvanceInvoice;
        this.reason = reason;
        this.id = id;
        this.siteId = siteId;
        this.customerId = customerId;
        this.subscriptionId = subscriptionId;
        this.number = number;
        this.sequenceNumber = sequenceNumber;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.paidDate = paidDate;
        this.status = status;
        this.parentInvoiceId = parentInvoiceId;
        this.collectionMethod = collectionMethod;
        this.paymentInstructions = paymentInstructions;
        this.currency = currency;
        this.parentInvoiceUid = parentInvoiceUid;
        this.subscriptionGroupId = subscriptionGroupId;
        this.groupPrimarySubscriptionId = groupPrimarySubscriptionId;
        this.productName = productName;
        this.productFamilyName = productFamilyName;
        this.seller = seller;
        this.customer = customer;
        this.payer = payer;
        this.recipientEmails = recipientEmails;
        this.netTerms = netTerms;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.subtotalAmount = subtotalAmount;
        this.discountAmount = discountAmount;
        this.taxAmount = taxAmount;
        this.creditAmount = creditAmount;
        this.paidAmount = paidAmount;
        this.lineItems = lineItems;
        this.discounts = discounts;
        this.taxes = taxes;
        this.credits = credits;
        this.refunds = refunds;
        this.payments = payments;
        this.customFields = customFields;
        this.displaySettings = displaySettings;
        this.publicUrl = publicUrl;
        this.previousBalanceData = previousBalanceData;
        this.gatewayTransId = gatewayTransId;
        this.amount = amount;
        this.amountInCents = amountInCents;
        this.originCreditNoteUid = originCreditNoteUid;
        this.originCreditNoteNumber = originCreditNoteNumber;
        this.appliedDate = appliedDate;
        this.remainingAmount = remainingAmount;
        this.applications = applications;
        this.originInvoices = originInvoices;
        this.chargebackStatus = chargebackStatus;
    }

    /**
     * Getter for Uid.
     * Unique identifier for the credit note application. It is generated automatically by Chargify
     * and has the prefix "cdt_" followed by alphanumeric characters.
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * Unique identifier for the credit note application. It is generated automatically by Chargify
     * and has the prefix "cdt_" followed by alphanumeric characters.
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Getter for CreditNoteNumber.
     * A unique, identifying string that appears on the credit note and in places it is referenced.
     * @return Returns the String
     */
    @JsonGetter("credit_note_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreditNoteNumber() {
        return creditNoteNumber;
    }

    /**
     * Setter for CreditNoteNumber.
     * A unique, identifying string that appears on the credit note and in places it is referenced.
     * @param creditNoteNumber Value for String
     */
    @JsonSetter("credit_note_number")
    public void setCreditNoteNumber(String creditNoteNumber) {
        this.creditNoteNumber = creditNoteNumber;
    }

    /**
     * Getter for CreditNoteUid.
     * Unique identifier for the credit note. It is generated automatically by Chargify and has the
     * prefix "cn_" followed by alphanumeric characters.
     * @return Returns the String
     */
    @JsonGetter("credit_note_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreditNoteUid() {
        return creditNoteUid;
    }

    /**
     * Setter for CreditNoteUid.
     * Unique identifier for the credit note. It is generated automatically by Chargify and has the
     * prefix "cn_" followed by alphanumeric characters.
     * @param creditNoteUid Value for String
     */
    @JsonSetter("credit_note_uid")
    public void setCreditNoteUid(String creditNoteUid) {
        this.creditNoteUid = creditNoteUid;
    }

    /**
     * Getter for OriginalAmount.
     * The full, original amount of the credit note.
     * @return Returns the String
     */
    @JsonGetter("original_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Setter for OriginalAmount.
     * The full, original amount of the credit note.
     * @param originalAmount Value for String
     */
    @JsonSetter("original_amount")
    public void setOriginalAmount(String originalAmount) {
        this.originalAmount = originalAmount;
    }

    /**
     * Getter for AppliedAmount.
     * The amount of the credit note applied to invoice.
     * @return Returns the String
     */
    @JsonGetter("applied_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAppliedAmount() {
        return appliedAmount;
    }

    /**
     * Setter for AppliedAmount.
     * The amount of the credit note applied to invoice.
     * @param appliedAmount Value for String
     */
    @JsonSetter("applied_amount")
    public void setAppliedAmount(String appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    /**
     * Getter for TransactionTime.
     * The time the credit note was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("transaction_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getTransactionTime() {
        return transactionTime;
    }

    /**
     * Setter for TransactionTime.
     * The time the credit note was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
     * @param transactionTime Value for ZonedDateTime
     */
    @JsonSetter("transaction_time")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTransactionTime(ZonedDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    /**
     * Internal Getter for Memo.
     * The credit note memo.
     * @return Returns the Internal String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetMemo() {
        return this.memo;
    }

    /**
     * Getter for Memo.
     * The credit note memo.
     * @return Returns the String
     */
    public String getMemo() {
        return OptionalNullable.getFrom(memo);
    }

    /**
     * Setter for Memo.
     * The credit note memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = OptionalNullable.of(memo);
    }

    /**
     * UnSetter for Memo.
     * The credit note memo.
     */
    public void unsetMemo() {
        memo = null;
    }

    /**
     * Getter for Role.
     * The role of the credit note (e.g. 'general')
     * @return Returns the InvoiceRole1
     */
    @JsonGetter("role")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceRole1 getRole() {
        return role;
    }

    /**
     * Setter for Role.
     * The role of the credit note (e.g. 'general')
     * @param role Value for InvoiceRole1
     */
    @JsonSetter("role")
    public void setRole(InvoiceRole1 role) {
        this.role = role;
    }

    /**
     * Getter for ConsolidatedInvoice.
     * Shows whether it was applied to consolidated invoice or not
     * @return Returns the Boolean
     */
    @JsonGetter("consolidated_invoice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getConsolidatedInvoice() {
        return consolidatedInvoice;
    }

    /**
     * Setter for ConsolidatedInvoice.
     * Shows whether it was applied to consolidated invoice or not
     * @param consolidatedInvoice Value for Boolean
     */
    @JsonSetter("consolidated_invoice")
    public void setConsolidatedInvoice(Boolean consolidatedInvoice) {
        this.consolidatedInvoice = consolidatedInvoice;
    }

    /**
     * Getter for AppliedCreditNotes.
     * List of credit notes applied to children invoices (if consolidated invoice)
     * @return Returns the List of AppliedCreditNoteData
     */
    @JsonGetter("applied_credit_notes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<AppliedCreditNoteData> getAppliedCreditNotes() {
        return appliedCreditNotes;
    }

    /**
     * Setter for AppliedCreditNotes.
     * List of credit notes applied to children invoices (if consolidated invoice)
     * @param appliedCreditNotes Value for List of AppliedCreditNoteData
     */
    @JsonSetter("applied_credit_notes")
    public void setAppliedCreditNotes(List<AppliedCreditNoteData> appliedCreditNotes) {
        this.appliedCreditNotes = appliedCreditNotes;
    }

    /**
     * Getter for DebitNoteNumber.
     * A unique, identifying string that appears on the debit note and in places it is referenced.
     * @return Returns the String
     */
    @JsonGetter("debit_note_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDebitNoteNumber() {
        return debitNoteNumber;
    }

    /**
     * Setter for DebitNoteNumber.
     * A unique, identifying string that appears on the debit note and in places it is referenced.
     * @param debitNoteNumber Value for String
     */
    @JsonSetter("debit_note_number")
    public void setDebitNoteNumber(String debitNoteNumber) {
        this.debitNoteNumber = debitNoteNumber;
    }

    /**
     * Getter for DebitNoteUid.
     * Unique identifier for the debit note. It is generated automatically by Chargify and has the
     * prefix "db_" followed by alphanumeric characters.
     * @return Returns the String
     */
    @JsonGetter("debit_note_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDebitNoteUid() {
        return debitNoteUid;
    }

    /**
     * Setter for DebitNoteUid.
     * Unique identifier for the debit note. It is generated automatically by Chargify and has the
     * prefix "db_" followed by alphanumeric characters.
     * @param debitNoteUid Value for String
     */
    @JsonSetter("debit_note_uid")
    public void setDebitNoteUid(String debitNoteUid) {
        this.debitNoteUid = debitNoteUid;
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
     * Getter for PaymentMethod.
     * A nested data structure detailing the method of payment
     * @return Returns the InvoiceEventDataPaymentMethod
     */
    @JsonGetter("payment_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceEventDataPaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * A nested data structure detailing the method of payment
     * @param paymentMethod Value for InvoiceEventDataPaymentMethod
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(InvoiceEventDataPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for TransactionId.
     * The Chargify id of the original payment
     * @return Returns the Integer
     */
    @JsonGetter("transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * Setter for TransactionId.
     * The Chargify id of the original payment
     * @param transactionId Value for Integer
     */
    @JsonSetter("transaction_id")
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Internal Getter for ParentInvoiceNumber.
     * For invoices with `consolidation_level` of `child`, this specifies the number of the parent
     * (consolidated) invoice.
     * @return Returns the Internal Integer
     */
    @JsonGetter("parent_invoice_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetParentInvoiceNumber() {
        return this.parentInvoiceNumber;
    }

    /**
     * Getter for ParentInvoiceNumber.
     * For invoices with `consolidation_level` of `child`, this specifies the number of the parent
     * (consolidated) invoice.
     * @return Returns the Integer
     */
    public Integer getParentInvoiceNumber() {
        return OptionalNullable.getFrom(parentInvoiceNumber);
    }

    /**
     * Setter for ParentInvoiceNumber.
     * For invoices with `consolidation_level` of `child`, this specifies the number of the parent
     * (consolidated) invoice.
     * @param parentInvoiceNumber Value for Integer
     */
    @JsonSetter("parent_invoice_number")
    public void setParentInvoiceNumber(Integer parentInvoiceNumber) {
        this.parentInvoiceNumber = OptionalNullable.of(parentInvoiceNumber);
    }

    /**
     * UnSetter for ParentInvoiceNumber.
     * For invoices with `consolidation_level` of `child`, this specifies the number of the parent
     * (consolidated) invoice.
     */
    public void unsetParentInvoiceNumber() {
        parentInvoiceNumber = null;
    }

    /**
     * Internal Getter for RemainingPrepaymentAmount.
     * @return Returns the Internal String
     */
    @JsonGetter("remaining_prepayment_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetRemainingPrepaymentAmount() {
        return this.remainingPrepaymentAmount;
    }

    /**
     * Getter for RemainingPrepaymentAmount.
     * @return Returns the String
     */
    public String getRemainingPrepaymentAmount() {
        return OptionalNullable.getFrom(remainingPrepaymentAmount);
    }

    /**
     * Setter for RemainingPrepaymentAmount.
     * @param remainingPrepaymentAmount Value for String
     */
    @JsonSetter("remaining_prepayment_amount")
    public void setRemainingPrepaymentAmount(String remainingPrepaymentAmount) {
        this.remainingPrepaymentAmount = OptionalNullable.of(remainingPrepaymentAmount);
    }

    /**
     * UnSetter for RemainingPrepaymentAmount.
     */
    public void unsetRemainingPrepaymentAmount() {
        remainingPrepaymentAmount = null;
    }

    /**
     * Getter for Prepayment.
     * The flag that shows whether the original payment was a prepayment or not
     * @return Returns the Boolean
     */
    @JsonGetter("prepayment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPrepayment() {
        return prepayment;
    }

    /**
     * Setter for Prepayment.
     * The flag that shows whether the original payment was a prepayment or not
     * @param prepayment Value for Boolean
     */
    @JsonSetter("prepayment")
    public void setPrepayment(Boolean prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * Getter for External.
     * @return Returns the Boolean
     */
    @JsonGetter("external")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getExternal() {
        return external;
    }

    /**
     * Setter for External.
     * @param external Value for Boolean
     */
    @JsonSetter("external")
    public void setExternal(Boolean external) {
        this.external = external;
    }

    /**
     * Getter for FromCollectionMethod.
     * The previous collection method of the invoice.
     * @return Returns the String
     */
    @JsonGetter("from_collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFromCollectionMethod() {
        return fromCollectionMethod;
    }

    /**
     * Setter for FromCollectionMethod.
     * The previous collection method of the invoice.
     * @param fromCollectionMethod Value for String
     */
    @JsonSetter("from_collection_method")
    public void setFromCollectionMethod(String fromCollectionMethod) {
        this.fromCollectionMethod = fromCollectionMethod;
    }

    /**
     * Getter for ToCollectionMethod.
     * The new collection method of the invoice.
     * @return Returns the String
     */
    @JsonGetter("to_collection_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToCollectionMethod() {
        return toCollectionMethod;
    }

    /**
     * Setter for ToCollectionMethod.
     * The new collection method of the invoice.
     * @param toCollectionMethod Value for String
     */
    @JsonSetter("to_collection_method")
    public void setToCollectionMethod(String toCollectionMethod) {
        this.toCollectionMethod = toCollectionMethod;
    }

    /**
     * Getter for FromStatus.
     * @return Returns the Object
     */
    @JsonGetter("from_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getFromStatus() {
        return fromStatus;
    }

    /**
     * Setter for FromStatus.
     * @param fromStatus Value for Object
     */
    @JsonSetter("from_status")
    public void setFromStatus(Object fromStatus) {
        this.fromStatus = fromStatus;
    }

    /**
     * Getter for ToStatus.
     * @return Returns the Object
     */
    @JsonGetter("to_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getToStatus() {
        return toStatus;
    }

    /**
     * Setter for ToStatus.
     * @param toStatus Value for Object
     */
    @JsonSetter("to_status")
    public void setToStatus(Object toStatus) {
        this.toStatus = toStatus;
    }

    /**
     * Getter for DueAmount.
     * Amount due on the invoice, which is `total_amount - credit_amount - paid_amount`.
     * @return Returns the String
     */
    @JsonGetter("due_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDueAmount() {
        return dueAmount;
    }

    /**
     * Setter for DueAmount.
     * Amount due on the invoice, which is `total_amount - credit_amount - paid_amount`.
     * @param dueAmount Value for String
     */
    @JsonSetter("due_amount")
    public void setDueAmount(String dueAmount) {
        this.dueAmount = dueAmount;
    }

    /**
     * Getter for TotalAmount.
     * The invoice total, which is `subtotal_amount - discount_amount + tax_amount`.'
     * @return Returns the String
     */
    @JsonGetter("total_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Setter for TotalAmount.
     * The invoice total, which is `subtotal_amount - discount_amount + tax_amount`.'
     * @param totalAmount Value for String
     */
    @JsonSetter("total_amount")
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Getter for ApplyCredit.
     * If true, credit was created and applied it to the invoice.
     * @return Returns the Boolean
     */
    @JsonGetter("apply_credit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getApplyCredit() {
        return applyCredit;
    }

    /**
     * Setter for ApplyCredit.
     * If true, credit was created and applied it to the invoice.
     * @param applyCredit Value for Boolean
     */
    @JsonSetter("apply_credit")
    public void setApplyCredit(Boolean applyCredit) {
        this.applyCredit = applyCredit;
    }

    /**
     * Getter for CreditNoteAttributes.
     * @return Returns the CreditNote1
     */
    @JsonGetter("credit_note_attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreditNote1 getCreditNoteAttributes() {
        return creditNoteAttributes;
    }

    /**
     * Setter for CreditNoteAttributes.
     * @param creditNoteAttributes Value for CreditNote1
     */
    @JsonSetter("credit_note_attributes")
    public void setCreditNoteAttributes(CreditNote1 creditNoteAttributes) {
        this.creditNoteAttributes = creditNoteAttributes;
    }

    /**
     * Getter for PaymentId.
     * The ID of the payment transaction to be refunded.
     * @return Returns the Integer
     */
    @JsonGetter("payment_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPaymentId() {
        return paymentId;
    }

    /**
     * Setter for PaymentId.
     * The ID of the payment transaction to be refunded.
     * @param paymentId Value for Integer
     */
    @JsonSetter("payment_id")
    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * Getter for RefundAmount.
     * The amount of the refund.
     * @return Returns the String
     */
    @JsonGetter("refund_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRefundAmount() {
        return refundAmount;
    }

    /**
     * Setter for RefundAmount.
     * The amount of the refund.
     * @param refundAmount Value for String
     */
    @JsonSetter("refund_amount")
    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * Getter for RefundId.
     * The ID of the refund transaction.
     * @return Returns the Integer
     */
    @JsonGetter("refund_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRefundId() {
        return refundId;
    }

    /**
     * Setter for RefundId.
     * The ID of the refund transaction.
     * @param refundId Value for Integer
     */
    @JsonSetter("refund_id")
    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }

    /**
     * Getter for IsAdvanceInvoice.
     * If true, the invoice is an advance invoice.
     * @return Returns the Boolean
     */
    @JsonGetter("is_advance_invoice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsAdvanceInvoice() {
        return isAdvanceInvoice;
    }

    /**
     * Setter for IsAdvanceInvoice.
     * If true, the invoice is an advance invoice.
     * @param isAdvanceInvoice Value for Boolean
     */
    @JsonSetter("is_advance_invoice")
    public void setIsAdvanceInvoice(Boolean isAdvanceInvoice) {
        this.isAdvanceInvoice = isAdvanceInvoice;
    }

    /**
     * Getter for Reason.
     * The reason for the void.
     * @return Returns the String
     */
    @JsonGetter("reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReason() {
        return reason;
    }

    /**
     * Setter for Reason.
     * The reason for the void.
     * @param reason Value for String
     */
    @JsonSetter("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Getter for Id.
     * @return Returns the Long
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Long
     */
    @JsonSetter("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for SiteId.
     * ID of the site to which the invoice belongs.
     * @return Returns the Integer
     */
    @JsonGetter("site_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSiteId() {
        return siteId;
    }

    /**
     * Setter for SiteId.
     * ID of the site to which the invoice belongs.
     * @param siteId Value for Integer
     */
    @JsonSetter("site_id")
    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    /**
     * Getter for CustomerId.
     * ID of the customer to which the invoice belongs.
     * @return Returns the Integer
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * ID of the customer to which the invoice belongs.
     * @param customerId Value for Integer
     */
    @JsonSetter("customer_id")
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for SubscriptionId.
     * ID of the subscription that generated the invoice.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * ID of the subscription that generated the invoice.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for Number.
     * A unique, identifying string that appears on the invoice and in places the invoice is
     * referenced. While the UID is long and not appropriate to show to customers, the number is
     * usually shorter and consumable by the customer and the merchant alike.
     * @return Returns the String
     */
    @JsonGetter("number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * A unique, identifying string that appears on the invoice and in places the invoice is
     * referenced. While the UID is long and not appropriate to show to customers, the number is
     * usually shorter and consumable by the customer and the merchant alike.
     * @param number Value for String
     */
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Getter for SequenceNumber.
     * A monotonically increasing number assigned to invoices as they are created. This number is
     * unique within a site and can be used to sort and order invoices.
     * @return Returns the Integer
     */
    @JsonGetter("sequence_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Setter for SequenceNumber.
     * A monotonically increasing number assigned to invoices as they are created. This number is
     * unique within a site and can be used to sort and order invoices.
     * @param sequenceNumber Value for Integer
     */
    @JsonSetter("sequence_number")
    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
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
     * Getter for UpdatedAt.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for ZonedDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for IssueDate.
     * Date the invoice was issued to the customer. This is the date that the invoice was made
     * available for payment. The format is `"YYYY-MM-DD"`.
     * @return Returns the LocalDate
     */
    @JsonGetter("issue_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /**
     * Setter for IssueDate.
     * Date the invoice was issued to the customer. This is the date that the invoice was made
     * available for payment. The format is `"YYYY-MM-DD"`.
     * @param issueDate Value for LocalDate
     */
    @JsonSetter("issue_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * Getter for DueDate.
     * Date the invoice is due. The format is `"YYYY-MM-DD"`.
     * @return Returns the LocalDate
     */
    @JsonGetter("due_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * Setter for DueDate.
     * Date the invoice is due. The format is `"YYYY-MM-DD"`.
     * @param dueDate Value for LocalDate
     */
    @JsonSetter("due_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Internal Getter for PaidDate.
     * Date the invoice became fully paid. If partial payments are applied to the invoice, this date
     * will not be present until payment has been made in full. The format is `"YYYY-MM-DD"`.
     * @return Returns the Internal LocalDate
     */
    @JsonGetter("paid_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.SimpleDateSerializer.class)
    protected OptionalNullable<LocalDate> internalGetPaidDate() {
        return this.paidDate;
    }

    /**
     * Getter for PaidDate.
     * Date the invoice became fully paid. If partial payments are applied to the invoice, this date
     * will not be present until payment has been made in full. The format is `"YYYY-MM-DD"`.
     * @return Returns the LocalDate
     */
    public LocalDate getPaidDate() {
        return OptionalNullable.getFrom(paidDate);
    }

    /**
     * Setter for PaidDate.
     * Date the invoice became fully paid. If partial payments are applied to the invoice, this date
     * will not be present until payment has been made in full. The format is `"YYYY-MM-DD"`.
     * @param paidDate Value for LocalDate
     */
    @JsonSetter("paid_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setPaidDate(LocalDate paidDate) {
        this.paidDate = OptionalNullable.of(paidDate);
    }

    /**
     * UnSetter for PaidDate.
     * Date the invoice became fully paid. If partial payments are applied to the invoice, this date
     * will not be present until payment has been made in full. The format is `"YYYY-MM-DD"`.
     */
    public void unsetPaidDate() {
        paidDate = null;
    }

    /**
     * Getter for Status.
     * The current status of the invoice. See [Invoice
     * Statuses](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405078794253-Introduction-to-Invoices#invoice-statuses)
     * for more.
     * @return Returns the InvoiceStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The current status of the invoice. See [Invoice
     * Statuses](https://maxio-chargify.zendesk.com/hc/en-us/articles/5405078794253-Introduction-to-Invoices#invoice-statuses)
     * for more.
     * @param status Value for InvoiceStatus
     */
    @JsonSetter("status")
    public void setStatus(InvoiceStatus status) {
        this.status = status;
    }

    /**
     * Internal Getter for ParentInvoiceId.
     * @return Returns the Internal Integer
     */
    @JsonGetter("parent_invoice_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetParentInvoiceId() {
        return this.parentInvoiceId;
    }

    /**
     * Getter for ParentInvoiceId.
     * @return Returns the Integer
     */
    public Integer getParentInvoiceId() {
        return OptionalNullable.getFrom(parentInvoiceId);
    }

    /**
     * Setter for ParentInvoiceId.
     * @param parentInvoiceId Value for Integer
     */
    @JsonSetter("parent_invoice_id")
    public void setParentInvoiceId(Integer parentInvoiceId) {
        this.parentInvoiceId = OptionalNullable.of(parentInvoiceId);
    }

    /**
     * UnSetter for ParentInvoiceId.
     */
    public void unsetParentInvoiceId() {
        parentInvoiceId = null;
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
     * A message that is printed on the invoice when it is marked for remittance collection. It is
     * intended to describe to the customer how they may make payment, and is configured by the
     * merchant.
     * @return Returns the String
     */
    @JsonGetter("payment_instructions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaymentInstructions() {
        return paymentInstructions;
    }

    /**
     * Setter for PaymentInstructions.
     * A message that is printed on the invoice when it is marked for remittance collection. It is
     * intended to describe to the customer how they may make payment, and is configured by the
     * merchant.
     * @param paymentInstructions Value for String
     */
    @JsonSetter("payment_instructions")
    public void setPaymentInstructions(String paymentInstructions) {
        this.paymentInstructions = paymentInstructions;
    }

    /**
     * Getter for Currency.
     * The ISO 4217 currency code (3 character string) representing the currency of invoice
     * transaction.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * The ISO 4217 currency code (3 character string) representing the currency of invoice
     * transaction.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Internal Getter for ParentInvoiceUid.
     * For invoices with `consolidation_level` of `child`, this specifies the UID of the parent
     * (consolidated) invoice.
     * @return Returns the Internal String
     */
    @JsonGetter("parent_invoice_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetParentInvoiceUid() {
        return this.parentInvoiceUid;
    }

    /**
     * Getter for ParentInvoiceUid.
     * For invoices with `consolidation_level` of `child`, this specifies the UID of the parent
     * (consolidated) invoice.
     * @return Returns the String
     */
    public String getParentInvoiceUid() {
        return OptionalNullable.getFrom(parentInvoiceUid);
    }

    /**
     * Setter for ParentInvoiceUid.
     * For invoices with `consolidation_level` of `child`, this specifies the UID of the parent
     * (consolidated) invoice.
     * @param parentInvoiceUid Value for String
     */
    @JsonSetter("parent_invoice_uid")
    public void setParentInvoiceUid(String parentInvoiceUid) {
        this.parentInvoiceUid = OptionalNullable.of(parentInvoiceUid);
    }

    /**
     * UnSetter for ParentInvoiceUid.
     * For invoices with `consolidation_level` of `child`, this specifies the UID of the parent
     * (consolidated) invoice.
     */
    public void unsetParentInvoiceUid() {
        parentInvoiceUid = null;
    }

    /**
     * Internal Getter for SubscriptionGroupId.
     * @return Returns the Internal Integer
     */
    @JsonGetter("subscription_group_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetSubscriptionGroupId() {
        return this.subscriptionGroupId;
    }

    /**
     * Getter for SubscriptionGroupId.
     * @return Returns the Integer
     */
    public Integer getSubscriptionGroupId() {
        return OptionalNullable.getFrom(subscriptionGroupId);
    }

    /**
     * Setter for SubscriptionGroupId.
     * @param subscriptionGroupId Value for Integer
     */
    @JsonSetter("subscription_group_id")
    public void setSubscriptionGroupId(Integer subscriptionGroupId) {
        this.subscriptionGroupId = OptionalNullable.of(subscriptionGroupId);
    }

    /**
     * UnSetter for SubscriptionGroupId.
     */
    public void unsetSubscriptionGroupId() {
        subscriptionGroupId = null;
    }

    /**
     * Internal Getter for GroupPrimarySubscriptionId.
     * For invoices with `consolidation_level` of `parent`, this specifies the ID of the
     * subscription which was the primary subscription of the subscription group that generated the
     * invoice.
     * @return Returns the Internal Integer
     */
    @JsonGetter("group_primary_subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetGroupPrimarySubscriptionId() {
        return this.groupPrimarySubscriptionId;
    }

    /**
     * Getter for GroupPrimarySubscriptionId.
     * For invoices with `consolidation_level` of `parent`, this specifies the ID of the
     * subscription which was the primary subscription of the subscription group that generated the
     * invoice.
     * @return Returns the Integer
     */
    public Integer getGroupPrimarySubscriptionId() {
        return OptionalNullable.getFrom(groupPrimarySubscriptionId);
    }

    /**
     * Setter for GroupPrimarySubscriptionId.
     * For invoices with `consolidation_level` of `parent`, this specifies the ID of the
     * subscription which was the primary subscription of the subscription group that generated the
     * invoice.
     * @param groupPrimarySubscriptionId Value for Integer
     */
    @JsonSetter("group_primary_subscription_id")
    public void setGroupPrimarySubscriptionId(Integer groupPrimarySubscriptionId) {
        this.groupPrimarySubscriptionId = OptionalNullable.of(groupPrimarySubscriptionId);
    }

    /**
     * UnSetter for GroupPrimarySubscriptionId.
     * For invoices with `consolidation_level` of `parent`, this specifies the ID of the
     * subscription which was the primary subscription of the subscription group that generated the
     * invoice.
     */
    public void unsetGroupPrimarySubscriptionId() {
        groupPrimarySubscriptionId = null;
    }

    /**
     * Getter for ProductName.
     * The name of the product subscribed when the invoice was generated.
     * @return Returns the String
     */
    @JsonGetter("product_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductName() {
        return productName;
    }

    /**
     * Setter for ProductName.
     * The name of the product subscribed when the invoice was generated.
     * @param productName Value for String
     */
    @JsonSetter("product_name")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Getter for ProductFamilyName.
     * The name of the product family subscribed when the invoice was generated.
     * @return Returns the String
     */
    @JsonGetter("product_family_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductFamilyName() {
        return productFamilyName;
    }

    /**
     * Setter for ProductFamilyName.
     * The name of the product family subscribed when the invoice was generated.
     * @param productFamilyName Value for String
     */
    @JsonSetter("product_family_name")
    public void setProductFamilyName(String productFamilyName) {
        this.productFamilyName = productFamilyName;
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
     * Getter for Payer.
     * @return Returns the InvoicePayer
     */
    @JsonGetter("payer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoicePayer getPayer() {
        return payer;
    }

    /**
     * Setter for Payer.
     * @param payer Value for InvoicePayer
     */
    @JsonSetter("payer")
    public void setPayer(InvoicePayer payer) {
        this.payer = payer;
    }

    /**
     * Getter for RecipientEmails.
     * @return Returns the List of String
     */
    @JsonGetter("recipient_emails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getRecipientEmails() {
        return recipientEmails;
    }

    /**
     * Setter for RecipientEmails.
     * @param recipientEmails Value for List of String
     */
    @JsonSetter("recipient_emails")
    public void setRecipientEmails(List<String> recipientEmails) {
        this.recipientEmails = recipientEmails;
    }

    /**
     * Getter for NetTerms.
     * @return Returns the Integer
     */
    @JsonGetter("net_terms")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNetTerms() {
        return netTerms;
    }

    /**
     * Setter for NetTerms.
     * @param netTerms Value for Integer
     */
    @JsonSetter("net_terms")
    public void setNetTerms(Integer netTerms) {
        this.netTerms = netTerms;
    }

    /**
     * Getter for BillingAddress.
     * @return Returns the BillingAddress
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * @param billingAddress Value for BillingAddress
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for ShippingAddress.
     * @return Returns the ShippingAddress
     */
    @JsonGetter("shipping_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Setter for ShippingAddress.
     * @param shippingAddress Value for ShippingAddress
     */
    @JsonSetter("shipping_address")
    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * Getter for SubtotalAmount.
     * Subtotal of the invoice, which is the sum of all line items before discounts or taxes.
     * @return Returns the String
     */
    @JsonGetter("subtotal_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubtotalAmount() {
        return subtotalAmount;
    }

    /**
     * Setter for SubtotalAmount.
     * Subtotal of the invoice, which is the sum of all line items before discounts or taxes.
     * @param subtotalAmount Value for String
     */
    @JsonSetter("subtotal_amount")
    public void setSubtotalAmount(String subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }

    /**
     * Getter for DiscountAmount.
     * Total discount applied to the invoice.
     * @return Returns the String
     */
    @JsonGetter("discount_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Setter for DiscountAmount.
     * Total discount applied to the invoice.
     * @param discountAmount Value for String
     */
    @JsonSetter("discount_amount")
    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * Getter for TaxAmount.
     * Total tax on the invoice.
     * @return Returns the String
     */
    @JsonGetter("tax_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Setter for TaxAmount.
     * Total tax on the invoice.
     * @param taxAmount Value for String
     */
    @JsonSetter("tax_amount")
    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * Getter for CreditAmount.
     * The amount of credit (from credit notes) applied to this invoice. Credits offset the amount
     * due from the customer.
     * @return Returns the String
     */
    @JsonGetter("credit_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreditAmount() {
        return creditAmount;
    }

    /**
     * Setter for CreditAmount.
     * The amount of credit (from credit notes) applied to this invoice. Credits offset the amount
     * due from the customer.
     * @param creditAmount Value for String
     */
    @JsonSetter("credit_amount")
    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    /**
     * Getter for PaidAmount.
     * The amount paid on the invoice by the customer.
     * @return Returns the String
     */
    @JsonGetter("paid_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaidAmount() {
        return paidAmount;
    }

    /**
     * Setter for PaidAmount.
     * The amount paid on the invoice by the customer.
     * @param paidAmount Value for String
     */
    @JsonSetter("paid_amount")
    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * Getter for LineItems.
     * Line items on the invoice.
     * @return Returns the List of InvoiceLineItem1
     */
    @JsonGetter("line_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceLineItem1> getLineItems() {
        return lineItems;
    }

    /**
     * Setter for LineItems.
     * Line items on the invoice.
     * @param lineItems Value for List of InvoiceLineItem1
     */
    @JsonSetter("line_items")
    public void setLineItems(List<InvoiceLineItem1> lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * Getter for Discounts.
     * @return Returns the List of InvoiceDiscount
     */
    @JsonGetter("discounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceDiscount> getDiscounts() {
        return discounts;
    }

    /**
     * Setter for Discounts.
     * @param discounts Value for List of InvoiceDiscount
     */
    @JsonSetter("discounts")
    public void setDiscounts(List<InvoiceDiscount> discounts) {
        this.discounts = discounts;
    }

    /**
     * Getter for Taxes.
     * @return Returns the List of InvoiceTax
     */
    @JsonGetter("taxes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceTax> getTaxes() {
        return taxes;
    }

    /**
     * Setter for Taxes.
     * @param taxes Value for List of InvoiceTax
     */
    @JsonSetter("taxes")
    public void setTaxes(List<InvoiceTax> taxes) {
        this.taxes = taxes;
    }

    /**
     * Getter for Credits.
     * @return Returns the List of InvoiceCredit
     */
    @JsonGetter("credits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceCredit> getCredits() {
        return credits;
    }

    /**
     * Setter for Credits.
     * @param credits Value for List of InvoiceCredit
     */
    @JsonSetter("credits")
    public void setCredits(List<InvoiceCredit> credits) {
        this.credits = credits;
    }

    /**
     * Getter for Refunds.
     * @return Returns the List of InvoiceRefund
     */
    @JsonGetter("refunds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceRefund> getRefunds() {
        return refunds;
    }

    /**
     * Setter for Refunds.
     * @param refunds Value for List of InvoiceRefund
     */
    @JsonSetter("refunds")
    public void setRefunds(List<InvoiceRefund> refunds) {
        this.refunds = refunds;
    }

    /**
     * Getter for Payments.
     * @return Returns the List of InvoicePayment
     */
    @JsonGetter("payments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoicePayment> getPayments() {
        return payments;
    }

    /**
     * Setter for Payments.
     * @param payments Value for List of InvoicePayment
     */
    @JsonSetter("payments")
    public void setPayments(List<InvoicePayment> payments) {
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
     * Getter for DisplaySettings.
     * @return Returns the InvoiceDisplaySettings
     */
    @JsonGetter("display_settings")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceDisplaySettings getDisplaySettings() {
        return displaySettings;
    }

    /**
     * Setter for DisplaySettings.
     * @param displaySettings Value for InvoiceDisplaySettings
     */
    @JsonSetter("display_settings")
    public void setDisplaySettings(InvoiceDisplaySettings displaySettings) {
        this.displaySettings = displaySettings;
    }

    /**
     * Getter for PublicUrl.
     * The public URL of the invoice
     * @return Returns the String
     */
    @JsonGetter("public_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPublicUrl() {
        return publicUrl;
    }

    /**
     * Setter for PublicUrl.
     * The public URL of the invoice
     * @param publicUrl Value for String
     */
    @JsonSetter("public_url")
    public void setPublicUrl(String publicUrl) {
        this.publicUrl = publicUrl;
    }

    /**
     * Getter for PreviousBalanceData.
     * @return Returns the InvoicePreviousBalance
     */
    @JsonGetter("previous_balance_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoicePreviousBalance getPreviousBalanceData() {
        return previousBalanceData;
    }

    /**
     * Setter for PreviousBalanceData.
     * @param previousBalanceData Value for InvoicePreviousBalance
     */
    @JsonSetter("previous_balance_data")
    public void setPreviousBalanceData(InvoicePreviousBalance previousBalanceData) {
        this.previousBalanceData = previousBalanceData;
    }

    /**
     * Getter for GatewayTransId.
     * Identifier for the transaction within the payment gateway.
     * @return Returns the String
     */
    @JsonGetter("gateway_trans_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGatewayTransId() {
        return gatewayTransId;
    }

    /**
     * Setter for GatewayTransId.
     * Identifier for the transaction within the payment gateway.
     * @param gatewayTransId Value for String
     */
    @JsonSetter("gateway_trans_id")
    public void setGatewayTransId(String gatewayTransId) {
        this.gatewayTransId = gatewayTransId;
    }

    /**
     * Getter for Amount.
     * The monetary value associated with the linked payment, expressed in dollars.
     * @return Returns the String
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * The monetary value associated with the linked payment, expressed in dollars.
     * @param amount Value for String
     */
    @JsonSetter("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Getter for AmountInCents.
     * The monetary value of the payment, expressed in cents.
     * @return Returns the Integer
     */
    @JsonGetter("amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * The monetary value of the payment, expressed in cents.
     * @param amountInCents Value for Integer
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(Integer amountInCents) {
        this.amountInCents = amountInCents;
    }

    /**
     * Getter for OriginCreditNoteUid.
     * Unique identifier for the connected credit note. It is generated automatically by Chargify
     * and has the prefix "cn_" followed by alphanumeric characters. While the UID is long and not
     * appropriate to show to customers, the number is usually shorter and consumable by the
     * customer and the merchant alike.
     * @return Returns the String
     */
    @JsonGetter("origin_credit_note_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOriginCreditNoteUid() {
        return originCreditNoteUid;
    }

    /**
     * Setter for OriginCreditNoteUid.
     * Unique identifier for the connected credit note. It is generated automatically by Chargify
     * and has the prefix "cn_" followed by alphanumeric characters. While the UID is long and not
     * appropriate to show to customers, the number is usually shorter and consumable by the
     * customer and the merchant alike.
     * @param originCreditNoteUid Value for String
     */
    @JsonSetter("origin_credit_note_uid")
    public void setOriginCreditNoteUid(String originCreditNoteUid) {
        this.originCreditNoteUid = originCreditNoteUid;
    }

    /**
     * Getter for OriginCreditNoteNumber.
     * A unique, identifying string of the connected credit note.
     * @return Returns the String
     */
    @JsonGetter("origin_credit_note_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOriginCreditNoteNumber() {
        return originCreditNoteNumber;
    }

    /**
     * Setter for OriginCreditNoteNumber.
     * A unique, identifying string of the connected credit note.
     * @param originCreditNoteNumber Value for String
     */
    @JsonSetter("origin_credit_note_number")
    public void setOriginCreditNoteNumber(String originCreditNoteNumber) {
        this.originCreditNoteNumber = originCreditNoteNumber;
    }

    /**
     * Getter for AppliedDate.
     * Debit notes are applied to invoices to offset invoiced amounts - they adjust the amount due.
     * This field is the date the debit note document became fully applied to the invoice. The
     * format is "YYYY-MM-DD".
     * @return Returns the LocalDate
     */
    @JsonGetter("applied_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    /**
     * Setter for AppliedDate.
     * Debit notes are applied to invoices to offset invoiced amounts - they adjust the amount due.
     * This field is the date the debit note document became fully applied to the invoice. The
     * format is "YYYY-MM-DD".
     * @param appliedDate Value for LocalDate
     */
    @JsonSetter("applied_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setAppliedDate(LocalDate appliedDate) {
        this.appliedDate = appliedDate;
    }

    /**
     * Getter for RemainingAmount.
     * The amount of the credit note remaining to be applied to invoices, which is `total_amount -
     * applied_amount`.
     * @return Returns the String
     */
    @JsonGetter("remaining_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRemainingAmount() {
        return remainingAmount;
    }

    /**
     * Setter for RemainingAmount.
     * The amount of the credit note remaining to be applied to invoices, which is `total_amount -
     * applied_amount`.
     * @param remainingAmount Value for String
     */
    @JsonSetter("remaining_amount")
    public void setRemainingAmount(String remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    /**
     * Getter for Applications.
     * @return Returns the List of CreditNoteApplication
     */
    @JsonGetter("applications")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CreditNoteApplication> getApplications() {
        return applications;
    }

    /**
     * Setter for Applications.
     * @param applications Value for List of CreditNoteApplication
     */
    @JsonSetter("applications")
    public void setApplications(List<CreditNoteApplication> applications) {
        this.applications = applications;
    }

    /**
     * Getter for OriginInvoices.
     * An array of origin invoices for the credit note. Learn more about [Origin Invoice from our
     * docs](https://chargify.zendesk.com/hc/en-us/articles/4407753036699#origin-invoices)
     * @return Returns the List of OriginInvoice
     */
    @JsonGetter("origin_invoices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OriginInvoice> getOriginInvoices() {
        return originInvoices;
    }

    /**
     * Setter for OriginInvoices.
     * An array of origin invoices for the credit note. Learn more about [Origin Invoice from our
     * docs](https://chargify.zendesk.com/hc/en-us/articles/4407753036699#origin-invoices)
     * @param originInvoices Value for List of OriginInvoice
     */
    @JsonSetter("origin_invoices")
    public void setOriginInvoices(List<OriginInvoice> originInvoices) {
        this.originInvoices = originInvoices;
    }

    /**
     * Getter for ChargebackStatus.
     * @return Returns the ChargebackStatus
     */
    @JsonGetter("chargeback_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChargebackStatus getChargebackStatus() {
        return chargebackStatus;
    }

    /**
     * Setter for ChargebackStatus.
     * @param chargebackStatus Value for ChargebackStatus
     */
    @JsonSetter("chargeback_status")
    public void setChargebackStatus(ChargebackStatus chargebackStatus) {
        this.chargebackStatus = chargebackStatus;
    }

    /**
     * Converts this InvoiceEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceEventData [" + "uid=" + uid + ", creditNoteNumber=" + creditNoteNumber
                + ", creditNoteUid=" + creditNoteUid + ", originalAmount=" + originalAmount
                + ", appliedAmount=" + appliedAmount + ", transactionTime=" + transactionTime
                + ", memo=" + memo + ", role=" + role + ", consolidatedInvoice="
                + consolidatedInvoice + ", appliedCreditNotes=" + appliedCreditNotes
                + ", debitNoteNumber=" + debitNoteNumber + ", debitNoteUid=" + debitNoteUid
                + ", consolidationLevel=" + consolidationLevel + ", paymentMethod=" + paymentMethod
                + ", transactionId=" + transactionId + ", parentInvoiceNumber="
                + parentInvoiceNumber + ", remainingPrepaymentAmount=" + remainingPrepaymentAmount
                + ", prepayment=" + prepayment + ", external=" + external
                + ", fromCollectionMethod=" + fromCollectionMethod + ", toCollectionMethod="
                + toCollectionMethod + ", fromStatus=" + fromStatus + ", toStatus=" + toStatus
                + ", dueAmount=" + dueAmount + ", totalAmount=" + totalAmount + ", applyCredit="
                + applyCredit + ", creditNoteAttributes=" + creditNoteAttributes + ", paymentId="
                + paymentId + ", refundAmount=" + refundAmount + ", refundId=" + refundId
                + ", isAdvanceInvoice=" + isAdvanceInvoice + ", reason=" + reason + ", id=" + id
                + ", siteId=" + siteId + ", customerId=" + customerId + ", subscriptionId="
                + subscriptionId + ", number=" + number + ", sequenceNumber=" + sequenceNumber
                + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", issueDate="
                + issueDate + ", dueDate=" + dueDate + ", paidDate=" + paidDate + ", status="
                + status + ", parentInvoiceId=" + parentInvoiceId + ", collectionMethod="
                + collectionMethod + ", paymentInstructions=" + paymentInstructions + ", currency="
                + currency + ", parentInvoiceUid=" + parentInvoiceUid + ", subscriptionGroupId="
                + subscriptionGroupId + ", groupPrimarySubscriptionId=" + groupPrimarySubscriptionId
                + ", productName=" + productName + ", productFamilyName=" + productFamilyName
                + ", seller=" + seller + ", customer=" + customer + ", payer=" + payer
                + ", recipientEmails=" + recipientEmails + ", netTerms=" + netTerms
                + ", billingAddress=" + billingAddress + ", shippingAddress=" + shippingAddress
                + ", subtotalAmount=" + subtotalAmount + ", discountAmount=" + discountAmount
                + ", taxAmount=" + taxAmount + ", creditAmount=" + creditAmount + ", paidAmount="
                + paidAmount + ", lineItems=" + lineItems + ", discounts=" + discounts + ", taxes="
                + taxes + ", credits=" + credits + ", refunds=" + refunds + ", payments=" + payments
                + ", customFields=" + customFields + ", displaySettings=" + displaySettings
                + ", publicUrl=" + publicUrl + ", previousBalanceData=" + previousBalanceData
                + ", gatewayTransId=" + gatewayTransId + ", amount=" + amount + ", amountInCents="
                + amountInCents + ", originCreditNoteUid=" + originCreditNoteUid
                + ", originCreditNoteNumber=" + originCreditNoteNumber + ", appliedDate="
                + appliedDate + ", remainingAmount=" + remainingAmount + ", applications="
                + applications + ", originInvoices=" + originInvoices + ", chargebackStatus="
                + chargebackStatus + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link InvoiceEventData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceEventData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .creditNoteNumber(getCreditNoteNumber())
                .creditNoteUid(getCreditNoteUid())
                .originalAmount(getOriginalAmount())
                .appliedAmount(getAppliedAmount())
                .transactionTime(getTransactionTime())
                .role(getRole())
                .consolidatedInvoice(getConsolidatedInvoice())
                .appliedCreditNotes(getAppliedCreditNotes())
                .debitNoteNumber(getDebitNoteNumber())
                .debitNoteUid(getDebitNoteUid())
                .consolidationLevel(getConsolidationLevel())
                .paymentMethod(getPaymentMethod())
                .transactionId(getTransactionId())
                .prepayment(getPrepayment())
                .external(getExternal())
                .fromCollectionMethod(getFromCollectionMethod())
                .toCollectionMethod(getToCollectionMethod())
                .fromStatus(getFromStatus())
                .toStatus(getToStatus())
                .dueAmount(getDueAmount())
                .totalAmount(getTotalAmount())
                .applyCredit(getApplyCredit())
                .creditNoteAttributes(getCreditNoteAttributes())
                .paymentId(getPaymentId())
                .refundAmount(getRefundAmount())
                .refundId(getRefundId())
                .isAdvanceInvoice(getIsAdvanceInvoice())
                .reason(getReason())
                .id(getId())
                .siteId(getSiteId())
                .customerId(getCustomerId())
                .subscriptionId(getSubscriptionId())
                .number(getNumber())
                .sequenceNumber(getSequenceNumber())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .issueDate(getIssueDate())
                .dueDate(getDueDate())
                .status(getStatus())
                .collectionMethod(getCollectionMethod())
                .paymentInstructions(getPaymentInstructions())
                .currency(getCurrency())
                .productName(getProductName())
                .productFamilyName(getProductFamilyName())
                .seller(getSeller())
                .customer(getCustomer())
                .payer(getPayer())
                .recipientEmails(getRecipientEmails())
                .netTerms(getNetTerms())
                .billingAddress(getBillingAddress())
                .shippingAddress(getShippingAddress())
                .subtotalAmount(getSubtotalAmount())
                .discountAmount(getDiscountAmount())
                .taxAmount(getTaxAmount())
                .creditAmount(getCreditAmount())
                .paidAmount(getPaidAmount())
                .lineItems(getLineItems())
                .discounts(getDiscounts())
                .taxes(getTaxes())
                .credits(getCredits())
                .refunds(getRefunds())
                .payments(getPayments())
                .customFields(getCustomFields())
                .displaySettings(getDisplaySettings())
                .publicUrl(getPublicUrl())
                .previousBalanceData(getPreviousBalanceData())
                .gatewayTransId(getGatewayTransId())
                .amount(getAmount())
                .amountInCents(getAmountInCents())
                .originCreditNoteUid(getOriginCreditNoteUid())
                .originCreditNoteNumber(getOriginCreditNoteNumber())
                .appliedDate(getAppliedDate())
                .remainingAmount(getRemainingAmount())
                .applications(getApplications())
                .originInvoices(getOriginInvoices())
                .chargebackStatus(getChargebackStatus());
        builder.memo = internalGetMemo();
        builder.parentInvoiceNumber = internalGetParentInvoiceNumber();
        builder.remainingPrepaymentAmount = internalGetRemainingPrepaymentAmount();
        builder.paidDate = internalGetPaidDate();
        builder.parentInvoiceId = internalGetParentInvoiceId();
        builder.parentInvoiceUid = internalGetParentInvoiceUid();
        builder.subscriptionGroupId = internalGetSubscriptionGroupId();
        builder.groupPrimarySubscriptionId = internalGetGroupPrimarySubscriptionId();
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceEventData}.
     */
    public static class Builder {
        private String uid;
        private String creditNoteNumber;
        private String creditNoteUid;
        private String originalAmount;
        private String appliedAmount;
        private ZonedDateTime transactionTime;
        private OptionalNullable<String> memo;
        private InvoiceRole1 role;
        private Boolean consolidatedInvoice;
        private List<AppliedCreditNoteData> appliedCreditNotes;
        private String debitNoteNumber;
        private String debitNoteUid;
        private InvoiceConsolidationLevel consolidationLevel;
        private InvoiceEventDataPaymentMethod paymentMethod;
        private Integer transactionId;
        private OptionalNullable<Integer> parentInvoiceNumber;
        private OptionalNullable<String> remainingPrepaymentAmount;
        private Boolean prepayment;
        private Boolean external;
        private String fromCollectionMethod;
        private String toCollectionMethod;
        private Object fromStatus;
        private Object toStatus;
        private String dueAmount;
        private String totalAmount;
        private Boolean applyCredit;
        private CreditNote1 creditNoteAttributes;
        private Integer paymentId;
        private String refundAmount;
        private Integer refundId;
        private Boolean isAdvanceInvoice;
        private String reason;
        private Long id;
        private Integer siteId;
        private Integer customerId;
        private Integer subscriptionId;
        private String number;
        private Integer sequenceNumber;
        private ZonedDateTime createdAt;
        private ZonedDateTime updatedAt;
        private LocalDate issueDate;
        private LocalDate dueDate;
        private OptionalNullable<LocalDate> paidDate;
        private InvoiceStatus status;
        private OptionalNullable<Integer> parentInvoiceId;
        private CollectionMethod collectionMethod = CollectionMethod.AUTOMATIC;
        private String paymentInstructions;
        private String currency;
        private OptionalNullable<String> parentInvoiceUid;
        private OptionalNullable<Integer> subscriptionGroupId;
        private OptionalNullable<Integer> groupPrimarySubscriptionId;
        private String productName;
        private String productFamilyName;
        private InvoiceSeller seller;
        private InvoiceCustomer customer;
        private InvoicePayer payer;
        private List<String> recipientEmails;
        private Integer netTerms;
        private BillingAddress billingAddress;
        private ShippingAddress shippingAddress;
        private String subtotalAmount;
        private String discountAmount;
        private String taxAmount;
        private String creditAmount;
        private String paidAmount;
        private List<InvoiceLineItem1> lineItems;
        private List<InvoiceDiscount> discounts;
        private List<InvoiceTax> taxes;
        private List<InvoiceCredit> credits;
        private List<InvoiceRefund> refunds;
        private List<InvoicePayment> payments;
        private List<InvoiceCustomField> customFields;
        private InvoiceDisplaySettings displaySettings;
        private String publicUrl;
        private InvoicePreviousBalance previousBalanceData;
        private String gatewayTransId;
        private String amount;
        private Integer amountInCents;
        private String originCreditNoteUid;
        private String originCreditNoteNumber;
        private LocalDate appliedDate;
        private String remainingAmount;
        private List<CreditNoteApplication> applications;
        private List<OriginInvoice> originInvoices;
        private ChargebackStatus chargebackStatus;



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
         * Setter for creditNoteNumber.
         * @param  creditNoteNumber  String value for creditNoteNumber.
         * @return Builder
         */
        public Builder creditNoteNumber(String creditNoteNumber) {
            this.creditNoteNumber = creditNoteNumber;
            return this;
        }

        /**
         * Setter for creditNoteUid.
         * @param  creditNoteUid  String value for creditNoteUid.
         * @return Builder
         */
        public Builder creditNoteUid(String creditNoteUid) {
            this.creditNoteUid = creditNoteUid;
            return this;
        }

        /**
         * Setter for originalAmount.
         * @param  originalAmount  String value for originalAmount.
         * @return Builder
         */
        public Builder originalAmount(String originalAmount) {
            this.originalAmount = originalAmount;
            return this;
        }

        /**
         * Setter for appliedAmount.
         * @param  appliedAmount  String value for appliedAmount.
         * @return Builder
         */
        public Builder appliedAmount(String appliedAmount) {
            this.appliedAmount = appliedAmount;
            return this;
        }

        /**
         * Setter for transactionTime.
         * @param  transactionTime  ZonedDateTime value for transactionTime.
         * @return Builder
         */
        public Builder transactionTime(ZonedDateTime transactionTime) {
            this.transactionTime = transactionTime;
            return this;
        }

        /**
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = OptionalNullable.of(memo);
            return this;
        }

        /**
         * UnSetter for memo.
         * @return Builder
         */
        public Builder unsetMemo() {
            memo = null;
            return this;
        }

        /**
         * Setter for role.
         * @param  role  InvoiceRole1 value for role.
         * @return Builder
         */
        public Builder role(InvoiceRole1 role) {
            this.role = role;
            return this;
        }

        /**
         * Setter for consolidatedInvoice.
         * @param  consolidatedInvoice  Boolean value for consolidatedInvoice.
         * @return Builder
         */
        public Builder consolidatedInvoice(Boolean consolidatedInvoice) {
            this.consolidatedInvoice = consolidatedInvoice;
            return this;
        }

        /**
         * Setter for appliedCreditNotes.
         * @param  appliedCreditNotes  List of AppliedCreditNoteData value for appliedCreditNotes.
         * @return Builder
         */
        public Builder appliedCreditNotes(List<AppliedCreditNoteData> appliedCreditNotes) {
            this.appliedCreditNotes = appliedCreditNotes;
            return this;
        }

        /**
         * Setter for debitNoteNumber.
         * @param  debitNoteNumber  String value for debitNoteNumber.
         * @return Builder
         */
        public Builder debitNoteNumber(String debitNoteNumber) {
            this.debitNoteNumber = debitNoteNumber;
            return this;
        }

        /**
         * Setter for debitNoteUid.
         * @param  debitNoteUid  String value for debitNoteUid.
         * @return Builder
         */
        public Builder debitNoteUid(String debitNoteUid) {
            this.debitNoteUid = debitNoteUid;
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
         * Setter for paymentMethod.
         * @param  paymentMethod  InvoiceEventDataPaymentMethod value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(InvoiceEventDataPaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        /**
         * Setter for transactionId.
         * @param  transactionId  Integer value for transactionId.
         * @return Builder
         */
        public Builder transactionId(Integer transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        /**
         * Setter for parentInvoiceNumber.
         * @param  parentInvoiceNumber  Integer value for parentInvoiceNumber.
         * @return Builder
         */
        public Builder parentInvoiceNumber(Integer parentInvoiceNumber) {
            this.parentInvoiceNumber = OptionalNullable.of(parentInvoiceNumber);
            return this;
        }

        /**
         * UnSetter for parentInvoiceNumber.
         * @return Builder
         */
        public Builder unsetParentInvoiceNumber() {
            parentInvoiceNumber = null;
            return this;
        }

        /**
         * Setter for remainingPrepaymentAmount.
         * @param  remainingPrepaymentAmount  String value for remainingPrepaymentAmount.
         * @return Builder
         */
        public Builder remainingPrepaymentAmount(String remainingPrepaymentAmount) {
            this.remainingPrepaymentAmount = OptionalNullable.of(remainingPrepaymentAmount);
            return this;
        }

        /**
         * UnSetter for remainingPrepaymentAmount.
         * @return Builder
         */
        public Builder unsetRemainingPrepaymentAmount() {
            remainingPrepaymentAmount = null;
            return this;
        }

        /**
         * Setter for prepayment.
         * @param  prepayment  Boolean value for prepayment.
         * @return Builder
         */
        public Builder prepayment(Boolean prepayment) {
            this.prepayment = prepayment;
            return this;
        }

        /**
         * Setter for external.
         * @param  external  Boolean value for external.
         * @return Builder
         */
        public Builder external(Boolean external) {
            this.external = external;
            return this;
        }

        /**
         * Setter for fromCollectionMethod.
         * @param  fromCollectionMethod  String value for fromCollectionMethod.
         * @return Builder
         */
        public Builder fromCollectionMethod(String fromCollectionMethod) {
            this.fromCollectionMethod = fromCollectionMethod;
            return this;
        }

        /**
         * Setter for toCollectionMethod.
         * @param  toCollectionMethod  String value for toCollectionMethod.
         * @return Builder
         */
        public Builder toCollectionMethod(String toCollectionMethod) {
            this.toCollectionMethod = toCollectionMethod;
            return this;
        }

        /**
         * Setter for fromStatus.
         * @param  fromStatus  Object value for fromStatus.
         * @return Builder
         */
        public Builder fromStatus(Object fromStatus) {
            this.fromStatus = fromStatus;
            return this;
        }

        /**
         * Setter for toStatus.
         * @param  toStatus  Object value for toStatus.
         * @return Builder
         */
        public Builder toStatus(Object toStatus) {
            this.toStatus = toStatus;
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
         * Setter for totalAmount.
         * @param  totalAmount  String value for totalAmount.
         * @return Builder
         */
        public Builder totalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        /**
         * Setter for applyCredit.
         * @param  applyCredit  Boolean value for applyCredit.
         * @return Builder
         */
        public Builder applyCredit(Boolean applyCredit) {
            this.applyCredit = applyCredit;
            return this;
        }

        /**
         * Setter for creditNoteAttributes.
         * @param  creditNoteAttributes  CreditNote1 value for creditNoteAttributes.
         * @return Builder
         */
        public Builder creditNoteAttributes(CreditNote1 creditNoteAttributes) {
            this.creditNoteAttributes = creditNoteAttributes;
            return this;
        }

        /**
         * Setter for paymentId.
         * @param  paymentId  Integer value for paymentId.
         * @return Builder
         */
        public Builder paymentId(Integer paymentId) {
            this.paymentId = paymentId;
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
         * Setter for refundId.
         * @param  refundId  Integer value for refundId.
         * @return Builder
         */
        public Builder refundId(Integer refundId) {
            this.refundId = refundId;
            return this;
        }

        /**
         * Setter for isAdvanceInvoice.
         * @param  isAdvanceInvoice  Boolean value for isAdvanceInvoice.
         * @return Builder
         */
        public Builder isAdvanceInvoice(Boolean isAdvanceInvoice) {
            this.isAdvanceInvoice = isAdvanceInvoice;
            return this;
        }

        /**
         * Setter for reason.
         * @param  reason  String value for reason.
         * @return Builder
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  Long value for id.
         * @return Builder
         */
        public Builder id(Long id) {
            this.id = id;
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
            this.customerId = customerId;
            return this;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for number.
         * @param  number  String value for number.
         * @return Builder
         */
        public Builder number(String number) {
            this.number = number;
            return this;
        }

        /**
         * Setter for sequenceNumber.
         * @param  sequenceNumber  Integer value for sequenceNumber.
         * @return Builder
         */
        public Builder sequenceNumber(Integer sequenceNumber) {
            this.sequenceNumber = sequenceNumber;
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
         * Setter for updatedAt.
         * @param  updatedAt  ZonedDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(ZonedDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for issueDate.
         * @param  issueDate  LocalDate value for issueDate.
         * @return Builder
         */
        public Builder issueDate(LocalDate issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        /**
         * Setter for dueDate.
         * @param  dueDate  LocalDate value for dueDate.
         * @return Builder
         */
        public Builder dueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        /**
         * Setter for paidDate.
         * @param  paidDate  LocalDate value for paidDate.
         * @return Builder
         */
        public Builder paidDate(LocalDate paidDate) {
            this.paidDate = OptionalNullable.of(paidDate);
            return this;
        }

        /**
         * UnSetter for paidDate.
         * @return Builder
         */
        public Builder unsetPaidDate() {
            paidDate = null;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  InvoiceStatus value for status.
         * @return Builder
         */
        public Builder status(InvoiceStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for parentInvoiceId.
         * @param  parentInvoiceId  Integer value for parentInvoiceId.
         * @return Builder
         */
        public Builder parentInvoiceId(Integer parentInvoiceId) {
            this.parentInvoiceId = OptionalNullable.of(parentInvoiceId);
            return this;
        }

        /**
         * UnSetter for parentInvoiceId.
         * @return Builder
         */
        public Builder unsetParentInvoiceId() {
            parentInvoiceId = null;
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
         * Setter for parentInvoiceUid.
         * @param  parentInvoiceUid  String value for parentInvoiceUid.
         * @return Builder
         */
        public Builder parentInvoiceUid(String parentInvoiceUid) {
            this.parentInvoiceUid = OptionalNullable.of(parentInvoiceUid);
            return this;
        }

        /**
         * UnSetter for parentInvoiceUid.
         * @return Builder
         */
        public Builder unsetParentInvoiceUid() {
            parentInvoiceUid = null;
            return this;
        }

        /**
         * Setter for subscriptionGroupId.
         * @param  subscriptionGroupId  Integer value for subscriptionGroupId.
         * @return Builder
         */
        public Builder subscriptionGroupId(Integer subscriptionGroupId) {
            this.subscriptionGroupId = OptionalNullable.of(subscriptionGroupId);
            return this;
        }

        /**
         * UnSetter for subscriptionGroupId.
         * @return Builder
         */
        public Builder unsetSubscriptionGroupId() {
            subscriptionGroupId = null;
            return this;
        }

        /**
         * Setter for groupPrimarySubscriptionId.
         * @param  groupPrimarySubscriptionId  Integer value for groupPrimarySubscriptionId.
         * @return Builder
         */
        public Builder groupPrimarySubscriptionId(Integer groupPrimarySubscriptionId) {
            this.groupPrimarySubscriptionId = OptionalNullable.of(groupPrimarySubscriptionId);
            return this;
        }

        /**
         * UnSetter for groupPrimarySubscriptionId.
         * @return Builder
         */
        public Builder unsetGroupPrimarySubscriptionId() {
            groupPrimarySubscriptionId = null;
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
         * Setter for payer.
         * @param  payer  InvoicePayer value for payer.
         * @return Builder
         */
        public Builder payer(InvoicePayer payer) {
            this.payer = payer;
            return this;
        }

        /**
         * Setter for recipientEmails.
         * @param  recipientEmails  List of String value for recipientEmails.
         * @return Builder
         */
        public Builder recipientEmails(List<String> recipientEmails) {
            this.recipientEmails = recipientEmails;
            return this;
        }

        /**
         * Setter for netTerms.
         * @param  netTerms  Integer value for netTerms.
         * @return Builder
         */
        public Builder netTerms(Integer netTerms) {
            this.netTerms = netTerms;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  BillingAddress value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(BillingAddress billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for shippingAddress.
         * @param  shippingAddress  ShippingAddress value for shippingAddress.
         * @return Builder
         */
        public Builder shippingAddress(ShippingAddress shippingAddress) {
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
         * Setter for lineItems.
         * @param  lineItems  List of InvoiceLineItem1 value for lineItems.
         * @return Builder
         */
        public Builder lineItems(List<InvoiceLineItem1> lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        /**
         * Setter for discounts.
         * @param  discounts  List of InvoiceDiscount value for discounts.
         * @return Builder
         */
        public Builder discounts(List<InvoiceDiscount> discounts) {
            this.discounts = discounts;
            return this;
        }

        /**
         * Setter for taxes.
         * @param  taxes  List of InvoiceTax value for taxes.
         * @return Builder
         */
        public Builder taxes(List<InvoiceTax> taxes) {
            this.taxes = taxes;
            return this;
        }

        /**
         * Setter for credits.
         * @param  credits  List of InvoiceCredit value for credits.
         * @return Builder
         */
        public Builder credits(List<InvoiceCredit> credits) {
            this.credits = credits;
            return this;
        }

        /**
         * Setter for refunds.
         * @param  refunds  List of InvoiceRefund value for refunds.
         * @return Builder
         */
        public Builder refunds(List<InvoiceRefund> refunds) {
            this.refunds = refunds;
            return this;
        }

        /**
         * Setter for payments.
         * @param  payments  List of InvoicePayment value for payments.
         * @return Builder
         */
        public Builder payments(List<InvoicePayment> payments) {
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
         * Setter for displaySettings.
         * @param  displaySettings  InvoiceDisplaySettings value for displaySettings.
         * @return Builder
         */
        public Builder displaySettings(InvoiceDisplaySettings displaySettings) {
            this.displaySettings = displaySettings;
            return this;
        }

        /**
         * Setter for publicUrl.
         * @param  publicUrl  String value for publicUrl.
         * @return Builder
         */
        public Builder publicUrl(String publicUrl) {
            this.publicUrl = publicUrl;
            return this;
        }

        /**
         * Setter for previousBalanceData.
         * @param  previousBalanceData  InvoicePreviousBalance value for previousBalanceData.
         * @return Builder
         */
        public Builder previousBalanceData(InvoicePreviousBalance previousBalanceData) {
            this.previousBalanceData = previousBalanceData;
            return this;
        }

        /**
         * Setter for gatewayTransId.
         * @param  gatewayTransId  String value for gatewayTransId.
         * @return Builder
         */
        public Builder gatewayTransId(String gatewayTransId) {
            this.gatewayTransId = gatewayTransId;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  String value for amount.
         * @return Builder
         */
        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for amountInCents.
         * @param  amountInCents  Integer value for amountInCents.
         * @return Builder
         */
        public Builder amountInCents(Integer amountInCents) {
            this.amountInCents = amountInCents;
            return this;
        }

        /**
         * Setter for originCreditNoteUid.
         * @param  originCreditNoteUid  String value for originCreditNoteUid.
         * @return Builder
         */
        public Builder originCreditNoteUid(String originCreditNoteUid) {
            this.originCreditNoteUid = originCreditNoteUid;
            return this;
        }

        /**
         * Setter for originCreditNoteNumber.
         * @param  originCreditNoteNumber  String value for originCreditNoteNumber.
         * @return Builder
         */
        public Builder originCreditNoteNumber(String originCreditNoteNumber) {
            this.originCreditNoteNumber = originCreditNoteNumber;
            return this;
        }

        /**
         * Setter for appliedDate.
         * @param  appliedDate  LocalDate value for appliedDate.
         * @return Builder
         */
        public Builder appliedDate(LocalDate appliedDate) {
            this.appliedDate = appliedDate;
            return this;
        }

        /**
         * Setter for remainingAmount.
         * @param  remainingAmount  String value for remainingAmount.
         * @return Builder
         */
        public Builder remainingAmount(String remainingAmount) {
            this.remainingAmount = remainingAmount;
            return this;
        }

        /**
         * Setter for applications.
         * @param  applications  List of CreditNoteApplication value for applications.
         * @return Builder
         */
        public Builder applications(List<CreditNoteApplication> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * Setter for originInvoices.
         * @param  originInvoices  List of OriginInvoice value for originInvoices.
         * @return Builder
         */
        public Builder originInvoices(List<OriginInvoice> originInvoices) {
            this.originInvoices = originInvoices;
            return this;
        }

        /**
         * Setter for chargebackStatus.
         * @param  chargebackStatus  ChargebackStatus value for chargebackStatus.
         * @return Builder
         */
        public Builder chargebackStatus(ChargebackStatus chargebackStatus) {
            this.chargebackStatus = chargebackStatus;
            return this;
        }

        /**
         * Builds a new {@link InvoiceEventData} object using the set fields.
         * @return {@link InvoiceEventData}
         */
        public InvoiceEventData build() {
            return new InvoiceEventData(uid, creditNoteNumber, creditNoteUid, originalAmount,
                    appliedAmount, transactionTime, memo, role, consolidatedInvoice,
                    appliedCreditNotes, debitNoteNumber, debitNoteUid, consolidationLevel,
                    paymentMethod, transactionId, parentInvoiceNumber, remainingPrepaymentAmount,
                    prepayment, external, fromCollectionMethod, toCollectionMethod, fromStatus,
                    toStatus, dueAmount, totalAmount, applyCredit, creditNoteAttributes, paymentId,
                    refundAmount, refundId, isAdvanceInvoice, reason, id, siteId, customerId,
                    subscriptionId, number, sequenceNumber, createdAt, updatedAt, issueDate,
                    dueDate, paidDate, status, parentInvoiceId, collectionMethod,
                    paymentInstructions, currency, parentInvoiceUid, subscriptionGroupId,
                    groupPrimarySubscriptionId, productName, productFamilyName, seller, customer,
                    payer, recipientEmails, netTerms, billingAddress, shippingAddress,
                    subtotalAmount, discountAmount, taxAmount, creditAmount, paidAmount, lineItems,
                    discounts, taxes, credits, refunds, payments, customFields, displaySettings,
                    publicUrl, previousBalanceData, gatewayTransId, amount, amountInCents,
                    originCreditNoteUid, originCreditNoteNumber, appliedDate, remainingAmount,
                    applications, originInvoices, chargebackStatus);
        }
    }
}
