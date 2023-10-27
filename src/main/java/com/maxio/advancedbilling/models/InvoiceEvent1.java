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
import com.maxio.advancedbilling.models.containers.InvoiceEvent1PaymentMethod;
import java.time.LocalDateTime;
import java.util.List;

/**
 * This is a model class for InvoiceEvent1 type.
 */
public class InvoiceEvent1 {
    private String uid;
    private String creditNoteNumber;
    private String creditNoteUid;
    private String originalAmount;
    private String appliedAmount;
    private LocalDateTime transactionTime;
    private String memo;
    private String role;
    private Boolean consolidatedInvoice;
    private List<AppliedCreditNote> appliedCreditNotes;
    private String debitNoteNumber;
    private String debitNoteUid;
    private InvoiceEvent1PaymentMethod paymentMethod;
    private Integer transactionId;
    private String fromCollectionMethod;
    private String toCollectionMethod;
    private InvoiceConsolidationLevel consolidationLevel;
    private Status fromStatus;
    private Status toStatus;
    private String dueAmount;
    private String totalAmount;
    private Boolean applyCredit;
    private CreditNote1 creditNoteAttributes;
    private Integer paymentId;
    private String refundAmount;
    private Integer refundId;
    private Boolean prepayment;
    private Boolean isAdvanceInvoice;

