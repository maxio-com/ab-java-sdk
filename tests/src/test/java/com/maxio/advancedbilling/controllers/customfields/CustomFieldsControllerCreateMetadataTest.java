package com.maxio.advancedbilling.controllers.customfields;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.CustomFieldsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.SingleErrorResponseException;
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
import com.maxio.advancedbilling.models.containers.CreateMetafieldsRequestMetafields;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
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
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class CustomFieldsControllerCreateMetadataTest {

    protected static final CustomFieldsController CUSTOM_FIELDS_CONTROLLER =
            TestClient.createClient().getCustomFieldsController();
    private static Customer customer;
    private static Subscription subscription;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        TestSetup TEST_SETUP = new TestSetup();
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        Product product = TEST_SETUP.createProduct(productFamily);
        customer = TEST_SETUP.createCustomer();
        subscription = TEST_SETUP.createSubscription(customer, product);
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        TestTeardown testTeardown = new TestTeardown();
        testTeardown.deleteMetafields();
        testTeardown.deleteCustomer(customer);

    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldCreateMetadata(ResourceType resourceType) throws IOException, ApiException {
        // given
        String textMetafieldName = "text-" + randomNumeric(7);
        String radioMetafieldName = "radio-" + randomNumeric(7);
        List<String> radioEnum = List.of("radio-option-1", "radio-option-2");
        String dropdownMetafieldName = "dropdown-" + randomNumeric(7);
        List<String> dropdownEnum = List.of("dropdown-option-1", "dropdown-option-2");
        int resourceId = getIdForResourceType(resourceType);

        CreateMetafieldsRequest createMetafieldsRequest =
                new CreateMetafieldsRequest(
                        CreateMetafieldsRequestMetafields.fromListOfCreateMetafield(
                                List.of(
                                        new CreateMetafield.Builder()
                                                .name(textMetafieldName)
                                                .build(),
                                        new CreateMetafield.Builder()
                                                .name(radioMetafieldName)
                                                .inputType(MetafieldInput.RADIO)
                                                .mEnum(radioEnum)
                                                .build(),
                                        new CreateMetafield.Builder()
                                                .name(dropdownMetafieldName)
                                                .inputType(MetafieldInput.DROPDOWN)
                                                .mEnum(dropdownEnum)
                                                .build()
                                )
                        ));

        CreateMetadataRequest createMetadataRequest =
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata(textMetafieldName, "text"),
                                new CreateMetadata(radioMetafieldName, "radio-option-2"),
                                new CreateMetadata(dropdownMetafieldName, "dropdown-option-1")

                        )
                );
        // when
        List<Metafield> metafields = CUSTOM_FIELDS_CONTROLLER.createMetafields(resourceType, createMetafieldsRequest);
        List<Metadata> metadata = CUSTOM_FIELDS_CONTROLLER.createMetadata(resourceType, resourceId, createMetadataRequest);

        // then
        assertThat(metadata.size()).isEqualTo(3);

        assertThat(metadata.get(0).getId()).isNotNull();
        assertThat(metadata.get(0).getName()).isEqualTo(textMetafieldName);
        assertThat(metadata.get(0).getValue()).isEqualTo("text");
        assertThat(metadata.get(0).getResourceId()).isEqualTo(resourceId);
        assertThat(metadata.get(0).getMetafieldId()).isEqualTo(metafields.get(0).getId());
        assertThat(metadata.get(0).getDeletedAt()).isNull();

        assertThat(metadata.get(1).getId()).isNotNull();
        assertThat(metadata.get(1).getName()).isEqualTo(radioMetafieldName);
        assertThat(metadata.get(1).getValue()).isEqualTo("radio-option-2");
        assertThat(metadata.get(1).getResourceId()).isEqualTo(resourceId);
        assertThat(metadata.get(1).getMetafieldId()).isEqualTo(metafields.get(1).getId());
        assertThat(metadata.get(1).getDeletedAt()).isNull();

        assertThat(metadata.get(2).getId()).isNotNull();
        assertThat(metadata.get(2).getName()).isEqualTo(dropdownMetafieldName);
        assertThat(metadata.get(2).getValue()).isEqualTo("dropdown-option-1");
        assertThat(metadata.get(2).getResourceId()).isEqualTo(resourceId);
        assertThat(metadata.get(2).getMetafieldId()).isEqualTo(metafields.get(2).getId());
        assertThat(metadata.get(2).getDeletedAt()).isNull();
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldCreateAdHocMetadata(ResourceType resourceType) throws IOException, ApiException {
        // given
        String textMetafieldName = "adhoc-text-" + randomNumeric(7);
        int resourceId = getIdForResourceType(resourceType);
        CreateMetadataRequest createMetadataRequest =
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata(textMetafieldName, "text")
                        )
                );

        // when
        List<Metadata> metadata = CUSTOM_FIELDS_CONTROLLER
                .createMetadata(resourceType, resourceId, createMetadataRequest);
        List<Metafield> metafields = CUSTOM_FIELDS_CONTROLLER.listMetafields(
                new ListMetafieldsInput.Builder()
                        .resourceType(resourceType)
                        .name(textMetafieldName)
                        .build()
        ).getMetafields();

        // then
        assertThat(metadata.size()).isEqualTo(1);

        assertThat(metadata.get(0).getId()).isNotNull();
        assertThat(metadata.get(0).getName()).isEqualTo(textMetafieldName);
        assertThat(metadata.get(0).getValue()).isEqualTo("text");
        assertThat(metadata.get(0).getResourceId()).isEqualTo(resourceId);
        assertThat(metadata.get(0).getMetafieldId()).isNotNull();
        assertThat(metadata.get(0).getDeletedAt()).isNull();

        assertThat(metafields.size()).isEqualTo(1);
        assertThat(metadata.get(0).getName()).isEqualTo(textMetafieldName);
        assertThat(metadata.get(0).getId()).isEqualTo(metafields.get(0).getId());
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldNotCreateMetadataWhenValueIsTooBig(ResourceType resourceType) throws IOException, ApiException {
        // given
        String textMetafieldName = "adhoc-text-" + randomNumeric(7);
        CreateMetadataRequest createMetadataRequest =
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata(textMetafieldName, "abcde".repeat(500))
                        )
                );

        // when
        List<Metadata> metadata = CUSTOM_FIELDS_CONTROLLER
                .createMetadata(resourceType, getIdForResourceType(resourceType), createMetadataRequest);

        // then
        assertThat(metadata.size()).isEqualTo(1);
        assertEmptyMetadata(metadata.get(0), textMetafieldName);
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldNotCreateMetadataWhenValueNotInEnum(ResourceType resourceType) throws IOException, ApiException {
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
                                new CreateMetadata(radioMetafieldName, "abcde")
                        )
                );

        // when
        List<Metafield> metafields = CUSTOM_FIELDS_CONTROLLER.createMetafields(resourceType, createMetafieldsRequest);
        List<Metadata> metadata = CUSTOM_FIELDS_CONTROLLER
                .createMetadata(resourceType, getIdForResourceType(resourceType), createMetadataRequest);

        // then
        assertThat(metadata.size()).isEqualTo(1);
        assertEmptyMetadata(metadata.get(0), radioMetafieldName);
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenCreatingMetafieldsWithInvalidData")
    void shouldReturn422WhenCreatingMetadataWithInvalidData(CreateMetadataRequest request,
                                                            String expectedError) {
        // when - then
        assertUnprocessableEntity(
                SingleErrorResponseException.class,
                () -> CUSTOM_FIELDS_CONTROLLER.createMetadata(ResourceType.SUBSCRIPTIONS, subscription.getId(), request),
                e -> assertThat(e.getError()).isEqualTo(expectedError)
        );
    }

    private static Stream<Arguments> argsForShouldReturn422WhenCreatingMetafieldsWithInvalidData() {
        return Stream.of(
                Arguments.of(
                        null, "The root key 'metadata' is required"
                ),
                Arguments.of(
                        new CreateMetadataRequest(List.of(new CreateMetadata())),
                        "'name' must be present to create or update metafields"
                ),
                Arguments.of(
                        new CreateMetadataRequest(List.of(new CreateMetadata("", null))),
                        "'name' must be present to create or update metafields"
                )
        );
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldNotCreateMetadataForNonExistentResource(ResourceType resourceType) {
        assertNotFound(() -> CUSTOM_FIELDS_CONTROLLER.createMetadata(resourceType, 123, null));
    }

    @Test
    void shouldNotCreateMetadataWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getCustomFieldsController()
                .createMetadata(ResourceType.SUBSCRIPTIONS, 123, null));
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

    private void assertEmptyMetadata(Metadata metadata, String name) {
        assertThat(metadata.getName()).isEqualTo(name);
        assertThat(metadata.getId()).isNull();
        assertThat(metadata.getMetafieldId()).isNull();
        assertThat(metadata.getValue()).isNull();
        assertThat(metadata.getResourceId()).isNull();
        assertThat(metadata.getDeletedAt()).isNull();
    }

}
