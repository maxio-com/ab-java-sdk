/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for AllocationPreviewLineItem type.
 */
public class AllocationPreviewLineItem
        extends BaseModel {
    private LineItemTransactionType transactionType;
    private AllocationPreviewLineItemKind kind;
    private Long amountInCents;
    private String memo;
    private Long discountAmountInCents;
    private Long taxableAmountInCents;
    private Integer componentId;
    private String componentHandle;
    private AllocationPreviewDirection direction;

    /**
     * Default constructor.
     */
    public AllocationPreviewLineItem() {
    }

    /**
     * Initialization constructor.
     * @param  transactionType  LineItemTransactionType value for transactionType.
     * @param  kind  AllocationPreviewLineItemKind value for kind.
     * @param  amountInCents  Long value for amountInCents.
     * @param  memo  String value for memo.
     * @param  discountAmountInCents  Long value for discountAmountInCents.
     * @param  taxableAmountInCents  Long value for taxableAmountInCents.
     * @param  componentId  Integer value for componentId.
     * @param  componentHandle  String value for componentHandle.
     * @param  direction  AllocationPreviewDirection value for direction.
     */
    public AllocationPreviewLineItem(
            LineItemTransactionType transactionType,
            AllocationPreviewLineItemKind kind,
            Long amountInCents,
            String memo,
            Long discountAmountInCents,
            Long taxableAmountInCents,
            Integer componentId,
            String componentHandle,
            AllocationPreviewDirection direction) {
        this.transactionType = transactionType;
        this.kind = kind;
        this.amountInCents = amountInCents;
        this.memo = memo;
        this.discountAmountInCents = discountAmountInCents;
        this.taxableAmountInCents = taxableAmountInCents;
        this.componentId = componentId;
        this.componentHandle = componentHandle;
        this.direction = direction;
    }

    /**
     * Getter for TransactionType.
     * A handle for the line item transaction type
     * @return Returns the LineItemTransactionType
     */
    @JsonGetter("transaction_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LineItemTransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Setter for TransactionType.
     * A handle for the line item transaction type
     * @param transactionType Value for LineItemTransactionType
     */
    @JsonSetter("transaction_type")
    public void setTransactionType(LineItemTransactionType transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * Getter for Kind.
     * A handle for the line item kind for allocation preview
     * @return Returns the AllocationPreviewLineItemKind
     */
    @JsonGetter("kind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AllocationPreviewLineItemKind getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * A handle for the line item kind for allocation preview
     * @param kind Value for AllocationPreviewLineItemKind
     */
    @JsonSetter("kind")
    public void setKind(AllocationPreviewLineItemKind kind) {
        this.kind = kind;
    }

    /**
     * Getter for AmountInCents.
     * @return Returns the Long
     */
    @JsonGetter("amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * @param amountInCents Value for Long
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(Long amountInCents) {
        this.amountInCents = amountInCents;
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
     * Getter for DiscountAmountInCents.
     * @return Returns the Long
     */
    @JsonGetter("discount_amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getDiscountAmountInCents() {
        return discountAmountInCents;
    }

    /**
     * Setter for DiscountAmountInCents.
     * @param discountAmountInCents Value for Long
     */
    @JsonSetter("discount_amount_in_cents")
    public void setDiscountAmountInCents(Long discountAmountInCents) {
        this.discountAmountInCents = discountAmountInCents;
    }

    /**
     * Getter for TaxableAmountInCents.
     * @return Returns the Long
     */
    @JsonGetter("taxable_amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getTaxableAmountInCents() {
        return taxableAmountInCents;
    }

    /**
     * Setter for TaxableAmountInCents.
     * @param taxableAmountInCents Value for Long
     */
    @JsonSetter("taxable_amount_in_cents")
    public void setTaxableAmountInCents(Long taxableAmountInCents) {
        this.taxableAmountInCents = taxableAmountInCents;
    }

    /**
     * Getter for ComponentId.
     * @return Returns the Integer
     */
    @JsonGetter("component_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * @param componentId Value for Integer
     */
    @JsonSetter("component_id")
    public void setComponentId(Integer componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for ComponentHandle.
     * @return Returns the String
     */
    @JsonGetter("component_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getComponentHandle() {
        return componentHandle;
    }

    /**
     * Setter for ComponentHandle.
     * @param componentHandle Value for String
     */
    @JsonSetter("component_handle")
    public void setComponentHandle(String componentHandle) {
        this.componentHandle = componentHandle;
    }

    /**
     * Getter for Direction.
     * Visible when using Fine-grained Component Control
     * @return Returns the AllocationPreviewDirection
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AllocationPreviewDirection getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * Visible when using Fine-grained Component Control
     * @param direction Value for AllocationPreviewDirection
     */
    @JsonSetter("direction")
    public void setDirection(AllocationPreviewDirection direction) {
        this.direction = direction;
    }

    /**
     * Converts this AllocationPreviewLineItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AllocationPreviewLineItem [" + "transactionType=" + transactionType + ", kind="
                + kind + ", amountInCents=" + amountInCents + ", memo=" + memo
                + ", discountAmountInCents=" + discountAmountInCents + ", taxableAmountInCents="
                + taxableAmountInCents + ", componentId=" + componentId + ", componentHandle="
                + componentHandle + ", direction=" + direction + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .transactionType(getTransactionType())
                .kind(getKind())
                .amountInCents(getAmountInCents())
                .memo(getMemo())
                .discountAmountInCents(getDiscountAmountInCents())
                .taxableAmountInCents(getTaxableAmountInCents())
                .componentId(getComponentId())
                .componentHandle(getComponentHandle())
                .direction(getDirection());
        return builder;
    }

    /**
     * Class to build instances of {@link AllocationPreviewLineItem}.
     */
    public static class Builder {
        private LineItemTransactionType transactionType;
        private AllocationPreviewLineItemKind kind;
        private Long amountInCents;
        private String memo;
        private Long discountAmountInCents;
        private Long taxableAmountInCents;
        private Integer componentId;
        private String componentHandle;
        private AllocationPreviewDirection direction;



        /**
         * Setter for transactionType.
         * @param  transactionType  LineItemTransactionType value for transactionType.
         * @return Builder
         */
        public Builder transactionType(LineItemTransactionType transactionType) {
            this.transactionType = transactionType;
            return this;
        }

        /**
         * Setter for kind.
         * @param  kind  AllocationPreviewLineItemKind value for kind.
         * @return Builder
         */
        public Builder kind(AllocationPreviewLineItemKind kind) {
            this.kind = kind;
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
         * Setter for memo.
         * @param  memo  String value for memo.
         * @return Builder
         */
        public Builder memo(String memo) {
            this.memo = memo;
            return this;
        }

        /**
         * Setter for discountAmountInCents.
         * @param  discountAmountInCents  Long value for discountAmountInCents.
         * @return Builder
         */
        public Builder discountAmountInCents(Long discountAmountInCents) {
            this.discountAmountInCents = discountAmountInCents;
            return this;
        }

        /**
         * Setter for taxableAmountInCents.
         * @param  taxableAmountInCents  Long value for taxableAmountInCents.
         * @return Builder
         */
        public Builder taxableAmountInCents(Long taxableAmountInCents) {
            this.taxableAmountInCents = taxableAmountInCents;
            return this;
        }

        /**
         * Setter for componentId.
         * @param  componentId  Integer value for componentId.
         * @return Builder
         */
        public Builder componentId(Integer componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * Setter for componentHandle.
         * @param  componentHandle  String value for componentHandle.
         * @return Builder
         */
        public Builder componentHandle(String componentHandle) {
            this.componentHandle = componentHandle;
            return this;
        }

        /**
         * Setter for direction.
         * @param  direction  AllocationPreviewDirection value for direction.
         * @return Builder
         */
        public Builder direction(AllocationPreviewDirection direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Builds a new {@link AllocationPreviewLineItem} object using the set fields.
         * @return {@link AllocationPreviewLineItem}
         */
        public AllocationPreviewLineItem build() {
            return new AllocationPreviewLineItem(transactionType, kind, amountInCents, memo,
                    discountAmountInCents, taxableAmountInCents, componentId, componentHandle,
                    direction);
        }
    }
}
