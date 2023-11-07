/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.maxio.advancedbilling.models.containers.ListMetafieldsInputDirection;

/**
 * This is a model class for ListMetafieldsInput type.
 */
public class ListMetafieldsInput {
    private ResourceType resourceType;
    private String name;
    private Integer page;
    private Integer perPage;
    private ListMetafieldsInputDirection direction;

    /**
     * Default constructor.
     */
    public ListMetafieldsInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  resourceType  ResourceType value for resourceType.
     * @param  name  String value for name.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  direction  ListMetafieldsInputDirection value for direction.
     */
    public ListMetafieldsInput(
            ResourceType resourceType,
            String name,
            Integer page,
            Integer perPage,
            ListMetafieldsInputDirection direction) {
        this.resourceType = resourceType;
        this.name = name;
        this.page = page;
        this.perPage = perPage;
        this.direction = direction;
    }

    /**
     * Getter for ResourceType.
     * the resource type to which the metafields belong
     * @return Returns the ResourceType
     */
    @JsonGetter("resource_type")
    public ResourceType getResourceType() {
        return resourceType;
    }

    /**
     * Setter for ResourceType.
     * the resource type to which the metafields belong
     * @param resourceType Value for ResourceType
     */
    @JsonSetter("resource_type")
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Getter for Name.
     * filter by the name of the metafield
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * filter by the name of the metafield
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Page.
     * Result records are organized in pages. By default, the first page of results is displayed.
     * The page parameter specifies a page number of results to fetch. You can start navigating
     * through the pages to consume the results. You do this by passing in a page parameter.
     * Retrieve the next page by adding ?page=2 to the query string. If there are no results to
     * return, then an empty result set will be returned. Use in query `page=1`.
     * @return Returns the Integer
     */
    @JsonGetter("page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPage() {
        return page;
    }

    /**
     * Setter for Page.
     * Result records are organized in pages. By default, the first page of results is displayed.
     * The page parameter specifies a page number of results to fetch. You can start navigating
     * through the pages to consume the results. You do this by passing in a page parameter.
     * Retrieve the next page by adding ?page=2 to the query string. If there are no results to
     * return, then an empty result set will be returned. Use in query `page=1`.
     * @param page Value for Integer
     */
    @JsonSetter("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * Getter for PerPage.
     * This parameter indicates how many records to fetch in each request. Default value is 20. The
     * maximum allowed values is 200; any per_page value over 200 will be changed to 200. Use in
     * query `per_page=200`.
     * @return Returns the Integer
     */
    @JsonGetter("per_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPerPage() {
        return perPage;
    }

    /**
     * Setter for PerPage.
     * This parameter indicates how many records to fetch in each request. Default value is 20. The
     * maximum allowed values is 200; any per_page value over 200 will be changed to 200. Use in
     * query `per_page=200`.
     * @param perPage Value for Integer
     */
    @JsonSetter("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    /**
     * Getter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @return Returns the ListMetafieldsInputDirection
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ListMetafieldsInputDirection getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @param direction Value for ListMetafieldsInputDirection
     */
    @JsonSetter("direction")
    public void setDirection(ListMetafieldsInputDirection direction) {
        this.direction = direction;
    }

    /**
     * Converts this ListMetafieldsInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListMetafieldsInput [" + "resourceType=" + resourceType + ", name=" + name
                + ", page=" + page + ", perPage=" + perPage + ", direction=" + direction + "]";
    }

    /**
     * Builds a new {@link ListMetafieldsInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListMetafieldsInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(resourceType)
                .name(getName())
                .page(getPage())
                .perPage(getPerPage())
                .direction(getDirection());
        return builder;
    }

    /**
     * Class to build instances of {@link ListMetafieldsInput}.
     */
    public static class Builder {
        private ResourceType resourceType;
        private String name;
        private Integer page = 1;
        private Integer perPage = 20;
        private ListMetafieldsInputDirection direction;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  resourceType  ResourceType value for resourceType.
         */
        public Builder(ResourceType resourceType) {
            this.resourceType = resourceType;
        }

        /**
         * Setter for resourceType.
         * @param  resourceType  ResourceType value for resourceType.
         * @return Builder
         */
        public Builder resourceType(ResourceType resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for page.
         * @param  page  Integer value for page.
         * @return Builder
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Setter for perPage.
         * @param  perPage  Integer value for perPage.
         * @return Builder
         */
        public Builder perPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }

        /**
         * Setter for direction.
         * @param  direction  ListMetafieldsInputDirection value for direction.
         * @return Builder
         */
        public Builder direction(ListMetafieldsInputDirection direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Builds a new {@link ListMetafieldsInput} object using the set fields.
         * @return {@link ListMetafieldsInput}
         */
        public ListMetafieldsInput build() {
            return new ListMetafieldsInput(resourceType, name, page, perPage, direction);
        }
    }
}
