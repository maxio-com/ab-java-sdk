/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GroupTarget type.
 */
public class GroupTarget {
    private GroupTargetType type;
    private Integer id;

    /**
     * Default constructor.
     */
    public GroupTarget() {
    }

    /**
     * Initialization constructor.
     * @param  type  GroupTargetType value for type.
     * @param  id  Integer value for id.
     */
    public GroupTarget(
            GroupTargetType type,
            Integer id) {
        this.type = type;
        this.id = id;
    }

    /**
     * Getter for Type.
     * The type of object indicated by the id attribute.
     * @return Returns the GroupTargetType
     */
    @JsonGetter("type")
    public GroupTargetType getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The type of object indicated by the id attribute.
     * @param type Value for GroupTargetType
     */
    @JsonSetter("type")
    public void setType(GroupTargetType type) {
        this.type = type;
    }

    /**
     * Getter for Id.
     * The id of the target customer or subscription to group the existing subscription with.
     * Ignored and should not be included if type is "self" , "parent", or "eldest"
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The id of the target customer or subscription to group the existing subscription with.
     * Ignored and should not be included if type is "self" , "parent", or "eldest"
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Converts this GroupTarget into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GroupTarget [" + "type=" + type + ", id=" + id + "]";
    }

    /**
     * Builds a new {@link GroupTarget.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GroupTarget.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type)
                .id(getId());
        return builder;
    }

    /**
     * Class to build instances of {@link GroupTarget}.
     */
    public static class Builder {
        private GroupTargetType type;
        private Integer id;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  GroupTargetType value for type.
         */
        public Builder(GroupTargetType type) {
            this.type = type;
        }

        /**
         * Setter for type.
         * @param  type  GroupTargetType value for type.
         * @return Builder
         */
        public Builder type(GroupTargetType type) {
            this.type = type;
            return this;
        }

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
         * Builds a new {@link GroupTarget} object using the set fields.
         * @return {@link GroupTarget}
         */
        public GroupTarget build() {
            return new GroupTarget(type, id);
        }
    }
}
