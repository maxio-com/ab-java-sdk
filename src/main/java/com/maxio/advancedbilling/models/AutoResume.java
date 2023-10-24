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
 * This is a model class for AutoResume type.
 */
public class AutoResume {
    private String automaticallyResumeAt;

    /**
     * Default constructor.
     */
    public AutoResume() {
    }

    /**
     * Initialization constructor.
     * @param  automaticallyResumeAt  String value for automaticallyResumeAt.
     */
    public AutoResume(
            String automaticallyResumeAt) {
        this.automaticallyResumeAt = automaticallyResumeAt;
    }

    /**
     * Getter for AutomaticallyResumeAt.
     * @return Returns the String
     */
    @JsonGetter("automatically_resume_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAutomaticallyResumeAt() {
        return automaticallyResumeAt;
    }

    /**
     * Setter for AutomaticallyResumeAt.
     * @param automaticallyResumeAt Value for String
     */
    @JsonSetter("automatically_resume_at")
    public void setAutomaticallyResumeAt(String automaticallyResumeAt) {
        this.automaticallyResumeAt = automaticallyResumeAt;
    }

    /**
     * Converts this AutoResume into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AutoResume [" + "automaticallyResumeAt=" + automaticallyResumeAt + "]";
    }

    /**
     * Builds a new {@link AutoResume.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AutoResume.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .automaticallyResumeAt(getAutomaticallyResumeAt());
        return builder;
    }

    /**
     * Class to build instances of {@link AutoResume}.
     */
    public static class Builder {
        private String automaticallyResumeAt;



        /**
         * Setter for automaticallyResumeAt.
         * @param  automaticallyResumeAt  String value for automaticallyResumeAt.
         * @return Builder
         */
        public Builder automaticallyResumeAt(String automaticallyResumeAt) {
            this.automaticallyResumeAt = automaticallyResumeAt;
            return this;
        }

        /**
         * Builds a new {@link AutoResume} object using the set fields.
         * @return {@link AutoResume}
         */
        public AutoResume build() {
            return new AutoResume(automaticallyResumeAt);
        }
    }
}
