/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CustomFieldValueChange type.
 */
public class CustomFieldValueChange {
    private String eventType;
    private String metafieldName;
    private int metafieldId;
    private String oldValue;
    private String newValue;
    private String resourceType;
    private int resourceId;

    /**
     * Default constructor.
     */
    public CustomFieldValueChange() {
    }

    /**
     * Initialization constructor.
     * @param  eventType  String value for eventType.
     * @param  metafieldName  String value for metafieldName.
     * @param  metafieldId  int value for metafieldId.
     * @param  oldValue  String value for oldValue.
     * @param  newValue  String value for newValue.
     * @param  resourceType  String value for resourceType.
     * @param  resourceId  int value for resourceId.
     */
    @JsonCreator
    public CustomFieldValueChange(
            @JsonProperty("event_type") String eventType,
            @JsonProperty("metafield_name") String metafieldName,
            @JsonProperty("metafield_id") int metafieldId,
            @JsonProperty("old_value") String oldValue,
            @JsonProperty("new_value") String newValue,
            @JsonProperty("resource_type") String resourceType,
            @JsonProperty("resource_id") int resourceId) {
        this.eventType = eventType;
        this.metafieldName = metafieldName;
        this.metafieldId = metafieldId;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.resourceType = resourceType;
        this.resourceId = resourceId;
    }

    /**
     * Getter for EventType.
     * @return Returns the String
     */
    @JsonGetter("event_type")
    public String getEventType() {
        return eventType;
    }

    /**
     * Setter for EventType.
     * @param eventType Value for String
     */
    @JsonSetter("event_type")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * Getter for MetafieldName.
     * @return Returns the String
     */
    @JsonGetter("metafield_name")
    public String getMetafieldName() {
        return metafieldName;
    }

    /**
     * Setter for MetafieldName.
     * @param metafieldName Value for String
     */
    @JsonSetter("metafield_name")
    public void setMetafieldName(String metafieldName) {
        this.metafieldName = metafieldName;
    }

    /**
     * Getter for MetafieldId.
     * @return Returns the int
     */
    @JsonGetter("metafield_id")
    public int getMetafieldId() {
        return metafieldId;
    }

    /**
     * Setter for MetafieldId.
     * @param metafieldId Value for int
     */
    @JsonSetter("metafield_id")
    public void setMetafieldId(int metafieldId) {
        this.metafieldId = metafieldId;
    }

    /**
     * Getter for OldValue.
     * @return Returns the String
     */
    @JsonGetter("old_value")
    public String getOldValue() {
        return oldValue;
    }

    /**
     * Setter for OldValue.
     * @param oldValue Value for String
     */
    @JsonSetter("old_value")
    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    /**
     * Getter for NewValue.
     * @return Returns the String
     */
    @JsonGetter("new_value")
    public String getNewValue() {
        return newValue;
    }

    /**
     * Setter for NewValue.
     * @param newValue Value for String
     */
    @JsonSetter("new_value")
    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    /**
     * Getter for ResourceType.
     * @return Returns the String
     */
    @JsonGetter("resource_type")
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Setter for ResourceType.
     * @param resourceType Value for String
     */
    @JsonSetter("resource_type")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Getter for ResourceId.
     * @return Returns the int
     */
    @JsonGetter("resource_id")
    public int getResourceId() {
        return resourceId;
    }

    /**
     * Setter for ResourceId.
     * @param resourceId Value for int
     */
    @JsonSetter("resource_id")
    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Converts this CustomFieldValueChange into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomFieldValueChange [" + "eventType=" + eventType + ", metafieldName="
                + metafieldName + ", metafieldId=" + metafieldId + ", oldValue=" + oldValue
                + ", newValue=" + newValue + ", resourceType=" + resourceType + ", resourceId="
                + resourceId + "]";
    }

    /**
     * Builds a new {@link CustomFieldValueChange.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomFieldValueChange.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(eventType, metafieldName, metafieldId, oldValue, newValue,
                resourceType, resourceId);
        return builder;
    }

    /**
     * Class to build instances of {@link CustomFieldValueChange}.
     */
    public static class Builder {
        private String eventType;
        private String metafieldName;
        private int metafieldId;
        private String oldValue;
        private String newValue;
        private String resourceType;
        private int resourceId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  eventType  String value for eventType.
         * @param  metafieldName  String value for metafieldName.
         * @param  metafieldId  int value for metafieldId.
         * @param  oldValue  String value for oldValue.
         * @param  newValue  String value for newValue.
         * @param  resourceType  String value for resourceType.
         * @param  resourceId  int value for resourceId.
         */
        public Builder(String eventType, String metafieldName, int metafieldId, String oldValue,
                String newValue, String resourceType, int resourceId) {
            this.eventType = eventType;
            this.metafieldName = metafieldName;
            this.metafieldId = metafieldId;
            this.oldValue = oldValue;
            this.newValue = newValue;
            this.resourceType = resourceType;
            this.resourceId = resourceId;
        }

        /**
         * Setter for eventType.
         * @param  eventType  String value for eventType.
         * @return Builder
         */
        public Builder eventType(String eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * Setter for metafieldName.
         * @param  metafieldName  String value for metafieldName.
         * @return Builder
         */
        public Builder metafieldName(String metafieldName) {
            this.metafieldName = metafieldName;
            return this;
        }

        /**
         * Setter for metafieldId.
         * @param  metafieldId  int value for metafieldId.
         * @return Builder
         */
        public Builder metafieldId(int metafieldId) {
            this.metafieldId = metafieldId;
            return this;
        }

        /**
         * Setter for oldValue.
         * @param  oldValue  String value for oldValue.
         * @return Builder
         */
        public Builder oldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }

        /**
         * Setter for newValue.
         * @param  newValue  String value for newValue.
         * @return Builder
         */
        public Builder newValue(String newValue) {
            this.newValue = newValue;
            return this;
        }

        /**
         * Setter for resourceType.
         * @param  resourceType  String value for resourceType.
         * @return Builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Setter for resourceId.
         * @param  resourceId  int value for resourceId.
         * @return Builder
         */
        public Builder resourceId(int resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Builds a new {@link CustomFieldValueChange} object using the set fields.
         * @return {@link CustomFieldValueChange}
         */
        public CustomFieldValueChange build() {
            return new CustomFieldValueChange(eventType, metafieldName, metafieldId, oldValue,
                    newValue, resourceType, resourceId);
        }
    }
}
