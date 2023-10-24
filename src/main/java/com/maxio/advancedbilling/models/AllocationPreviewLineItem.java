/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for AllocationPreviewLineItem type.
 */
public class AllocationPreviewLineItem {
    private String transactionType;
    private String kind;
    private Integer amountInCents;
    private String memo;
    private Integer discountAmountInCents;
    private Integer taxableAmountInCents;
    private Integer componentId;
    private String componentHandle;
    private String direction;

    /**
     * Default constructor.
     */
    public AllocationPreviewLineItem() {
    }

    /**
     * Initialization constructor.
     * @param  transactionType  String value for transactionType.
     * @param  kind  String value for kind.
     * @param  amountInCents  Integer value for amountInCents.
     * @param  memo  String value for memo.
     * @param  discountAmountInCents  Integer value for discountAmountInCents.
     * @param  taxableAmountInCents  Integer value for taxableAmountInCents.
     * @param  componentId  Integer value for componentId.
     * @param  componentHandle  String value for componentHandle.
     * @param  direction  String value for direction.
     */
    public AllocationPreviewLineItem(
            String transactionType,
            String kind,
            Integer amountInCents,
            String memo,
            Integer discountAmountInCents,
            Integer taxableAmountInCents,
            Integer componentId,
            String componentHandle,
            String direction) {
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
     * @return Returns the String
     */
    @JsonGetter("transaction_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Setter for TransactionType.
     * @param transactionType Value for String
     */
    @JsonSetter("transaction_type")
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * Getter for Kind.
     * @return Returns the String
     */
    @JsonGetter("kind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * @param kind Value for String
     */
    @JsonSetter("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Getter for AmountInCents.
     * @return Returns the Integer
     */
    @JsonGetter("amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * @param amountInCents Value for Integer
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(Integer amountInCents) {
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
     * @return Returns the Integer
     */
    @JsonGetter("discount_amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDiscountAmountInCents() {
        return discountAmountInCents;
    }

    /**
     * Setter for DiscountAmountInCents.
     * @param discountAmountInCents Value for Integer
     */
    @JsonSetter("discount_amount_in_cents")
    public void setDiscountAmountInCents(Integer discountAmountInCents) {
        this.discountAmountInCents = discountAmountInCents;
    }

    /**
     * Getter for TaxableAmountInCents.
     * @return Returns the Integer
     */
    @JsonGetter("taxable_amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTaxableAmountInCents() {
        return taxableAmountInCents;
    }

    /**
     * Setter for TaxableAmountInCents.
     * @param taxableAmountInCents Value for Integer
     */
    @JsonSetter("taxable_amount_in_cents")
    public void setTaxableAmountInCents(Integer taxableAmountInCents) {
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
     * @return Returns the String
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * @param direction Value for String
     */
    @JsonSetter("direction")
    public void setDirection(String direction) {
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
                + componentHandle + ", direction=" + direction + "]";
    }

    /**
     * Builds a new {@link AllocationPreviewLineItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AllocationPreviewLineItem.Builder} object
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
        private String transactionType;
        private String kind;
        private Integer amountInCents;
        private String memo;
        private Integer discountAmountInCents;
        private Integer taxableAmountInCents;
        private Integer componentId;
        private String componentHandle;
        private String direction;



        /**
         * Setter for transactionType.
         * @param  transactionType  String value for transactionType.
         * @return Builder
         */
        public Builder transactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }

        /**
         * Setter for kind.
         * @param  kind  String value for kind.
         * @return Builder
         */
        public Builder kind(String kind) {
            this.kind = kind;
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
         * @param  discountAmountInCents  Integer value for discountAmountInCents.
         * @return Builder
         */
        public Builder discountAmountInCents(Integer discountAmountInCents) {
            this.discountAmountInCents = discountAmountInCents;
            return this;
        }

        /**
         * Setter for taxableAmountInCents.
         * @param  taxableAmountInCents  Integer value for taxableAmountInCents.
         * @return Builder
         */
        public Builder taxableAmountInCents(Integer taxableAmountInCents) {
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
         * @param  direction  String value for direction.
         * @return Builder
         */
        public Builder direction(String direction) {
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
