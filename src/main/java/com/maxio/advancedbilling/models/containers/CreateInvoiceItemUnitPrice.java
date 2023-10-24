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
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorStringCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = CreateInvoiceItemUnitPrice.CreateInvoiceItemUnitPriceDeserializer.class)
public abstract class CreateInvoiceItemUnitPrice {
    
    /**
     * This is Precision case.
     * @param precision double value for precision.
     * @return The PrecisionCase object.
     */
    public static CreateInvoiceItemUnitPrice fromPrecision(double precision) {
        return new PrecisionCase(precision);
    }

    /**
     * This is String case.
     * @param mString String value for mString.
     * @return The MStringCase object.
     */
    public static CreateInvoiceItemUnitPrice fromMString(String mString) {
        return mString == null ? null : new MStringCase(mString);
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
        R precision(double precision);

        R mString(String mString);
    }

    /**
     * This is a implementation class for PrecisionCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "double")
    private static class PrecisionCase extends CreateInvoiceItemUnitPrice {

        @JsonValue
        private double precision;

        PrecisionCase(double precision) {
            this.precision = precision;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.precision(this.precision);
        }

        @JsonCreator
        private PrecisionCase(JsonNode jsonNode) throws IOException {
            if (jsonNode.isDouble()) {
                this.precision = ApiHelper.deserialize(jsonNode, Double.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return String.valueOf(precision);
        }
    }

    /**
     * This is a implementation class for MStringCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorStringCase
    @TypeCombinatorCase(type = "String")
    private static class MStringCase extends CreateInvoiceItemUnitPrice {

        @JsonValue
        private String mString;

        MStringCase(String mString) {
            this.mString = mString;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.mString(this.mString);
        }

        @JsonCreator
        private MStringCase(JsonNode jsonNode) throws IOException {
            if (jsonNode.isTextual()) {
                this.mString = ApiHelper.deserialize(jsonNode, String.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return mString.toString();
        }
    }

    /**
     * This is a custom deserializer class for CreateInvoiceItemUnitPrice.
     */
    protected static class CreateInvoiceItemUnitPriceDeserializer
            extends JsonDeserializer<CreateInvoiceItemUnitPrice> {

        @Override
        public CreateInvoiceItemUnitPrice deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(PrecisionCase.class,
                    MStringCase.class), true);
        }
    }

}
