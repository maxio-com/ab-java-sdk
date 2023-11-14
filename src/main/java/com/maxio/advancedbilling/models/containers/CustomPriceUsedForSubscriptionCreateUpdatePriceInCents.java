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
@JsonDeserialize(using = CustomPriceUsedForSubscriptionCreateUpdatePriceInCents.CustomPriceUsedForSubscriptionCreateUpdatePriceInCentsDeserializer.class)
public abstract class CustomPriceUsedForSubscriptionCreateUpdatePriceInCents {
    
    /**
     * This is String case.
     * @param mString String value for mString.
     * @return The MStringCase object.
     */
    public static CustomPriceUsedForSubscriptionCreateUpdatePriceInCents fromMString(
            String mString) {
        return mString == null ? null : new MStringCase(mString);
    }

    /**
     * This is Long case.
     * @param mLong long value for mLong.
     * @return The MLongCase object.
     */
    public static CustomPriceUsedForSubscriptionCreateUpdatePriceInCents fromMLong(long mLong) {
        return new MLongCase(mLong);
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
        R mString(String mString);

        R mLong(long mLong);
    }

    /**
     * This is a implementation class for MStringCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorStringCase
    @TypeCombinatorCase(type = "String")
    private static class MStringCase extends CustomPriceUsedForSubscriptionCreateUpdatePriceInCents {

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
     * This is a implementation class for MLongCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "long")
    private static class MLongCase extends CustomPriceUsedForSubscriptionCreateUpdatePriceInCents {

        @JsonValue
        private long mLong;

        MLongCase(long mLong) {
            this.mLong = mLong;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.mLong(this.mLong);
        }

        @JsonCreator
        private MLongCase(JsonNode jsonNode) throws IOException {
            if (jsonNode.isLong()) {
                this.mLong = ApiHelper.deserialize(jsonNode, Long.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return String.valueOf(mLong);
        }
    }

    /**
     * This is a custom deserializer class for CustomPriceUsedForSubscriptionCreateUpdatePriceInCents.
     */
    protected static class CustomPriceUsedForSubscriptionCreateUpdatePriceInCentsDeserializer
            extends JsonDeserializer<CustomPriceUsedForSubscriptionCreateUpdatePriceInCents> {

        @Override
        public CustomPriceUsedForSubscriptionCreateUpdatePriceInCents deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(MStringCase.class,
                    MLongCase.class), true);
        }
    }

}
