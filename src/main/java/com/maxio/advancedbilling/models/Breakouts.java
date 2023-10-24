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
 * This is a model class for Breakouts type.
 */
public class Breakouts {
    private Integer planAmountInCents;
    private String planAmountFormatted;
    private Integer usageAmountInCents;
    private String usageAmountFormatted;

    /**
     * Default constructor.
     */
    public Breakouts() {
    }

    /**
     * Initialization constructor.
     * @param  planAmountInCents  Integer value for planAmountInCents.
     * @param  planAmountFormatted  String value for planAmountFormatted.
     * @param  usageAmountInCents  Integer value for usageAmountInCents.
     * @param  usageAmountFormatted  String value for usageAmountFormatted.
     */
    public Breakouts(
            Integer planAmountInCents,
            String planAmountFormatted,
            Integer usageAmountInCents,
            String usageAmountFormatted) {
        this.planAmountInCents = planAmountInCents;
        this.planAmountFormatted = planAmountFormatted;
        this.usageAmountInCents = usageAmountInCents;
        this.usageAmountFormatted = usageAmountFormatted;
    }

    /**
     * Getter for PlanAmountInCents.
     * @return Returns the Integer
     */
    @JsonGetter("plan_amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPlanAmountInCents() {
        return planAmountInCents;
    }

    /**
     * Setter for PlanAmountInCents.
     * @param planAmountInCents Value for Integer
     */
    @JsonSetter("plan_amount_in_cents")
    public void setPlanAmountInCents(Integer planAmountInCents) {
        this.planAmountInCents = planAmountInCents;
    }

    /**
     * Getter for PlanAmountFormatted.
     * @return Returns the String
     */
    @JsonGetter("plan_amount_formatted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPlanAmountFormatted() {
        return planAmountFormatted;
    }

    /**
     * Setter for PlanAmountFormatted.
     * @param planAmountFormatted Value for String
     */
    @JsonSetter("plan_amount_formatted")
    public void setPlanAmountFormatted(String planAmountFormatted) {
        this.planAmountFormatted = planAmountFormatted;
    }

    /**
     * Getter for UsageAmountInCents.
     * @return Returns the Integer
     */
    @JsonGetter("usage_amount_in_cents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getUsageAmountInCents() {
        return usageAmountInCents;
    }

    /**
     * Setter for UsageAmountInCents.
     * @param usageAmountInCents Value for Integer
     */
    @JsonSetter("usage_amount_in_cents")
    public void setUsageAmountInCents(Integer usageAmountInCents) {
        this.usageAmountInCents = usageAmountInCents;
    }

    /**
     * Getter for UsageAmountFormatted.
     * @return Returns the String
     */
    @JsonGetter("usage_amount_formatted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUsageAmountFormatted() {
        return usageAmountFormatted;
    }

    /**
     * Setter for UsageAmountFormatted.
     * @param usageAmountFormatted Value for String
     */
    @JsonSetter("usage_amount_formatted")
    public void setUsageAmountFormatted(String usageAmountFormatted) {
        this.usageAmountFormatted = usageAmountFormatted;
    }

    /**
     * Converts this Breakouts into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Breakouts [" + "planAmountInCents=" + planAmountInCents + ", planAmountFormatted="
                + planAmountFormatted + ", usageAmountInCents=" + usageAmountInCents
                + ", usageAmountFormatted=" + usageAmountFormatted + "]";
    }

    /**
     * Builds a new {@link Breakouts.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Breakouts.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .planAmountInCents(getPlanAmountInCents())
                .planAmountFormatted(getPlanAmountFormatted())
                .usageAmountInCents(getUsageAmountInCents())
                .usageAmountFormatted(getUsageAmountFormatted());
        return builder;
    }

    /**
     * Class to build instances of {@link Breakouts}.
     */
    public static class Builder {
        private Integer planAmountInCents;
        private String planAmountFormatted;
        private Integer usageAmountInCents;
        private String usageAmountFormatted;



        /**
         * Setter for planAmountInCents.
         * @param  planAmountInCents  Integer value for planAmountInCents.
         * @return Builder
         */
        public Builder planAmountInCents(Integer planAmountInCents) {
            this.planAmountInCents = planAmountInCents;
            return this;
        }

        /**
         * Setter for planAmountFormatted.
         * @param  planAmountFormatted  String value for planAmountFormatted.
         * @return Builder
         */
        public Builder planAmountFormatted(String planAmountFormatted) {
            this.planAmountFormatted = planAmountFormatted;
            return this;
        }

        /**
         * Setter for usageAmountInCents.
         * @param  usageAmountInCents  Integer value for usageAmountInCents.
         * @return Builder
         */
        public Builder usageAmountInCents(Integer usageAmountInCents) {
            this.usageAmountInCents = usageAmountInCents;
            return this;
        }

        /**
         * Setter for usageAmountFormatted.
         * @param  usageAmountFormatted  String value for usageAmountFormatted.
         * @return Builder
         */
        public Builder usageAmountFormatted(String usageAmountFormatted) {
            this.usageAmountFormatted = usageAmountFormatted;
            return this;
        }

        /**
         * Builds a new {@link Breakouts} object using the set fields.
         * @return {@link Breakouts}
         */
        public Breakouts build() {
            return new Breakouts(planAmountInCents, planAmountFormatted, usageAmountInCents,
                    usageAmountFormatted);
        }
    }
}
