/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateOfferRequest type.
 */
public class CreateOfferRequest {
    private CreateOffer offer;

    /**
     * Default constructor.
     */
    public CreateOfferRequest() {
    }

    /**
     * Initialization constructor.
     * @param  offer  CreateOffer value for offer.
     */
    public CreateOfferRequest(
            CreateOffer offer) {
        this.offer = offer;
    }

    /**
     * Getter for Offer.
     * @return Returns the CreateOffer
     */
    @JsonGetter("offer")
    public CreateOffer getOffer() {
        return offer;
    }

    /**
     * Setter for Offer.
     * @param offer Value for CreateOffer
     */
    @JsonSetter("offer")
    public void setOffer(CreateOffer offer) {
        this.offer = offer;
    }

    /**
     * Converts this CreateOfferRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateOfferRequest [" + "offer=" + offer + "]";
    }

    /**
     * Builds a new {@link CreateOfferRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateOfferRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(offer);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateOfferRequest}.
     */
    public static class Builder {
        private CreateOffer offer;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  offer  CreateOffer value for offer.
         */
        public Builder(CreateOffer offer) {
            this.offer = offer;
        }

        /**
         * Setter for offer.
         * @param  offer  CreateOffer value for offer.
         * @return Builder
         */
        public Builder offer(CreateOffer offer) {
            this.offer = offer;
            return this;
        }

        /**
         * Builds a new {@link CreateOfferRequest} object using the set fields.
         * @return {@link CreateOfferRequest}
         */
        public CreateOfferRequest build() {
            return new CreateOfferRequest(offer);
        }
    }
}
