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
import com.maxio.advancedbilling.models.ExtendedIntervalUnit;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = ProductExpirationIntervalUnit.ProductExpirationIntervalUnitDeserializer.class)
public abstract class ProductExpirationIntervalUnit {
    
    /**
     * This is Extended Interval Unit case.
     * @param extendedIntervalUnit ExtendedIntervalUnit value for extendedIntervalUnit.
     * @return The ExtendedIntervalUnitCase object.
     */
    public static ProductExpirationIntervalUnit fromExtendedIntervalUnit(
            ExtendedIntervalUnit extendedIntervalUnit) {
        return extendedIntervalUnit == null ? null : new ExtendedIntervalUnitCase(extendedIntervalUnit);
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
        R extendedIntervalUnit(ExtendedIntervalUnit extendedIntervalUnit);
    }

    /**
     * This is a implementation class for ExtendedIntervalUnitCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ExtendedIntervalUnit")
    private static class ExtendedIntervalUnitCase extends ProductExpirationIntervalUnit {

        @JsonValue
        private ExtendedIntervalUnit extendedIntervalUnit;

        ExtendedIntervalUnitCase(ExtendedIntervalUnit extendedIntervalUnit) {
            this.extendedIntervalUnit = extendedIntervalUnit;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.extendedIntervalUnit(this.extendedIntervalUnit);
        }

        @JsonCreator
        private ExtendedIntervalUnitCase(JsonNode jsonNode) throws IOException {
            this.extendedIntervalUnit = 
                ExtendedIntervalUnit.fromString(ApiHelper.deserialize(jsonNode, String.class));
            if (this.extendedIntervalUnit == null) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return extendedIntervalUnit.toString();
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
            return ApiHelper.deserialize(node, Arrays.asList(ExtendedIntervalUnitCase.class), true);
        }
    }

}
