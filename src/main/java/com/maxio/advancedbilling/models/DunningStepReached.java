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
 * This is a model class for DunningStepReached type.
 */
public class DunningStepReached {
    private DunnerData dunner;
    private DunningStepData currentStep;
    private DunningStepData nextStep;

    /**
     * Default constructor.
     */
    public DunningStepReached() {
    }

    /**
     * Initialization constructor.
     * @param  dunner  DunnerData value for dunner.
     * @param  currentStep  DunningStepData value for currentStep.
     * @param  nextStep  DunningStepData value for nextStep.
     */
    @JsonCreator
    public DunningStepReached(
            @JsonProperty("dunner") DunnerData dunner,
            @JsonProperty("current_step") DunningStepData currentStep,
            @JsonProperty("next_step") DunningStepData nextStep) {
        this.dunner = dunner;
        this.currentStep = currentStep;
        this.nextStep = nextStep;
    }

    /**
     * Getter for Dunner.
     * @return Returns the DunnerData
     */
    @JsonGetter("dunner")
    public DunnerData getDunner() {
        return dunner;
    }

    /**
     * Setter for Dunner.
     * @param dunner Value for DunnerData
     */
    @JsonSetter("dunner")
    public void setDunner(DunnerData dunner) {
        this.dunner = dunner;
    }

    /**
     * Getter for CurrentStep.
     * @return Returns the DunningStepData
     */
    @JsonGetter("current_step")
    public DunningStepData getCurrentStep() {
        return currentStep;
    }

    /**
     * Setter for CurrentStep.
     * @param currentStep Value for DunningStepData
     */
    @JsonSetter("current_step")
    public void setCurrentStep(DunningStepData currentStep) {
        this.currentStep = currentStep;
    }

    /**
     * Getter for NextStep.
     * @return Returns the DunningStepData
     */
    @JsonGetter("next_step")
    public DunningStepData getNextStep() {
        return nextStep;
    }

    /**
     * Setter for NextStep.
     * @param nextStep Value for DunningStepData
     */
    @JsonSetter("next_step")
    public void setNextStep(DunningStepData nextStep) {
        this.nextStep = nextStep;
    }

    /**
     * Converts this DunningStepReached into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DunningStepReached [" + "dunner=" + dunner + ", currentStep=" + currentStep
                + ", nextStep=" + nextStep + "]";
    }

    /**
     * Builds a new {@link DunningStepReached.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DunningStepReached.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(dunner, currentStep, nextStep);
        return builder;
    }

    /**
     * Class to build instances of {@link DunningStepReached}.
     */
    public static class Builder {
        private DunnerData dunner;
        private DunningStepData currentStep;
        private DunningStepData nextStep;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  dunner  DunnerData value for dunner.
         * @param  currentStep  DunningStepData value for currentStep.
         * @param  nextStep  DunningStepData value for nextStep.
         */
        public Builder(DunnerData dunner, DunningStepData currentStep, DunningStepData nextStep) {
            this.dunner = dunner;
            this.currentStep = currentStep;
            this.nextStep = nextStep;
        }

        /**
         * Setter for dunner.
         * @param  dunner  DunnerData value for dunner.
         * @return Builder
         */
        public Builder dunner(DunnerData dunner) {
            this.dunner = dunner;
            return this;
        }

        /**
         * Setter for currentStep.
         * @param  currentStep  DunningStepData value for currentStep.
         * @return Builder
         */
        public Builder currentStep(DunningStepData currentStep) {
            this.currentStep = currentStep;
            return this;
        }

        /**
         * Setter for nextStep.
         * @param  nextStep  DunningStepData value for nextStep.
         * @return Builder
         */
        public Builder nextStep(DunningStepData nextStep) {
            this.nextStep = nextStep;
            return this;
        }

        /**
         * Builds a new {@link DunningStepReached} object using the set fields.
         * @return {@link DunningStepReached}
         */
        public DunningStepReached build() {
            return new DunningStepReached(dunner, currentStep, nextStep);
        }
    }
}
