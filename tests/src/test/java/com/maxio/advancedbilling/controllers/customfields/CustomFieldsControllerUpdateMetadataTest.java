package com.maxio.advancedbilling.controllers.customfields;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.CustomFieldsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateMetadata;
import com.maxio.advancedbilling.models.CreateMetadataRequest;
import com.maxio.advancedbilling.models.CreateMetafield;
import com.maxio.advancedbilling.models.CreateMetafieldsRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ListMetafieldsInput;
import com.maxio.advancedbilling.models.Metadata;
import com.maxio.advancedbilling.models.Metafield;
import com.maxio.advancedbilling.models.MetafieldInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ResourceType;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.UpdateMetadata;
import com.maxio.advancedbilling.models.UpdateMetadataRequest;
import com.maxio.advancedbilling.models.containers.CreateMetafieldsRequestMetafields;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class CustomFieldsControllerUpdateMetadataTest {

    private static final CustomFieldsController CUSTOM_FIELDS_CONTROLLER =
            TestClient.createClient().getCustomFieldsController();
    private static Customer customer;
    private static Customer customer2;

    private static Subscription subscription;
    private static Subscription subscription2;


    @BeforeAll
    static void setup() throws IOException, ApiException {
        TestSetup TEST_SETUP = new TestSetup();
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        Product product = TEST_SETUP.createProduct(productFamily);
        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, product);
        customer2 = TEST_SETUP.createCustomer();
        subscription2 = TEST_SETUP.createSubscription(customer2, product);
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        TestTeardown testTeardown = new TestTeardown();
        testTeardown.deleteMetafields();
        testTeardown.deleteCustomer(customer);
        testTeardown.deleteCustomer(customer2);
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldUpdateTextMetadata(ResourceType resourceType) throws IOException, ApiException {
        // given
        String textMetafieldName = "text-" + randomNumeric(7);
        int resourceId = getIdForResourceType(resourceType);

        CreateMetadataRequest createMetadataRequest =
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata(textMetafieldName, "text")
                        )
                );

        UpdateMetadataRequest updateMetadataRequest =
                new UpdateMetadataRequest(
                        new UpdateMetadata(null, textMetafieldName, "updated-text")
                );

        // when
        List<Metadata> metadata = CUSTOM_FIELDS_CONTROLLER.createMetadata(resourceType, resourceId, createMetadataRequest);
        List<Metadata> updatedMetadata = CUSTOM_FIELDS_CONTROLLER.updateMetadata(resourceType, resourceId, updateMetadataRequest);

        // then
        assertThat(updatedMetadata.size()).isEqualTo(1);

        assertThat(updatedMetadata.get(0).getId()).isNotNull();
        assertThat(updatedMetadata.get(0).getId()).isEqualTo(metadata.get(0).getId());
        assertThat(updatedMetadata.get(0).getName()).isEqualTo(textMetafieldName);
        assertThat(updatedMetadata.get(0).getValue()).isEqualTo("updated-text");
        assertThat(updatedMetadata.get(0).getResourceId()).isEqualTo(resourceId);
        assertThat(updatedMetadata.get(0).getMetafieldId()).isNotNull();
        assertThat(updatedMetadata.get(0).getMetafieldId()).isEqualTo(metadata.get(0).getMetafieldId());
        assertThat(updatedMetadata.get(0).getDeletedAt()).isNull();
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldUpdateDropdownMetadata(ResourceType resourceType) throws IOException, ApiException {
        // given
        String dropdownMetafieldName = "dropdown-" + randomNumeric(7);
        List<String> dropdownEnum = List.of("dropdown-option-1", "dropdown-option-2");
        int resourceId = getIdForResourceType(resourceType);

        CreateMetafieldsRequest createMetafieldsRequest =
                new CreateMetafieldsRequest(
                        CreateMetafieldsRequestMetafields.fromCreateMetafield(
                                new CreateMetafield.Builder()
                                        .name(dropdownMetafieldName)
                                        .inputType(MetafieldInput.DROPDOWN)
                                        .mEnum(dropdownEnum)
                                        .build()
                        ));

        CreateMetadataRequest createMetadataRequest =
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata(dropdownMetafieldName, "dropdown-option-1")

                        )
                );

        UpdateMetadataRequest updateMetadataRequest =
                new UpdateMetadataRequest(
                        new UpdateMetadata(null, dropdownMetafieldName, "dropdown-option-2")
                );

        // when
        List<Metafield> metafields = CUSTOM_FIELDS_CONTROLLER.createMetafields(resourceType, createMetafieldsRequest);
        List<Metadata> metadata = CUSTOM_FIELDS_CONTROLLER.createMetadata(resourceType, resourceId, createMetadataRequest);
        List<Metadata> updatedMetadata = CUSTOM_FIELDS_CONTROLLER.updateMetadata(resourceType, resourceId, updateMetadataRequest);

        // then
        assertThat(updatedMetadata.size()).isEqualTo(1);

        assertThat(updatedMetadata.get(0).getId()).isNotNull();
        assertThat(updatedMetadata.get(0).getId()).isEqualTo(metadata.get(0).getId());
        assertThat(updatedMetadata.get(0).getName()).isEqualTo(dropdownMetafieldName);
        assertThat(updatedMetadata.get(0).getValue()).isEqualTo("dropdown-option-2");
        assertThat(updatedMetadata.get(0).getResourceId()).isEqualTo(resourceId);
        assertThat(updatedMetadata.get(0).getMetafieldId()).isNotNull();
        assertThat(updatedMetadata.get(0).getMetafieldId()).isEqualTo(metafields.get(0).getId());
        assertThat(updatedMetadata.get(0).getDeletedAt()).isNull();
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldUpdateMetadataName(ResourceType resourceType) throws IOException, ApiException {
        // given
        String textMetafieldName = "text-" + randomNumeric(7);
        String updatedMetafieldName = "updated-text-" + randomNumeric(7);
        int resourceId = getIdForResourceType(resourceType);
        int resourceId2 = getSecondIdForResourceType(resourceType);

        CreateMetadataRequest createMetadataRequest =
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata(textMetafieldName, "text")
                        )
                );

        UpdateMetadataRequest updateMetadataRequest =
                new UpdateMetadataRequest(
                        new UpdateMetadata(textMetafieldName, updatedMetafieldName, "updated-text")
                );

        // when
        List<Metadata> metadata = CUSTOM_FIELDS_CONTROLLER.createMetadata(resourceType, resourceId, createMetadataRequest);
         CUSTOM_FIELDS_CONTROLLER.createMetadata(resourceType, resourceId2, createMetadataRequest);
        List<Metadata> updatedMetadata = CUSTOM_FIELDS_CONTROLLER.updateMetadata(resourceType, resourceId, updateMetadataRequest);

        List<Metafield> metafieldsWithOldName = CUSTOM_FIELDS_CONTROLLER.listMetafields(
                new ListMetafieldsInput.Builder()
                        .resourceType(resourceType)
                        .name(textMetafieldName)
                        .build()
        ).getMetafields();
        List<Metafield> metafieldsWithNewName = CUSTOM_FIELDS_CONTROLLER.listMetafields(
                new ListMetafieldsInput.Builder()
                        .resourceType(resourceType)
                        .name(updatedMetafieldName)
                        .build()
        ).getMetafields();

        // then
        assertThat(updatedMetadata.size()).isEqualTo(1);

        assertThat(updatedMetadata.get(0).getId()).isNotNull();
        assertThat(updatedMetadata.get(0).getId()).isEqualTo(metadata.get(0).getId());
        assertThat(updatedMetadata.get(0).getName()).isEqualTo(updatedMetafieldName);
        assertThat(updatedMetadata.get(0).getValue()).isEqualTo("updated-text");
        assertThat(updatedMetadata.get(0).getResourceId()).isEqualTo(resourceId);
        assertThat(updatedMetadata.get(0).getMetafieldId()).isNotNull();
        assertThat(updatedMetadata.get(0).getMetafieldId()).isEqualTo(metadata.get(0).getMetafieldId());
        assertThat(updatedMetadata.get(0).getDeletedAt()).isNull();

        assertThat(metafieldsWithNewName.size()).isEqualTo(1);
        assertThat(metafieldsWithNewName.get(0).getDataCount()).isEqualTo(2);
        assertThat(metafieldsWithOldName.size()).isEqualTo(0);
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldNotUpdateMetadataWhenValueNotInEnum(ResourceType resourceType) throws IOException, ApiException {
        // given
        List<String> radioEnum = List.of("radio-option-1", "radio-option-2");
        String radioMetafieldName = "radio-" + randomNumeric(7);
        CreateMetafieldsRequest createMetafieldsRequest =
                new CreateMetafieldsRequest(
                        CreateMetafieldsRequestMetafields.fromCreateMetafield(
                                new CreateMetafield.Builder()
                                        .name(radioMetafieldName)
                                        .inputType(MetafieldInput.RADIO)
                                        .mEnum(radioEnum)
                                        .build()
                        ));
        CreateMetadataRequest createMetadataRequest =
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata(radioMetafieldName, "radio-option-1")
                        )
                );
        UpdateMetadataRequest updateMetadataRequest = new UpdateMetadataRequest(
                new UpdateMetadata(null, radioMetafieldName, "abc")
        );

        // when
        CUSTOM_FIELDS_CONTROLLER.createMetafields(resourceType, createMetafieldsRequest);
        List<Metadata> metadata = CUSTOM_FIELDS_CONTROLLER
                .createMetadata(resourceType, getIdForResourceType(resourceType), createMetadataRequest);
        List<Metadata> updatedMetadata = CUSTOM_FIELDS_CONTROLLER.updateMetadata(resourceType, getIdForResourceType(resourceType),
                updateMetadataRequest);

        // then
        assertThat(updatedMetadata.size()).isEqualTo(1);
        assertThat(updatedMetadata.get(0).getValue()).isNotEqualTo("abc");
        assertThat(updatedMetadata.get(0)).usingRecursiveComparison().isEqualTo(metadata.get(0));
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldReturn422WhenUpdatingMetadataNameToExistingName(ResourceType resourceType) throws IOException, ApiException {
        // given
        String name1 = "text-name-" + randomNumeric(5);
        String name2 = "text-name2-" + randomNumeric(5);
        CreateMetafieldsRequest createMetafieldsRequest =
                new CreateMetafieldsRequest(
                        CreateMetafieldsRequestMetafields.fromListOfCreateMetafield(
                                List.of(
                                        new CreateMetafield.Builder()
                                                .name(name1)
                                                .build(),
                                        new CreateMetafield.Builder()
                                                .name(name2)
                                                .build()
                                )
                        ));
        CreateMetadataRequest createMetadataRequest = new CreateMetadataRequest(
                List.of(new CreateMetadata(name1, "abc"))
        );
        UpdateMetadataRequest updateMetadataRequest = new UpdateMetadataRequest(
                new UpdateMetadata(name1, name2, "abc2")
        );

        // when-then
        CUSTOM_FIELDS_CONTROLLER.createMetafields(resourceType, createMetafieldsRequest);
        CUSTOM_FIELDS_CONTROLLER.createMetadata(resourceType, getIdForResourceType(resourceType), createMetadataRequest);

        // then
        CommonAssertions.assertThatSingleErrorResponse(
                        () -> CUSTOM_FIELDS_CONTROLLER
                                .updateMetadata(resourceType, getIdForResourceType(resourceType), updateMetadataRequest))
                .isUnprocessableEntity()
                .hasErrorMessage("Metafield name must be unique for the Attachment Type");
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenUpdatingMetadataWithInvalidData")
    void shouldReturn422WhenUpdatingMetadataWithInvalidData(UpdateMetadataRequest request,
                                                            String expectedError) {
        // when - then
        CommonAssertions.assertThatSingleErrorResponse(
                        () -> CUSTOM_FIELDS_CONTROLLER
                                .updateMetadata(ResourceType.SUBSCRIPTIONS, subscription.getId(), request))
                .isUnprocessableEntity()
                .hasErrorMessage(expectedError);
    }

    private static Stream<Arguments> argsForShouldReturn422WhenUpdatingMetadataWithInvalidData() {
        return Stream.of(
                Arguments.of(
                        null, "The root key 'metadata' is required"
                ),
                Arguments.of(
                        new UpdateMetadataRequest(new UpdateMetadata()),
                        "'name' must be present to create or update metafields"
                ),
                Arguments.of(
                        new UpdateMetadataRequest(new UpdateMetadata(null, "", null)),
                        "'name' must be present to create or update metafields"
                )
        );
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldNotUpdateMetadataForNonExistentResource(ResourceType resourceType) {
        assertNotFound(() -> CUSTOM_FIELDS_CONTROLLER.updateMetadata(resourceType, 123, null));
    }

    @Test
    void shouldNotUpdateMetadataWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getCustomFieldsController()
                .updateMetadata(ResourceType.SUBSCRIPTIONS, 123, null));
    }

    private int getIdForResourceType(ResourceType resourceType) {
        switch (resourceType) {
            case SUBSCRIPTIONS -> {
                return subscription.getId();
            }
            case CUSTOMERS -> {
                return customer.getId();
            }
        }
        throw new IllegalStateException();
    }

    private int getSecondIdForResourceType(ResourceType resourceType) {
        switch (resourceType) {
            case SUBSCRIPTIONS -> {
                return subscription2.getId();
            }
            case CUSTOMERS -> {
                return customer2.getId();
            }
        }
        throw new IllegalStateException();
    }

}
