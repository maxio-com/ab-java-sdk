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

/**
 * This is a model class for FeatureCatalogItem type.
 */
public class FeatureCatalogItem
        extends BaseModel {
    private Integer id;
    private Integer featureTemplateId;
    private String featureKey;
    private String featureName;
    private FeatureKind featureKind;
    private String value;
    private OptionalNullable<Integer> periodicityInterval;
    private OptionalNullable<EntitlementPeriodicityUnit> periodicityUnit;
    private OptionalNullable<FeatureOwnerPricePointType> pricePointType;
    private OptionalNullable<Integer> pricePointId;
    private OptionalNullable<ZonedDateTime> archivedAt;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;

    /**
     * Default constructor.
     */
    public FeatureCatalogItem() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  featureTemplateId  Integer value for featureTemplateId.
     * @param  featureKey  String value for featureKey.
     * @param  featureName  String value for featureName.
     * @param  featureKind  FeatureKind value for featureKind.
     * @param  value  String value for value.
     * @param  periodicityInterval  Integer value for periodicityInterval.
     * @param  periodicityUnit  EntitlementPeriodicityUnit value for periodicityUnit.
     * @param  pricePointType  FeatureOwnerPricePointType value for pricePointType.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  archivedAt  ZonedDateTime value for archivedAt.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     */
    public FeatureCatalogItem(
            Integer id,
            Integer featureTemplateId,
            String featureKey,
            String featureName,
            FeatureKind featureKind,
            String value,
            Integer periodicityInterval,
            EntitlementPeriodicityUnit periodicityUnit,
            FeatureOwnerPricePointType pricePointType,
            Integer pricePointId,
            ZonedDateTime archivedAt,
            ZonedDateTime createdAt,
            ZonedDateTime updatedAt) {
        this.id = id;
        this.featureTemplateId = featureTemplateId;
        this.featureKey = featureKey;
        this.featureName = featureName;
        this.featureKind = featureKind;
        this.value = value;
        this.periodicityInterval = OptionalNullable.of(periodicityInterval);
        this.periodicityUnit = OptionalNullable.of(periodicityUnit);
        this.pricePointType = OptionalNullable.of(pricePointType);
        this.pricePointId = OptionalNullable.of(pricePointId);
        this.archivedAt = OptionalNullable.of(archivedAt);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  featureTemplateId  Integer value for featureTemplateId.
     * @param  featureKey  String value for featureKey.
     * @param  featureName  String value for featureName.
     * @param  featureKind  FeatureKind value for featureKind.
     * @param  value  String value for value.
     * @param  periodicityInterval  Integer value for periodicityInterval.
     * @param  periodicityUnit  EntitlementPeriodicityUnit value for periodicityUnit.
     * @param  pricePointType  FeatureOwnerPricePointType value for pricePointType.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  archivedAt  ZonedDateTime value for archivedAt.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     */

    protected FeatureCatalogItem(Integer id, Integer featureTemplateId, String featureKey,
            String featureName, FeatureKind featureKind, String value,
            OptionalNullable<Integer> periodicityInterval,
            OptionalNullable<EntitlementPeriodicityUnit> periodicityUnit,
            OptionalNullable<FeatureOwnerPricePointType> pricePointType,
            OptionalNullable<Integer> pricePointId, OptionalNullable<ZonedDateTime> archivedAt,
            ZonedDateTime createdAt, ZonedDateTime updatedAt) {
        this.id = id;
        this.featureTemplateId = featureTemplateId;
        this.featureKey = featureKey;
        this.featureName = featureName;
        this.featureKind = featureKind;
        this.value = value;
        this.periodicityInterval = periodicityInterval;
        this.periodicityUnit = periodicityUnit;
        this.pricePointType = pricePointType;
        this.pricePointId = pricePointId;
        this.archivedAt = archivedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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
     * Getter for FeatureTemplateId.
     * The id of the feature template this item was created from.
     * @return Returns the Integer
     */
    @JsonGetter("feature_template_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getFeatureTemplateId() {
        return featureTemplateId;
    }

    /**
     * Setter for FeatureTemplateId.
     * The id of the feature template this item was created from.
     * @param featureTemplateId Value for Integer
     */
    @JsonSetter("feature_template_id")
    public void setFeatureTemplateId(Integer featureTemplateId) {
        this.featureTemplateId = featureTemplateId;
    }

    /**
     * Getter for FeatureKey.
     * The `key` of the parent feature template.
     * @return Returns the String
     */
    @JsonGetter("feature_key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFeatureKey() {
        return featureKey;
    }

    /**
     * Setter for FeatureKey.
     * The `key` of the parent feature template.
     * @param featureKey Value for String
     */
    @JsonSetter("feature_key")
    public void setFeatureKey(String featureKey) {
        this.featureKey = featureKey;
    }

    /**
     * Getter for FeatureName.
     * The `name` of the parent feature template.
     * @return Returns the String
     */
    @JsonGetter("feature_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFeatureName() {
        return featureName;
    }

    /**
     * Setter for FeatureName.
     * The `name` of the parent feature template.
     * @param featureName Value for String
     */
    @JsonSetter("feature_name")
    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    /**
     * Getter for FeatureKind.
     * The behavior of a feature: - `access_right`: a boolean entitlement. A subscriber either has
     * access or does not. - `usage_limit`: a quantified allowance measured over a recurring period
     * (for example, "10,000 API calls per month"). - `service_right`: a free-form value (text,
     * boolean, or number) that isn't a simple access flag or a metered limit.
     * @return Returns the FeatureKind
     */
    @JsonGetter("feature_kind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FeatureKind getFeatureKind() {
        return featureKind;
    }

    /**
     * Setter for FeatureKind.
     * The behavior of a feature: - `access_right`: a boolean entitlement. A subscriber either has
     * access or does not. - `usage_limit`: a quantified allowance measured over a recurring period
     * (for example, "10,000 API calls per month"). - `service_right`: a free-form value (text,
     * boolean, or number) that isn't a simple access flag or a metered limit.
     * @param featureKind Value for FeatureKind
     */
    @JsonSetter("feature_kind")
    public void setFeatureKind(FeatureKind featureKind) {
        this.featureKind = featureKind;
    }

    /**
     * Getter for Value.
     * The value granted by this feature catalog item. Interpreted according to `feature_kind`:
     * `"true"`/`"false"` for `access_right`, a numeric string for `usage_limit`, or any string for
     * `service_right` (shaped by the feature template's `value_type`).
     * @return Returns the String
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * The value granted by this feature catalog item. Interpreted according to `feature_kind`:
     * `"true"`/`"false"` for `access_right`, a numeric string for `usage_limit`, or any string for
     * `service_right` (shaped by the feature template's `value_type`).
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Internal Getter for PeriodicityInterval.
     * Set when `feature_kind` is `usage_limit`; `null` otherwise.
     * @return Returns the Internal Integer
     */
    @JsonGetter("periodicity_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetPeriodicityInterval() {
        return this.periodicityInterval;
    }

    /**
     * Getter for PeriodicityInterval.
     * Set when `feature_kind` is `usage_limit`; `null` otherwise.
     * @return Returns the Integer
     */
    public Integer getPeriodicityInterval() {
        return OptionalNullable.getFrom(periodicityInterval);
    }

    /**
     * Setter for PeriodicityInterval.
     * Set when `feature_kind` is `usage_limit`; `null` otherwise.
     * @param periodicityInterval Value for Integer
     */
    @JsonSetter("periodicity_interval")
    public void setPeriodicityInterval(Integer periodicityInterval) {
        this.periodicityInterval = OptionalNullable.of(periodicityInterval);
    }

    /**
     * UnSetter for PeriodicityInterval.
     * Set when `feature_kind` is `usage_limit`; `null` otherwise.
     */
    public void unsetPeriodicityInterval() {
        periodicityInterval = null;
    }

    /**
     * Internal Getter for PeriodicityUnit.
     * Set when `feature_kind` is `usage_limit`; `null` otherwise.
     * @return Returns the Internal EntitlementPeriodicityUnit
     */
    @JsonGetter("periodicity_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<EntitlementPeriodicityUnit> internalGetPeriodicityUnit() {
        return this.periodicityUnit;
    }

    /**
     * Getter for PeriodicityUnit.
     * Set when `feature_kind` is `usage_limit`; `null` otherwise.
     * @return Returns the EntitlementPeriodicityUnit
     */
    public EntitlementPeriodicityUnit getPeriodicityUnit() {
        return OptionalNullable.getFrom(periodicityUnit);
    }

    /**
     * Setter for PeriodicityUnit.
     * Set when `feature_kind` is `usage_limit`; `null` otherwise.
     * @param periodicityUnit Value for EntitlementPeriodicityUnit
     */
    @JsonSetter("periodicity_unit")
    public void setPeriodicityUnit(EntitlementPeriodicityUnit periodicityUnit) {
        this.periodicityUnit = OptionalNullable.of(periodicityUnit);
    }

    /**
     * UnSetter for PeriodicityUnit.
     * Set when `feature_kind` is `usage_limit`; `null` otherwise.
     */
    public void unsetPeriodicityUnit() {
        periodicityUnit = null;
    }

    /**
     * Internal Getter for PricePointType.
     * `null` when this feature catalog item applies to every price point of its owning
     * product/component. Set when the feature catalog item is an override for one specific price
     * point.
     * @return Returns the Internal FeatureOwnerPricePointType
     */
    @JsonGetter("price_point_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<FeatureOwnerPricePointType> internalGetPricePointType() {
        return this.pricePointType;
    }

    /**
     * Getter for PricePointType.
     * `null` when this feature catalog item applies to every price point of its owning
     * product/component. Set when the feature catalog item is an override for one specific price
     * point.
     * @return Returns the FeatureOwnerPricePointType
     */
    public FeatureOwnerPricePointType getPricePointType() {
        return OptionalNullable.getFrom(pricePointType);
    }

    /**
     * Setter for PricePointType.
     * `null` when this feature catalog item applies to every price point of its owning
     * product/component. Set when the feature catalog item is an override for one specific price
     * point.
     * @param pricePointType Value for FeatureOwnerPricePointType
     */
    @JsonSetter("price_point_type")
    public void setPricePointType(FeatureOwnerPricePointType pricePointType) {
        this.pricePointType = OptionalNullable.of(pricePointType);
    }

    /**
     * UnSetter for PricePointType.
     * `null` when this feature catalog item applies to every price point of its owning
     * product/component. Set when the feature catalog item is an override for one specific price
     * point.
     */
    public void unsetPricePointType() {
        pricePointType = null;
    }

    /**
     * Internal Getter for PricePointId.
     * Set together with `price_point_type` for price-point-specific overrides.
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
     * Set together with `price_point_type` for price-point-specific overrides.
     * @return Returns the Integer
     */
    public Integer getPricePointId() {
        return OptionalNullable.getFrom(pricePointId);
    }

    /**
     * Setter for PricePointId.
     * Set together with `price_point_type` for price-point-specific overrides.
     * @param pricePointId Value for Integer
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(Integer pricePointId) {
        this.pricePointId = OptionalNullable.of(pricePointId);
    }

    /**
     * UnSetter for PricePointId.
     * Set together with `price_point_type` for price-point-specific overrides.
     */
    public void unsetPricePointId() {
        pricePointId = null;
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
     * Converts this FeatureCatalogItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FeatureCatalogItem [" + "id=" + id + ", featureTemplateId=" + featureTemplateId
                + ", featureKey=" + featureKey + ", featureName=" + featureName + ", featureKind="
                + featureKind + ", value=" + value + ", periodicityInterval=" + periodicityInterval
                + ", periodicityUnit=" + periodicityUnit + ", pricePointType=" + pricePointType
                + ", pricePointId=" + pricePointId + ", archivedAt=" + archivedAt + ", createdAt="
                + createdAt + ", updatedAt=" + updatedAt + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link FeatureCatalogItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FeatureCatalogItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .featureTemplateId(getFeatureTemplateId())
                .featureKey(getFeatureKey())
                .featureName(getFeatureName())
                .featureKind(getFeatureKind())
                .value(getValue())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt());
        builder.periodicityInterval = internalGetPeriodicityInterval();
        builder.periodicityUnit = internalGetPeriodicityUnit();
        builder.pricePointType = internalGetPricePointType();
        builder.pricePointId = internalGetPricePointId();
        builder.archivedAt = internalGetArchivedAt();
        return builder;
    }

    /**
     * Class to build instances of {@link FeatureCatalogItem}.
     */
    public static class Builder {
        private Integer id;
        private Integer featureTemplateId;
        private String featureKey;
        private String featureName;
        private FeatureKind featureKind;
        private String value;
        private OptionalNullable<Integer> periodicityInterval;
        private OptionalNullable<EntitlementPeriodicityUnit> periodicityUnit;
        private OptionalNullable<FeatureOwnerPricePointType> pricePointType;
        private OptionalNullable<Integer> pricePointId;
        private OptionalNullable<ZonedDateTime> archivedAt;
        private ZonedDateTime createdAt;
        private ZonedDateTime updatedAt;



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
         * Setter for featureTemplateId.
         * @param  featureTemplateId  Integer value for featureTemplateId.
         * @return Builder
         */
        public Builder featureTemplateId(Integer featureTemplateId) {
            this.featureTemplateId = featureTemplateId;
            return this;
        }

        /**
         * Setter for featureKey.
         * @param  featureKey  String value for featureKey.
         * @return Builder
         */
        public Builder featureKey(String featureKey) {
            this.featureKey = featureKey;
            return this;
        }

        /**
         * Setter for featureName.
         * @param  featureName  String value for featureName.
         * @return Builder
         */
        public Builder featureName(String featureName) {
            this.featureName = featureName;
            return this;
        }

        /**
         * Setter for featureKind.
         * @param  featureKind  FeatureKind value for featureKind.
         * @return Builder
         */
        public Builder featureKind(FeatureKind featureKind) {
            this.featureKind = featureKind;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for periodicityInterval.
         * @param  periodicityInterval  Integer value for periodicityInterval.
         * @return Builder
         */
        public Builder periodicityInterval(Integer periodicityInterval) {
            this.periodicityInterval = OptionalNullable.of(periodicityInterval);
            return this;
        }

        /**
         * UnSetter for periodicityInterval.
         * @return Builder
         */
        public Builder unsetPeriodicityInterval() {
            periodicityInterval = null;
            return this;
        }

        /**
         * Setter for periodicityUnit.
         * @param  periodicityUnit  EntitlementPeriodicityUnit value for periodicityUnit.
         * @return Builder
         */
        public Builder periodicityUnit(EntitlementPeriodicityUnit periodicityUnit) {
            this.periodicityUnit = OptionalNullable.of(periodicityUnit);
            return this;
        }

        /**
         * UnSetter for periodicityUnit.
         * @return Builder
         */
        public Builder unsetPeriodicityUnit() {
            periodicityUnit = null;
            return this;
        }

        /**
         * Setter for pricePointType.
         * @param  pricePointType  FeatureOwnerPricePointType value for pricePointType.
         * @return Builder
         */
        public Builder pricePointType(FeatureOwnerPricePointType pricePointType) {
            this.pricePointType = OptionalNullable.of(pricePointType);
            return this;
        }

        /**
         * UnSetter for pricePointType.
         * @return Builder
         */
        public Builder unsetPricePointType() {
            pricePointType = null;
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
         * Builds a new {@link FeatureCatalogItem} object using the set fields.
         * @return {@link FeatureCatalogItem}
         */
        public FeatureCatalogItem build() {
            return new FeatureCatalogItem(id, featureTemplateId, featureKey, featureName,
                    featureKind, value, periodicityInterval, periodicityUnit, pricePointType,
                    pricePointId, archivedAt, createdAt, updatedAt);
        }
    }
}
