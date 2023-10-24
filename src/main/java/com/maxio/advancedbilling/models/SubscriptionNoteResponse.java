/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SubscriptionNoteResponse type.
 */
public class SubscriptionNoteResponse {
    private SubscriptionNote note;

    /**
     * Default constructor.
     */
    public SubscriptionNoteResponse() {
    }

    /**
     * Initialization constructor.
     * @param  note  SubscriptionNote value for note.
     */
    public SubscriptionNoteResponse(
            SubscriptionNote note) {
        this.note = note;
    }

    /**
     * Getter for Note.
     * @return Returns the SubscriptionNote
     */
    @JsonGetter("note")
    public SubscriptionNote getNote() {
        return note;
    }

    /**
     * Setter for Note.
     * @param note Value for SubscriptionNote
     */
    @JsonSetter("note")
    public void setNote(SubscriptionNote note) {
        this.note = note;
    }

    /**
     * Converts this SubscriptionNoteResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionNoteResponse [" + "note=" + note + "]";
    }

    /**
     * Builds a new {@link SubscriptionNoteResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionNoteResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(note);
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionNoteResponse}.
     */
    public static class Builder {
        private SubscriptionNote note;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  note  SubscriptionNote value for note.
         */
        public Builder(SubscriptionNote note) {
            this.note = note;
        }

        /**
         * Setter for note.
         * @param  note  SubscriptionNote value for note.
         * @return Builder
         */
        public Builder note(SubscriptionNote note) {
            this.note = note;
            return this;
        }

        /**
         * Builds a new {@link SubscriptionNoteResponse} object using the set fields.
         * @return {@link SubscriptionNoteResponse}
         */
        public SubscriptionNoteResponse build() {
            return new SubscriptionNoteResponse(note);
        }
    }
}
