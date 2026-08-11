/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.UpdateInvoiceItemComponentId;
import com.maxio.advancedbilling.models.containers.UpdateInvoiceItemPricePointId;
import com.maxio.advancedbilling.models.containers.UpdateInvoiceItemProductId;
import com.maxio.advancedbilling.models.containers.UpdateInvoiceItemProductPricePointId;
import com.maxio.advancedbilling.models.containers.UpdateInvoiceItemQuantity;
import com.maxio.advancedbilling.models.containers.UpdateInvoiceItemUnitPrice;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for UpdateInvoiceItem type.
 */
public class UpdateInvoiceItem
        extends BaseModel {
    private String title;
    private UpdateInvoiceItemQuantity quantity;
    private UpdateInvoiceItemUnitPrice unitPrice;
    private Boolean taxable;
    private String taxCode;
    private String periodRangeStart;
    private String periodRangeEnd;
    private UpdateInvoiceItemProductId productId;
    private UpdateInvoiceItemComponentId componentId;
    private UpdateInvoiceItemPricePointId pricePointId;
    private UpdateInvoiceItemProductPricePointId productPricePointId;
    private String description;
    private String uid;
    private Boolean destroy;

    /**
     * Default constructor.
     */
    public UpdateInvoiceItem() {
    }

    /**
     * Initialization constructor.
     * @param  title  String value for title.
     * @param  quantity  UpdateInvoiceItemQuantity value for quantity.
     * @param  unitPrice  UpdateInvoiceItemUnitPrice value for unitPrice.
     * @param  taxable  Boolean value for taxable.
     * @param  taxCode  String value for taxCode.
     * @param  periodRangeStart  String value for periodRangeStart.
     * @param  periodRangeEnd  String value for periodRangeEnd.
     * @param  productId  UpdateInvoiceItemProductId value for productId.
     * @param  componentId  UpdateInvoiceItemComponentId value for componentId.
     * @param  pricePointId  UpdateInvoiceItemPricePointId value for pricePointId.
     * @param  productPricePointId  UpdateInvoiceItemProductPricePointId value for
     *         productPricePointId.
     * @param  description  String value for description.
     * @param  uid  String value for uid.
     * @param  destroy  Boolean value for destroy.
     */
    public UpdateInvoiceItem(
            String title,
            UpdateInvoiceItemQuantity quantity,
            UpdateInvoiceItemUnitPrice unitPrice,
            Boolean taxable,
            String taxCode,
            String periodRangeStart,
            String periodRangeEnd,
            UpdateInvoiceItemProductId productId,
            UpdateInvoiceItemComponentId componentId,
            UpdateInvoiceItemPricePointId pricePointId,
            UpdateInvoiceItemProductPricePointId productPricePointId,
            String description,
            String uid,
            Boolean destroy) {
        this.title = title;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.taxable = taxable;
        this.taxCode = taxCode;
        this.periodRangeStart = periodRangeStart;
        this.periodRangeEnd = periodRangeEnd;
        this.productId = productId;
        this.componentId = componentId;
        this.pricePointId = pricePointId;
        this.productPricePointId = productPricePointId;
        this.description = description;
        this.uid = uid;
        this.destroy = destroy;
    }

    /**
     * Getter for Title.
     * @return Returns the String
     */
    @JsonGetter("title")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title.
     * @param title Value for String
     */
    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for Quantity.
     * The quantity can contain up to 8 decimal places. e.g., 1.00 or 0.0012 or 0.00000065. If you
     * submit a value with more than 8 decimal places, we will round it down to the 8th decimal
     * place.
     * @return Returns the UpdateInvoiceItemQuantity
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdateInvoiceItemQuantity getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * The quantity can contain up to 8 decimal places. e.g., 1.00 or 0.0012 or 0.00000065. If you
     * submit a value with more than 8 decimal places, we will round it down to the 8th decimal
     * place.
     * @param quantity Value for UpdateInvoiceItemQuantity
     */
    @JsonSetter("quantity")
    public void setQuantity(UpdateInvoiceItemQuantity quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for UnitPrice.
     * The unit_price can contain up to 8 decimal places. e.g., 1.00 or 0.0012 or 0.00000065. If you
     * submit a value with more than 8 decimal places, we will round it down to the 8th decimal
     * place.
     * @return Returns the UpdateInvoiceItemUnitPrice
     */
    @JsonGetter("unit_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdateInvoiceItemUnitPrice getUnitPrice() {
        return unitPrice;
    }

    /**
     * Setter for UnitPrice.
     * The unit_price can contain up to 8 decimal places. e.g., 1.00 or 0.0012 or 0.00000065. If you
     * submit a value with more than 8 decimal places, we will round it down to the 8th decimal
     * place.
     * @param unitPrice Value for UpdateInvoiceItemUnitPrice
     */
    @JsonSetter("unit_price")
    public void setUnitPrice(UpdateInvoiceItemUnitPrice unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Getter for Taxable.
     * Set to true to automatically calculate taxes. Site must be configured to use and calculate
     * taxes. If using AvaTax, a tax_code parameter must also be sent.
     * @return Returns the Boolean
     */
    @JsonGetter("taxable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTaxable() {
        return taxable;
    }

    /**
     * Setter for Taxable.
     * Set to true to automatically calculate taxes. Site must be configured to use and calculate
     * taxes. If using AvaTax, a tax_code parameter must also be sent.
     * @param taxable Value for Boolean
     */
    @JsonSetter("taxable")
    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    /**
     * Getter for TaxCode.
     * A string representing the tax code related to the product type. This is especially important
     * when using AvaTax to tax based on locale. This attribute has a max length of 25 characters.
     * @return Returns the String
     */
    @JsonGetter("tax_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Setter for TaxCode.
     * A string representing the tax code related to the product type. This is especially important
     * when using AvaTax to tax based on locale. This attribute has a max length of 25 characters.
     * @param taxCode Value for String
     */
    @JsonSetter("tax_code")
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    /**
     * Getter for PeriodRangeStart.
     * YYYY-MM-DD
     * @return Returns the String
     */
    @JsonGetter("period_range_start")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPeriodRangeStart() {
        return periodRangeStart;
    }

    /**
     * Setter for PeriodRangeStart.
     * YYYY-MM-DD
     * @param periodRangeStart Value for String
     */
    @JsonSetter("period_range_start")
    public void setPeriodRangeStart(String periodRangeStart) {
        this.periodRangeStart = periodRangeStart;
    }

    /**
     * Getter for PeriodRangeEnd.
     * YYYY-MM-DD
     * @return Returns the String
     */
    @JsonGetter("period_range_end")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPeriodRangeEnd() {
        return periodRangeEnd;
    }

    /**
     * Setter for PeriodRangeEnd.
     * YYYY-MM-DD
     * @param periodRangeEnd Value for String
     */
    @JsonSetter("period_range_end")
    public void setPeriodRangeEnd(String periodRangeEnd) {
        this.periodRangeEnd = periodRangeEnd;
    }

    /**
     * Getter for ProductId.
     * Product handle or product id.
     * @return Returns the UpdateInvoiceItemProductId
     */
    @JsonGetter("product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdateInvoiceItemProductId getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * Product handle or product id.
     * @param productId Value for UpdateInvoiceItemProductId
     */
    @JsonSetter("product_id")
    public void setProductId(UpdateInvoiceItemProductId productId) {
        this.productId = productId;
    }

    /**
     * Getter for ComponentId.
     * Component handle or component id.
     * @return Returns the UpdateInvoiceItemComponentId
     */
    @JsonGetter("component_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdateInvoiceItemComponentId getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * Component handle or component id.
     * @param componentId Value for UpdateInvoiceItemComponentId
     */
    @JsonSetter("component_id")
    public void setComponentId(UpdateInvoiceItemComponentId componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for PricePointId.
     * Price point handle or id. For component.
     * @return Returns the UpdateInvoiceItemPricePointId
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdateInvoiceItemPricePointId getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * Price point handle or id. For component.
     * @param pricePointId Value for UpdateInvoiceItemPricePointId
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(UpdateInvoiceItemPricePointId pricePointId) {
        this.pricePointId = pricePointId;
    }

    /**
     * Getter for ProductPricePointId.
     * @return Returns the UpdateInvoiceItemProductPricePointId
     */
    @JsonGetter("product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UpdateInvoiceItemProductPricePointId getProductPricePointId() {
        return productPricePointId;
    }

    /**
     * Setter for ProductPricePointId.
     * @param productPricePointId Value for UpdateInvoiceItemProductPricePointId
     */
    @JsonSetter("product_price_point_id")
    public void setProductPricePointId(UpdateInvoiceItemProductPricePointId productPricePointId) {
        this.productPricePointId = productPricePointId;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Uid.
     * Unique identifier of an existing line item on the invoice. When provided, the matching line
     * item is updated with the submitted attributes. When omitted, a new line item is added to the
     * invoice.
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * Unique identifier of an existing line item on the invoice. When provided, the matching line
     * item is updated with the submitted attributes. When omitted, a new line item is added to the
     * invoice.
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Getter for Destroy.
     * Set to `true` together with `uid` to remove the matching line item from the invoice. Line
     * items not referenced in the request remain unchanged.
     * @return Returns the Boolean
     */
    @JsonGetter("_destroy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDestroy() {
        return destroy;
    }

    /**
     * Setter for Destroy.
     * Set to `true` together with `uid` to remove the matching line item from the invoice. Line
     * items not referenced in the request remain unchanged.
     * @param destroy Value for Boolean
     */
    @JsonSetter("_destroy")
    public void setDestroy(Boolean destroy) {
        this.destroy = destroy;
    }

    /**
     * Converts this UpdateInvoiceItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateInvoiceItem [" + "title=" + title + ", quantity=" + quantity + ", unitPrice="
                + unitPrice + ", taxable=" + taxable + ", taxCode=" + taxCode
                + ", periodRangeStart=" + periodRangeStart + ", periodRangeEnd=" + periodRangeEnd
                + ", productId=" + productId + ", componentId=" + componentId + ", pricePointId="
                + pricePointId + ", productPricePointId=" + productPricePointId + ", description="
                + description + ", uid=" + uid + ", destroy=" + destroy + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link UpdateInvoiceItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateInvoiceItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .title(getTitle())
                .quantity(getQuantity())
                .unitPrice(getUnitPrice())
                .taxable(getTaxable())
                .taxCode(getTaxCode())
                .periodRangeStart(getPeriodRangeStart())
                .periodRangeEnd(getPeriodRangeEnd())
                .productId(getProductId())
                .componentId(getComponentId())
                .pricePointId(getPricePointId())
                .productPricePointId(getProductPricePointId())
                .description(getDescription())
                .uid(getUid())
                .destroy(getDestroy());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateInvoiceItem}.
     */
    public static class Builder {
        private String title;
        private UpdateInvoiceItemQuantity quantity;
        private UpdateInvoiceItemUnitPrice unitPrice;
        private Boolean taxable;
        private String taxCode;
        private String periodRangeStart;
        private String periodRangeEnd;
        private UpdateInvoiceItemProductId productId;
        private UpdateInvoiceItemComponentId componentId;
        private UpdateInvoiceItemPricePointId pricePointId;
        private UpdateInvoiceItemProductPricePointId productPricePointId;
        private String description;
        private String uid;
        private Boolean destroy;



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
         * Setter for quantity.
         * @param  quantity  UpdateInvoiceItemQuantity value for quantity.
         * @return Builder
         */
        public Builder quantity(UpdateInvoiceItemQuantity quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for unitPrice.
         * @param  unitPrice  UpdateInvoiceItemUnitPrice value for unitPrice.
         * @return Builder
         */
        public Builder unitPrice(UpdateInvoiceItemUnitPrice unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        /**
         * Setter for taxable.
         * @param  taxable  Boolean value for taxable.
         * @return Builder
         */
        public Builder taxable(Boolean taxable) {
            this.taxable = taxable;
            return this;
        }

        /**
         * Setter for taxCode.
         * @param  taxCode  String value for taxCode.
         * @return Builder
         */
        public Builder taxCode(String taxCode) {
            this.taxCode = taxCode;
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
         * @param  productId  UpdateInvoiceItemProductId value for productId.
         * @return Builder
         */
        public Builder productId(UpdateInvoiceItemProductId productId) {
            this.productId = productId;
            return this;
        }

        /**
         * Setter for componentId.
         * @param  componentId  UpdateInvoiceItemComponentId value for componentId.
         * @return Builder
         */
        public Builder componentId(UpdateInvoiceItemComponentId componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * Setter for pricePointId.
         * @param  pricePointId  UpdateInvoiceItemPricePointId value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(UpdateInvoiceItemPricePointId pricePointId) {
            this.pricePointId = pricePointId;
            return this;
        }

        /**
         * Setter for productPricePointId.
         * @param  productPricePointId  UpdateInvoiceItemProductPricePointId value for
         *         productPricePointId.
         * @return Builder
         */
        public Builder productPricePointId(
                UpdateInvoiceItemProductPricePointId productPricePointId) {
            this.productPricePointId = productPricePointId;
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
         * Setter for uid.
         * @param  uid  String value for uid.
         * @return Builder
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Setter for destroy.
         * @param  destroy  Boolean value for destroy.
         * @return Builder
         */
        public Builder destroy(Boolean destroy) {
            this.destroy = destroy;
            return this;
        }

        /**
         * Builds a new {@link UpdateInvoiceItem} object using the set fields.
         * @return {@link UpdateInvoiceItem}
         */
        public UpdateInvoiceItem build() {
            return new UpdateInvoiceItem(title, quantity, unitPrice, taxable, taxCode,
                    periodRangeStart, periodRangeEnd, productId, componentId, pricePointId,
                    productPricePointId, description, uid, destroy);
        }
    }
}
