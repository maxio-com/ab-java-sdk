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
import com.maxio.advancedbilling.models.containers.InvoiceEventEventData;
import io.apimatic.core.types.BaseModel;
import java.time.ZonedDateTime;

/**
 * This is a model class for InvoiceEvent type.
 */
public class InvoiceEvent
        extends BaseModel {
    private Long id;
    private InvoiceEventType eventType;
    private InvoiceEventEventData eventData;
    private ZonedDateTime timestamp;
    private Invoice invoice;

    /**
     * Default constructor.
     */
    public InvoiceEvent() {
    }

    /**
     * Initialization constructor.
     * @param  id  Long value for id.
     * @param  eventType  InvoiceEventType value for eventType.
     * @param  eventData  InvoiceEventEventData value for eventData.
     * @param  timestamp  ZonedDateTime value for timestamp.
     * @param  invoice  Invoice value for invoice.
     */
    public InvoiceEvent(
            Long id,
            InvoiceEventType eventType,
            InvoiceEventEventData eventData,
            ZonedDateTime timestamp,
            Invoice invoice) {
        this.id = id;
        this.eventType = eventType;
        this.eventData = eventData;
        this.timestamp = timestamp;
        this.invoice = invoice;
    }

    /**
     * Getter for Id.
     * @return Returns the Long
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Long
     */
    @JsonSetter("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for EventType.
     * Invoice Event Type
     * @return Returns the InvoiceEventType
     */
    @JsonGetter("event_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceEventType getEventType() {
        return eventType;
    }

    /**
     * Setter for EventType.
     * Invoice Event Type
     * @param eventType Value for InvoiceEventType
     */
    @JsonSetter("event_type")
    public void setEventType(InvoiceEventType eventType) {
        this.eventType = eventType;
    }

    /**
     * Getter for EventData.
     * The event data is the data that, when combined with the command, results in the output
     * invoice found in the invoice field.
     * @return Returns the InvoiceEventEventData
     */
    @JsonGetter("event_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvoiceEventEventData getEventData() {
        return eventData;
    }

    /**
     * Setter for EventData.
     * The event data is the data that, when combined with the command, results in the output
     * invoice found in the invoice field.
     * @param eventData Value for InvoiceEventEventData
     */
    @JsonSetter("event_data")
    public void setEventData(InvoiceEventEventData eventData) {
        this.eventData = eventData;
    }

    /**
     * Getter for Timestamp.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("timestamp")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Setter for Timestamp.
     * @param timestamp Value for ZonedDateTime
     */
    @JsonSetter("timestamp")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Getter for Invoice.
     * @return Returns the Invoice
     */
    @JsonGetter("invoice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * Setter for Invoice.
     * @param invoice Value for Invoice
     */
    @JsonSetter("invoice")
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    /**
     * Converts this InvoiceEvent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceEvent [" + "id=" + id + ", eventType=" + eventType + ", eventData="
                + eventData + ", timestamp=" + timestamp + ", invoice=" + invoice
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link InvoiceEvent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvoiceEvent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .eventType(getEventType())
                .eventData(getEventData())
                .timestamp(getTimestamp())
                .invoice(getInvoice());
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceEvent}.
     */
    public static class Builder {
        private Long id;
        private InvoiceEventType eventType;
        private InvoiceEventEventData eventData;
        private ZonedDateTime timestamp;
        private Invoice invoice;



        /**
         * Setter for id.
         * @param  id  Long value for id.
         * @return Builder
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for eventType.
         * @param  eventType  InvoiceEventType value for eventType.
         * @return Builder
         */
        public Builder eventType(InvoiceEventType eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * Setter for eventData.
         * @param  eventData  InvoiceEventEventData value for eventData.
         * @return Builder
         */
        public Builder eventData(InvoiceEventEventData eventData) {
            this.eventData = eventData;
            return this;
        }

        /**
         * Setter for timestamp.
         * @param  timestamp  ZonedDateTime value for timestamp.
         * @return Builder
         */
        public Builder timestamp(ZonedDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Setter for invoice.
         * @param  invoice  Invoice value for invoice.
         * @return Builder
         */
        public Builder invoice(Invoice invoice) {
            this.invoice = invoice;
            return this;
        }

        /**
         * Builds a new {@link InvoiceEvent} object using the set fields.
         * @return {@link InvoiceEvent}
         */
        public InvoiceEvent build() {
            return new InvoiceEvent(id, eventType, eventData, timestamp, invoice);
        }
    }
}
