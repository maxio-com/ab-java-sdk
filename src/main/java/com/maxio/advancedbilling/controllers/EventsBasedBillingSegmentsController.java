/*
 * AdvancedBilling
 *
 * This file was automatically generated for Maxio by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.maxio.advancedbilling.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.maxio.advancedbilling.ApiHelper;
import com.maxio.advancedbilling.Server;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.EventBasedBillingListSegmentsErrorsException;
import com.maxio.advancedbilling.exceptions.EventBasedBillingSegmentErrorsException;
import com.maxio.advancedbilling.exceptions.EventBasedBillingSegmentException;
import com.maxio.advancedbilling.http.request.HttpMethod;
import com.maxio.advancedbilling.models.BulkCreateSegments;
import com.maxio.advancedbilling.models.BulkUpdateSegments;
import com.maxio.advancedbilling.models.CreateSegmentRequest;
import com.maxio.advancedbilling.models.ListSegmentsForPricePointInput;
import com.maxio.advancedbilling.models.ListSegmentsResponse;
import com.maxio.advancedbilling.models.SegmentResponse;
import com.maxio.advancedbilling.models.UpdateSegmentRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ArraySerializationFormat;
import java.io.IOException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class EventsBasedBillingSegmentsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public EventsBasedBillingSegmentsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This endpoint creates a new Segment for a Component with segmented Metric. It allows you to
     * specify properties to bill upon and prices for each Segment. You can only pass as many
     * "property_values" as the related Metric has segmenting properties defined. You may specify
     * component and/or price point by using either the numeric ID or the `handle:gold` syntax.
     * @param  componentId  Required parameter: ID or Handle for the Component
     * @param  pricePointId  Required parameter: ID or Handle for the Price Point belonging to the
     *         Component
     * @param  body  Optional parameter: Example:
     * @return    Returns the SegmentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SegmentResponse createSegment(
            final String componentId,
            final String pricePointId,
            final CreateSegmentRequest body) throws ApiException, IOException {
        return prepareCreateSegmentRequest(componentId, pricePointId, body).execute();
    }

    /**
     * Builds the ApiCall object for createSegment.
     */
    private ApiCall<SegmentResponse, ApiException> prepareCreateSegmentRequest(
            final String componentId,
            final String pricePointId,
            final CreateSegmentRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<SegmentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points/{price_point_id}/segments.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SegmentResponse.class))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new EventBasedBillingSegmentErrorsException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint allows you to fetch Segments created for a given Price Point. They will be
     * returned in the order of creation. You can pass `page` and `per_page` parameters in order to
     * access all of the segments. By default it will return `30` records. You can set `per_page` to
     * `200` at most. You may specify component and/or price point by using either the numeric ID or
     * the `handle:gold` syntax.
     * @param  input  ListSegmentsForPricePointInput object containing request parameters
     * @return    Returns the ListSegmentsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListSegmentsResponse listSegmentsForPricePoint(
            final ListSegmentsForPricePointInput input) throws ApiException, IOException {
        return prepareListSegmentsForPricePointRequest(input).execute();
    }

    /**
     * Builds the ApiCall object for listSegmentsForPricePoint.
     */
    private ApiCall<ListSegmentsResponse, ApiException> prepareListSegmentsForPricePointRequest(
            final ListSegmentsForPricePointInput input) throws IOException {
        return new ApiCall.Builder<ListSegmentsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points/{price_point_id}/segments.json")
                        .queryParam(param -> param.key("page")
                                .value(input.getPage()).isRequired(false))
                        .queryParam(param -> param.key("per_page")
                                .value(input.getPerPage()).isRequired(false))
                        .queryParam(param -> param.key("filter[segment_property_1_value]")
                                .value(input.getFilterSegmentProperty1Value()).isRequired(false))
                        .queryParam(param -> param.key("filter[segment_property_2_value]")
                                .value(input.getFilterSegmentProperty2Value()).isRequired(false))
                        .queryParam(param -> param.key("filter[segment_property_3_value]")
                                .value(input.getFilterSegmentProperty3Value()).isRequired(false))
                        .queryParam(param -> param.key("filter[segment_property_4_value]")
                                .value(input.getFilterSegmentProperty4Value()).isRequired(false))
                        .templateParam(param -> param.key("component_id").value(input.getComponentId())
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(input.getPricePointId())
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListSegmentsResponse.class))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new EventBasedBillingListSegmentsErrorsException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint updates a single Segment for a Component with a segmented Metric. It allows you
     * to update the pricing for the segment. You may specify component and/or price point by using
     * either the numeric ID or the `handle:gold` syntax.
     * @param  componentId  Required parameter: ID or Handle of the Component
     * @param  pricePointId  Required parameter: ID or Handle of the Price Point belonging to the
     *         Component
     * @param  id  Required parameter: The ID of the Segment
     * @param  body  Optional parameter: Example:
     * @return    Returns the SegmentResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public SegmentResponse updateSegment(
            final String componentId,
            final String pricePointId,
            final double id,
            final UpdateSegmentRequest body) throws ApiException, IOException {
        return prepareUpdateSegmentRequest(componentId, pricePointId, id, body).execute();
    }

    /**
     * Builds the ApiCall object for updateSegment.
     */
    private ApiCall<SegmentResponse, ApiException> prepareUpdateSegmentRequest(
            final String componentId,
            final String pricePointId,
            final double id,
            final UpdateSegmentRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<SegmentResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points/{price_point_id}/segments/{id}.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, SegmentResponse.class))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new EventBasedBillingSegmentErrorsException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint allows you to delete a Segment with specified ID. You may specify component
     * and/or price point by using either the numeric ID or the `handle:gold` syntax.
     * @param  componentId  Required parameter: ID or Handle of the Component
     * @param  pricePointId  Required parameter: ID or Handle of the Price Point belonging to the
     *         Component
     * @param  id  Required parameter: The ID of the Segment
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deleteSegment(
            final String componentId,
            final String pricePointId,
            final double id) throws ApiException, IOException {
        prepareDeleteSegmentRequest(componentId, pricePointId, id).execute();
    }

    /**
     * Builds the ApiCall object for deleteSegment.
     */
    private ApiCall<Void, ApiException> prepareDeleteSegmentRequest(
            final String componentId,
            final String pricePointId,
            final double id) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points/{price_point_id}/segments/{id}.json")
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint allows you to create multiple segments in one request. The array of segments
     * can contain up to `2000` records. If any of the records contain an error the whole request
     * would fail and none of the requested segments get created. The error response contains a
     * message for only the one segment that failed validation, with the corresponding index in the
     * array. You may specify component and/or price point by using either the numeric ID or the
     * `handle:gold` syntax.
     * @param  componentId  Required parameter: ID or Handle for the Component
     * @param  pricePointId  Required parameter: ID or Handle for the Price Point belonging to the
     *         Component
     * @param  body  Optional parameter: Example:
     * @return    Returns the ListSegmentsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListSegmentsResponse createSegments(
            final String componentId,
            final String pricePointId,
            final BulkCreateSegments body) throws ApiException, IOException {
        return prepareCreateSegmentsRequest(componentId, pricePointId, body).execute();
    }

    /**
     * Builds the ApiCall object for createSegments.
     */
    private ApiCall<ListSegmentsResponse, ApiException> prepareCreateSegmentsRequest(
            final String componentId,
            final String pricePointId,
            final BulkCreateSegments body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ListSegmentsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points/{price_point_id}/segments/bulk.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListSegmentsResponse.class))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new EventBasedBillingSegmentException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }

    /**
     * This endpoint allows you to update multiple segments in one request. The array of segments
     * can contain up to `1000` records. If any of the records contain an error the whole request
     * would fail and none of the requested segments get updated. The error response contains a
     * message for only the one segment that failed validation, with the corresponding index in the
     * array. You may specify component and/or price point by using either the numeric ID or the
     * `handle:gold` syntax.
     * @param  componentId  Required parameter: ID or Handle for the Component
     * @param  pricePointId  Required parameter: ID or Handle for the Price Point belonging to the
     *         Component
     * @param  body  Optional parameter: Example:
     * @return    Returns the ListSegmentsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListSegmentsResponse updateSegments(
            final String componentId,
            final String pricePointId,
            final BulkUpdateSegments body) throws ApiException, IOException {
        return prepareUpdateSegmentsRequest(componentId, pricePointId, body).execute();
    }

    /**
     * Builds the ApiCall object for updateSegments.
     */
    private ApiCall<ListSegmentsResponse, ApiException> prepareUpdateSegmentsRequest(
            final String componentId,
            final String pricePointId,
            final BulkUpdateSegments body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ListSegmentsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/components/{component_id}/price_points/{price_point_id}/segments/bulk.json")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("component_id").value(componentId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("price_point_id").value(pricePointId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListSegmentsResponse.class))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("Unprocessable Entity (WebDAV)",
                                (reason, context) -> new EventBasedBillingSegmentException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .endpointConfiguration(param -> param
                                .arraySerializationFormat(ArraySerializationFormat.CSV))
                .build();
    }
}