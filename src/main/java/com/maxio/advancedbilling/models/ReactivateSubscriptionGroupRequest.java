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
 * This is a model class for ReactivateSubscriptionGroupRequest type.
 */
public class ReactivateSubscriptionGroupRequest {
    private Boolean resume;
    private Boolean resumeMembers;

    /**
     * Default constructor.
     */
    public ReactivateSubscriptionGroupRequest() {
    }

    /**
     * Initialization constructor.
     * @param  resume  Boolean value for resume.
     * @param  resumeMembers  Boolean value for resumeMembers.
     */
    public ReactivateSubscriptionGroupRequest(
            Boolean resume,
            Boolean resumeMembers) {
        this.resume = resume;
        this.resumeMembers = resumeMembers;
    }

    /**
     * Getter for Resume.
     * @return Returns the Boolean
     */
    @JsonGetter("resume")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getResume() {
        return resume;
    }

    /**
     * Setter for Resume.
     * @param resume Value for Boolean
     */
    @JsonSetter("resume")
    public void setResume(Boolean resume) {
        this.resume = resume;
    }

    /**
     * Getter for ResumeMembers.
     * @return Returns the Boolean
     */
    @JsonGetter("resume_members")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getResumeMembers() {
        return resumeMembers;
    }

    /**
     * Setter for ResumeMembers.
     * @param resumeMembers Value for Boolean
     */
    @JsonSetter("resume_members")
    public void setResumeMembers(Boolean resumeMembers) {
        this.resumeMembers = resumeMembers;
    }

    /**
     * Converts this ReactivateSubscriptionGroupRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReactivateSubscriptionGroupRequest [" + "resume=" + resume + ", resumeMembers="
                + resumeMembers + "]";
    }

    /**
     * Builds a new {@link ReactivateSubscriptionGroupRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReactivateSubscriptionGroupRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .resume(getResume())
                .resumeMembers(getResumeMembers());
        return builder;
    }

    /**
     * Class to build instances of {@link ReactivateSubscriptionGroupRequest}.
     */
    public static class Builder {
        private Boolean resume;
        private Boolean resumeMembers;



        /**
         * Setter for resume.
         * @param  resume  Boolean value for resume.
         * @return Builder
         */
        public Builder resume(Boolean resume) {
            this.resume = resume;
            return this;
        }

        /**
         * Setter for resumeMembers.
         * @param  resumeMembers  Boolean value for resumeMembers.
         * @return Builder
         */
        public Builder resumeMembers(Boolean resumeMembers) {
            this.resumeMembers = resumeMembers;
            return this;
        }

        /**
         * Builds a new {@link ReactivateSubscriptionGroupRequest} object using the set fields.
         * @return {@link ReactivateSubscriptionGroupRequest}
         */
        public ReactivateSubscriptionGroupRequest build() {
            return new ReactivateSubscriptionGroupRequest(resume, resumeMembers);
        }
    }
}
