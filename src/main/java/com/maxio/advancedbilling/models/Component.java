/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * This is a model class for Component type.
 */
public class Component
        extends BaseModel {
    private Integer id;
    private String name;
    private OptionalNullable<String> handle;
    private OptionalNullable<PricingScheme> pricingScheme;
    private String unitName;
    private OptionalNullable<String> unitPrice;
    private Integer productFamilyId;
    private String productFamilyName;
    private OptionalNullable<Long> pricePerUnitInCents;
    private ComponentKind kind;
    private Boolean archived;
    private Boolean taxable;
    private OptionalNullable<String> description;
    private OptionalNullable<Integer> defaultPricePointId;
    private OptionalNullable<List<ComponentPrice>> overagePrices;
    private OptionalNullable<List<ComponentPrice>> prices;
    private Integer pricePointCount;
    private OptionalNullable<String> pricePointsUrl;
    private String defaultPricePointName;
    private OptionalNullable<String> taxCode;
    private Boolean recurring;
    private OptionalNullable<CreditType> upgradeCharge;
    private OptionalNullable<CreditType> downgradeCredit;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
    private OptionalNullable<ZonedDateTime> archivedAt;
    private Boolean hideDateRangeOnInvoice;
    private Boolean allowFractionalQuantities;
    private OptionalNullable<ItemCategory> itemCategory;
    private OptionalNullable<Boolean> useSiteExchangeRate;
    private OptionalNullable<String> accountingCode;
    private Integer eventBasedBillingMetricId;
    private Integer interval;
    private OptionalNullable<IntervalUnit> intervalUnit;

    /**
     * Default constructor.
     */
    public Component() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  unitName  String value for unitName.
     * @param  unitPrice  String value for unitPrice.
     * @param  productFamilyId  Integer value for productFamilyId.
     * @param  productFamilyName  String value for productFamilyName.
     * @param  pricePerUnitInCents  Long value for pricePerUnitInCents.
     * @param  kind  ComponentKind value for kind.
     * @param  archived  Boolean value for archived.
     * @param  taxable  Boolean value for taxable.
     * @param  description  String value for description.
     * @param  defaultPricePointId  Integer value for defaultPricePointId.
     * @param  overagePrices  List of ComponentPrice value for overagePrices.
     * @param  prices  List of ComponentPrice value for prices.
     * @param  pricePointCount  Integer value for pricePointCount.
     * @param  pricePointsUrl  String value for pricePointsUrl.
     * @param  defaultPricePointName  String value for defaultPricePointName.
     * @param  taxCode  String value for taxCode.
     * @param  recurring  Boolean value for recurring.
     * @param  upgradeCharge  CreditType value for upgradeCharge.
     * @param  downgradeCredit  CreditType value for downgradeCredit.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     * @param  archivedAt  ZonedDateTime value for archivedAt.
     * @param  hideDateRangeOnInvoice  Boolean value for hideDateRangeOnInvoice.
     * @param  allowFractionalQuantities  Boolean value for allowFractionalQuantities.
     * @param  itemCategory  ItemCategory value for itemCategory.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  accountingCode  String value for accountingCode.
     * @param  eventBasedBillingMetricId  Integer value for eventBasedBillingMetricId.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     */
    public Component(
            Integer id,
            String name,
            String handle,
            PricingScheme pricingScheme,
            String unitName,
            String unitPrice,
            Integer productFamilyId,
            String productFamilyName,
            Long pricePerUnitInCents,
            ComponentKind kind,
            Boolean archived,
            Boolean taxable,
            String description,
            Integer defaultPricePointId,
            List<ComponentPrice> overagePrices,
            List<ComponentPrice> prices,
            Integer pricePointCount,
            String pricePointsUrl,
            String defaultPricePointName,
            String taxCode,
            Boolean recurring,
            CreditType upgradeCharge,
            CreditType downgradeCredit,
            ZonedDateTime createdAt,
            ZonedDateTime updatedAt,
            ZonedDateTime archivedAt,
            Boolean hideDateRangeOnInvoice,
            Boolean allowFractionalQuantities,
            ItemCategory itemCategory,
            Boolean useSiteExchangeRate,
            String accountingCode,
            Integer eventBasedBillingMetricId,
            Integer interval,
            IntervalUnit intervalUnit) {
        this.id = id;
        this.name = name;
        this.handle = OptionalNullable.of(handle);
        this.pricingScheme = OptionalNullable.of(pricingScheme);
        this.unitName = unitName;
        this.unitPrice = OptionalNullable.of(unitPrice);
        this.productFamilyId = productFamilyId;
        this.productFamilyName = productFamilyName;
        this.pricePerUnitInCents = OptionalNullable.of(pricePerUnitInCents);
        this.kind = kind;
        this.archived = archived;
        this.taxable = taxable;
        this.description = OptionalNullable.of(description);
        this.defaultPricePointId = OptionalNullable.of(defaultPricePointId);
        this.overagePrices = OptionalNullable.of(overagePrices);
        this.prices = OptionalNullable.of(prices);
        this.pricePointCount = pricePointCount;
        this.pricePointsUrl = OptionalNullable.of(pricePointsUrl);
        this.defaultPricePointName = defaultPricePointName;
        this.taxCode = OptionalNullable.of(taxCode);
        this.recurring = recurring;
        this.upgradeCharge = OptionalNullable.of(upgradeCharge);
        this.downgradeCredit = OptionalNullable.of(downgradeCredit);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.archivedAt = OptionalNullable.of(archivedAt);
        this.hideDateRangeOnInvoice = hideDateRangeOnInvoice;
        this.allowFractionalQuantities = allowFractionalQuantities;
        this.itemCategory = OptionalNullable.of(itemCategory);
        this.useSiteExchangeRate = OptionalNullable.of(useSiteExchangeRate);
        this.accountingCode = OptionalNullable.of(accountingCode);
        this.eventBasedBillingMetricId = eventBasedBillingMetricId;
        this.interval = interval;
        this.intervalUnit = OptionalNullable.of(intervalUnit);
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  pricingScheme  PricingScheme value for pricingScheme.
     * @param  unitName  String value for unitName.
     * @param  unitPrice  String value for unitPrice.
     * @param  productFamilyId  Integer value for productFamilyId.
     * @param  productFamilyName  String value for productFamilyName.
     * @param  pricePerUnitInCents  Long value for pricePerUnitInCents.
     * @param  kind  ComponentKind value for kind.
     * @param  archived  Boolean value for archived.
     * @param  taxable  Boolean value for taxable.
     * @param  description  String value for description.
     * @param  defaultPricePointId  Integer value for defaultPricePointId.
     * @param  overagePrices  List of ComponentPrice value for overagePrices.
     * @param  prices  List of ComponentPrice value for prices.
     * @param  pricePointCount  Integer value for pricePointCount.
     * @param  pricePointsUrl  String value for pricePointsUrl.
     * @param  defaultPricePointName  String value for defaultPricePointName.
     * @param  taxCode  String value for taxCode.
     * @param  recurring  Boolean value for recurring.
     * @param  upgradeCharge  CreditType value for upgradeCharge.
     * @param  downgradeCredit  CreditType value for downgradeCredit.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     * @param  archivedAt  ZonedDateTime value for archivedAt.
     * @param  hideDateRangeOnInvoice  Boolean value for hideDateRangeOnInvoice.
     * @param  allowFractionalQuantities  Boolean value for allowFractionalQuantities.
     * @param  itemCategory  ItemCategory value for itemCategory.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  accountingCode  String value for accountingCode.
     * @param  eventBasedBillingMetricId  Integer value for eventBasedBillingMetricId.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  IntervalUnit value for intervalUnit.
     */

    protected Component(Integer id, String name, OptionalNullable<String> handle,
            OptionalNullable<PricingScheme> pricingScheme, String unitName,
            OptionalNullable<String> unitPrice, Integer productFamilyId, String productFamilyName,
            OptionalNullable<Long> pricePerUnitInCents, ComponentKind kind, Boolean archived,
            Boolean taxable, OptionalNullable<String> description,
            OptionalNullable<Integer> defaultPricePointId,
            OptionalNullable<List<ComponentPrice>> overagePrices,
            OptionalNullable<List<ComponentPrice>> prices, Integer pricePointCount,
            OptionalNullable<String> pricePointsUrl, String defaultPricePointName,
            OptionalNullable<String> taxCode, Boolean recurring,
            OptionalNullable<CreditType> upgradeCharge,
            OptionalNullable<CreditType> downgradeCredit, ZonedDateTime createdAt,
            ZonedDateTime updatedAt, OptionalNullable<ZonedDateTime> archivedAt,
            Boolean hideDateRangeOnInvoice, Boolean allowFractionalQuantities,
            OptionalNullable<ItemCategory> itemCategory,
            OptionalNullable<Boolean> useSiteExchangeRate, OptionalNullable<String> accountingCode,
            Integer eventBasedBillingMetricId, Integer interval,
            OptionalNullable<IntervalUnit> intervalUnit) {
        this.id = id;
        this.name = name;
        this.handle = handle;
        this.pricingScheme = pricingScheme;
        this.unitName = unitName;
        this.unitPrice = unitPrice;
        this.productFamilyId = productFamilyId;
        this.productFamilyName = productFamilyName;
        this.pricePerUnitInCents = pricePerUnitInCents;
        this.kind = kind;
        this.archived = archived;
        this.taxable = taxable;
        this.description = description;
        this.defaultPricePointId = defaultPricePointId;
        this.overagePrices = overagePrices;
        this.prices = prices;
        this.pricePointCount = pricePointCount;
        this.pricePointsUrl = pricePointsUrl;
        this.defaultPricePointName = defaultPricePointName;
        this.taxCode = taxCode;
        this.recurring = recurring;
        this.upgradeCharge = upgradeCharge;
        this.downgradeCredit = downgradeCredit;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.archivedAt = archivedAt;
        this.hideDateRangeOnInvoice = hideDateRangeOnInvoice;
        this.allowFractionalQuantities = allowFractionalQuantities;
        this.itemCategory = itemCategory;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.accountingCode = accountingCode;
        this.eventBasedBillingMetricId = eventBasedBillingMetricId;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
    }

    /**
     * Getter for Id.
     * The unique ID assigned to the component by Chargify. This ID can be used to fetch the
     * component from the API.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The unique ID assigned to the component by Chargify. This ID can be used to fetch the
     * component from the API.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * The name of the Component, suitable for display on statements. i.e. Text Messages.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the Component, suitable for display on statements. i.e. Text Messages.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Internal Getter for Handle.
     * The component API handle
     * @return Returns the Internal String
     */
    @JsonGetter("handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetHandle() {
        return this.handle;
    }

    /**
     * Getter for Handle.
     * The component API handle
     * @return Returns the String
     */
    public String getHandle() {
        return OptionalNullable.getFrom(handle);
    }

    /**
     * Setter for Handle.
     * The component API handle
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = OptionalNullable.of(handle);
    }

    /**
     * UnSetter for Handle.
     * The component API handle
     */
    public void unsetHandle() {
        handle = null;
    }

    /**
     * Internal Getter for PricingScheme.
     * @return Returns the Internal PricingScheme
     */
    @JsonGetter("pricing_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<PricingScheme> internalGetPricingScheme() {
        return this.pricingScheme;
    }

    /**
     * Getter for PricingScheme.
     * @return Returns the PricingScheme
     */
    public PricingScheme getPricingScheme() {
        return OptionalNullable.getFrom(pricingScheme);
    }

    /**
     * Setter for PricingScheme.
     * @param pricingScheme Value for PricingScheme
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(PricingScheme pricingScheme) {
        this.pricingScheme = OptionalNullable.of(pricingScheme);
    }

    /**
     * UnSetter for PricingScheme.
     */
    public void unsetPricingScheme() {
        pricingScheme = null;
    }

    /**
     * Getter for UnitName.
     * The name of the unit that the component’s usage is measured in. i.e. message
     * @return Returns the String
     */
    @JsonGetter("unit_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUnitName() {
        return unitName;
    }

    /**
     * Setter for UnitName.
     * The name of the unit that the component’s usage is measured in. i.e. message
     * @param unitName Value for String
     */
    @JsonSetter("unit_name")
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /**
     * Internal Getter for UnitPrice.
     * The amount the customer will be charged per unit. This field is only populated for ‘per_unit’
     * pricing schemes, otherwise it may be null.
     * @return Returns the Internal String
     */
    @JsonGetter("unit_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetUnitPrice() {
        return this.unitPrice;
    }

    /**
     * Getter for UnitPrice.
     * The amount the customer will be charged per unit. This field is only populated for ‘per_unit’
     * pricing schemes, otherwise it may be null.
     * @return Returns the String
     */
    public String getUnitPrice() {
        return OptionalNullable.getFrom(unitPrice);
    }

    /**
     * Setter for UnitPrice.
     * The amount the customer will be charged per unit. This field is only populated for ‘per_unit’
     * pricing schemes, otherwise it may be null.
     * @param unitPrice Value for String
     */
    @JsonSetter("unit_price")
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = OptionalNullable.of(unitPrice);
    }

    /**
     * UnSetter for UnitPrice.
     * The amount the customer will be charged per unit. This field is only populated for ‘per_unit’
     * pricing schemes, otherwise it may be null.
     */
    public void unsetUnitPrice() {
        unitPrice = null;
    }

    /**
     * Getter for ProductFamilyId.
     * The id of the Product Family to which the Component belongs
     * @return Returns the Integer
     */
    @JsonGetter("product_family_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductFamilyId() {
        return productFamilyId;
    }

    /**
     * Setter for ProductFamilyId.
     * The id of the Product Family to which the Component belongs
     * @param productFamilyId Value for Integer
     */
    @JsonSetter("product_family_id")
    public void setProductFamilyId(Integer productFamilyId) {
        this.productFamilyId = productFamilyId;
    }

    /**
     * Getter for ProductFamilyName.
     * The name of the Product Family to which the Component belongs
     * @return Returns the String
     */
    @JsonGetter("product_family_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductFamilyName() {
        return productFamilyName;
    }

    /**
     * Setter for ProductFamilyName.
     * The name of the Product Family to which the Component belongs
     * @param productFamilyName Value for String
     */
    @JsonSetter("product_family_name")
    public void setProductFamilyName(String productFamilyName) {
        this.productFamilyName = productFamilyName;
    }

    /**
     * Internal Getter for PricePerUnitInCents.
     * deprecated - use unit_price instead
     * @return Returns the Internal Long
     */
    @JsonGetter("price_per_unit_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Long> internalGetPricePerUnitInCents() {
        return this.pricePerUnitInCents;
    }

    /**
     * Getter for PricePerUnitInCents.
     * deprecated - use unit_price instead
     * @return Returns the Long
     */
    public Long getPricePerUnitInCents() {
        return OptionalNullable.getFrom(pricePerUnitInCents);
    }

    /**
     * Setter for PricePerUnitInCents.
     * deprecated - use unit_price instead
     * @param pricePerUnitInCents Value for Long
     */
    @JsonSetter("price_per_unit_in_cents")
    public void setPricePerUnitInCents(Long pricePerUnitInCents) {
        this.pricePerUnitInCents = OptionalNullable.of(pricePerUnitInCents);
    }

    /**
     * UnSetter for PricePerUnitInCents.
     * deprecated - use unit_price instead
     */
    public void unsetPricePerUnitInCents() {
        pricePerUnitInCents = null;
    }

    /**
     * Getter for Kind.
     * A handle for the component type
     * @return Returns the ComponentKind
     */
    @JsonGetter("kind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ComponentKind getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * A handle for the component type
     * @param kind Value for ComponentKind
     */
    @JsonSetter("kind")
    public void setKind(ComponentKind kind) {
        this.kind = kind;
    }

    /**
     * Getter for Archived.
     * Boolean flag describing whether a component is archived or not.
     * @return Returns the Boolean
     */
    @JsonGetter("archived")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getArchived() {
        return archived;
    }

    /**
     * Setter for Archived.
     * Boolean flag describing whether a component is archived or not.
     * @param archived Value for Boolean
     */
    @JsonSetter("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
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
     * Internal Getter for Description.
     * The description of the component.
     * @return Returns the Internal String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescription() {
        return this.description;
    }

    /**
     * Getter for Description.
     * The description of the component.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * The description of the component.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     * The description of the component.
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Internal Getter for DefaultPricePointId.
     * @return Returns the Internal Integer
     */
    @JsonGetter("default_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetDefaultPricePointId() {
        return this.defaultPricePointId;
    }

    /**
     * Getter for DefaultPricePointId.
     * @return Returns the Integer
     */
    public Integer getDefaultPricePointId() {
        return OptionalNullable.getFrom(defaultPricePointId);
    }

    /**
     * Setter for DefaultPricePointId.
     * @param defaultPricePointId Value for Integer
     */
    @JsonSetter("default_price_point_id")
    public void setDefaultPricePointId(Integer defaultPricePointId) {
        this.defaultPricePointId = OptionalNullable.of(defaultPricePointId);
    }

    /**
     * UnSetter for DefaultPricePointId.
     */
    public void unsetDefaultPricePointId() {
        defaultPricePointId = null;
    }

    /**
     * Internal Getter for OveragePrices.
     * An array of price brackets. If the component uses the ‘per_unit’ pricing scheme, this array
     * will be empty.
     * @return Returns the Internal List of ComponentPrice
     */
    @JsonGetter("overage_prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<ComponentPrice>> internalGetOveragePrices() {
        return this.overagePrices;
    }

    /**
     * Getter for OveragePrices.
     * An array of price brackets. If the component uses the ‘per_unit’ pricing scheme, this array
     * will be empty.
     * @return Returns the List of ComponentPrice
     */
    public List<ComponentPrice> getOveragePrices() {
        return OptionalNullable.getFrom(overagePrices);
    }

    /**
     * Setter for OveragePrices.
     * An array of price brackets. If the component uses the ‘per_unit’ pricing scheme, this array
     * will be empty.
     * @param overagePrices Value for List of ComponentPrice
     */
    @JsonSetter("overage_prices")
    public void setOveragePrices(List<ComponentPrice> overagePrices) {
        this.overagePrices = OptionalNullable.of(overagePrices);
    }

    /**
     * UnSetter for OveragePrices.
     * An array of price brackets. If the component uses the ‘per_unit’ pricing scheme, this array
     * will be empty.
     */
    public void unsetOveragePrices() {
        overagePrices = null;
    }

    /**
     * Internal Getter for Prices.
     * An array of price brackets. If the component uses the ‘per_unit’ pricing scheme, this array
     * will be empty.
     * @return Returns the Internal List of ComponentPrice
     */
    @JsonGetter("prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<ComponentPrice>> internalGetPrices() {
        return this.prices;
    }

    /**
     * Getter for Prices.
     * An array of price brackets. If the component uses the ‘per_unit’ pricing scheme, this array
     * will be empty.
     * @return Returns the List of ComponentPrice
     */
    public List<ComponentPrice> getPrices() {
        return OptionalNullable.getFrom(prices);
    }

    /**
     * Setter for Prices.
     * An array of price brackets. If the component uses the ‘per_unit’ pricing scheme, this array
     * will be empty.
     * @param prices Value for List of ComponentPrice
     */
    @JsonSetter("prices")
    public void setPrices(List<ComponentPrice> prices) {
        this.prices = OptionalNullable.of(prices);
    }

    /**
     * UnSetter for Prices.
     * An array of price brackets. If the component uses the ‘per_unit’ pricing scheme, this array
     * will be empty.
     */
    public void unsetPrices() {
        prices = null;
    }

    /**
     * Getter for PricePointCount.
     * Count for the number of price points associated with the component
     * @return Returns the Integer
     */
    @JsonGetter("price_point_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPricePointCount() {
        return pricePointCount;
    }

    /**
     * Setter for PricePointCount.
     * Count for the number of price points associated with the component
     * @param pricePointCount Value for Integer
     */
    @JsonSetter("price_point_count")
    public void setPricePointCount(Integer pricePointCount) {
        this.pricePointCount = pricePointCount;
    }

    /**
     * Internal Getter for PricePointsUrl.
     * URL that points to the location to read the existing price points via GET request
     * @return Returns the Internal String
     */
    @JsonGetter("price_points_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPricePointsUrl() {
        return this.pricePointsUrl;
    }

    /**
     * Getter for PricePointsUrl.
     * URL that points to the location to read the existing price points via GET request
     * @return Returns the String
     */
    public String getPricePointsUrl() {
        return OptionalNullable.getFrom(pricePointsUrl);
    }

    /**
     * Setter for PricePointsUrl.
     * URL that points to the location to read the existing price points via GET request
     * @param pricePointsUrl Value for String
     */
    @JsonSetter("price_points_url")
    public void setPricePointsUrl(String pricePointsUrl) {
        this.pricePointsUrl = OptionalNullable.of(pricePointsUrl);
    }

    /**
     * UnSetter for PricePointsUrl.
     * URL that points to the location to read the existing price points via GET request
     */
    public void unsetPricePointsUrl() {
        pricePointsUrl = null;
    }

    /**
     * Getter for DefaultPricePointName.
     * @return Returns the String
     */
    @JsonGetter("default_price_point_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDefaultPricePointName() {
        return defaultPricePointName;
    }

    /**
     * Setter for DefaultPricePointName.
     * @param defaultPricePointName Value for String
     */
    @JsonSetter("default_price_point_name")
    public void setDefaultPricePointName(String defaultPricePointName) {
        this.defaultPricePointName = defaultPricePointName;
    }

    /**
     * Internal Getter for TaxCode.
     * A string representing the tax code related to the component type. This is especially
     * important when using the Avalara service to tax based on locale. This attribute has a max
     * length of 10 characters.
     * @return Returns the Internal String
     */
    @JsonGetter("tax_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetTaxCode() {
        return this.taxCode;
    }

    /**
     * Getter for TaxCode.
     * A string representing the tax code related to the component type. This is especially
     * important when using the Avalara service to tax based on locale. This attribute has a max
     * length of 10 characters.
     * @return Returns the String
     */
    public String getTaxCode() {
        return OptionalNullable.getFrom(taxCode);
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
        this.taxCode = OptionalNullable.of(taxCode);
    }

    /**
     * UnSetter for TaxCode.
     * A string representing the tax code related to the component type. This is especially
     * important when using the Avalara service to tax based on locale. This attribute has a max
     * length of 10 characters.
     */
    public void unsetTaxCode() {
        taxCode = null;
    }

    /**
     * Getter for Recurring.
     * @return Returns the Boolean
     */
    @JsonGetter("recurring")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRecurring() {
        return recurring;
    }

    /**
     * Setter for Recurring.
     * @param recurring Value for Boolean
     */
    @JsonSetter("recurring")
    public void setRecurring(Boolean recurring) {
        this.recurring = recurring;
    }

    /**
     * Internal Getter for UpgradeCharge.
     * The type of credit to be created when upgrading/downgrading. Defaults to the component and
     * then site setting if one is not provided. Available values: `full`, `prorated`, `none`.
     * @return Returns the Internal CreditType
     */
    @JsonGetter("upgrade_charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CreditType> internalGetUpgradeCharge() {
        return this.upgradeCharge;
    }

    /**
     * Getter for UpgradeCharge.
     * The type of credit to be created when upgrading/downgrading. Defaults to the component and
     * then site setting if one is not provided. Available values: `full`, `prorated`, `none`.
     * @return Returns the CreditType
     */
    public CreditType getUpgradeCharge() {
        return OptionalNullable.getFrom(upgradeCharge);
    }

    /**
     * Setter for UpgradeCharge.
     * The type of credit to be created when upgrading/downgrading. Defaults to the component and
     * then site setting if one is not provided. Available values: `full`, `prorated`, `none`.
     * @param upgradeCharge Value for CreditType
     */
    @JsonSetter("upgrade_charge")
    public void setUpgradeCharge(CreditType upgradeCharge) {
        this.upgradeCharge = OptionalNullable.of(upgradeCharge);
    }

    /**
     * UnSetter for UpgradeCharge.
     * The type of credit to be created when upgrading/downgrading. Defaults to the component and
     * then site setting if one is not provided. Available values: `full`, `prorated`, `none`.
     */
    public void unsetUpgradeCharge() {
        upgradeCharge = null;
    }

    /**
     * Internal Getter for DowngradeCredit.
     * The type of credit to be created when upgrading/downgrading. Defaults to the component and
     * then site setting if one is not provided. Available values: `full`, `prorated`, `none`.
     * @return Returns the Internal CreditType
     */
    @JsonGetter("downgrade_credit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CreditType> internalGetDowngradeCredit() {
        return this.downgradeCredit;
    }

    /**
     * Getter for DowngradeCredit.
     * The type of credit to be created when upgrading/downgrading. Defaults to the component and
     * then site setting if one is not provided. Available values: `full`, `prorated`, `none`.
     * @return Returns the CreditType
     */
    public CreditType getDowngradeCredit() {
        return OptionalNullable.getFrom(downgradeCredit);
    }

    /**
     * Setter for DowngradeCredit.
     * The type of credit to be created when upgrading/downgrading. Defaults to the component and
     * then site setting if one is not provided. Available values: `full`, `prorated`, `none`.
     * @param downgradeCredit Value for CreditType
     */
    @JsonSetter("downgrade_credit")
    public void setDowngradeCredit(CreditType downgradeCredit) {
        this.downgradeCredit = OptionalNullable.of(downgradeCredit);
    }

    /**
     * UnSetter for DowngradeCredit.
     * The type of credit to be created when upgrading/downgrading. Defaults to the component and
     * then site setting if one is not provided. Available values: `full`, `prorated`, `none`.
     */
    public void unsetDowngradeCredit() {
        downgradeCredit = null;
    }

    /**
     * Getter for CreatedAt.
     * Timestamp indicating when this component was created
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * Timestamp indicating when this component was created
     * @param createdAt Value for ZonedDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * Timestamp indicating when this component was updated
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * Timestamp indicating when this component was updated
     * @param updatedAt Value for ZonedDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Internal Getter for ArchivedAt.
     * Timestamp indicating when this component was archived
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("archived_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetArchivedAt() {
        return this.archivedAt;
    }

    /**
     * Getter for ArchivedAt.
     * Timestamp indicating when this component was archived
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getArchivedAt() {
        return OptionalNullable.getFrom(archivedAt);
    }

    /**
     * Setter for ArchivedAt.
     * Timestamp indicating when this component was archived
     * @param archivedAt Value for ZonedDateTime
     */
    @JsonSetter("archived_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setArchivedAt(ZonedDateTime archivedAt) {
        this.archivedAt = OptionalNullable.of(archivedAt);
    }

    /**
     * UnSetter for ArchivedAt.
     * Timestamp indicating when this component was archived
     */
    public void unsetArchivedAt() {
        archivedAt = null;
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
     * Internal Getter for ItemCategory.
     * One of the following: Business Software, Consumer Software, Digital Services, Physical Goods,
     * Other
     * @return Returns the Internal ItemCategory
     */
    @JsonGetter("item_category")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<ItemCategory> internalGetItemCategory() {
        return this.itemCategory;
    }

    /**
     * Getter for ItemCategory.
     * One of the following: Business Software, Consumer Software, Digital Services, Physical Goods,
     * Other
     * @return Returns the ItemCategory
     */
    public ItemCategory getItemCategory() {
        return OptionalNullable.getFrom(itemCategory);
    }

    /**
     * Setter for ItemCategory.
     * One of the following: Business Software, Consumer Software, Digital Services, Physical Goods,
     * Other
     * @param itemCategory Value for ItemCategory
     */
    @JsonSetter("item_category")
    public void setItemCategory(ItemCategory itemCategory) {
        this.itemCategory = OptionalNullable.of(itemCategory);
    }

    /**
     * UnSetter for ItemCategory.
     * One of the following: Business Software, Consumer Software, Digital Services, Physical Goods,
     * Other
     */
    public void unsetItemCategory() {
        itemCategory = null;
    }

    /**
     * Internal Getter for UseSiteExchangeRate.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("use_site_exchange_rate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetUseSiteExchangeRate() {
        return this.useSiteExchangeRate;
    }

    /**
     * Getter for UseSiteExchangeRate.
     * @return Returns the Boolean
     */
    public Boolean getUseSiteExchangeRate() {
        return OptionalNullable.getFrom(useSiteExchangeRate);
    }

    /**
     * Setter for UseSiteExchangeRate.
     * @param useSiteExchangeRate Value for Boolean
     */
    @JsonSetter("use_site_exchange_rate")
    public void setUseSiteExchangeRate(Boolean useSiteExchangeRate) {
        this.useSiteExchangeRate = OptionalNullable.of(useSiteExchangeRate);
    }

    /**
     * UnSetter for UseSiteExchangeRate.
     */
    public void unsetUseSiteExchangeRate() {
        useSiteExchangeRate = null;
    }

    /**
     * Internal Getter for AccountingCode.
     * E.g. Internal ID or SKU Number
     * @return Returns the Internal String
     */
    @JsonGetter("accounting_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAccountingCode() {
        return this.accountingCode;
    }

    /**
     * Getter for AccountingCode.
     * E.g. Internal ID or SKU Number
     * @return Returns the String
     */
    public String getAccountingCode() {
        return OptionalNullable.getFrom(accountingCode);
    }

    /**
     * Setter for AccountingCode.
     * E.g. Internal ID or SKU Number
     * @param accountingCode Value for String
     */
    @JsonSetter("accounting_code")
    public void setAccountingCode(String accountingCode) {
        this.accountingCode = OptionalNullable.of(accountingCode);
    }

    /**
     * UnSetter for AccountingCode.
     * E.g. Internal ID or SKU Number
     */
    public void unsetAccountingCode() {
        accountingCode = null;
    }

    /**
     * Getter for EventBasedBillingMetricId.
     * (Only for Event Based Components) This is an ID of a metric attached to the component. This
     * metric is used to bill upon collected events.
     * @return Returns the Integer
     */
    @JsonGetter("event_based_billing_metric_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getEventBasedBillingMetricId() {
        return eventBasedBillingMetricId;
    }

    /**
     * Setter for EventBasedBillingMetricId.
     * (Only for Event Based Components) This is an ID of a metric attached to the component. This
     * metric is used to bill upon collected events.
     * @param eventBasedBillingMetricId Value for Integer
     */
    @JsonSetter("event_based_billing_metric_id")
    public void setEventBasedBillingMetricId(Integer eventBasedBillingMetricId) {
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
     * Converts this Component into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Component [" + "id=" + id + ", name=" + name + ", handle=" + handle
                + ", pricingScheme=" + pricingScheme + ", unitName=" + unitName + ", unitPrice="
                + unitPrice + ", productFamilyId=" + productFamilyId + ", productFamilyName="
                + productFamilyName + ", pricePerUnitInCents=" + pricePerUnitInCents + ", kind="
                + kind + ", archived=" + archived + ", taxable=" + taxable + ", description="
                + description + ", defaultPricePointId=" + defaultPricePointId + ", overagePrices="
                + overagePrices + ", prices=" + prices + ", pricePointCount=" + pricePointCount
                + ", pricePointsUrl=" + pricePointsUrl + ", defaultPricePointName="
                + defaultPricePointName + ", taxCode=" + taxCode + ", recurring=" + recurring
                + ", upgradeCharge=" + upgradeCharge + ", downgradeCredit=" + downgradeCredit
                + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", archivedAt="
                + archivedAt + ", hideDateRangeOnInvoice=" + hideDateRangeOnInvoice
                + ", allowFractionalQuantities=" + allowFractionalQuantities + ", itemCategory="
                + itemCategory + ", useSiteExchangeRate=" + useSiteExchangeRate
                + ", accountingCode=" + accountingCode + ", eventBasedBillingMetricId="
                + eventBasedBillingMetricId + ", interval=" + interval + ", intervalUnit="
                + intervalUnit + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Component.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Component.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .unitName(getUnitName())
                .productFamilyId(getProductFamilyId())
                .productFamilyName(getProductFamilyName())
                .kind(getKind())
                .archived(getArchived())
                .taxable(getTaxable())
                .pricePointCount(getPricePointCount())
                .defaultPricePointName(getDefaultPricePointName())
                .recurring(getRecurring())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .hideDateRangeOnInvoice(getHideDateRangeOnInvoice())
                .allowFractionalQuantities(getAllowFractionalQuantities())
                .eventBasedBillingMetricId(getEventBasedBillingMetricId())
                .interval(getInterval());
        builder.handle = internalGetHandle();
        builder.pricingScheme = internalGetPricingScheme();
        builder.unitPrice = internalGetUnitPrice();
        builder.pricePerUnitInCents = internalGetPricePerUnitInCents();
        builder.description = internalGetDescription();
        builder.defaultPricePointId = internalGetDefaultPricePointId();
        builder.overagePrices = internalGetOveragePrices();
        builder.prices = internalGetPrices();
        builder.pricePointsUrl = internalGetPricePointsUrl();
        builder.taxCode = internalGetTaxCode();
        builder.upgradeCharge = internalGetUpgradeCharge();
        builder.downgradeCredit = internalGetDowngradeCredit();
        builder.archivedAt = internalGetArchivedAt();
        builder.itemCategory = internalGetItemCategory();
        builder.useSiteExchangeRate = internalGetUseSiteExchangeRate();
        builder.accountingCode = internalGetAccountingCode();
        builder.intervalUnit = internalGetIntervalUnit();
        return builder;
    }

    /**
     * Class to build instances of {@link Component}.
     */
    public static class Builder {
        private Integer id;
        private String name;
        private OptionalNullable<String> handle;
        private OptionalNullable<PricingScheme> pricingScheme;
        private String unitName;
        private OptionalNullable<String> unitPrice;
        private Integer productFamilyId;
        private String productFamilyName;
        private OptionalNullable<Long> pricePerUnitInCents;
        private ComponentKind kind;
        private Boolean archived;
        private Boolean taxable;
        private OptionalNullable<String> description;
        private OptionalNullable<Integer> defaultPricePointId;
        private OptionalNullable<List<ComponentPrice>> overagePrices;
        private OptionalNullable<List<ComponentPrice>> prices;
        private Integer pricePointCount;
        private OptionalNullable<String> pricePointsUrl;
        private String defaultPricePointName;
        private OptionalNullable<String> taxCode;
        private Boolean recurring;
        private OptionalNullable<CreditType> upgradeCharge;
        private OptionalNullable<CreditType> downgradeCredit;
        private ZonedDateTime createdAt;
        private ZonedDateTime updatedAt;
        private OptionalNullable<ZonedDateTime> archivedAt;
        private Boolean hideDateRangeOnInvoice;
        private Boolean allowFractionalQuantities;
        private OptionalNullable<ItemCategory> itemCategory;
        private OptionalNullable<Boolean> useSiteExchangeRate;
        private OptionalNullable<String> accountingCode;
        private Integer eventBasedBillingMetricId;
        private Integer interval;
        private OptionalNullable<IntervalUnit> intervalUnit;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
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
         * Setter for handle.
         * @param  handle  String value for handle.
         * @return Builder
         */
        public Builder handle(String handle) {
            this.handle = OptionalNullable.of(handle);
            return this;
        }

        /**
         * UnSetter for handle.
         * @return Builder
         */
        public Builder unsetHandle() {
            handle = null;
            return this;
        }

        /**
         * Setter for pricingScheme.
         * @param  pricingScheme  PricingScheme value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(PricingScheme pricingScheme) {
            this.pricingScheme = OptionalNullable.of(pricingScheme);
            return this;
        }

        /**
         * UnSetter for pricingScheme.
         * @return Builder
         */
        public Builder unsetPricingScheme() {
            pricingScheme = null;
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
         * Setter for unitPrice.
         * @param  unitPrice  String value for unitPrice.
         * @return Builder
         */
        public Builder unitPrice(String unitPrice) {
            this.unitPrice = OptionalNullable.of(unitPrice);
            return this;
        }

        /**
         * UnSetter for unitPrice.
         * @return Builder
         */
        public Builder unsetUnitPrice() {
            unitPrice = null;
            return this;
        }

        /**
         * Setter for productFamilyId.
         * @param  productFamilyId  Integer value for productFamilyId.
         * @return Builder
         */
        public Builder productFamilyId(Integer productFamilyId) {
            this.productFamilyId = productFamilyId;
            return this;
        }

        /**
         * Setter for productFamilyName.
         * @param  productFamilyName  String value for productFamilyName.
         * @return Builder
         */
        public Builder productFamilyName(String productFamilyName) {
            this.productFamilyName = productFamilyName;
            return this;
        }

        /**
         * Setter for pricePerUnitInCents.
         * @param  pricePerUnitInCents  Long value for pricePerUnitInCents.
         * @return Builder
         */
        public Builder pricePerUnitInCents(Long pricePerUnitInCents) {
            this.pricePerUnitInCents = OptionalNullable.of(pricePerUnitInCents);
            return this;
        }

        /**
         * UnSetter for pricePerUnitInCents.
         * @return Builder
         */
        public Builder unsetPricePerUnitInCents() {
            pricePerUnitInCents = null;
            return this;
        }

        /**
         * Setter for kind.
         * @param  kind  ComponentKind value for kind.
         * @return Builder
         */
        public Builder kind(ComponentKind kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Setter for archived.
         * @param  archived  Boolean value for archived.
         * @return Builder
         */
        public Builder archived(Boolean archived) {
            this.archived = archived;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = OptionalNullable.of(description);
            return this;
        }

        /**
         * UnSetter for description.
         * @return Builder
         */
        public Builder unsetDescription() {
            description = null;
            return this;
        }

        /**
         * Setter for defaultPricePointId.
         * @param  defaultPricePointId  Integer value for defaultPricePointId.
         * @return Builder
         */
        public Builder defaultPricePointId(Integer defaultPricePointId) {
            this.defaultPricePointId = OptionalNullable.of(defaultPricePointId);
            return this;
        }

        /**
         * UnSetter for defaultPricePointId.
         * @return Builder
         */
        public Builder unsetDefaultPricePointId() {
            defaultPricePointId = null;
            return this;
        }

        /**
         * Setter for overagePrices.
         * @param  overagePrices  List of ComponentPrice value for overagePrices.
         * @return Builder
         */
        public Builder overagePrices(List<ComponentPrice> overagePrices) {
            this.overagePrices = OptionalNullable.of(overagePrices);
            return this;
        }

        /**
         * UnSetter for overagePrices.
         * @return Builder
         */
        public Builder unsetOveragePrices() {
            overagePrices = null;
            return this;
        }

        /**
         * Setter for prices.
         * @param  prices  List of ComponentPrice value for prices.
         * @return Builder
         */
        public Builder prices(List<ComponentPrice> prices) {
            this.prices = OptionalNullable.of(prices);
            return this;
        }

        /**
         * UnSetter for prices.
         * @return Builder
         */
        public Builder unsetPrices() {
            prices = null;
            return this;
        }

        /**
         * Setter for pricePointCount.
         * @param  pricePointCount  Integer value for pricePointCount.
         * @return Builder
         */
        public Builder pricePointCount(Integer pricePointCount) {
            this.pricePointCount = pricePointCount;
            return this;
        }

        /**
         * Setter for pricePointsUrl.
         * @param  pricePointsUrl  String value for pricePointsUrl.
         * @return Builder
         */
        public Builder pricePointsUrl(String pricePointsUrl) {
            this.pricePointsUrl = OptionalNullable.of(pricePointsUrl);
            return this;
        }

        /**
         * UnSetter for pricePointsUrl.
         * @return Builder
         */
        public Builder unsetPricePointsUrl() {
            pricePointsUrl = null;
            return this;
        }

        /**
         * Setter for defaultPricePointName.
         * @param  defaultPricePointName  String value for defaultPricePointName.
         * @return Builder
         */
        public Builder defaultPricePointName(String defaultPricePointName) {
            this.defaultPricePointName = defaultPricePointName;
            return this;
        }

        /**
         * Setter for taxCode.
         * @param  taxCode  String value for taxCode.
         * @return Builder
         */
        public Builder taxCode(String taxCode) {
            this.taxCode = OptionalNullable.of(taxCode);
            return this;
        }

        /**
         * UnSetter for taxCode.
         * @return Builder
         */
        public Builder unsetTaxCode() {
            taxCode = null;
            return this;
        }

        /**
         * Setter for recurring.
         * @param  recurring  Boolean value for recurring.
         * @return Builder
         */
        public Builder recurring(Boolean recurring) {
            this.recurring = recurring;
            return this;
        }

        /**
         * Setter for upgradeCharge.
         * @param  upgradeCharge  CreditType value for upgradeCharge.
         * @return Builder
         */
        public Builder upgradeCharge(CreditType upgradeCharge) {
            this.upgradeCharge = OptionalNullable.of(upgradeCharge);
            return this;
        }

        /**
         * UnSetter for upgradeCharge.
         * @return Builder
         */
        public Builder unsetUpgradeCharge() {
            upgradeCharge = null;
            return this;
        }

        /**
         * Setter for downgradeCredit.
         * @param  downgradeCredit  CreditType value for downgradeCredit.
         * @return Builder
         */
        public Builder downgradeCredit(CreditType downgradeCredit) {
            this.downgradeCredit = OptionalNullable.of(downgradeCredit);
            return this;
        }

        /**
         * UnSetter for downgradeCredit.
         * @return Builder
         */
        public Builder unsetDowngradeCredit() {
            downgradeCredit = null;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  ZonedDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  ZonedDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(ZonedDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for archivedAt.
         * @param  archivedAt  ZonedDateTime value for archivedAt.
         * @return Builder
         */
        public Builder archivedAt(ZonedDateTime archivedAt) {
            this.archivedAt = OptionalNullable.of(archivedAt);
            return this;
        }

        /**
         * UnSetter for archivedAt.
         * @return Builder
         */
        public Builder unsetArchivedAt() {
            archivedAt = null;
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
         * Setter for allowFractionalQuantities.
         * @param  allowFractionalQuantities  Boolean value for allowFractionalQuantities.
         * @return Builder
         */
        public Builder allowFractionalQuantities(Boolean allowFractionalQuantities) {
            this.allowFractionalQuantities = allowFractionalQuantities;
            return this;
        }

        /**
         * Setter for itemCategory.
         * @param  itemCategory  ItemCategory value for itemCategory.
         * @return Builder
         */
        public Builder itemCategory(ItemCategory itemCategory) {
            this.itemCategory = OptionalNullable.of(itemCategory);
            return this;
        }

        /**
         * UnSetter for itemCategory.
         * @return Builder
         */
        public Builder unsetItemCategory() {
            itemCategory = null;
            return this;
        }

        /**
         * Setter for useSiteExchangeRate.
         * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
         * @return Builder
         */
        public Builder useSiteExchangeRate(Boolean useSiteExchangeRate) {
            this.useSiteExchangeRate = OptionalNullable.of(useSiteExchangeRate);
            return this;
        }

        /**
         * UnSetter for useSiteExchangeRate.
         * @return Builder
         */
        public Builder unsetUseSiteExchangeRate() {
            useSiteExchangeRate = null;
            return this;
        }

        /**
         * Setter for accountingCode.
         * @param  accountingCode  String value for accountingCode.
         * @return Builder
         */
        public Builder accountingCode(String accountingCode) {
            this.accountingCode = OptionalNullable.of(accountingCode);
            return this;
        }

        /**
         * UnSetter for accountingCode.
         * @return Builder
         */
        public Builder unsetAccountingCode() {
            accountingCode = null;
            return this;
        }

        /**
         * Setter for eventBasedBillingMetricId.
         * @param  eventBasedBillingMetricId  Integer value for eventBasedBillingMetricId.
         * @return Builder
         */
        public Builder eventBasedBillingMetricId(Integer eventBasedBillingMetricId) {
            this.eventBasedBillingMetricId = eventBasedBillingMetricId;
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
         * Builds a new {@link Component} object using the set fields.
         * @return {@link Component}
         */
        public Component build() {
            return new Component(id, name, handle, pricingScheme, unitName, unitPrice,
                    productFamilyId, productFamilyName, pricePerUnitInCents, kind, archived,
                    taxable, description, defaultPricePointId, overagePrices, prices,
                    pricePointCount, pricePointsUrl, defaultPricePointName, taxCode, recurring,
                    upgradeCharge, downgradeCredit, createdAt, updatedAt, archivedAt,
                    hideDateRangeOnInvoice, allowFractionalQuantities, itemCategory,
                    useSiteExchangeRate, accountingCode, eventBasedBillingMetricId, interval,
                    intervalUnit);
        }
    }
}
