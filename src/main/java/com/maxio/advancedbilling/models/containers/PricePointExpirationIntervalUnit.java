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
import com.maxio.advancedbilling.models.IntervalUnit;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = PricePointExpirationIntervalUnit.PricePointExpirationIntervalUnitDeserializer.class)
public abstract class PricePointExpirationIntervalUnit {
    
    /**
     * This is Interval Unit case.
     * @param intervalUnit IntervalUnit value for intervalUnit.
     * @return The IntervalUnitCase object.
     */
    public static PricePointExpirationIntervalUnit fromIntervalUnit(IntervalUnit intervalUnit) {
        return intervalUnit == null ? null : new IntervalUnitCase(intervalUnit);
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
        R intervalUnit(IntervalUnit intervalUnit);
    }

    /**
     * This is a implementation class for IntervalUnitCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "IntervalUnit")
    private static class IntervalUnitCase extends PricePointExpirationIntervalUnit {

        @JsonValue
        private IntervalUnit intervalUnit;

        IntervalUnitCase(IntervalUnit intervalUnit) {
            this.intervalUnit = intervalUnit;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.intervalUnit(this.intervalUnit);
        }

        @JsonCreator
        private IntervalUnitCase(JsonNode jsonNode) throws IOException {
            this.intervalUnit = 
                IntervalUnit.fromString(ApiHelper.deserialize(jsonNode, String.class));
            if (this.intervalUnit == null) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return intervalUnit.toString();
        }
    }

    /**
     * This is a custom deserializer class for PricePointExpirationIntervalUnit.
     */
    protected static class PricePointExpirationIntervalUnitDeserializer
            extends JsonDeserializer<PricePointExpirationIntervalUnit> {

        @Override
        public PricePointExpirationIntervalUnit deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(IntervalUnitCase.class), true);
        }
    }

}
