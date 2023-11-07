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
import com.maxio.advancedbilling.models.containers.SubscriptionComponentPricePointType;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for SubscriptionComponent type.
 */
public class SubscriptionComponent {
    private Integer id;
    private String name;
    private String kind;
    private String unitName;
    private Boolean enabled;
    private Integer unitBalance;
    private String currency;
    private Integer allocatedQuantity;
    private OptionalNullable<String> pricingScheme;
    private Integer componentId;
    private OptionalNullable<String> componentHandle;
    private Integer subscriptionId;
    private Boolean recurring;
    private OptionalNullable<String> upgradeCharge;
    private OptionalNullable<String> downgradeCredit;
    private OptionalNullable<String> archivedAt;
    private OptionalNullable<Integer> pricePointId;
    private OptionalNullable<String> pricePointHandle;
    private SubscriptionComponentPricePointType pricePointType;
    private OptionalNullable<String> pricePointName;
    private Integer productFamilyId;
    private String productFamilyHandle;
    private String createdAt;
    private String updatedAt;
    private OptionalNullable<Boolean> useSiteExchangeRate;
    private OptionalNullable<String> description;
    private Boolean allowFractionalQuantities;
    private SubscriptionComponentSubscription subscription;
    private Boolean displayOnHostedPage;

    /**
     * Default constructor.
     */
    public SubscriptionComponent() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  kind  String value for kind.
     * @param  unitName  String value for unitName.
     * @param  enabled  Boolean value for enabled.
     * @param  unitBalance  Integer value for unitBalance.
     * @param  currency  String value for currency.
     * @param  allocatedQuantity  Integer value for allocatedQuantity.
     * @param  pricingScheme  String value for pricingScheme.
     * @param  componentId  Integer value for componentId.
     * @param  componentHandle  String value for componentHandle.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  recurring  Boolean value for recurring.
     * @param  upgradeCharge  String value for upgradeCharge.
     * @param  downgradeCredit  String value for downgradeCredit.
     * @param  archivedAt  String value for archivedAt.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  pricePointHandle  String value for pricePointHandle.
     * @param  pricePointType  SubscriptionComponentPricePointType value for pricePointType.
     * @param  pricePointName  String value for pricePointName.
     * @param  productFamilyId  Integer value for productFamilyId.
     * @param  productFamilyHandle  String value for productFamilyHandle.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  description  String value for description.
     * @param  allowFractionalQuantities  Boolean value for allowFractionalQuantities.
     * @param  subscription  SubscriptionComponentSubscription value for subscription.
     * @param  displayOnHostedPage  Boolean value for displayOnHostedPage.
     */
    public SubscriptionComponent(
            Integer id,
            String name,
            String kind,
            String unitName,
            Boolean enabled,
            Integer unitBalance,
            String currency,
            Integer allocatedQuantity,
            String pricingScheme,
            Integer componentId,
            String componentHandle,
            Integer subscriptionId,
            Boolean recurring,
            String upgradeCharge,
            String downgradeCredit,
            String archivedAt,
            Integer pricePointId,
            String pricePointHandle,
            SubscriptionComponentPricePointType pricePointType,
            String pricePointName,
            Integer productFamilyId,
            String productFamilyHandle,
            String createdAt,
            String updatedAt,
            Boolean useSiteExchangeRate,
            String description,
            Boolean allowFractionalQuantities,
            SubscriptionComponentSubscription subscription,
            Boolean displayOnHostedPage) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.unitName = unitName;
        this.enabled = enabled;
        this.unitBalance = unitBalance;
        this.currency = currency;
        this.allocatedQuantity = allocatedQuantity;
        this.pricingScheme = OptionalNullable.of(pricingScheme);
        this.componentId = componentId;
        this.componentHandle = OptionalNullable.of(componentHandle);
        this.subscriptionId = subscriptionId;
        this.recurring = recurring;
        this.upgradeCharge = OptionalNullable.of(upgradeCharge);
        this.downgradeCredit = OptionalNullable.of(downgradeCredit);
        this.archivedAt = OptionalNullable.of(archivedAt);
        this.pricePointId = OptionalNullable.of(pricePointId);
        this.pricePointHandle = OptionalNullable.of(pricePointHandle);
        this.pricePointType = pricePointType;
        this.pricePointName = OptionalNullable.of(pricePointName);
        this.productFamilyId = productFamilyId;
        this.productFamilyHandle = productFamilyHandle;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.useSiteExchangeRate = OptionalNullable.of(useSiteExchangeRate);
        this.description = OptionalNullable.of(description);
        this.allowFractionalQuantities = allowFractionalQuantities;
        this.subscription = subscription;
        this.displayOnHostedPage = displayOnHostedPage;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  kind  String value for kind.
     * @param  unitName  String value for unitName.
     * @param  enabled  Boolean value for enabled.
     * @param  unitBalance  Integer value for unitBalance.
     * @param  currency  String value for currency.
     * @param  allocatedQuantity  Integer value for allocatedQuantity.
     * @param  pricingScheme  String value for pricingScheme.
     * @param  componentId  Integer value for componentId.
     * @param  componentHandle  String value for componentHandle.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  recurring  Boolean value for recurring.
     * @param  upgradeCharge  String value for upgradeCharge.
     * @param  downgradeCredit  String value for downgradeCredit.
     * @param  archivedAt  String value for archivedAt.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  pricePointHandle  String value for pricePointHandle.
     * @param  pricePointType  SubscriptionComponentPricePointType value for pricePointType.
     * @param  pricePointName  String value for pricePointName.
     * @param  productFamilyId  Integer value for productFamilyId.
     * @param  productFamilyHandle  String value for productFamilyHandle.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  description  String value for description.
     * @param  allowFractionalQuantities  Boolean value for allowFractionalQuantities.
     * @param  subscription  SubscriptionComponentSubscription value for subscription.
     * @param  displayOnHostedPage  Boolean value for displayOnHostedPage.
     */

