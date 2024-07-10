/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ActivateEventBasedComponent type.
 */
public class ActivateEventBasedComponent
        extends BaseModel {
    private Integer pricePointId;
    private BillingSchedule billingSchedule;
    private ComponentCustomPrice customPrice;

    /**
     * Default constructor.
     */
    public ActivateEventBasedComponent() {
    }

    /**
     * Initialization constructor.
     * @param  pricePointId  Integer value for pricePointId.
     * @param  billingSchedule  BillingSchedule value for billingSchedule.
     * @param  customPrice  ComponentCustomPrice value for customPrice.
     */
    public ActivateEventBasedComponent(
            Integer pricePointId,
            BillingSchedule billingSchedule,
            ComponentCustomPrice customPrice) {
        this.pricePointId = pricePointId;
        this.billingSchedule = billingSchedule;
        this.customPrice = customPrice;
    }

    /**
     * Getter for PricePointId.
     * The Chargify id of the price point
     * @return Returns the Integer
     */
    @JsonGetter("price_point_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPricePointId() {
        return pricePointId;
    }

    /**
     * Setter for PricePointId.
     * The Chargify id of the price point
     * @param pricePointId Value for Integer
     */
    @JsonSetter("price_point_id")
    public void setPricePointId(Integer pricePointId) {
        this.pricePointId = pricePointId;
    }

    /**
     * Getter for BillingSchedule.
     * This attribute is particularly useful when you need to align billing events for different
     * components on distinct schedules within a subscription. Please note this only works for site
     * with Multifrequency enabled
     * @return Returns the BillingSchedule
     */
    @JsonGetter("billing_schedule")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BillingSchedule getBillingSchedule() {
        return billingSchedule;
    }

    /**
     * Setter for BillingSchedule.
     * This attribute is particularly useful when you need to align billing events for different
     * components on distinct schedules within a subscription. Please note this only works for site
     * with Multifrequency enabled
     * @param billingSchedule Value for BillingSchedule
     */
    @JsonSetter("billing_schedule")
    public void setBillingSchedule(BillingSchedule billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    /**
     * Getter for CustomPrice.
     * Create or update custom pricing unique to the subscription. Used in place of
     * `price_point_id`.
     * @return Returns the ComponentCustomPrice
     */
    @JsonGetter("custom_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ComponentCustomPrice getCustomPrice() {
        return customPrice;
    }

    /**
     * Setter for CustomPrice.
     * Create or update custom pricing unique to the subscription. Used in place of
     * `price_point_id`.
     * @param customPrice Value for ComponentCustomPrice
     */
    @JsonSetter("custom_price")
    public void setCustomPrice(ComponentCustomPrice customPrice) {
        this.customPrice = customPrice;
    }

    /**
     * Converts this ActivateEventBasedComponent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ActivateEventBasedComponent [" + "pricePointId=" + pricePointId
                + ", billingSchedule=" + billingSchedule + ", customPrice=" + customPrice
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .pricePointId(getPricePointId())
                .billingSchedule(getBillingSchedule())
                .customPrice(getCustomPrice());
        return builder;
    }

    /**
     * Class to build instances of {@link ActivateEventBasedComponent}.
     */
    public static class Builder {
        private Integer pricePointId;
        private BillingSchedule billingSchedule;
        private ComponentCustomPrice customPrice;



        /**
         * Setter for pricePointId.
         * @param  pricePointId  Integer value for pricePointId.
         * @return Builder
         */
        public Builder pricePointId(Integer pricePointId) {
            this.pricePointId = pricePointId;
            return this;
        }

        /**
         * Setter for billingSchedule.
         * @param  billingSchedule  BillingSchedule value for billingSchedule.
         * @return Builder
         */
        public Builder billingSchedule(BillingSchedule billingSchedule) {
            this.billingSchedule = billingSchedule;
            return this;
        }

        /**
         * Setter for customPrice.
         * @param  customPrice  ComponentCustomPrice value for customPrice.
         * @return Builder
         */
        public Builder customPrice(ComponentCustomPrice customPrice) {
            this.customPrice = customPrice;
            return this;
        }

        /**
         * Builds a new {@link ActivateEventBasedComponent} object using the set fields.
         * @return {@link ActivateEventBasedComponent}
         */
        public ActivateEventBasedComponent build() {
            return new ActivateEventBasedComponent(pricePointId, billingSchedule, customPrice);
        }
    }
}
