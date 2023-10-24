/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.PrepaidUsageComponentExpirationIntervalUnit;
import com.maxio.advancedbilling.models.containers.PrepaidUsageComponentPricingScheme;
import com.maxio.advancedbilling.models.containers.PrepaidUsageComponentUnitPrice;
import java.util.List;

/**
 * This is a model class for PrepaidUsageComponent type.
 */
public class PrepaidUsageComponent {
    private String name;
    private String unitName;
    private String description;
    private String handle;
    private Boolean taxable;
    private PrepaidUsageComponentPricingScheme pricingScheme;
    private List<Price> prices;
    private String upgradeCharge;
    private String downgradeCredit;
    private List<PrepaidComponentPricePoint> pricePoints;
    private PrepaidUsageComponentUnitPrice unitPrice;
    private String taxCode;
    private Boolean hideDateRangeOnInvoice;
    private String priceInCents;
    private OveragePricing overagePricing;
    private Boolean rolloverPrepaidRemainder;
    private Boolean renewPrepaidAllocation;
    private Double expirationInterval;
    private PrepaidUsageComponentExpirationIntervalUnit expirationIntervalUnit;
    private Boolean displayOnHostedPage;
    private Boolean allowFractionalQuantities;
    private List<Integer> publicSignupPageIds;

    /**
     * Default constructor.
     */
    public PrepaidUsageComponent() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  unitName  String value for unitName.
     * @param  description  String value for description.
     * @param  handle  String value for handle.
     * @param  taxable  Boolean value for taxable.
     * @param  pricingScheme  PrepaidUsageComponentPricingScheme value for pricingScheme.
     * @param  prices  List of Price value for prices.
     * @param  upgradeCharge  String value for upgradeCharge.
     * @param  downgradeCredit  String value for downgradeCredit.
     * @param  pricePoints  List of PrepaidComponentPricePoint value for pricePoints.
     * @param  unitPrice  PrepaidUsageComponentUnitPrice value for unitPrice.
     * @param  taxCode  String value for taxCode.
     * @param  hideDateRangeOnInvoice  Boolean value for hideDateRangeOnInvoice.
     * @param  priceInCents  String value for priceInCents.
     * @param  overagePricing  OveragePricing value for overagePricing.
     * @param  rolloverPrepaidRemainder  Boolean value for rolloverPrepaidRemainder.
     * @param  renewPrepaidAllocation  Boolean value for renewPrepaidAllocation.
     * @param  expirationInterval  Double value for expirationInterval.
     * @param  expirationIntervalUnit  PrepaidUsageComponentExpirationIntervalUnit value for
     *         expirationIntervalUnit.
     * @param  displayOnHostedPage  Boolean value for displayOnHostedPage.
     * @param  allowFractionalQuantities  Boolean value for allowFractionalQuantities.
     * @param  publicSignupPageIds  List of Integer value for publicSignupPageIds.
     */
    public PrepaidUsageComponent(
            String name,
            String unitName,
            String description,
            String handle,
            Boolean taxable,
            PrepaidUsageComponentPricingScheme pricingScheme,
            List<Price> prices,
            String upgradeCharge,
            String downgradeCredit,
            List<PrepaidComponentPricePoint> pricePoints,
            PrepaidUsageComponentUnitPrice unitPrice,
            String taxCode,
            Boolean hideDateRangeOnInvoice,
            String priceInCents,
            OveragePricing overagePricing,
            Boolean rolloverPrepaidRemainder,
            Boolean renewPrepaidAllocation,
            Double expirationInterval,
            PrepaidUsageComponentExpirationIntervalUnit expirationIntervalUnit,
            Boolean displayOnHostedPage,
            Boolean allowFractionalQuantities,
            List<Integer> publicSignupPageIds) {
        this.name = name;
        this.unitName = unitName;
        this.description = description;
        this.handle = handle;
        this.taxable = taxable;
        this.pricingScheme = pricingScheme;
        this.prices = prices;
        this.upgradeCharge = upgradeCharge;
        this.downgradeCredit = downgradeCredit;
        this.pricePoints = pricePoints;
        this.unitPrice = unitPrice;
        this.taxCode = taxCode;
        this.hideDateRangeOnInvoice = hideDateRangeOnInvoice;
        this.priceInCents = priceInCents;
        this.overagePricing = overagePricing;
        this.rolloverPrepaidRemainder = rolloverPrepaidRemainder;
        this.renewPrepaidAllocation = renewPrepaidAllocation;
        this.expirationInterval = expirationInterval;
        this.expirationIntervalUnit = expirationIntervalUnit;
        this.displayOnHostedPage = displayOnHostedPage;
        this.allowFractionalQuantities = allowFractionalQuantities;
        this.publicSignupPageIds = publicSignupPageIds;
    }

