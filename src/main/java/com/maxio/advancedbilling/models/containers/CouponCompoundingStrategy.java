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
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = CouponCompoundingStrategy.CouponCompoundingStrategyDeserializer.class)
public abstract class CouponCompoundingStrategy {
    
    /**
     * This is CouponCompoundingStrategyCase0 case.
     * @param couponCompoundingStrategyCase0 CouponCompoundingStrategyCase0 value for couponCompoundingStrategyCase0.
     * @return The Case0 object.
     */
    public static CouponCompoundingStrategy fromCouponCompoundingStrategyCase0(
            CouponCompoundingStrategyCase0 couponCompoundingStrategyCase0) {
        return couponCompoundingStrategyCase0 == null ? null : new Case0(couponCompoundingStrategyCase0);
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
        R couponCompoundingStrategyCase0(CouponCompoundingStrategyCase0 couponCompoundingStrategyCase0);
    }

    /**
     * This is a implementation class for Case0Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CouponCompoundingStrategyCase0")
    private static class Case0 extends CouponCompoundingStrategy {

        @JsonValue
        private CouponCompoundingStrategyCase0 case0;

        Case0(CouponCompoundingStrategyCase0 case0) {
            this.case0 = case0;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.couponCompoundingStrategyCase0(this.case0);
        }

        @JsonCreator
        private Case0(JsonNode jsonNode) throws IOException {
            this.case0 = ApiHelper.deserialize(jsonNode,
                CouponCompoundingStrategyCase0.class);
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
     * This is a custom deserializer class for CouponCompoundingStrategy.
     */
    protected static class CouponCompoundingStrategyDeserializer
            extends JsonDeserializer<CouponCompoundingStrategy> {

        @Override
        public CouponCompoundingStrategy deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(Case0.class), false);
        }
    }

}
