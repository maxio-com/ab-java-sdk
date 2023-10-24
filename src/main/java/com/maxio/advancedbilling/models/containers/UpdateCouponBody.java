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
import com.maxio.advancedbilling.models.CreateOrUpdateCoupon;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = UpdateCouponBody.UpdateCouponBodyDeserializer.class)
public abstract class UpdateCouponBody {
    
    /**
     * This is Create or Update Coupon case.
     * @param createOrUpdateCoupon CreateOrUpdateCoupon value for createOrUpdateCoupon.
     * @return The CreateOrUpdateCouponCase object.
     */
    public static UpdateCouponBody fromCreateOrUpdateCoupon(
            CreateOrUpdateCoupon createOrUpdateCoupon) {
        return createOrUpdateCoupon == null ? null : new CreateOrUpdateCouponCase(createOrUpdateCoupon);
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
        R createOrUpdateCoupon(CreateOrUpdateCoupon createOrUpdateCoupon);
    }

    /**
     * This is a implementation class for CreateOrUpdateCouponCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CreateOrUpdateCoupon")
    private static class CreateOrUpdateCouponCase extends UpdateCouponBody {

        @JsonValue
        private CreateOrUpdateCoupon createOrUpdateCoupon;

        CreateOrUpdateCouponCase(CreateOrUpdateCoupon createOrUpdateCoupon) {
            this.createOrUpdateCoupon = createOrUpdateCoupon;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.createOrUpdateCoupon(this.createOrUpdateCoupon);
        }

        @JsonCreator
        private CreateOrUpdateCouponCase(JsonNode jsonNode) throws IOException {
            this.createOrUpdateCoupon = ApiHelper.deserialize(jsonNode,
                CreateOrUpdateCoupon.class);
        }

        @Override
        public String toString() {
            return createOrUpdateCoupon.toString();
        }
    }

    /**
     * This is a custom deserializer class for UpdateCouponBody.
     */
    protected static class UpdateCouponBodyDeserializer
            extends JsonDeserializer<UpdateCouponBody> {

        @Override
        public UpdateCouponBody deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(CreateOrUpdateCouponCase.class), true);
        }
    }

}
