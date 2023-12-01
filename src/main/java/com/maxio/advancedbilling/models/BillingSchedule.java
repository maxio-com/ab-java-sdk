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
import java.time.LocalDate;

/**
 * This is a model class for BillingSchedule type.
 */
public class BillingSchedule {
    private LocalDate initialBillingAt;

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
        this.initialBillingAt = initialBillingAt;
    }

    /**
     * Getter for InitialBillingAt.
     * The initial_billing_at attribute in Maxio allows you to specify a custom starting date for
     * billing cycles associated with components that have their own billing frequency set. Only
     * ISO8601 format is supported.
     * @return Returns the LocalDate
     */
    @JsonGetter("initial_billing_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getInitialBillingAt() {
        return initialBillingAt;
    }

    /**
     * Setter for InitialBillingAt.
     * The initial_billing_at attribute in Maxio allows you to specify a custom starting date for
     * billing cycles associated with components that have their own billing frequency set. Only
     * ISO8601 format is supported.
     * @param initialBillingAt Value for LocalDate
     */
    @JsonSetter("initial_billing_at")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setInitialBillingAt(LocalDate initialBillingAt) {
        this.initialBillingAt = initialBillingAt;
    }

    /**
     * Converts this BillingSchedule into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BillingSchedule [" + "initialBillingAt=" + initialBillingAt + "]";
    }

    /**
     * Builds a new {@link BillingSchedule.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BillingSchedule.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .initialBillingAt(getInitialBillingAt());
        return builder;
    }

    /**
     * Class to build instances of {@link BillingSchedule}.
     */
    public static class Builder {
        private LocalDate initialBillingAt;



        /**
         * Setter for initialBillingAt.
         * @param  initialBillingAt  LocalDate value for initialBillingAt.
         * @return Builder
         */
        public Builder initialBillingAt(LocalDate initialBillingAt) {
            this.initialBillingAt = initialBillingAt;
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
