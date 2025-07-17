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
import java.util.List;

/**
 * This is a model class for ListServiceCreditsResponse type.
 */
public class ListServiceCreditsResponse
        extends BaseModel {
    private List<ServiceCredit1> serviceCredits;

    /**
     * Default constructor.
     */
    public ListServiceCreditsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  serviceCredits  List of ServiceCredit1 value for serviceCredits.
     */
    public ListServiceCreditsResponse(
            List<ServiceCredit1> serviceCredits) {
        this.serviceCredits = serviceCredits;
    }

    /**
     * Getter for ServiceCredits.
     * @return Returns the List of ServiceCredit1
     */
    @JsonGetter("service_credits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ServiceCredit1> getServiceCredits() {
        return serviceCredits;
    }

    /**
     * Setter for ServiceCredits.
     * @param serviceCredits Value for List of ServiceCredit1
     */
    @JsonSetter("service_credits")
    public void setServiceCredits(List<ServiceCredit1> serviceCredits) {
        this.serviceCredits = serviceCredits;
    }

    /**
     * Converts this ListServiceCreditsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListServiceCreditsResponse [" + "serviceCredits=" + serviceCredits
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link ListServiceCreditsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListServiceCreditsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .serviceCredits(getServiceCredits());
        return builder;
    }

    /**
     * Class to build instances of {@link ListServiceCreditsResponse}.
     */
    public static class Builder {
        private List<ServiceCredit1> serviceCredits;



        /**
         * Setter for serviceCredits.
         * @param  serviceCredits  List of ServiceCredit1 value for serviceCredits.
         * @return Builder
         */
        public Builder serviceCredits(List<ServiceCredit1> serviceCredits) {
            this.serviceCredits = serviceCredits;
            return this;
        }

        /**
         * Builds a new {@link ListServiceCreditsResponse} object using the set fields.
         * @return {@link ListServiceCreditsResponse}
         */
        public ListServiceCreditsResponse build() {
            return new ListServiceCreditsResponse(serviceCredits);
        }
    }
}