    protected SubscriptionComponent(Integer id, String name, String kind, String unitName,
            Boolean enabled, Integer unitBalance, String currency, Integer allocatedQuantity,
            OptionalNullable<String> pricingScheme, Integer componentId,
            OptionalNullable<String> componentHandle, Integer subscriptionId, Boolean recurring,
            OptionalNullable<String> upgradeCharge, OptionalNullable<String> downgradeCredit,
            OptionalNullable<String> archivedAt, OptionalNullable<Integer> pricePointId,
            OptionalNullable<String> pricePointHandle,
            SubscriptionComponentPricePointType pricePointType,
            OptionalNullable<String> pricePointName, Integer productFamilyId,
            String productFamilyHandle, String createdAt, String updatedAt,
            OptionalNullable<Boolean> useSiteExchangeRate, OptionalNullable<String> description,
            Boolean allowFractionalQuantities, SubscriptionComponentSubscription subscription,
            Boolean displayOnHostedPage) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.unitName = unitName;
        this.enabled = enabled;
        this.unitBalance = unitBalance;
        this.currency = currency;
        this.allocatedQuantity = allocatedQuantity;
        this.pricingScheme = pricingScheme;
        this.componentId = componentId;
        this.componentHandle = componentHandle;
        this.subscriptionId = subscriptionId;
        this.recurring = recurring;
        this.upgradeCharge = upgradeCharge;
        this.downgradeCredit = downgradeCredit;
        this.archivedAt = archivedAt;
        this.pricePointId = pricePointId;
        this.pricePointHandle = pricePointHandle;
        this.pricePointType = pricePointType;
        this.pricePointName = pricePointName;
        this.productFamilyId = productFamilyId;
        this.productFamilyHandle = productFamilyHandle;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.description = description;
        this.allowFractionalQuantities = allowFractionalQuantities;
        this.subscription = subscription;
        this.displayOnHostedPage = displayOnHostedPage;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
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
     * Getter for UnitName.
     * @return Returns the String
     */
    @JsonGetter("unit_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUnitName() {
        return unitName;
    }

    /**
     * Setter for UnitName.
     * @param unitName Value for String
     */
    @JsonSetter("unit_name")
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /**
     * Getter for Enabled.
     * (for on/off components) indicates if the component is enabled for the subscription
     * @return Returns the Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * (for on/off components) indicates if the component is enabled for the subscription
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for UnitBalance.
     * @return Returns the Integer
     */
    @JsonGetter("unit_balance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUnitBalance() {
        return unitBalance;
    }

