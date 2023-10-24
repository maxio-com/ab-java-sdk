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
@JsonDeserialize(using = SegmentSegmentProperty4Value.SegmentSegmentProperty4ValueDeserializer.class)
public abstract class SegmentSegmentProperty4Value {
    
    /**
     * This is String case.
     * @param mString String value for mString.
     * @return The MStringCase object.
     */
    public static SegmentSegmentProperty4Value fromMString(String mString) {
        return mString == null ? null : new MStringCase(mString);
    }

    /**
     * This is Precision case.
     * @param precision double value for precision.
     * @return The PrecisionCase object.
     */
    public static SegmentSegmentProperty4Value fromPrecision(double precision) {
        return new PrecisionCase(precision);
    }

    /**
     * This is Number case.
     * @param number int value for number.
     * @return The NumberCase object.
     */
    public static SegmentSegmentProperty4Value fromNumber(int number) {
        return new NumberCase(number);
    }

    /**
     * This is Boolean case.
     * @param mBoolean boolean value for mBoolean.
     * @return The MBooleanCase object.
     */
    public static SegmentSegmentProperty4Value fromMBoolean(boolean mBoolean) {
        return new MBooleanCase(mBoolean);
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

        R precision(double precision);

        R number(int number);

        R mBoolean(boolean mBoolean);
    }

    /**
     * This is a implementation class for MStringCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorStringCase
    @TypeCombinatorCase(type = "String")
    private static class MStringCase extends SegmentSegmentProperty4Value {

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
     * This is a implementation class for PrecisionCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "double")
    private static class PrecisionCase extends SegmentSegmentProperty4Value {

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
     * This is a implementation class for NumberCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "int")
    private static class NumberCase extends SegmentSegmentProperty4Value {

        @JsonValue
        private int number;

        NumberCase(int number) {
            this.number = number;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.number(this.number);
        }

        @JsonCreator
        private NumberCase(JsonNode jsonNode) throws IOException {
            if (jsonNode.isInt()) {
                this.number = ApiHelper.deserialize(jsonNode, Integer.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return String.valueOf(number);
        }
    }

    /**
     * This is a implementation class for MBooleanCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "boolean")
    private static class MBooleanCase extends SegmentSegmentProperty4Value {

        @JsonValue
        private boolean mBoolean;

        MBooleanCase(boolean mBoolean) {
            this.mBoolean = mBoolean;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.mBoolean(this.mBoolean);
        }

        @JsonCreator
        private MBooleanCase(JsonNode jsonNode) throws IOException {
            if (jsonNode.isBoolean()) {
                this.mBoolean = ApiHelper.deserialize(jsonNode, Boolean.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return String.valueOf(mBoolean);
        }
    }

    /**
     * This is a custom deserializer class for SegmentSegmentProperty4Value.
     */
    protected static class SegmentSegmentProperty4ValueDeserializer
            extends JsonDeserializer<SegmentSegmentProperty4Value> {

        @Override
        public SegmentSegmentProperty4Value deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(MStringCase.class, PrecisionCase.class,
                    NumberCase.class, MBooleanCase.class), true);
        }
    }

}
