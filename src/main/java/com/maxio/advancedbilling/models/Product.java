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
import com.maxio.advancedbilling.models.containers.ProductExpirationIntervalUnit;
import com.maxio.advancedbilling.models.containers.ProductIntervalUnit;
import com.maxio.advancedbilling.models.containers.ProductTrialIntervalUnit;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for Product type.
 */
public class Product {
    private Integer id;
    private String name;
    private OptionalNullable<String> handle;
    private String description;
    private OptionalNullable<String> accountingCode;
    private Boolean requestCreditCard;
    private OptionalNullable<Integer> expirationInterval;
    private OptionalNullable<ProductExpirationIntervalUnit> expirationIntervalUnit;
    private String createdAt;
    private String updatedAt;
    private Integer priceInCents;
    private Integer interval;
    private ProductIntervalUnit intervalUnit;
    private OptionalNullable<Integer> initialChargeInCents;
    private OptionalNullable<Integer> trialPriceInCents;
    private OptionalNullable<Integer> trialInterval;
    private OptionalNullable<ProductTrialIntervalUnit> trialIntervalUnit;
    private OptionalNullable<String> archivedAt;
    private Boolean requireCreditCard;
    private OptionalNullable<String> returnParams;
    private Boolean taxable;
    private OptionalNullable<String> updateReturnUrl;
    private Boolean initialChargeAfterTrial;
    private Integer versionNumber;
    private OptionalNullable<String> updateReturnParams;
    private ProductFamily productFamily;
    private List<PublicSignupPage> publicSignupPages;
    private String productPricePointName;
    private Boolean requestBillingAddress;
    private Boolean requireBillingAddress;
    private Boolean requireShippingAddress;
    private OptionalNullable<String> taxCode;
    private Integer defaultProductPricePointId;
    private OptionalNullable<Boolean> useSiteExchangeRate;
    private OptionalNullable<String> itemCategory;
    private Integer productPricePointId;
    private OptionalNullable<String> productPricePointHandle;

