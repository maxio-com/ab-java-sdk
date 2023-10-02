/*
 * MaxioAdvancedBillingFormerlyChargifyAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.chargify.subdomain.models.containers;

import com.chargify.subdomain.ApiHelper;
import com.chargify.subdomain.models.Price;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = OveragePricingPrices.OveragePricingPricesDeserializer.class)
public abstract class OveragePricingPrices {
    
    /**
     * This is List of Price case.
     * @param listOfPrice List of Price value for listOfPrice.
     * @return The ListOfPriceCase object.
     */
    public static OveragePricingPrices fromListOfPrice(List<Price> listOfPrice) {
        return listOfPrice == null ? null : new ListOfPriceCase(listOfPrice);
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
        R listOfPrice(List<Price> listOfPrice);
    }

    /**
     * This is a implementation class for ListOfPriceCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "List<Price>")
    private static class ListOfPriceCase extends OveragePricingPrices {

        @JsonValue
        private List<Price> listOfPrice;

        ListOfPriceCase(List<Price> listOfPrice) {
            this.listOfPrice = listOfPrice;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.listOfPrice(this.listOfPrice);
        }

        @JsonCreator
        private ListOfPriceCase(JsonNode jsonNode) throws IOException {
            this.listOfPrice = ApiHelper.deserializeArray(jsonNode,
                Price[].class);
        }

        @Override
        public String toString() {
            return listOfPrice.toString();
        }
    }

    /**
     * This is a custom deserializer class for OveragePricingPrices.
     */
    protected static class OveragePricingPricesDeserializer
            extends JsonDeserializer<OveragePricingPrices> {

        @Override
        public OveragePricingPrices deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(ListOfPriceCase.class), true);
        }
    }

}
