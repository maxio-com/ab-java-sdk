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
 * This is a model class for Coupon type.
 */
public class Coupon
        extends BaseModel {
    private Integer id;
    private String name;
    private String code;
    private String description;
    private OptionalNullable<Double> amount;
    private OptionalNullable<Integer> amountInCents;
    private Integer productFamilyId;
    private OptionalNullable<String> productFamilyName;
    private ZonedDateTime startDate;
    private OptionalNullable<ZonedDateTime> endDate;
    private OptionalNullable<String> percentage;
    private Boolean recurring;
    private RecurringScheme recurringScheme;
    private OptionalNullable<Integer> durationPeriodCount;
    private OptionalNullable<Integer> durationInterval;
    private OptionalNullable<String> durationIntervalUnit;
    private OptionalNullable<String> durationIntervalSpan;
    private Boolean allowNegativeBalance;
    private OptionalNullable<ZonedDateTime> archivedAt;
    private OptionalNullable<String> conversionLimit;
    private Boolean stackable;
    private OptionalNullable<CompoundingStrategy> compoundingStrategy;
    private Boolean useSiteExchangeRate;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
    private DiscountType discountType;
    private Boolean excludeMidPeriodAllocations;
    private Boolean applyOnCancelAtEndOfPeriod;
    private Boolean applyOnSubscriptionExpiration;
    private List<CouponRestriction> couponRestrictions;
    private List<CouponCurrency> currencyPrices;

    /**
     * Default constructor.
     */
    public Coupon() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  code  String value for code.
     * @param  description  String value for description.
     * @param  amount  Double value for amount.
     * @param  amountInCents  Integer value for amountInCents.
     * @param  productFamilyId  Integer value for productFamilyId.
     * @param  productFamilyName  String value for productFamilyName.
     * @param  startDate  ZonedDateTime value for startDate.
     * @param  endDate  ZonedDateTime value for endDate.
     * @param  percentage  String value for percentage.
     * @param  recurring  Boolean value for recurring.
     * @param  recurringScheme  RecurringScheme value for recurringScheme.
     * @param  durationPeriodCount  Integer value for durationPeriodCount.
     * @param  durationInterval  Integer value for durationInterval.
     * @param  durationIntervalUnit  String value for durationIntervalUnit.
     * @param  durationIntervalSpan  String value for durationIntervalSpan.
     * @param  allowNegativeBalance  Boolean value for allowNegativeBalance.
     * @param  archivedAt  ZonedDateTime value for archivedAt.
     * @param  conversionLimit  String value for conversionLimit.
     * @param  stackable  Boolean value for stackable.
     * @param  compoundingStrategy  CompoundingStrategy value for compoundingStrategy.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     * @param  discountType  DiscountType value for discountType.
     * @param  excludeMidPeriodAllocations  Boolean value for excludeMidPeriodAllocations.
     * @param  applyOnCancelAtEndOfPeriod  Boolean value for applyOnCancelAtEndOfPeriod.
     * @param  applyOnSubscriptionExpiration  Boolean value for applyOnSubscriptionExpiration.
     * @param  couponRestrictions  List of CouponRestriction value for couponRestrictions.
     * @param  currencyPrices  List of CouponCurrency value for currencyPrices.
     */
    public Coupon(
            Integer id,
            String name,
            String code,
            String description,
            Double amount,
            Integer amountInCents,
            Integer productFamilyId,
            String productFamilyName,
            ZonedDateTime startDate,
            ZonedDateTime endDate,
            String percentage,
            Boolean recurring,
            RecurringScheme recurringScheme,
            Integer durationPeriodCount,
            Integer durationInterval,
            String durationIntervalUnit,
            String durationIntervalSpan,
            Boolean allowNegativeBalance,
            ZonedDateTime archivedAt,
            String conversionLimit,
            Boolean stackable,
            CompoundingStrategy compoundingStrategy,
            Boolean useSiteExchangeRate,
            ZonedDateTime createdAt,
            ZonedDateTime updatedAt,
            DiscountType discountType,
            Boolean excludeMidPeriodAllocations,
            Boolean applyOnCancelAtEndOfPeriod,
            Boolean applyOnSubscriptionExpiration,
            List<CouponRestriction> couponRestrictions,
            List<CouponCurrency> currencyPrices) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.description = description;
        this.amount = OptionalNullable.of(amount);
        this.amountInCents = OptionalNullable.of(amountInCents);
        this.productFamilyId = productFamilyId;
        this.productFamilyName = OptionalNullable.of(productFamilyName);
        this.startDate = startDate;
        this.endDate = OptionalNullable.of(endDate);
        this.percentage = OptionalNullable.of(percentage);
        this.recurring = recurring;
        this.recurringScheme = recurringScheme;
        this.durationPeriodCount = OptionalNullable.of(durationPeriodCount);
        this.durationInterval = OptionalNullable.of(durationInterval);
        this.durationIntervalUnit = OptionalNullable.of(durationIntervalUnit);
        this.durationIntervalSpan = OptionalNullable.of(durationIntervalSpan);
        this.allowNegativeBalance = allowNegativeBalance;
        this.archivedAt = OptionalNullable.of(archivedAt);
        this.conversionLimit = OptionalNullable.of(conversionLimit);
        this.stackable = stackable;
        this.compoundingStrategy = OptionalNullable.of(compoundingStrategy);
        this.useSiteExchangeRate = useSiteExchangeRate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.discountType = discountType;
        this.excludeMidPeriodAllocations = excludeMidPeriodAllocations;
        this.applyOnCancelAtEndOfPeriod = applyOnCancelAtEndOfPeriod;
        this.applyOnSubscriptionExpiration = applyOnSubscriptionExpiration;
        this.couponRestrictions = couponRestrictions;
        this.currencyPrices = currencyPrices;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  name  String value for name.
     * @param  code  String value for code.
     * @param  description  String value for description.
     * @param  amount  Double value for amount.
     * @param  amountInCents  Integer value for amountInCents.
     * @param  productFamilyId  Integer value for productFamilyId.
     * @param  productFamilyName  String value for productFamilyName.
     * @param  startDate  ZonedDateTime value for startDate.
     * @param  endDate  ZonedDateTime value for endDate.
     * @param  percentage  String value for percentage.
     * @param  recurring  Boolean value for recurring.
     * @param  recurringScheme  RecurringScheme value for recurringScheme.
     * @param  durationPeriodCount  Integer value for durationPeriodCount.
     * @param  durationInterval  Integer value for durationInterval.
     * @param  durationIntervalUnit  String value for durationIntervalUnit.
     * @param  durationIntervalSpan  String value for durationIntervalSpan.
     * @param  allowNegativeBalance  Boolean value for allowNegativeBalance.
     * @param  archivedAt  ZonedDateTime value for archivedAt.
     * @param  conversionLimit  String value for conversionLimit.
     * @param  stackable  Boolean value for stackable.
     * @param  compoundingStrategy  CompoundingStrategy value for compoundingStrategy.
     * @param  useSiteExchangeRate  Boolean value for useSiteExchangeRate.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     * @param  discountType  DiscountType value for discountType.
     * @param  excludeMidPeriodAllocations  Boolean value for excludeMidPeriodAllocations.
     * @param  applyOnCancelAtEndOfPeriod  Boolean value for applyOnCancelAtEndOfPeriod.
     * @param  applyOnSubscriptionExpiration  Boolean value for applyOnSubscriptionExpiration.
     * @param  couponRestrictions  List of CouponRestriction value for couponRestrictions.
     * @param  currencyPrices  List of CouponCurrency value for currencyPrices.
     */

    protected Coupon(Integer id, String name, String code, String description,
            OptionalNullable<Double> amount, OptionalNullable<Integer> amountInCents,
            Integer productFamilyId, OptionalNullable<String> productFamilyName,
            ZonedDateTime startDate, OptionalNullable<ZonedDateTime> endDate,
            OptionalNullable<String> percentage, Boolean recurring, RecurringScheme recurringScheme,
            OptionalNullable<Integer> durationPeriodCount,
            OptionalNullable<Integer> durationInterval,
            OptionalNullable<String> durationIntervalUnit,
            OptionalNullable<String> durationIntervalSpan, Boolean allowNegativeBalance,
            OptionalNullable<ZonedDateTime> archivedAt, OptionalNullable<String> conversionLimit,
            Boolean stackable, OptionalNullable<CompoundingStrategy> compoundingStrategy,
            Boolean useSiteExchangeRate, ZonedDateTime createdAt, ZonedDateTime updatedAt,
            DiscountType discountType, Boolean excludeMidPeriodAllocations,
            Boolean applyOnCancelAtEndOfPeriod, Boolean applyOnSubscriptionExpiration,
            List<CouponRestriction> couponRestrictions, List<CouponCurrency> currencyPrices) {
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
        this.applyOnSubscriptionExpiration = applyOnSubscriptionExpiration;
        this.couponRestrictions = couponRestrictions;
        this.currencyPrices = currencyPrices;
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
     * Internal Getter for ProductFamilyName.
     * @return Returns the Internal String
     */
    @JsonGetter("product_family_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetProductFamilyName() {
        return this.productFamilyName;
    }

    /**
     * Getter for ProductFamilyName.
     * @return Returns the String
     */
    public String getProductFamilyName() {
        return OptionalNullable.getFrom(productFamilyName);
    }

    /**
     * Setter for ProductFamilyName.
     * @param productFamilyName Value for String
     */
    @JsonSetter("product_family_name")
    public void setProductFamilyName(String productFamilyName) {
        this.productFamilyName = OptionalNullable.of(productFamilyName);
    }

    /**
     * UnSetter for ProductFamilyName.
     */
    public void unsetProductFamilyName() {
        productFamilyName = null;
    }

    /**
     * Getter for StartDate.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("start_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getStartDate() {
        return startDate;
    }

    /**
     * Setter for StartDate.
     * @param startDate Value for ZonedDateTime
     */
    @JsonSetter("start_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartDate(ZonedDateTime startDate) {
        this.startDate = startDate;
    }

    /**
     * Internal Getter for EndDate.
     * After the given time, this coupon code will be invalid for new signups. Recurring discounts
     * started before this date will continue to recur even after this date.
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetEndDate() {
        return this.endDate;
    }

    /**
     * Getter for EndDate.
     * After the given time, this coupon code will be invalid for new signups. Recurring discounts
     * started before this date will continue to recur even after this date.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getEndDate() {
        return OptionalNullable.getFrom(endDate);
    }

    /**
     * Setter for EndDate.
     * After the given time, this coupon code will be invalid for new signups. Recurring discounts
     * started before this date will continue to recur even after this date.
     * @param endDate Value for ZonedDateTime
     */
    @JsonSetter("end_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setEndDate(ZonedDateTime endDate) {
        this.endDate = OptionalNullable.of(endDate);
    }

    /**
     * UnSetter for EndDate.
     * After the given time, this coupon code will be invalid for new signups. Recurring discounts
     * started before this date will continue to recur even after this date.
     */
    public void unsetEndDate() {
        endDate = null;
    }

    /**
     * Internal Getter for Percentage.
     * @return Returns the Internal String
     */
    @JsonGetter("percentage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPercentage() {
        return this.percentage;
    }

    /**
     * Getter for Percentage.
     * @return Returns the String
     */
    public String getPercentage() {
        return OptionalNullable.getFrom(percentage);
    }

    /**
     * Setter for Percentage.
     * @param percentage Value for String
     */
    @JsonSetter("percentage")
    public void setPercentage(String percentage) {
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
     * Internal Getter for DurationIntervalSpan.
     * @return Returns the Internal String
     */
    @JsonGetter("duration_interval_span")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDurationIntervalSpan() {
        return this.durationIntervalSpan;
    }

    /**
     * Getter for DurationIntervalSpan.
     * @return Returns the String
     */
    public String getDurationIntervalSpan() {
        return OptionalNullable.getFrom(durationIntervalSpan);
    }

    /**
     * Setter for DurationIntervalSpan.
     * @param durationIntervalSpan Value for String
     */
    @JsonSetter("duration_interval_span")
    public void setDurationIntervalSpan(String durationIntervalSpan) {
        this.durationIntervalSpan = OptionalNullable.of(durationIntervalSpan);
    }

    /**
     * UnSetter for DurationIntervalSpan.
     */
    public void unsetDurationIntervalSpan() {
        durationIntervalSpan = null;
    }

    /**
     * Getter for AllowNegativeBalance.
     * If set to true, discount is not limited (credits will carry forward to next billing).
     * @return Returns the Boolean
     */
    @JsonGetter("allow_negative_balance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAllowNegativeBalance() {
        return allowNegativeBalance;
    }

    /**
     * Setter for AllowNegativeBalance.
     * If set to true, discount is not limited (credits will carry forward to next billing).
     * @param allowNegativeBalance Value for Boolean
     */
    @JsonSetter("allow_negative_balance")
    public void setAllowNegativeBalance(Boolean allowNegativeBalance) {
        this.allowNegativeBalance = allowNegativeBalance;
    }

    /**
     * Internal Getter for ArchivedAt.
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
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getArchivedAt() {
        return OptionalNullable.getFrom(archivedAt);
    }

    /**
     * Setter for ArchivedAt.
     * @param archivedAt Value for ZonedDateTime
     */
    @JsonSetter("archived_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setArchivedAt(ZonedDateTime archivedAt) {
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
     * A stackable coupon can be combined with other coupons on a Subscription.
     * @return Returns the Boolean
     */
    @JsonGetter("stackable")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getStackable() {
        return stackable;
    }

    /**
     * Setter for Stackable.
     * A stackable coupon can be combined with other coupons on a Subscription.
     * @param stackable Value for Boolean
     */
    @JsonSetter("stackable")
    public void setStackable(Boolean stackable) {
        this.stackable = stackable;
    }

    /**
     * Internal Getter for CompoundingStrategy.
     * Applicable only to stackable coupons. For `compound`, Percentage-based discounts will be
     * calculated against the remaining price, after prior discounts have been calculated. For
     * `full-price`, Percentage-based discounts will always be calculated against the original item
     * price, before other discounts are applied.
     * @return Returns the Internal CompoundingStrategy
     */
    @JsonGetter("compounding_strategy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CompoundingStrategy> internalGetCompoundingStrategy() {
        return this.compoundingStrategy;
    }

    /**
     * Getter for CompoundingStrategy.
     * Applicable only to stackable coupons. For `compound`, Percentage-based discounts will be
     * calculated against the remaining price, after prior discounts have been calculated. For
     * `full-price`, Percentage-based discounts will always be calculated against the original item
     * price, before other discounts are applied.
     * @return Returns the CompoundingStrategy
     */
    public CompoundingStrategy getCompoundingStrategy() {
        return OptionalNullable.getFrom(compoundingStrategy);
    }

    /**
     * Setter for CompoundingStrategy.
     * Applicable only to stackable coupons. For `compound`, Percentage-based discounts will be
     * calculated against the remaining price, after prior discounts have been calculated. For
     * `full-price`, Percentage-based discounts will always be calculated against the original item
     * price, before other discounts are applied.
     * @param compoundingStrategy Value for CompoundingStrategy
     */
    @JsonSetter("compounding_strategy")
    public void setCompoundingStrategy(CompoundingStrategy compoundingStrategy) {
        this.compoundingStrategy = OptionalNullable.of(compoundingStrategy);
    }

    /**
     * UnSetter for CompoundingStrategy.
     * Applicable only to stackable coupons. For `compound`, Percentage-based discounts will be
     * calculated against the remaining price, after prior discounts have been calculated. For
     * `full-price`, Percentage-based discounts will always be calculated against the original item
     * price, before other discounts are applied.
     */
    public void unsetCompoundingStrategy() {
        compoundingStrategy = null;
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
     * @param createdAt Value for ZonedDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
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
     * @param updatedAt Value for ZonedDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(ZonedDateTime updatedAt) {
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
     * Getter for ApplyOnSubscriptionExpiration.
     * @return Returns the Boolean
     */
    @JsonGetter("apply_on_subscription_expiration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getApplyOnSubscriptionExpiration() {
        return applyOnSubscriptionExpiration;
    }

    /**
     * Setter for ApplyOnSubscriptionExpiration.
     * @param applyOnSubscriptionExpiration Value for Boolean
     */
    @JsonSetter("apply_on_subscription_expiration")
    public void setApplyOnSubscriptionExpiration(Boolean applyOnSubscriptionExpiration) {
        this.applyOnSubscriptionExpiration = applyOnSubscriptionExpiration;
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
     * Getter for CurrencyPrices.
     * Returned in read, find, and list endpoints if the query parameter is provided.
     * @return Returns the List of CouponCurrency
     */
    @JsonGetter("currency_prices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CouponCurrency> getCurrencyPrices() {
        return currencyPrices;
    }

    /**
     * Setter for CurrencyPrices.
     * Returned in read, find, and list endpoints if the query parameter is provided.
     * @param currencyPrices Value for List of CouponCurrency
     */
    @JsonSetter("currency_prices")
    public void setCurrencyPrices(List<CouponCurrency> currencyPrices) {
        this.currencyPrices = currencyPrices;
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
                + applyOnCancelAtEndOfPeriod + ", applyOnSubscriptionExpiration="
                + applyOnSubscriptionExpiration + ", couponRestrictions=" + couponRestrictions
                + ", currencyPrices=" + currencyPrices + ", additionalProperties="
                + getAdditionalProperties() + "]";
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
                .startDate(getStartDate())
                .recurring(getRecurring())
                .recurringScheme(getRecurringScheme())
                .allowNegativeBalance(getAllowNegativeBalance())
                .stackable(getStackable())
                .useSiteExchangeRate(getUseSiteExchangeRate())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .discountType(getDiscountType())
                .excludeMidPeriodAllocations(getExcludeMidPeriodAllocations())
                .applyOnCancelAtEndOfPeriod(getApplyOnCancelAtEndOfPeriod())
                .applyOnSubscriptionExpiration(getApplyOnSubscriptionExpiration())
                .couponRestrictions(getCouponRestrictions())
                .currencyPrices(getCurrencyPrices());
        builder.amount = internalGetAmount();
        builder.amountInCents = internalGetAmountInCents();
        builder.productFamilyName = internalGetProductFamilyName();
        builder.endDate = internalGetEndDate();
        builder.percentage = internalGetPercentage();
        builder.durationPeriodCount = internalGetDurationPeriodCount();
        builder.durationInterval = internalGetDurationInterval();
        builder.durationIntervalUnit = internalGetDurationIntervalUnit();
        builder.durationIntervalSpan = internalGetDurationIntervalSpan();
        builder.archivedAt = internalGetArchivedAt();
        builder.conversionLimit = internalGetConversionLimit();
        builder.compoundingStrategy = internalGetCompoundingStrategy();
        return builder;
    }

    /**
     * Class to build instances of {@link Coupon}.
     */
    public static class Builder {
        private Integer id;
        private String name;
        private String code;
        private String description;
        private OptionalNullable<Double> amount;
        private OptionalNullable<Integer> amountInCents;
        private Integer productFamilyId;
        private OptionalNullable<String> productFamilyName;
        private ZonedDateTime startDate;
        private OptionalNullable<ZonedDateTime> endDate;
        private OptionalNullable<String> percentage;
        private Boolean recurring;
        private RecurringScheme recurringScheme;
        private OptionalNullable<Integer> durationPeriodCount;
        private OptionalNullable<Integer> durationInterval;
        private OptionalNullable<String> durationIntervalUnit;
        private OptionalNullable<String> durationIntervalSpan;
        private Boolean allowNegativeBalance;
        private OptionalNullable<ZonedDateTime> archivedAt;
        private OptionalNullable<String> conversionLimit;
        private Boolean stackable;
        private OptionalNullable<CompoundingStrategy> compoundingStrategy;
        private Boolean useSiteExchangeRate;
        private ZonedDateTime createdAt;
        private ZonedDateTime updatedAt;
        private DiscountType discountType;
        private Boolean excludeMidPeriodAllocations;
        private Boolean applyOnCancelAtEndOfPeriod;
        private Boolean applyOnSubscriptionExpiration;
        private List<CouponRestriction> couponRestrictions;
        private List<CouponCurrency> currencyPrices;



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
            this.productFamilyName = OptionalNullable.of(productFamilyName);
            return this;
        }

        /**
         * UnSetter for productFamilyName.
         * @return Builder
         */
        public Builder unsetProductFamilyName() {
            productFamilyName = null;
            return this;
        }

        /**
         * Setter for startDate.
         * @param  startDate  ZonedDateTime value for startDate.
         * @return Builder
         */
        public Builder startDate(ZonedDateTime startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Setter for endDate.
         * @param  endDate  ZonedDateTime value for endDate.
         * @return Builder
         */
        public Builder endDate(ZonedDateTime endDate) {
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
         * @param  percentage  String value for percentage.
         * @return Builder
         */
        public Builder percentage(String percentage) {
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
            this.durationIntervalSpan = OptionalNullable.of(durationIntervalSpan);
            return this;
        }

        /**
         * UnSetter for durationIntervalSpan.
         * @return Builder
         */
        public Builder unsetDurationIntervalSpan() {
            durationIntervalSpan = null;
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
         * @param  compoundingStrategy  CompoundingStrategy value for compoundingStrategy.
         * @return Builder
         */
        public Builder compoundingStrategy(CompoundingStrategy compoundingStrategy) {
            this.compoundingStrategy = OptionalNullable.of(compoundingStrategy);
            return this;
        }

        /**
         * UnSetter for compoundingStrategy.
         * @return Builder
         */
        public Builder unsetCompoundingStrategy() {
            compoundingStrategy = null;
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
         * Setter for applyOnSubscriptionExpiration.
         * @param  applyOnSubscriptionExpiration  Boolean value for applyOnSubscriptionExpiration.
         * @return Builder
         */
        public Builder applyOnSubscriptionExpiration(Boolean applyOnSubscriptionExpiration) {
            this.applyOnSubscriptionExpiration = applyOnSubscriptionExpiration;
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
         * Setter for currencyPrices.
         * @param  currencyPrices  List of CouponCurrency value for currencyPrices.
         * @return Builder
         */
        public Builder currencyPrices(List<CouponCurrency> currencyPrices) {
            this.currencyPrices = currencyPrices;
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
                    applyOnSubscriptionExpiration, couponRestrictions, currencyPrices);
        }
    }
}