    /**
     * Default constructor.
     */
    public InvoiceEvent1() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  creditNoteNumber  String value for creditNoteNumber.
     * @param  creditNoteUid  String value for creditNoteUid.
     * @param  originalAmount  String value for originalAmount.
     * @param  appliedAmount  String value for appliedAmount.
     * @param  transactionTime  LocalDateTime value for transactionTime.
     * @param  memo  String value for memo.
     * @param  role  String value for role.
     * @param  consolidatedInvoice  Boolean value for consolidatedInvoice.
     * @param  appliedCreditNotes  List of AppliedCreditNote value for appliedCreditNotes.
     * @param  debitNoteNumber  String value for debitNoteNumber.
     * @param  debitNoteUid  String value for debitNoteUid.
     * @param  paymentMethod  InvoiceEvent1PaymentMethod value for paymentMethod.
     * @param  transactionId  Integer value for transactionId.
     * @param  fromCollectionMethod  String value for fromCollectionMethod.
     * @param  toCollectionMethod  String value for toCollectionMethod.
     * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
     * @param  fromStatus  Status value for fromStatus.
     * @param  toStatus  Status value for toStatus.
     * @param  dueAmount  String value for dueAmount.
     * @param  totalAmount  String value for totalAmount.
     * @param  applyCredit  Boolean value for applyCredit.
     * @param  creditNoteAttributes  CreditNote1 value for creditNoteAttributes.
     * @param  paymentId  Integer value for paymentId.
     * @param  refundAmount  String value for refundAmount.
     * @param  refundId  Integer value for refundId.
     * @param  prepayment  Boolean value for prepayment.
     * @param  isAdvanceInvoice  Boolean value for isAdvanceInvoice.
     */
    public InvoiceEvent1(
            String uid,
            String creditNoteNumber,
            String creditNoteUid,
            String originalAmount,
            String appliedAmount,
            LocalDateTime transactionTime,
            String memo,
            String role,
            Boolean consolidatedInvoice,
            List<AppliedCreditNote> appliedCreditNotes,
            String debitNoteNumber,
            String debitNoteUid,
            InvoiceEvent1PaymentMethod paymentMethod,
            Integer transactionId,
            String fromCollectionMethod,
            String toCollectionMethod,
            InvoiceConsolidationLevel consolidationLevel,
            Status fromStatus,
            Status toStatus,
            String dueAmount,
            String totalAmount,
            Boolean applyCredit,
            CreditNote1 creditNoteAttributes,
            Integer paymentId,
            String refundAmount,
            Integer refundId,
            Boolean prepayment,
            Boolean isAdvanceInvoice) {
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
        this.paymentMethod = paymentMethod;
        this.transactionId = transactionId;
        this.fromCollectionMethod = fromCollectionMethod;
        this.toCollectionMethod = toCollectionMethod;
        this.consolidationLevel = consolidationLevel;
        this.fromStatus = fromStatus;
        this.toStatus = toStatus;
        this.dueAmount = dueAmount;
        this.totalAmount = totalAmount;
        this.applyCredit = applyCredit;
        this.creditNoteAttributes = creditNoteAttributes;
        this.paymentId = paymentId;
        this.refundAmount = refundAmount;
        this.refundId = refundId;
        this.prepayment = prepayment;
        this.isAdvanceInvoice = isAdvanceInvoice;
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
     * @return Returns the LocalDateTime
     */
    @JsonGetter("transaction_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    /**
     * Setter for TransactionTime.
     * The time the credit note was applied, in ISO 8601 format, i.e. "2019-06-07T17:20:06Z"
     * @param transactionTime Value for LocalDateTime
     */
    @JsonSetter("transaction_time")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    /**
     * Getter for Memo.
     * The credit note memo.
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * The credit note memo.
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Getter for Role.
     * The role of the credit note (e.g. 'general')
     * @return Returns the String
     */
    @JsonGetter("role")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRole() {
        return role;
    }

    /**
     * Setter for Role.
     * The role of the credit note (e.g. 'general')
     * @param role Value for String
     */
    @JsonSetter("role")
    public void setRole(String role) {
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
     * @return Returns the List of AppliedCreditNote
     */
    @JsonGetter("applied_credit_notes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<AppliedCreditNote> getAppliedCreditNotes() {
        return appliedCreditNotes;
    }

    /**
     * Setter for AppliedCreditNotes.
     * List of credit notes applied to children invoices (if consolidated invoice)
     * @param appliedCreditNotes Value for List of AppliedCreditNote
     */
    @JsonSetter("applied_credit_notes")
    public void setAppliedCreditNotes(List<AppliedCreditNote> appliedCreditNotes) {
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
     * Getter for PaymentMethod.
     * A nested data structure detailing the method of payment
     * @return Returns the InvoiceEvent1PaymentMethod
     */
    @JsonGetter("payment_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceEvent1PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * A nested data structure detailing the method of payment
     * @param paymentMethod Value for InvoiceEvent1PaymentMethod
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(InvoiceEvent1PaymentMethod paymentMethod) {
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
     * Getter for FromStatus.
     * The status of the invoice before event occurence. See [Invoice
     * Statuses](https://chargify.zendesk.com/hc/en-us/articles/4407737494171#line-item-breakdowns)
     * for more.
     * @return Returns the Status
     */
    @JsonGetter("from_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Status getFromStatus() {
        return fromStatus;
    }

    /**
     * Setter for FromStatus.
     * The status of the invoice before event occurence. See [Invoice
     * Statuses](https://chargify.zendesk.com/hc/en-us/articles/4407737494171#line-item-breakdowns)
     * for more.
     * @param fromStatus Value for Status
     */
    @JsonSetter("from_status")
    public void setFromStatus(Status fromStatus) {
        this.fromStatus = fromStatus;
    }

    /**
     * Getter for ToStatus.
     * The status of the invoice after event occurence. See [Invoice
     * Statuses](https://chargify.zendesk.com/hc/en-us/articles/4407737494171#line-item-breakdowns)
     * for more.
     * @return Returns the Status
     */
    @JsonGetter("to_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Status getToStatus() {
        return toStatus;
    }

    /**
     * Setter for ToStatus.
     * The status of the invoice after event occurence. See [Invoice
     * Statuses](https://chargify.zendesk.com/hc/en-us/articles/4407737494171#line-item-breakdowns)
     * for more.
     * @param toStatus Value for Status
     */
    @JsonSetter("to_status")
    public void setToStatus(Status toStatus) {
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
     * Converts this InvoiceEvent1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceEvent1 [" + "uid=" + uid + ", creditNoteNumber=" + creditNoteNumber
                + ", creditNoteUid=" + creditNoteUid + ", originalAmount=" + originalAmount
                + ", appliedAmount=" + appliedAmount + ", transactionTime=" + transactionTime
                + ", memo=" + memo + ", role=" + role + ", consolidatedInvoice="
                + consolidatedInvoice + ", appliedCreditNotes=" + appliedCreditNotes
                + ", debitNoteNumber=" + debitNoteNumber + ", debitNoteUid=" + debitNoteUid
                + ", paymentMethod=" + paymentMethod + ", transactionId=" + transactionId
                + ", fromCollectionMethod=" + fromCollectionMethod + ", toCollectionMethod="
                + toCollectionMethod + ", consolidationLevel=" + consolidationLevel
                + ", fromStatus=" + fromStatus + ", toStatus=" + toStatus + ", dueAmount="
                + dueAmount + ", totalAmount=" + totalAmount + ", applyCredit=" + applyCredit
                + ", creditNoteAttributes=" + creditNoteAttributes + ", paymentId=" + paymentId
                + ", refundAmount=" + refundAmount + ", refundId=" + refundId + ", prepayment="
                + prepayment + ", isAdvanceInvoice=" + isAdvanceInvoice + "]";
    }

    /**
     * Builds a new {@link InvoiceEvent1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceEvent1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .creditNoteNumber(getCreditNoteNumber())
                .creditNoteUid(getCreditNoteUid())
                .originalAmount(getOriginalAmount())
                .appliedAmount(getAppliedAmount())
                .transactionTime(getTransactionTime())
                .memo(getMemo())
                .role(getRole())
                .consolidatedInvoice(getConsolidatedInvoice())
                .appliedCreditNotes(getAppliedCreditNotes())
                .debitNoteNumber(getDebitNoteNumber())
                .debitNoteUid(getDebitNoteUid())
                .paymentMethod(getPaymentMethod())
                .transactionId(getTransactionId())
                .fromCollectionMethod(getFromCollectionMethod())
                .toCollectionMethod(getToCollectionMethod())
                .consolidationLevel(getConsolidationLevel())
                .fromStatus(getFromStatus())
                .toStatus(getToStatus())
                .dueAmount(getDueAmount())
                .totalAmount(getTotalAmount())
                .applyCredit(getApplyCredit())
                .creditNoteAttributes(getCreditNoteAttributes())
                .paymentId(getPaymentId())
                .refundAmount(getRefundAmount())
                .refundId(getRefundId())
                .prepayment(getPrepayment())
                .isAdvanceInvoice(getIsAdvanceInvoice());
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceEvent1}.
     */
    public static class Builder {
        private String uid;
        private String creditNoteNumber;
        private String creditNoteUid;
        private String originalAmount;
        private String appliedAmount;
        private LocalDateTime transactionTime;
        private String memo;
        private String role;
        private Boolean consolidatedInvoice;
        private List<AppliedCreditNote> appliedCreditNotes;
        private String debitNoteNumber;
        private String debitNoteUid;
        private InvoiceEvent1PaymentMethod paymentMethod;
        private Integer transactionId;
        private String fromCollectionMethod;
        private String toCollectionMethod;
        private InvoiceConsolidationLevel consolidationLevel;
        private Status fromStatus;
        private Status toStatus;
        private String dueAmount;
        private String totalAmount;
        private Boolean applyCredit;
        private CreditNote1 creditNoteAttributes;
        private Integer paymentId;
        private String refundAmount;
        private Integer refundId;
        private Boolean prepayment;
        private Boolean isAdvanceInvoice;



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
         * @param  transactionTime  LocalDateTime value for transactionTime.
         * @return Builder
         */
        public Builder transactionTime(LocalDateTime transactionTime) {
            this.transactionTime = transactionTime;
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
         * Setter for role.
         * @param  role  String value for role.
         * @return Builder
         */
        public Builder role(String role) {
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
         * @param  appliedCreditNotes  List of AppliedCreditNote value for appliedCreditNotes.
         * @return Builder
         */
        public Builder appliedCreditNotes(List<AppliedCreditNote> appliedCreditNotes) {
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
         * Setter for paymentMethod.
         * @param  paymentMethod  InvoiceEvent1PaymentMethod value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(InvoiceEvent1PaymentMethod paymentMethod) {
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
         * Setter for consolidationLevel.
         * @param  consolidationLevel  InvoiceConsolidationLevel value for consolidationLevel.
         * @return Builder
         */
        public Builder consolidationLevel(InvoiceConsolidationLevel consolidationLevel) {
            this.consolidationLevel = consolidationLevel;
            return this;
        }

        /**
         * Setter for fromStatus.
         * @param  fromStatus  Status value for fromStatus.
         * @return Builder
         */
        public Builder fromStatus(Status fromStatus) {
            this.fromStatus = fromStatus;
            return this;
        }

        /**
         * Setter for toStatus.
         * @param  toStatus  Status value for toStatus.
         * @return Builder
         */
        public Builder toStatus(Status toStatus) {
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
         * Setter for prepayment.
         * @param  prepayment  Boolean value for prepayment.
         * @return Builder
         */
        public Builder prepayment(Boolean prepayment) {
            this.prepayment = prepayment;
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
         * Builds a new {@link InvoiceEvent1} object using the set fields.
         * @return {@link InvoiceEvent1}
         */
        public InvoiceEvent1 build() {
            return new InvoiceEvent1(uid, creditNoteNumber, creditNoteUid, originalAmount,
                    appliedAmount, transactionTime, memo, role, consolidatedInvoice,
                    appliedCreditNotes, debitNoteNumber, debitNoteUid, paymentMethod, transactionId,
                    fromCollectionMethod, toCollectionMethod, consolidationLevel, fromStatus,
                    toStatus, dueAmount, totalAmount, applyCredit, creditNoteAttributes, paymentId,
                    refundAmount, refundId, prepayment, isAdvanceInvoice);
        }
    }
}
