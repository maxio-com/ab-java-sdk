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
 * This is a model class for ListProformaInvoicesInput type.
 */
public class ListProformaInvoicesInput {
    private String subscriptionId;
    private String startDate;
    private String endDate;
    private Status status;
    private Integer page;
    private Integer perPage;
    private Direction direction;
    private Boolean lineItems;
    private Boolean discounts;
    private Boolean taxes;
    private Boolean credits;
    private Boolean payments;
    private Boolean customFields;

    /**
     * Default constructor.
     */
    public ListProformaInvoicesInput() {
        page = 1;
        perPage = 20;
        direction = Direction.DESC;
        lineItems = false;
        discounts = false;
        taxes = false;
        credits = false;
        payments = false;
        customFields = false;
    }

    /**
     * Initialization constructor.
     * @param  subscriptionId  String value for subscriptionId.
     * @param  startDate  String value for startDate.
     * @param  endDate  String value for endDate.
     * @param  status  Status value for status.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  direction  Direction value for direction.
     * @param  lineItems  Boolean value for lineItems.
     * @param  discounts  Boolean value for discounts.
     * @param  taxes  Boolean value for taxes.
     * @param  credits  Boolean value for credits.
     * @param  payments  Boolean value for payments.
     * @param  customFields  Boolean value for customFields.
     */
    public ListProformaInvoicesInput(
            String subscriptionId,
            String startDate,
            String endDate,
            Status status,
            Integer page,
            Integer perPage,
            Direction direction,
            Boolean lineItems,
            Boolean discounts,
            Boolean taxes,
            Boolean credits,
            Boolean payments,
            Boolean customFields) {
        this.subscriptionId = subscriptionId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.page = page;
        this.perPage = perPage;
        this.direction = direction;
        this.lineItems = lineItems;
        this.discounts = discounts;
        this.taxes = taxes;
        this.credits = credits;
        this.payments = payments;
        this.customFields = customFields;
    }

    /**
     * Getter for SubscriptionId.
     * The Chargify id of the subscription
     * @return Returns the String
     */
    @JsonGetter("subscription_id")
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * The Chargify id of the subscription
     * @param subscriptionId Value for String
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for StartDate.
     * The beginning date range for the invoice's Due Date, in the YYYY-MM-DD format.
     * @return Returns the String
     */
    @JsonGetter("start_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartDate() {
        return startDate;
    }

