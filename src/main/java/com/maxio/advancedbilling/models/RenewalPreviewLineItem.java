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
    private String transactionType;
    private String kind;
    private Integer amountInCents;
    private String memo;
    private Integer discountAmountInCents;
    private Integer taxableAmountInCents;
    private Integer productId;
    private String productName;
    private Integer componentId;
    private String componentHandle;
    private String componentName;
    private String productHandle;

    /**
     * Default constructor.
     */
    public RenewalPreviewLineItem() {
    }

    /**
     * Initialization constructor.
     * @param  transactionType  String value for transactionType.
     * @param  kind  String value for kind.
     * @param  amountInCents  Integer value for amountInCents.
     * @param  memo  String value for memo.
     * @param  discountAmountInCents  Integer value for discountAmountInCents.
     * @param  taxableAmountInCents  Integer value for taxableAmountInCents.
     * @param  productId  Integer value for productId.
     * @param  productName  String value for productName.
     * @param  componentId  Integer value for componentId.
     * @param  componentHandle  String value for componentHandle.
     * @param  componentName  String value for componentName.
     * @param  productHandle  String value for productHandle.
     */
    public RenewalPreviewLineItem(
            String transactionType,
            String kind,
            Integer amountInCents,
            String memo,
            Integer discountAmountInCents,
            Integer taxableAmountInCents,
            Integer productId,
            String productName,
            Integer componentId,
            String componentHandle,
            String componentName,
            String productHandle) {
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
                + componentName + ", productHandle=" + productHandle + "]";
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
                .productHandle(getProductHandle());
        return builder;
    }

    /**
     * Class to build instances of {@link RenewalPreviewLineItem}.
     */
    public static class Builder {
        private String transactionType;
        private String kind;
        private Integer amountInCents;
        private String memo;
        private Integer discountAmountInCents;
        private Integer taxableAmountInCents;
        private Integer productId;
        private String productName;
        private Integer componentId;
        private String componentHandle;
        private String componentName;
        private String productHandle;



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
         * Builds a new {@link RenewalPreviewLineItem} object using the set fields.
         * @return {@link RenewalPreviewLineItem}
         */
        public RenewalPreviewLineItem build() {
            return new RenewalPreviewLineItem(transactionType, kind, amountInCents, memo,
                    discountAmountInCents, taxableAmountInCents, productId, productName,
                    componentId, componentHandle, componentName, productHandle);
        }
    }
}
