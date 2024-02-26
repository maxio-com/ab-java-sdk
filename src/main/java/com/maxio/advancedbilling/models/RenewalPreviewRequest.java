/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for RenewalPreviewRequest type.
 */
public class RenewalPreviewRequest {
    private List<RenewalPreviewComponent> components;

    /**
     * Default constructor.
     */
    public RenewalPreviewRequest() {
    }

    /**
     * Initialization constructor.
     * @param  components  List of RenewalPreviewComponent value for components.
     */
    public RenewalPreviewRequest(
            List<RenewalPreviewComponent> components) {
        this.components = components;
    }

    /**
     * Getter for Components.
     * An optional array of component definitions to preview. Providing any component definitions
     * here will override the actual components on the subscription (and their quantities), and the
     * billing preview will contain only these components (in addition to any product base fees).
     * @return Returns the List of RenewalPreviewComponent
     */
    @JsonGetter("components")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<RenewalPreviewComponent> getComponents() {
        return components;
    }

    /**
     * Setter for Components.
     * An optional array of component definitions to preview. Providing any component definitions
     * here will override the actual components on the subscription (and their quantities), and the
     * billing preview will contain only these components (in addition to any product base fees).
     * @param components Value for List of RenewalPreviewComponent
     */
    @JsonSetter("components")
    public void setComponents(List<RenewalPreviewComponent> components) {
        this.components = components;
    }

    /**
     * Converts this RenewalPreviewRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RenewalPreviewRequest [" + "components=" + components + "]";
    }

    /**
     * Builds a new {@link RenewalPreviewRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RenewalPreviewRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .components(getComponents());
        return builder;
    }

    /**
     * Class to build instances of {@link RenewalPreviewRequest}.
     */
    public static class Builder {
        private List<RenewalPreviewComponent> components;



        /**
         * Setter for components.
         * @param  components  List of RenewalPreviewComponent value for components.
         * @return Builder
         */
        public Builder components(List<RenewalPreviewComponent> components) {
            this.components = components;
            return this;
        }

        /**
         * Builds a new {@link RenewalPreviewRequest} object using the set fields.
         * @return {@link RenewalPreviewRequest}
         */
        public RenewalPreviewRequest build() {
            return new RenewalPreviewRequest(components);
        }
    }
}