    /**
     * Getter for Name.
     * A name for this component that is suitable for showing customers and displaying on billing
     * statements, ie. "Minutes".
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * @return Returns the PrepaidUsageComponentPricingScheme
     */
    @JsonGetter("pricing_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PrepaidUsageComponentPricingScheme getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * The identifier for the pricing scheme. See [Product
     * Components](https://help.chargify.com/products/product-components.html) for an overview of
     * pricing schemes.
     * @param pricingScheme Value for PrepaidUsageComponentPricingScheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(PrepaidUsageComponentPricingScheme pricingScheme) {
        this.pricingScheme = pricingScheme;
    }

    /**
     * Getter for Prices.
     * (Not required for ‘per_unit’ pricing schemes) One or more price brackets. See [Price Bracket
     * Rules](https://chargify.zendesk.com/hc/en-us/articles/4407755865883#general-price-bracket-rules)
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
     * Rules](https://chargify.zendesk.com/hc/en-us/articles/4407755865883#general-price-bracket-rules)
     * for an overview of how price brackets work for different pricing schemes.
     * @param prices Value for List of Price
     */
    @JsonSetter("prices")
    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    /**
     * Getter for UpgradeCharge.
     * @return Returns the String
     */
    @JsonGetter("upgrade_charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpgradeCharge() {
        return upgradeCharge;
    }

    /**
     * Setter for UpgradeCharge.
     * @param upgradeCharge Value for String
     */
    @JsonSetter("upgrade_charge")
    public void setUpgradeCharge(String upgradeCharge) {
        this.upgradeCharge = upgradeCharge;
    }

    /**
     * Getter for DowngradeCredit.
     * @return Returns the String
     */
    @JsonGetter("downgrade_credit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDowngradeCredit() {
        return downgradeCredit;
    }

    /**
     * Setter for DowngradeCredit.
     * @param downgradeCredit Value for String
     */
    @JsonSetter("downgrade_credit")
    public void setDowngradeCredit(String downgradeCredit) {
        this.downgradeCredit = downgradeCredit;
    }

    /**
     * Getter for PricePoints.
     * @return Returns the List of PrepaidComponentPricePoint
     */
    @JsonGetter("price_points")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PrepaidComponentPricePoint> getPricePoints() {
        return pricePoints;
    }

    /**
     * Setter for PricePoints.
     * @param pricePoints Value for List of PrepaidComponentPricePoint
     */
    @JsonSetter("price_points")
    public void setPricePoints(List<PrepaidComponentPricePoint> pricePoints) {
        this.pricePoints = pricePoints;
    }

    /**
     * Getter for UnitPrice.
     * The amount the customer will be charged per unit when the pricing scheme is “per_unit”. For
     * On/Off Components, this is the amount that the customer will be charged when they turn the
     * component on for the subscription. The price can contain up to 8 decimal places. i.e. 1.00 or
     * 0.0012 or 0.00000065
     * @return Returns the PrepaidUsageComponentUnitPrice
     */
    @JsonGetter("unit_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PrepaidUsageComponentUnitPrice getUnitPrice() {
        return unitPrice;
    }

    /**
     * Setter for UnitPrice.
     * The amount the customer will be charged per unit when the pricing scheme is “per_unit”. For
     * On/Off Components, this is the amount that the customer will be charged when they turn the
     * component on for the subscription. The price can contain up to 8 decimal places. i.e. 1.00 or
     * 0.0012 or 0.00000065
     * @param unitPrice Value for PrepaidUsageComponentUnitPrice
     */
    @JsonSetter("unit_price")
    public void setUnitPrice(PrepaidUsageComponentUnitPrice unitPrice) {
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
     * Getter for PriceInCents.
     * deprecated May 2011 - use unit_price instead
     * @return Returns the String
     */
    @JsonGetter("price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPriceInCents() {
        return priceInCents;
    }

    /**
     * Setter for PriceInCents.
     * deprecated May 2011 - use unit_price instead
     * @param priceInCents Value for String
     */
    @JsonSetter("price_in_cents")
    public void setPriceInCents(String priceInCents) {
        this.priceInCents = priceInCents;
    }

    /**
     * Getter for OveragePricing.
     * @return Returns the OveragePricing
     */
    @JsonGetter("overage_pricing")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OveragePricing getOveragePricing() {
        return overagePricing;
    }

    /**
     * Setter for OveragePricing.
     * @param overagePricing Value for OveragePricing
     */
    @JsonSetter("overage_pricing")
    public void setOveragePricing(OveragePricing overagePricing) {
        this.overagePricing = overagePricing;
    }

    /**
     * Getter for RolloverPrepaidRemainder.
     * Boolean which controls whether or not remaining units should be rolled over to the next
     * period
     * @return Returns the Boolean
     */
    @JsonGetter("rollover_prepaid_remainder")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRolloverPrepaidRemainder() {
        return rolloverPrepaidRemainder;
    }

    /**
     * Setter for RolloverPrepaidRemainder.
     * Boolean which controls whether or not remaining units should be rolled over to the next
     * period
     * @param rolloverPrepaidRemainder Value for Boolean
     */
    @JsonSetter("rollover_prepaid_remainder")
    public void setRolloverPrepaidRemainder(Boolean rolloverPrepaidRemainder) {
        this.rolloverPrepaidRemainder = rolloverPrepaidRemainder;
    }

    /**
     * Getter for RenewPrepaidAllocation.
     * Boolean which controls whether or not the allocated quantity should be renewed at the
     * beginning of each period
     * @return Returns the Boolean
     */
    @JsonGetter("renew_prepaid_allocation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRenewPrepaidAllocation() {
        return renewPrepaidAllocation;
    }

    /**
     * Setter for RenewPrepaidAllocation.
     * Boolean which controls whether or not the allocated quantity should be renewed at the
     * beginning of each period
     * @param renewPrepaidAllocation Value for Boolean
     */
    @JsonSetter("renew_prepaid_allocation")
    public void setRenewPrepaidAllocation(Boolean renewPrepaidAllocation) {
        this.renewPrepaidAllocation = renewPrepaidAllocation;
    }

    /**
     * Getter for ExpirationInterval.
     * (only for prepaid usage components where rollover_prepaid_remainder is true) The number of
     * `expiration_interval_unit`s after which rollover amounts should expire
     * @return Returns the Double
     */
    @JsonGetter("expiration_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getExpirationInterval() {
        return expirationInterval;
    }

    /**
     * Setter for ExpirationInterval.
     * (only for prepaid usage components where rollover_prepaid_remainder is true) The number of
     * `expiration_interval_unit`s after which rollover amounts should expire
     * @param expirationInterval Value for Double
     */
    @JsonSetter("expiration_interval")
    public void setExpirationInterval(Double expirationInterval) {
        this.expirationInterval = expirationInterval;
    }

    /**
     * Getter for ExpirationIntervalUnit.
     * @return Returns the PrepaidUsageComponentExpirationIntervalUnit
     */
    @JsonGetter("expiration_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PrepaidUsageComponentExpirationIntervalUnit getExpirationIntervalUnit() {
        return expirationIntervalUnit;
    }

    /**
     * Setter for ExpirationIntervalUnit.
     * @param expirationIntervalUnit Value for PrepaidUsageComponentExpirationIntervalUnit
     */
    @JsonSetter("expiration_interval_unit")
    public void setExpirationIntervalUnit(PrepaidUsageComponentExpirationIntervalUnit expirationIntervalUnit) {
        this.expirationIntervalUnit = expirationIntervalUnit;
    }

    /**
     * Getter for DisplayOnHostedPage.
     * @return Returns the Boolean
     */
    @JsonGetter("display_on_hosted_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDisplayOnHostedPage() {
        return displayOnHostedPage;
    }

    /**
     * Setter for DisplayOnHostedPage.
     * @param displayOnHostedPage Value for Boolean
     */
    @JsonSetter("display_on_hosted_page")
    public void setDisplayOnHostedPage(Boolean displayOnHostedPage) {
        this.displayOnHostedPage = displayOnHostedPage;
    }

    /**
     * Getter for AllowFractionalQuantities.
     * @return Returns the Boolean
     */
    @JsonGetter("allow_fractional_quantities")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAllowFractionalQuantities() {
        return allowFractionalQuantities;
    }

    /**
     * Setter for AllowFractionalQuantities.
     * @param allowFractionalQuantities Value for Boolean
     */
    @JsonSetter("allow_fractional_quantities")
    public void setAllowFractionalQuantities(Boolean allowFractionalQuantities) {
        this.allowFractionalQuantities = allowFractionalQuantities;
    }

    /**
     * Getter for PublicSignupPageIds.
     * @return Returns the List of Integer
     */
    @JsonGetter("public_signup_page_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getPublicSignupPageIds() {
        return publicSignupPageIds;
    }

    /**
     * Setter for PublicSignupPageIds.
     * @param publicSignupPageIds Value for List of Integer
     */
    @JsonSetter("public_signup_page_ids")
    public void setPublicSignupPageIds(List<Integer> publicSignupPageIds) {
        this.publicSignupPageIds = publicSignupPageIds;
    }

    /**
     * Converts this PrepaidUsageComponent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrepaidUsageComponent [" + "name=" + name + ", unitName=" + unitName
                + ", description=" + description + ", handle=" + handle + ", taxable=" + taxable
                + ", pricingScheme=" + pricingScheme + ", prices=" + prices + ", upgradeCharge="
                + upgradeCharge + ", downgradeCredit=" + downgradeCredit + ", pricePoints="
                + pricePoints + ", unitPrice=" + unitPrice + ", taxCode=" + taxCode
                + ", hideDateRangeOnInvoice=" + hideDateRangeOnInvoice + ", priceInCents="
                + priceInCents + ", overagePricing=" + overagePricing
                + ", rolloverPrepaidRemainder=" + rolloverPrepaidRemainder
                + ", renewPrepaidAllocation=" + renewPrepaidAllocation + ", expirationInterval="
                + expirationInterval + ", expirationIntervalUnit=" + expirationIntervalUnit
                + ", displayOnHostedPage=" + displayOnHostedPage + ", allowFractionalQuantities="
                + allowFractionalQuantities + ", publicSignupPageIds=" + publicSignupPageIds + "]";
    }

    /**
     * Builds a new {@link PrepaidUsageComponent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrepaidUsageComponent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .unitName(getUnitName())
                .description(getDescription())
                .handle(getHandle())
                .taxable(getTaxable())
                .pricingScheme(getPricingScheme())
                .prices(getPrices())
                .upgradeCharge(getUpgradeCharge())
                .downgradeCredit(getDowngradeCredit())
                .pricePoints(getPricePoints())
                .unitPrice(getUnitPrice())
                .taxCode(getTaxCode())
                .hideDateRangeOnInvoice(getHideDateRangeOnInvoice())
                .priceInCents(getPriceInCents())
                .overagePricing(getOveragePricing())
                .rolloverPrepaidRemainder(getRolloverPrepaidRemainder())
                .renewPrepaidAllocation(getRenewPrepaidAllocation())
                .expirationInterval(getExpirationInterval())
                .expirationIntervalUnit(getExpirationIntervalUnit())
                .displayOnHostedPage(getDisplayOnHostedPage())
                .allowFractionalQuantities(getAllowFractionalQuantities())
                .publicSignupPageIds(getPublicSignupPageIds());
        return builder;
    }

    /**
     * Class to build instances of {@link PrepaidUsageComponent}.
     */
    public static class Builder {
        private String name;
        private String unitName;
        private String description;
        private String handle;
        private Boolean taxable;
        private PrepaidUsageComponentPricingScheme pricingScheme;
        private List<Price> prices;
        private String upgradeCharge;
        private String downgradeCredit;
        private List<PrepaidComponentPricePoint> pricePoints;
        private PrepaidUsageComponentUnitPrice unitPrice;
        private String taxCode;
        private Boolean hideDateRangeOnInvoice;
        private String priceInCents;
        private OveragePricing overagePricing;
        private Boolean rolloverPrepaidRemainder;
        private Boolean renewPrepaidAllocation;
        private Double expirationInterval;
        private PrepaidUsageComponentExpirationIntervalUnit expirationIntervalUnit;
        private Boolean displayOnHostedPage;
        private Boolean allowFractionalQuantities;
        private List<Integer> publicSignupPageIds;



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
         * Setter for pricingScheme.
         * @param  pricingScheme  PrepaidUsageComponentPricingScheme value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(PrepaidUsageComponentPricingScheme pricingScheme) {
            this.pricingScheme = pricingScheme;
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
         * Setter for upgradeCharge.
         * @param  upgradeCharge  String value for upgradeCharge.
         * @return Builder
         */
        public Builder upgradeCharge(String upgradeCharge) {
            this.upgradeCharge = upgradeCharge;
            return this;
        }

        /**
         * Setter for downgradeCredit.
         * @param  downgradeCredit  String value for downgradeCredit.
         * @return Builder
         */
        public Builder downgradeCredit(String downgradeCredit) {
            this.downgradeCredit = downgradeCredit;
            return this;
        }

        /**
         * Setter for pricePoints.
         * @param  pricePoints  List of PrepaidComponentPricePoint value for pricePoints.
         * @return Builder
         */
        public Builder pricePoints(List<PrepaidComponentPricePoint> pricePoints) {
            this.pricePoints = pricePoints;
            return this;
        }

        /**
         * Setter for unitPrice.
         * @param  unitPrice  PrepaidUsageComponentUnitPrice value for unitPrice.
         * @return Builder
         */
        public Builder unitPrice(PrepaidUsageComponentUnitPrice unitPrice) {
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
         * Setter for priceInCents.
         * @param  priceInCents  String value for priceInCents.
         * @return Builder
         */
        public Builder priceInCents(String priceInCents) {
            this.priceInCents = priceInCents;
            return this;
        }

        /**
         * Setter for overagePricing.
         * @param  overagePricing  OveragePricing value for overagePricing.
         * @return Builder
         */
        public Builder overagePricing(OveragePricing overagePricing) {
            this.overagePricing = overagePricing;
            return this;
        }

        /**
         * Setter for rolloverPrepaidRemainder.
         * @param  rolloverPrepaidRemainder  Boolean value for rolloverPrepaidRemainder.
         * @return Builder
         */
        public Builder rolloverPrepaidRemainder(Boolean rolloverPrepaidRemainder) {
            this.rolloverPrepaidRemainder = rolloverPrepaidRemainder;
            return this;
        }

        /**
         * Setter for renewPrepaidAllocation.
         * @param  renewPrepaidAllocation  Boolean value for renewPrepaidAllocation.
         * @return Builder
         */
        public Builder renewPrepaidAllocation(Boolean renewPrepaidAllocation) {
            this.renewPrepaidAllocation = renewPrepaidAllocation;
            return this;
        }

        /**
         * Setter for expirationInterval.
         * @param  expirationInterval  Double value for expirationInterval.
         * @return Builder
         */
        public Builder expirationInterval(Double expirationInterval) {
            this.expirationInterval = expirationInterval;
            return this;
        }

        /**
         * Setter for expirationIntervalUnit.
         * @param  expirationIntervalUnit  PrepaidUsageComponentExpirationIntervalUnit value for
         *         expirationIntervalUnit.
         * @return Builder
         */
        public Builder expirationIntervalUnit(
                PrepaidUsageComponentExpirationIntervalUnit expirationIntervalUnit) {
            this.expirationIntervalUnit = expirationIntervalUnit;
            return this;
        }

        /**
         * Setter for displayOnHostedPage.
         * @param  displayOnHostedPage  Boolean value for displayOnHostedPage.
         * @return Builder
         */
        public Builder displayOnHostedPage(Boolean displayOnHostedPage) {
            this.displayOnHostedPage = displayOnHostedPage;
            return this;
        }

        /**
         * Setter for allowFractionalQuantities.
         * @param  allowFractionalQuantities  Boolean value for allowFractionalQuantities.
         * @return Builder
         */
        public Builder allowFractionalQuantities(Boolean allowFractionalQuantities) {
            this.allowFractionalQuantities = allowFractionalQuantities;
            return this;
        }

        /**
         * Setter for publicSignupPageIds.
         * @param  publicSignupPageIds  List of Integer value for publicSignupPageIds.
         * @return Builder
         */
        public Builder publicSignupPageIds(List<Integer> publicSignupPageIds) {
            this.publicSignupPageIds = publicSignupPageIds;
            return this;
        }

        /**
         * Builds a new {@link PrepaidUsageComponent} object using the set fields.
         * @return {@link PrepaidUsageComponent}
         */
        public PrepaidUsageComponent build() {
            return new PrepaidUsageComponent(name, unitName, description, handle, taxable,
                    pricingScheme, prices, upgradeCharge, downgradeCredit, pricePoints, unitPrice,
                    taxCode, hideDateRangeOnInvoice, priceInCents, overagePricing,
                    rolloverPrepaidRemainder, renewPrepaidAllocation, expirationInterval,
                    expirationIntervalUnit, displayOnHostedPage, allowFractionalQuantities,
                    publicSignupPageIds);
        }
    }
}
