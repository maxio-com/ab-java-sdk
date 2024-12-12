package com.maxio.advancedbilling.controllers.productfamilies;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.ProductFamiliesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.CreateProductFamily;
import com.maxio.advancedbilling.models.CreateProductFamilyRequest;
import com.maxio.advancedbilling.models.ListProductFamiliesInput;
import com.maxio.advancedbilling.models.ProductFamilyResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductFamiliesControllerListTest {
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final ProductFamiliesController productFamiliesController = client.getProductFamiliesController();
    private final List<ProductFamilyResponse> productFamilies = new ArrayList<>();

    @BeforeAll
    void setup() throws IOException, ApiException {
        for (int i = 0; i < 10; ++i) {
            CreateProductFamily request = new CreateProductFamily("Product families list test " + i,
                    "test-product-families-list-" + i, null);
            ProductFamilyResponse productFamily = productFamiliesController.createProductFamily(
                    new CreateProductFamilyRequest(request));
            productFamilies.add(productFamily);
            try {
                Thread.sleep(500);
            } catch (Exception ignored) {
            }
        }
    }

    @Test
    void shouldListAllFamilies() throws ApiException, IOException {
        // when
        List<ProductFamilyResponse> response = productFamiliesController.listProductFamilies(new ListProductFamiliesInput());

        // then
        assertThat(response)
                .hasSizeGreaterThanOrEqualTo(10)
                .usingRecursiveFieldByFieldElementComparator()
                .containsAll(productFamilies);
    }

    @Test
    void shouldFilterByEndDate() throws ApiException, IOException {
        // given
        LocalDate dateFilter = LocalDate.now();

        ListProductFamiliesInput createdAt = new ListProductFamiliesInput.Builder()
                .dateField(BasicDateField.CREATED_AT)
                .endDate(dateFilter)
                .build();
        ListProductFamiliesInput updatedAt = new ListProductFamiliesInput.Builder()
                .dateField(BasicDateField.UPDATED_AT)
                .endDate(dateFilter)
                .build();
        ListProductFamiliesInput updatedAtPast = new ListProductFamiliesInput.Builder()
                .dateField(BasicDateField.UPDATED_AT)
                .endDate(dateFilter.minusDays(1))
                .build();

        // when
        List<ProductFamilyResponse> filteredByCreatedAt = productFamiliesController.listProductFamilies(createdAt);
        List<ProductFamilyResponse> filteredByUpdatedAt = productFamiliesController.listProductFamilies(updatedAt);
        List<ProductFamilyResponse> updatedAtInThePast = productFamiliesController.listProductFamilies(updatedAtPast);

        // then
        assertThat(filteredByCreatedAt)
                .hasSizeGreaterThanOrEqualTo(10)
                .usingRecursiveFieldByFieldElementComparator()
                .containsAll(productFamilies);

        assertThat(filteredByUpdatedAt)
                .hasSizeGreaterThanOrEqualTo(10)
                .usingRecursiveFieldByFieldElementComparator()
                .containsAll(productFamilies);

        assertThat(updatedAtInThePast)
                .isNotNull()
                .isEmpty();
    }

    @Test
    void shouldFilterByStartDate() throws ApiException, IOException {
        // given
        LocalDate dateFilter = LocalDate.now();

        ListProductFamiliesInput createdAt = new ListProductFamiliesInput.Builder()
                .dateField(BasicDateField.CREATED_AT)
                .startDate(dateFilter)
                .build();
        ListProductFamiliesInput updatedAt = new ListProductFamiliesInput.Builder()
                .dateField(BasicDateField.UPDATED_AT)
                .startDate(dateFilter)
                .build();
        ListProductFamiliesInput inTheFuture = new ListProductFamiliesInput.Builder()
                .dateField(BasicDateField.UPDATED_AT)
                .startDate(dateFilter.plusDays(1))
                .build();

        // when
        List<ProductFamilyResponse> filteredByCreatedAt = productFamiliesController.listProductFamilies(createdAt);
        List<ProductFamilyResponse> filteredByUpdatedAt = productFamiliesController.listProductFamilies(updatedAt);
        List<ProductFamilyResponse> updatedAtInTheFuture = productFamiliesController.listProductFamilies(inTheFuture);

        // then
        assertThat(filteredByCreatedAt)
                .hasSizeGreaterThanOrEqualTo(10)
                .usingRecursiveFieldByFieldElementComparator()
                .containsAll(productFamilies);

        assertThat(filteredByUpdatedAt)
                .hasSizeGreaterThanOrEqualTo(10)
                .usingRecursiveFieldByFieldElementComparator()
                .containsAll(productFamilies);

        assertThat(updatedAtInTheFuture)
                .isNotNull()
                .isEmpty();
    }

    @Test
    void shouldFilterByEndDateTime() throws ApiException, IOException {
        // given
        ListProductFamiliesInput createdAt = new ListProductFamiliesInput.Builder()
                .dateField(BasicDateField.CREATED_AT)
                .endDatetime(productFamilies.get(4).getProductFamily().getCreatedAt())
                .build();

        ListProductFamiliesInput updatedAt = new ListProductFamiliesInput.Builder()
                .dateField(BasicDateField.UPDATED_AT)
                .endDatetime(productFamilies.get(6).getProductFamily().getUpdatedAt())
                .build();

        // when
        List<ProductFamilyResponse> filteredByCreatedAt = productFamiliesController.listProductFamilies(createdAt);
        List<ProductFamilyResponse> filteredByUpdatedAt = productFamiliesController.listProductFamilies(updatedAt);

        // then
        assertThat(filteredByCreatedAt)
                .usingRecursiveFieldByFieldElementComparator()
                .containsAll(productFamilies.subList(0, 4))
                .doesNotContainAnyElementsOf(productFamilies.subList(6, 10));

        assertThat(filteredByUpdatedAt)
                .usingRecursiveFieldByFieldElementComparator()
                .containsAll(productFamilies.subList(0, 6))
                .doesNotContainAnyElementsOf(productFamilies.subList(8, 10));
    }

    @Test
    void shouldFilterByStartDateTime() throws ApiException, IOException {
        // given
        ListProductFamiliesInput createdAt = new ListProductFamiliesInput.Builder()
                .dateField(BasicDateField.CREATED_AT)
                .startDatetime(productFamilies.get(8).getProductFamily().getCreatedAt())
                .build();

        ListProductFamiliesInput updatedAt = new ListProductFamiliesInput.Builder()
                .dateField(BasicDateField.UPDATED_AT)
                .startDatetime(productFamilies.get(4).getProductFamily().getUpdatedAt())
                .build();

        // when
        List<ProductFamilyResponse> filteredByCreatedAt = productFamiliesController.listProductFamilies(createdAt);
        List<ProductFamilyResponse> filteredByUpdatedAt = productFamiliesController.listProductFamilies(updatedAt);

        // then
        assertThat(filteredByCreatedAt)
                .usingRecursiveFieldByFieldElementComparator()
                .containsAll(productFamilies.subList(8, 10))
                .doesNotContainAnyElementsOf(productFamilies.subList(0, 7));

        assertThat(filteredByUpdatedAt)
                .usingRecursiveFieldByFieldElementComparator()
                .containsAll(productFamilies.subList(4, 10))
                .doesNotContainAnyElementsOf(productFamilies.subList(0, 3));
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() {
        // given
        ListProductFamiliesInput body = new ListProductFamiliesInput.Builder()
                .build();

        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getProductFamiliesController()
                .listProductFamilies(body));
    }
}
