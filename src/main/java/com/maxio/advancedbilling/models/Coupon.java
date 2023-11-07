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
import com.maxio.advancedbilling.models.containers.CouponCompoundingStrategy;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for Coupon type.
 */
public class Coupon {
    private Double id;
    private String name;
    private String code;
    private String description;
    private OptionalNullable<Double> amount;
    private OptionalNullable<Integer> amountInCents;
    private Integer productFamilyId;
    private String productFamilyName;
    private String startDate;
    private OptionalNullable<String> endDate;
    private OptionalNullable<Double> percentage;
    private Boolean recurring;
    private RecurringScheme recurringScheme;
    private OptionalNullable<Integer> durationPeriodCount;
    private OptionalNullable<Integer> durationInterval;
    private OptionalNullable<String> durationIntervalUnit;
    private String durationIntervalSpan;
    private Boolean allowNegativeBalance;
    private OptionalNullable<String> archivedAt;
    private OptionalNullable<String> conversionLimit;
    private Boolean stackable;
    private CouponCompoundingStrategy compoundingStrategy;
    private Boolean useSiteExchangeRate;
    private String createdAt;
    private String updatedAt;
    private DiscountType discountType;
    private Boolean excludeMidPeriodAllocations;
    private Boolean applyOnCancelAtEndOfPeriod;
    private List<CouponRestriction> couponRestrictions;

    /**
     * Default constructor.
     */
    public Coupon() {
    }