    /**
     * Setter for StartDate.
     * The beginning date range for the invoice's Due Date, in the YYYY-MM-DD format.
     * @param startDate Value for String
     */
    @JsonSetter("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for EndDate.
     * The ending date range for the invoice's Due Date, in the YYYY-MM-DD format.
     * @return Returns the String
     */
    @JsonGetter("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndDate() {
        return endDate;
    }

    /**
     * Setter for EndDate.
     * The ending date range for the invoice's Due Date, in the YYYY-MM-DD format.
     * @param endDate Value for String
     */
    @JsonSetter("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for Status.
     * The current status of the invoice. Allowed Values: draft, open, paid, pending, voided
     * @return Returns the Status
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Status getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The current status of the invoice. Allowed Values: draft, open, paid, pending, voided
     * @param status Value for Status
     */
    @JsonSetter("status")
    public void setStatus(Status status) {
        this.status = status;
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
     * The sort direction of the returned invoices.
     * @return Returns the Direction
     */
    @JsonGetter("direction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Direction getDirection() {
        return direction;
    }

    /**
     * Setter for Direction.
     * The sort direction of the returned invoices.
     * @param direction Value for Direction
     */
    @JsonSetter("direction")
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * Getter for LineItems.
     * Include line items data
     * @return Returns the Boolean
     */
    @JsonGetter("line_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getLineItems() {
        return lineItems;
    }

    /**
     * Setter for LineItems.
     * Include line items data
     * @param lineItems Value for Boolean
     */
    @JsonSetter("line_items")
    public void setLineItems(Boolean lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * Getter for Discounts.
     * Include discounts data
     * @return Returns the Boolean
     */
    @JsonGetter("discounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDiscounts() {
        return discounts;
    }

    /**
     * Setter for Discounts.
     * Include discounts data
     * @param discounts Value for Boolean
     */
    @JsonSetter("discounts")
    public void setDiscounts(Boolean discounts) {
        this.discounts = discounts;
    }

    /**
     * Getter for Taxes.
     * Include taxes data
     * @return Returns the Boolean
     */
    @JsonGetter("taxes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTaxes() {
        return taxes;
    }

    /**
     * Setter for Taxes.
     * Include taxes data
     * @param taxes Value for Boolean
     */
    @JsonSetter("taxes")
    public void setTaxes(Boolean taxes) {
        this.taxes = taxes;
    }

    /**
     * Getter for Credits.
     * Include credits data
     * @return Returns the Boolean
     */
    @JsonGetter("credits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCredits() {
        return credits;
    }

    /**
     * Setter for Credits.
     * Include credits data
     * @param credits Value for Boolean
     */
    @JsonSetter("credits")
    public void setCredits(Boolean credits) {
        this.credits = credits;
    }

    /**
     * Getter for Payments.
     * Include payments data
     * @return Returns the Boolean
     */
    @JsonGetter("payments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPayments() {
        return payments;
    }

    /**
     * Setter for Payments.
     * Include payments data
     * @param payments Value for Boolean
     */
    @JsonSetter("payments")
    public void setPayments(Boolean payments) {
        this.payments = payments;
    }

    /**
     * Getter for CustomFields.
     * Include custom fields data
     * @return Returns the Boolean
     */
    @JsonGetter("custom_fields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCustomFields() {
        return customFields;
    }

    /**
     * Setter for CustomFields.
     * Include custom fields data
     * @param customFields Value for Boolean
     */
    @JsonSetter("custom_fields")
    public void setCustomFields(Boolean customFields) {
        this.customFields = customFields;
    }

    /**
     * Converts this ListProformaInvoicesInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListProformaInvoicesInput [" + "subscriptionId=" + subscriptionId + ", startDate="
                + startDate + ", endDate=" + endDate + ", status=" + status + ", page=" + page
                + ", perPage=" + perPage + ", direction=" + direction + ", lineItems=" + lineItems
                + ", discounts=" + discounts + ", taxes=" + taxes + ", credits=" + credits
                + ", payments=" + payments + ", customFields=" + customFields + "]";
    }

    /**
     * Builds a new {@link ListProformaInvoicesInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListProformaInvoicesInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(subscriptionId)
                .startDate(getStartDate())
                .endDate(getEndDate())
                .status(getStatus())
                .page(getPage())
                .perPage(getPerPage())
                .direction(getDirection())
                .lineItems(getLineItems())
                .discounts(getDiscounts())
                .taxes(getTaxes())
                .credits(getCredits())
                .payments(getPayments())
                .customFields(getCustomFields());
        return builder;
    }

    /**
     * Class to build instances of {@link ListProformaInvoicesInput}.
     */
    public static class Builder {
        private String subscriptionId;
        private String startDate;
        private String endDate;
        private Status status;
        private Integer page = 1;
        private Integer perPage = 20;
        private Direction direction = Direction.DESC;
        private Boolean lineItems = false;
        private Boolean discounts = false;
        private Boolean taxes = false;
        private Boolean credits = false;
        private Boolean payments = false;
        private Boolean customFields = false;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  subscriptionId  String value for subscriptionId.
         */
        public Builder(String subscriptionId) {
            this.subscriptionId = subscriptionId;
        }

        /**
         * Setter for subscriptionId.
         * @param  subscriptionId  String value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for startDate.
         * @param  startDate  String value for startDate.
         * @return Builder
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Setter for endDate.
         * @param  endDate  String value for endDate.
         * @return Builder
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  Status value for status.
         * @return Builder
         */
        public Builder status(Status status) {
            this.status = status;
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
         * @param  direction  Direction value for direction.
         * @return Builder
         */
        public Builder direction(Direction direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Setter for lineItems.
         * @param  lineItems  Boolean value for lineItems.
         * @return Builder
         */
        public Builder lineItems(Boolean lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        /**
         * Setter for discounts.
         * @param  discounts  Boolean value for discounts.
         * @return Builder
         */
        public Builder discounts(Boolean discounts) {
            this.discounts = discounts;
            return this;
        }

        /**
         * Setter for taxes.
         * @param  taxes  Boolean value for taxes.
         * @return Builder
         */
        public Builder taxes(Boolean taxes) {
            this.taxes = taxes;
            return this;
        }

        /**
         * Setter for credits.
         * @param  credits  Boolean value for credits.
         * @return Builder
         */
        public Builder credits(Boolean credits) {
            this.credits = credits;
            return this;
        }

        /**
         * Setter for payments.
         * @param  payments  Boolean value for payments.
         * @return Builder
         */
        public Builder payments(Boolean payments) {
            this.payments = payments;
            return this;
        }

        /**
         * Setter for customFields.
         * @param  customFields  Boolean value for customFields.
         * @return Builder
         */
        public Builder customFields(Boolean customFields) {
            this.customFields = customFields;
            return this;
        }

        /**
         * Builds a new {@link ListProformaInvoicesInput} object using the set fields.
         * @return {@link ListProformaInvoicesInput}
         */
        public ListProformaInvoicesInput build() {
            return new ListProformaInvoicesInput(subscriptionId, startDate, endDate, status, page,
                    perPage, direction, lineItems, discounts, taxes, credits, payments,
                    customFields);
        }
    }
}