    /**
     * Setter for UnitBalance.
     * @param unitBalance Value for Integer
     */
    @JsonSetter("unit_balance")
    public void setUnitBalance(Integer unitBalance) {
        this.unitBalance = unitBalance;
    }

    /**
     * Getter for Currency.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for AllocatedQuantity.
     * For Quantity-based components: The current allocation for the component on the given
     * subscription. For On/Off components: Use 1 for on. Use 0 for off.
     * @return Returns the Integer
     */
    @JsonGetter("allocated_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAllocatedQuantity() {
        return allocatedQuantity;
    }

    /**
     * Setter for AllocatedQuantity.
     * For Quantity-based components: The current allocation for the component on the given
     * subscription. For On/Off components: Use 1 for on. Use 0 for off.
     * @param allocatedQuantity Value for Integer
     */
    @JsonSetter("allocated_quantity")
    public void setAllocatedQuantity(Integer allocatedQuantity) {
        this.allocatedQuantity = allocatedQuantity;
    }

    /**
     * Internal Getter for PricingScheme.
     * @return Returns the Internal String
     */
    @JsonGetter("pricing_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPricingScheme() {
        return this.pricingScheme;
    }

    /**
     * Getter for PricingScheme.
     * @return Returns the String
     */
    public String getPricingScheme() {
        return OptionalNullable.getFrom(pricingScheme);
    }

