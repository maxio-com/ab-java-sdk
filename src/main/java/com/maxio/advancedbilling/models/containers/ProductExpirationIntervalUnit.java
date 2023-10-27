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
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = ProductExpirationIntervalUnit.ProductExpirationIntervalUnitDeserializer.class)
public abstract class ProductExpirationIntervalUnit {
    
    /**
     * This is ProductExpirationIntervalUnitCase0 case.
     * @param productExpirationIntervalUnitCase0 ProductExpirationIntervalUnitCase0 value for productExpirationIntervalUnitCase0.
     * @return The Case0 object.
     */
    public static ProductExpirationIntervalUnit fromProductExpirationIntervalUnitCase0(
            ProductExpirationIntervalUnitCase0 productExpirationIntervalUnitCase0) {
        return productExpirationIntervalUnitCase0 == null ? null : new Case0(productExpirationIntervalUnitCase0);
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
        R productExpirationIntervalUnitCase0(ProductExpirationIntervalUnitCase0 productExpirationIntervalUnitCase0);
    }

    /**
     * This is a implementation class for Case0Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ProductExpirationIntervalUnitCase0")
    private static class Case0 extends ProductExpirationIntervalUnit {

        @JsonValue
        private ProductExpirationIntervalUnitCase0 case0;

        Case0(ProductExpirationIntervalUnitCase0 case0) {
            this.case0 = case0;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.productExpirationIntervalUnitCase0(this.case0);
        }

        @JsonCreator
        private Case0(JsonNode jsonNode) throws IOException {
            this.case0 = ApiHelper.deserialize(jsonNode,
                ProductExpirationIntervalUnitCase0.class);
            if (this.case0 == null) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return case0.toString();
        }
    }

    /**
     * This is a custom deserializer class for ProductExpirationIntervalUnit.
     */
    protected static class ProductExpirationIntervalUnitDeserializer
            extends JsonDeserializer<ProductExpirationIntervalUnit> {

        @Override
        public ProductExpirationIntervalUnit deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(Case0.class), true);
        }
    }

}
