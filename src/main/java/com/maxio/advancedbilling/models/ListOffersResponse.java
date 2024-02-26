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
 * This is a model class for ListOffersResponse type.
 */
public class ListOffersResponse {
    private List<Offer> offers;

    /**
     * Default constructor.
     */
    public ListOffersResponse() {
    }

    /**
     * Initialization constructor.
     * @param  offers  List of Offer value for offers.
     */
    public ListOffersResponse(
            List<Offer> offers) {
        this.offers = offers;
    }

    /**
     * Getter for Offers.
     * @return Returns the List of Offer
     */
    @JsonGetter("offers")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Offer> getOffers() {
        return offers;
    }

    /**
     * Setter for Offers.
     * @param offers Value for List of Offer
     */
    @JsonSetter("offers")
    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    /**
     * Converts this ListOffersResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListOffersResponse [" + "offers=" + offers + "]";
    }

    /**
     * Builds a new {@link ListOffersResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListOffersResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .offers(getOffers());
        return builder;
    }

    /**
     * Class to build instances of {@link ListOffersResponse}.
     */
    public static class Builder {
        private List<Offer> offers;



        /**
         * Setter for offers.
         * @param  offers  List of Offer value for offers.
         * @return Builder
         */
        public Builder offers(List<Offer> offers) {
            this.offers = offers;
            return this;
        }

        /**
         * Builds a new {@link ListOffersResponse} object using the set fields.
         * @return {@link ListOffersResponse}
         */
        public ListOffersResponse build() {
            return new ListOffersResponse(offers);
        }
    }
}
