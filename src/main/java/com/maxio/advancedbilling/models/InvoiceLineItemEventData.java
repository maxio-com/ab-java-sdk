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
import java.util.List;

/**
 * This is a model class for InvoiceLineItemEventData type.
 */
public class InvoiceLineItemEventData {
    private String uid;
    private String title;
    private String description;
    private Integer quantity;
    private OptionalNullable<Integer> quantityDelta;
    private String unitPrice;
    private String periodRangeStart;
    private String periodRangeEnd;
    private String amount;
    private String lineReferences;
    private OptionalNullable<Integer> pricingDetailsIndex;
    private List<InvoiceLineItemPricingDetail> pricingDetails;
    private String taxCode;
    private String taxAmount;
    private Integer productId;
    private Integer productPricePointId;
    private OptionalNullable<Integer> pricePointId;
    private OptionalNullable<Integer> componentId;
    private OptionalNullable<Integer> billingScheduleItemId;
    private Boolean customItem;

    /**
     * Default constructor.
     */
    public InvoiceLineItemEventData() {
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  title  String value for title.
     * @param  description  String value for description.
     * @param  quantity  Integer value for quantity.
     * @param  quantityDelta  Integer value for quantityDelta.
     * @param  unitPrice  String value for unitPrice.
     * @param  periodRangeStart  String value for periodRangeStart.
     * @param  periodRangeEnd  String value for periodRangeEnd.
     * @param  amount  String value for amount.
     * @param  lineReferences  String value for lineReferences.
     * @param  pricingDetailsIndex  Integer value for pricingDetailsIndex.
     * @param  pricingDetails  List of InvoiceLineItemPricingDetail value for pricingDetails.
     * @param  taxCode  String value for taxCode.
     * @param  taxAmount  String value for taxAmount.
     * @param  productId  Integer value for productId.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  componentId  Integer value for componentId.
     * @param  billingScheduleItemId  Integer value for billingScheduleItemId.
     * @param  customItem  Boolean value for customItem.
     */
    public InvoiceLineItemEventData(
            String uid,
            String title,
            String description,
            Integer quantity,
            Integer quantityDelta,
            String unitPrice,
            String periodRangeStart,
            String periodRangeEnd,
            String amount,
            String lineReferences,
            Integer pricingDetailsIndex,
            List<InvoiceLineItemPricingDetail> pricingDetails,
            String taxCode,
            String taxAmount,
            Integer productId,
            Integer productPricePointId,
            Integer pricePointId,
            Integer componentId,
            Integer billingScheduleItemId,
            Boolean customItem) {
        this.uid = uid;
        this.title = title;
        this.description = description;
        this.quantity = quantity;
        this.quantityDelta = OptionalNullable.of(quantityDelta);
        this.unitPrice = unitPrice;
        this.periodRangeStart = periodRangeStart;
        this.periodRangeEnd = periodRangeEnd;
        this.amount = amount;
        this.lineReferences = lineReferences;
        this.pricingDetailsIndex = OptionalNullable.of(pricingDetailsIndex);
        this.pricingDetails = pricingDetails;
        this.taxCode = taxCode;
        this.taxAmount = taxAmount;
        this.productId = productId;
        this.productPricePointId = productPricePointId;
        this.pricePointId = OptionalNullable.of(pricePointId);
        this.componentId = OptionalNullable.of(componentId);
        this.billingScheduleItemId = OptionalNullable.of(billingScheduleItemId);
        this.customItem = customItem;
    }

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  title  String value for title.
     * @param  description  String value for description.
     * @param  quantity  Integer value for quantity.
     * @param  quantityDelta  Integer value for quantityDelta.
     * @param  unitPrice  String value for unitPrice.
     * @param  periodRangeStart  String value for periodRangeStart.
     * @param  periodRangeEnd  String value for periodRangeEnd.
     * @param  amount  String value for amount.
     * @param  lineReferences  String value for lineReferences.
     * @param  pricingDetailsIndex  Integer value for pricingDetailsIndex.
     * @param  pricingDetails  List of InvoiceLineItemPricingDetail value for pricingDetails.
     * @param  taxCode  String value for taxCode.
     * @param  taxAmount  String value for taxAmount.
     * @param  productId  Integer value for productId.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  componentId  Integer value for componentId.
     * @param  billingScheduleItemId  Integer value for billingScheduleItemId.
     * @param  customItem  Boolean value for customItem.
     */

    protected InvoiceLineItemEventData(String uid, String title, String description,
            Integer quantity, OptionalNullable<Integer> quantityDelta, String unitPrice,
            String periodRangeStart, String periodRangeEnd, String amount, String lineReferences,
            OptionalNullable<Integer> pricingDetailsIndex,
            List<InvoiceLineItemPricingDetail> pricingDetails, String taxCode, String taxAmount,
            Integer productId, Integer productPricePointId, OptionalNullable<Integer> pricePointId,
            OptionalNullable<Integer> componentId, OptionalNullable<Integer> billingScheduleItemId,
            Boolean customItem) {
        this.uid = uid;
        this.title = title;
        this.description = description;
        this.quantity = quantity;
        this.quantityDelta = quantityDelta;
        this.unitPrice = unitPrice;
        this.periodRangeStart = periodRangeStart;
        this.periodRangeEnd = periodRangeEnd;
        this.amount = amount;
        this.lineReferences = lineReferences;
        this.pricingDetailsIndex = pricingDetailsIndex;
        this.pricingDetails = pricingDetails;
        this.taxCode = taxCode;
        this.taxAmount = taxAmount;
        this.productId = productId;
        this.productPricePointId = productPricePointId;
        this.pricePointId = pricePointId;
        this.componentId = componentId;
        this.billingScheduleItemId = billingScheduleItemId;
        this.customItem = customItem;
    }

    /**
     * Getter for Uid.
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Setter for Uid.
     * @param uid Value for String
     */
    @JsonSetter("uid")
    public void setUid(String uid) {
        this.uid = uid;
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
     * Getter for Quantity.
     * @return Returns the Integer
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * @param quantity Value for Integer
     */
    @JsonSetter("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Internal Getter for QuantityDelta.
     * @return Returns the Internal Integer
     */
    @JsonGetter("quantity_delta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetQuantityDelta() {
        return this.quantityDelta;
    }

    /**
     * Getter for QuantityDelta.
     * @return Returns the Integer
     */
    public Integer getQuantityDelta() {
        return OptionalNullable.getFrom(quantityDelta);
    }

    /**
     * Setter for QuantityDelta.
     * @param quantityDelta Value for Integer
     */
    @JsonSetter("quantity_delta")
    public void setQuantityDelta(Integer quantityDelta) {
        this.quantityDelta = OptionalNullable.of(quantityDelta);
    }

    /**
     * UnSetter for QuantityDelta.
     */
    public void unsetQuantityDelta() {
        quantityDelta = null;
    }

    /**
     * Getter for UnitPrice.
     * @return Returns the String
     */
    @JsonGetter("unit_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Setter for UnitPrice.
     * @param unitPrice Value for String
     */
    @JsonSetter("unit_price")
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
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
     * Getter for Amount.
     * @return Returns the String
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * @param amount Value for String
     */
    @JsonSetter("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Getter for LineReferences.
     * @return Returns the String
     */
    @JsonGetter("line_references")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLineReferences() {
        return lineReferences;
    }

    /**
     * Setter for LineReferences.
     * @param lineReferences Value for String
     */
    @JsonSetter("line_references")
    public void setLineReferences(String lineReferences) {
        this.lineReferences = lineReferences;
    }

    /**
     * Internal Getter for PricingDetailsIndex.
     * @return Returns the Internal Integer
     */
    @JsonGetter("pricing_details_index")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetPricingDetailsIndex() {
        return this.pricingDetailsIndex;
    }

    /**
     * Getter for PricingDetailsIndex.
     * @return Returns the Integer
     */
    public Integer getPricingDetailsIndex() {
        return OptionalNullable.getFrom(pricingDetailsIndex);
    }

    /**
     * Setter for PricingDetailsIndex.
     * @param pricingDetailsIndex Value for Integer
     */
    @JsonSetter("pricing_details_index")
    public void setPricingDetailsIndex(Integer pricingDetailsIndex) {
        this.pricingDetailsIndex = OptionalNullable.of(pricingDetailsIndex);
    }

    /**
     * UnSetter for PricingDetailsIndex.
     */
    public void unsetPricingDetailsIndex() {
        pricingDetailsIndex = null;
    }

    /**
     * Getter for PricingDetails.
     * @return Returns the List of InvoiceLineItemPricingDetail
     */
    @JsonGetter("pricing_details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InvoiceLineItemPricingDetail> getPricingDetails() {
        return pricingDetails;
    }

    /**
     * Setter for PricingDetails.
     * @param pricingDetails Value for List of InvoiceLineItemPricingDetail
     */
    @JsonSetter("pricing_details")
    public void setPricingDetails(List<InvoiceLineItemPricingDetail> pricingDetails) {
        this.pricingDetails = pricingDetails;
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
     * Getter for TaxAmount.
     * @return Returns the String
     */
    @JsonGetter("tax_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Setter for TaxAmount.
     * @param taxAmount Value for String
     */
    @JsonSetter("tax_amount")
    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
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
     * Getter for ProductPricePointId.
     * @return Returns the Integer
     */
    @JsonGetter("product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductPricePointId() {
        return productPricePointId;
    }

    /**
     * Setter for ProductPricePointId.
     * @param productPricePointId Value for Integer
     */
    @JsonSetter("product_price_point_id")
    public void setProductPricePointId(Integer productPricePointId) {
        this.productPricePointId = productPricePointId;
    }

    /**
     * Internal Getter for PricePointId.
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
     * @return Returns the Integer
     */
    public Integer getPricePointId() {
        return OptionalNullable.getFrom(pricePointId);
    }

    /**
     * Setter for PricePointId.
     * @param pricePointId Value for Integer
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(Integer pricePointId) {
        this.pricePointId = OptionalNullable.of(pricePointId);
    }

    /**
     * UnSetter for PricePointId.
     */
    public void unsetPricePointId() {
        pricePointId = null;
    }

    /**
     * Internal Getter for ComponentId.
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
     * @return Returns the Integer
     */
    public Integer getComponentId() {
        return OptionalNullable.getFrom(componentId);
    }

    /**
     * Setter for ComponentId.
     * @param componentId Value for Integer
     */
    @JsonSetter("component_id")
    public void setComponentId(Integer componentId) {
        this.componentId = OptionalNullable.of(componentId);
    }

    /**
     * UnSetter for ComponentId.
     */
    public void unsetComponentId() {
        componentId = null;
    }

    /**
     * Internal Getter for BillingScheduleItemId.
     * @return Returns the Internal Integer
     */
    @JsonGetter("billing_schedule_item_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetBillingScheduleItemId() {
        return this.billingScheduleItemId;
    }

    /**
     * Getter for BillingScheduleItemId.
     * @return Returns the Integer
     */
    public Integer getBillingScheduleItemId() {
        return OptionalNullable.getFrom(billingScheduleItemId);
    }

    /**
     * Setter for BillingScheduleItemId.
     * @param billingScheduleItemId Value for Integer
     */
    @JsonSetter("billing_schedule_item_id")
    public void setBillingScheduleItemId(Integer billingScheduleItemId) {
        this.billingScheduleItemId = OptionalNullable.of(billingScheduleItemId);
    }

    /**
     * UnSetter for BillingScheduleItemId.
     */
    public void unsetBillingScheduleItemId() {
        billingScheduleItemId = null;
    }

    /**
     * Getter for CustomItem.
     * @return Returns the Boolean
     */
    @JsonGetter("custom_item")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCustomItem() {
        return customItem;
    }

    /**
     * Setter for CustomItem.
     * @param customItem Value for Boolean
     */
    @JsonSetter("custom_item")
    public void setCustomItem(Boolean customItem) {
        this.customItem = customItem;
    }

    /**
     * Converts this InvoiceLineItemEventData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceLineItemEventData [" + "uid=" + uid + ", title=" + title + ", description="
                + description + ", quantity=" + quantity + ", quantityDelta=" + quantityDelta
                + ", unitPrice=" + unitPrice + ", periodRangeStart=" + periodRangeStart
                + ", periodRangeEnd=" + periodRangeEnd + ", amount=" + amount + ", lineReferences="
                + lineReferences + ", pricingDetailsIndex=" + pricingDetailsIndex
                + ", pricingDetails=" + pricingDetails + ", taxCode=" + taxCode + ", taxAmount="
                + taxAmount + ", productId=" + productId + ", productPricePointId="
                + productPricePointId + ", pricePointId=" + pricePointId + ", componentId="
                + componentId + ", billingScheduleItemId=" + billingScheduleItemId + ", customItem="
                + customItem + "]";
    }

    /**
     * Builds a new {@link InvoiceLineItemEventData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceLineItemEventData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .title(getTitle())
                .description(getDescription())
                .quantity(getQuantity())
                .unitPrice(getUnitPrice())
                .periodRangeStart(getPeriodRangeStart())
                .periodRangeEnd(getPeriodRangeEnd())
                .amount(getAmount())
                .lineReferences(getLineReferences())
                .pricingDetails(getPricingDetails())
                .taxCode(getTaxCode())
                .taxAmount(getTaxAmount())
                .productId(getProductId())
                .productPricePointId(getProductPricePointId())
                .customItem(getCustomItem());
        builder.quantityDelta = internalGetQuantityDelta();
        builder.pricingDetailsIndex = internalGetPricingDetailsIndex();
        builder.pricePointId = internalGetPricePointId();
        builder.componentId = internalGetComponentId();
        builder.billingScheduleItemId = internalGetBillingScheduleItemId();
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceLineItemEventData}.
     */
    public static class Builder {
        private String uid;
        private String title;
        private String description;
        private Integer quantity;
        private OptionalNullable<Integer> quantityDelta;
        private String unitPrice;
        private String periodRangeStart;
        private String periodRangeEnd;
        private String amount;
        private String lineReferences;
        private OptionalNullable<Integer> pricingDetailsIndex;
        private List<InvoiceLineItemPricingDetail> pricingDetails;
        private String taxCode;
        private String taxAmount;
        private Integer productId;
        private Integer productPricePointId;
        private OptionalNullable<Integer> pricePointId;
        private OptionalNullable<Integer> componentId;
        private OptionalNullable<Integer> billingScheduleItemId;
        private Boolean customItem;



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
         * @param  quantity  Integer value for quantity.
         * @return Builder
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for quantityDelta.
         * @param  quantityDelta  Integer value for quantityDelta.
         * @return Builder
         */
        public Builder quantityDelta(Integer quantityDelta) {
            this.quantityDelta = OptionalNullable.of(quantityDelta);
            return this;
        }

        /**
         * UnSetter for quantityDelta.
         * @return Builder
         */
        public Builder unsetQuantityDelta() {
            quantityDelta = null;
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
         * Setter for amount.
         * @param  amount  String value for amount.
         * @return Builder
         */
        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for lineReferences.
         * @param  lineReferences  String value for lineReferences.
         * @return Builder
         */
        public Builder lineReferences(String lineReferences) {
            this.lineReferences = lineReferences;
            return this;
        }

        /**
         * Setter for pricingDetailsIndex.
         * @param  pricingDetailsIndex  Integer value for pricingDetailsIndex.
         * @return Builder
         */
        public Builder pricingDetailsIndex(Integer pricingDetailsIndex) {
            this.pricingDetailsIndex = OptionalNullable.of(pricingDetailsIndex);
            return this;
        }

        /**
         * UnSetter for pricingDetailsIndex.
         * @return Builder
         */
        public Builder unsetPricingDetailsIndex() {
            pricingDetailsIndex = null;
            return this;
        }

        /**
         * Setter for pricingDetails.
         * @param  pricingDetails  List of InvoiceLineItemPricingDetail value for pricingDetails.
         * @return Builder
         */
        public Builder pricingDetails(List<InvoiceLineItemPricingDetail> pricingDetails) {
            this.pricingDetails = pricingDetails;
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
         * Setter for taxAmount.
         * @param  taxAmount  String value for taxAmount.
         * @return Builder
         */
        public Builder taxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
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
         * Setter for productPricePointId.
         * @param  productPricePointId  Integer value for productPricePointId.
         * @return Builder
         */
        public Builder productPricePointId(Integer productPricePointId) {
            this.productPricePointId = productPricePointId;
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
         * Setter for billingScheduleItemId.
         * @param  billingScheduleItemId  Integer value for billingScheduleItemId.
         * @return Builder
         */
        public Builder billingScheduleItemId(Integer billingScheduleItemId) {
            this.billingScheduleItemId = OptionalNullable.of(billingScheduleItemId);
            return this;
        }

        /**
         * UnSetter for billingScheduleItemId.
         * @return Builder
         */
        public Builder unsetBillingScheduleItemId() {
            billingScheduleItemId = null;
            return this;
        }

        /**
         * Setter for customItem.
         * @param  customItem  Boolean value for customItem.
         * @return Builder
         */
        public Builder customItem(Boolean customItem) {
            this.customItem = customItem;
            return this;
        }

        /**
         * Builds a new {@link InvoiceLineItemEventData} object using the set fields.
         * @return {@link InvoiceLineItemEventData}
         */
        public InvoiceLineItemEventData build() {
            return new InvoiceLineItemEventData(uid, title, description, quantity, quantityDelta,
                    unitPrice, periodRangeStart, periodRangeEnd, amount, lineReferences,
                    pricingDetailsIndex, pricingDetails, taxCode, taxAmount, productId,
                    productPricePointId, pricePointId, componentId, billingScheduleItemId,
                    customItem);
        }
    }
}
