/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdateSubscriptionNote type.
 */
public class UpdateSubscriptionNote {
    private String body;
    private boolean sticky;

    /**
     * Default constructor.
     */
    public UpdateSubscriptionNote() {
    }

    /**
     * Initialization constructor.
     * @param  body  String value for body.
     * @param  sticky  boolean value for sticky.
     */
    public UpdateSubscriptionNote(
            String body,
            boolean sticky) {
        this.body = body;
        this.sticky = sticky;
    }

    /**
     * Getter for Body.
     * @return Returns the String
     */
    @JsonGetter("body")
    public String getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * @param body Value for String
     */
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Getter for Sticky.
     * @return Returns the boolean
     */
    @JsonGetter("sticky")
    public boolean getSticky() {
        return sticky;
    }

    /**
     * Setter for Sticky.
     * @param sticky Value for boolean
     */
    @JsonSetter("sticky")
    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    /**
     * Converts this UpdateSubscriptionNote into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateSubscriptionNote [" + "body=" + body + ", sticky=" + sticky + "]";
    }

    /**
     * Builds a new {@link UpdateSubscriptionNote.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateSubscriptionNote.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(body, sticky);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateSubscriptionNote}.
     */
    public static class Builder {
        private String body;
        private boolean sticky;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  body  String value for body.
         * @param  sticky  boolean value for sticky.
         */
        public Builder(String body, boolean sticky) {
            this.body = body;
            this.sticky = sticky;
        }

        /**
         * Setter for body.
         * @param  body  String value for body.
         * @return Builder
         */
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        /**
         * Setter for sticky.
         * @param  sticky  boolean value for sticky.
         * @return Builder
         */
        public Builder sticky(boolean sticky) {
            this.sticky = sticky;
            return this;
        }

        /**
         * Builds a new {@link UpdateSubscriptionNote} object using the set fields.
         * @return {@link UpdateSubscriptionNote}
         */
        public UpdateSubscriptionNote build() {
            return new UpdateSubscriptionNote(body, sticky);
        }
    }
}
