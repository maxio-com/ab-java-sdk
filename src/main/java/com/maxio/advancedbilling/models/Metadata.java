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
 * This is a model class for Metadata type.
 */
public class Metadata
        extends BaseModel {
    private OptionalNullable<Integer> id;
    private OptionalNullable<String> value;
    private OptionalNullable<Integer> resourceId;
    private String name;
    private OptionalNullable<ZonedDateTime> deletedAt;
    private OptionalNullable<Integer> metafieldId;

    /**
     * Default constructor.
     */
    public Metadata() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  value  String value for value.
     * @param  resourceId  Integer value for resourceId.
     * @param  name  String value for name.
     * @param  deletedAt  ZonedDateTime value for deletedAt.
     * @param  metafieldId  Integer value for metafieldId.
     */
    public Metadata(
            Integer id,
            String value,
            Integer resourceId,
            String name,
            ZonedDateTime deletedAt,
            Integer metafieldId) {
        this.id = OptionalNullable.of(id);
        this.value = OptionalNullable.of(value);
        this.resourceId = OptionalNullable.of(resourceId);
        this.name = name;
        this.deletedAt = OptionalNullable.of(deletedAt);
        this.metafieldId = OptionalNullable.of(metafieldId);
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  value  String value for value.
     * @param  resourceId  Integer value for resourceId.
     * @param  name  String value for name.
     * @param  deletedAt  ZonedDateTime value for deletedAt.
     * @param  metafieldId  Integer value for metafieldId.
     */

    protected Metadata(OptionalNullable<Integer> id, OptionalNullable<String> value,
            OptionalNullable<Integer> resourceId, String name,
            OptionalNullable<ZonedDateTime> deletedAt, OptionalNullable<Integer> metafieldId) {
        this.id = id;
        this.value = value;
        this.resourceId = resourceId;
        this.name = name;
        this.deletedAt = deletedAt;
        this.metafieldId = metafieldId;
    }

    /**
     * Internal Getter for Id.
     * @return Returns the Internal Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetId() {
        return this.id;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    public Integer getId() {
        return OptionalNullable.getFrom(id);
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = OptionalNullable.of(id);
    }

    /**
     * UnSetter for Id.
     */
    public void unsetId() {
        id = null;
    }

    /**
     * Internal Getter for Value.
     * @return Returns the Internal String
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetValue() {
        return this.value;
    }

    /**
     * Getter for Value.
     * @return Returns the String
     */
    public String getValue() {
        return OptionalNullable.getFrom(value);
    }

    /**
     * Setter for Value.
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = OptionalNullable.of(value);
    }

    /**
     * UnSetter for Value.
     */
    public void unsetValue() {
        value = null;
    }

    /**
     * Internal Getter for ResourceId.
     * @return Returns the Internal Integer
     */
    @JsonGetter("resource_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetResourceId() {
        return this.resourceId;
    }

    /**
     * Getter for ResourceId.
     * @return Returns the Integer
     */
    public Integer getResourceId() {
        return OptionalNullable.getFrom(resourceId);
    }

    /**
     * Setter for ResourceId.
     * @param resourceId Value for Integer
     */
    @JsonSetter("resource_id")
    public void setResourceId(Integer resourceId) {
        this.resourceId = OptionalNullable.of(resourceId);
    }

    /**
     * UnSetter for ResourceId.
     */
    public void unsetResourceId() {
        resourceId = null;
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
     * Internal Getter for DeletedAt.
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("deleted_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetDeletedAt() {
        return this.deletedAt;
    }

    /**
     * Getter for DeletedAt.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getDeletedAt() {
        return OptionalNullable.getFrom(deletedAt);
    }

    /**
     * Setter for DeletedAt.
     * @param deletedAt Value for ZonedDateTime
     */
    @JsonSetter("deleted_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDeletedAt(ZonedDateTime deletedAt) {
        this.deletedAt = OptionalNullable.of(deletedAt);
    }

    /**
     * UnSetter for DeletedAt.
     */
    public void unsetDeletedAt() {
        deletedAt = null;
    }

    /**
     * Internal Getter for MetafieldId.
     * @return Returns the Internal Integer
     */
    @JsonGetter("metafield_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetMetafieldId() {
        return this.metafieldId;
    }

    /**
     * Getter for MetafieldId.
     * @return Returns the Integer
     */
    public Integer getMetafieldId() {
        return OptionalNullable.getFrom(metafieldId);
    }

    /**
     * Setter for MetafieldId.
     * @param metafieldId Value for Integer
     */
    @JsonSetter("metafield_id")
    public void setMetafieldId(Integer metafieldId) {
        this.metafieldId = OptionalNullable.of(metafieldId);
    }

    /**
     * UnSetter for MetafieldId.
     */
    public void unsetMetafieldId() {
        metafieldId = null;
    }

    /**
     * Converts this Metadata into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Metadata [" + "id=" + id + ", value=" + value + ", resourceId=" + resourceId
                + ", name=" + name + ", deletedAt=" + deletedAt + ", metafieldId=" + metafieldId
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Metadata.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Metadata.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName());
        builder.id = internalGetId();
        builder.value = internalGetValue();
        builder.resourceId = internalGetResourceId();
        builder.deletedAt = internalGetDeletedAt();
        builder.metafieldId = internalGetMetafieldId();
        return builder;
    }

    /**
     * Class to build instances of {@link Metadata}.
     */
    public static class Builder {
        private OptionalNullable<Integer> id;
        private OptionalNullable<String> value;
        private OptionalNullable<Integer> resourceId;
        private String name;
        private OptionalNullable<ZonedDateTime> deletedAt;
        private OptionalNullable<Integer> metafieldId;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = OptionalNullable.of(id);
            return this;
        }

        /**
         * UnSetter for id.
         * @return Builder
         */
        public Builder unsetId() {
            id = null;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = OptionalNullable.of(value);
            return this;
        }

        /**
         * UnSetter for value.
         * @return Builder
         */
        public Builder unsetValue() {
            value = null;
            return this;
        }

        /**
         * Setter for resourceId.
         * @param  resourceId  Integer value for resourceId.
         * @return Builder
         */
        public Builder resourceId(Integer resourceId) {
            this.resourceId = OptionalNullable.of(resourceId);
            return this;
        }

        /**
         * UnSetter for resourceId.
         * @return Builder
         */
        public Builder unsetResourceId() {
            resourceId = null;
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
         * Setter for deletedAt.
         * @param  deletedAt  ZonedDateTime value for deletedAt.
         * @return Builder
         */
        public Builder deletedAt(ZonedDateTime deletedAt) {
            this.deletedAt = OptionalNullable.of(deletedAt);
            return this;
        }

        /**
         * UnSetter for deletedAt.
         * @return Builder
         */
        public Builder unsetDeletedAt() {
            deletedAt = null;
            return this;
        }

        /**
         * Setter for metafieldId.
         * @param  metafieldId  Integer value for metafieldId.
         * @return Builder
         */
        public Builder metafieldId(Integer metafieldId) {
            this.metafieldId = OptionalNullable.of(metafieldId);
            return this;
        }

        /**
         * UnSetter for metafieldId.
         * @return Builder
         */
        public Builder unsetMetafieldId() {
            metafieldId = null;
            return this;
        }

        /**
         * Builds a new {@link Metadata} object using the set fields.
         * @return {@link Metadata}
         */
        public Metadata build() {
            return new Metadata(id, value, resourceId, name, deletedAt, metafieldId);
        }
    }
}
