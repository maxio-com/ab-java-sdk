/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for PublicSignupPage type.
 */
public class PublicSignupPage {
    private Integer id;
    private OptionalNullable<String> returnUrl;
    private OptionalNullable<String> returnParams;
    private String url;

    /**
     * Default constructor.
     */
    public PublicSignupPage() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  returnUrl  String value for returnUrl.
     * @param  returnParams  String value for returnParams.
     * @param  url  String value for url.
     */
    public PublicSignupPage(
            Integer id,
            String returnUrl,
            String returnParams,
            String url) {
        this.id = id;
        this.returnUrl = OptionalNullable.of(returnUrl);
        this.returnParams = OptionalNullable.of(returnParams);
        this.url = url;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  returnUrl  String value for returnUrl.
     * @param  returnParams  String value for returnParams.
     * @param  url  String value for url.
     */

    protected PublicSignupPage(Integer id, OptionalNullable<String> returnUrl,
            OptionalNullable<String> returnParams, String url) {
        this.id = id;
        this.returnUrl = returnUrl;
        this.returnParams = returnParams;
        this.url = url;
    }

    /**
     * Getter for Id.
     * The id of the signup page (public_signup_pages only)
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The id of the signup page (public_signup_pages only)
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Internal Getter for ReturnUrl.
     * The url to which a customer will be returned after a successful signup (public_signup_pages
     * only)
     * @return Returns the Internal String
     */
    @JsonGetter("return_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetReturnUrl() {
        return this.returnUrl;
    }

    /**
     * Getter for ReturnUrl.
     * The url to which a customer will be returned after a successful signup (public_signup_pages
     * only)
     * @return Returns the String
     */
    public String getReturnUrl() {
        return OptionalNullable.getFrom(returnUrl);
    }

    /**
     * Setter for ReturnUrl.
     * The url to which a customer will be returned after a successful signup (public_signup_pages
     * only)
     * @param returnUrl Value for String
     */
    @JsonSetter("return_url")
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = OptionalNullable.of(returnUrl);
    }

    /**
     * UnSetter for ReturnUrl.
     * The url to which a customer will be returned after a successful signup (public_signup_pages
     * only)
     */
    public void unsetReturnUrl() {
        returnUrl = null;
    }

    /**
     * Internal Getter for ReturnParams.
     * The params to be appended to the return_url (public_signup_pages only)
     * @return Returns the Internal String
     */
    @JsonGetter("return_params")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetReturnParams() {
        return this.returnParams;
    }

    /**
     * Getter for ReturnParams.
     * The params to be appended to the return_url (public_signup_pages only)
     * @return Returns the String
     */
    public String getReturnParams() {
        return OptionalNullable.getFrom(returnParams);
    }

    /**
     * Setter for ReturnParams.
     * The params to be appended to the return_url (public_signup_pages only)
     * @param returnParams Value for String
     */
    @JsonSetter("return_params")
    public void setReturnParams(String returnParams) {
        this.returnParams = OptionalNullable.of(returnParams);
    }

    /**
     * UnSetter for ReturnParams.
     * The params to be appended to the return_url (public_signup_pages only)
     */
    public void unsetReturnParams() {
        returnParams = null;
    }

    /**
     * Getter for Url.
     * The url where the signup page can be viewed (public_signup_pages only)
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * The url where the signup page can be viewed (public_signup_pages only)
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Converts this PublicSignupPage into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PublicSignupPage [" + "id=" + id + ", returnUrl=" + returnUrl + ", returnParams="
                + returnParams + ", url=" + url + "]";
    }

    /**
     * Builds a new {@link PublicSignupPage.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PublicSignupPage.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .url(getUrl());
        builder.returnUrl = internalGetReturnUrl();
        builder.returnParams = internalGetReturnParams();
        return builder;
    }

    /**
     * Class to build instances of {@link PublicSignupPage}.
     */
    public static class Builder {
        private Integer id;
        private OptionalNullable<String> returnUrl;
        private OptionalNullable<String> returnParams;
        private String url;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for returnUrl.
         * @param  returnUrl  String value for returnUrl.
         * @return Builder
         */
        public Builder returnUrl(String returnUrl) {
            this.returnUrl = OptionalNullable.of(returnUrl);
            return this;
        }

        /**
         * UnSetter for returnUrl.
         * @return Builder
         */
        public Builder unsetReturnUrl() {
            returnUrl = null;
            return this;
        }

        /**
         * Setter for returnParams.
         * @param  returnParams  String value for returnParams.
         * @return Builder
         */
        public Builder returnParams(String returnParams) {
            this.returnParams = OptionalNullable.of(returnParams);
            return this;
        }

        /**
         * UnSetter for returnParams.
         * @return Builder
         */
        public Builder unsetReturnParams() {
            returnParams = null;
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
         * Builds a new {@link PublicSignupPage} object using the set fields.
         * @return {@link PublicSignupPage}
         */
        public PublicSignupPage build() {
            return new PublicSignupPage(id, returnUrl, returnParams, url);
        }
    }
}
