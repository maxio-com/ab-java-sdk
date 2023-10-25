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
import com.maxio.advancedbilling.models.InvoiceLineItemComponentCostData;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = InvoiceLineItemComponentCostData2.InvoiceLineItemComponentCostData2Deserializer.class)
public abstract class InvoiceLineItemComponentCostData2 {
    
    /**
     * This is Invoice Line Item Component Cost Data case.
     * @param invoiceLineItemComponentCostData InvoiceLineItemComponentCostData value for invoiceLineItemComponentCostData.
     * @return The InvoiceLineItemComponentCostDataCase object.
     */
    public static InvoiceLineItemComponentCostData2 fromInvoiceLineItemComponentCostData(
            InvoiceLineItemComponentCostData invoiceLineItemComponentCostData) {
        return invoiceLineItemComponentCostData == null ? null : new InvoiceLineItemComponentCostDataCase(invoiceLineItemComponentCostData);
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
        R invoiceLineItemComponentCostData(InvoiceLineItemComponentCostData invoiceLineItemComponentCostData);
    }

    /**
     * This is a implementation class for InvoiceLineItemComponentCostDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "InvoiceLineItemComponentCostData")
    private static class InvoiceLineItemComponentCostDataCase extends InvoiceLineItemComponentCostData2 {

        @JsonValue
        private InvoiceLineItemComponentCostData invoiceLineItemComponentCostData;

        InvoiceLineItemComponentCostDataCase(InvoiceLineItemComponentCostData invoiceLineItemComponentCostData) {
            this.invoiceLineItemComponentCostData = invoiceLineItemComponentCostData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.invoiceLineItemComponentCostData(this.invoiceLineItemComponentCostData);
        }

        @JsonCreator
        private InvoiceLineItemComponentCostDataCase(JsonNode jsonNode) throws IOException {
            this.invoiceLineItemComponentCostData = ApiHelper.deserialize(jsonNode,
                InvoiceLineItemComponentCostData.class);
        }

        @Override
        public String toString() {
            return invoiceLineItemComponentCostData.toString();
        }
    }

    /**
     * This is a custom deserializer class for InvoiceLineItemComponentCostData2.
     */
    protected static class InvoiceLineItemComponentCostData2Deserializer
            extends JsonDeserializer<InvoiceLineItemComponentCostData2> {

        @Override
        public InvoiceLineItemComponentCostData2 deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(
                    InvoiceLineItemComponentCostDataCase.class), true);
        }
    }

}
