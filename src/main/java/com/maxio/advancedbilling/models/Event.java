/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.EventEventSpecificData;

/**
 * This is a model class for Event type.
 */
public class Event {
    private int id;
    private String key;
    private String message;
    private int subscriptionId;
    private int customerId;
    private String createdAt;
    private EventEventSpecificData eventSpecificData;

    /**
     * Default constructor.
     */
    public Event() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  key  String value for key.
     * @param  message  String value for message.
     * @param  subscriptionId  int value for subscriptionId.
     * @param  customerId  int value for customerId.
     * @param  createdAt  String value for createdAt.
     * @param  eventSpecificData  EventEventSpecificData value for eventSpecificData.
     */
    public Event(
            int id,
            String key,
            String message,
            int subscriptionId,
            int customerId,
            String createdAt,
            EventEventSpecificData eventSpecificData) {
        this.id = id;
        this.key = key;
        this.message = message;
        this.subscriptionId = subscriptionId;
        this.customerId = customerId;
        this.createdAt = createdAt;
        this.eventSpecificData = eventSpecificData;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for Key.
     * @return Returns the String
     */
    @JsonGetter("key")
    public String getKey() {
        return key;
    }

    /**
     * Setter for Key.
     * @param key Value for String
     */
    @JsonSetter("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Getter for Message.
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter for SubscriptionId.
     * @return Returns the int
     */
    @JsonGetter("subscription_id")
    public int getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for int
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for CustomerId.
     * @return Returns the int
     */
    @JsonGetter("customer_id")
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * @param customerId Value for int
     */
    @JsonSetter("customer_id")
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
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
     * Getter for EventSpecificData.
     * @return Returns the EventEventSpecificData
     */
    @JsonGetter("event_specific_data")
    public EventEventSpecificData getEventSpecificData() {
        return eventSpecificData;
    }

    /**
     * Setter for EventSpecificData.
     * @param eventSpecificData Value for EventEventSpecificData
     */
    @JsonSetter("event_specific_data")
    public void setEventSpecificData(EventEventSpecificData eventSpecificData) {
        this.eventSpecificData = eventSpecificData;
    }

    /**
     * Converts this Event into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Event [" + "id=" + id + ", key=" + key + ", message=" + message
                + ", subscriptionId=" + subscriptionId + ", customerId=" + customerId
                + ", createdAt=" + createdAt + ", eventSpecificData=" + eventSpecificData + "]";
    }

    /**
     * Builds a new {@link Event.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Event.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, key, message, subscriptionId, customerId, createdAt,
                eventSpecificData);
        return builder;
    }

    /**
     * Class to build instances of {@link Event}.
     */
    public static class Builder {
        private int id;
        private String key;
        private String message;
        private int subscriptionId;
        private int customerId;
        private String createdAt;
        private EventEventSpecificData eventSpecificData;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  key  String value for key.
         * @param  message  String value for message.
         * @param  subscriptionId  int value for subscriptionId.
         * @param  customerId  int value for customerId.
         * @param  createdAt  String value for createdAt.
         * @param  eventSpecificData  EventEventSpecificData value for eventSpecificData.
         */
        public Builder(int id, String key, String message, int subscriptionId, int customerId,
                String createdAt, EventEventSpecificData eventSpecificData) {
            this.id = id;
            this.key = key;
            this.message = message;
            this.subscriptionId = subscriptionId;
            this.customerId = customerId;
            this.createdAt = createdAt;
            this.eventSpecificData = eventSpecificData;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
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
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  int value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(int subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for customerId.
         * @param  customerId  int value for customerId.
         * @return Builder
         */
        public Builder customerId(int customerId) {
            this.customerId = customerId;
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
         * Setter for eventSpecificData.
         * @param  eventSpecificData  EventEventSpecificData value for eventSpecificData.
         * @return Builder
         */
        public Builder eventSpecificData(EventEventSpecificData eventSpecificData) {
            this.eventSpecificData = eventSpecificData;
            return this;
        }

        /**
         * Builds a new {@link Event} object using the set fields.
         * @return {@link Event}
         */
        public Event build() {
            return new Event(id, key, message, subscriptionId, customerId, createdAt,
                    eventSpecificData);
        }
    }
}
