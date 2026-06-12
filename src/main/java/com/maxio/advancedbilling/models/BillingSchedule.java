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
import java.time.LocalDate;

/**
 * This is a model class for BillingSchedule type.
 */
public class BillingSchedule
        extends BaseModel {
    private OptionalNullable<LocalDate> initialBillingAt;

    /**
     * Default constructor.
     */
    public BillingSchedule() {
    }

    /**
     * Initialization constructor.
     * @param  initialBillingAt  LocalDate value for initialBillingAt.
     */
    public BillingSchedule(
            LocalDate initialBillingAt) {
        this.initialBillingAt = OptionalNullable.of(initialBillingAt);
    }

    /**
     * Initialization constructor.
     * @param  initialBillingAt  LocalDate value for initialBillingAt.
     */

    protected BillingSchedule(OptionalNullable<LocalDate> initialBillingAt) {
        this.initialBillingAt = initialBillingAt;
    }

    /**
     * Internal Getter for InitialBillingAt.
     * Custom start date (ISO 8601 date, YYYY-MM-DD) for the component's first billing period. If
     * omitted or null, billing aligns with the product schedule. If provided, date must be on or
     * after the minimum allowed date for the subscription or component.
     * @return Returns the Internal LocalDate
     */
    @JsonGetter("initial_billing_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.SimpleDateSerializer.class)
    protected OptionalNullable<LocalDate> internalGetInitialBillingAt() {
        return this.initialBillingAt;
    }

    /**
     * Getter for InitialBillingAt.
     * Custom start date (ISO 8601 date, YYYY-MM-DD) for the component's first billing period. If
     * omitted or null, billing aligns with the product schedule. If provided, date must be on or
     * after the minimum allowed date for the subscription or component.
     * @return Returns the LocalDate
     */
    public LocalDate getInitialBillingAt() {
        return OptionalNullable.getFrom(initialBillingAt);
    }

    /**
     * Setter for InitialBillingAt.
     * Custom start date (ISO 8601 date, YYYY-MM-DD) for the component's first billing period. If
     * omitted or null, billing aligns with the product schedule. If provided, date must be on or
     * after the minimum allowed date for the subscription or component.
     * @param initialBillingAt Value for LocalDate
     */
    @JsonSetter("initial_billing_at")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setInitialBillingAt(LocalDate initialBillingAt) {
        this.initialBillingAt = OptionalNullable.of(initialBillingAt);
    }

    /**
     * UnSetter for InitialBillingAt.
     * Custom start date (ISO 8601 date, YYYY-MM-DD) for the component's first billing period. If
     * omitted or null, billing aligns with the product schedule. If provided, date must be on or
     * after the minimum allowed date for the subscription or component.
     */
    public void unsetInitialBillingAt() {
        initialBillingAt = null;
    }

    /**
     * Converts this BillingSchedule into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BillingSchedule [" + "initialBillingAt=" + initialBillingAt
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link BillingSchedule.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BillingSchedule.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.initialBillingAt = internalGetInitialBillingAt();
        return builder;
    }

    /**
     * Class to build instances of {@link BillingSchedule}.
     */
    public static class Builder {
        private OptionalNullable<LocalDate> initialBillingAt;



        /**
         * Setter for initialBillingAt.
         * @param  initialBillingAt  LocalDate value for initialBillingAt.
         * @return Builder
         */
        public Builder initialBillingAt(LocalDate initialBillingAt) {
            this.initialBillingAt = OptionalNullable.of(initialBillingAt);
            return this;
        }

        /**
         * UnSetter for initialBillingAt.
         * @return Builder
         */
        public Builder unsetInitialBillingAt() {
            initialBillingAt = null;
            return this;
        }

        /**
         * Builds a new {@link BillingSchedule} object using the set fields.
         * @return {@link BillingSchedule}
         */
        public BillingSchedule build() {
            return new BillingSchedule(initialBillingAt);
        }
    }
}
