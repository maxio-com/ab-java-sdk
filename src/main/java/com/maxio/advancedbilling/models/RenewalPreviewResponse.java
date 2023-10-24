/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for RenewalPreviewResponse type.
 */
public class RenewalPreviewResponse {
    private RenewalPreview renewalPreview;

    /**
     * Default constructor.
     */
    public RenewalPreviewResponse() {
    }

    /**
     * Initialization constructor.
     * @param  renewalPreview  RenewalPreview value for renewalPreview.
     */
    public RenewalPreviewResponse(
            RenewalPreview renewalPreview) {
        this.renewalPreview = renewalPreview;
    }

    /**
     * Getter for RenewalPreview.
     * @return Returns the RenewalPreview
     */
    @JsonGetter("renewal_preview")
    public RenewalPreview getRenewalPreview() {
        return renewalPreview;
    }

    /**
     * Setter for RenewalPreview.
     * @param renewalPreview Value for RenewalPreview
     */
    @JsonSetter("renewal_preview")
    public void setRenewalPreview(RenewalPreview renewalPreview) {
        this.renewalPreview = renewalPreview;
    }

    /**
     * Converts this RenewalPreviewResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RenewalPreviewResponse [" + "renewalPreview=" + renewalPreview + "]";
    }

    /**
     * Builds a new {@link RenewalPreviewResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RenewalPreviewResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(renewalPreview);
        return builder;
    }

    /**
     * Class to build instances of {@link RenewalPreviewResponse}.
     */
    public static class Builder {
        private RenewalPreview renewalPreview;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  renewalPreview  RenewalPreview value for renewalPreview.
         */
        public Builder(RenewalPreview renewalPreview) {
            this.renewalPreview = renewalPreview;
        }

        /**
         * Setter for renewalPreview.
         * @param  renewalPreview  RenewalPreview value for renewalPreview.
         * @return Builder
         */
        public Builder renewalPreview(RenewalPreview renewalPreview) {
            this.renewalPreview = renewalPreview;
            return this;
        }

        /**
         * Builds a new {@link RenewalPreviewResponse} object using the set fields.
         * @return {@link RenewalPreviewResponse}
         */
        public RenewalPreviewResponse build() {
            return new RenewalPreviewResponse(renewalPreview);
        }
    }
}
