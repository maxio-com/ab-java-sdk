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
 * This is a model class for CreateDebitNoteEvent type.
 */
public class CreateDebitNoteEvent
        extends BaseModel {
    private long id;
    private ZonedDateTime timestamp;
    private Invoice invoice;
    private InvoiceEventType eventType;
    private DebitNote eventData;

    /**
     * Default constructor.
     */
    public CreateDebitNoteEvent() {
        eventType = InvoiceEventType.CREATE_DEBIT_NOTE;
    }

    /**
     * Initialization constructor.
     * @param  id  long value for id.
     * @param  timestamp  ZonedDateTime value for timestamp.
     * @param  invoice  Invoice value for invoice.
     * @param  eventType  InvoiceEventType value for eventType.
     * @param  eventData  DebitNote value for eventData.
     */
    @JsonCreator
    public CreateDebitNoteEvent(
            @JsonProperty("id") long id,
            @JsonProperty("timestamp") ZonedDateTime timestamp,
            @JsonProperty("invoice") Invoice invoice,
            @JsonProperty("event_type") InvoiceEventType eventType,
            @JsonProperty("event_data") DebitNote eventData) {
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
     * Example schema for an `create_debit_note` event
     * @return Returns the DebitNote
     */
    @JsonGetter("event_data")
    public DebitNote getEventData() {
        return eventData;
    }

    /**
     * Setter for EventData.
     * Example schema for an `create_debit_note` event
     * @param eventData Value for DebitNote
     */
    @JsonSetter("event_data")
    public void setEventData(DebitNote eventData) {
        this.eventData = eventData;
    }

    /**
     * Converts this CreateDebitNoteEvent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateDebitNoteEvent [" + "id=" + id + ", timestamp=" + timestamp + ", invoice="
                + invoice + ", eventType=" + eventType + ", eventData=" + eventData
                + ", additionalProperties=" + getAdditionalProperties() + "]";
    }

    /**
     * Builds a new {@link Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, timestamp, invoice, eventType, eventData);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateDebitNoteEvent}.
     */
    public static class Builder {
        private long id;
        private ZonedDateTime timestamp;
        private Invoice invoice;
        private InvoiceEventType eventType = InvoiceEventType.CREATE_DEBIT_NOTE;
        private DebitNote eventData;

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
         * @param  eventData  DebitNote value for eventData.
         */
        public Builder(long id, ZonedDateTime timestamp, Invoice invoice,
                InvoiceEventType eventType, DebitNote eventData) {
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
         * @param  eventData  DebitNote value for eventData.
         * @return Builder
         */
        public Builder eventData(DebitNote eventData) {
            this.eventData = eventData;
            return this;
        }

        /**
         * Builds a new {@link CreateDebitNoteEvent} object using the set fields.
         * @return {@link CreateDebitNoteEvent}
         */
        public CreateDebitNoteEvent build() {
            return new CreateDebitNoteEvent(id, timestamp, invoice, eventType, eventData);
        }
    }
}
