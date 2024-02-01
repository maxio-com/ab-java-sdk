package com.maxio.advancedbilling.controllers.customfields;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.CustomFieldsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.CreateMetadata;
import com.maxio.advancedbilling.models.CreateMetadataRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.ListMetadataForResourceTypeInput;
import com.maxio.advancedbilling.models.Metadata;
import com.maxio.advancedbilling.models.PaginatedMetadata;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ResourceType;
import com.maxio.advancedbilling.models.SortingDirection;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class CustomFieldsControllerListMetadataForResourceTypeTest {

    private static final CustomFieldsController CUSTOM_FIELDS_CONTROLLER =
            TestClient.createClient().getCustomFieldsController();
    private static Customer customer;
    private static Customer customer2;

    private static List<Metadata> customerMetadata;
    private static List<Metadata> subscriptionMetadata;
    private static List<Metadata> customerMetadata2;
    private static List<Metadata> subscriptionMetadata2;
    private static Metadata deletedCustomerMetadata;
    private static Metadata deletedSubscriptionMetadata;

    @BeforeAll
    static void setup() throws IOException, ApiException {
        new TestTeardown().deleteMetafields();

        TestSetup TEST_SETUP = new TestSetup();
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        Product product = TEST_SETUP.createProduct(productFamily);
        customer = TEST_SETUP.createCustomer();
        Subscription subscription = TEST_SETUP.createSubscription(customer, product);
        customer2 = TEST_SETUP.createCustomer();
        Subscription subscription2 = TEST_SETUP.createSubscription(customer2, product);

        //    Create metafields for customer
        String customerMetafieldName1 = "customer-metafield" + randomNumeric(5);
        String customerMetafieldName2 = "customer-metafield" + randomNumeric(5);
        String customerMetafieldName3 = "customer-metafield" + randomNumeric(5);
        String customerMetafieldToDeleteName =
                "customer-metafield-to-delete" + randomNumeric(5);

        CreateMetadataRequest createCustomer1MetadataRequest =
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata(customerMetafieldName1, "text1"),
                                new CreateMetadata(customerMetafieldName2, "text2"),
                                new CreateMetadata(customerMetafieldName3, "text3"),
                                new CreateMetadata(customerMetafieldToDeleteName, "text4")
                        )
                );
        List<Metadata> metadataResponse = CUSTOM_FIELDS_CONTROLLER
                .createMetadata(ResourceType.CUSTOMERS, customer.getId(), createCustomer1MetadataRequest);
        customerMetadata = metadataResponse.subList(0, 3);
        deletedCustomerMetadata = metadataResponse.get(3);
        CUSTOM_FIELDS_CONTROLLER.deleteMetadata(ResourceType.CUSTOMERS, customer.getId(),
                customerMetafieldToDeleteName, null);

        //    Create metafields for customer2
        CreateMetadataRequest createCustomer2MetadataRequest =
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata(customerMetafieldName1, "text4"),
                                new CreateMetadata(customerMetafieldName2, "text5")
                        )
                );
        customerMetadata2 = CUSTOM_FIELDS_CONTROLLER
                .createMetadata(ResourceType.CUSTOMERS, customer2.getId(), createCustomer2MetadataRequest);

        //    Create metafields for subscription
        String subscriptionMetafieldName1 = "subscription-metafield" + randomNumeric(5);
        String subscriptionMetafieldName2 = "subscription-metafield" + randomNumeric(5);
        String subscriptionMetafieldName3 = "subscription-metafield" + randomNumeric(5);
        String subscriptionMetafieldToDeleteName =
                "subscription-metafield-to-delete" + randomNumeric(5);

        CreateMetadataRequest createSubscription1MetadataRequest =
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata(subscriptionMetafieldName1, "text1"),
                                new CreateMetadata(subscriptionMetafieldName2, "text2"),
                                new CreateMetadata(subscriptionMetafieldName3, "text3"),
                                new CreateMetadata(subscriptionMetafieldToDeleteName, "text4")

                        )
                );
        metadataResponse = CUSTOM_FIELDS_CONTROLLER
                .createMetadata(ResourceType.SUBSCRIPTIONS, subscription.getId(), createSubscription1MetadataRequest);
        subscriptionMetadata = metadataResponse.subList(0, 3);
        deletedSubscriptionMetadata = metadataResponse.get(3);
        CUSTOM_FIELDS_CONTROLLER.deleteMetadata(ResourceType.SUBSCRIPTIONS, subscription.getId(),
                subscriptionMetafieldToDeleteName, null);

        //    Create metafields for subscription2
        CreateMetadataRequest createSubscription2MetadataRequest =
                new CreateMetadataRequest(
                        List.of(
                                new CreateMetadata(subscriptionMetafieldName1, "text4"),
                                new CreateMetadata(subscriptionMetafieldName2, "text5")
                        )
                );
        subscriptionMetadata2 = CUSTOM_FIELDS_CONTROLLER
                .createMetadata(ResourceType.SUBSCRIPTIONS, subscription2.getId(), createSubscription2MetadataRequest);
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
    void shouldListAllMetadata(ResourceType resourceType) throws IOException, ApiException {
        // when
        PaginatedMetadata paginatedMetadata = CUSTOM_FIELDS_CONTROLLER.listMetadataForResourceType(new ListMetadataForResourceTypeInput
                .Builder()
                .resourceType(resourceType)
                .dateField(BasicDateField.CREATED_AT)
                .startDate(LocalDate.now().minusDays(3))
                .endDatetime(ZonedDateTime.now().plusHours(3))
                .build()
        );

        // then
        assertThat(paginatedMetadata.getMetadata()).hasSize(5);
        assertThat(paginatedMetadata.getMetadata()).usingRecursiveComparison()
                .isEqualTo(getAllMetadataForResourceType(resourceType));

        assertThat(paginatedMetadata.getTotalCount()).isEqualTo(5);
        assertThat(paginatedMetadata.getCurrentPage()).isEqualTo(1);
        assertThat(paginatedMetadata.getPerPage()).isEqualTo(20);
        assertThat(paginatedMetadata.getTotalPages()).isEqualTo(1);
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldListMetadataWithPaging(ResourceType resourceType) throws IOException, ApiException {
        // when
        PaginatedMetadata firstPage = listWithPaging(resourceType, 1);
        PaginatedMetadata secondPage = listWithPaging(resourceType, 2);
        PaginatedMetadata thirdPage = listWithPaging(resourceType, 3);

        // then
        assertThat(firstPage.getMetadata()).isSortedAccordingTo(Comparator.comparing(Metadata::getId).reversed());
        assertThat(secondPage.getMetadata()).isSortedAccordingTo(Comparator.comparing(Metadata::getId).reversed());

        assertThat(firstPage.getMetadata()).hasSize(3);
        assertThat(secondPage.getMetadata()).hasSize(2);
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
    void shouldListDeletedMetadataWithResourceIdsFilter(ResourceType resourceType) throws IOException, ApiException {
        // when
        Metadata deletedMetadata = getDeletedMetadataForResourceType(resourceType);
        PaginatedMetadata paginatedMetadata = CUSTOM_FIELDS_CONTROLLER.listMetadataForResourceType(new ListMetadataForResourceTypeInput
                .Builder()
                .resourceType(resourceType)
                .resourceIds(List.of(deletedMetadata.getResourceId()))
                .withDeleted(true)
                .build()
        );

        // then
        assertThat(paginatedMetadata.getMetadata()).hasSize(4);
        assertThat(paginatedMetadata.getMetadata().get(3)).usingRecursiveComparison()
                .ignoringFields("deletedAt")
                .isEqualTo(deletedMetadata);
        assertThat(paginatedMetadata.getMetadata().get(3).getDeletedAt()).isNotNull();
        assertThat(paginatedMetadata.getMetadata())
                .extracting(Metadata::getResourceId).containsOnly(deletedMetadata.getResourceId());
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldNotListMetadataWhenProvidingInvalidPage(ResourceType resourceType) {
        // when-then
        assertUnprocessableEntity(
                ApiException.class,
                () -> CUSTOM_FIELDS_CONTROLLER.listMetadataForResourceType(new ListMetadataForResourceTypeInput
                        .Builder()
                        .resourceType(resourceType)
                        .page(-3)
                        .build()),
                e -> assertThat(e.getMessage()).startsWith("HTTP Response Not OK. Status code: 422. Response:")
        );
    }

    @Test
    void shouldNotListMetadataWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getCustomFieldsController()
                .listMetadataForResourceType(
                        new ListMetadataForResourceTypeInput.Builder().resourceType(ResourceType.CUSTOMERS).build())
        );
    }

    private PaginatedMetadata listWithPaging(ResourceType resourceType, int page) throws IOException, ApiException {
        return CUSTOM_FIELDS_CONTROLLER.listMetadataForResourceType(
                new ListMetadataForResourceTypeInput.Builder()
                        .resourceType(resourceType)
                        .page(page)
                        .perPage(3)
                        .direction(SortingDirection.DESC)
                        .build()
        );
    }

    private List<Metadata> getAllMetadataForResourceType(ResourceType resourceType) {
        return switch (resourceType) {
            case SUBSCRIPTIONS -> Stream.concat(subscriptionMetadata.stream(), subscriptionMetadata2.stream())
                    .collect(Collectors.toList());
            case CUSTOMERS -> Stream.concat(customerMetadata.stream(), customerMetadata2.stream())
                    .collect(Collectors.toList());
        };
    }

    private Metadata getDeletedMetadataForResourceType(ResourceType resourceType) {
        return switch (resourceType) {
            case SUBSCRIPTIONS -> deletedSubscriptionMetadata;
            case CUSTOMERS -> deletedCustomerMetadata;
        };
    }

}
