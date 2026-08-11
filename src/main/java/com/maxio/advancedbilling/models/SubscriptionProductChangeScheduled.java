/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.time.ZonedDateTime;

/**
 * This is a model class for SubscriptionProductChangeScheduled type.
 */
public class SubscriptionProductChangeScheduled
        extends BaseModel {
    private int previousProductId;
    private int newProductId;
    private OptionalNullable<Integer> previousProductPricePointId;
    private OptionalNullable<Integer> newProductPricePointId;
    private OptionalNullable<ZonedDateTime> effectiveAt;

    /**
     * Default constructor.
     */
    public SubscriptionProductChangeScheduled() {
    }

    /**
     * Initialization constructor.
     * @param  previousProductId  int value for previousProductId.
     * @param  newProductId  int value for newProductId.
     * @param  previousProductPricePointId  Integer value for previousProductPricePointId.
     * @param  newProductPricePointId  Integer value for newProductPricePointId.
     * @param  effectiveAt  ZonedDateTime value for effectiveAt.
     */
    public SubscriptionProductChangeScheduled(
            int previousProductId,
            int newProductId,
            Integer previousProductPricePointId,
            Integer newProductPricePointId,
            ZonedDateTime effectiveAt) {
        this.previousProductId = previousProductId;
        this.newProductId = newProductId;
        this.previousProductPricePointId = OptionalNullable.of(previousProductPricePointId);
        this.newProductPricePointId = OptionalNullable.of(newProductPricePointId);
        this.effectiveAt = OptionalNullable.of(effectiveAt);
    }

    /**
     * Initialization constructor.
     * @param  previousProductId  int value for previousProductId.
     * @param  newProductId  int value for newProductId.
     * @param  previousProductPricePointId  Integer value for previousProductPricePointId.
     * @param  newProductPricePointId  Integer value for newProductPricePointId.
     * @param  effectiveAt  ZonedDateTime value for effectiveAt.
     */

    protected SubscriptionProductChangeScheduled(int previousProductId, int newProductId,
            OptionalNullable<Integer> previousProductPricePointId,
            OptionalNullable<Integer> newProductPricePointId,
            OptionalNullable<ZonedDateTime> effectiveAt) {
        this.previousProductId = previousProductId;
        this.newProductId = newProductId;
        this.previousProductPricePointId = previousProductPricePointId;
        this.newProductPricePointId = newProductPricePointId;
        this.effectiveAt = effectiveAt;
    }

    /**
     * Initialization constructor.
     * @param  previousProductId  int value for previousProductId.
     * @param  newProductId  int value for newProductId.
     */
    @JsonCreator
    protected SubscriptionProductChangeScheduled(
            @JsonProperty("previous_product_id") int previousProductId,
            @JsonProperty("new_product_id") int newProductId) {
        this(previousProductId, newProductId, OptionalNullable.of(null), OptionalNullable.of(null),
                OptionalNullable.of(null));
        unsetPreviousProductPricePointId();
        unsetNewProductPricePointId();
        unsetEffectiveAt();
    }

    /**
     * Getter for PreviousProductId.
     * @return Returns the int
     */
    @JsonGetter("previous_product_id")
    public int getPreviousProductId() {
        return previousProductId;
    }

    /**
     * Setter for PreviousProductId.
     * @param previousProductId Value for int
     */
    @JsonSetter("previous_product_id")
    public void setPreviousProductId(int previousProductId) {
        this.previousProductId = previousProductId;
    }

    /**
     * Getter for NewProductId.
     * @return Returns the int
     */
    @JsonGetter("new_product_id")
    public int getNewProductId() {
        return newProductId;
    }

    /**
     * Setter for NewProductId.
     * @param newProductId Value for int
     */
    @JsonSetter("new_product_id")
    public void setNewProductId(int newProductId) {
        this.newProductId = newProductId;
    }

    /**
     * Internal Getter for PreviousProductPricePointId.
     * @return Returns the Internal Integer
     */
    @JsonGetter("previous_product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetPreviousProductPricePointId() {
        return this.previousProductPricePointId;
    }

    /**
     * Getter for PreviousProductPricePointId.
     * @return Returns the Integer
     */
    public Integer getPreviousProductPricePointId() {
        return OptionalNullable.getFrom(previousProductPricePointId);
    }

    /**
     * Setter for PreviousProductPricePointId.
     * @param previousProductPricePointId Value for Integer
     */
    @JsonSetter("previous_product_price_point_id")
    public void setPreviousProductPricePointId(Integer previousProductPricePointId) {
        this.previousProductPricePointId = OptionalNullable.of(previousProductPricePointId);
    }

    /**
     * UnSetter for PreviousProductPricePointId.
     */
    public void unsetPreviousProductPricePointId() {
        previousProductPricePointId = null;
    }

    /**
     * Internal Getter for NewProductPricePointId.
     * @return Returns the Internal Integer
     */
    @JsonGetter("new_product_price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetNewProductPricePointId() {
        return this.newProductPricePointId;
    }

    /**
     * Getter for NewProductPricePointId.
     * @return Returns the Integer
     */
    public Integer getNewProductPricePointId() {
        return OptionalNullable.getFrom(newProductPricePointId);
    }

    /**
     * Setter for NewProductPricePointId.
     * @param newProductPricePointId Value for Integer
     */
    @JsonSetter("new_product_price_point_id")
    public void setNewProductPricePointId(Integer newProductPricePointId) {
        this.newProductPricePointId = OptionalNullable.of(newProductPricePointId);
    }

    /**
     * UnSetter for NewProductPricePointId.
     */
    public void unsetNewProductPricePointId() {
        newProductPricePointId = null;
    }

    /**
     * Internal Getter for EffectiveAt.
     * When the scheduled product change takes effect (the subscription's next renewal).
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("effective_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetEffectiveAt() {
        return this.effectiveAt;
    }

    /**
     * Getter for EffectiveAt.
     * When the scheduled product change takes effect (the subscription's next renewal).
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getEffectiveAt() {
        return OptionalNullable.getFrom(effectiveAt);
    }

    /**
     * Setter for EffectiveAt.
     * When the scheduled product change takes effect (the subscription's next renewal).
     * @param effectiveAt Value for ZonedDateTime
     */
    @JsonSetter("effective_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setEffectiveAt(ZonedDateTime effectiveAt) {
        this.effectiveAt = OptionalNullable.of(effectiveAt);
    }

    /**
     * UnSetter for EffectiveAt.
     * When the scheduled product change takes effect (the subscription's next renewal).
     */
    public void unsetEffectiveAt() {
        effectiveAt = null;
    }

    /**
     * Converts this SubscriptionProductChangeScheduled into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionProductChangeScheduled [" + "previousProductId=" + previousProductId
                + ", newProductId=" + newProductId + ", previousProductPricePointId="
                + previousProductPricePointId + ", newProductPricePointId=" + newProductPricePointId
                + ", effectiveAt=" + effectiveAt + ", additionalProperties="
                + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SubscriptionProductChangeScheduled.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionProductChangeScheduled.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(previousProductId, newProductId);
        builder.previousProductPricePointId = internalGetPreviousProductPricePointId();
        builder.newProductPricePointId = internalGetNewProductPricePointId();
        builder.effectiveAt = internalGetEffectiveAt();
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionProductChangeScheduled}.
     */
    public static class Builder {
        private int previousProductId;
        private int newProductId;
        private OptionalNullable<Integer> previousProductPricePointId;
        private OptionalNullable<Integer> newProductPricePointId;
        private OptionalNullable<ZonedDateTime> effectiveAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  previousProductId  int value for previousProductId.
         * @param  newProductId  int value for newProductId.
         */
        public Builder(int previousProductId, int newProductId) {
            this.previousProductId = previousProductId;
            this.newProductId = newProductId;
        }

        /**
         * Setter for previousProductId.
         * @param  previousProductId  int value for previousProductId.
         * @return Builder
         */
        public Builder previousProductId(int previousProductId) {
            this.previousProductId = previousProductId;
            return this;
        }

        /**
         * Setter for newProductId.
         * @param  newProductId  int value for newProductId.
         * @return Builder
         */
        public Builder newProductId(int newProductId) {
            this.newProductId = newProductId;
            return this;
        }

        /**
         * Setter for previousProductPricePointId.
         * @param  previousProductPricePointId  Integer value for previousProductPricePointId.
         * @return Builder
         */
        public Builder previousProductPricePointId(Integer previousProductPricePointId) {
            this.previousProductPricePointId = OptionalNullable.of(previousProductPricePointId);
            return this;
        }

        /**
         * UnSetter for previousProductPricePointId.
         * @return Builder
         */
        public Builder unsetPreviousProductPricePointId() {
            previousProductPricePointId = null;
            return this;
        }

        /**
         * Setter for newProductPricePointId.
         * @param  newProductPricePointId  Integer value for newProductPricePointId.
         * @return Builder
         */
        public Builder newProductPricePointId(Integer newProductPricePointId) {
            this.newProductPricePointId = OptionalNullable.of(newProductPricePointId);
            return this;
        }

        /**
         * UnSetter for newProductPricePointId.
         * @return Builder
         */
        public Builder unsetNewProductPricePointId() {
            newProductPricePointId = null;
            return this;
        }

        /**
         * Setter for effectiveAt.
         * @param  effectiveAt  ZonedDateTime value for effectiveAt.
         * @return Builder
         */
        public Builder effectiveAt(ZonedDateTime effectiveAt) {
            this.effectiveAt = OptionalNullable.of(effectiveAt);
            return this;
        }

        /**
         * UnSetter for effectiveAt.
         * @return Builder
         */
        public Builder unsetEffectiveAt() {
            effectiveAt = null;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionProductChangeScheduled} object using the set fields.
         * @return {@link SubscriptionProductChangeScheduled}
         */
        public SubscriptionProductChangeScheduled build() {
            return new SubscriptionProductChangeScheduled(previousProductId, newProductId,
                    previousProductPricePointId, newProductPricePointId, effectiveAt);
        }
    }
}
