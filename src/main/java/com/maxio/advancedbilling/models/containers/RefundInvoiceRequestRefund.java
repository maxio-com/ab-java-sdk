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
import com.maxio.advancedbilling.models.RefundConsolidatedInvoice;
import com.maxio.advancedbilling.models.RefundInvoice;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = RefundInvoiceRequestRefund.RefundInvoiceRequestRefundDeserializer.class)
public abstract class RefundInvoiceRequestRefund {
    
    /**
     * This is Refund Invoice case.
     * @param refundInvoice RefundInvoice value for refundInvoice.
     * @return The RefundInvoiceCase object.
     */
    public static RefundInvoiceRequestRefund fromRefundInvoice(RefundInvoice refundInvoice) {
        return refundInvoice == null ? null : new RefundInvoiceCase(refundInvoice);
    }

    /**
     * This is Refund Consolidated Invoice case.
     * @param refundConsolidatedInvoice RefundConsolidatedInvoice value for refundConsolidatedInvoice.
     * @return The RefundConsolidatedInvoiceCase object.
     */
    public static RefundInvoiceRequestRefund fromRefundConsolidatedInvoice(
            RefundConsolidatedInvoice refundConsolidatedInvoice) {
        return refundConsolidatedInvoice == null ? null : new RefundConsolidatedInvoiceCase(refundConsolidatedInvoice);
    }

    /**
     * Method to match from the provided any-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The any-of type cases callback.
     * @return The any-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for any-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R refundInvoice(RefundInvoice refundInvoice);

        R refundConsolidatedInvoice(RefundConsolidatedInvoice refundConsolidatedInvoice);
    }

    /**
     * This is a implementation class for RefundInvoiceCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "RefundInvoice")
    private static class RefundInvoiceCase extends RefundInvoiceRequestRefund {

        @JsonValue
        private RefundInvoice refundInvoice;

        RefundInvoiceCase(RefundInvoice refundInvoice) {
            this.refundInvoice = refundInvoice;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.refundInvoice(this.refundInvoice);
        }

        @JsonCreator
        private RefundInvoiceCase(JsonNode jsonNode) throws IOException {
            this.refundInvoice = ApiHelper.deserialize(jsonNode,
                RefundInvoice.class);
        }

        @Override
        public String toString() {
            return refundInvoice.toString();
        }
    }

    /**
     * This is a implementation class for RefundConsolidatedInvoiceCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "RefundConsolidatedInvoice")
    private static class RefundConsolidatedInvoiceCase extends RefundInvoiceRequestRefund {

        @JsonValue
        private RefundConsolidatedInvoice refundConsolidatedInvoice;

        RefundConsolidatedInvoiceCase(RefundConsolidatedInvoice refundConsolidatedInvoice) {
            this.refundConsolidatedInvoice = refundConsolidatedInvoice;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.refundConsolidatedInvoice(this.refundConsolidatedInvoice);
        }

        @JsonCreator
        private RefundConsolidatedInvoiceCase(JsonNode jsonNode) throws IOException {
            this.refundConsolidatedInvoice = ApiHelper.deserialize(jsonNode,
                RefundConsolidatedInvoice.class);
        }

        @Override
        public String toString() {
            return refundConsolidatedInvoice.toString();
        }
    }

    /**
     * This is a custom deserializer class for RefundInvoiceRequestRefund.
     */
    protected static class RefundInvoiceRequestRefundDeserializer
            extends JsonDeserializer<RefundInvoiceRequestRefund> {

        @Override
        public RefundInvoiceRequestRefund deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(RefundInvoiceCase.class,
                    RefundConsolidatedInvoiceCase.class), false);
        }
    }

}
