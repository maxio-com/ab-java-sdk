/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for CreditNoteLineItem type.
 */
public class CreditNoteLineItem {
    private String uid;
    private String title;
    private String description;
    private String quantity;
    private String unitPrice;
    private String subtotalAmount;
    private String discountAmount;
    private String taxAmount;
    private String totalAmount;
    private Boolean tieredUnitPrice;
    private String periodRangeStart;
    private String periodRangeEnd;
    private Integer productId;
    private Integer productVersion;
    private OptionalNullable<Integer> componentId;
    private OptionalNullable<Integer> pricePointId;

    /**
     * Default constructor.
     */
    public CreditNoteLineItem() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  title  String value for title.
     * @param  description  String value for description.
     * @param  quantity  String value for quantity.
     * @param  unitPrice  String value for unitPrice.
     * @param  subtotalAmount  String value for subtotalAmount.
     * @param  discountAmount  String value for discountAmount.
     * @param  taxAmount  String value for taxAmount.
     * @param  totalAmount  String value for totalAmount.
     * @param  tieredUnitPrice  Boolean value for tieredUnitPrice.
     * @param  periodRangeStart  String value for periodRangeStart.
     * @param  periodRangeEnd  String value for periodRangeEnd.
     * @param  productId  Integer value for productId.
     * @param  productVersion  Integer value for productVersion.
     * @param  componentId  Integer value for componentId.
     * @param  pricePointId  Integer value for pricePointId.
     */
    public CreditNoteLineItem(
            String uid,
            String title,
            String description,
            String quantity,
            String unitPrice,
            String subtotalAmount,
            String discountAmount,
            String taxAmount,
            String totalAmount,
            Boolean tieredUnitPrice,
            String periodRangeStart,
            String periodRangeEnd,
            Integer productId,
            Integer productVersion,
            Integer componentId,
            Integer pricePointId) {
        this.uid = uid;
        this.title = title;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subtotalAmount = subtotalAmount;
        this.discountAmount = discountAmount;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount;
        this.tieredUnitPrice = tieredUnitPrice;
        this.periodRangeStart = periodRangeStart;
        this.periodRangeEnd = periodRangeEnd;
        this.productId = productId;
        this.productVersion = productVersion;
        this.componentId = OptionalNullable.of(componentId);
        this.pricePointId = OptionalNullable.of(pricePointId);
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  title  String value for title.
     * @param  description  String value for description.
     * @param  quantity  String value for quantity.
     * @param  unitPrice  String value for unitPrice.
     * @param  subtotalAmount  String value for subtotalAmount.
     * @param  discountAmount  String value for discountAmount.
     * @param  taxAmount  String value for taxAmount.
     * @param  totalAmount  String value for totalAmount.
     * @param  tieredUnitPrice  Boolean value for tieredUnitPrice.
     * @param  periodRangeStart  String value for periodRangeStart.
     * @param  periodRangeEnd  String value for periodRangeEnd.
     * @param  productId  Integer value for productId.
     * @param  productVersion  Integer value for productVersion.
     * @param  componentId  Integer value for componentId.
     * @param  pricePointId  Integer value for pricePointId.
     */

    protected CreditNoteLineItem(String uid, String title, String description, String quantity,
            String unitPrice, String subtotalAmount, String discountAmount, String taxAmount,
            String totalAmount, Boolean tieredUnitPrice, String periodRangeStart,
            String periodRangeEnd, Integer productId, Integer productVersion,
            OptionalNullable<Integer> componentId, OptionalNullable<Integer> pricePointId) {
        this.uid = uid;
        this.title = title;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subtotalAmount = subtotalAmount;
        this.discountAmount = discountAmount;
        this.taxAmount = taxAmount;
        this.totalAmount = totalAmount;
        this.tieredUnitPrice = tieredUnitPrice;
        this.periodRangeStart = periodRangeStart;
        this.periodRangeEnd = periodRangeEnd;
        this.productId = productId;
        this.productVersion = productVersion;
        this.componentId = componentId;
        this.pricePointId = pricePointId;
    }

    /**
     * Getter for Uid.
     * Unique identifier for the line item. Useful when cross-referencing the line against
     * individual discounts in the `discounts` or `taxes` lists.
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * Unique identifier for the line item. Useful when cross-referencing the line against
     * individual discounts in the `discounts` or `taxes` lists.
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Getter for Title.
     * A short descriptor for the credit given by this line.
     * @return Returns the String
     */
    @JsonGetter("title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * A short descriptor for the credit given by this line.
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for Description.
     * Detailed description for the credit given by this line. May include proration details in
     * plain text. Note: this string may contain line breaks that are hints for the best display
     * format on the credit note.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Detailed description for the credit given by this line. May include proration details in
     * plain text. Note: this string may contain line breaks that are hints for the best display
     * format on the credit note.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Quantity.
     * The quantity or count of units credited by the line item. This is a decimal number
     * represented as a string. (See "About Decimal Numbers".)
     * @return Returns the String
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * The quantity or count of units credited by the line item. This is a decimal number
     * represented as a string. (See "About Decimal Numbers".)
     * @param quantity Value for String
     */
    @JsonSetter("quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for UnitPrice.
     * The price per unit for the line item. When tiered pricing was used (i.e. not every unit was
     * actually priced at the same price) this will be the blended average cost per unit and the
     * `tiered_unit_price` field will be set to `true`.
     * @return Returns the String
     */
    @JsonGetter("unit_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Setter for UnitPrice.
     * The price per unit for the line item. When tiered pricing was used (i.e. not every unit was
     * actually priced at the same price) this will be the blended average cost per unit and the
     * `tiered_unit_price` field will be set to `true`.
     * @param unitPrice Value for String
     */
    @JsonSetter("unit_price")
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Getter for SubtotalAmount.
     * The line subtotal, generally calculated as `quantity * unit_price`. This is the canonical
     * amount of record for the line - when rounding differences are in play, `subtotal_amount`
     * takes precedence over the value derived from `quantity * unit_price` (which may not have the
     * proper precision to exactly equal this amount).
     * @return Returns the String
     */
    @JsonGetter("subtotal_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubtotalAmount() {
        return subtotalAmount;
    }

    /**
     * Setter for SubtotalAmount.
     * The line subtotal, generally calculated as `quantity * unit_price`. This is the canonical
     * amount of record for the line - when rounding differences are in play, `subtotal_amount`
     * takes precedence over the value derived from `quantity * unit_price` (which may not have the
     * proper precision to exactly equal this amount).
     * @param subtotalAmount Value for String
     */
    @JsonSetter("subtotal_amount")
    public void setSubtotalAmount(String subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }

    /**
     * Getter for DiscountAmount.
     * The approximate discount of just this line. The value is approximated in cases where rounding
     * errors make it difficult to apportion exactly a total discount among many lines. Several
     * lines may have been summed prior to applying the discount to arrive at `discount_amount` for
     * the invoice - backing that out to the discount on a single line may introduce rounding or
     * precision errors.
     * @return Returns the String
     */
    @JsonGetter("discount_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Setter for DiscountAmount.
     * The approximate discount of just this line. The value is approximated in cases where rounding
     * errors make it difficult to apportion exactly a total discount among many lines. Several
     * lines may have been summed prior to applying the discount to arrive at `discount_amount` for
     * the invoice - backing that out to the discount on a single line may introduce rounding or
     * precision errors.
     * @param discountAmount Value for String
     */
    @JsonSetter("discount_amount")
    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * Getter for TaxAmount.
     * The approximate tax of just this line. The value is approximated in cases where rounding
     * errors make it difficult to apportion exactly a total tax among many lines. Several lines may
     * have been summed prior to applying the tax rate to arrive at `tax_amount` for the invoice -
     * backing that out to the tax on a single line may introduce rounding or precision errors.
     * @return Returns the String
     */
    @JsonGetter("tax_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Setter for TaxAmount.
     * The approximate tax of just this line. The value is approximated in cases where rounding
     * errors make it difficult to apportion exactly a total tax among many lines. Several lines may
     * have been summed prior to applying the tax rate to arrive at `tax_amount` for the invoice -
     * backing that out to the tax on a single line may introduce rounding or precision errors.
     * @param taxAmount Value for String
     */
    @JsonSetter("tax_amount")
    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * Getter for TotalAmount.
     * The non-canonical total amount for the line. `subtotal_amount` is the canonical amount for a
     * line. The invoice `total_amount` is derived from the sum of the line `subtotal_amount`s and
     * discounts or taxes applied thereafter. Therefore, due to rounding or precision errors, the
     * sum of line `total_amount`s may not equal the invoice `total_amount`.
     * @return Returns the String
     */
    @JsonGetter("total_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Setter for TotalAmount.
     * The non-canonical total amount for the line. `subtotal_amount` is the canonical amount for a
     * line. The invoice `total_amount` is derived from the sum of the line `subtotal_amount`s and
     * discounts or taxes applied thereafter. Therefore, due to rounding or precision errors, the
     * sum of line `total_amount`s may not equal the invoice `total_amount`.
     * @param totalAmount Value for String
     */
    @JsonSetter("total_amount")
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Getter for TieredUnitPrice.
     * When `true`, indicates that the actual pricing scheme for the line was tiered, so the
     * `unit_price` shown is the blended average for all units.
     * @return Returns the Boolean
     */
    @JsonGetter("tiered_unit_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTieredUnitPrice() {
        return tieredUnitPrice;
    }

    /**
     * Setter for TieredUnitPrice.
     * When `true`, indicates that the actual pricing scheme for the line was tiered, so the
     * `unit_price` shown is the blended average for all units.
     * @param tieredUnitPrice Value for Boolean
     */
    @JsonSetter("tiered_unit_price")
    public void setTieredUnitPrice(Boolean tieredUnitPrice) {
        this.tieredUnitPrice = tieredUnitPrice;
    }

    /**
     * Getter for PeriodRangeStart.
     * Start date for the period credited by this line. The format is `"YYYY-MM-DD"`.
     * @return Returns the String
     */
    @JsonGetter("period_range_start")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPeriodRangeStart() {
        return periodRangeStart;
    }

    /**
     * Setter for PeriodRangeStart.
     * Start date for the period credited by this line. The format is `"YYYY-MM-DD"`.
     * @param periodRangeStart Value for String
     */
    @JsonSetter("period_range_start")
    public void setPeriodRangeStart(String periodRangeStart) {
        this.periodRangeStart = periodRangeStart;
    }

    /**
     * Getter for PeriodRangeEnd.
     * End date for the period credited by this line. The format is `"YYYY-MM-DD"`.
     * @return Returns the String
     */
    @JsonGetter("period_range_end")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPeriodRangeEnd() {
        return periodRangeEnd;
    }

    /**
     * Setter for PeriodRangeEnd.
     * End date for the period credited by this line. The format is `"YYYY-MM-DD"`.
     * @param periodRangeEnd Value for String
     */
    @JsonSetter("period_range_end")
    public void setPeriodRangeEnd(String periodRangeEnd) {
        this.periodRangeEnd = periodRangeEnd;
    }

    /**
     * Getter for ProductId.
     * The ID of the product being credited. This may be set even for component credits, so true
     * product-only (non-component) credits will also have a nil `component_id`.
     * @return Returns the Integer
     */
    @JsonGetter("product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * The ID of the product being credited. This may be set even for component credits, so true
     * product-only (non-component) credits will also have a nil `component_id`.
     * @param productId Value for Integer
     */
    @JsonSetter("product_id")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * Getter for ProductVersion.
     * The version of the product being credited.
     * @return Returns the Integer
     */
    @JsonGetter("product_version")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductVersion() {
        return productVersion;
    }

    /**
     * Setter for ProductVersion.
     * The version of the product being credited.
     * @param productVersion Value for Integer
     */
    @JsonSetter("product_version")
    public void setProductVersion(Integer productVersion) {
        this.productVersion = productVersion;
    }

    /**
     * Internal Getter for ComponentId.
     * The ID of the component being credited. Will be `nil` for non-component credits.
     * @return Returns the Internal Integer
     */
    @JsonGetter("component_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetComponentId() {
        return this.componentId;
    }

    /**
     * Getter for ComponentId.
     * The ID of the component being credited. Will be `nil` for non-component credits.
     * @return Returns the Integer
     */
    public Integer getComponentId() {
        return OptionalNullable.getFrom(componentId);
    }

    /**
     * Setter for ComponentId.
     * The ID of the component being credited. Will be `nil` for non-component credits.
     * @param componentId Value for Integer
     */
    @JsonSetter("component_id")
    public void setComponentId(Integer componentId) {
        this.componentId = OptionalNullable.of(componentId);
    }

    /**
     * UnSetter for ComponentId.
     * The ID of the component being credited. Will be `nil` for non-component credits.
     */
    public void unsetComponentId() {
        componentId = null;
    }

    /**
     * Internal Getter for PricePointId.
     * The price point ID of the component being credited. Will be `nil` for non-component credits.
     * @return Returns the Internal Integer
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetPricePointId() {
        return this.pricePointId;
    }

    /**
     * Getter for PricePointId.
     * The price point ID of the component being credited. Will be `nil` for non-component credits.
     * @return Returns the Integer
     */
    public Integer getPricePointId() {
        return OptionalNullable.getFrom(pricePointId);
    }

    /**
     * Setter for PricePointId.
     * The price point ID of the component being credited. Will be `nil` for non-component credits.
     * @param pricePointId Value for Integer
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(Integer pricePointId) {
        this.pricePointId = OptionalNullable.of(pricePointId);
    }

    /**
     * UnSetter for PricePointId.
     * The price point ID of the component being credited. Will be `nil` for non-component credits.
     */
    public void unsetPricePointId() {
        pricePointId = null;
    }

    /**
     * Converts this CreditNoteLineItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreditNoteLineItem [" + "uid=" + uid + ", title=" + title + ", description="
                + description + ", quantity=" + quantity + ", unitPrice=" + unitPrice
                + ", subtotalAmount=" + subtotalAmount + ", discountAmount=" + discountAmount
                + ", taxAmount=" + taxAmount + ", totalAmount=" + totalAmount + ", tieredUnitPrice="
                + tieredUnitPrice + ", periodRangeStart=" + periodRangeStart + ", periodRangeEnd="
                + periodRangeEnd + ", productId=" + productId + ", productVersion=" + productVersion
                + ", componentId=" + componentId + ", pricePointId=" + pricePointId + "]";
    }

    /**
     * Builds a new {@link CreditNoteLineItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreditNoteLineItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .title(getTitle())
                .description(getDescription())
                .quantity(getQuantity())
                .unitPrice(getUnitPrice())
                .subtotalAmount(getSubtotalAmount())
                .discountAmount(getDiscountAmount())
                .taxAmount(getTaxAmount())
                .totalAmount(getTotalAmount())
                .tieredUnitPrice(getTieredUnitPrice())
                .periodRangeStart(getPeriodRangeStart())
                .periodRangeEnd(getPeriodRangeEnd())
                .productId(getProductId())
                .productVersion(getProductVersion());
        builder.componentId = internalGetComponentId();
        builder.pricePointId = internalGetPricePointId();
        return builder;
    }

    /**
     * Class to build instances of {@link CreditNoteLineItem}.
     */
    public static class Builder {
        private String uid;
        private String title;
        private String description;
        private String quantity;
        private String unitPrice;
        private String subtotalAmount;
        private String discountAmount;
        private String taxAmount;
        private String totalAmount;
        private Boolean tieredUnitPrice;
        private String periodRangeStart;
        private String periodRangeEnd;
        private Integer productId;
        private Integer productVersion;
        private OptionalNullable<Integer> componentId;
        private OptionalNullable<Integer> pricePointId;



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
         * Setter for title.
         * @param  title  String value for title.
         * @return Builder
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for quantity.
         * @param  quantity  String value for quantity.
         * @return Builder
         */
        public Builder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for unitPrice.
         * @param  unitPrice  String value for unitPrice.
         * @return Builder
         */
        public Builder unitPrice(String unitPrice) {
            this.unitPrice = unitPrice;
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
         * Setter for tieredUnitPrice.
         * @param  tieredUnitPrice  Boolean value for tieredUnitPrice.
         * @return Builder
         */
        public Builder tieredUnitPrice(Boolean tieredUnitPrice) {
            this.tieredUnitPrice = tieredUnitPrice;
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
         * Setter for productId.
         * @param  productId  Integer value for productId.
         * @return Builder
         */
        public Builder productId(Integer productId) {
            this.productId = productId;
            return this;
        }

        /**
         * Setter for productVersion.
         * @param  productVersion  Integer value for productVersion.
         * @return Builder
         */
        public Builder productVersion(Integer productVersion) {
            this.productVersion = productVersion;
            return this;
        }

        /**
         * Setter for componentId.
         * @param  componentId  Integer value for componentId.
         * @return Builder
         */
        public Builder componentId(Integer componentId) {
            this.componentId = OptionalNullable.of(componentId);
            return this;
        }

        /**
         * UnSetter for componentId.
         * @return Builder
         */
        public Builder unsetComponentId() {
            componentId = null;
            return this;
        }

        /**
         * Setter for pricePointId.
         * @param  pricePointId  Integer value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(Integer pricePointId) {
            this.pricePointId = OptionalNullable.of(pricePointId);
            return this;
        }

        /**
         * UnSetter for pricePointId.
         * @return Builder
         */
        public Builder unsetPricePointId() {
            pricePointId = null;
            return this;
        }

        /**
         * Builds a new {@link CreditNoteLineItem} object using the set fields.
         * @return {@link CreditNoteLineItem}
         */
        public CreditNoteLineItem build() {
            return new CreditNoteLineItem(uid, title, description, quantity, unitPrice,
                    subtotalAmount, discountAmount, taxAmount, totalAmount, tieredUnitPrice,
                    periodRangeStart, periodRangeEnd, productId, productVersion, componentId,
                    pricePointId);
        }
    }
}
