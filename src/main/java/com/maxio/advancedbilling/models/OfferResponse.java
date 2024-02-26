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
 * This is a model class for OfferResponse type.
 */
public class OfferResponse {
    private Offer offer;

    /**
     * Default constructor.
     */
    public OfferResponse() {
    }

    /**
     * Initialization constructor.
     * @param  offer  Offer value for offer.
     */
    public OfferResponse(
            Offer offer) {
        this.offer = offer;
    }

    /**
     * Getter for Offer.
     * @return Returns the Offer
     */
    @JsonGetter("offer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Offer getOffer() {
        return offer;
    }

    /**
     * Setter for Offer.
     * @param offer Value for Offer
     */
    @JsonSetter("offer")
    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    /**
     * Converts this OfferResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OfferResponse [" + "offer=" + offer + "]";
    }

    /**
     * Builds a new {@link OfferResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OfferResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .offer(getOffer());
        return builder;
    }

    /**
     * Class to build instances of {@link OfferResponse}.
     */
    public static class Builder {
        private Offer offer;



        /**
         * Setter for offer.
         * @param  offer  Offer value for offer.
         * @return Builder
         */
        public Builder offer(Offer offer) {
            this.offer = offer;
            return this;
        }

        /**
         * Builds a new {@link OfferResponse} object using the set fields.
         * @return {@link OfferResponse}
         */
        public OfferResponse build() {
            return new OfferResponse(offer);
        }
    }
}
