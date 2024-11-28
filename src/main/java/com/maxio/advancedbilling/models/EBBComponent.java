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
import com.maxio.advancedbilling.models.containers.EBBComponentUnitPrice;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for EBBComponent type.
 */
public class EBBComponent
        extends BaseModel {
    private String name;
    private String unitName;
    private String description;
    private String handle;
    private Boolean taxable;
    private PricingScheme pricingScheme;
    private List<Price> prices;
    private List<ComponentPricePointItem> pricePoints;
    private EBBComponentUnitPrice unitPrice;
    private String taxCode;
    private Boolean hideDateRangeOnInvoice;
    private int eventBasedBillingMetricId;
    private Integer interval;
    private OptionalNullable<IntervalUnit> intervalUnit;

    /**
     * Default constructor.
     */
    public EBBComponent() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  unitName  String value for unitName.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  eventBasedBillingMetricId  int value for eventBasedBillingMetricId.
     * @param  description  String value for description.
     * @param  handle  String value for handle.
     * @param  taxable  Boolean value for taxable.
     * @param  prices  List of Price value for prices.
     * @param  pricePoints  List of ComponentPricePointItem value for pricePoints.
     * @param  unitPrice  EBBComponentUnitPrice value for unitPrice.
     * @param  taxCode  String value for taxCode.
     * @param  hideDateRangeOnInvoice  Boolean value for hideDateRangeOnInvoice.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     */
    public EBBComponent(
            String name,
            String unitName,
            PricingScheme pricingScheme,
            int eventBasedBillingMetricId,
            String description,
            String handle,
            Boolean taxable,
            List<Price> prices,
            List<ComponentPricePointItem> pricePoints,
            EBBComponentUnitPrice unitPrice,
            String taxCode,
            Boolean hideDateRangeOnInvoice,
            Integer interval,
            IntervalUnit intervalUnit) {
        this.name = name;
        this.unitName = unitName;
        this.description = description;
        this.handle = handle;
        this.taxable = taxable;
        this.pricingScheme = pricingScheme;
        this.prices = prices;
        this.pricePoints = pricePoints;
        this.unitPrice = unitPrice;
        this.taxCode = taxCode;
        this.hideDateRangeOnInvoice = hideDateRangeOnInvoice;
        this.eventBasedBillingMetricId = eventBasedBillingMetricId;
        this.interval = interval;
        this.intervalUnit = OptionalNullable.of(intervalUnit);
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  unitName  String value for unitName.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  eventBasedBillingMetricId  int value for eventBasedBillingMetricId.
     * @param  description  String value for description.
     * @param  handle  String value for handle.
     * @param  taxable  Boolean value for taxable.
     * @param  prices  List of Price value for prices.
     * @param  pricePoints  List of ComponentPricePointItem value for pricePoints.
     * @param  unitPrice  EBBComponentUnitPrice value for unitPrice.
     * @param  taxCode  String value for taxCode.
     * @param  hideDateRangeOnInvoice  Boolean value for hideDateRangeOnInvoice.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     */

    protected EBBComponent(String name, String unitName, PricingScheme pricingScheme,
            int eventBasedBillingMetricId, String description, String handle, Boolean taxable,
            List<Price> prices, List<ComponentPricePointItem> pricePoints,
            EBBComponentUnitPrice unitPrice, String taxCode, Boolean hideDateRangeOnInvoice,
            Integer interval, OptionalNullable<IntervalUnit> intervalUnit) {
        this.name = name;
        this.unitName = unitName;
        this.description = description;
        this.handle = handle;
        this.taxable = taxable;
        this.pricingScheme = pricingScheme;
        this.prices = prices;
        this.pricePoints = pricePoints;
        this.unitPrice = unitPrice;
        this.taxCode = taxCode;
        this.hideDateRangeOnInvoice = hideDateRangeOnInvoice;
        this.eventBasedBillingMetricId = eventBasedBillingMetricId;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
    }

    /**
     * Getter for Name.
     * A name for this component that is suitable for showing customers and displaying on billing
     * statements, ie. "Minutes".
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * A name for this component that is suitable for showing customers and displaying on billing
     * statements, ie. "Minutes".
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for UnitName.
     * The name of the unit of measurement for the component. It should be singular since it will be
     * automatically pluralized when necessary. i.e. “message”, which may then be shown as “5
     * messages” on a subscription’s component line-item
     * @return Returns the String
     */
    @JsonGetter("unit_name")
    public String getUnitName() {
        return unitName;
    }

    /**
     * Setter for UnitName.
     * The name of the unit of measurement for the component. It should be singular since it will be
     * automatically pluralized when necessary. i.e. “message”, which may then be shown as “5
     * messages” on a subscription’s component line-item
     * @param unitName Value for String
     */
    @JsonSetter("unit_name")
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /**
     * Getter for Description.
     * A description for the component that will be displayed to the user on the hosted signup page.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * A description for the component that will be displayed to the user on the hosted signup page.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Handle.
     * A unique identifier for your use that can be used to retrieve this component is subsequent
     * requests. Must start with a letter or number and may only contain lowercase letters, numbers,
     * or the characters '.', ':', '-', or '_'.
     * @return Returns the String
     */
    @JsonGetter("handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHandle() {
        return handle;
    }

    /**
     * Setter for Handle.
     * A unique identifier for your use that can be used to retrieve this component is subsequent
     * requests. Must start with a letter or number and may only contain lowercase letters, numbers,
     * or the characters '.', ':', '-', or '_'.
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    /**
     * Getter for Taxable.
     * Boolean flag describing whether a component is taxable or not.
     * @return Returns the Boolean
     */
    @JsonGetter("taxable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTaxable() {
        return taxable;
    }

    /**
     * Setter for Taxable.
     * Boolean flag describing whether a component is taxable or not.
     * @param taxable Value for Boolean
     */
    @JsonSetter("taxable")
    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    /**
     * Getter for PricingScheme.
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @return Returns the PricingScheme
     */
    @JsonGetter("pricing_scheme")
    public PricingScheme getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @param pricingScheme Value for PricingScheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(PricingScheme pricingScheme) {
        this.pricingScheme = pricingScheme;
    }

    /**
     * Getter for Prices.
     * (Not required for ‘per_unit’ pricing schemes) One or more price brackets. See [Price Bracket
     * Rules](https://maxio.zendesk.com/hc/en-us/articles/24261149166733-Component-Pricing-Schemes#price-bracket-rules)
     * for an overview of how price brackets work for different pricing schemes.
     * @return Returns the List of Price
     */
    @JsonGetter("prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Price> getPrices() {
        return prices;
    }

    /**
     * Setter for Prices.
     * (Not required for ‘per_unit’ pricing schemes) One or more price brackets. See [Price Bracket
     * Rules](https://maxio.zendesk.com/hc/en-us/articles/24261149166733-Component-Pricing-Schemes#price-bracket-rules)
     * for an overview of how price brackets work for different pricing schemes.
     * @param prices Value for List of Price
     */
    @JsonSetter("prices")
    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    /**
     * Getter for PricePoints.
     * @return Returns the List of ComponentPricePointItem
     */
    @JsonGetter("price_points")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ComponentPricePointItem> getPricePoints() {
        return pricePoints;
    }

    /**
     * Setter for PricePoints.
     * @param pricePoints Value for List of ComponentPricePointItem
     */
    @JsonSetter("price_points")
    public void setPricePoints(List<ComponentPricePointItem> pricePoints) {
        this.pricePoints = pricePoints;
    }

    /**
     * Getter for UnitPrice.
     * The amount the customer will be charged per unit when the pricing scheme is “per_unit”. The
     * price can contain up to 8 decimal places. i.e. 1.00 or 0.0012 or 0.00000065
     * @return Returns the EBBComponentUnitPrice
     */
    @JsonGetter("unit_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public EBBComponentUnitPrice getUnitPrice() {
        return unitPrice;
    }

    /**
     * Setter for UnitPrice.
     * The amount the customer will be charged per unit when the pricing scheme is “per_unit”. The
     * price can contain up to 8 decimal places. i.e. 1.00 or 0.0012 or 0.00000065
     * @param unitPrice Value for EBBComponentUnitPrice
     */
    @JsonSetter("unit_price")
    public void setUnitPrice(EBBComponentUnitPrice unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * Getter for TaxCode.
     * A string representing the tax code related to the component type. This is especially
     * important when using the Avalara service to tax based on locale. This attribute has a max
     * length of 10 characters.
     * @return Returns the String
     */
    @JsonGetter("tax_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Setter for TaxCode.
     * A string representing the tax code related to the component type. This is especially
     * important when using the Avalara service to tax based on locale. This attribute has a max
     * length of 10 characters.
     * @param taxCode Value for String
     */
    @JsonSetter("tax_code")
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    /**
     * Getter for HideDateRangeOnInvoice.
     * (Only available on Relationship Invoicing sites) Boolean flag describing if the service date
     * range should show for the component on generated invoices.
     * @return Returns the Boolean
     */
    @JsonGetter("hide_date_range_on_invoice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHideDateRangeOnInvoice() {
        return hideDateRangeOnInvoice;
    }

    /**
     * Setter for HideDateRangeOnInvoice.
     * (Only available on Relationship Invoicing sites) Boolean flag describing if the service date
     * range should show for the component on generated invoices.
     * @param hideDateRangeOnInvoice Value for Boolean
     */
    @JsonSetter("hide_date_range_on_invoice")
    public void setHideDateRangeOnInvoice(Boolean hideDateRangeOnInvoice) {
        this.hideDateRangeOnInvoice = hideDateRangeOnInvoice;
    }

    /**
     * Getter for EventBasedBillingMetricId.
     * The ID of an event based billing metric that will be attached to this component.
     * @return Returns the int
     */
    @JsonGetter("event_based_billing_metric_id")
    public int getEventBasedBillingMetricId() {
        return eventBasedBillingMetricId;
    }

    /**
     * Setter for EventBasedBillingMetricId.
     * The ID of an event based billing metric that will be attached to this component.
     * @param eventBasedBillingMetricId Value for int
     */
    @JsonSetter("event_based_billing_metric_id")
    public void setEventBasedBillingMetricId(int eventBasedBillingMetricId) {
        this.eventBasedBillingMetricId = eventBasedBillingMetricId;
    }

    /**
     * Getter for Interval.
     * The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would
     * mean this component's default price point would renew every 30 days. This property is only
     * available for sites with Multifrequency enabled.
     * @return Returns the Integer
     */
    @JsonGetter("interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would
     * mean this component's default price point would renew every 30 days. This property is only
     * available for sites with Multifrequency enabled.
     * @param interval Value for Integer
     */
    @JsonSetter("interval")
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * Internal Getter for IntervalUnit.
     * A string representing the interval unit for this component's default price point, either
     * month or day. This property is only available for sites with Multifrequency enabled.
     * @return Returns the Internal IntervalUnit
     */
    @JsonGetter("interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<IntervalUnit> internalGetIntervalUnit() {
        return this.intervalUnit;
    }

    /**
     * Getter for IntervalUnit.
     * A string representing the interval unit for this component's default price point, either
     * month or day. This property is only available for sites with Multifrequency enabled.
     * @return Returns the IntervalUnit
     */
    public IntervalUnit getIntervalUnit() {
        return OptionalNullable.getFrom(intervalUnit);
    }

    /**
     * Setter for IntervalUnit.
     * A string representing the interval unit for this component's default price point, either
     * month or day. This property is only available for sites with Multifrequency enabled.
     * @param intervalUnit Value for IntervalUnit
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(IntervalUnit intervalUnit) {
        this.intervalUnit = OptionalNullable.of(intervalUnit);
    }

    /**
     * UnSetter for IntervalUnit.
     * A string representing the interval unit for this component's default price point, either
     * month or day. This property is only available for sites with Multifrequency enabled.
     */
    public void unsetIntervalUnit() {
        intervalUnit = null;
    }

    /**
     * Converts this EBBComponent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EBBComponent [" + "name=" + name + ", unitName=" + unitName + ", pricingScheme="
                + pricingScheme + ", eventBasedBillingMetricId=" + eventBasedBillingMetricId
                + ", description=" + description + ", handle=" + handle + ", taxable=" + taxable
                + ", prices=" + prices + ", pricePoints=" + pricePoints + ", unitPrice=" + unitPrice
                + ", taxCode=" + taxCode + ", hideDateRangeOnInvoice=" + hideDateRangeOnInvoice
                + ", interval=" + interval + ", intervalUnit=" + intervalUnit
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link EBBComponent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EBBComponent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, unitName, pricingScheme, eventBasedBillingMetricId)
                .description(getDescription())
                .handle(getHandle())
                .taxable(getTaxable())
                .prices(getPrices())
                .pricePoints(getPricePoints())
                .unitPrice(getUnitPrice())
                .taxCode(getTaxCode())
                .hideDateRangeOnInvoice(getHideDateRangeOnInvoice())
                .interval(getInterval());
        builder.intervalUnit = internalGetIntervalUnit();
        return builder;
    }

    /**
     * Class to build instances of {@link EBBComponent}.
     */
    public static class Builder {
        private String name;
        private String unitName;
        private PricingScheme pricingScheme;
        private int eventBasedBillingMetricId;
        private String description;
        private String handle;
        private Boolean taxable;
        private List<Price> prices;
        private List<ComponentPricePointItem> pricePoints;
        private EBBComponentUnitPrice unitPrice;
        private String taxCode;
        private Boolean hideDateRangeOnInvoice;
        private Integer interval;
        private OptionalNullable<IntervalUnit> intervalUnit;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  unitName  String value for unitName.
         * @param  pricingScheme  PricingScheme value for pricingScheme.
         * @param  eventBasedBillingMetricId  int value for eventBasedBillingMetricId.
         */
        public Builder(String name, String unitName, PricingScheme pricingScheme,
                int eventBasedBillingMetricId) {
            this.name = name;
            this.unitName = unitName;
            this.pricingScheme = pricingScheme;
            this.eventBasedBillingMetricId = eventBasedBillingMetricId;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for unitName.
         * @param  unitName  String value for unitName.
         * @return Builder
         */
        public Builder unitName(String unitName) {
            this.unitName = unitName;
            return this;
        }

        /**
         * Setter for pricingScheme.
         * @param  pricingScheme  PricingScheme value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(PricingScheme pricingScheme) {
            this.pricingScheme = pricingScheme;
            return this;
        }

        /**
         * Setter for eventBasedBillingMetricId.
         * @param  eventBasedBillingMetricId  int value for eventBasedBillingMetricId.
         * @return Builder
         */
        public Builder eventBasedBillingMetricId(int eventBasedBillingMetricId) {
            this.eventBasedBillingMetricId = eventBasedBillingMetricId;
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
         * Setter for handle.
         * @param  handle  String value for handle.
         * @return Builder
         */
        public Builder handle(String handle) {
            this.handle = handle;
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
         * Setter for prices.
         * @param  prices  List of Price value for prices.
         * @return Builder
         */
        public Builder prices(List<Price> prices) {
            this.prices = prices;
            return this;
        }

        /**
         * Setter for pricePoints.
         * @param  pricePoints  List of ComponentPricePointItem value for pricePoints.
         * @return Builder
         */
        public Builder pricePoints(List<ComponentPricePointItem> pricePoints) {
            this.pricePoints = pricePoints;
            return this;
        }

        /**
         * Setter for unitPrice.
         * @param  unitPrice  EBBComponentUnitPrice value for unitPrice.
         * @return Builder
         */
        public Builder unitPrice(EBBComponentUnitPrice unitPrice) {
            this.unitPrice = unitPrice;
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
         * Setter for hideDateRangeOnInvoice.
         * @param  hideDateRangeOnInvoice  Boolean value for hideDateRangeOnInvoice.
         * @return Builder
         */
        public Builder hideDateRangeOnInvoice(Boolean hideDateRangeOnInvoice) {
            this.hideDateRangeOnInvoice = hideDateRangeOnInvoice;
            return this;
        }

        /**
         * Setter for interval.
         * @param  interval  Integer value for interval.
         * @return Builder
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Setter for intervalUnit.
         * @param  intervalUnit  IntervalUnit value for intervalUnit.
         * @return Builder
         */
        public Builder intervalUnit(IntervalUnit intervalUnit) {
            this.intervalUnit = OptionalNullable.of(intervalUnit);
            return this;
        }

        /**
         * UnSetter for intervalUnit.
         * @return Builder
         */
        public Builder unsetIntervalUnit() {
            intervalUnit = null;
            return this;
        }

        /**
         * Builds a new {@link EBBComponent} object using the set fields.
         * @return {@link EBBComponent}
         */
        public EBBComponent build() {
            return new EBBComponent(name, unitName, pricingScheme, eventBasedBillingMetricId,
                    description, handle, taxable, prices, pricePoints, unitPrice, taxCode,
                    hideDateRangeOnInvoice, interval, intervalUnit);
        }
    }
}
