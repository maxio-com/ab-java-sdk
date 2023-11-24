package com.maxio.advancedbilling.controllers.products;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.ProductPricePointsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateProductPricePoint;
import com.maxio.advancedbilling.models.CreateProductPricePointRequest;
import com.maxio.advancedbilling.models.ListProductsInput;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.models.ProductResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.maxio.advancedbilling.models.BasicDateField.CREATED_AT;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductsControllerListProductsTest extends ProductsControllerTestBase {

    static List<Product> savedProducts = new ArrayList<>();

    @BeforeAll
    static void setupProducts() throws IOException, ApiException {
        archiveAllSiteProducts();

        for (int i=0; i < 4; i++) {
            savedProducts.add(createProductWithHandle("list-products-" + i));
        }

        // setup new price point for one product in order to test filtering by use_site_exchange_rate
        Product productWithChangedPricePoint = createProductWithHandle("list-products-5");
        ProductPricePointsController productPricePointsController = TestClient.createClient().getProductPricePointsController();
        CreateProductPricePointRequest createProductPricePointRequest = new CreateProductPricePointRequest(
                new CreateProductPricePoint.Builder().useSiteExchangeRate(false).interval(1).intervalUnit("month")
                        .priceInCents(22).name("Price point to promote").build()
        );
        ProductPricePoint pricePoint = productPricePointsController
                .createProductPricePoint(productWithChangedPricePoint.getId(), createProductPricePointRequest)
                .getPricePoint();
        productPricePointsController.setDefaultPricePointForProduct(productWithChangedPricePoint.getId(), pricePoint.getId());
        productWithChangedPricePoint = productsController.readProduct(productWithChangedPricePoint.getId()).getProduct();
        savedProducts.add(productWithChangedPricePoint);
    }

    @Test
    void shouldListProducts() throws IOException, ApiException {
        // when
        List<Product> productList = productsController.listProducts(new ListProductsInput())
                .stream().map(ProductResponse::getProduct).toList();

        // then
        assertThat(productList).usingRecursiveFieldByFieldElementComparatorIgnoringFields("updatedAt")
                .isEqualTo(savedProducts);
    }

    @Test
    void shouldListProductsFilteringByStartDate() throws IOException, ApiException {
        // given
        LocalDate startDateFilterIncludeElements = savedProducts.get(0).getCreatedAt().toLocalDate();
        LocalDate startDateFilterExcludeElements = startDateFilterIncludeElements.plusDays(1);

        // when
        List<ProductResponse> productList1 = productsController.listProducts(
                new ListProductsInput.Builder().dateField(CREATED_AT).startDate(startDateFilterIncludeElements).build()
        );
        List<ProductResponse> productList2 = productsController.listProducts(
                new ListProductsInput.Builder().dateField(CREATED_AT).startDate(startDateFilterExcludeElements).build()
        );

        // then
        assertThat(productList1.stream().map(ProductResponse::getProduct).toList())
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("updatedAt").isEqualTo(savedProducts);
        assertThat(productList2).isEmpty();
    }

    @Test
    void shouldListProductsFilteringByEndDate() throws IOException, ApiException {
        // given
        LocalDate endDateFilterIncludeElements = savedProducts.get(0).getCreatedAt().toLocalDate();
        LocalDate endDateFilterExcludeElements = endDateFilterIncludeElements.plusDays(-1);

        // when
        List<ProductResponse> productList1 = productsController.listProducts(
                new ListProductsInput.Builder().dateField(CREATED_AT).endDate(endDateFilterIncludeElements).build()
        );
        List<ProductResponse> productList2 = productsController.listProducts(
                new ListProductsInput.Builder().dateField(CREATED_AT).endDate(endDateFilterExcludeElements).build()
        );

        // then
        assertThat(productList1.stream().map(ProductResponse::getProduct).toList())
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("updatedAt").isEqualTo(savedProducts);
        assertThat(productList2).isEmpty();

    }

    @Test
    void shouldListProductsFilteringByStartDateTime() throws IOException, ApiException {
        // given
        LocalDateTime savedProductCreatedAt = savedProducts.get(0).getCreatedAt();
        LocalDateTime startDateTimeFilterExcludeElements = savedProductCreatedAt.plusMinutes(5);

        // when
        List<ProductResponse> productList1 = productsController.listProducts(
                new ListProductsInput.Builder().dateField(CREATED_AT).startDatetime(savedProductCreatedAt).build()
        );
        List<ProductResponse> productList2 = productsController.listProducts(
                new ListProductsInput.Builder().dateField(CREATED_AT).startDatetime(startDateTimeFilterExcludeElements).build()
        );

        // then
        assertThat(productList1.stream().map(ProductResponse::getProduct).toList())
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("updatedAt").isEqualTo(savedProducts);
        assertThat(productList2).isEmpty();
    }

    @Test
    void shouldListProductsFilteringByEndDateTime() throws IOException, ApiException {
        // given
        LocalDateTime savedProductCreatedAt = savedProducts.get(0).getCreatedAt();
        LocalDateTime endDateTimeFilterIncludeElements = savedProductCreatedAt.plusMinutes(5);
        LocalDateTime endDateTimeFilterExcludeElements = savedProductCreatedAt.plusMinutes(-5);

        // when
        List<ProductResponse> productList1 = productsController.listProducts(
                new ListProductsInput.Builder().dateField(CREATED_AT).endDatetime(endDateTimeFilterIncludeElements).build()
        );
        List<ProductResponse> productList2 = productsController.listProducts(
                new ListProductsInput.Builder().dateField(CREATED_AT).endDatetime(endDateTimeFilterExcludeElements).build()
        );

        // then
        assertThat(productList1.stream().map(ProductResponse::getProduct).toList())
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("updatedAt").isEqualTo(savedProducts);
        assertThat(productList2).isEmpty();
    }

    @Test
    void shouldListProductsIncludingArchived() throws IOException, ApiException, InterruptedException {
        // given
        Thread.sleep(1000);
        Product archivedProduct = createProductWithHandle("product-to-archive");
        Product productAfterArchive = productsController.archiveProduct(archivedProduct.getId()).getProduct();
        // when
        // List products endpoint lists all products for site, so there is possibility that
        // it will list some products created in other tests - that's why we're using additional
        // date filter to narrow down to archived product created inside this test
        List<ProductResponse> productListWithArchived = productsController.listProducts(
                new ListProductsInput.Builder().dateField(CREATED_AT)
                        .startDatetime(archivedProduct.getCreatedAt()).includeArchived(true).build()
        );
        List<ProductResponse> productListWithoutArchived = productsController.listProducts(
                new ListProductsInput.Builder().dateField(CREATED_AT)
                        .startDatetime(archivedProduct.getCreatedAt()).includeArchived(false).build()
        );

        // then
        assertThat(productListWithArchived).hasSize(1);
        assertThat(productListWithArchived.get(0).getProduct()).usingRecursiveComparison()
                .isEqualTo(productAfterArchive);

        assertThat(productListWithoutArchived).isEmpty();
    }

    @Test
    void shouldListProductsFilteringByUseSiteExchangeRate() throws IOException, ApiException {
        // given
        Product productWithChangedPricePoint = savedProducts.get(4);

        // when
        List<ProductResponse> productsWithUseSiteExchangeRateFalse = productsController.listProducts(
                new ListProductsInput.Builder().filterUseSiteExchangeRate(false).build()
        );
        List<ProductResponse> productsWithUseSiteExchangeRateTrue = productsController.listProducts(
                new ListProductsInput.Builder().filterUseSiteExchangeRate(true).build()
        );

        // then
        assertThat(productsWithUseSiteExchangeRateFalse).hasSize(1);
        assertThat(productsWithUseSiteExchangeRateFalse.get(0).getProduct().getId())
                .isEqualTo(productWithChangedPricePoint.getId());
        assertThat(productsWithUseSiteExchangeRateFalse.get(0).getProduct().getUseSiteExchangeRate())
                .isFalse();

        assertThat(productsWithUseSiteExchangeRateTrue).hasSize(4);
        assertThat(productsWithUseSiteExchangeRateTrue.stream().map(ProductResponse::getProduct).toList())
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("updatedAt").containsExactlyInAnyOrderElementsOf(savedProducts.subList(0,4));
    }

    @Test
    void shouldListProductsUsingPagination() throws IOException, ApiException {
        // when
        List<ProductResponse> listProductsPage1 = productsController
                .listProducts(new ListProductsInput.Builder()
                        .page(1)
                        .perPage(2)
                        .build()
                );
        List<ProductResponse> listProductsPage2 = productsController
                .listProducts(new ListProductsInput.Builder()
                        .page(2)
                        .perPage(2)
                        .build()
                );
        List<ProductResponse> listProductsPage3 = productsController
                .listProducts(new ListProductsInput.Builder()
                        .page(3)
                        .perPage(2)
                        .build()
                );
        List<ProductResponse> listProductsPage4 = productsController
                .listProducts(new ListProductsInput.Builder()
                        .page(4)
                        .perPage(2)
                        .build()
                );

        // then
        assertThat(listProductsPage1).hasSize(2);
        assertThat(listProductsPage2).hasSize(2);
        assertThat(listProductsPage3).hasSize(1);
        assertThat(listProductsPage4).isEmpty();
    }

    private static void archiveAllSiteProducts() throws IOException, ApiException {
        List<ProductResponse> productResponses = productsController.listProducts(
                new ListProductsInput.Builder().perPage(200).build()
        );
        while (productResponses.size() > 0) {
            for (ProductResponse p: productResponses) {
                productsController.archiveProduct(p.getProduct().getId());
            }
            productResponses = productsController.listProducts(
                    new ListProductsInput.Builder().perPage(200).build()
            );
        }
    }

}
