package com.maxio.advancedbilling.controllers.customfields;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.CustomFieldsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateMetadata;
import com.maxio.advancedbilling.models.CreateMetadataRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ListMetadataForResourceTypeInput;
import com.maxio.advancedbilling.models.Metadata;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ResourceType;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.io.IOException;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class CustomFieldsControllerDeleteMetadataTest {

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
    void shouldDeleteSingleMetadata(ResourceType resourceType) throws IOException, ApiException {
        // given
        String textMetafieldName = "text-to-delete-" + randomNumeric(7);
        int resourceId = getIdForResourceType(resourceType);

        CreateMetadataRequest createMetadataRequest =
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata(textMetafieldName, "text")
                        )
                );

        // when
        CUSTOM_FIELDS_CONTROLLER.createMetadata(resourceType, resourceId, createMetadataRequest);
        CUSTOM_FIELDS_CONTROLLER.deleteMetadata(resourceType, resourceId, textMetafieldName, null);

        // then
        List<Metadata> metadata = CUSTOM_FIELDS_CONTROLLER.listMetadataForResourceType(new ListMetadataForResourceTypeInput.Builder()
                .resourceType(resourceType)
                .resourceIds(List.of(resourceId))
                .build()
        ).getMetadata();
        assertThat(metadata).isEmpty();
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldDeleteMultipleMetadata(ResourceType resourceType) throws IOException, ApiException {
        // given
        String metafieldName1 = "metafield-delete-" + randomNumeric(7);
        String metafieldName2 = "metafield-delete-" + randomNumeric(7);
        String metafieldName3 = "metafield-" + randomNumeric(7);

        int resourceId = getIdForResourceType(resourceType);

        CreateMetadataRequest createMetadataRequest =
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata(metafieldName1, "text1"),
                                new CreateMetadata(metafieldName2, "text2"),
                                new CreateMetadata(metafieldName3, "text3")
                        )
                );

        // when
        CUSTOM_FIELDS_CONTROLLER.createMetadata(resourceType, resourceId, createMetadataRequest);
        CUSTOM_FIELDS_CONTROLLER.deleteMetadata(resourceType, resourceId, null, List.of(metafieldName1, metafieldName2));

        // then
        List<Metadata> metadata = CUSTOM_FIELDS_CONTROLLER.listMetadataForResourceType(new ListMetadataForResourceTypeInput.Builder()
                .resourceType(resourceType)
                .resourceIds(List.of(resourceId))
                .build()
        ).getMetadata();
        assertThat(metadata.size()).isEqualTo(1);
        assertThat(metadata.get(0).getName()).isEqualTo(metafieldName3);
        assertThat(metadata.get(0).getValue()).isEqualTo("text3");
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldNotDeleteNonExistentMetadata(ResourceType resourceType) {
        assertNotFound(() -> CUSTOM_FIELDS_CONTROLLER.deleteMetadata(resourceType, getIdForResourceType(resourceType),
                "123", null));
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldNotDeleteMetadataForNonExistentResource(ResourceType resourceType) {
        assertNotFound(() -> CUSTOM_FIELDS_CONTROLLER.deleteMetadata(resourceType, 123, null, null));
    }

    @Test
    void shouldNotDeleteMetadataWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getCustomFieldsController()
                .deleteMetadata(ResourceType.SUBSCRIPTIONS, 123, null, null));
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

}
