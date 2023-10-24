/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SiteResponse type.
 */
public class SiteResponse {
    private Site site;

    /**
     * Default constructor.
     */
    public SiteResponse() {
    }

    /**
     * Initialization constructor.
     * @param  site  Site value for site.
     */
    public SiteResponse(
            Site site) {
        this.site = site;
    }

    /**
     * Getter for Site.
     * @return Returns the Site
     */
    @JsonGetter("site")
    public Site getSite() {
        return site;
    }

    /**
     * Setter for Site.
     * @param site Value for Site
     */
    @JsonSetter("site")
    public void setSite(Site site) {
        this.site = site;
    }

    /**
     * Converts this SiteResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SiteResponse [" + "site=" + site + "]";
    }

    /**
     * Builds a new {@link SiteResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SiteResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(site);
        return builder;
    }

    /**
     * Class to build instances of {@link SiteResponse}.
     */
    public static class Builder {
        private Site site;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  site  Site value for site.
         */
        public Builder(Site site) {
            this.site = site;
        }

        /**
         * Setter for site.
         * @param  site  Site value for site.
         * @return Builder
         */
        public Builder site(Site site) {
            this.site = site;
            return this;
        }

        /**
         * Builds a new {@link SiteResponse} object using the set fields.
         * @return {@link SiteResponse}
         */
        public SiteResponse build() {
            return new SiteResponse(site);
        }
    }
}
