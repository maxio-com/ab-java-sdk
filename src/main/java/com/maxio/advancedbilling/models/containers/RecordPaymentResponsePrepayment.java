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
import com.maxio.advancedbilling.models.InvoicePrePayment;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = RecordPaymentResponsePrepayment.RecordPaymentResponsePrepaymentDeserializer.class)
public abstract class RecordPaymentResponsePrepayment {
    
    /**
     * This is Invoice PrePayment case.
     * @param invoicePrePayment InvoicePrePayment value for invoicePrePayment.
     * @return The InvoicePrePaymentCase object.
     */
    public static RecordPaymentResponsePrepayment fromInvoicePrePayment(
            InvoicePrePayment invoicePrePayment) {
        return invoicePrePayment == null ? null : new InvoicePrePaymentCase(invoicePrePayment);
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
        R invoicePrePayment(InvoicePrePayment invoicePrePayment);
    }

    /**
     * This is a implementation class for InvoicePrePaymentCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "InvoicePrePayment")
    private static class InvoicePrePaymentCase extends RecordPaymentResponsePrepayment {

        @JsonValue
        private InvoicePrePayment invoicePrePayment;

        InvoicePrePaymentCase(InvoicePrePayment invoicePrePayment) {
            this.invoicePrePayment = invoicePrePayment;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.invoicePrePayment(this.invoicePrePayment);
        }

        @JsonCreator
        private InvoicePrePaymentCase(JsonNode jsonNode) throws IOException {
            this.invoicePrePayment = ApiHelper.deserialize(jsonNode,
                InvoicePrePayment.class);
        }

        @Override
        public String toString() {
            return invoicePrePayment.toString();
        }
    }

    /**
     * This is a custom deserializer class for RecordPaymentResponsePrepayment.
     */
    protected static class RecordPaymentResponsePrepaymentDeserializer
            extends JsonDeserializer<RecordPaymentResponsePrepayment> {

        @Override
        public RecordPaymentResponsePrepayment deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(InvoicePrePaymentCase.class), true);
        }
    }

}