    /**
     * Setter for PricingScheme.
     * @param pricingScheme Value for String
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(String pricingScheme) {
        this.pricingScheme = OptionalNullable.of(pricingScheme);
    }

    /**
     * UnSetter for PricingScheme.
     */
    public void unsetPricingScheme() {
        pricingScheme = null;
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
     * Internal Getter for ComponentHandle.
     * @return Returns the Internal String
     */
    @JsonGetter("component_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetComponentHandle() {
        return this.componentHandle;
    }

    /**
     * Getter for ComponentHandle.
     * @return Returns the String
     */
    public String getComponentHandle() {
        return OptionalNullable.getFrom(componentHandle);
    }

    /**
     * Setter for ComponentHandle.
     * @param componentHandle Value for String
     */
    @JsonSetter("component_handle")
    public void setComponentHandle(String componentHandle) {
        this.componentHandle = OptionalNullable.of(componentHandle);
    }

    /**
     * UnSetter for ComponentHandle.
     */
    public void unsetComponentHandle() {
        componentHandle = null;
    }

    /**
     * Getter for SubscriptionId.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
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
     * @return Returns the Internal String
     */
    @JsonGetter("upgrade_charge")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetUpgradeCharge() {
        return this.upgradeCharge;
    }

    /**
     * Getter for UpgradeCharge.
     * @return Returns the String
     */
    public String getUpgradeCharge() {
        return OptionalNullable.getFrom(upgradeCharge);
    }

    /**
     * Setter for UpgradeCharge.
     * @param upgradeCharge Value for String
     */
    @JsonSetter("upgrade_charge")
    public void setUpgradeCharge(String upgradeCharge) {
        this.upgradeCharge = OptionalNullable.of(upgradeCharge);
    }

    /**
     * UnSetter for UpgradeCharge.
     */
    public void unsetUpgradeCharge() {
        upgradeCharge = null;
    }

    /**
     * Internal Getter for DowngradeCredit.
     * @return Returns the Internal String
     */
    @JsonGetter("downgrade_credit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDowngradeCredit() {
        return this.downgradeCredit;
    }

    /**
     * Getter for DowngradeCredit.
     * @return Returns the String
     */
    public String getDowngradeCredit() {
        return OptionalNullable.getFrom(downgradeCredit);
    }

    /**
     * Setter for DowngradeCredit.
     * @param downgradeCredit Value for String
     */
    @JsonSetter("downgrade_credit")
    public void setDowngradeCredit(String downgradeCredit) {
        this.downgradeCredit = OptionalNullable.of(downgradeCredit);
    }

    /**
     * UnSetter for DowngradeCredit.
     */
    public void unsetDowngradeCredit() {
        downgradeCredit = null;
    }

    /**
     * Internal Getter for ArchivedAt.
     * @return Returns the Internal String
     */
    @JsonGetter("archived_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetArchivedAt() {
        return this.archivedAt;
    }

    /**
     * Getter for ArchivedAt.
     * @return Returns the String
     */
    public String getArchivedAt() {
        return OptionalNullable.getFrom(archivedAt);
    }

    /**
     * Setter for ArchivedAt.
     * @param archivedAt Value for String
     */
    @JsonSetter("archived_at")
    public void setArchivedAt(String archivedAt) {
        this.archivedAt = OptionalNullable.of(archivedAt);
    }

    /**
     * UnSetter for ArchivedAt.
     */
    public void unsetArchivedAt() {
        archivedAt = null;
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
     * Internal Getter for PricePointHandle.
     * @return Returns the Internal String
     */
    @JsonGetter("price_point_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPricePointHandle() {
        return this.pricePointHandle;
    }

    /**
     * Getter for PricePointHandle.
     * @return Returns the String
     */
    public String getPricePointHandle() {
        return OptionalNullable.getFrom(pricePointHandle);
    }

    /**
     * Setter for PricePointHandle.
     * @param pricePointHandle Value for String
     */
    @JsonSetter("price_point_handle")
    public void setPricePointHandle(String pricePointHandle) {
        this.pricePointHandle = OptionalNullable.of(pricePointHandle);
    }

    /**
     * UnSetter for PricePointHandle.
     */
    public void unsetPricePointHandle() {
        pricePointHandle = null;
    }

    /**
     * Getter for PricePointType.
     * @return Returns the SubscriptionComponentPricePointType
     */
    @JsonGetter("price_point_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionComponentPricePointType getPricePointType() {
        return pricePointType;
    }

    /**
     * Setter for PricePointType.
     * @param pricePointType Value for SubscriptionComponentPricePointType
     */
    @JsonSetter("price_point_type")
    public void setPricePointType(SubscriptionComponentPricePointType pricePointType) {
        this.pricePointType = pricePointType;
    }

    /**
     * Internal Getter for PricePointName.
     * @return Returns the Internal String
     */
    @JsonGetter("price_point_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPricePointName() {
        return this.pricePointName;
    }

    /**
     * Getter for PricePointName.
     * @return Returns the String
     */
    public String getPricePointName() {
        return OptionalNullable.getFrom(pricePointName);
    }

    /**
     * Setter for PricePointName.
     * @param pricePointName Value for String
     */
    @JsonSetter("price_point_name")
    public void setPricePointName(String pricePointName) {
        this.pricePointName = OptionalNullable.of(pricePointName);
    }

    /**
     * UnSetter for PricePointName.
     */
    public void unsetPricePointName() {
        pricePointName = null;
    }

    /**
     * Getter for ProductFamilyId.
     * @return Returns the Integer
     */
    @JsonGetter("product_family_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductFamilyId() {
        return productFamilyId;
    }

    /**
     * Setter for ProductFamilyId.
     * @param productFamilyId Value for Integer
     */
    @JsonSetter("product_family_id")
    public void setProductFamilyId(Integer productFamilyId) {
        this.productFamilyId = productFamilyId;
    }

    /**
     * Getter for ProductFamilyHandle.
     * @return Returns the String
     */
    @JsonGetter("product_family_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductFamilyHandle() {
        return productFamilyHandle;
    }

    /**
     * Setter for ProductFamilyHandle.
     * @param productFamilyHandle Value for String
     */
    @JsonSetter("product_family_handle")
    public void setProductFamilyHandle(String productFamilyHandle) {
        this.productFamilyHandle = productFamilyHandle;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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
     * Internal Getter for Description.
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
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     */
    public void unsetDescription() {
        description = null;
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
     * Getter for Subscription.
     * An optional object, will be returned if provided `include=subscription` query param.
     * @return Returns the SubscriptionComponentSubscription
     */
    @JsonGetter("subscription")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SubscriptionComponentSubscription getSubscription() {
        return subscription;
    }

    /**
     * Setter for Subscription.
     * An optional object, will be returned if provided `include=subscription` query param.
     * @param subscription Value for SubscriptionComponentSubscription
     */
    @JsonSetter("subscription")
    public void setSubscription(SubscriptionComponentSubscription subscription) {
        this.subscription = subscription;
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
     * Converts this SubscriptionComponent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionComponent [" + "id=" + id + ", name=" + name + ", kind=" + kind
                + ", unitName=" + unitName + ", enabled=" + enabled + ", unitBalance=" + unitBalance
                + ", currency=" + currency + ", allocatedQuantity=" + allocatedQuantity
                + ", pricingScheme=" + pricingScheme + ", componentId=" + componentId
                + ", componentHandle=" + componentHandle + ", subscriptionId=" + subscriptionId
                + ", recurring=" + recurring + ", upgradeCharge=" + upgradeCharge
                + ", downgradeCredit=" + downgradeCredit + ", archivedAt=" + archivedAt
                + ", pricePointId=" + pricePointId + ", pricePointHandle=" + pricePointHandle
                + ", pricePointType=" + pricePointType + ", pricePointName=" + pricePointName
                + ", productFamilyId=" + productFamilyId + ", productFamilyHandle="
                + productFamilyHandle + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
                + ", useSiteExchangeRate=" + useSiteExchangeRate + ", description=" + description
                + ", allowFractionalQuantities=" + allowFractionalQuantities + ", subscription="
                + subscription + ", displayOnHostedPage=" + displayOnHostedPage + "]";
    }

    /**
     * Builds a new {@link SubscriptionComponent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionComponent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .kind(getKind())
                .unitName(getUnitName())
                .enabled(getEnabled())
                .unitBalance(getUnitBalance())
                .currency(getCurrency())
                .allocatedQuantity(getAllocatedQuantity())
                .componentId(getComponentId())
                .subscriptionId(getSubscriptionId())
                .recurring(getRecurring())
                .pricePointType(getPricePointType())
                .productFamilyId(getProductFamilyId())
                .productFamilyHandle(getProductFamilyHandle())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .allowFractionalQuantities(getAllowFractionalQuantities())
                .subscription(getSubscription())
                .displayOnHostedPage(getDisplayOnHostedPage());
        builder.pricingScheme = internalGetPricingScheme();
        builder.componentHandle = internalGetComponentHandle();
        builder.upgradeCharge = internalGetUpgradeCharge();
        builder.downgradeCredit = internalGetDowngradeCredit();
        builder.archivedAt = internalGetArchivedAt();
        builder.pricePointId = internalGetPricePointId();
        builder.pricePointHandle = internalGetPricePointHandle();
        builder.pricePointName = internalGetPricePointName();
        builder.useSiteExchangeRate = internalGetUseSiteExchangeRate();
        builder.description = internalGetDescription();
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionComponent}.
     */
    public static class Builder {
        private Integer id;
        private String name;
        private String kind;
        private String unitName;
        private Boolean enabled;
        private Integer unitBalance;
        private String currency;
        private Integer allocatedQuantity;
        private OptionalNullable<String> pricingScheme;
        private Integer componentId;
        private OptionalNullable<String> componentHandle;
        private Integer subscriptionId;
        private Boolean recurring;
        private OptionalNullable<String> upgradeCharge;
        private OptionalNullable<String> downgradeCredit;
        private OptionalNullable<String> archivedAt;
        private OptionalNullable<Integer> pricePointId;
        private OptionalNullable<String> pricePointHandle;
        private SubscriptionComponentPricePointType pricePointType;
        private OptionalNullable<String> pricePointName;
        private Integer productFamilyId;
        private String productFamilyHandle;
        private String createdAt;
        private String updatedAt;
        private OptionalNullable<Boolean> useSiteExchangeRate;
        private OptionalNullable<String> description;
        private Boolean allowFractionalQuantities;
        private SubscriptionComponentSubscription subscription;
        private Boolean displayOnHostedPage;



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
         * Setter for kind.
         * @param  kind  String value for kind.
         * @return Builder
         */
        public Builder kind(String kind) {
            this.kind = kind;
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
         * Setter for enabled.
         * @param  enabled  Boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Setter for unitBalance.
         * @param  unitBalance  Integer value for unitBalance.
         * @return Builder
         */
        public Builder unitBalance(Integer unitBalance) {
            this.unitBalance = unitBalance;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for allocatedQuantity.
         * @param  allocatedQuantity  Integer value for allocatedQuantity.
         * @return Builder
         */
        public Builder allocatedQuantity(Integer allocatedQuantity) {
            this.allocatedQuantity = allocatedQuantity;
            return this;
        }

        /**
         * Setter for pricingScheme.
         * @param  pricingScheme  String value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(String pricingScheme) {
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
            this.componentHandle = OptionalNullable.of(componentHandle);
            return this;
        }

        /**
         * UnSetter for componentHandle.
         * @return Builder
         */
        public Builder unsetComponentHandle() {
            componentHandle = null;
            return this;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
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
         * @param  upgradeCharge  String value for upgradeCharge.
         * @return Builder
         */
        public Builder upgradeCharge(String upgradeCharge) {
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
         * @param  downgradeCredit  String value for downgradeCredit.
         * @return Builder
         */
        public Builder downgradeCredit(String downgradeCredit) {
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
         * Setter for archivedAt.
         * @param  archivedAt  String value for archivedAt.
         * @return Builder
         */
        public Builder archivedAt(String archivedAt) {
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
         * Setter for pricePointHandle.
         * @param  pricePointHandle  String value for pricePointHandle.
         * @return Builder
         */
        public Builder pricePointHandle(String pricePointHandle) {
            this.pricePointHandle = OptionalNullable.of(pricePointHandle);
            return this;
        }

        /**
         * UnSetter for pricePointHandle.
         * @return Builder
         */
        public Builder unsetPricePointHandle() {
            pricePointHandle = null;
            return this;
        }

        /**
         * Setter for pricePointType.
         * @param  pricePointType  SubscriptionComponentPricePointType value for pricePointType.
         * @return Builder
         */
        public Builder pricePointType(SubscriptionComponentPricePointType pricePointType) {
            this.pricePointType = pricePointType;
            return this;
        }

        /**
         * Setter for pricePointName.
         * @param  pricePointName  String value for pricePointName.
         * @return Builder
         */
        public Builder pricePointName(String pricePointName) {
            this.pricePointName = OptionalNullable.of(pricePointName);
            return this;
        }

        /**
         * UnSetter for pricePointName.
         * @return Builder
         */
        public Builder unsetPricePointName() {
            pricePointName = null;
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
         * Setter for productFamilyHandle.
         * @param  productFamilyHandle  String value for productFamilyHandle.
         * @return Builder
         */
        public Builder productFamilyHandle(String productFamilyHandle) {
            this.productFamilyHandle = productFamilyHandle;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
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
         * Setter for allowFractionalQuantities.
         * @param  allowFractionalQuantities  Boolean value for allowFractionalQuantities.
         * @return Builder
         */
        public Builder allowFractionalQuantities(Boolean allowFractionalQuantities) {
            this.allowFractionalQuantities = allowFractionalQuantities;
            return this;
        }

        /**
         * Setter for subscription.
         * @param  subscription  SubscriptionComponentSubscription value for subscription.
         * @return Builder
         */
        public Builder subscription(SubscriptionComponentSubscription subscription) {
            this.subscription = subscription;
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
         * Builds a new {@link SubscriptionComponent} object using the set fields.
         * @return {@link SubscriptionComponent}
         */
        public SubscriptionComponent build() {
            return new SubscriptionComponent(id, name, kind, unitName, enabled, unitBalance,
                    currency, allocatedQuantity, pricingScheme, componentId, componentHandle,
                    subscriptionId, recurring, upgradeCharge, downgradeCredit, archivedAt,
                    pricePointId, pricePointHandle, pricePointType, pricePointName, productFamilyId,
                    productFamilyHandle, createdAt, updatedAt, useSiteExchangeRate, description,
                    allowFractionalQuantities, subscription, displayOnHostedPage);
        }
    }
}