    /**
     * Default constructor.
     */
    public Product() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  description  String value for description.
     * @param  accountingCode  String value for accountingCode.
     * @param  requestCreditCard  Boolean value for requestCreditCard.
     * @param  expirationInterval  Integer value for expirationInterval.
     * @param  expirationIntervalUnit  ProductExpirationIntervalUnit value for
     *         expirationIntervalUnit.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  priceInCents  Integer value for priceInCents.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  ProductIntervalUnit value for intervalUnit.
     * @param  initialChargeInCents  Integer value for initialChargeInCents.
     * @param  trialPriceInCents  Integer value for trialPriceInCents.
     * @param  trialInterval  Integer value for trialInterval.
     * @param  trialIntervalUnit  ProductTrialIntervalUnit value for trialIntervalUnit.
     * @param  archivedAt  String value for archivedAt.
     * @param  requireCreditCard  Boolean value for requireCreditCard.
     * @param  returnParams  String value for returnParams.
     * @param  taxable  Boolean value for taxable.
     * @param  updateReturnUrl  String value for updateReturnUrl.
     * @param  initialChargeAfterTrial  Boolean value for initialChargeAfterTrial.
     * @param  versionNumber  Integer value for versionNumber.
     * @param  updateReturnParams  String value for updateReturnParams.
     * @param  productFamily  ProductFamily value for productFamily.
     * @param  publicSignupPages  List of PublicSignupPage value for publicSignupPages.
     * @param  productPricePointName  String value for productPricePointName.
     * @param  requestBillingAddress  Boolean value for requestBillingAddress.
     * @param  requireBillingAddress  Boolean value for requireBillingAddress.
     * @param  requireShippingAddress  Boolean value for requireShippingAddress.
     * @param  taxCode  String value for taxCode.
     * @param  defaultProductPricePointId  Integer value for defaultProductPricePointId.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  itemCategory  String value for itemCategory.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  productPricePointHandle  String value for productPricePointHandle.
     */
    public Product(
            Integer id,
            String name,
            String handle,
            String description,
            String accountingCode,
            Boolean requestCreditCard,
            Integer expirationInterval,
            ProductExpirationIntervalUnit expirationIntervalUnit,
            String createdAt,
            String updatedAt,
            Integer priceInCents,
            Integer interval,
            ProductIntervalUnit intervalUnit,
            Integer initialChargeInCents,
            Integer trialPriceInCents,
            Integer trialInterval,
            ProductTrialIntervalUnit trialIntervalUnit,
            String archivedAt,
            Boolean requireCreditCard,
            String returnParams,
            Boolean taxable,
            String updateReturnUrl,
            Boolean initialChargeAfterTrial,
            Integer versionNumber,
            String updateReturnParams,
            ProductFamily productFamily,
            List<PublicSignupPage> publicSignupPages,
            String productPricePointName,
            Boolean requestBillingAddress,
            Boolean requireBillingAddress,
            Boolean requireShippingAddress,
            String taxCode,
            Integer defaultProductPricePointId,
            Boolean useSiteExchangeRate,
            String itemCategory,
            Integer productPricePointId,
            String productPricePointHandle) {
        this.id = id;
        this.name = name;
        this.handle = OptionalNullable.of(handle);
        this.description = description;
        this.accountingCode = OptionalNullable.of(accountingCode);
        this.requestCreditCard = requestCreditCard;
        this.expirationInterval = OptionalNullable.of(expirationInterval);
        this.expirationIntervalUnit = OptionalNullable.of(expirationIntervalUnit);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.priceInCents = priceInCents;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.initialChargeInCents = OptionalNullable.of(initialChargeInCents);
        this.trialPriceInCents = OptionalNullable.of(trialPriceInCents);
        this.trialInterval = OptionalNullable.of(trialInterval);
        this.trialIntervalUnit = OptionalNullable.of(trialIntervalUnit);
        this.archivedAt = OptionalNullable.of(archivedAt);
        this.requireCreditCard = requireCreditCard;
        this.returnParams = OptionalNullable.of(returnParams);
        this.taxable = taxable;
        this.updateReturnUrl = OptionalNullable.of(updateReturnUrl);
        this.initialChargeAfterTrial = initialChargeAfterTrial;
        this.versionNumber = versionNumber;
        this.updateReturnParams = OptionalNullable.of(updateReturnParams);
        this.productFamily = productFamily;
        this.publicSignupPages = publicSignupPages;
        this.productPricePointName = productPricePointName;
        this.requestBillingAddress = requestBillingAddress;
        this.requireBillingAddress = requireBillingAddress;
        this.requireShippingAddress = requireShippingAddress;
        this.taxCode = OptionalNullable.of(taxCode);
        this.defaultProductPricePointId = defaultProductPricePointId;
        this.useSiteExchangeRate = OptionalNullable.of(useSiteExchangeRate);
        this.itemCategory = OptionalNullable.of(itemCategory);
        this.productPricePointId = productPricePointId;
        this.productPricePointHandle = OptionalNullable.of(productPricePointHandle);
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     * @param  description  String value for description.
     * @param  accountingCode  String value for accountingCode.
     * @param  requestCreditCard  Boolean value for requestCreditCard.
     * @param  expirationInterval  Integer value for expirationInterval.
     * @param  expirationIntervalUnit  ProductExpirationIntervalUnit value for
     *         expirationIntervalUnit.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  priceInCents  Integer value for priceInCents.
     * @param  interval  Integer value for interval.
     * @param  intervalUnit  ProductIntervalUnit value for intervalUnit.
     * @param  initialChargeInCents  Integer value for initialChargeInCents.
     * @param  trialPriceInCents  Integer value for trialPriceInCents.
     * @param  trialInterval  Integer value for trialInterval.
     * @param  trialIntervalUnit  ProductTrialIntervalUnit value for trialIntervalUnit.
     * @param  archivedAt  String value for archivedAt.
     * @param  requireCreditCard  Boolean value for requireCreditCard.
     * @param  returnParams  String value for returnParams.
     * @param  taxable  Boolean value for taxable.
     * @param  updateReturnUrl  String value for updateReturnUrl.
     * @param  initialChargeAfterTrial  Boolean value for initialChargeAfterTrial.
     * @param  versionNumber  Integer value for versionNumber.
     * @param  updateReturnParams  String value for updateReturnParams.
     * @param  productFamily  ProductFamily value for productFamily.
     * @param  publicSignupPages  List of PublicSignupPage value for publicSignupPages.
     * @param  productPricePointName  String value for productPricePointName.
     * @param  requestBillingAddress  Boolean value for requestBillingAddress.
     * @param  requireBillingAddress  Boolean value for requireBillingAddress.
     * @param  requireShippingAddress  Boolean value for requireShippingAddress.
     * @param  taxCode  String value for taxCode.
     * @param  defaultProductPricePointId  Integer value for defaultProductPricePointId.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  itemCategory  String value for itemCategory.
     * @param  productPricePointId  Integer value for productPricePointId.
     * @param  productPricePointHandle  String value for productPricePointHandle.
     */

    protected Product(Integer id, String name, OptionalNullable<String> handle, String description,
            OptionalNullable<String> accountingCode, Boolean requestCreditCard,
            OptionalNullable<Integer> expirationInterval,
            OptionalNullable<ProductExpirationIntervalUnit> expirationIntervalUnit,
            String createdAt, String updatedAt, Integer priceInCents, Integer interval,
            ProductIntervalUnit intervalUnit, OptionalNullable<Integer> initialChargeInCents,
            OptionalNullable<Integer> trialPriceInCents, OptionalNullable<Integer> trialInterval,
            OptionalNullable<ProductTrialIntervalUnit> trialIntervalUnit,
            OptionalNullable<String> archivedAt, Boolean requireCreditCard,
            OptionalNullable<String> returnParams, Boolean taxable,
            OptionalNullable<String> updateReturnUrl, Boolean initialChargeAfterTrial,
            Integer versionNumber, OptionalNullable<String> updateReturnParams,
            ProductFamily productFamily, List<PublicSignupPage> publicSignupPages,
            String productPricePointName, Boolean requestBillingAddress,
            Boolean requireBillingAddress, Boolean requireShippingAddress,
            OptionalNullable<String> taxCode, Integer defaultProductPricePointId,
            OptionalNullable<Boolean> useSiteExchangeRate, OptionalNullable<String> itemCategory,
            Integer productPricePointId, OptionalNullable<String> productPricePointHandle) {
        this.id = id;
        this.name = name;
        this.handle = handle;
        this.description = description;
        this.accountingCode = accountingCode;
        this.requestCreditCard = requestCreditCard;
        this.expirationInterval = expirationInterval;
        this.expirationIntervalUnit = expirationIntervalUnit;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.priceInCents = priceInCents;
        this.interval = interval;
        this.intervalUnit = intervalUnit;
        this.initialChargeInCents = initialChargeInCents;
        this.trialPriceInCents = trialPriceInCents;
        this.trialInterval = trialInterval;
        this.trialIntervalUnit = trialIntervalUnit;
        this.archivedAt = archivedAt;
        this.requireCreditCard = requireCreditCard;
        this.returnParams = returnParams;
        this.taxable = taxable;
        this.updateReturnUrl = updateReturnUrl;
        this.initialChargeAfterTrial = initialChargeAfterTrial;
        this.versionNumber = versionNumber;
        this.updateReturnParams = updateReturnParams;
        this.productFamily = productFamily;
        this.publicSignupPages = publicSignupPages;
        this.productPricePointName = productPricePointName;
        this.requestBillingAddress = requestBillingAddress;
        this.requireBillingAddress = requireBillingAddress;
        this.requireShippingAddress = requireShippingAddress;
        this.taxCode = taxCode;
        this.defaultProductPricePointId = defaultProductPricePointId;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.itemCategory = itemCategory;
        this.productPricePointId = productPricePointId;
        this.productPricePointHandle = productPricePointHandle;
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
     * The product name
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The product name
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Internal Getter for Handle.
     * The product API handle
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
     * The product API handle
     * @return Returns the String
     */
    public String getHandle() {
        return OptionalNullable.getFrom(handle);
    }

    /**
     * Setter for Handle.
     * The product API handle
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = OptionalNullable.of(handle);
    }

    /**
     * UnSetter for Handle.
     * The product API handle
     */
    public void unsetHandle() {
        handle = null;
    }

    /**
     * Getter for Description.
     * The product description
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * The product description
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
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
     * Getter for RequestCreditCard.
     * Deprecated value that can be ignored unless you have legacy hosted pages. For Public Signup
     * Page users, please read this attribute from under the signup page.
     * @return Returns the Boolean
     */
    @JsonGetter("request_credit_card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRequestCreditCard() {
        return requestCreditCard;
    }

    /**
     * Setter for RequestCreditCard.
     * Deprecated value that can be ignored unless you have legacy hosted pages. For Public Signup
     * Page users, please read this attribute from under the signup page.
     * @param requestCreditCard Value for Boolean
     */
    @JsonSetter("request_credit_card")
    public void setRequestCreditCard(Boolean requestCreditCard) {
        this.requestCreditCard = requestCreditCard;
    }

    /**
     * Internal Getter for ExpirationInterval.
     * A numerical interval for the length a subscription to this product will run before it
     * expires. See the description of interval for a description of how this value is coupled with
     * an interval unit to calculate the full interval
     * @return Returns the Internal Integer
     */
    @JsonGetter("expiration_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetExpirationInterval() {
        return this.expirationInterval;
    }

    /**
     * Getter for ExpirationInterval.
     * A numerical interval for the length a subscription to this product will run before it
     * expires. See the description of interval for a description of how this value is coupled with
     * an interval unit to calculate the full interval
     * @return Returns the Integer
     */
    public Integer getExpirationInterval() {
        return OptionalNullable.getFrom(expirationInterval);
    }

    /**
     * Setter for ExpirationInterval.
     * A numerical interval for the length a subscription to this product will run before it
     * expires. See the description of interval for a description of how this value is coupled with
     * an interval unit to calculate the full interval
     * @param expirationInterval Value for Integer
     */
    @JsonSetter("expiration_interval")
    public void setExpirationInterval(Integer expirationInterval) {
        this.expirationInterval = OptionalNullable.of(expirationInterval);
    }

    /**
     * UnSetter for ExpirationInterval.
     * A numerical interval for the length a subscription to this product will run before it
     * expires. See the description of interval for a description of how this value is coupled with
     * an interval unit to calculate the full interval
     */
    public void unsetExpirationInterval() {
        expirationInterval = null;
    }

    /**
     * Internal Getter for ExpirationIntervalUnit.
     * A string representing the trial interval unit for this product, either month or day
     * @return Returns the Internal ProductExpirationIntervalUnit
     */
    @JsonGetter("expiration_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<ProductExpirationIntervalUnit> internalGetExpirationIntervalUnit() {
        return this.expirationIntervalUnit;
    }

    /**
     * Getter for ExpirationIntervalUnit.
     * A string representing the trial interval unit for this product, either month or day
     * @return Returns the ProductExpirationIntervalUnit
     */
    public ProductExpirationIntervalUnit getExpirationIntervalUnit() {
        return OptionalNullable.getFrom(expirationIntervalUnit);
    }

    /**
     * Setter for ExpirationIntervalUnit.
     * A string representing the trial interval unit for this product, either month or day
     * @param expirationIntervalUnit Value for ProductExpirationIntervalUnit
     */
    @JsonSetter("expiration_interval_unit")
    public void setExpirationIntervalUnit(ProductExpirationIntervalUnit expirationIntervalUnit) {
        this.expirationIntervalUnit = OptionalNullable.of(expirationIntervalUnit);
    }

    /**
     * UnSetter for ExpirationIntervalUnit.
     * A string representing the trial interval unit for this product, either month or day
     */
    public void unsetExpirationIntervalUnit() {
        expirationIntervalUnit = null;
    }

    /**
     * Getter for CreatedAt.
     * Timestamp indicating when this product was created
     * @return Returns the String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * Timestamp indicating when this product was created
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * Timestamp indicating when this product was last updated
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * Timestamp indicating when this product was last updated
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for PriceInCents.
     * The product price, in integer cents
     * @return Returns the Integer
     */
    @JsonGetter("price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPriceInCents() {
        return priceInCents;
    }

    /**
     * Setter for PriceInCents.
     * The product price, in integer cents
     * @param priceInCents Value for Integer
     */
    @JsonSetter("price_in_cents")
    public void setPriceInCents(Integer priceInCents) {
        this.priceInCents = priceInCents;
    }

    /**
     * Getter for Interval.
     * The numerical interval. i.e. an interval of ‘30’ coupled with an interval_unit of day would
     * mean this product would renew every 30 days
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
     * mean this product would renew every 30 days
     * @param interval Value for Integer
     */
    @JsonSetter("interval")
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * Getter for IntervalUnit.
     * A string representing the interval unit for this product, either month or day
     * @return Returns the ProductIntervalUnit
     */
    @JsonGetter("interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProductIntervalUnit getIntervalUnit() {
        return intervalUnit;
    }

    /**
     * Setter for IntervalUnit.
     * A string representing the interval unit for this product, either month or day
     * @param intervalUnit Value for ProductIntervalUnit
     */
    @JsonSetter("interval_unit")
    public void setIntervalUnit(ProductIntervalUnit intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    /**
     * Internal Getter for InitialChargeInCents.
     * The up front charge you have specified.
     * @return Returns the Internal Integer
     */
    @JsonGetter("initial_charge_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetInitialChargeInCents() {
        return this.initialChargeInCents;
    }

    /**
     * Getter for InitialChargeInCents.
     * The up front charge you have specified.
     * @return Returns the Integer
     */
    public Integer getInitialChargeInCents() {
        return OptionalNullable.getFrom(initialChargeInCents);
    }

    /**
     * Setter for InitialChargeInCents.
     * The up front charge you have specified.
     * @param initialChargeInCents Value for Integer
     */
    @JsonSetter("initial_charge_in_cents")
    public void setInitialChargeInCents(Integer initialChargeInCents) {
        this.initialChargeInCents = OptionalNullable.of(initialChargeInCents);
    }

    /**
     * UnSetter for InitialChargeInCents.
     * The up front charge you have specified.
     */
    public void unsetInitialChargeInCents() {
        initialChargeInCents = null;
    }

    /**
     * Internal Getter for TrialPriceInCents.
     * The price of the trial period for a subscription to this product, in integer cents.
     * @return Returns the Internal Integer
     */
    @JsonGetter("trial_price_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetTrialPriceInCents() {
        return this.trialPriceInCents;
    }

    /**
     * Getter for TrialPriceInCents.
     * The price of the trial period for a subscription to this product, in integer cents.
     * @return Returns the Integer
     */
    public Integer getTrialPriceInCents() {
        return OptionalNullable.getFrom(trialPriceInCents);
    }

    /**
     * Setter for TrialPriceInCents.
     * The price of the trial period for a subscription to this product, in integer cents.
     * @param trialPriceInCents Value for Integer
     */
    @JsonSetter("trial_price_in_cents")
    public void setTrialPriceInCents(Integer trialPriceInCents) {
        this.trialPriceInCents = OptionalNullable.of(trialPriceInCents);
    }

    /**
     * UnSetter for TrialPriceInCents.
     * The price of the trial period for a subscription to this product, in integer cents.
     */
    public void unsetTrialPriceInCents() {
        trialPriceInCents = null;
    }

    /**
     * Internal Getter for TrialInterval.
     * A numerical interval for the length of the trial period of a subscription to this product.
     * See the description of interval for a description of how this value is coupled with an
     * interval unit to calculate the full interval
     * @return Returns the Internal Integer
     */
    @JsonGetter("trial_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetTrialInterval() {
        return this.trialInterval;
    }

    /**
     * Getter for TrialInterval.
     * A numerical interval for the length of the trial period of a subscription to this product.
     * See the description of interval for a description of how this value is coupled with an
     * interval unit to calculate the full interval
     * @return Returns the Integer
     */
    public Integer getTrialInterval() {
        return OptionalNullable.getFrom(trialInterval);
    }

    /**
     * Setter for TrialInterval.
     * A numerical interval for the length of the trial period of a subscription to this product.
     * See the description of interval for a description of how this value is coupled with an
     * interval unit to calculate the full interval
     * @param trialInterval Value for Integer
     */
    @JsonSetter("trial_interval")
    public void setTrialInterval(Integer trialInterval) {
        this.trialInterval = OptionalNullable.of(trialInterval);
    }

    /**
     * UnSetter for TrialInterval.
     * A numerical interval for the length of the trial period of a subscription to this product.
     * See the description of interval for a description of how this value is coupled with an
     * interval unit to calculate the full interval
     */
    public void unsetTrialInterval() {
        trialInterval = null;
    }

    /**
     * Internal Getter for TrialIntervalUnit.
     * A string representing the trial interval unit for this product, either month or day
     * @return Returns the Internal ProductTrialIntervalUnit
     */
    @JsonGetter("trial_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<ProductTrialIntervalUnit> internalGetTrialIntervalUnit() {
        return this.trialIntervalUnit;
    }

    /**
     * Getter for TrialIntervalUnit.
     * A string representing the trial interval unit for this product, either month or day
     * @return Returns the ProductTrialIntervalUnit
     */
    public ProductTrialIntervalUnit getTrialIntervalUnit() {
        return OptionalNullable.getFrom(trialIntervalUnit);
    }

    /**
     * Setter for TrialIntervalUnit.
     * A string representing the trial interval unit for this product, either month or day
     * @param trialIntervalUnit Value for ProductTrialIntervalUnit
     */
    @JsonSetter("trial_interval_unit")
    public void setTrialIntervalUnit(ProductTrialIntervalUnit trialIntervalUnit) {
        this.trialIntervalUnit = OptionalNullable.of(trialIntervalUnit);
    }

    /**
     * UnSetter for TrialIntervalUnit.
     * A string representing the trial interval unit for this product, either month or day
     */
    public void unsetTrialIntervalUnit() {
        trialIntervalUnit = null;
    }

    /**
     * Internal Getter for ArchivedAt.
     * Timestamp indicating when this product was archived
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
     * Timestamp indicating when this product was archived
     * @return Returns the String
     */
    public String getArchivedAt() {
        return OptionalNullable.getFrom(archivedAt);
    }

    /**
     * Setter for ArchivedAt.
     * Timestamp indicating when this product was archived
     * @param archivedAt Value for String
     */
    @JsonSetter("archived_at")
    public void setArchivedAt(String archivedAt) {
        this.archivedAt = OptionalNullable.of(archivedAt);
    }

    /**
     * UnSetter for ArchivedAt.
     * Timestamp indicating when this product was archived
     */
    public void unsetArchivedAt() {
        archivedAt = null;
    }

    /**
     * Getter for RequireCreditCard.
     * Boolean that controls whether a payment profile is required to be entered for customers
     * wishing to sign up on this product.
     * @return Returns the Boolean
     */
    @JsonGetter("require_credit_card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRequireCreditCard() {
        return requireCreditCard;
    }

    /**
     * Setter for RequireCreditCard.
     * Boolean that controls whether a payment profile is required to be entered for customers
     * wishing to sign up on this product.
     * @param requireCreditCard Value for Boolean
     */
    @JsonSetter("require_credit_card")
    public void setRequireCreditCard(Boolean requireCreditCard) {
        this.requireCreditCard = requireCreditCard;
    }

    /**
     * Internal Getter for ReturnParams.
     * @return Returns the Internal String
     */
    @JsonGetter("return_params")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetReturnParams() {
        return this.returnParams;
    }

    /**
     * Getter for ReturnParams.
     * @return Returns the String
     */
    public String getReturnParams() {
        return OptionalNullable.getFrom(returnParams);
    }

    /**
     * Setter for ReturnParams.
     * @param returnParams Value for String
     */
    @JsonSetter("return_params")
    public void setReturnParams(String returnParams) {
        this.returnParams = OptionalNullable.of(returnParams);
    }

    /**
     * UnSetter for ReturnParams.
     */
    public void unsetReturnParams() {
        returnParams = null;
    }

    /**
     * Getter for Taxable.
     * @return Returns the Boolean
     */
    @JsonGetter("taxable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTaxable() {
        return taxable;
    }

    /**
     * Setter for Taxable.
     * @param taxable Value for Boolean
     */
    @JsonSetter("taxable")
    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    /**
     * Internal Getter for UpdateReturnUrl.
     * The url to which a customer will be returned after a successful account update
     * @return Returns the Internal String
     */
    @JsonGetter("update_return_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetUpdateReturnUrl() {
        return this.updateReturnUrl;
    }

    /**
     * Getter for UpdateReturnUrl.
     * The url to which a customer will be returned after a successful account update
     * @return Returns the String
     */
    public String getUpdateReturnUrl() {
        return OptionalNullable.getFrom(updateReturnUrl);
    }

    /**
     * Setter for UpdateReturnUrl.
     * The url to which a customer will be returned after a successful account update
     * @param updateReturnUrl Value for String
     */
    @JsonSetter("update_return_url")
    public void setUpdateReturnUrl(String updateReturnUrl) {
        this.updateReturnUrl = OptionalNullable.of(updateReturnUrl);
    }

    /**
     * UnSetter for UpdateReturnUrl.
     * The url to which a customer will be returned after a successful account update
     */
    public void unsetUpdateReturnUrl() {
        updateReturnUrl = null;
    }

    /**
     * Getter for InitialChargeAfterTrial.
     * @return Returns the Boolean
     */
    @JsonGetter("initial_charge_after_trial")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getInitialChargeAfterTrial() {
        return initialChargeAfterTrial;
    }

    /**
     * Setter for InitialChargeAfterTrial.
     * @param initialChargeAfterTrial Value for Boolean
     */
    @JsonSetter("initial_charge_after_trial")
    public void setInitialChargeAfterTrial(Boolean initialChargeAfterTrial) {
        this.initialChargeAfterTrial = initialChargeAfterTrial;
    }

    /**
     * Getter for VersionNumber.
     * The version of the product
     * @return Returns the Integer
     */
    @JsonGetter("version_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * Setter for VersionNumber.
     * The version of the product
     * @param versionNumber Value for Integer
     */
    @JsonSetter("version_number")
    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * Internal Getter for UpdateReturnParams.
     * The parameters will append to the url after a successful account update. See [help
     * documentation](https://help.chargify.com/products/product-editing.html#return-parameters-after-account-update)
     * @return Returns the Internal String
     */
    @JsonGetter("update_return_params")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetUpdateReturnParams() {
        return this.updateReturnParams;
    }

    /**
     * Getter for UpdateReturnParams.
     * The parameters will append to the url after a successful account update. See [help
     * documentation](https://help.chargify.com/products/product-editing.html#return-parameters-after-account-update)
     * @return Returns the String
     */
    public String getUpdateReturnParams() {
        return OptionalNullable.getFrom(updateReturnParams);
    }

    /**
     * Setter for UpdateReturnParams.
     * The parameters will append to the url after a successful account update. See [help
     * documentation](https://help.chargify.com/products/product-editing.html#return-parameters-after-account-update)
     * @param updateReturnParams Value for String
     */
    @JsonSetter("update_return_params")
    public void setUpdateReturnParams(String updateReturnParams) {
        this.updateReturnParams = OptionalNullable.of(updateReturnParams);
    }

    /**
     * UnSetter for UpdateReturnParams.
     * The parameters will append to the url after a successful account update. See [help
     * documentation](https://help.chargify.com/products/product-editing.html#return-parameters-after-account-update)
     */
    public void unsetUpdateReturnParams() {
        updateReturnParams = null;
    }

    /**
     * Getter for ProductFamily.
     * @return Returns the ProductFamily
     */
    @JsonGetter("product_family")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProductFamily getProductFamily() {
        return productFamily;
    }

    /**
     * Setter for ProductFamily.
     * @param productFamily Value for ProductFamily
     */
    @JsonSetter("product_family")
    public void setProductFamily(ProductFamily productFamily) {
        this.productFamily = productFamily;
    }

    /**
     * Getter for PublicSignupPages.
     * @return Returns the List of PublicSignupPage
     */
    @JsonGetter("public_signup_pages")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PublicSignupPage> getPublicSignupPages() {
        return publicSignupPages;
    }

    /**
     * Setter for PublicSignupPages.
     * @param publicSignupPages Value for List of PublicSignupPage
     */
    @JsonSetter("public_signup_pages")
    public void setPublicSignupPages(List<PublicSignupPage> publicSignupPages) {
        this.publicSignupPages = publicSignupPages;
    }

    /**
     * Getter for ProductPricePointName.
     * @return Returns the String
     */
    @JsonGetter("product_price_point_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductPricePointName() {
        return productPricePointName;
    }

    /**
     * Setter for ProductPricePointName.
     * @param productPricePointName Value for String
     */
    @JsonSetter("product_price_point_name")
    public void setProductPricePointName(String productPricePointName) {
        this.productPricePointName = productPricePointName;
    }

    /**
     * Getter for RequestBillingAddress.
     * A boolean indicating whether to request a billing address on any Self-Service Pages that are
     * used by subscribers of this product.
     * @return Returns the Boolean
     */
    @JsonGetter("request_billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRequestBillingAddress() {
        return requestBillingAddress;
    }

    /**
     * Setter for RequestBillingAddress.
     * A boolean indicating whether to request a billing address on any Self-Service Pages that are
     * used by subscribers of this product.
     * @param requestBillingAddress Value for Boolean
     */
    @JsonSetter("request_billing_address")
    public void setRequestBillingAddress(Boolean requestBillingAddress) {
        this.requestBillingAddress = requestBillingAddress;
    }

    /**
     * Getter for RequireBillingAddress.
     * A boolean indicating whether a billing address is required to add a payment profile,
     * especially at signup.
     * @return Returns the Boolean
     */
    @JsonGetter("require_billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRequireBillingAddress() {
        return requireBillingAddress;
    }

    /**
     * Setter for RequireBillingAddress.
     * A boolean indicating whether a billing address is required to add a payment profile,
     * especially at signup.
     * @param requireBillingAddress Value for Boolean
     */
    @JsonSetter("require_billing_address")
    public void setRequireBillingAddress(Boolean requireBillingAddress) {
        this.requireBillingAddress = requireBillingAddress;
    }

    /**
     * Getter for RequireShippingAddress.
     * A boolean indicating whether a shipping address is required for the customer, especially at
     * signup.
     * @return Returns the Boolean
     */
    @JsonGetter("require_shipping_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRequireShippingAddress() {
        return requireShippingAddress;
    }

    /**
     * Setter for RequireShippingAddress.
     * A boolean indicating whether a shipping address is required for the customer, especially at
     * signup.
     * @param requireShippingAddress Value for Boolean
     */
    @JsonSetter("require_shipping_address")
    public void setRequireShippingAddress(Boolean requireShippingAddress) {
        this.requireShippingAddress = requireShippingAddress;
    }

    /**
     * Internal Getter for TaxCode.
     * A string representing the tax code related to the product type. This is especially important
     * when using the Avalara service to tax based on locale. This attribute has a max length of 10
     * characters.
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
     * A string representing the tax code related to the product type. This is especially important
     * when using the Avalara service to tax based on locale. This attribute has a max length of 10
     * characters.
     * @return Returns the String
     */
    public String getTaxCode() {
        return OptionalNullable.getFrom(taxCode);
    }

    /**
     * Setter for TaxCode.
     * A string representing the tax code related to the product type. This is especially important
     * when using the Avalara service to tax based on locale. This attribute has a max length of 10
     * characters.
     * @param taxCode Value for String
     */
    @JsonSetter("tax_code")
    public void setTaxCode(String taxCode) {
        this.taxCode = OptionalNullable.of(taxCode);
    }

    /**
     * UnSetter for TaxCode.
     * A string representing the tax code related to the product type. This is especially important
     * when using the Avalara service to tax based on locale. This attribute has a max length of 10
     * characters.
     */
    public void unsetTaxCode() {
        taxCode = null;
    }

    /**
     * Getter for DefaultProductPricePointId.
     * @return Returns the Integer
     */
    @JsonGetter("default_product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDefaultProductPricePointId() {
        return defaultProductPricePointId;
    }

    /**
     * Setter for DefaultProductPricePointId.
     * @param defaultProductPricePointId Value for Integer
     */
    @JsonSetter("default_product_price_point_id")
    public void setDefaultProductPricePointId(Integer defaultProductPricePointId) {
        this.defaultProductPricePointId = defaultProductPricePointId;
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
     * Internal Getter for ItemCategory.
     * One of the following: Business Software, Consumer Software, Digital Services, Physical Goods,
     * Other
     * @return Returns the Internal String
     */
    @JsonGetter("item_category")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetItemCategory() {
        return this.itemCategory;
    }

    /**
     * Getter for ItemCategory.
     * One of the following: Business Software, Consumer Software, Digital Services, Physical Goods,
     * Other
     * @return Returns the String
     */
    public String getItemCategory() {
        return OptionalNullable.getFrom(itemCategory);
    }

    /**
     * Setter for ItemCategory.
     * One of the following: Business Software, Consumer Software, Digital Services, Physical Goods,
     * Other
     * @param itemCategory Value for String
     */
    @JsonSetter("item_category")
    public void setItemCategory(String itemCategory) {
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
     * Internal Getter for ProductPricePointHandle.
     * @return Returns the Internal String
     */
    @JsonGetter("product_price_point_handle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetProductPricePointHandle() {
        return this.productPricePointHandle;
    }

    /**
     * Getter for ProductPricePointHandle.
     * @return Returns the String
     */
    public String getProductPricePointHandle() {
        return OptionalNullable.getFrom(productPricePointHandle);
    }

    /**
     * Setter for ProductPricePointHandle.
     * @param productPricePointHandle Value for String
     */
    @JsonSetter("product_price_point_handle")
    public void setProductPricePointHandle(String productPricePointHandle) {
        this.productPricePointHandle = OptionalNullable.of(productPricePointHandle);
    }

    /**
     * UnSetter for ProductPricePointHandle.
     */
    public void unsetProductPricePointHandle() {
        productPricePointHandle = null;
    }

    /**
     * Converts this Product into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Product [" + "id=" + id + ", name=" + name + ", handle=" + handle + ", description="
                + description + ", accountingCode=" + accountingCode + ", requestCreditCard="
                + requestCreditCard + ", expirationInterval=" + expirationInterval
                + ", expirationIntervalUnit=" + expirationIntervalUnit + ", createdAt=" + createdAt
                + ", updatedAt=" + updatedAt + ", priceInCents=" + priceInCents + ", interval="
                + interval + ", intervalUnit=" + intervalUnit + ", initialChargeInCents="
                + initialChargeInCents + ", trialPriceInCents=" + trialPriceInCents
                + ", trialInterval=" + trialInterval + ", trialIntervalUnit=" + trialIntervalUnit
                + ", archivedAt=" + archivedAt + ", requireCreditCard=" + requireCreditCard
                + ", returnParams=" + returnParams + ", taxable=" + taxable + ", updateReturnUrl="
                + updateReturnUrl + ", initialChargeAfterTrial=" + initialChargeAfterTrial
                + ", versionNumber=" + versionNumber + ", updateReturnParams=" + updateReturnParams
                + ", productFamily=" + productFamily + ", publicSignupPages=" + publicSignupPages
                + ", productPricePointName=" + productPricePointName + ", requestBillingAddress="
                + requestBillingAddress + ", requireBillingAddress=" + requireBillingAddress
                + ", requireShippingAddress=" + requireShippingAddress + ", taxCode=" + taxCode
                + ", defaultProductPricePointId=" + defaultProductPricePointId
                + ", useSiteExchangeRate=" + useSiteExchangeRate + ", itemCategory=" + itemCategory
                + ", productPricePointId=" + productPricePointId + ", productPricePointHandle="
                + productPricePointHandle + "]";
    }

    /**
     * Builds a new {@link Product.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Product.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .description(getDescription())
                .requestCreditCard(getRequestCreditCard())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .priceInCents(getPriceInCents())
                .interval(getInterval())
                .intervalUnit(getIntervalUnit())
                .requireCreditCard(getRequireCreditCard())
                .taxable(getTaxable())
                .initialChargeAfterTrial(getInitialChargeAfterTrial())
                .versionNumber(getVersionNumber())
                .productFamily(getProductFamily())
                .publicSignupPages(getPublicSignupPages())
                .productPricePointName(getProductPricePointName())
                .requestBillingAddress(getRequestBillingAddress())
                .requireBillingAddress(getRequireBillingAddress())
                .requireShippingAddress(getRequireShippingAddress())
                .defaultProductPricePointId(getDefaultProductPricePointId())
                .productPricePointId(getProductPricePointId());
        builder.handle = internalGetHandle();
        builder.accountingCode = internalGetAccountingCode();
        builder.expirationInterval = internalGetExpirationInterval();
        builder.expirationIntervalUnit = internalGetExpirationIntervalUnit();
        builder.initialChargeInCents = internalGetInitialChargeInCents();
        builder.trialPriceInCents = internalGetTrialPriceInCents();
        builder.trialInterval = internalGetTrialInterval();
        builder.trialIntervalUnit = internalGetTrialIntervalUnit();
        builder.archivedAt = internalGetArchivedAt();
        builder.returnParams = internalGetReturnParams();
        builder.updateReturnUrl = internalGetUpdateReturnUrl();
        builder.updateReturnParams = internalGetUpdateReturnParams();
        builder.taxCode = internalGetTaxCode();
        builder.useSiteExchangeRate = internalGetUseSiteExchangeRate();
        builder.itemCategory = internalGetItemCategory();
        builder.productPricePointHandle = internalGetProductPricePointHandle();
        return builder;
    }

    /**
     * Class to build instances of {@link Product}.
     */
    public static class Builder {
        private Integer id;
        private String name;
        private OptionalNullable<String> handle;
        private String description;
        private OptionalNullable<String> accountingCode;
        private Boolean requestCreditCard;
        private OptionalNullable<Integer> expirationInterval;
        private OptionalNullable<ProductExpirationIntervalUnit> expirationIntervalUnit;
        private String createdAt;
        private String updatedAt;
        private Integer priceInCents;
        private Integer interval;
        private ProductIntervalUnit intervalUnit;
        private OptionalNullable<Integer> initialChargeInCents;
        private OptionalNullable<Integer> trialPriceInCents;
        private OptionalNullable<Integer> trialInterval;
        private OptionalNullable<ProductTrialIntervalUnit> trialIntervalUnit;
        private OptionalNullable<String> archivedAt;
        private Boolean requireCreditCard;
        private OptionalNullable<String> returnParams;
        private Boolean taxable;
        private OptionalNullable<String> updateReturnUrl;
        private Boolean initialChargeAfterTrial;
        private Integer versionNumber;
        private OptionalNullable<String> updateReturnParams;
        private ProductFamily productFamily;
        private List<PublicSignupPage> publicSignupPages;
        private String productPricePointName;
        private Boolean requestBillingAddress;
        private Boolean requireBillingAddress;
        private Boolean requireShippingAddress;
        private OptionalNullable<String> taxCode;
        private Integer defaultProductPricePointId;
        private OptionalNullable<Boolean> useSiteExchangeRate;
        private OptionalNullable<String> itemCategory;
        private Integer productPricePointId;
        private OptionalNullable<String> productPricePointHandle;



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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
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
         * Setter for requestCreditCard.
         * @param  requestCreditCard  Boolean value for requestCreditCard.
         * @return Builder
         */
        public Builder requestCreditCard(Boolean requestCreditCard) {
            this.requestCreditCard = requestCreditCard;
            return this;
        }

        /**
         * Setter for expirationInterval.
         * @param  expirationInterval  Integer value for expirationInterval.
         * @return Builder
         */
        public Builder expirationInterval(Integer expirationInterval) {
            this.expirationInterval = OptionalNullable.of(expirationInterval);
            return this;
        }

        /**
         * UnSetter for expirationInterval.
         * @return Builder
         */
        public Builder unsetExpirationInterval() {
            expirationInterval = null;
            return this;
        }

        /**
         * Setter for expirationIntervalUnit.
         * @param  expirationIntervalUnit  ProductExpirationIntervalUnit value for
         *         expirationIntervalUnit.
         * @return Builder
         */
        public Builder expirationIntervalUnit(
                ProductExpirationIntervalUnit expirationIntervalUnit) {
            this.expirationIntervalUnit = OptionalNullable.of(expirationIntervalUnit);
            return this;
        }

        /**
         * UnSetter for expirationIntervalUnit.
         * @return Builder
         */
        public Builder unsetExpirationIntervalUnit() {
            expirationIntervalUnit = null;
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
         * Setter for priceInCents.
         * @param  priceInCents  Integer value for priceInCents.
         * @return Builder
         */
        public Builder priceInCents(Integer priceInCents) {
            this.priceInCents = priceInCents;
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
         * @param  intervalUnit  ProductIntervalUnit value for intervalUnit.
         * @return Builder
         */
        public Builder intervalUnit(ProductIntervalUnit intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }

        /**
         * Setter for initialChargeInCents.
         * @param  initialChargeInCents  Integer value for initialChargeInCents.
         * @return Builder
         */
        public Builder initialChargeInCents(Integer initialChargeInCents) {
            this.initialChargeInCents = OptionalNullable.of(initialChargeInCents);
            return this;
        }

        /**
         * UnSetter for initialChargeInCents.
         * @return Builder
         */
        public Builder unsetInitialChargeInCents() {
            initialChargeInCents = null;
            return this;
        }

        /**
         * Setter for trialPriceInCents.
         * @param  trialPriceInCents  Integer value for trialPriceInCents.
         * @return Builder
         */
        public Builder trialPriceInCents(Integer trialPriceInCents) {
            this.trialPriceInCents = OptionalNullable.of(trialPriceInCents);
            return this;
        }

        /**
         * UnSetter for trialPriceInCents.
         * @return Builder
         */
        public Builder unsetTrialPriceInCents() {
            trialPriceInCents = null;
            return this;
        }

        /**
         * Setter for trialInterval.
         * @param  trialInterval  Integer value for trialInterval.
         * @return Builder
         */
        public Builder trialInterval(Integer trialInterval) {
            this.trialInterval = OptionalNullable.of(trialInterval);
            return this;
        }

        /**
         * UnSetter for trialInterval.
         * @return Builder
         */
        public Builder unsetTrialInterval() {
            trialInterval = null;
            return this;
        }

        /**
         * Setter for trialIntervalUnit.
         * @param  trialIntervalUnit  ProductTrialIntervalUnit value for trialIntervalUnit.
         * @return Builder
         */
        public Builder trialIntervalUnit(ProductTrialIntervalUnit trialIntervalUnit) {
            this.trialIntervalUnit = OptionalNullable.of(trialIntervalUnit);
            return this;
        }

        /**
         * UnSetter for trialIntervalUnit.
         * @return Builder
         */
        public Builder unsetTrialIntervalUnit() {
            trialIntervalUnit = null;
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
         * Setter for requireCreditCard.
         * @param  requireCreditCard  Boolean value for requireCreditCard.
         * @return Builder
         */
        public Builder requireCreditCard(Boolean requireCreditCard) {
            this.requireCreditCard = requireCreditCard;
            return this;
        }

        /**
         * Setter for returnParams.
         * @param  returnParams  String value for returnParams.
         * @return Builder
         */
        public Builder returnParams(String returnParams) {
            this.returnParams = OptionalNullable.of(returnParams);
            return this;
        }

        /**
         * UnSetter for returnParams.
         * @return Builder
         */
        public Builder unsetReturnParams() {
            returnParams = null;
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
         * Setter for updateReturnUrl.
         * @param  updateReturnUrl  String value for updateReturnUrl.
         * @return Builder
         */
        public Builder updateReturnUrl(String updateReturnUrl) {
            this.updateReturnUrl = OptionalNullable.of(updateReturnUrl);
            return this;
        }

        /**
         * UnSetter for updateReturnUrl.
         * @return Builder
         */
        public Builder unsetUpdateReturnUrl() {
            updateReturnUrl = null;
            return this;
        }

        /**
         * Setter for initialChargeAfterTrial.
         * @param  initialChargeAfterTrial  Boolean value for initialChargeAfterTrial.
         * @return Builder
         */
        public Builder initialChargeAfterTrial(Boolean initialChargeAfterTrial) {
            this.initialChargeAfterTrial = initialChargeAfterTrial;
            return this;
        }

        /**
         * Setter for versionNumber.
         * @param  versionNumber  Integer value for versionNumber.
         * @return Builder
         */
        public Builder versionNumber(Integer versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }

        /**
         * Setter for updateReturnParams.
         * @param  updateReturnParams  String value for updateReturnParams.
         * @return Builder
         */
        public Builder updateReturnParams(String updateReturnParams) {
            this.updateReturnParams = OptionalNullable.of(updateReturnParams);
            return this;
        }

        /**
         * UnSetter for updateReturnParams.
         * @return Builder
         */
        public Builder unsetUpdateReturnParams() {
            updateReturnParams = null;
            return this;
        }

        /**
         * Setter for productFamily.
         * @param  productFamily  ProductFamily value for productFamily.
         * @return Builder
         */
        public Builder productFamily(ProductFamily productFamily) {
            this.productFamily = productFamily;
            return this;
        }

        /**
         * Setter for publicSignupPages.
         * @param  publicSignupPages  List of PublicSignupPage value for publicSignupPages.
         * @return Builder
         */
        public Builder publicSignupPages(List<PublicSignupPage> publicSignupPages) {
            this.publicSignupPages = publicSignupPages;
            return this;
        }

        /**
         * Setter for productPricePointName.
         * @param  productPricePointName  String value for productPricePointName.
         * @return Builder
         */
        public Builder productPricePointName(String productPricePointName) {
            this.productPricePointName = productPricePointName;
            return this;
        }

        /**
         * Setter for requestBillingAddress.
         * @param  requestBillingAddress  Boolean value for requestBillingAddress.
         * @return Builder
         */
        public Builder requestBillingAddress(Boolean requestBillingAddress) {
            this.requestBillingAddress = requestBillingAddress;
            return this;
        }

        /**
         * Setter for requireBillingAddress.
         * @param  requireBillingAddress  Boolean value for requireBillingAddress.
         * @return Builder
         */
        public Builder requireBillingAddress(Boolean requireBillingAddress) {
            this.requireBillingAddress = requireBillingAddress;
            return this;
        }

        /**
         * Setter for requireShippingAddress.
         * @param  requireShippingAddress  Boolean value for requireShippingAddress.
         * @return Builder
         */
        public Builder requireShippingAddress(Boolean requireShippingAddress) {
            this.requireShippingAddress = requireShippingAddress;
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
         * Setter for defaultProductPricePointId.
         * @param  defaultProductPricePointId  Integer value for defaultProductPricePointId.
         * @return Builder
         */
        public Builder defaultProductPricePointId(Integer defaultProductPricePointId) {
            this.defaultProductPricePointId = defaultProductPricePointId;
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
         * Setter for itemCategory.
         * @param  itemCategory  String value for itemCategory.
         * @return Builder
         */
        public Builder itemCategory(String itemCategory) {
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
         * Setter for productPricePointId.
         * @param  productPricePointId  Integer value for productPricePointId.
         * @return Builder
         */
        public Builder productPricePointId(Integer productPricePointId) {
            this.productPricePointId = productPricePointId;
            return this;
        }

        /**
         * Setter for productPricePointHandle.
         * @param  productPricePointHandle  String value for productPricePointHandle.
         * @return Builder
         */
        public Builder productPricePointHandle(String productPricePointHandle) {
            this.productPricePointHandle = OptionalNullable.of(productPricePointHandle);
            return this;
        }

        /**
         * UnSetter for productPricePointHandle.
         * @return Builder
         */
        public Builder unsetProductPricePointHandle() {
            productPricePointHandle = null;
            return this;
        }

        /**
         * Builds a new {@link Product} object using the set fields.
         * @return {@link Product}
         */
        public Product build() {
            return new Product(id, name, handle, description, accountingCode, requestCreditCard,
                    expirationInterval, expirationIntervalUnit, createdAt, updatedAt, priceInCents,
                    interval, intervalUnit, initialChargeInCents, trialPriceInCents, trialInterval,
                    trialIntervalUnit, archivedAt, requireCreditCard, returnParams, taxable,
                    updateReturnUrl, initialChargeAfterTrial, versionNumber, updateReturnParams,
                    productFamily, publicSignupPages, productPricePointName, requestBillingAddress,
                    requireBillingAddress, requireShippingAddress, taxCode,
                    defaultProductPricePointId, useSiteExchangeRate, itemCategory,
                    productPricePointId, productPricePointHandle);
        }
    }
}
