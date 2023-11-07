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
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for CouponRestriction type.
 */
public class CouponRestriction {
    private Integer id;
    private RestrictionType itemType;
    private Integer itemId;
    private String name;
    private OptionalNullable<String> handle;

    /**
     * Default constructor.
     */
    public CouponRestriction() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  itemType  RestrictionType value for itemType.
     * @param  itemId  Integer value for itemId.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     */
    public CouponRestriction(
            Integer id,
            RestrictionType itemType,
            Integer itemId,
            String name,
            String handle) {
        this.id = id;
        this.itemType = itemType;
        this.itemId = itemId;
        this.name = name;
        this.handle = OptionalNullable.of(handle);
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  itemType  RestrictionType value for itemType.
     * @param  itemId  Integer value for itemId.
     * @param  name  String value for name.
     * @param  handle  String value for handle.
     */

    protected CouponRestriction(Integer id, RestrictionType itemType, Integer itemId, String name,
            OptionalNullable<String> handle) {
        this.id = id;
        this.itemType = itemType;
        this.itemId = itemId;
        this.name = name;
        this.handle = handle;
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
     * Getter for ItemType.
     * @return Returns the RestrictionType
     */
    @JsonGetter("item_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RestrictionType getItemType() {
        return itemType;
    }

    /**
     * Setter for ItemType.
     * @param itemType Value for RestrictionType
     */
    @JsonSetter("item_type")
    public void setItemType(RestrictionType itemType) {
        this.itemType = itemType;
    }

    /**
     * Getter for ItemId.
     * @return Returns the Integer
     */
    @JsonGetter("item_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getItemId() {
        return itemId;
    }

    /**
     * Setter for ItemId.
     * @param itemId Value for Integer
     */
    @JsonSetter("item_id")
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
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
     * Internal Getter for Handle.
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
     * @return Returns the String
     */
    public String getHandle() {
        return OptionalNullable.getFrom(handle);
    }

    /**
     * Setter for Handle.
     * @param handle Value for String
     */
    @JsonSetter("handle")
    public void setHandle(String handle) {
        this.handle = OptionalNullable.of(handle);
    }

    /**
     * UnSetter for Handle.
     */
    public void unsetHandle() {
        handle = null;
    }

    /**
     * Converts this CouponRestriction into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CouponRestriction [" + "id=" + id + ", itemType=" + itemType + ", itemId=" + itemId
                + ", name=" + name + ", handle=" + handle + "]";
    }

    /**
     * Builds a new {@link CouponRestriction.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CouponRestriction.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .itemType(getItemType())
                .itemId(getItemId())
                .name(getName());
        builder.handle = internalGetHandle();
        return builder;
    }

    /**
     * Class to build instances of {@link CouponRestriction}.
     */
    public static class Builder {
        private Integer id;
        private RestrictionType itemType;
        private Integer itemId;
        private String name;
        private OptionalNullable<String> handle;



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
         * Setter for itemType.
         * @param  itemType  RestrictionType value for itemType.
         * @return Builder
         */
        public Builder itemType(RestrictionType itemType) {
            this.itemType = itemType;
            return this;
        }

        /**
         * Setter for itemId.
         * @param  itemId  Integer value for itemId.
         * @return Builder
         */
        public Builder itemId(Integer itemId) {
            this.itemId = itemId;
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
         * Builds a new {@link CouponRestriction} object using the set fields.
         * @return {@link CouponRestriction}
         */
        public CouponRestriction build() {
            return new CouponRestriction(id, itemType, itemId, name, handle);
        }
    }
}
