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
import java.time.ZonedDateTime;

/**
 * This is a model class for AutoResume type.
 */
public class AutoResume
        extends BaseModel {
    private OptionalNullable<ZonedDateTime> automaticallyResumeAt;

    /**
     * Default constructor.
     */
    public AutoResume() {
    }

    /**
     * Initialization constructor.
     * @param  automaticallyResumeAt  ZonedDateTime value for automaticallyResumeAt.
     */
    public AutoResume(
            ZonedDateTime automaticallyResumeAt) {
        this.automaticallyResumeAt = OptionalNullable.of(automaticallyResumeAt);
    }

    /**
     * Initialization constructor.
     * @param  automaticallyResumeAt  ZonedDateTime value for automaticallyResumeAt.
     */

    protected AutoResume(OptionalNullable<ZonedDateTime> automaticallyResumeAt) {
        this.automaticallyResumeAt = automaticallyResumeAt;
    }

    /**
     * Internal Getter for AutomaticallyResumeAt.
     * @return Returns the Internal ZonedDateTime
     */
    @JsonGetter("automatically_resume_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.ZonedRfc8601DateTimeSerializer.class)
    protected OptionalNullable<ZonedDateTime> internalGetAutomaticallyResumeAt() {
        return this.automaticallyResumeAt;
    }

    /**
     * Getter for AutomaticallyResumeAt.
     * @return Returns the ZonedDateTime
     */
    public ZonedDateTime getAutomaticallyResumeAt() {
        return OptionalNullable.getFrom(automaticallyResumeAt);
    }

    /**
     * Setter for AutomaticallyResumeAt.
     * @param automaticallyResumeAt Value for ZonedDateTime
     */
    @JsonSetter("automatically_resume_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setAutomaticallyResumeAt(ZonedDateTime automaticallyResumeAt) {
        this.automaticallyResumeAt = OptionalNullable.of(automaticallyResumeAt);
    }

    /**
     * UnSetter for AutomaticallyResumeAt.
     */
    public void unsetAutomaticallyResumeAt() {
        automaticallyResumeAt = null;
    }

    /**
     * Converts this AutoResume into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AutoResume [" + "automaticallyResumeAt=" + automaticallyResumeAt
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.automaticallyResumeAt = internalGetAutomaticallyResumeAt();
        return builder;
    }

    /**
     * Class to build instances of {@link AutoResume}.
     */
    public static class Builder {
        private OptionalNullable<ZonedDateTime> automaticallyResumeAt;



        /**
         * Setter for automaticallyResumeAt.
         * @param  automaticallyResumeAt  ZonedDateTime value for automaticallyResumeAt.
         * @return Builder
         */
        public Builder automaticallyResumeAt(ZonedDateTime automaticallyResumeAt) {
            this.automaticallyResumeAt = OptionalNullable.of(automaticallyResumeAt);
            return this;
        }

        /**
         * UnSetter for automaticallyResumeAt.
         * @return Builder
         */
        public Builder unsetAutomaticallyResumeAt() {
            automaticallyResumeAt = null;
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