    /**
     * Initialization constructor.
     * @param  id  Double value for id.
     * @param  name  String value for name.
     * @param  code  String value for code.
     * @param  description  String value for description.
     * @param  amount  Double value for amount.
     * @param  amountInCents  Integer value for amountInCents.
     * @param  productFamilyId  Integer value for productFamilyId.
     * @param  productFamilyName  String value for productFamilyName.
     * @param  startDate  String value for startDate.
     * @param  endDate  String value for endDate.
     * @param  percentage  Double value for percentage.
     * @param  recurring  Boolean value for recurring.
     * @param  recurringScheme  RecurringScheme value for recurringScheme.
     * @param  durationPeriodCount  Integer value for durationPeriodCount.
     * @param  durationInterval  Integer value for durationInterval.
     * @param  durationIntervalUnit  String value for durationIntervalUnit.
     * @param  durationIntervalSpan  String value for durationIntervalSpan.
     * @param  allowNegativeBalance  Boolean value for allowNegativeBalance.
     * @param  archivedAt  String value for archivedAt.
     * @param  conversionLimit  String value for conversionLimit.
     * @param  stackable  Boolean value for stackable.
     * @param  compoundingStrategy  CouponCompoundingStrategy value for compoundingStrategy.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  discountType  DiscountType value for discountType.
     * @param  excludeMidPeriodAllocations  Boolean value for excludeMidPeriodAllocations.
     * @param  applyOnCancelAtEndOfPeriod  Boolean value for applyOnCancelAtEndOfPeriod.
     * @param  couponRestrictions  List of CouponRestriction value for couponRestrictions.
     */
    public Coupon(
            Double id,
            String name,
            String code,
            String description,
            Double amount,
            Integer amountInCents,
            Integer productFamilyId,
            String productFamilyName,
            String startDate,
            String endDate,
            Double percentage,
            Boolean recurring,
            RecurringScheme recurringScheme,
            Integer durationPeriodCount,
            Integer durationInterval,
            String durationIntervalUnit,
            String durationIntervalSpan,
            Boolean allowNegativeBalance,
            String archivedAt,
            String conversionLimit,
            Boolean stackable,
            CouponCompoundingStrategy compoundingStrategy,
            Boolean useSiteExchangeRate,
            String createdAt,
            String updatedAt,
            DiscountType discountType,
            Boolean excludeMidPeriodAllocations,
            Boolean applyOnCancelAtEndOfPeriod,
            List<CouponRestriction> couponRestrictions) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.description = description;
        this.amount = OptionalNullable.of(amount);
        this.amountInCents = OptionalNullable.of(amountInCents);
        this.productFamilyId = productFamilyId;
        this.productFamilyName = productFamilyName;
        this.startDate = startDate;
        this.endDate = OptionalNullable.of(endDate);
        this.percentage = OptionalNullable.of(percentage);
        this.recurring = recurring;
        this.recurringScheme = recurringScheme;
        this.durationPeriodCount = OptionalNullable.of(durationPeriodCount);
        this.durationInterval = OptionalNullable.of(durationInterval);
        this.durationIntervalUnit = OptionalNullable.of(durationIntervalUnit);
        this.durationIntervalSpan = durationIntervalSpan;
        this.allowNegativeBalance = allowNegativeBalance;
        this.archivedAt = OptionalNullable.of(archivedAt);
        this.conversionLimit = OptionalNullable.of(conversionLimit);
        this.stackable = stackable;
        this.compoundingStrategy = compoundingStrategy;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.discountType = discountType;
        this.excludeMidPeriodAllocations = excludeMidPeriodAllocations;
        this.applyOnCancelAtEndOfPeriod = applyOnCancelAtEndOfPeriod;
        this.couponRestrictions = couponRestrictions;
    }

    /**
     * Initialization constructor.
     * @param  id  Double value for id.
     * @param  name  String value for name.
     * @param  code  String value for code.
     * @param  description  String value for description.
     * @param  amount  Double value for amount.
     * @param  amountInCents  Integer value for amountInCents.
     * @param  productFamilyId  Integer value for productFamilyId.
     * @param  productFamilyName  String value for productFamilyName.
     * @param  startDate  String value for startDate.
     * @param  endDate  String value for endDate.
     * @param  percentage  Double value for percentage.
     * @param  recurring  Boolean value for recurring.
     * @param  recurringScheme  RecurringScheme value for recurringScheme.
     * @param  durationPeriodCount  Integer value for durationPeriodCount.
     * @param  durationInterval  Integer value for durationInterval.
     * @param  durationIntervalUnit  String value for durationIntervalUnit.
     * @param  durationIntervalSpan  String value for durationIntervalSpan.
     * @param  allowNegativeBalance  Boolean value for allowNegativeBalance.
     * @param  archivedAt  String value for archivedAt.
     * @param  conversionLimit  String value for conversionLimit.
     * @param  stackable  Boolean value for stackable.
     * @param  compoundingStrategy  CouponCompoundingStrategy value for compoundingStrategy.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  discountType  DiscountType value for discountType.
     * @param  excludeMidPeriodAllocations  Boolean value for excludeMidPeriodAllocations.
     * @param  applyOnCancelAtEndOfPeriod  Boolean value for applyOnCancelAtEndOfPeriod.
     * @param  couponRestrictions  List of CouponRestriction value for couponRestrictions.
     */

    protected Coupon(Double id, String name, String code, String description,
            OptionalNullable<Double> amount, OptionalNullable<Integer> amountInCents,
            Integer productFamilyId, String productFamilyName, String startDate,
            OptionalNullable<String> endDate, OptionalNullable<Double> percentage,
            Boolean recurring, RecurringScheme recurringScheme,
            OptionalNullable<Integer> durationPeriodCount,
            OptionalNullable<Integer> durationInterval,
            OptionalNullable<String> durationIntervalUnit, String durationIntervalSpan,
            Boolean allowNegativeBalance, OptionalNullable<String> archivedAt,
            OptionalNullable<String> conversionLimit, Boolean stackable,
            CouponCompoundingStrategy compoundingStrategy, Boolean useSiteExchangeRate,
            String createdAt, String updatedAt, DiscountType discountType,
            Boolean excludeMidPeriodAllocations, Boolean applyOnCancelAtEndOfPeriod,
            List<CouponRestriction> couponRestrictions) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.description = description;
        this.amount = amount;
        this.amountInCents = amountInCents;
        this.productFamilyId = productFamilyId;
        this.productFamilyName = productFamilyName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.percentage = percentage;
        this.recurring = recurring;
        this.recurringScheme = recurringScheme;
        this.durationPeriodCount = durationPeriodCount;
        this.durationInterval = durationInterval;
        this.durationIntervalUnit = durationIntervalUnit;
        this.durationIntervalSpan = durationIntervalSpan;
        this.allowNegativeBalance = allowNegativeBalance;
        this.archivedAt = archivedAt;
        this.conversionLimit = conversionLimit;
        this.stackable = stackable;
        this.compoundingStrategy = compoundingStrategy;
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.discountType = discountType;
        this.excludeMidPeriodAllocations = excludeMidPeriodAllocations;
        this.applyOnCancelAtEndOfPeriod = applyOnCancelAtEndOfPeriod;
        this.couponRestrictions = couponRestrictions;
    }

    /**
     * Getter for Id.
     * @return Returns the Double
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Double
     */
    @JsonSetter("id")
    public void setId(Double id) {
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
     * Getter for Code.
     * @return Returns the String
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
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
     * Internal Getter for Amount.
     * @return Returns the Internal Double
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetAmount() {
        return this.amount;
    }

    /**
     * Getter for Amount.
     * @return Returns the Double
     */
    public Double getAmount() {
        return OptionalNullable.getFrom(amount);
    }

    /**
     * Setter for Amount.
     * @param amount Value for Double
     */
    @JsonSetter("amount")
    public void setAmount(Double amount) {
        this.amount = OptionalNullable.of(amount);
    }

    /**
     * UnSetter for Amount.
     */
    public void unsetAmount() {
        amount = null;
    }

    /**
     * Internal Getter for AmountInCents.
     * @return Returns the Internal Integer
     */
    @JsonGetter("amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetAmountInCents() {
        return this.amountInCents;
    }

    /**
     * Getter for AmountInCents.
     * @return Returns the Integer
     */
    public Integer getAmountInCents() {
        return OptionalNullable.getFrom(amountInCents);
    }

    /**
     * Setter for AmountInCents.
     * @param amountInCents Value for Integer
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(Integer amountInCents) {
        this.amountInCents = OptionalNullable.of(amountInCents);
    }

    /**
     * UnSetter for AmountInCents.
     */
    public void unsetAmountInCents() {
        amountInCents = null;
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
     * Getter for ProductFamilyName.
     * @return Returns the String
     */
    @JsonGetter("product_family_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductFamilyName() {
        return productFamilyName;
    }

    /**
     * Setter for ProductFamilyName.
     * @param productFamilyName Value for String
     */
    @JsonSetter("product_family_name")
    public void setProductFamilyName(String productFamilyName) {
        this.productFamilyName = productFamilyName;
    }

    /**
     * Getter for StartDate.
     * @return Returns the String
     */
    @JsonGetter("start_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartDate() {
        return startDate;
    }

    /**
     * Setter for StartDate.
     * @param startDate Value for String
     */
    @JsonSetter("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Internal Getter for EndDate.
     * @return Returns the Internal String
     */
    @JsonGetter("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetEndDate() {
        return this.endDate;
    }

    /**
     * Getter for EndDate.
     * @return Returns the String
     */
    public String getEndDate() {
        return OptionalNullable.getFrom(endDate);
    }

    /**
     * Setter for EndDate.
     * @param endDate Value for String
     */
    @JsonSetter("end_date")
    public void setEndDate(String endDate) {
        this.endDate = OptionalNullable.of(endDate);
    }

    /**
     * UnSetter for EndDate.
     */
    public void unsetEndDate() {
        endDate = null;
    }

    /**
     * Internal Getter for Percentage.
     * @return Returns the Internal Double
     */
    @JsonGetter("percentage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetPercentage() {
        return this.percentage;
    }

    /**
     * Getter for Percentage.
     * @return Returns the Double
     */
    public Double getPercentage() {
        return OptionalNullable.getFrom(percentage);
    }

    /**
     * Setter for Percentage.
     * @param percentage Value for Double
     */
    @JsonSetter("percentage")
    public void setPercentage(Double percentage) {
        this.percentage = OptionalNullable.of(percentage);
    }

    /**
     * UnSetter for Percentage.
     */
    public void unsetPercentage() {
        percentage = null;
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
     * Getter for RecurringScheme.
     * @return Returns the RecurringScheme
     */
    @JsonGetter("recurring_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RecurringScheme getRecurringScheme() {
        return recurringScheme;
    }

    /**
     * Setter for RecurringScheme.
     * @param recurringScheme Value for RecurringScheme
     */
    @JsonSetter("recurring_scheme")
    public void setRecurringScheme(RecurringScheme recurringScheme) {
        this.recurringScheme = recurringScheme;
    }

    /**
     * Internal Getter for DurationPeriodCount.
     * @return Returns the Internal Integer
     */
    @JsonGetter("duration_period_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetDurationPeriodCount() {
        return this.durationPeriodCount;
    }

    /**
     * Getter for DurationPeriodCount.
     * @return Returns the Integer
     */
    public Integer getDurationPeriodCount() {
        return OptionalNullable.getFrom(durationPeriodCount);
    }

    /**
     * Setter for DurationPeriodCount.
     * @param durationPeriodCount Value for Integer
     */
    @JsonSetter("duration_period_count")
    public void setDurationPeriodCount(Integer durationPeriodCount) {
        this.durationPeriodCount = OptionalNullable.of(durationPeriodCount);
    }

    /**
     * UnSetter for DurationPeriodCount.
     */
    public void unsetDurationPeriodCount() {
        durationPeriodCount = null;
    }

    /**
     * Internal Getter for DurationInterval.
     * @return Returns the Internal Integer
     */
    @JsonGetter("duration_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetDurationInterval() {
        return this.durationInterval;
    }

    /**
     * Getter for DurationInterval.
     * @return Returns the Integer
     */
    public Integer getDurationInterval() {
        return OptionalNullable.getFrom(durationInterval);
    }

    /**
     * Setter for DurationInterval.
     * @param durationInterval Value for Integer
     */
    @JsonSetter("duration_interval")
    public void setDurationInterval(Integer durationInterval) {
        this.durationInterval = OptionalNullable.of(durationInterval);
    }

    /**
     * UnSetter for DurationInterval.
     */
    public void unsetDurationInterval() {
        durationInterval = null;
    }

    /**
     * Internal Getter for DurationIntervalUnit.
     * @return Returns the Internal String
     */
    @JsonGetter("duration_interval_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDurationIntervalUnit() {
        return this.durationIntervalUnit;
    }

    /**
     * Getter for DurationIntervalUnit.
     * @return Returns the String
     */
    public String getDurationIntervalUnit() {
        return OptionalNullable.getFrom(durationIntervalUnit);
    }

    /**
     * Setter for DurationIntervalUnit.
     * @param durationIntervalUnit Value for String
     */
    @JsonSetter("duration_interval_unit")
    public void setDurationIntervalUnit(String durationIntervalUnit) {
        this.durationIntervalUnit = OptionalNullable.of(durationIntervalUnit);
    }

    /**
     * UnSetter for DurationIntervalUnit.
     */
    public void unsetDurationIntervalUnit() {
        durationIntervalUnit = null;
    }

    /**
     * Getter for DurationIntervalSpan.
     * @return Returns the String
     */
    @JsonGetter("duration_interval_span")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDurationIntervalSpan() {
        return durationIntervalSpan;
    }

    /**
     * Setter for DurationIntervalSpan.
     * @param durationIntervalSpan Value for String
     */
    @JsonSetter("duration_interval_span")
    public void setDurationIntervalSpan(String durationIntervalSpan) {
        this.durationIntervalSpan = durationIntervalSpan;
    }

    /**
     * Getter for AllowNegativeBalance.
     * @return Returns the Boolean
     */
    @JsonGetter("allow_negative_balance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAllowNegativeBalance() {
        return allowNegativeBalance;
    }

    /**
     * Setter for AllowNegativeBalance.
     * @param allowNegativeBalance Value for Boolean
     */
    @JsonSetter("allow_negative_balance")
    public void setAllowNegativeBalance(Boolean allowNegativeBalance) {
        this.allowNegativeBalance = allowNegativeBalance;
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
     * Internal Getter for ConversionLimit.
     * @return Returns the Internal String
     */
    @JsonGetter("conversion_limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetConversionLimit() {
        return this.conversionLimit;
    }

    /**
     * Getter for ConversionLimit.
     * @return Returns the String
     */
    public String getConversionLimit() {
        return OptionalNullable.getFrom(conversionLimit);
    }

    /**
     * Setter for ConversionLimit.
     * @param conversionLimit Value for String
     */
    @JsonSetter("conversion_limit")
    public void setConversionLimit(String conversionLimit) {
        this.conversionLimit = OptionalNullable.of(conversionLimit);
    }

    /**
     * UnSetter for ConversionLimit.
     */
    public void unsetConversionLimit() {
        conversionLimit = null;
    }

    /**
     * Getter for Stackable.
     * @return Returns the Boolean
     */
    @JsonGetter("stackable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getStackable() {
        return stackable;
    }

    /**
     * Setter for Stackable.
     * @param stackable Value for Boolean
     */
    @JsonSetter("stackable")
    public void setStackable(Boolean stackable) {
        this.stackable = stackable;
    }

    /**
     * Getter for CompoundingStrategy.
     * @return Returns the CouponCompoundingStrategy
     */
    @JsonGetter("compounding_strategy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CouponCompoundingStrategy getCompoundingStrategy() {
        return compoundingStrategy;
    }

    /**
     * Setter for CompoundingStrategy.
     * @param compoundingStrategy Value for CouponCompoundingStrategy
     */
    @JsonSetter("compounding_strategy")
    public void setCompoundingStrategy(CouponCompoundingStrategy compoundingStrategy) {
        this.compoundingStrategy = compoundingStrategy;
    }

    /**
     * Getter for UseSiteExchangeRate.
     * @return Returns the Boolean
     */
    @JsonGetter("use_site_exchange_rate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getUseSiteExchangeRate() {
        return useSiteExchangeRate;
    }

    /**
     * Setter for UseSiteExchangeRate.
     * @param useSiteExchangeRate Value for Boolean
     */
    @JsonSetter("use_site_exchange_rate")
    public void setUseSiteExchangeRate(Boolean useSiteExchangeRate) {
        this.useSiteExchangeRate = useSiteExchangeRate;
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
     * Getter for DiscountType.
     * @return Returns the DiscountType
     */
    @JsonGetter("discount_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DiscountType getDiscountType() {
        return discountType;
    }

    /**
     * Setter for DiscountType.
     * @param discountType Value for DiscountType
     */
    @JsonSetter("discount_type")
    public void setDiscountType(DiscountType discountType) {
        this.discountType = discountType;
    }

    /**
     * Getter for ExcludeMidPeriodAllocations.
     * @return Returns the Boolean
     */
    @JsonGetter("exclude_mid_period_allocations")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getExcludeMidPeriodAllocations() {
        return excludeMidPeriodAllocations;
    }

    /**
     * Setter for ExcludeMidPeriodAllocations.
     * @param excludeMidPeriodAllocations Value for Boolean
     */
    @JsonSetter("exclude_mid_period_allocations")
    public void setExcludeMidPeriodAllocations(Boolean excludeMidPeriodAllocations) {
        this.excludeMidPeriodAllocations = excludeMidPeriodAllocations;
    }

    /**
     * Getter for ApplyOnCancelAtEndOfPeriod.
     * @return Returns the Boolean
     */
    @JsonGetter("apply_on_cancel_at_end_of_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getApplyOnCancelAtEndOfPeriod() {
        return applyOnCancelAtEndOfPeriod;
    }

    /**
     * Setter for ApplyOnCancelAtEndOfPeriod.
     * @param applyOnCancelAtEndOfPeriod Value for Boolean
     */
    @JsonSetter("apply_on_cancel_at_end_of_period")
    public void setApplyOnCancelAtEndOfPeriod(Boolean applyOnCancelAtEndOfPeriod) {
        this.applyOnCancelAtEndOfPeriod = applyOnCancelAtEndOfPeriod;
    }

    /**
     * Getter for CouponRestrictions.
     * @return Returns the List of CouponRestriction
     */
    @JsonGetter("coupon_restrictions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CouponRestriction> getCouponRestrictions() {
        return couponRestrictions;
    }

    /**
     * Setter for CouponRestrictions.
     * @param couponRestrictions Value for List of CouponRestriction
     */
    @JsonSetter("coupon_restrictions")
    public void setCouponRestrictions(List<CouponRestriction> couponRestrictions) {
        this.couponRestrictions = couponRestrictions;
    }

    /**
     * Converts this Coupon into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Coupon [" + "id=" + id + ", name=" + name + ", code=" + code + ", description="
                + description + ", amount=" + amount + ", amountInCents=" + amountInCents
                + ", productFamilyId=" + productFamilyId + ", productFamilyName="
                + productFamilyName + ", startDate=" + startDate + ", endDate=" + endDate
                + ", percentage=" + percentage + ", recurring=" + recurring + ", recurringScheme="
                + recurringScheme + ", durationPeriodCount=" + durationPeriodCount
                + ", durationInterval=" + durationInterval + ", durationIntervalUnit="
                + durationIntervalUnit + ", durationIntervalSpan=" + durationIntervalSpan
                + ", allowNegativeBalance=" + allowNegativeBalance + ", archivedAt=" + archivedAt
                + ", conversionLimit=" + conversionLimit + ", stackable=" + stackable
                + ", compoundingStrategy=" + compoundingStrategy + ", useSiteExchangeRate="
                + useSiteExchangeRate + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
                + ", discountType=" + discountType + ", excludeMidPeriodAllocations="
                + excludeMidPeriodAllocations + ", applyOnCancelAtEndOfPeriod="
                + applyOnCancelAtEndOfPeriod + ", couponRestrictions=" + couponRestrictions + "]";
    }

    /**
     * Builds a new {@link Coupon.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Coupon.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .code(getCode())
                .description(getDescription())
                .productFamilyId(getProductFamilyId())
                .productFamilyName(getProductFamilyName())
                .startDate(getStartDate())
                .recurring(getRecurring())
                .recurringScheme(getRecurringScheme())
                .durationIntervalSpan(getDurationIntervalSpan())
                .allowNegativeBalance(getAllowNegativeBalance())
                .stackable(getStackable())
                .compoundingStrategy(getCompoundingStrategy())
                .useSiteExchangeRate(getUseSiteExchangeRate())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .discountType(getDiscountType())
                .excludeMidPeriodAllocations(getExcludeMidPeriodAllocations())
                .applyOnCancelAtEndOfPeriod(getApplyOnCancelAtEndOfPeriod())
                .couponRestrictions(getCouponRestrictions());
        builder.amount = internalGetAmount();
        builder.amountInCents = internalGetAmountInCents();
        builder.endDate = internalGetEndDate();
        builder.percentage = internalGetPercentage();
        builder.durationPeriodCount = internalGetDurationPeriodCount();
        builder.durationInterval = internalGetDurationInterval();
        builder.durationIntervalUnit = internalGetDurationIntervalUnit();
        builder.archivedAt = internalGetArchivedAt();
        builder.conversionLimit = internalGetConversionLimit();
        return builder;
    }

    /**
     * Class to build instances of {@link Coupon}.
     */
    public static class Builder {
        private Double id;
        private String name;
        private String code;
        private String description;
        private OptionalNullable<Double> amount;
        private OptionalNullable<Integer> amountInCents;
        private Integer productFamilyId;
        private String productFamilyName;
        private String startDate;
        private OptionalNullable<String> endDate;
        private OptionalNullable<Double> percentage;
        private Boolean recurring;
        private RecurringScheme recurringScheme;
        private OptionalNullable<Integer> durationPeriodCount;
        private OptionalNullable<Integer> durationInterval;
        private OptionalNullable<String> durationIntervalUnit;
        private String durationIntervalSpan;
        private Boolean allowNegativeBalance;
        private OptionalNullable<String> archivedAt;
        private OptionalNullable<String> conversionLimit;
        private Boolean stackable;
        private CouponCompoundingStrategy compoundingStrategy;
        private Boolean useSiteExchangeRate;
        private String createdAt;
        private String updatedAt;
        private DiscountType discountType;
        private Boolean excludeMidPeriodAllocations;
        private Boolean applyOnCancelAtEndOfPeriod;
        private List<CouponRestriction> couponRestrictions;



        /**
         * Setter for id.
         * @param  id  Double value for id.
         * @return Builder
         */
        public Builder id(Double id) {
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
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
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
         * Setter for amount.
         * @param  amount  Double value for amount.
         * @return Builder
         */
        public Builder amount(Double amount) {
            this.amount = OptionalNullable.of(amount);
            return this;
        }

        /**
         * UnSetter for amount.
         * @return Builder
         */
        public Builder unsetAmount() {
            amount = null;
            return this;
        }

        /**
         * Setter for amountInCents.
         * @param  amountInCents  Integer value for amountInCents.
         * @return Builder
         */
        public Builder amountInCents(Integer amountInCents) {
            this.amountInCents = OptionalNullable.of(amountInCents);
            return this;
        }

        /**
         * UnSetter for amountInCents.
         * @return Builder
         */
        public Builder unsetAmountInCents() {
            amountInCents = null;
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
         * Setter for startDate.
         * @param  startDate  String value for startDate.
         * @return Builder
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Setter for endDate.
         * @param  endDate  String value for endDate.
         * @return Builder
         */
        public Builder endDate(String endDate) {
            this.endDate = OptionalNullable.of(endDate);
            return this;
        }

        /**
         * UnSetter for endDate.
         * @return Builder
         */
        public Builder unsetEndDate() {
            endDate = null;
            return this;
        }

        /**
         * Setter for percentage.
         * @param  percentage  Double value for percentage.
         * @return Builder
         */
        public Builder percentage(Double percentage) {
            this.percentage = OptionalNullable.of(percentage);
            return this;
        }

        /**
         * UnSetter for percentage.
         * @return Builder
         */
        public Builder unsetPercentage() {
            percentage = null;
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
         * Setter for recurringScheme.
         * @param  recurringScheme  RecurringScheme value for recurringScheme.
         * @return Builder
         */
        public Builder recurringScheme(RecurringScheme recurringScheme) {
            this.recurringScheme = recurringScheme;
            return this;
        }

        /**
         * Setter for durationPeriodCount.
         * @param  durationPeriodCount  Integer value for durationPeriodCount.
         * @return Builder
         */
        public Builder durationPeriodCount(Integer durationPeriodCount) {
            this.durationPeriodCount = OptionalNullable.of(durationPeriodCount);
            return this;
        }

        /**
         * UnSetter for durationPeriodCount.
         * @return Builder
         */
        public Builder unsetDurationPeriodCount() {
            durationPeriodCount = null;
            return this;
        }

        /**
         * Setter for durationInterval.
         * @param  durationInterval  Integer value for durationInterval.
         * @return Builder
         */
        public Builder durationInterval(Integer durationInterval) {
            this.durationInterval = OptionalNullable.of(durationInterval);
            return this;
        }

        /**
         * UnSetter for durationInterval.
         * @return Builder
         */
        public Builder unsetDurationInterval() {
            durationInterval = null;
            return this;
        }

        /**
         * Setter for durationIntervalUnit.
         * @param  durationIntervalUnit  String value for durationIntervalUnit.
         * @return Builder
         */
        public Builder durationIntervalUnit(String durationIntervalUnit) {
            this.durationIntervalUnit = OptionalNullable.of(durationIntervalUnit);
            return this;
        }

        /**
         * UnSetter for durationIntervalUnit.
         * @return Builder
         */
        public Builder unsetDurationIntervalUnit() {
            durationIntervalUnit = null;
            return this;
        }

        /**
         * Setter for durationIntervalSpan.
         * @param  durationIntervalSpan  String value for durationIntervalSpan.
         * @return Builder
         */
        public Builder durationIntervalSpan(String durationIntervalSpan) {
            this.durationIntervalSpan = durationIntervalSpan;
            return this;
        }

        /**
         * Setter for allowNegativeBalance.
         * @param  allowNegativeBalance  Boolean value for allowNegativeBalance.
         * @return Builder
         */
        public Builder allowNegativeBalance(Boolean allowNegativeBalance) {
            this.allowNegativeBalance = allowNegativeBalance;
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
         * Setter for conversionLimit.
         * @param  conversionLimit  String value for conversionLimit.
         * @return Builder
         */
        public Builder conversionLimit(String conversionLimit) {
            this.conversionLimit = OptionalNullable.of(conversionLimit);
            return this;
        }

        /**
         * UnSetter for conversionLimit.
         * @return Builder
         */
        public Builder unsetConversionLimit() {
            conversionLimit = null;
            return this;
        }

        /**
         * Setter for stackable.
         * @param  stackable  Boolean value for stackable.
         * @return Builder
         */
        public Builder stackable(Boolean stackable) {
            this.stackable = stackable;
            return this;
        }

        /**
         * Setter for compoundingStrategy.
         * @param  compoundingStrategy  CouponCompoundingStrategy value for compoundingStrategy.
         * @return Builder
         */
        public Builder compoundingStrategy(CouponCompoundingStrategy compoundingStrategy) {
            this.compoundingStrategy = compoundingStrategy;
            return this;
        }

        /**
         * Setter for useSiteExchangeRate.
         * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
         * @return Builder
         */
        public Builder useSiteExchangeRate(Boolean useSiteExchangeRate) {
            this.useSiteExchangeRate = useSiteExchangeRate;
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
         * Setter for discountType.
         * @param  discountType  DiscountType value for discountType.
         * @return Builder
         */
        public Builder discountType(DiscountType discountType) {
            this.discountType = discountType;
            return this;
        }

        /**
         * Setter for excludeMidPeriodAllocations.
         * @param  excludeMidPeriodAllocations  Boolean value for excludeMidPeriodAllocations.
         * @return Builder
         */
        public Builder excludeMidPeriodAllocations(Boolean excludeMidPeriodAllocations) {
            this.excludeMidPeriodAllocations = excludeMidPeriodAllocations;
            return this;
        }

        /**
         * Setter for applyOnCancelAtEndOfPeriod.
         * @param  applyOnCancelAtEndOfPeriod  Boolean value for applyOnCancelAtEndOfPeriod.
         * @return Builder
         */
        public Builder applyOnCancelAtEndOfPeriod(Boolean applyOnCancelAtEndOfPeriod) {
            this.applyOnCancelAtEndOfPeriod = applyOnCancelAtEndOfPeriod;
            return this;
        }

        /**
         * Setter for couponRestrictions.
         * @param  couponRestrictions  List of CouponRestriction value for couponRestrictions.
         * @return Builder
         */
        public Builder couponRestrictions(List<CouponRestriction> couponRestrictions) {
            this.couponRestrictions = couponRestrictions;
            return this;
        }

        /**
         * Builds a new {@link Coupon} object using the set fields.
         * @return {@link Coupon}
         */
        public Coupon build() {
            return new Coupon(id, name, code, description, amount, amountInCents, productFamilyId,
                    productFamilyName, startDate, endDate, percentage, recurring, recurringScheme,
                    durationPeriodCount, durationInterval, durationIntervalUnit,
                    durationIntervalSpan, allowNegativeBalance, archivedAt, conversionLimit,
                    stackable, compoundingStrategy, useSiteExchangeRate, createdAt, updatedAt,
                    discountType, excludeMidPeriodAllocations, applyOnCancelAtEndOfPeriod,
                    couponRestrictions);
        }
    }
}
