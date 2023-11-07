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
 * This is a model class for ListInvoicesInput type.
 */
public class ListInvoicesInput {
    private String startDate;
    private String endDate;
    private Status status;
    private Integer subscriptionId;
    private String subscriptionGroupUid;
    private Integer page;
    private Integer perPage;
    private Direction direction;
    private Boolean lineItems;
    private Boolean discounts;
    private Boolean taxes;
    private Boolean credits;
    private Boolean payments;
    private Boolean customFields;
    private Boolean refunds;
    private InvoiceDateField dateField;
    private String startDatetime;
    private String endDatetime;
    private List<Integer> customerIds;
    private List<String> number;
    private List<Integer> productIds;
    private InvoiceSortField sort;

    /**
     * Default constructor.
     */
    public ListInvoicesInput() {
        page = 1;
        perPage = 20;
        direction = Direction.DESC;
        lineItems = false;
        discounts = false;
        taxes = false;
        credits = false;
        payments = false;
        customFields = false;
        refunds = false;
        dateField = InvoiceDateField.DUE_DATE;
        sort = InvoiceSortField.NUMBER;
    }

    /**
     * Initialization constructor.
     * @param  startDate  String value for startDate.
     * @param  endDate  String value for endDate.
     * @param  status  Status value for status.
     * @param  subscriptionId  Integer value for subscriptionId.
     * @param  subscriptionGroupUid  String value for subscriptionGroupUid.
     * @param  page  Integer value for page.
     * @param  perPage  Integer value for perPage.
     * @param  direction  Direction value for direction.
     * @param  lineItems  Boolean value for lineItems.
     * @param  discounts  Boolean value for discounts.
     * @param  taxes  Boolean value for taxes.
     * @param  credits  Boolean value for credits.
     * @param  payments  Boolean value for payments.
     * @param  customFields  Boolean value for customFields.
     * @param  refunds  Boolean value for refunds.
     * @param  dateField  InvoiceDateField value for dateField.
     * @param  startDatetime  String value for startDatetime.
     * @param  endDatetime  String value for endDatetime.
     * @param  customerIds  List of Integer value for customerIds.
     * @param  number  List of String value for number.
     * @param  productIds  List of Integer value for productIds.
     * @param  sort  InvoiceSortField value for sort.
     */
    public ListInvoicesInput(
            String startDate,
            String endDate,
            Status status,
            Integer subscriptionId,
            String subscriptionGroupUid,
            Integer page,
            Integer perPage,
            Direction direction,
            Boolean lineItems,
            Boolean discounts,
            Boolean taxes,
            Boolean credits,
            Boolean payments,
            Boolean customFields,
            Boolean refunds,
            InvoiceDateField dateField,
            String startDatetime,
            String endDatetime,
            List<Integer> customerIds,
            List<String> number,
            List<Integer> productIds,
            InvoiceSortField sort) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.subscriptionId = subscriptionId;
        this.subscriptionGroupUid = subscriptionGroupUid;
        this.page = page;
        this.perPage = perPage;
        this.direction = direction;
        this.lineItems = lineItems;
        this.discounts = discounts;
        this.taxes = taxes;
        this.credits = credits;
        this.payments = payments;
        this.customFields = customFields;
        this.refunds = refunds;
        this.dateField = dateField;
        this.startDatetime = startDatetime;
        this.endDatetime = endDatetime;
        this.customerIds = customerIds;
        this.number = number;
        this.productIds = productIds;
        this.sort = sort;
    }

    /**
     * Getter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns invoices with
     * a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified.
     * @return Returns the String
     */
    @JsonGetter("start_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartDate() {
        return startDate;
    }

    /**
     * Setter for StartDate.
     * The start date (format YYYY-MM-DD) with which to filter the date_field. Returns invoices with
     * a timestamp at or after midnight (12:00:00 AM) in your site’s time zone on the date
     * specified.
     * @param startDate Value for String
     */
    @JsonSetter("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns invoices with a
     * timestamp up to and including 11:59:59PM in your site’s time zone on the date specified.
     * @return Returns the String
     */
    @JsonGetter("end_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndDate() {
        return endDate;
    }

    /**
     * Setter for EndDate.
     * The end date (format YYYY-MM-DD) with which to filter the date_field. Returns invoices with a
     * timestamp up to and including 11:59:59PM in your site’s time zone on the date specified.
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
     * Getter for SubscriptionId.
     * The subscription's ID.
     * @return Returns the Integer
     */
    @JsonGetter("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * The subscription's ID.
     * @param subscriptionId Value for Integer
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for SubscriptionGroupUid.
     * The UID of the subscription group you want to fetch consolidated invoices for. This will
     * return a paginated list of consolidated invoices for the specified group.
     * @return Returns the String
     */
    @JsonGetter("subscription_group_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubscriptionGroupUid() {
        return subscriptionGroupUid;
    }

    /**
     * Setter for SubscriptionGroupUid.
     * The UID of the subscription group you want to fetch consolidated invoices for. This will
     * return a paginated list of consolidated invoices for the specified group.
     * @param subscriptionGroupUid Value for String
     */
    @JsonSetter("subscription_group_uid")
    public void setSubscriptionGroupUid(String subscriptionGroupUid) {
        this.subscriptionGroupUid = subscriptionGroupUid;
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
     * Getter for Refunds.
     * Include refunds data
     * @return Returns the Boolean
     */
    @JsonGetter("refunds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRefunds() {
        return refunds;
    }

    /**
     * Setter for Refunds.
     * Include refunds data
     * @param refunds Value for Boolean
     */
    @JsonSetter("refunds")
    public void setRefunds(Boolean refunds) {
        this.refunds = refunds;
    }

    /**
     * Getter for DateField.
     * The type of filter you would like to apply to your search. Use in query
     * `date_field=issue_date`.
     * @return Returns the InvoiceDateField
     */
    @JsonGetter("date_field")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceDateField getDateField() {
        return dateField;
    }

    /**
     * Setter for DateField.
     * The type of filter you would like to apply to your search. Use in query
     * `date_field=issue_date`.
     * @param dateField Value for InvoiceDateField
     */
    @JsonSetter("date_field")
    public void setDateField(InvoiceDateField dateField) {
        this.dateField = dateField;
    }

    /**
     * Getter for StartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns invoices with a timestamp at or after exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of start_date. Allowed to be used only along with date_field set to
     * created_at or updated_at.
     * @return Returns the String
     */
    @JsonGetter("start_datetime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartDatetime() {
        return startDatetime;
    }

    /**
     * Setter for StartDatetime.
     * The start date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns invoices with a timestamp at or after exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of start_date. Allowed to be used only along with date_field set to
     * created_at or updated_at.
     * @param startDatetime Value for String
     */
    @JsonSetter("start_datetime")
    public void setStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
    }

    /**
     * Getter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns invoices with a timestamp at or before exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of end_date. Allowed to be used only along with date_field set to
     * created_at or updated_at.
     * @return Returns the String
     */
    @JsonGetter("end_datetime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndDatetime() {
        return endDatetime;
    }

    /**
     * Setter for EndDatetime.
     * The end date and time (format YYYY-MM-DD HH:MM:SS) with which to filter the date_field.
     * Returns invoices with a timestamp at or before exact time provided in query. You can specify
     * timezone in query - otherwise your site's time zone will be used. If provided, this parameter
     * will be used instead of end_date. Allowed to be used only along with date_field set to
     * created_at or updated_at.
     * @param endDatetime Value for String
     */
    @JsonSetter("end_datetime")
    public void setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
    }

    /**
     * Getter for CustomerIds.
     * Allows fetching invoices with matching customer id based on provided values. Use in query
     * `customer_ids=1,2,3`.
     * @return Returns the List of Integer
     */
    @JsonGetter("customer_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getCustomerIds() {
        return customerIds;
    }

    /**
     * Setter for CustomerIds.
     * Allows fetching invoices with matching customer id based on provided values. Use in query
     * `customer_ids=1,2,3`.
     * @param customerIds Value for List of Integer
     */
    @JsonSetter("customer_ids")
    public void setCustomerIds(List<Integer> customerIds) {
        this.customerIds = customerIds;
    }

    /**
     * Getter for Number.
     * Allows fetching invoices with matching invoice number based on provided values. Use in query
     * `number=1234,1235`.
     * @return Returns the List of String
     */
    @JsonGetter("number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * Allows fetching invoices with matching invoice number based on provided values. Use in query
     * `number=1234,1235`.
     * @param number Value for List of String
     */
    @JsonSetter("number")
    public void setNumber(List<String> number) {
        this.number = number;
    }

    /**
     * Getter for ProductIds.
     * Allows fetching invoices with matching line items product ids based on provided values. Use
     * in query `product_ids=23,34`.
     * @return Returns the List of Integer
     */
    @JsonGetter("product_ids")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Integer> getProductIds() {
        return productIds;
    }

    /**
     * Setter for ProductIds.
     * Allows fetching invoices with matching line items product ids based on provided values. Use
     * in query `product_ids=23,34`.
     * @param productIds Value for List of Integer
     */
    @JsonSetter("product_ids")
    public void setProductIds(List<Integer> productIds) {
        this.productIds = productIds;
    }

    /**
     * Getter for Sort.
     * Allows specification of the order of the returned list. Use in query `sort=total_amount`.
     * @return Returns the InvoiceSortField
     */
    @JsonGetter("sort")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceSortField getSort() {
        return sort;
    }

    /**
     * Setter for Sort.
     * Allows specification of the order of the returned list. Use in query `sort=total_amount`.
     * @param sort Value for InvoiceSortField
     */
    @JsonSetter("sort")
    public void setSort(InvoiceSortField sort) {
        this.sort = sort;
    }

    /**
     * Converts this ListInvoicesInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListInvoicesInput [" + "startDate=" + startDate + ", endDate=" + endDate
                + ", status=" + status + ", subscriptionId=" + subscriptionId
                + ", subscriptionGroupUid=" + subscriptionGroupUid + ", page=" + page + ", perPage="
                + perPage + ", direction=" + direction + ", lineItems=" + lineItems + ", discounts="
                + discounts + ", taxes=" + taxes + ", credits=" + credits + ", payments=" + payments
                + ", customFields=" + customFields + ", refunds=" + refunds + ", dateField="
                + dateField + ", startDatetime=" + startDatetime + ", endDatetime=" + endDatetime
                + ", customerIds=" + customerIds + ", number=" + number + ", productIds="
                + productIds + ", sort=" + sort + "]";
    }

    /**
     * Builds a new {@link ListInvoicesInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListInvoicesInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .startDate(getStartDate())
                .endDate(getEndDate())
                .status(getStatus())
                .subscriptionId(getSubscriptionId())
                .subscriptionGroupUid(getSubscriptionGroupUid())
                .page(getPage())
                .perPage(getPerPage())
                .direction(getDirection())
                .lineItems(getLineItems())
                .discounts(getDiscounts())
                .taxes(getTaxes())
                .credits(getCredits())
                .payments(getPayments())
                .customFields(getCustomFields())
                .refunds(getRefunds())
                .dateField(getDateField())
                .startDatetime(getStartDatetime())
                .endDatetime(getEndDatetime())
                .customerIds(getCustomerIds())
                .number(getNumber())
                .productIds(getProductIds())
                .sort(getSort());
        return builder;
    }

    /**
     * Class to build instances of {@link ListInvoicesInput}.
     */
    public static class Builder {
        private String startDate;
        private String endDate;
        private Status status;
        private Integer subscriptionId;
        private String subscriptionGroupUid;
        private Integer page = 1;
        private Integer perPage = 20;
        private Direction direction = Direction.DESC;
        private Boolean lineItems = false;
        private Boolean discounts = false;
        private Boolean taxes = false;
        private Boolean credits = false;
        private Boolean payments = false;
        private Boolean customFields = false;
        private Boolean refunds = false;
        private InvoiceDateField dateField = InvoiceDateField.DUE_DATE;
        private String startDatetime;
        private String endDatetime;
        private List<Integer> customerIds;
        private List<String> number;
        private List<Integer> productIds;
        private InvoiceSortField sort = InvoiceSortField.NUMBER;



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
         * Setter for subscriptionId.
         * @param  subscriptionId  Integer value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(Integer subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Setter for subscriptionGroupUid.
         * @param  subscriptionGroupUid  String value for subscriptionGroupUid.
         * @return Builder
         */
        public Builder subscriptionGroupUid(String subscriptionGroupUid) {
            this.subscriptionGroupUid = subscriptionGroupUid;
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
         * Setter for refunds.
         * @param  refunds  Boolean value for refunds.
         * @return Builder
         */
        public Builder refunds(Boolean refunds) {
            this.refunds = refunds;
            return this;
        }

        /**
         * Setter for dateField.
         * @param  dateField  InvoiceDateField value for dateField.
         * @return Builder
         */
        public Builder dateField(InvoiceDateField dateField) {
            this.dateField = dateField;
            return this;
        }

        /**
         * Setter for startDatetime.
         * @param  startDatetime  String value for startDatetime.
         * @return Builder
         */
        public Builder startDatetime(String startDatetime) {
            this.startDatetime = startDatetime;
            return this;
        }

        /**
         * Setter for endDatetime.
         * @param  endDatetime  String value for endDatetime.
         * @return Builder
         */
        public Builder endDatetime(String endDatetime) {
            this.endDatetime = endDatetime;
            return this;
        }

        /**
         * Setter for customerIds.
         * @param  customerIds  List of Integer value for customerIds.
         * @return Builder
         */
        public Builder customerIds(List<Integer> customerIds) {
            this.customerIds = customerIds;
            return this;
        }

        /**
         * Setter for number.
         * @param  number  List of String value for number.
         * @return Builder
         */
        public Builder number(List<String> number) {
            this.number = number;
            return this;
        }

        /**
         * Setter for productIds.
         * @param  productIds  List of Integer value for productIds.
         * @return Builder
         */
        public Builder productIds(List<Integer> productIds) {
            this.productIds = productIds;
            return this;
        }

        /**
         * Setter for sort.
         * @param  sort  InvoiceSortField value for sort.
         * @return Builder
         */
        public Builder sort(InvoiceSortField sort) {
            this.sort = sort;
            return this;
        }

        /**
         * Builds a new {@link ListInvoicesInput} object using the set fields.
         * @return {@link ListInvoicesInput}
         */
        public ListInvoicesInput build() {
            return new ListInvoicesInput(startDate, endDate, status, subscriptionId,
                    subscriptionGroupUid, page, perPage, direction, lineItems, discounts, taxes,
                    credits, payments, customFields, refunds, dateField, startDatetime, endDatetime,
                    customerIds, number, productIds, sort);
        }
    }
}
