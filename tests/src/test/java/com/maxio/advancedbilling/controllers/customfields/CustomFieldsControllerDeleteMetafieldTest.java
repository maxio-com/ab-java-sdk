package com.maxio.advancedbilling.controllers.customfields;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.CustomFieldsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateMetadata;
import com.maxio.advancedbilling.models.CreateMetadataRequest;
import com.maxio.advancedbilling.models.CreateMetafield;
import com.maxio.advancedbilling.models.CreateMetafieldsRequest;
import com.maxio.advancedbilling.models.ListMetadataInput;
import com.maxio.advancedbilling.models.ListMetafieldsInput;
import com.maxio.advancedbilling.models.Metadata;
import com.maxio.advancedbilling.models.Metafield;
import com.maxio.advancedbilling.models.ResourceType;
import com.maxio.advancedbilling.models.containers.CreateMetafieldsRequestMetafields;
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

public class CustomFieldsControllerDeleteMetafieldTest {

    private static CustomFieldsTestsUtils.Resources resources;

    private static final CustomFieldsController CUSTOM_FIELDS_CONTROLLER =
            TestClient.createClient().getCustomFieldsController();

    @BeforeAll
    static void setup() throws IOException, ApiException {
        resources = new CustomFieldsTestsUtils.Resources();
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(resources.getCustomer());
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldDeleteCustomerMetafieldAndAssociatedMetadata(ResourceType resourceType) throws IOException, ApiException {
        // given
        String metafieldName = "customer-metafield-" + randomNumeric(10);
        int resourceId = resources.getIdForResourceType(resourceType);
        CUSTOM_FIELDS_CONTROLLER
                .createMetafields(resourceType, new CreateMetafieldsRequest(
                        CreateMetafieldsRequestMetafields.fromCreateMetafield(
                                new CreateMetafield.Builder()
                                        .name(metafieldName)
                                        .build()
                        )));
        CUSTOM_FIELDS_CONTROLLER.createMetadata(resourceType, resourceId,
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata.Builder()
                                        .name(metafieldName)
                                        .value("test")
                                        .build()
                        )
                ));

        // when
        CUSTOM_FIELDS_CONTROLLER.deleteMetafield(resourceType, metafieldName);

        // then
        List<Metafield> metafieldList = CUSTOM_FIELDS_CONTROLLER.listMetafields(new ListMetafieldsInput
                .Builder()
                .resourceType(resourceType)
                .name(metafieldName)
                .build()).getMetafields();
        assertThat(metafieldList).isEmpty();

        List<Metadata> metadataList = CUSTOM_FIELDS_CONTROLLER.listMetadata(new ListMetadataInput.Builder()
                .resourceType(resourceType)
                .resourceId(resourceId)
                .build()).getMetadata();
        assertThat(metadataList).isEmpty();
    }

    @Test
    void shouldNotDeleteWhenMetafielDoesNotExist() {
        assertNotFound(() -> CUSTOM_FIELDS_CONTROLLER
                .deleteMetafield(ResourceType.SUBSCRIPTIONS, "nonexistent")
        );
    }

    @Test
    void shouldNotDeleteMetafieldsWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getCustomFieldsController()
                .deleteMetafield(ResourceType.SUBSCRIPTIONS, "123"));
    }

}
