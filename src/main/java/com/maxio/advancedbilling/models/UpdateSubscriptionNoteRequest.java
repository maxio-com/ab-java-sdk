/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdateSubscriptionNoteRequest type.
 */
public class UpdateSubscriptionNoteRequest {
    private UpdateSubscriptionNote note;

    /**
     * Default constructor.
     */
    public UpdateSubscriptionNoteRequest() {
    }

    /**
     * Initialization constructor.
     * @param  note  UpdateSubscriptionNote value for note.
     */
    public UpdateSubscriptionNoteRequest(
            UpdateSubscriptionNote note) {
        this.note = note;
    }

    /**
     * Getter for Note.
     * Updatable fields for Subscription Note
     * @return Returns the UpdateSubscriptionNote
     */
    @JsonGetter("note")
    public UpdateSubscriptionNote getNote() {
        return note;
    }

    /**
     * Setter for Note.
     * Updatable fields for Subscription Note
     * @param note Value for UpdateSubscriptionNote
     */
    @JsonSetter("note")
    public void setNote(UpdateSubscriptionNote note) {
        this.note = note;
    }

    /**
     * Converts this UpdateSubscriptionNoteRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateSubscriptionNoteRequest [" + "note=" + note + "]";
    }

    /**
     * Builds a new {@link UpdateSubscriptionNoteRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateSubscriptionNoteRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(note);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateSubscriptionNoteRequest}.
     */
    public static class Builder {
        private UpdateSubscriptionNote note;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  note  UpdateSubscriptionNote value for note.
         */
        public Builder(UpdateSubscriptionNote note) {
            this.note = note;
        }

        /**
         * Setter for note.
         * @param  note  UpdateSubscriptionNote value for note.
         * @return Builder
         */
        public Builder note(UpdateSubscriptionNote note) {
            this.note = note;
            return this;
        }

        /**
         * Builds a new {@link UpdateSubscriptionNoteRequest} object using the set fields.
         * @return {@link UpdateSubscriptionNoteRequest}
         */
        public UpdateSubscriptionNoteRequest build() {
            return new UpdateSubscriptionNoteRequest(note);
        }
    }
}
