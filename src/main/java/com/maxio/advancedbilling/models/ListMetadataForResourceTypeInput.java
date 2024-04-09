/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * This is a model class for ListMetadataForResourceTypeInput type.
 */
public class ListMetadataForResourceTypeInput {
    private ResourceType resourceType;
    private Integer page;
    private Integer perPage;
    private BasicDateField dateField;
    private LocalDate startDate;
    private LocalDate endDate;
    private ZonedDateTime startDatetime;
    private ZonedDateTime endDatetime;
    private Boolean withDeleted;
    private List<Integer> resourceIds;
    private SortingDirection direction;

    /**
     * Default constructor.
     */
    public ListMetadataForResourceTypeInput() {
        page = 1;
        perPage = 20;
    }

    /**
     * Initialization constructor.
     * @param  resourceType  ResourceType value for resourceType.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  dateField  BasicDateField value for dateField.
     * @param  startDate  LocalDate value for startDate.
     * @param  endDate  LocalDate value for endDate.
     * @param  startDatetime  ZonedDateTime value for startDatetime.
     * @param  endDatetime  ZonedDateTime value for endDatetime.
     * @param  withDeleted  Boolean value for withDeleted.
     * @param  resourceIds  List of Integer value for resourceIds.
     * @param  direction  SortingDirection value for direction.
     */
    public ListMetadataForResourceTypeInput(
            ResourceType resourceType,
            Integer page,
            Integer perPage,
            BasicDateField dateField,
            LocalDate startDate,
            LocalDate endDate,
            ZonedDateTime startDatetime,
            ZonedDateTime endDatetime,
            Boolean withDeleted,
            List<Integer> resourceIds,
            SortingDirection direction) {
        this.resourceType = resourceType;
        this.page = page;
        this.perPage = perPage;
        this.dateField = dateField;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.withDeleted = withDeleted;
        this.resourceIds = resourceIds;
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
     * Getter for DateField.
     * The type of filter you would like to apply to your search.
     * @return Returns the BasicDateField
     */
    @JsonGetter("date_field")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BasicDateField getDateField() {
        return dateField;
    }

    /**
     * Setter for DateField.
     * The type of filter you would like to apply to your search.
     * @param dateField Value for BasicDateField
     */
    @JsonSetter("date_field")
    public void setDateField(BasicDateField dateField) {
        this.dateField = dateField;
    }

    /**
     * Getter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns metadata with
     * a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified.
     * @return Returns the LocalDate
     */
    @JsonGetter("start_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Setter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns metadata with
     * a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified.
     * @param startDate Value for LocalDate
     */
    @JsonSetter("start_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns metadata with a
     * timestamp up to and including 11:59:59PM in your site’s time zone on the date specified.
     * @return Returns the LocalDate
     */
    @JsonGetter("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Setter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns metadata with a
     * timestamp up to and including 11:59:59PM in your site’s time zone on the date specified.
     * @param endDate Value for LocalDate
     */
    @JsonSetter("end_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for StartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns metadata with a timestamp at or after exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of start_date.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("start_datetime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getStartDatetime() {
        return startDatetime;
    }

    /**
     * Setter for StartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns metadata with a timestamp at or after exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of start_date.
     * @param startDatetime Value for ZonedDateTime
     */
    @JsonSetter("start_datetime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartDatetime(ZonedDateTime startDatetime) {
        this.startDatetime = startDatetime;
    }

    /**
     * Getter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns metadata with a timestamp at or before exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of end_date.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("end_datetime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getEndDatetime() {
        return endDatetime;
    }

    /**
     * Setter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns metadata with a timestamp at or before exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of end_date.
     * @param endDatetime Value for ZonedDateTime
     */
    @JsonSetter("end_datetime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setEndDatetime(ZonedDateTime endDatetime) {
        this.endDatetime = endDatetime;
    }

    /**
     * Getter for WithDeleted.
     * Allow to fetch deleted metadata.
     * @return Returns the Boolean
     */
    @JsonGetter("with_deleted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getWithDeleted() {
        return withDeleted;
    }

    /**
     * Setter for WithDeleted.
     * Allow to fetch deleted metadata.
     * @param withDeleted Value for Boolean
     */
    @JsonSetter("with_deleted")
    public void setWithDeleted(Boolean withDeleted) {
        this.withDeleted = withDeleted;
    }

    /**
     * Getter for ResourceIds.
     * Allow to fetch metadata for multiple records based on provided ids. Use in query:
     * `resource_ids[]=122&amp;resource_ids[]=123&amp;resource_ids[]=124`.
     * @return Returns the List of Integer
     */
    @JsonGetter("resource_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getResourceIds() {
        return resourceIds;
    }

    /**
     * Setter for ResourceIds.
     * Allow to fetch metadata for multiple records based on provided ids. Use in query:
     * `resource_ids[]=122&amp;resource_ids[]=123&amp;resource_ids[]=124`.
     * @param resourceIds Value for List of Integer
     */
    @JsonSetter("resource_ids")
    public void setResourceIds(List<Integer> resourceIds) {
        this.resourceIds = resourceIds;
    }

    /**
     * Getter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @return Returns the SortingDirection
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SortingDirection getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * Controls the order in which results are returned. Use in query `direction=asc`.
     * @param direction Value for SortingDirection
     */
    @JsonSetter("direction")
    public void setDirection(SortingDirection direction) {
        this.direction = direction;
    }

    /**
     * Converts this ListMetadataForResourceTypeInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListMetadataForResourceTypeInput [" + "resourceType=" + resourceType + ", page="
                + page + ", perPage=" + perPage + ", dateField=" + dateField + ", startDate="
                + startDate + ", endDate=" + endDate + ", startDatetime=" + startDatetime
                + ", endDatetime=" + endDatetime + ", withDeleted=" + withDeleted + ", resourceIds="
                + resourceIds + ", direction=" + direction + "]";
    }

    /**
     * Builds a new {@link ListMetadataForResourceTypeInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListMetadataForResourceTypeInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(resourceType)
                .page(getPage())
                .perPage(getPerPage())
                .dateField(getDateField())
                .startDate(getStartDate())
                .endDate(getEndDate())
                .startDatetime(getStartDatetime())
                .endDatetime(getEndDatetime())
                .withDeleted(getWithDeleted())
                .resourceIds(getResourceIds())
                .direction(getDirection());
        return builder;
    }

    /**
     * Class to build instances of {@link ListMetadataForResourceTypeInput}.
     */
    public static class Builder {
        private ResourceType resourceType;
        private Integer page = 1;
        private Integer perPage = 20;
        private BasicDateField dateField;
        private LocalDate startDate;
        private LocalDate endDate;
        private ZonedDateTime startDatetime;
        private ZonedDateTime endDatetime;
        private Boolean withDeleted;
        private List<Integer> resourceIds;
        private SortingDirection direction;

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
         * Setter for dateField.
         * @param  dateField  BasicDateField value for dateField.
         * @return Builder
         */
        public Builder dateField(BasicDateField dateField) {
            this.dateField = dateField;
            return this;
        }

        /**
         * Setter for startDate.
         * @param  startDate  LocalDate value for startDate.
         * @return Builder
         */
        public Builder startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Setter for endDate.
         * @param  endDate  LocalDate value for endDate.
         * @return Builder
         */
        public Builder endDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * Setter for startDatetime.
         * @param  startDatetime  ZonedDateTime value for startDatetime.
         * @return Builder
         */
        public Builder startDatetime(ZonedDateTime startDatetime) {
            this.startDatetime = startDatetime;
            return this;
        }

        /**
         * Setter for endDatetime.
         * @param  endDatetime  ZonedDateTime value for endDatetime.
         * @return Builder
         */
        public Builder endDatetime(ZonedDateTime endDatetime) {
            this.endDatetime = endDatetime;
            return this;
        }

        /**
         * Setter for withDeleted.
         * @param  withDeleted  Boolean value for withDeleted.
         * @return Builder
         */
        public Builder withDeleted(Boolean withDeleted) {
            this.withDeleted = withDeleted;
            return this;
        }

        /**
         * Setter for resourceIds.
         * @param  resourceIds  List of Integer value for resourceIds.
         * @return Builder
         */
        public Builder resourceIds(List<Integer> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * Setter for direction.
         * @param  direction  SortingDirection value for direction.
         * @return Builder
         */
        public Builder direction(SortingDirection direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Builds a new {@link ListMetadataForResourceTypeInput} object using the set fields.
         * @return {@link ListMetadataForResourceTypeInput}
         */
        public ListMetadataForResourceTypeInput build() {
            return new ListMetadataForResourceTypeInput(resourceType, page, perPage, dateField,
                    startDate, endDate, startDatetime, endDatetime, withDeleted, resourceIds,
                    direction);
        }
    }
}
