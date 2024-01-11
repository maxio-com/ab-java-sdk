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
 * This is a model class for RenewalPreviewLineItem type.
 */
public class RenewalPreviewLineItem {
    private LineItemTransactionType transactionType;
    private LineItemKind kind;
    private Long amountInCents;
    private String memo;
    private Long discountAmountInCents;
    private Long taxableAmountInCents;
    private Integer productId;
    private String productName;
    private Integer componentId;
    private String componentHandle;
    private String componentName;
    private String productHandle;
    private String periodRangeStart;
    private String periodRangeEnd;

    /**
     * Default constructor.
     */
    public RenewalPreviewLineItem() {
    }

    /**
     * Initialization constructor.
     * @param  transactionType  LineItemTransactionType value for transactionType.
     * @param  kind  LineItemKind value for kind.
     * @param  amountInCents  Long value for amountInCents.
     * @param  memo  String value for memo.
     * @param  discountAmountInCents  Long value for discountAmountInCents.
     * @param  taxableAmountInCents  Long value for taxableAmountInCents.
     * @param  productId  Integer value for productId.
     * @param  productName  String value for productName.
     * @param  componentId  Integer value for componentId.
     * @param  componentHandle  String value for componentHandle.
     * @param  componentName  String value for componentName.
     * @param  productHandle  String value for productHandle.
     * @param  periodRangeStart  String value for periodRangeStart.
     * @param  periodRangeEnd  String value for periodRangeEnd.
     */
    public RenewalPreviewLineItem(
            LineItemTransactionType transactionType,
            LineItemKind kind,
            Long amountInCents,
            String memo,
            Long discountAmountInCents,
            Long taxableAmountInCents,
            Integer productId,
            String productName,
            Integer componentId,
            String componentHandle,
            String componentName,
            String productHandle,
            String periodRangeStart,
            String periodRangeEnd) {
        this.transactionType = transactionType;
        this.kind = kind;
        this.amountInCents = amountInCents;
        this.memo = memo;
        this.discountAmountInCents = discountAmountInCents;
        this.taxableAmountInCents = taxableAmountInCents;
        this.productId = productId;
        this.productName = productName;
        this.componentId = componentId;
        this.componentHandle = componentHandle;
        this.componentName = componentName;
        this.productHandle = productHandle;
        this.periodRangeStart = periodRangeStart;
        this.periodRangeEnd = periodRangeEnd;
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
     * A handle for the line item kind
     * @return Returns the LineItemKind
     */
    @JsonGetter("kind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LineItemKind getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * A handle for the line item kind
     * @param kind Value for LineItemKind
     */
    @JsonSetter("kind")
    public void setKind(LineItemKind kind) {
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
     * Getter for ProductId.
     * @return Returns the Integer
     */
    @JsonGetter("product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * @param productId Value for Integer
     */
    @JsonSetter("product_id")
    public void setProductId(Integer productId) {
        this.productId = productId;
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
     * Getter for ComponentName.
     * @return Returns the String
     */
    @JsonGetter("component_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getComponentName() {
        return componentName;
    }

    /**
     * Setter for ComponentName.
     * @param componentName Value for String
     */
    @JsonSetter("component_name")
    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * Getter for ProductHandle.
     * @return Returns the String
     */
    @JsonGetter("product_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductHandle() {
        return productHandle;
    }

    /**
     * Setter for ProductHandle.
     * @param productHandle Value for String
     */
    @JsonSetter("product_handle")
    public void setProductHandle(String productHandle) {
        this.productHandle = productHandle;
    }

    /**
     * Getter for PeriodRangeStart.
     * @return Returns the String
     */
    @JsonGetter("period_range_start")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPeriodRangeStart() {
        return periodRangeStart;
    }

    /**
     * Setter for PeriodRangeStart.
     * @param periodRangeStart Value for String
     */
    @JsonSetter("period_range_start")
    public void setPeriodRangeStart(String periodRangeStart) {
        this.periodRangeStart = periodRangeStart;
    }

    /**
     * Getter for PeriodRangeEnd.
     * @return Returns the String
     */
    @JsonGetter("period_range_end")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPeriodRangeEnd() {
        return periodRangeEnd;
    }

    /**
     * Setter for PeriodRangeEnd.
     * @param periodRangeEnd Value for String
     */
    @JsonSetter("period_range_end")
    public void setPeriodRangeEnd(String periodRangeEnd) {
        this.periodRangeEnd = periodRangeEnd;
    }

    /**
     * Converts this RenewalPreviewLineItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RenewalPreviewLineItem [" + "transactionType=" + transactionType + ", kind=" + kind
                + ", amountInCents=" + amountInCents + ", memo=" + memo + ", discountAmountInCents="
                + discountAmountInCents + ", taxableAmountInCents=" + taxableAmountInCents
                + ", productId=" + productId + ", productName=" + productName + ", componentId="
                + componentId + ", componentHandle=" + componentHandle + ", componentName="
                + componentName + ", productHandle=" + productHandle + ", periodRangeStart="
                + periodRangeStart + ", periodRangeEnd=" + periodRangeEnd + "]";
    }

    /**
     * Builds a new {@link RenewalPreviewLineItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RenewalPreviewLineItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .transactionType(getTransactionType())
                .kind(getKind())
                .amountInCents(getAmountInCents())
                .memo(getMemo())
                .discountAmountInCents(getDiscountAmountInCents())
                .taxableAmountInCents(getTaxableAmountInCents())
                .productId(getProductId())
                .productName(getProductName())
                .componentId(getComponentId())
                .componentHandle(getComponentHandle())
                .componentName(getComponentName())
                .productHandle(getProductHandle())
                .periodRangeStart(getPeriodRangeStart())
                .periodRangeEnd(getPeriodRangeEnd());
        return builder;
    }

    /**
     * Class to build instances of {@link RenewalPreviewLineItem}.
     */
    public static class Builder {
        private LineItemTransactionType transactionType;
        private LineItemKind kind;
        private Long amountInCents;
        private String memo;
        private Long discountAmountInCents;
        private Long taxableAmountInCents;
        private Integer productId;
        private String productName;
        private Integer componentId;
        private String componentHandle;
        private String componentName;
        private String productHandle;
        private String periodRangeStart;
        private String periodRangeEnd;



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
         * @param  kind  LineItemKind value for kind.
         * @return Builder
         */
        public Builder kind(LineItemKind kind) {
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
         * Setter for productId.
         * @param  productId  Integer value for productId.
         * @return Builder
         */
        public Builder productId(Integer productId) {
            this.productId = productId;
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
         * Setter for componentName.
         * @param  componentName  String value for componentName.
         * @return Builder
         */
        public Builder componentName(String componentName) {
            this.componentName = componentName;
            return this;
        }

        /**
         * Setter for productHandle.
         * @param  productHandle  String value for productHandle.
         * @return Builder
         */
        public Builder productHandle(String productHandle) {
            this.productHandle = productHandle;
            return this;
        }

        /**
         * Setter for periodRangeStart.
         * @param  periodRangeStart  String value for periodRangeStart.
         * @return Builder
         */
        public Builder periodRangeStart(String periodRangeStart) {
            this.periodRangeStart = periodRangeStart;
            return this;
        }

        /**
         * Setter for periodRangeEnd.
         * @param  periodRangeEnd  String value for periodRangeEnd.
         * @return Builder
         */
        public Builder periodRangeEnd(String periodRangeEnd) {
            this.periodRangeEnd = periodRangeEnd;
            return this;
        }

        /**
         * Builds a new {@link RenewalPreviewLineItem} object using the set fields.
         * @return {@link RenewalPreviewLineItem}
         */
        public RenewalPreviewLineItem build() {
            return new RenewalPreviewLineItem(transactionType, kind, amountInCents, memo,
                    discountAmountInCents, taxableAmountInCents, productId, productName,
                    componentId, componentHandle, componentName, productHandle, periodRangeStart,
                    periodRangeEnd);
        }
    }
}
