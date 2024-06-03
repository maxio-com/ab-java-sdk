/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.ZonedDateTime;

/**
 * This is a model class for RemovePaymentEvent type.
 */
public class RemovePaymentEvent
        extends BaseModel {
    private long id;
    private ZonedDateTime timestamp;
    private Invoice invoice;
    private InvoiceEventType eventType;
    private RemovePaymentEventData eventData;

    /**
     * Default constructor.
     */
    public RemovePaymentEvent() {
        eventType = InvoiceEventType.REMOVE_PAYMENT;
    }

    /**
     * Initialization constructor.
     * @param  id  long value for id.
     * @param  timestamp  ZonedDateTime value for timestamp.
     * @param  invoice  Invoice value for invoice.
     * @param  eventType  InvoiceEventType value for eventType.
     * @param  eventData  RemovePaymentEventData value for eventData.
     */
    @JsonCreator
    public RemovePaymentEvent(
            @JsonProperty("id") long id,
            @JsonProperty("timestamp") ZonedDateTime timestamp,
            @JsonProperty("invoice") Invoice invoice,
            @JsonProperty("event_type") InvoiceEventType eventType,
            @JsonProperty("event_data") RemovePaymentEventData eventData) {
        this.id = id;
        this.timestamp = timestamp;
        this.invoice = invoice;
        this.eventType = eventType;
        this.eventData = eventData;
    }

    /**
     * Getter for Id.
     * @return Returns the long
     */
    @JsonGetter("id")
    public long getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for long
     */
    @JsonSetter("id")
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Getter for Timestamp.
     * @return Returns the ZonedDateTime
     */
    @JsonGetter("timestamp")
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
     * Getter for EventType.
     * @return Returns the InvoiceEventType
     */
    @JsonGetter("event_type")
    public InvoiceEventType getEventType() {
        return eventType;
    }

    /**
     * Setter for EventType.
     * @param eventType Value for InvoiceEventType
     */
    @JsonSetter("event_type")
    public void setEventType(InvoiceEventType eventType) {
        this.eventType = eventType;
    }

    /**
     * Getter for EventData.
     * Example schema for an `remove_payment` event
     * @return Returns the RemovePaymentEventData
     */
    @JsonGetter("event_data")
    public RemovePaymentEventData getEventData() {
        return eventData;
    }

    /**
     * Setter for EventData.
     * Example schema for an `remove_payment` event
     * @param eventData Value for RemovePaymentEventData
     */
    @JsonSetter("event_data")
    public void setEventData(RemovePaymentEventData eventData) {
        this.eventData = eventData;
    }

    /**
     * Converts this RemovePaymentEvent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RemovePaymentEvent [" + "id=" + id + ", timestamp=" + timestamp + ", invoice="
                + invoice + ", eventType=" + eventType + ", eventData=" + eventData
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link RemovePaymentEvent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RemovePaymentEvent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, timestamp, invoice, eventType, eventData);
        return builder;
    }

    /**
     * Class to build instances of {@link RemovePaymentEvent}.
     */
    public static class Builder {
        private long id;
        private ZonedDateTime timestamp;
        private Invoice invoice;
        private InvoiceEventType eventType = InvoiceEventType.REMOVE_PAYMENT;
        private RemovePaymentEventData eventData;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  long value for id.
         * @param  timestamp  ZonedDateTime value for timestamp.
         * @param  invoice  Invoice value for invoice.
         * @param  eventType  InvoiceEventType value for eventType.
         * @param  eventData  RemovePaymentEventData value for eventData.
         */
        public Builder(long id, ZonedDateTime timestamp, Invoice invoice,
                InvoiceEventType eventType, RemovePaymentEventData eventData) {
            this.id = id;
            this.timestamp = timestamp;
            this.invoice = invoice;
            this.eventType = eventType;
            this.eventData = eventData;
        }

        /**
         * Setter for id.
         * @param  id  long value for id.
         * @return Builder
         */
        public Builder id(long id) {
            this.id = id;
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
         * @param  eventData  RemovePaymentEventData value for eventData.
         * @return Builder
         */
        public Builder eventData(RemovePaymentEventData eventData) {
            this.eventData = eventData;
            return this;
        }

        /**
         * Builds a new {@link RemovePaymentEvent} object using the set fields.
         * @return {@link RemovePaymentEvent}
         */
        public RemovePaymentEvent build() {
            return new RemovePaymentEvent(id, timestamp, invoice, eventType, eventData);
        }
    }
}