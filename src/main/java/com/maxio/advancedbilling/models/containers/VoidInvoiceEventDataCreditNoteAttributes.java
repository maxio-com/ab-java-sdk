/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.models.containers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.models.CreditNote;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = VoidInvoiceEventDataCreditNoteAttributes.VoidInvoiceEventDataCreditNoteAttributesDeserializer.class)
public abstract class VoidInvoiceEventDataCreditNoteAttributes {
    
    /**
     * This is Credit Note case.
     * @param creditNote CreditNote value for creditNote.
     * @return The CreditNoteCase object.
     */
    public static VoidInvoiceEventDataCreditNoteAttributes fromCreditNote(CreditNote creditNote) {
        return creditNote == null ? null : new CreditNoteCase(creditNote);
    }

    /**
     * Method to match from the provided one-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The one-of type cases callback.
     * @return The one-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for one-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R creditNote(CreditNote creditNote);
    }

    /**
     * This is a implementation class for CreditNoteCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CreditNote")
    private static class CreditNoteCase extends VoidInvoiceEventDataCreditNoteAttributes {

        @JsonValue
        private CreditNote creditNote;

        CreditNoteCase(CreditNote creditNote) {
            this.creditNote = creditNote;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.creditNote(this.creditNote);
        }

        @JsonCreator
        private CreditNoteCase(JsonNode jsonNode) throws IOException {
            this.creditNote = ApiHelper.deserialize(jsonNode,
                CreditNote.class);
        }

        @Override
        public String toString() {
            return creditNote.toString();
        }
    }

    /**
     * This is a custom deserializer class for VoidInvoiceEventDataCreditNoteAttributes.
     */
    protected static class VoidInvoiceEventDataCreditNoteAttributesDeserializer
            extends JsonDeserializer<VoidInvoiceEventDataCreditNoteAttributes> {

        @Override
        public VoidInvoiceEventDataCreditNoteAttributes deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(CreditNoteCase.class), true);
        }
    }

}
