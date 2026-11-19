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
 * This is a model class for FeatureTemplate type.
 */
public class FeatureTemplate
        extends BaseModel {
    private Integer id;
    private String key;
    private String name;
    private OptionalNullable<String> description;
    private FeatureKind kind;
    private OptionalNullable<String> unit;
    private FeatureValueType valueType;
    private OptionalNullable<String> defaultValue;
    private OptionalNullable<Integer> defaultPeriodicityInterval;
    private OptionalNullable<EntitlementPeriodicityUnit> defaultPeriodicityUnit;
    private OptionalNullable<ZonedDateTime> archivedAt;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
    private Integer productsCount;
    private Integer plansCount;

    /**
     * Default constructor.
     */
    public FeatureTemplate() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  key  String value for key.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  kind  FeatureKind value for kind.
     * @param  unit  String value for unit.
     * @param  valueType  FeatureValueType value for valueType.
     * @param  defaultValue  String value for defaultValue.
     * @param  defaultPeriodicityInterval  Integer value for defaultPeriodicityInterval.
     * @param  defaultPeriodicityUnit  EntitlementPeriodicityUnit value for defaultPeriodicityUnit.
     * @param  archivedAt  ZonedDateTime value for archivedAt.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     * @param  productsCount  Integer value for productsCount.
     * @param  plansCount  Integer value for plansCount.
     */
    public FeatureTemplate(
            Integer id,
            String key,
            String name,
            String description,
            FeatureKind kind,
            String unit,
            FeatureValueType valueType,
            String defaultValue,
            Integer defaultPeriodicityInterval,
            EntitlementPeriodicityUnit defaultPeriodicityUnit,
            ZonedDateTime archivedAt,
            ZonedDateTime createdAt,
            ZonedDateTime updatedAt,
            Integer productsCount,
            Integer plansCount) {
        this.id = id;
        this.key = key;
        this.name = name;
        this.description = OptionalNullable.of(description);
        this.kind = kind;
        this.unit = OptionalNullable.of(unit);
        this.valueType = valueType;
        this.defaultValue = OptionalNullable.of(defaultValue);
        this.defaultPeriodicityInterval = OptionalNullable.of(defaultPeriodicityInterval);
        this.defaultPeriodicityUnit = OptionalNullable.of(defaultPeriodicityUnit);
        this.archivedAt = OptionalNullable.of(archivedAt);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.productsCount = productsCount;
        this.plansCount = plansCount;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  key  String value for key.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  kind  FeatureKind value for kind.
     * @param  unit  String value for unit.
     * @param  valueType  FeatureValueType value for valueType.
     * @param  defaultValue  String value for defaultValue.
     * @param  defaultPeriodicityInterval  Integer value for defaultPeriodicityInterval.
     * @param  defaultPeriodicityUnit  EntitlementPeriodicityUnit value for defaultPeriodicityUnit.
     * @param  archivedAt  ZonedDateTime value for archivedAt.
     * @param  createdAt  ZonedDateTime value for createdAt.
     * @param  updatedAt  ZonedDateTime value for updatedAt.
     * @param  productsCount  Integer value for productsCount.
     * @param  plansCount  Integer value for plansCount.
     */

    protected FeatureTemplate(Integer id, String key, String name,
            OptionalNullable<String> description, FeatureKind kind, OptionalNullable<String> unit,
            FeatureValueType valueType, OptionalNullable<String> defaultValue,
            OptionalNullable<Integer> defaultPeriodicityInterval,
            OptionalNullable<EntitlementPeriodicityUnit> defaultPeriodicityUnit,
            OptionalNullable<ZonedDateTime> archivedAt, ZonedDateTime createdAt,
            ZonedDateTime updatedAt, Integer productsCount, Integer plansCount) {
        this.id = id;
        this.key = key;
        this.name = name;
        this.description = description;
        this.kind = kind;
        this.unit = unit;
        this.valueType = valueType;
        this.defaultValue = defaultValue;
        this.defaultPeriodicityInterval = defaultPeriodicityInterval;
        this.defaultPeriodicityUnit = defaultPeriodicityUnit;
        this.archivedAt = archivedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.productsCount = productsCount;
        this.plansCount = plansCount;
    }

    /**
     * Getter for Id.
     * The Advanced Billing id of the feature template.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The Advanced Billing id of the feature template.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for Key.
     * A unique, lowercase, underscore-separated identifier for the feature. Immutable once set.
     * @return Returns the String
     */
    @JsonGetter("key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * A unique, lowercase, underscore-separated identifier for the feature. Immutable once set.
     * @param key Value for String
     */
    @JsonSetter("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Getter for Name.
     * The display name of the feature.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The display name of the feature.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
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
     * Getter for Kind.
     * The behavior of a feature: - `access_right`: a boolean entitlement. A subscriber either has
     * access or does not. - `usage_limit`: a quantified allowance measured over a recurring period
     * (for example, "10,000 API calls per month"). - `service_right`: a free-form value (text,
     * boolean, or number) that isn't a simple access flag or a metered limit.
     * @return Returns the FeatureKind
     */
    @JsonGetter("kind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FeatureKind getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * The behavior of a feature: - `access_right`: a boolean entitlement. A subscriber either has
     * access or does not. - `usage_limit`: a quantified allowance measured over a recurring period
     * (for example, "10,000 API calls per month"). - `service_right`: a free-form value (text,
     * boolean, or number) that isn't a simple access flag or a metered limit.
     * @param kind Value for FeatureKind
     */
    @JsonSetter("kind")
    public void setKind(FeatureKind kind) {
        this.kind = kind;
    }

    /**
     * Internal Getter for Unit.
     * The unit the feature is measured in (for example, `requests` or `GB`). Required when `kind`
     * is `usage_limit`.
     * @return Returns the Internal String
     */
    @JsonGetter("unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetUnit() {
        return this.unit;
    }

    /**
     * Getter for Unit.
     * The unit the feature is measured in (for example, `requests` or `GB`). Required when `kind`
     * is `usage_limit`.
     * @return Returns the String
     */
    public String getUnit() {
        return OptionalNullable.getFrom(unit);
    }

    /**
     * Setter for Unit.
     * The unit the feature is measured in (for example, `requests` or `GB`). Required when `kind`
     * is `usage_limit`.
     * @param unit Value for String
     */
    @JsonSetter("unit")
    public void setUnit(String unit) {
        this.unit = OptionalNullable.of(unit);
    }

    /**
     * UnSetter for Unit.
     * The unit the feature is measured in (for example, `requests` or `GB`). Required when `kind`
     * is `usage_limit`.
     */
    public void unsetUnit() {
        unit = null;
    }

    /**
     * Getter for ValueType.
     * The data type of a feature's value. For `access_right` features this is always `boolean`, and
     * for `usage_limit` features this is always `numeric`. For `service_right` features, you choose
     * the value type explicitly.
     * @return Returns the FeatureValueType
     */
    @JsonGetter("value_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FeatureValueType getValueType() {
        return valueType;
    }

    /**
     * Setter for ValueType.
     * The data type of a feature's value. For `access_right` features this is always `boolean`, and
     * for `usage_limit` features this is always `numeric`. For `service_right` features, you choose
     * the value type explicitly.
     * @param valueType Value for FeatureValueType
     */
    @JsonSetter("value_type")
    public void setValueType(FeatureValueType valueType) {
        this.valueType = valueType;
    }

    /**
     * Internal Getter for DefaultValue.
     * A default value used to pre-populate new feature catalog items created from this template.
     * @return Returns the Internal String
     */
    @JsonGetter("default_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDefaultValue() {
        return this.defaultValue;
    }

    /**
     * Getter for DefaultValue.
     * A default value used to pre-populate new feature catalog items created from this template.
     * @return Returns the String
     */
    public String getDefaultValue() {
        return OptionalNullable.getFrom(defaultValue);
    }

    /**
     * Setter for DefaultValue.
     * A default value used to pre-populate new feature catalog items created from this template.
     * @param defaultValue Value for String
     */
    @JsonSetter("default_value")
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = OptionalNullable.of(defaultValue);
    }

    /**
     * UnSetter for DefaultValue.
     * A default value used to pre-populate new feature catalog items created from this template.
     */
    public void unsetDefaultValue() {
        defaultValue = null;
    }

    /**
     * Internal Getter for DefaultPeriodicityInterval.
     * For `usage_limit` features, the default periodicity interval used to pre-populate new feature
     * catalog items. Always `null` for other kinds.
     * @return Returns the Internal Integer
     */
    @JsonGetter("default_periodicity_interval")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetDefaultPeriodicityInterval() {
        return this.defaultPeriodicityInterval;
    }

    /**
     * Getter for DefaultPeriodicityInterval.
     * For `usage_limit` features, the default periodicity interval used to pre-populate new feature
     * catalog items. Always `null` for other kinds.
     * @return Returns the Integer
     */
    public Integer getDefaultPeriodicityInterval() {
        return OptionalNullable.getFrom(defaultPeriodicityInterval);
    }

    /**
     * Setter for DefaultPeriodicityInterval.
     * For `usage_limit` features, the default periodicity interval used to pre-populate new feature
     * catalog items. Always `null` for other kinds.
     * @param defaultPeriodicityInterval Value for Integer
     */
    @JsonSetter("default_periodicity_interval")
    public void setDefaultPeriodicityInterval(Integer defaultPeriodicityInterval) {
        this.defaultPeriodicityInterval = OptionalNullable.of(defaultPeriodicityInterval);
    }

    /**
     * UnSetter for DefaultPeriodicityInterval.
     * For `usage_limit` features, the default periodicity interval used to pre-populate new feature
     * catalog items. Always `null` for other kinds.
     */
    public void unsetDefaultPeriodicityInterval() {
        defaultPeriodicityInterval = null;
    }

    /**
     * Internal Getter for DefaultPeriodicityUnit.
     * For `usage_limit` features, the default periodicity unit used to pre-populate new feature
     * catalog items. Always `null` for other kinds.
     * @return Returns the Internal EntitlementPeriodicityUnit
     */
    @JsonGetter("default_periodicity_unit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<EntitlementPeriodicityUnit> internalGetDefaultPeriodicityUnit() {
        return this.defaultPeriodicityUnit;
    }

    /**
     * Getter for DefaultPeriodicityUnit.
     * For `usage_limit` features, the default periodicity unit used to pre-populate new feature
     * catalog items. Always `null` for other kinds.
     * @return Returns the EntitlementPeriodicityUnit
     */
    public EntitlementPeriodicityUnit getDefaultPeriodicityUnit() {
        return OptionalNullable.getFrom(defaultPeriodicityUnit);
    }

    /**
     * Setter for DefaultPeriodicityUnit.
     * For `usage_limit` features, the default periodicity unit used to pre-populate new feature
     * catalog items. Always `null` for other kinds.
     * @param defaultPeriodicityUnit Value for EntitlementPeriodicityUnit
     */
    @JsonSetter("default_periodicity_unit")
    public void setDefaultPeriodicityUnit(EntitlementPeriodicityUnit defaultPeriodicityUnit) {
        this.defaultPeriodicityUnit = OptionalNullable.of(defaultPeriodicityUnit);
    }

    /**
     * UnSetter for DefaultPeriodicityUnit.
     * For `usage_limit` features, the default periodicity unit used to pre-populate new feature
     * catalog items. Always `null` for other kinds.
     */
    public void unsetDefaultPeriodicityUnit() {
        defaultPeriodicityUnit = null;
    }

    /**
     * Internal Getter for ArchivedAt.
     * The date and time the feature template was archived, or `null` if it is active.
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
     * The date and time the feature template was archived, or `null` if it is active.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getArchivedAt() {
        return OptionalNullable.getFrom(archivedAt);
    }

    /**
     * Setter for ArchivedAt.
     * The date and time the feature template was archived, or `null` if it is active.
     * @param archivedAt Value for ZonedDateTime
     */
    @JsonSetter("archived_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setArchivedAt(ZonedDateTime archivedAt) {
        this.archivedAt = OptionalNullable.of(archivedAt);
    }

    /**
     * UnSetter for ArchivedAt.
     * The date and time the feature template was archived, or `null` if it is active.
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
     * Getter for ProductsCount.
     * The number of **components** this feature template is currently attached to via an active
     * feature catalog item. Despite the name, this counts components, not products. In the Advanced
     * Billing UI, components are labeled "Products."
     * @return Returns the Integer
     */
    @JsonGetter("products_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getProductsCount() {
        return productsCount;
    }

    /**
     * Setter for ProductsCount.
     * The number of **components** this feature template is currently attached to via an active
     * feature catalog item. Despite the name, this counts components, not products. In the Advanced
     * Billing UI, components are labeled "Products."
     * @param productsCount Value for Integer
     */
    @JsonSetter("products_count")
    public void setProductsCount(Integer productsCount) {
        this.productsCount = productsCount;
    }

    /**
     * Getter for PlansCount.
     * The number of **products** this feature template is currently attached to via an active
     * feature catalog item. Despite the name, this counts products, not plans. In the Advanced
     * Billing UI, products are labeled "Plans."
     * @return Returns the Integer
     */
    @JsonGetter("plans_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPlansCount() {
        return plansCount;
    }

    /**
     * Setter for PlansCount.
     * The number of **products** this feature template is currently attached to via an active
     * feature catalog item. Despite the name, this counts products, not plans. In the Advanced
     * Billing UI, products are labeled "Plans."
     * @param plansCount Value for Integer
     */
    @JsonSetter("plans_count")
    public void setPlansCount(Integer plansCount) {
        this.plansCount = plansCount;
    }

    /**
     * Converts this FeatureTemplate into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FeatureTemplate [" + "id=" + id + ", key=" + key + ", name=" + name
                + ", description=" + description + ", kind=" + kind + ", unit=" + unit
                + ", valueType=" + valueType + ", defaultValue=" + defaultValue
                + ", defaultPeriodicityInterval=" + defaultPeriodicityInterval
                + ", defaultPeriodicityUnit=" + defaultPeriodicityUnit + ", archivedAt="
                + archivedAt + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
                + ", productsCount=" + productsCount + ", plansCount=" + plansCount
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link FeatureTemplate.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FeatureTemplate.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .key(getKey())
                .name(getName())
                .kind(getKind())
                .valueType(getValueType())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .productsCount(getProductsCount())
                .plansCount(getPlansCount());
        builder.description = internalGetDescription();
        builder.unit = internalGetUnit();
        builder.defaultValue = internalGetDefaultValue();
        builder.defaultPeriodicityInterval = internalGetDefaultPeriodicityInterval();
        builder.defaultPeriodicityUnit = internalGetDefaultPeriodicityUnit();
        builder.archivedAt = internalGetArchivedAt();
        return builder;
    }

    /**
     * Class to build instances of {@link FeatureTemplate}.
     */
    public static class Builder {
        private Integer id;
        private String key;
        private String name;
        private OptionalNullable<String> description;
        private FeatureKind kind;
        private OptionalNullable<String> unit;
        private FeatureValueType valueType;
        private OptionalNullable<String> defaultValue;
        private OptionalNullable<Integer> defaultPeriodicityInterval;
        private OptionalNullable<EntitlementPeriodicityUnit> defaultPeriodicityUnit;
        private OptionalNullable<ZonedDateTime> archivedAt;
        private ZonedDateTime createdAt;
        private ZonedDateTime updatedAt;
        private Integer productsCount;
        private Integer plansCount;



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
         * Setter for key.
         * @param  key  String value for key.
         * @return Builder
         */
        public Builder key(String key) {
            this.key = key;
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
         * Setter for kind.
         * @param  kind  FeatureKind value for kind.
         * @return Builder
         */
        public Builder kind(FeatureKind kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Setter for unit.
         * @param  unit  String value for unit.
         * @return Builder
         */
        public Builder unit(String unit) {
            this.unit = OptionalNullable.of(unit);
            return this;
        }

        /**
         * UnSetter for unit.
         * @return Builder
         */
        public Builder unsetUnit() {
            unit = null;
            return this;
        }

        /**
         * Setter for valueType.
         * @param  valueType  FeatureValueType value for valueType.
         * @return Builder
         */
        public Builder valueType(FeatureValueType valueType) {
            this.valueType = valueType;
            return this;
        }

        /**
         * Setter for defaultValue.
         * @param  defaultValue  String value for defaultValue.
         * @return Builder
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = OptionalNullable.of(defaultValue);
            return this;
        }

        /**
         * UnSetter for defaultValue.
         * @return Builder
         */
        public Builder unsetDefaultValue() {
            defaultValue = null;
            return this;
        }

        /**
         * Setter for defaultPeriodicityInterval.
         * @param  defaultPeriodicityInterval  Integer value for defaultPeriodicityInterval.
         * @return Builder
         */
        public Builder defaultPeriodicityInterval(Integer defaultPeriodicityInterval) {
            this.defaultPeriodicityInterval = OptionalNullable.of(defaultPeriodicityInterval);
            return this;
        }

        /**
         * UnSetter for defaultPeriodicityInterval.
         * @return Builder
         */
        public Builder unsetDefaultPeriodicityInterval() {
            defaultPeriodicityInterval = null;
            return this;
        }

        /**
         * Setter for defaultPeriodicityUnit.
         * @param  defaultPeriodicityUnit  EntitlementPeriodicityUnit value for
         *         defaultPeriodicityUnit.
         * @return Builder
         */
        public Builder defaultPeriodicityUnit(EntitlementPeriodicityUnit defaultPeriodicityUnit) {
            this.defaultPeriodicityUnit = OptionalNullable.of(defaultPeriodicityUnit);
            return this;
        }

        /**
         * UnSetter for defaultPeriodicityUnit.
         * @return Builder
         */
        public Builder unsetDefaultPeriodicityUnit() {
            defaultPeriodicityUnit = null;
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
         * Setter for productsCount.
         * @param  productsCount  Integer value for productsCount.
         * @return Builder
         */
        public Builder productsCount(Integer productsCount) {
            this.productsCount = productsCount;
            return this;
        }

        /**
         * Setter for plansCount.
         * @param  plansCount  Integer value for plansCount.
         * @return Builder
         */
        public Builder plansCount(Integer plansCount) {
            this.plansCount = plansCount;
            return this;
        }

        /**
         * Builds a new {@link FeatureTemplate} object using the set fields.
         * @return {@link FeatureTemplate}
         */
        public FeatureTemplate build() {
            return new FeatureTemplate(id, key, name, description, kind, unit, valueType,
                    defaultValue, defaultPeriodicityInterval, defaultPeriodicityUnit, archivedAt,
                    createdAt, updatedAt, productsCount, plansCount);
        }
    }
}
