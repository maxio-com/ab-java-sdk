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
import com.maxio.advancedbilling.models.SnapDay;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = UpdateSubscriptionSnapDay.UpdateSubscriptionSnapDayDeserializer.class)
public abstract class UpdateSubscriptionSnapDay {
    
    /**
     * This is SnapDay case.
     * @param snapDay SnapDay value for snapDay.
     * @return The SnapDayCase object.
     */
    public static UpdateSubscriptionSnapDay fromSnapDay(SnapDay snapDay) {
        return snapDay == null ? null : new SnapDayCase(snapDay);
    }

    /**
     * This is Number case.
     * @param number int value for number.
     * @return The NumberCase object.
     */
    public static UpdateSubscriptionSnapDay fromNumber(int number) {
        return new NumberCase(number);
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
        R snapDay(SnapDay snapDay);

        R number(int number);
    }

    /**
     * This is a implementation class for SnapDayCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SnapDay")
    private static class SnapDayCase extends UpdateSubscriptionSnapDay {

        @JsonValue
        private SnapDay snapDay;

        SnapDayCase(SnapDay snapDay) {
            this.snapDay = snapDay;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.snapDay(this.snapDay);
        }

        @JsonCreator
        private SnapDayCase(JsonNode jsonNode) throws IOException {
            this.snapDay = 
                SnapDay.fromString(ApiHelper.deserialize(jsonNode, String.class));
            if (this.snapDay == null) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return snapDay.toString();
        }
    }

    /**
     * This is a implementation class for NumberCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "int")
    private static class NumberCase extends UpdateSubscriptionSnapDay {

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
     * This is a custom deserializer class for UpdateSubscriptionSnapDay.
     */
    protected static class UpdateSubscriptionSnapDayDeserializer
            extends JsonDeserializer<UpdateSubscriptionSnapDay> {

        @Override
        public UpdateSubscriptionSnapDay deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(SnapDayCase.class,
                    NumberCase.class), true);
        }
    }

}
