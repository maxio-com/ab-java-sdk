package com.maxio.advancedbilling.productfamilies;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.ProductFamiliesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.ListProductsFilter;
import com.maxio.advancedbilling.models.ListProductsForProductFamilyInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.models.ProductResponse;
import com.maxio.advancedbilling.utils.TestSetup;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductFamiliesControllerListProductsTest {
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final ProductFamiliesController productFamiliesController = client.getProductFamiliesController();
    private final TestSetup testSetup = new TestSetup();
    private final List<ProductResponse> existingProducts = new ArrayList<>();
    private final List<ProductResponse> archivedProducts = new ArrayList<>();
    private final List<ProductResponse> existingProductsWithoutExchange = new ArrayList<>();
    private ProductFamily productFamily;

    @BeforeAll
    void setup() throws IOException, ApiException {
        productFamily = testSetup.createProductFamily();

        for (int i = 0; i < 10; ++i) {
            int iterator = i;
            existingProducts.add(
                    new ProductResponse(testSetup.createProduct(productFamily, b -> b
                            .name("product family list product test " + iterator))));
            sleep(500);
        }

        for (int i = 10; i < 12; ++i) {
            int iterator = i;
            Product product = new ProductResponse(testSetup.createProduct(productFamily, b -> b
                    .name("product family list product test " + iterator))).getProduct();
            client.getProductsController().archiveProduct(product.getId());
            archivedProducts.add(client.getProductsController().readProduct(product.getId()));
        }

        sleep(1000);

        ProductPricePoint pricePoint1 = testSetup.createProductPricePoint(existingProducts.get(2).getProduct(), "use_site_exchange", b ->
                b.useSiteExchangeRate(false));
        ProductPricePoint pricePoint2 = testSetup.createProductPricePoint(existingProducts.get(8).getProduct(), "use_site_exchange", b ->
                b.useSiteExchangeRate(false));
        client.getProductPricePointsController()
                .promoteProductPricePointToDefault(pricePoint1.getProductId(), pricePoint1.getId());
        client.getProductPricePointsController()
                .promoteProductPricePointToDefault(pricePoint2.getProductId(), pricePoint2.getId());

        // refresh modified products
        existingProducts.set(2, client.getProductsController().readProduct(existingProducts.get(2).getProduct().getId()));
        existingProducts.set(8, client.getProductsController().readProduct(existingProducts.get(8).getProduct().getId()));

        existingProductsWithoutExchange.add(existingProducts.get(2));
        existingProductsWithoutExchange.add(existingProducts.get(8));
    }

    @Test
    void shouldListAllNonArchivedProductsForFamily() throws ApiException, IOException {
        // when
        List<ProductResponse> response = productFamiliesController.listProductsForProductFamily(new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .build());

        // then
        assertThat(response)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(existingProducts);
    }

    @Test
    void shouldListAllNonArchivedProductsForFamilyByHandle() throws ApiException, IOException {
        // when
        List<ProductResponse> response = productFamiliesController.listProductsForProductFamily(new ListProductsForProductFamilyInput.Builder()
                .productFamilyId("handle:" + productFamily.getHandle())
                .build());

        // then
        assertThat(response)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(existingProducts);
    }

    @Test
    void shouldUsePaging() throws ApiException, IOException {
        // given
        ListProductsForProductFamilyInput input = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .page(1)
                .perPage(3)
                .build();

        // when
        List<ProductResponse> page1 = productFamiliesController.listProductsForProductFamily(input);
        List<ProductResponse> page2 = productFamiliesController.listProductsForProductFamily(
                input.toBuilder().page(2).build());
        List<ProductResponse> bigPage = productFamiliesController.listProductsForProductFamily(
                input.toBuilder().page(1).perPage(8).build());

        // then
        assertThat(page1).hasSize(3);
        assertThat(page2).hasSize(3);
        assertThat(bigPage).hasSize(8);

        Set<Integer> mergedPages = Stream.concat(page1.stream(), page2.stream())
                .map(ProductResponse::getProduct)
                .map(Product::getId)
                .collect(Collectors.toSet());

        // problems with paging
        assertThat(mergedPages).hasSizeBetween(5, 6);
    }

    @Test
    void shouldFilterByIds() throws ApiException, IOException {
        // given
        ListProductsForProductFamilyInput filter = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .filter(new ListProductsFilter.Builder()
                        .ids(List.of(
                                existingProducts.get(0).getProduct().getId(),
                                existingProducts.get(2).getProduct().getId(),
                                existingProducts.get(5).getProduct().getId())
                        ).build())
                .build();

        // when
        List<ProductResponse> response = productFamiliesController.listProductsForProductFamily(filter);

        // then
        List<ProductResponse> expected = List.of(existingProducts.get(0), existingProducts.get(2), existingProducts.get(5));

        assertThat(response)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void shouldFilterBySiteExchangeRate() throws ApiException, IOException {
        // given
        ListProductsForProductFamilyInput filterWithExchange = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .filter(new ListProductsFilter.Builder()
                        .useSiteExchangeRate(true)
                        .build())
                .build();
        ListProductsForProductFamilyInput filterWithoutExchange = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .filter(new ListProductsFilter.Builder()
                        .useSiteExchangeRate(false)
                        .build())
                .build();

        // when
        List<ProductResponse> productsWithExchange = productFamiliesController.listProductsForProductFamily(filterWithExchange);
        List<ProductResponse> productsWithoutExchange = productFamiliesController.listProductsForProductFamily(filterWithoutExchange);

        // then
        assertThat(productsWithoutExchange)
                .hasSize(2)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(existingProductsWithoutExchange);

        assertThat(productsWithExchange)
                .hasSize(8)
                .usingRecursiveFieldByFieldElementComparator()
                .doesNotContainAnyElementsOf(existingProductsWithoutExchange);
    }

    @Test
    void shouldFilterByArchived() throws ApiException, IOException {
        // given
        ListProductsForProductFamilyInput filterWithArchived = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .includeArchived(true)
                .build();
        ListProductsForProductFamilyInput filterWithoutArchived = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .includeArchived(false)
                .build();

        // when
        List<ProductResponse> productsWithArchived = productFamiliesController.listProductsForProductFamily(filterWithArchived);
        List<ProductResponse> productsWithoutArchived = productFamiliesController.listProductsForProductFamily(filterWithoutArchived);

        // then
        assertThat(productsWithoutArchived)
                .hasSize(10)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(existingProducts);

        assertThat(productsWithArchived)
                .hasSize(12)
                .usingRecursiveFieldByFieldElementComparator()
                .containsAll(existingProducts)
                .containsAll(archivedProducts);
    }

    @Test
    void shouldFilterByEndDate() throws ApiException, IOException {
        // given
        LocalDate dateFilter = LocalDate.now();

        ListProductsForProductFamilyInput createdAt = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .dateField(BasicDateField.CREATED_AT)
                .endDate(dateFilter)
                .build();
        ListProductsForProductFamilyInput updatedAt = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .dateField(BasicDateField.UPDATED_AT)
                .endDate(dateFilter)
                .build();
        ListProductsForProductFamilyInput updatedAtPast = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .dateField(BasicDateField.UPDATED_AT)
                .endDate(dateFilter.minusDays(1))
                .build();

        // when
        List<ProductResponse> filteredByCreatedAt = productFamiliesController.listProductsForProductFamily(createdAt);
        List<ProductResponse> filteredByUpdatedAt = productFamiliesController.listProductsForProductFamily(updatedAt);
        List<ProductResponse> updatedAtInThePast = productFamiliesController.listProductsForProductFamily(updatedAtPast);

        // then
        assertThat(filteredByCreatedAt)
                .hasSize(10)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(existingProducts);

        assertThat(filteredByUpdatedAt)
                .hasSize(10)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(existingProducts);

        assertThat(updatedAtInThePast)
                .isNotNull()
                .isEmpty();
    }

    @Test
    void shouldFilterByStartDate() throws ApiException, IOException {
        // given
        LocalDate dateFilter = LocalDate.now();

        ListProductsForProductFamilyInput createdAt = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .dateField(BasicDateField.CREATED_AT)
                .startDate(dateFilter)
                .build();
        ListProductsForProductFamilyInput updatedAt = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .dateField(BasicDateField.UPDATED_AT)
                .startDate(dateFilter)
                .build();
        ListProductsForProductFamilyInput inTheFuture = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .dateField(BasicDateField.UPDATED_AT)
                .startDate(dateFilter.plusDays(1))
                .build();

        // when
        List<ProductResponse> filteredByCreatedAt = productFamiliesController.listProductsForProductFamily(createdAt);
        List<ProductResponse> filteredByUpdatedAt = productFamiliesController.listProductsForProductFamily(updatedAt);
        List<ProductResponse> updatedAtInTheFuture = productFamiliesController.listProductsForProductFamily(inTheFuture);

        // then
        assertThat(filteredByCreatedAt)
                .hasSize(10)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(existingProducts);

        assertThat(filteredByUpdatedAt)
                .hasSize(10)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(existingProducts);

        assertThat(updatedAtInTheFuture)
                .isNotNull()
                .isEmpty();
    }

    @Test
    void shouldFilterByEndDateTime() throws ApiException, IOException {
        // given
        ListProductsForProductFamilyInput createdAt = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .dateField(BasicDateField.CREATED_AT)
                .endDatetime(existingProducts.get(4).getProduct().getCreatedAt())
                .build();

        ListProductsForProductFamilyInput updatedAt = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .dateField(BasicDateField.UPDATED_AT)
                .endDatetime(existingProducts.get(9).getProduct().getUpdatedAt())
                .build();

        // when
        List<ProductResponse> filteredByCreatedAt = productFamiliesController.listProductsForProductFamily(createdAt);
        List<ProductResponse> filteredByUpdatedAt = productFamiliesController.listProductsForProductFamily(updatedAt);

        // then
        assertThat(filteredByCreatedAt)
                .hasSizeBetween(5, 6)
                .usingRecursiveFieldByFieldElementComparator()
                .containsAll(existingProducts.subList(0, 5))
                .doesNotContainAnyElementsOf(existingProducts.subList(8, 10));

        List<ProductResponse> expected = new ArrayList<>(existingProducts);
        // 2 and 8 product was modified after creation
        expected.remove(8);
        expected.remove(2);
        assertThat(filteredByUpdatedAt)
                .hasSize(8)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void shouldFilterByStartDateTime() throws ApiException, IOException {
        // given
        ListProductsForProductFamilyInput createdAt = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .dateField(BasicDateField.CREATED_AT)
                .startDatetime(existingProducts.get(4).getProduct().getCreatedAt())
                .build();

        ListProductsForProductFamilyInput updatedAt = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .dateField(BasicDateField.UPDATED_AT)
                .startDatetime(existingProducts.get(2).getProduct().getUpdatedAt())
                .build();

        // when
        List<ProductResponse> filteredByCreatedAt = productFamiliesController.listProductsForProductFamily(createdAt);
        List<ProductResponse> filteredByUpdatedAt = productFamiliesController.listProductsForProductFamily(updatedAt);

        // then
        assertThat(filteredByCreatedAt)
                .hasSizeBetween(6, 7)
                .usingRecursiveFieldByFieldElementComparator()
                .containsAll(existingProducts.subList(4, 10))
                .doesNotContainAnyElementsOf(existingProducts.subList(0, 3));

        assertThat(filteredByUpdatedAt)
                .hasSize(2)
                .usingRecursiveFieldByFieldElementComparator()
                .containsExactlyInAnyOrder(existingProducts.get(2), existingProducts.get(8));
    }

    @Test
    void shouldReturnEmptyListIfProductFamilyHasNoProducts() throws IOException, ApiException {
        // given
        ProductFamily emptyFamily = testSetup.createProductFamily();

        // when
        List<ProductResponse> products = productFamiliesController.listProductsForProductFamily(new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(emptyFamily.getId().toString())
                .build());

        // then
        assertThat(products)
                .isNotNull()
                .isEmpty();
    }

    @Test
    void shouldReturnNotFoundIfProductFamilyDoesNotExist() {
        // given
        ListProductsForProductFamilyInput body = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId("handle:not_existing")
                .build();

        // when
        assertNotFound(() -> productFamiliesController.listProductsForProductFamily(body));
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() {
        // given
        ListProductsForProductFamilyInput body = new ListProductsForProductFamilyInput.Builder()
                .productFamilyId(productFamily.getId().toString())
                .build();

        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getProductFamiliesController()
                .listProductsForProductFamily(body));
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception ignored) {
        }
    }
}
