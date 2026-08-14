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
import java.time.ZonedDateTime;

/**
 * This is a model class for ServiceCredit1 type.
 */
public class ServiceCredit1
        extends BaseModel {
    private Integer id;
    private Long amountInCents;
    private Long endingBalanceInCents;
    private ServiceCreditType entryType;
    private String memo;
    private OptionalNullable<String> invoiceUid;
    private Long remainingBalanceInCents;
    private ZonedDateTime createdAt;

    /**
     * Default constructor.
     */
    public ServiceCredit1() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  amountInCents  Long value for amountInCents.
     * @param  endingBalanceInCents  Long value for endingBalanceInCents.
     * @param  entryType  ServiceCreditType value for entryType.
     * @param  memo  String value for memo.
     * @param  invoiceUid  String value for invoiceUid.
     * @param  remainingBalanceInCents  Long value for remainingBalanceInCents.
     * @param  createdAt  ZonedDateTime value for createdAt.
     */
    public ServiceCredit1(
            Integer id,
            Long amountInCents,
            Long endingBalanceInCents,
            ServiceCreditType entryType,
            String memo,
            String invoiceUid,
            Long remainingBalanceInCents,
            ZonedDateTime createdAt) {
        this.id = id;
        this.amountInCents = amountInCents;
        this.endingBalanceInCents = endingBalanceInCents;
        this.entryType = entryType;
        this.memo = memo;
        this.invoiceUid = OptionalNullable.of(invoiceUid);
        this.remainingBalanceInCents = remainingBalanceInCents;
        this.createdAt = createdAt;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  amountInCents  Long value for amountInCents.
     * @param  endingBalanceInCents  Long value for endingBalanceInCents.
     * @param  entryType  ServiceCreditType value for entryType.
     * @param  memo  String value for memo.
     * @param  invoiceUid  String value for invoiceUid.
     * @param  remainingBalanceInCents  Long value for remainingBalanceInCents.
     * @param  createdAt  ZonedDateTime value for createdAt.
     */

    protected ServiceCredit1(Integer id, Long amountInCents, Long endingBalanceInCents,
            ServiceCreditType entryType, String memo, OptionalNullable<String> invoiceUid,
            Long remainingBalanceInCents, ZonedDateTime createdAt) {
        this.id = id;
        this.amountInCents = amountInCents;
        this.endingBalanceInCents = endingBalanceInCents;
        this.entryType = entryType;
        this.memo = memo;
        this.invoiceUid = invoiceUid;
        this.remainingBalanceInCents = remainingBalanceInCents;
        this.createdAt = createdAt;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for AmountInCents.
     * The amount in cents of the entry
     * @return Returns the Long
     */
    @JsonGetter("amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * The amount in cents of the entry
     * @param amountInCents Value for Long
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(Long amountInCents) {
        this.amountInCents = amountInCents;
    }

    /**
     * Getter for EndingBalanceInCents.
     * The new balance for the credit account
     * @return Returns the Long
     */
    @JsonGetter("ending_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getEndingBalanceInCents() {
        return endingBalanceInCents;
    }

    /**
     * Setter for EndingBalanceInCents.
     * The new balance for the credit account
     * @param endingBalanceInCents Value for Long
     */
    @JsonSetter("ending_balance_in_cents")
    public void setEndingBalanceInCents(Long endingBalanceInCents) {
        this.endingBalanceInCents = endingBalanceInCents;
    }

    /**
     * Getter for EntryType.
     * The type of entry
     * @return Returns the ServiceCreditType
     */
    @JsonGetter("entry_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ServiceCreditType getEntryType() {
        return entryType;
    }

    /**
     * Setter for EntryType.
     * The type of entry
     * @param entryType Value for ServiceCreditType
     */
    @JsonSetter("entry_type")
    public void setEntryType(ServiceCreditType entryType) {
        this.entryType = entryType;
    }

    /**
     * Getter for Memo.
     * The memo attached to the entry
     * @return Returns the String
     */
    @JsonGetter("memo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMemo() {
        return memo;
    }

    /**
     * Setter for Memo.
     * The memo attached to the entry
     * @param memo Value for String
     */
    @JsonSetter("memo")
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Internal Getter for InvoiceUid.
     * The invoice uid associated with the entry. Only present for debit entries.
     * @return Returns the Internal String
     */
    @JsonGetter("invoice_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetInvoiceUid() {
        return this.invoiceUid;
    }

    /**
     * Getter for InvoiceUid.
     * The invoice uid associated with the entry. Only present for debit entries.
     * @return Returns the String
     */
    public String getInvoiceUid() {
        return OptionalNullable.getFrom(invoiceUid);
    }

    /**
     * Setter for InvoiceUid.
     * The invoice uid associated with the entry. Only present for debit entries.
     * @param invoiceUid Value for String
     */
    @JsonSetter("invoice_uid")
    public void setInvoiceUid(String invoiceUid) {
        this.invoiceUid = OptionalNullable.of(invoiceUid);
    }

    /**
     * UnSetter for InvoiceUid.
     * The invoice uid associated with the entry. Only present for debit entries.
     */
    public void unsetInvoiceUid() {
        invoiceUid = null;
    }

    /**
     * Getter for RemainingBalanceInCents.
     * The remaining balance for the entry
     * @return Returns the Long
     */
    @JsonGetter("remaining_balance_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getRemainingBalanceInCents() {
        return remainingBalanceInCents;
    }

    /**
     * Setter for RemainingBalanceInCents.
     * The remaining balance for the entry
     * @param remainingBalanceInCents Value for Long
     */
    @JsonSetter("remaining_balance_in_cents")
    public void setRemainingBalanceInCents(Long remainingBalanceInCents) {
        this.remainingBalanceInCents = remainingBalanceInCents;
    }

    /**
     * Getter for CreatedAt.
     * The date and time the entry was created
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
     * The date and time the entry was created
     * @param createdAt Value for ZonedDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Converts this ServiceCredit1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ServiceCredit1 [" + "id=" + id + ", amountInCents=" + amountInCents
                + ", endingBalanceInCents=" + endingBalanceInCents + ", entryType=" + entryType
                + ", memo=" + memo + ", invoiceUid=" + invoiceUid + ", remainingBalanceInCents="
                + remainingBalanceInCents + ", createdAt=" + createdAt + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ServiceCredit1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ServiceCredit1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .amountInCents(getAmountInCents())
                .endingBalanceInCents(getEndingBalanceInCents())
                .entryType(getEntryType())
                .memo(getMemo())
                .remainingBalanceInCents(getRemainingBalanceInCents())
                .createdAt(getCreatedAt());
        builder.invoiceUid = internalGetInvoiceUid();
        return builder;
    }

    /**
     * Class to build instances of {@link ServiceCredit1}.
     */
    public static class Builder {
        private Integer id;
        private Long amountInCents;
        private Long endingBalanceInCents;
        private ServiceCreditType entryType;
        private String memo;
        private OptionalNullable<String> invoiceUid;
        private Long remainingBalanceInCents;
        private ZonedDateTime createdAt;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for amountInCents.
         * @param  amountInCents  Long value for amountInCents.
         * @return Builder
         */
        public Builder amountInCents(Long amountInCents) {
            this.amountInCents = amountInCents;
            return this;
        }

        /**
         * Setter for endingBalanceInCents.
         * @param  endingBalanceInCents  Long value for endingBalanceInCents.
         * @return Builder
         */
        public Builder endingBalanceInCents(Long endingBalanceInCents) {
            this.endingBalanceInCents = endingBalanceInCents;
            return this;
        }

        /**
         * Setter for entryType.
         * @param  entryType  ServiceCreditType value for entryType.
         * @return Builder
         */
        public Builder entryType(ServiceCreditType entryType) {
            this.entryType = entryType;
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
         * Setter for invoiceUid.
         * @param  invoiceUid  String value for invoiceUid.
         * @return Builder
         */
        public Builder invoiceUid(String invoiceUid) {
            this.invoiceUid = OptionalNullable.of(invoiceUid);
            return this;
        }

        /**
         * UnSetter for invoiceUid.
         * @return Builder
         */
        public Builder unsetInvoiceUid() {
            invoiceUid = null;
            return this;
        }

        /**
         * Setter for remainingBalanceInCents.
         * @param  remainingBalanceInCents  Long value for remainingBalanceInCents.
         * @return Builder
         */
        public Builder remainingBalanceInCents(Long remainingBalanceInCents) {
            this.remainingBalanceInCents = remainingBalanceInCents;
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
         * Builds a new {@link ServiceCredit1} object using the set fields.
         * @return {@link ServiceCredit1}
         */
        public ServiceCredit1 build() {
            return new ServiceCredit1(id, amountInCents, endingBalanceInCents, entryType, memo,
                    invoiceUid, remainingBalanceInCents, createdAt);
        }
    }
}
