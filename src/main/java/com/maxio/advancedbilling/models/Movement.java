/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for Movement type.
 */
public class Movement {
    private String timestamp;
    private Integer amountInCents;
    private String amountFormatted;
    private String description;
    private String category;
    private Breakouts breakouts;
    private List<MovementLineItem> lineItems;
    private Integer subscriptionId;
    private String subscriberName;

    /**
     * Default constructor.
     */
    public Movement() {
    }

    /**
     * Initialization constructor.
     * @param  timestamp  String value for timestamp.
     * @param  amountInCents  Integer value for amountInCents.
     * @param  amountFormatted  String value for amountFormatted.
     * @param  description  String value for description.
     * @param  category  String value for category.
     * @param  breakouts  Breakouts value for breakouts.
     * @param  lineItems  List of MovementLineItem value for lineItems.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  subscriberName  String value for subscriberName.
     */
    public Movement(
            String timestamp,
            Integer amountInCents,
            String amountFormatted,
            String description,
            String category,
            Breakouts breakouts,
            List<MovementLineItem> lineItems,
            Integer subscriptionId,
            String subscriberName) {
        this.timestamp = timestamp;
        this.amountInCents = amountInCents;
        this.amountFormatted = amountFormatted;
        this.description = description;
        this.category = category;
        this.breakouts = breakouts;
        this.lineItems = lineItems;
        this.subscriptionId = subscriptionId;
        this.subscriberName = subscriberName;
    }

    /**
     * Getter for Timestamp.
     * @return Returns the String
     */
    @JsonGetter("timestamp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Setter for Timestamp.
     * @param timestamp Value for String
     */
    @JsonSetter("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Getter for AmountInCents.
     * @return Returns the Integer
     */
    @JsonGetter("amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmountInCents() {
        return amountInCents;
    }

    /**
     * Setter for AmountInCents.
     * @param amountInCents Value for Integer
     */
    @JsonSetter("amount_in_cents")
    public void setAmountInCents(Integer amountInCents) {
        this.amountInCents = amountInCents;
    }

    /**
     * Getter for AmountFormatted.
     * @return Returns the String
     */
    @JsonGetter("amount_formatted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAmountFormatted() {
        return amountFormatted;
    }

    /**
     * Setter for AmountFormatted.
     * @param amountFormatted Value for String
     */
    @JsonSetter("amount_formatted")
    public void setAmountFormatted(String amountFormatted) {
        this.amountFormatted = amountFormatted;
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
     * Getter for Category.
     * @return Returns the String
     */
    @JsonGetter("category")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCategory() {
        return category;
    }

    /**
     * Setter for Category.
     * @param category Value for String
     */
    @JsonSetter("category")
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Getter for Breakouts.
     * @return Returns the Breakouts
     */
    @JsonGetter("breakouts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Breakouts getBreakouts() {
        return breakouts;
    }

    /**
     * Setter for Breakouts.
     * @param breakouts Value for Breakouts
     */
    @JsonSetter("breakouts")
    public void setBreakouts(Breakouts breakouts) {
        this.breakouts = breakouts;
    }

    /**
     * Getter for LineItems.
     * @return Returns the List of MovementLineItem
     */
    @JsonGetter("line_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<MovementLineItem> getLineItems() {
        return lineItems;
    }

    /**
     * Setter for LineItems.
     * @param lineItems Value for List of MovementLineItem
     */
    @JsonSetter("line_items")
    public void setLineItems(List<MovementLineItem> lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * Getter for SubscriptionId.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for SubscriberName.
     * @return Returns the String
     */
    @JsonGetter("subscriber_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubscriberName() {
        return subscriberName;
    }

    /**
     * Setter for SubscriberName.
     * @param subscriberName Value for String
     */
    @JsonSetter("subscriber_name")
    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    /**
     * Converts this Movement into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Movement [" + "timestamp=" + timestamp + ", amountInCents=" + amountInCents
                + ", amountFormatted=" + amountFormatted + ", description=" + description
                + ", category=" + category + ", breakouts=" + breakouts + ", lineItems=" + lineItems
                + ", subscriptionId=" + subscriptionId + ", subscriberName=" + subscriberName + "]";
    }

    /**
     * Builds a new {@link Movement.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Movement.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .timestamp(getTimestamp())
                .amountInCents(getAmountInCents())
                .amountFormatted(getAmountFormatted())
                .description(getDescription())
                .category(getCategory())
                .breakouts(getBreakouts())
                .lineItems(getLineItems())
                .subscriptionId(getSubscriptionId())
                .subscriberName(getSubscriberName());
        return builder;
    }

    /**
     * Class to build instances of {@link Movement}.
     */
    public static class Builder {
        private String timestamp;
        private Integer amountInCents;
        private String amountFormatted;
        private String description;
        private String category;
        private Breakouts breakouts;
        private List<MovementLineItem> lineItems;
        private Integer subscriptionId;
        private String subscriberName;



        /**
         * Setter for timestamp.
         * @param  timestamp  String value for timestamp.
         * @return Builder
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Setter for amountInCents.
         * @param  amountInCents  Integer value for amountInCents.
         * @return Builder
         */
        public Builder amountInCents(Integer amountInCents) {
            this.amountInCents = amountInCents;
            return this;
        }

        /**
         * Setter for amountFormatted.
         * @param  amountFormatted  String value for amountFormatted.
         * @return Builder
         */
        public Builder amountFormatted(String amountFormatted) {
            this.amountFormatted = amountFormatted;
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
         * Setter for category.
         * @param  category  String value for category.
         * @return Builder
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * Setter for breakouts.
         * @param  breakouts  Breakouts value for breakouts.
         * @return Builder
         */
        public Builder breakouts(Breakouts breakouts) {
            this.breakouts = breakouts;
            return this;
        }

        /**
         * Setter for lineItems.
         * @param  lineItems  List of MovementLineItem value for lineItems.
         * @return Builder
         */
        public Builder lineItems(List<MovementLineItem> lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for subscriberName.
         * @param  subscriberName  String value for subscriberName.
         * @return Builder
         */
        public Builder subscriberName(String subscriberName) {
            this.subscriberName = subscriberName;
            return this;
        }

        /**
         * Builds a new {@link Movement} object using the set fields.
         * @return {@link Movement}
         */
        public Movement build() {
            return new Movement(timestamp, amountInCents, amountFormatted, description, category,
                    breakouts, lineItems, subscriptionId, subscriberName);
        }
    }
}
