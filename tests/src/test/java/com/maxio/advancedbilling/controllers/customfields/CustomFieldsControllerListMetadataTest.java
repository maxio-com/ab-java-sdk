package com.maxio.advancedbilling.controllers.customfields;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.CustomFieldsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateMetadata;
import com.maxio.advancedbilling.models.CreateMetadataRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ListMetadataInput;
import com.maxio.advancedbilling.models.Metadata;
import com.maxio.advancedbilling.models.PaginatedMetadata;
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
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class CustomFieldsControllerListMetadataTest {

    private static CustomFieldsTestsUtils.Resources resources;
    private static final CustomFieldsController CUSTOM_FIELDS_CONTROLLER =
            TestClient.createClient().getCustomFieldsController();
    private static Customer customer2;

    private static List<Metadata> customerMetadata;
    private static List<Metadata> subscriptionMetadata;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        new TestTeardown().deleteMetafields();
        TestSetup testSetup = new TestSetup();

        resources = new CustomFieldsTestsUtils.Resources();
        Customer customer = resources.getCustomer();
        Subscription subscription = resources.getSubscription();
        customer2 = testSetup.createCustomer();
        Subscription subscription2 = testSetup.createSubscription(customer2, subscription.getProduct());

        //    Create metafields for customer
        String customerMetafieldName1 = "customer-metafield" + randomNumeric(5);
        String customerMetafieldName2 = "customer-metafield" + randomNumeric(5);
        String customerMetafieldName3 = "customer-metafield" + randomNumeric(5);

        CreateMetadataRequest createCustomer1MetadataRequest =
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata(customerMetafieldName1, "text1"),
                                new CreateMetadata(customerMetafieldName2, "text2"),
                                new CreateMetadata(customerMetafieldName3, "text3")
                        )
                );
        customerMetadata = CUSTOM_FIELDS_CONTROLLER
                .createMetadata(ResourceType.CUSTOMERS, customer.getId(), createCustomer1MetadataRequest);

        //    Create metafields for customer2 - these shouldn't be listed when querying for customer 1
        CreateMetadataRequest createCustomer2MetadataRequest =
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata(customerMetafieldName1, "text4"),
                                new CreateMetadata(customerMetafieldName2, "text5")
                        )
                );
        CUSTOM_FIELDS_CONTROLLER.createMetadata(ResourceType.CUSTOMERS, customer2.getId(), createCustomer2MetadataRequest);

        //    Create metafields for subscription
        String subscriptionMetafieldName1 = "subscription-metafield" + randomNumeric(5);
        String subscriptionMetafieldName2 = "subscription-metafield" + randomNumeric(5);
        String subscriptionMetafieldName3 = "subscription-metafield" + randomNumeric(5);

        CreateMetadataRequest createSubscription1MetadataRequest =
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata(subscriptionMetafieldName1, "text1"),
                                new CreateMetadata(subscriptionMetafieldName2, "text2"),
                                new CreateMetadata(subscriptionMetafieldName3, "text3")
                        )
                );
        subscriptionMetadata = CUSTOM_FIELDS_CONTROLLER
                .createMetadata(ResourceType.SUBSCRIPTIONS, subscription.getId(), createSubscription1MetadataRequest);

        //    Create metafields for subscription2 - these shouldn't be listed when querying for subscription 1
        CreateMetadataRequest createSubscription2MetadataRequest =
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata(subscriptionMetafieldName1, "text4"),
                                new CreateMetadata(subscriptionMetafieldName2, "text5")
                        )
                );
        CUSTOM_FIELDS_CONTROLLER.createMetadata(ResourceType.SUBSCRIPTIONS, subscription2.getId(), createSubscription2MetadataRequest);
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        TestTeardown testTeardown = new TestTeardown();
        testTeardown.deleteMetafields();
        testTeardown.deleteCustomer(resources.getCustomer());
        testTeardown.deleteCustomer(customer2);

    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldListMetadata(ResourceType resourceType) throws IOException, ApiException {
        // when
        PaginatedMetadata paginatedMetadata = CUSTOM_FIELDS_CONTROLLER.listMetadata(new ListMetadataInput(
                resourceType, resources.getIdForResourceType(resourceType), 1, 10
        ));

        // then
        assertThat(paginatedMetadata.getMetadata()).hasSize(3);
        assertThat(paginatedMetadata.getMetadata()).usingRecursiveComparison()
                .isEqualTo(getMetadataForResourceType(resourceType));

        assertThat(paginatedMetadata.getTotalCount()).isEqualTo(3);
        assertThat(paginatedMetadata.getCurrentPage()).isEqualTo(1);
        assertThat(paginatedMetadata.getPerPage()).isEqualTo(10);
        assertThat(paginatedMetadata.getTotalPages()).isEqualTo(1);
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldListMetadataWithPaging(ResourceType resourceType) throws IOException, ApiException {
        // when
        PaginatedMetadata firstPage = CUSTOM_FIELDS_CONTROLLER.listMetadata(new ListMetadataInput(
                resourceType, resources.getIdForResourceType(resourceType), 1, 2
        ));
        PaginatedMetadata secondPage = CUSTOM_FIELDS_CONTROLLER.listMetadata(new ListMetadataInput(
                resourceType, resources.getIdForResourceType(resourceType), 2, 2
        ));
        PaginatedMetadata thirdPage = CUSTOM_FIELDS_CONTROLLER.listMetadata(new ListMetadataInput(
                resourceType, resources.getIdForResourceType(resourceType), 3, 2
        ));

        // then
        assertThat(firstPage.getMetadata()).hasSize(2);
        assertThat(secondPage.getMetadata()).hasSize(1);
        assertThat(thirdPage.getMetadata()).isEmpty();

        assertThat(firstPage.getCurrentPage()).isEqualTo(1);
        assertThat(secondPage.getCurrentPage()).isEqualTo(2);
        assertThat(thirdPage.getCurrentPage()).isEqualTo(3);

        assertThat(firstPage.getTotalPages()).isEqualTo(2);
        assertThat(secondPage.getTotalPages()).isEqualTo(2);
        assertThat(thirdPage.getTotalPages()).isEqualTo(2);
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldNotListMetadataForNonExistentResource(ResourceType resourceType) {
        assertNotFound(() -> CUSTOM_FIELDS_CONTROLLER.listMetadata(
                new ListMetadataInput(resourceType, 123, 1, 10)
        ));
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldNotListMetadataWhenProvidingInvalidPage(ResourceType resourceType) {
        // when-then
        assertUnprocessableEntity(
                ApiException.class,
                () -> CUSTOM_FIELDS_CONTROLLER.listMetadata(new ListMetadataInput
                        .Builder()
                        .resourceType(resourceType)
                        .resourceId(resources.getIdForResourceType(resourceType))
                        .page(-3)
                        .build()),
                e -> assertThat(e.getMessage()).startsWith("HTTP Response Not OK. Status code: 422. Response:")
        );
    }

    @Test
    void shouldNotListMetadataWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getCustomFieldsController()
                .listMetadata(new ListMetadataInput(ResourceType.SUBSCRIPTIONS, 1, 1, 1)));
    }

    private List<Metadata> getMetadataForResourceType(ResourceType resourceType) {
        return switch (resourceType) {
            case SUBSCRIPTIONS -> subscriptionMetadata;
            case CUSTOMERS -> customerMetadata;
        };
    }

}
