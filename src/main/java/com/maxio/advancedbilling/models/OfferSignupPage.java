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
 * This is a model class for OfferSignupPage type.
 */
public class OfferSignupPage {
    private Integer id;
    private String nickname;
    private Boolean enabled;
    private String returnUrl;
    private String returnParams;
    private String url;

    /**
     * Default constructor.
     */
    public OfferSignupPage() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  nickname  String value for nickname.
     * @param  enabled  Boolean value for enabled.
     * @param  returnUrl  String value for returnUrl.
     * @param  returnParams  String value for returnParams.
     * @param  url  String value for url.
     */
    public OfferSignupPage(
            Integer id,
            String nickname,
            Boolean enabled,
            String returnUrl,
            String returnParams,
            String url) {
        this.id = id;
        this.nickname = nickname;
        this.enabled = enabled;
        this.returnUrl = returnUrl;
        this.returnParams = returnParams;
        this.url = url;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for Nickname.
     * @return Returns the String
     */
    @JsonGetter("nickname")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNickname() {
        return nickname;
    }

    /**
     * Setter for Nickname.
     * @param nickname Value for String
     */
    @JsonSetter("nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Getter for Enabled.
     * @return Returns the Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for ReturnUrl.
     * @return Returns the String
     */
    @JsonGetter("return_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * Setter for ReturnUrl.
     * @param returnUrl Value for String
     */
    @JsonSetter("return_url")
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
     * Getter for ReturnParams.
     * @return Returns the String
     */
    @JsonGetter("return_params")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReturnParams() {
        return returnParams;
    }

    /**
     * Setter for ReturnParams.
     * @param returnParams Value for String
     */
    @JsonSetter("return_params")
    public void setReturnParams(String returnParams) {
        this.returnParams = returnParams;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this OfferSignupPage into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OfferSignupPage [" + "id=" + id + ", nickname=" + nickname + ", enabled=" + enabled
                + ", returnUrl=" + returnUrl + ", returnParams=" + returnParams + ", url=" + url
                + "]";
    }

    /**
     * Builds a new {@link OfferSignupPage.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OfferSignupPage.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .nickname(getNickname())
                .enabled(getEnabled())
                .returnUrl(getReturnUrl())
                .returnParams(getReturnParams())
                .url(getUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link OfferSignupPage}.
     */
    public static class Builder {
        private Integer id;
        private String nickname;
        private Boolean enabled;
        private String returnUrl;
        private String returnParams;
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
         * Setter for nickname.
         * @param  nickname  String value for nickname.
         * @return Builder
         */
        public Builder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        /**
         * Setter for enabled.
         * @param  enabled  Boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Setter for returnUrl.
         * @param  returnUrl  String value for returnUrl.
         * @return Builder
         */
        public Builder returnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }

        /**
         * Setter for returnParams.
         * @param  returnParams  String value for returnParams.
         * @return Builder
         */
        public Builder returnParams(String returnParams) {
            this.returnParams = returnParams;
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
         * Builds a new {@link OfferSignupPage} object using the set fields.
         * @return {@link OfferSignupPage}
         */
        public OfferSignupPage build() {
            return new OfferSignupPage(id, nickname, enabled, returnUrl, returnParams, url);
        }
    }
}
