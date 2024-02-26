/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemComponentId;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemPricePointId;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemProductId;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemProductPricePointId;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemQuantity;
import com.maxio.advancedbilling.models.containers.CreateInvoiceItemUnitPrice;

/**
 * This is a model class for CreateInvoiceItem type.
 */
public class CreateInvoiceItem {
    private String title;
    private CreateInvoiceItemQuantity quantity;
    private CreateInvoiceItemUnitPrice unitPrice;
    private Boolean taxable;
    private String taxCode;
    private String periodRangeStart;
    private String periodRangeEnd;
    private CreateInvoiceItemProductId productId;
    private CreateInvoiceItemComponentId componentId;
    private CreateInvoiceItemPricePointId pricePointId;
    private CreateInvoiceItemProductPricePointId productPricePointId;
    private String description;

    /**
     * Default constructor.
     */
    public CreateInvoiceItem() {
    }

    /**
     * Initialization constructor.
     * @param  title  String value for title.
     * @param  quantity  CreateInvoiceItemQuantity value for quantity.
     * @param  unitPrice  CreateInvoiceItemUnitPrice value for unitPrice.
     * @param  taxable  Boolean value for taxable.
     * @param  taxCode  String value for taxCode.
     * @param  periodRangeStart  String value for periodRangeStart.
     * @param  periodRangeEnd  String value for periodRangeEnd.
     * @param  productId  CreateInvoiceItemProductId value for productId.
     * @param  componentId  CreateInvoiceItemComponentId value for componentId.
     * @param  pricePointId  CreateInvoiceItemPricePointId value for pricePointId.
     * @param  productPricePointId  CreateInvoiceItemProductPricePointId value for
     *         productPricePointId.
     * @param  description  String value for description.
     */
    public CreateInvoiceItem(
            String title,
            CreateInvoiceItemQuantity quantity,
            CreateInvoiceItemUnitPrice unitPrice,
            Boolean taxable,
            String taxCode,
            String periodRangeStart,
            String periodRangeEnd,
            CreateInvoiceItemProductId productId,
            CreateInvoiceItemComponentId componentId,
            CreateInvoiceItemPricePointId pricePointId,
            CreateInvoiceItemProductPricePointId productPricePointId,
            String description) {
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
     * The quantity can contain up to 8 decimal places. i.e. 1.00 or 0.0012 or 0.00000065. If you
     * submit a value with more than 8 decimal places, we will round it down to the 8th decimal
     * place.
     * @return Returns the CreateInvoiceItemQuantity
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInvoiceItemQuantity getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * The quantity can contain up to 8 decimal places. i.e. 1.00 or 0.0012 or 0.00000065. If you
     * submit a value with more than 8 decimal places, we will round it down to the 8th decimal
     * place.
     * @param quantity Value for CreateInvoiceItemQuantity
     */
    @JsonSetter("quantity")
    public void setQuantity(CreateInvoiceItemQuantity quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for UnitPrice.
     * The unit_price can contain up to 8 decimal places. i.e. 1.00 or 0.0012 or 0.00000065. If you
     * submit a value with more than 8 decimal places, we will round it down to the 8th decimal
     * place.
     * @return Returns the CreateInvoiceItemUnitPrice
     */
    @JsonGetter("unit_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInvoiceItemUnitPrice getUnitPrice() {
        return unitPrice;
    }

    /**
     * Setter for UnitPrice.
     * The unit_price can contain up to 8 decimal places. i.e. 1.00 or 0.0012 or 0.00000065. If you
     * submit a value with more than 8 decimal places, we will round it down to the 8th decimal
     * place.
     * @param unitPrice Value for CreateInvoiceItemUnitPrice
     */
    @JsonSetter("unit_price")
    public void setUnitPrice(CreateInvoiceItemUnitPrice unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Getter for Taxable.
     * Set to true to automatically calculate taxes. Site must be configured to use and calculate
     * taxes. If using Avalara, a tax_code parameter must also be sent.
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
     * taxes. If using Avalara, a tax_code parameter must also be sent.
     * @param taxable Value for Boolean
     */
    @JsonSetter("taxable")
    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    /**
     * Getter for TaxCode.
     * @return Returns the String
     */
    @JsonGetter("tax_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Setter for TaxCode.
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
     * @return Returns the CreateInvoiceItemProductId
     */
    @JsonGetter("product_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInvoiceItemProductId getProductId() {
        return productId;
    }

    /**
     * Setter for ProductId.
     * Product handle or product id.
     * @param productId Value for CreateInvoiceItemProductId
     */
    @JsonSetter("product_id")
    public void setProductId(CreateInvoiceItemProductId productId) {
        this.productId = productId;
    }

    /**
     * Getter for ComponentId.
     * Component handle or component id.
     * @return Returns the CreateInvoiceItemComponentId
     */
    @JsonGetter("component_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInvoiceItemComponentId getComponentId() {
        return componentId;
    }

    /**
     * Setter for ComponentId.
     * Component handle or component id.
     * @param componentId Value for CreateInvoiceItemComponentId
     */
    @JsonSetter("component_id")
    public void setComponentId(CreateInvoiceItemComponentId componentId) {
        this.componentId = componentId;
    }

    /**
     * Getter for PricePointId.
     * Price point handle or id. For component.
     * @return Returns the CreateInvoiceItemPricePointId
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInvoiceItemPricePointId getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * Price point handle or id. For component.
     * @param pricePointId Value for CreateInvoiceItemPricePointId
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(CreateInvoiceItemPricePointId pricePointId) {
        this.pricePointId = pricePointId;
    }

    /**
     * Getter for ProductPricePointId.
     * @return Returns the CreateInvoiceItemProductPricePointId
     */
    @JsonGetter("product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInvoiceItemProductPricePointId getProductPricePointId() {
        return productPricePointId;
    }

    /**
     * Setter for ProductPricePointId.
     * @param productPricePointId Value for CreateInvoiceItemProductPricePointId
     */
    @JsonSetter("product_price_point_id")
    public void setProductPricePointId(CreateInvoiceItemProductPricePointId productPricePointId) {
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
     * Converts this CreateInvoiceItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateInvoiceItem [" + "title=" + title + ", quantity=" + quantity + ", unitPrice="
                + unitPrice + ", taxable=" + taxable + ", taxCode=" + taxCode
                + ", periodRangeStart=" + periodRangeStart + ", periodRangeEnd=" + periodRangeEnd
                + ", productId=" + productId + ", componentId=" + componentId + ", pricePointId="
                + pricePointId + ", productPricePointId=" + productPricePointId + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link CreateInvoiceItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateInvoiceItem.Builder} object
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
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateInvoiceItem}.
     */
    public static class Builder {
        private String title;
        private CreateInvoiceItemQuantity quantity;
        private CreateInvoiceItemUnitPrice unitPrice;
        private Boolean taxable;
        private String taxCode;
        private String periodRangeStart;
        private String periodRangeEnd;
        private CreateInvoiceItemProductId productId;
        private CreateInvoiceItemComponentId componentId;
        private CreateInvoiceItemPricePointId pricePointId;
        private CreateInvoiceItemProductPricePointId productPricePointId;
        private String description;



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
         * @param  quantity  CreateInvoiceItemQuantity value for quantity.
         * @return Builder
         */
        public Builder quantity(CreateInvoiceItemQuantity quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for unitPrice.
         * @param  unitPrice  CreateInvoiceItemUnitPrice value for unitPrice.
         * @return Builder
         */
        public Builder unitPrice(CreateInvoiceItemUnitPrice unitPrice) {
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
         * @param  productId  CreateInvoiceItemProductId value for productId.
         * @return Builder
         */
        public Builder productId(CreateInvoiceItemProductId productId) {
            this.productId = productId;
            return this;
        }

        /**
         * Setter for componentId.
         * @param  componentId  CreateInvoiceItemComponentId value for componentId.
         * @return Builder
         */
        public Builder componentId(CreateInvoiceItemComponentId componentId) {
            this.componentId = componentId;
            return this;
        }

        /**
         * Setter for pricePointId.
         * @param  pricePointId  CreateInvoiceItemPricePointId value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(CreateInvoiceItemPricePointId pricePointId) {
            this.pricePointId = pricePointId;
            return this;
        }

        /**
         * Setter for productPricePointId.
         * @param  productPricePointId  CreateInvoiceItemProductPricePointId value for
         *         productPricePointId.
         * @return Builder
         */
        public Builder productPricePointId(
                CreateInvoiceItemProductPricePointId productPricePointId) {
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
         * Builds a new {@link CreateInvoiceItem} object using the set fields.
         * @return {@link CreateInvoiceItem}
         */
        public CreateInvoiceItem build() {
            return new CreateInvoiceItem(title, quantity, unitPrice, taxable, taxCode,
                    periodRangeStart, periodRangeEnd, productId, componentId, pricePointId,
                    productPricePointId, description);
        }
    }
}
