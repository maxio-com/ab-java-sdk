/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for EventResponse type.
 */
public class EventResponse {
    private Event event;

    /**
     * Default constructor.
     */
    public EventResponse() {
    }

    /**
     * Initialization constructor.
     * @param  event  Event value for event.
     */
    public EventResponse(
            Event event) {
        this.event = event;
    }

    /**
     * Getter for Event.
     * @return Returns the Event
     */
    @JsonGetter("event")
    public Event getEvent() {
        return event;
    }

    /**
     * Setter for Event.
     * @param event Value for Event
     */
    @JsonSetter("event")
    public void setEvent(Event event) {
        this.event = event;
    }

    /**
     * Converts this EventResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EventResponse [" + "event=" + event + "]";
    }

    /**
     * Builds a new {@link EventResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EventResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(event);
        return builder;
    }

    /**
     * Class to build instances of {@link EventResponse}.
     */
    public static class Builder {
        private Event event;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  event  Event value for event.
         */
        public Builder(Event event) {
            this.event = event;
        }

        /**
         * Setter for event.
         * @param  event  Event value for event.
         * @return Builder
         */
        public Builder event(Event event) {
            this.event = event;
            return this;
        }

        /**
         * Builds a new {@link EventResponse} object using the set fields.
         * @return {@link EventResponse}
         */
        public EventResponse build() {
            return new EventResponse(event);
        }
    }
}
