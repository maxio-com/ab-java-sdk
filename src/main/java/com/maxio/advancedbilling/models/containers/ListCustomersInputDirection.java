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
import com.maxio.advancedbilling.models.SortingDirection;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = ListCustomersInputDirection.ListCustomersInputDirectionDeserializer.class)
public abstract class ListCustomersInputDirection {
    
    /**
     * This is Sorting direction case.
     * @param sortingDirection SortingDirection value for sortingDirection.
     * @return The SortingDirectionCase object.
     */
    public static ListCustomersInputDirection fromSortingDirection(
            SortingDirection sortingDirection) {
        return sortingDirection == null ? null : new SortingDirectionCase(sortingDirection);
    }

    /**
     * Method to match from the provided one-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The one-of type cases callback.
     * @return The one-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * Method to get stored value.
     * @return The stored value object.
     */
    public abstract Object value();

    /**
     * This is interface for one-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R sortingDirection(SortingDirection sortingDirection);
    }

    /**
     * This is a implementation class for SortingDirectionCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SortingDirection")
    private static class SortingDirectionCase extends ListCustomersInputDirection {

        @JsonValue
        private SortingDirection sortingDirection;

        SortingDirectionCase(SortingDirection sortingDirection) {
            this.sortingDirection = sortingDirection;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.sortingDirection(this.sortingDirection);
        }

        @Override
        public Object value() {
            return sortingDirection;
        }

        @JsonCreator
        private SortingDirectionCase(JsonNode jsonNode) throws IOException {
            this.sortingDirection = 
                SortingDirection.fromString(ApiHelper.deserialize(jsonNode, String.class));
            if (this.sortingDirection == null) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return sortingDirection.toString();
        }
    }

    /**
     * This is a custom deserializer class for ListCustomersInputDirection.
     */
    protected static class ListCustomersInputDirectionDeserializer
            extends JsonDeserializer<ListCustomersInputDirection> {

        @Override
        public ListCustomersInputDirection deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(SortingDirectionCase.class), true);
        }
    }

}
