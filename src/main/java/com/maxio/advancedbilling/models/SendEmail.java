/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for SendEmail type.
 */
public class SendEmail
        extends BaseModel {
    private boolean canExecute;
    private String url;

    /**
     * Default constructor.
     */
    public SendEmail() {
    }

    /**
     * Initialization constructor.
     * @param  canExecute  boolean value for canExecute.
     * @param  url  String value for url.
     */
    public SendEmail(
            boolean canExecute,
            String url) {
        this.canExecute = canExecute;
        this.url = url;
    }

    /**
     * Getter for CanExecute.
     * @return Returns the boolean
     */
    @JsonGetter("can_execute")
    public boolean getCanExecute() {
        return canExecute;
    }

    /**
     * Setter for CanExecute.
     * @param canExecute Value for boolean
     */
    @JsonSetter("can_execute")
    public void setCanExecute(boolean canExecute) {
        this.canExecute = canExecute;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Converts this SendEmail into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SendEmail [" + "canExecute=" + canExecute + ", url=" + url
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link SendEmail.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SendEmail.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(canExecute, url);
        return builder;
    }

    /**
     * Class to build instances of {@link SendEmail}.
     */
    public static class Builder {
        private boolean canExecute;
        private String url;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  canExecute  boolean value for canExecute.
         * @param  url  String value for url.
         */
        public Builder(boolean canExecute, String url) {
            this.canExecute = canExecute;
            this.url = url;
        }

        /**
         * Setter for canExecute.
         * @param  canExecute  boolean value for canExecute.
         * @return Builder
         */
        public Builder canExecute(boolean canExecute) {
            this.canExecute = canExecute;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds a new {@link SendEmail} object using the set fields.
         * @return {@link SendEmail}
         */
        public SendEmail build() {
            return new SendEmail(canExecute, url);
        }
    }
}
