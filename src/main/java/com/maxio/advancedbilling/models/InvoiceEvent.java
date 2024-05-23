/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.maxio.advancedbilling.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.ZonedDateTime;

/**
 * This is a model class for InvoiceEvent type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "event_type",
        defaultImpl = InvoiceEvent.class,
        visible = true)
@JsonInclude(Include.ALWAYS)
public class InvoiceEvent
        extends BaseModel {
    private Long id;
    private ZonedDateTime timestamp;
    private Invoice1 invoice;
    private String eventType;
    private ApplyCreditNoteEventData1 eventData;

    /**
     * Default constructor.
     */
    public InvoiceEvent() {
        setEventType("Invoice Event");
    }

    /**
     * Initialization constructor.
     * @param  id  Long value for id.
     * @param  timestamp  ZonedDateTime value for timestamp.
     * @param  invoice  Invoice1 value for invoice.
     * @param  eventType  String value for eventType.
     * @param  eventData  ApplyCreditNoteEventData1 value for eventData.
     */
    public InvoiceEvent(
            Long id,
            ZonedDateTime timestamp,
            Invoice1 invoice,
            String eventType,
            ApplyCreditNoteEventData1 eventData) {
        this.id = id;
        this.timestamp = timestamp;
        this.invoice = invoice;
        this.eventType = eventType;
        this.eventData = eventData;
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
     * @return Returns the Invoice1
     */
    @JsonGetter("invoice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Invoice1 getInvoice() {
        return invoice;
    }

    /**
     * Setter for Invoice.
     * @param invoice Value for Invoice1
     */
    @JsonSetter("invoice")
    public void setInvoice(Invoice1 invoice) {
        this.invoice = invoice;
    }

    /**
     * Getter for EventType.
     * @return Returns the String
     */
    @JsonGetter("event_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEventType() {
        return eventType;
    }

    /**
     * Setter for EventType.
     * @param eventType Value for String
     */
    @JsonSetter("event_type")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * Getter for EventData.
     * Example schema for an `apply_credit_note` event
     * @return Returns the ApplyCreditNoteEventData1
     */
    @JsonGetter("event_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ApplyCreditNoteEventData1 getEventData() {
        return eventData;
    }

    /**
     * Setter for EventData.
     * Example schema for an `apply_credit_note` event
     * @param eventData Value for ApplyCreditNoteEventData1
     */
    @JsonSetter("event_data")
    public void setEventData(ApplyCreditNoteEventData1 eventData) {
        this.eventData = eventData;
    }

    /**
     * Converts this InvoiceEvent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvoiceEvent [" + "id=" + id + ", timestamp=" + timestamp + ", invoice=" + invoice
                + ", eventType=" + eventType + ", eventData=" + eventData
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
                .timestamp(getTimestamp())
                .invoice(getInvoice())
                .eventType(getEventType())
                .eventData(getEventData());
        return builder;
    }

    /**
     * Class to build instances of {@link InvoiceEvent}.
     */
    public static class Builder {
        private Long id;
        private ZonedDateTime timestamp;
        private Invoice1 invoice;
        private String eventType = "Invoice Event";
        private ApplyCreditNoteEventData1 eventData;



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
         * @param  invoice  Invoice1 value for invoice.
         * @return Builder
         */
        public Builder invoice(Invoice1 invoice) {
            this.invoice = invoice;
            return this;
        }

        /**
         * Setter for eventType.
         * @param  eventType  String value for eventType.
         * @return Builder
         */
        public Builder eventType(String eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * Setter for eventData.
         * @param  eventData  ApplyCreditNoteEventData1 value for eventData.
         * @return Builder
         */
        public Builder eventData(ApplyCreditNoteEventData1 eventData) {
            this.eventData = eventData;
            return this;
        }

        /**
         * Builds a new {@link InvoiceEvent} object using the set fields.
         * @return {@link InvoiceEvent}
         */
        public InvoiceEvent build() {
            return new InvoiceEvent(id, timestamp, invoice, eventType, eventData);
        }
    }
}
