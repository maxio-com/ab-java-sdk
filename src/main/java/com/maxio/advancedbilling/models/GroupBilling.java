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
 * This is a model class for GroupBilling type.
 */
public class GroupBilling {
    private Boolean accrue;
    private Boolean alignDate;
    private Boolean prorate;

    /**
     * Default constructor.
     */
    public GroupBilling() {
        accrue = false;
        alignDate = false;
        prorate = false;
    }

    /**
     * Initialization constructor.
     * @param  accrue  Boolean value for accrue.
     * @param  alignDate  Boolean value for alignDate.
     * @param  prorate  Boolean value for prorate.
     */
    public GroupBilling(
            Boolean accrue,
            Boolean alignDate,
            Boolean prorate) {
        this.accrue = accrue;
        this.alignDate = alignDate;
        this.prorate = prorate;
    }

    /**
     * Getter for Accrue.
     * A flag indicating whether or not to accrue charges on the new subscription.
     * @return Returns the Boolean
     */
    @JsonGetter("accrue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAccrue() {
        return accrue;
    }

    /**
     * Setter for Accrue.
     * A flag indicating whether or not to accrue charges on the new subscription.
     * @param accrue Value for Boolean
     */
    @JsonSetter("accrue")
    public void setAccrue(Boolean accrue) {
        this.accrue = accrue;
    }

    /**
     * Getter for AlignDate.
     * A flag indicating whether or not to align the billing date of the new subscription with the
     * billing date of the primary subscription of the hierarchy's default subscription group.
     * Required to be true if prorate is also true.
     * @return Returns the Boolean
     */
    @JsonGetter("align_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAlignDate() {
        return alignDate;
    }

    /**
     * Setter for AlignDate.
     * A flag indicating whether or not to align the billing date of the new subscription with the
     * billing date of the primary subscription of the hierarchy's default subscription group.
     * Required to be true if prorate is also true.
     * @param alignDate Value for Boolean
     */
    @JsonSetter("align_date")
    public void setAlignDate(Boolean alignDate) {
        this.alignDate = alignDate;
    }

    /**
     * Getter for Prorate.
     * A flag indicating whether or not to prorate billing of the new subscription for the current
     * period. A value of true is ignored unless align_date is also true.
     * @return Returns the Boolean
     */
    @JsonGetter("prorate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getProrate() {
        return prorate;
    }

    /**
     * Setter for Prorate.
     * A flag indicating whether or not to prorate billing of the new subscription for the current
     * period. A value of true is ignored unless align_date is also true.
     * @param prorate Value for Boolean
     */
    @JsonSetter("prorate")
    public void setProrate(Boolean prorate) {
        this.prorate = prorate;
    }

    /**
     * Converts this GroupBilling into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GroupBilling [" + "accrue=" + accrue + ", alignDate=" + alignDate + ", prorate="
                + prorate + "]";
    }

    /**
     * Builds a new {@link GroupBilling.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GroupBilling.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accrue(getAccrue())
                .alignDate(getAlignDate())
                .prorate(getProrate());
        return builder;
    }

    /**
     * Class to build instances of {@link GroupBilling}.
     */
    public static class Builder {
        private Boolean accrue = false;
        private Boolean alignDate = false;
        private Boolean prorate = false;



        /**
         * Setter for accrue.
         * @param  accrue  Boolean value for accrue.
         * @return Builder
         */
        public Builder accrue(Boolean accrue) {
            this.accrue = accrue;
            return this;
        }

        /**
         * Setter for alignDate.
         * @param  alignDate  Boolean value for alignDate.
         * @return Builder
         */
        public Builder alignDate(Boolean alignDate) {
            this.alignDate = alignDate;
            return this;
        }

        /**
         * Setter for prorate.
         * @param  prorate  Boolean value for prorate.
         * @return Builder
         */
        public Builder prorate(Boolean prorate) {
            this.prorate = prorate;
            return this;
        }

        /**
         * Builds a new {@link GroupBilling} object using the set fields.
         * @return {@link GroupBilling}
         */
        public GroupBilling build() {
            return new GroupBilling(accrue, alignDate, prorate);
        }
    }
}
