/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ListCreditNotesResponse type.
 */
public class ListCreditNotesResponse {
    private List<CreditNote> creditNotes;

    /**
     * Default constructor.
     */
    public ListCreditNotesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  creditNotes  List of CreditNote value for creditNotes.
     */
    public ListCreditNotesResponse(
            List<CreditNote> creditNotes) {
        this.creditNotes = creditNotes;
    }

    /**
     * Getter for CreditNotes.
     * @return Returns the List of CreditNote
     */
    @JsonGetter("credit_notes")
    public List<CreditNote> getCreditNotes() {
        return creditNotes;
    }

    /**
     * Setter for CreditNotes.
     * @param creditNotes Value for List of CreditNote
     */
    @JsonSetter("credit_notes")
    public void setCreditNotes(List<CreditNote> creditNotes) {
        this.creditNotes = creditNotes;
    }

    /**
     * Converts this ListCreditNotesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListCreditNotesResponse [" + "creditNotes=" + creditNotes + "]";
    }

    /**
     * Builds a new {@link ListCreditNotesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListCreditNotesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(creditNotes);
        return builder;
    }

    /**
     * Class to build instances of {@link ListCreditNotesResponse}.
     */
    public static class Builder {
        private List<CreditNote> creditNotes;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  creditNotes  List of CreditNote value for creditNotes.
         */
        public Builder(List<CreditNote> creditNotes) {
            this.creditNotes = creditNotes;
        }

        /**
         * Setter for creditNotes.
         * @param  creditNotes  List of CreditNote value for creditNotes.
         * @return Builder
         */
        public Builder creditNotes(List<CreditNote> creditNotes) {
            this.creditNotes = creditNotes;
            return this;
        }

        /**
         * Builds a new {@link ListCreditNotesResponse} object using the set fields.
         * @return {@link ListCreditNotesResponse}
         */
        public ListCreditNotesResponse build() {
            return new ListCreditNotesResponse(creditNotes);
        }
    }
}
