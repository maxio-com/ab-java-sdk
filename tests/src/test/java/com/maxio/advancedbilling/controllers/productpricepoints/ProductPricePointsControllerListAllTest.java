package com.maxio.advancedbilling.controllers.productpricepoints;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.BasicDateField;
import com.maxio.advancedbilling.models.IncludeNotNull;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.ListAllProductPricePointsInput;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.models.SortingDirection;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ProductPricePointsControllerListAllTest extends ProductPricePointsBaseTest {

    private static Product product;
    private static ProductPricePoint archivedProductPricePoint;

    private static final List<ProductPricePoint> PRODUCT_PRICE_POINTS_OF_TYPE_CATALOG = new LinkedList<>();

    @BeforeAll
    static void beforeAll() throws IOException, ApiException {
        archiveAllSiteProducts();
        archiveAllSitePricePointsExcludingDefault();

        product = createProduct();    // this creates a default price point
        for (int i = 0; i < 3; i++) {
            PRODUCT_PRICE_POINTS_OF_TYPE_CATALOG.add(createProductPricePointWithDelay(
                            1000,
                            product.getId(),
                            defaultBuilder().name("test-price-point-%s".formatted(randomAlphabetic(5))).build()
                    ).getPricePoint()
            );
        }

        archivedProductPricePoint = PRODUCT_PRICE_POINTS_CONTROLLER.archiveProductPricePoint(
                        product.getId(),
                        createProductPricePoint(product.getId(), defaultBuilder().name("archived-test-price-point-%s".formatted(randomAlphabetic(5))).build()).getPricePoint().getId()
                )
                .getPricePoint();
    }

    @Test
    void shouldReturnListWithOriginalPricePointUsingFilterOfTypeDefault() throws IOException, ApiException {
        // when
        List<ProductPricePoint> productPricePoints = PRODUCT_PRICE_POINTS_CONTROLLER
                .listAllProductPricePoints(
                        filterByStartDatetimeOfProductCreation(builder -> builder.filterType(List.of(PricePointType.ENUM_DEFAULT)))
                )
                .getPricePoints();

        // then
        assertThat(productPricePoints).hasSize(1);
        ProductPricePoint defaultPricePoint = productPricePoints.get(0);
        assertAll(
                () -> assertThat(defaultPricePoint.getId()).isNotNull(),
                () -> assertThat(defaultPricePoint.getName()).isEqualTo("Original"),
                () -> assertThat(defaultPricePoint.getHandle()).isNotNull(),
                () -> assertThat(defaultPricePoint.getPriceInCents()).isEqualTo(0),
                () -> assertThat(defaultPricePoint.getInterval()).isEqualTo(2),
                () -> assertThat(defaultPricePoint.getIntervalUnit()).isEqualTo(IntervalUnit.MONTH),
                () -> assertThat(defaultPricePoint.getTrialPriceInCents()).isNull(),
                () -> assertThat(defaultPricePoint.getTrialInterval()).isNull(),
                () -> assertThat(defaultPricePoint.getTrialIntervalUnit()).isNull(),
                () -> assertThat(defaultPricePoint.getTrialType()).isEqualTo("payment_expected"),
                () -> assertThat(defaultPricePoint.getIntroductoryOffer()).isNull(),
                () -> assertThat(defaultPricePoint.getInitialChargeInCents()).isNull(),
                () -> assertThat(defaultPricePoint.getInitialChargeAfterTrial()).isFalse(),
                () -> assertThat(defaultPricePoint.getExpirationInterval()).isNull(),
                () -> assertThat(defaultPricePoint.getExpirationIntervalUnit()).isNull(),
                () -> assertThat(defaultPricePoint.getExpirationIntervalUnit()).isNull(),
                () -> assertThat(defaultPricePoint.getProductId()).isEqualTo(product.getId()),
                () -> assertThat(defaultPricePoint.getArchivedAt()).isNull(),
                () -> assertThat(defaultPricePoint.getCreatedAt()).isNotNull(),
                () -> assertThat(defaultPricePoint.getUpdatedAt()).isNotNull(),
                () -> assertThat(defaultPricePoint.getUseSiteExchangeRate()).isTrue(),
                () -> assertThat(defaultPricePoint.getType()).isEqualTo(PricePointType.ENUM_DEFAULT),
                () -> assertThat(defaultPricePoint.getTaxIncluded()).isFalse(),
                () -> assertThat(defaultPricePoint.getSubscriptionId()).isNull()
        );
    }

    @Test
    void shouldReturnListWithAllPricePointsSortedByCreatedAtDesc() throws IOException, ApiException {
        // when
        List<ProductPricePoint> productPricePoints = PRODUCT_PRICE_POINTS_CONTROLLER
                .listAllProductPricePoints(
                        filterByStartDatetimeOfProductCreation(builder -> builder.direction(SortingDirection.DESC))
                )
                .getPricePoints();

        // then
        assertThat(productPricePoints).hasSize(4);
        for (int i = 0; i < productPricePoints.size() - 1; i++) {
            assertThat(productPricePoints.get(i).getCreatedAt()).isAfter(productPricePoints.get(i + 1).getCreatedAt());
        }
    }

    @Test
    void shouldReturnListOfArchivedPricePoints() throws IOException, ApiException {
        // when
        List<ProductPricePoint> archivedPricePoints = PRODUCT_PRICE_POINTS_CONTROLLER
                .listAllProductPricePoints(
                        filterByStartDatetimeOfProductCreation(builder -> builder.filterArchivedAt(IncludeNotNull.NOT_NULL))
                )
                .getPricePoints();

        // then
        assertThat(archivedPricePoints)
                .hasSize(1)
                .singleElement()
                .usingRecursiveComparison()
                .isEqualTo(archivedProductPricePoint);
    }

    @Test
    void shouldReturnEmptyListWhenEndDateFilterDoesNotMatchCreatedAtTimeframe() throws IOException, ApiException {
        // when
        List<ProductPricePoint> productPricePoints = PRODUCT_PRICE_POINTS_CONTROLLER
                .listAllProductPricePoints(new ListAllProductPricePointsInput.Builder()
                        .filterDateField(BasicDateField.CREATED_AT)
                        .filterEndDate(LocalDate.parse("2020-01-01"))
                        .build()
                )
                .getPricePoints();

        // then
        assertThat(productPricePoints).isEmpty();
    }

    @Test
    void shouldReturnEmptyListWhenEndDateTimeFilterDoesNotMatchCreatedAtTimeframe() throws IOException, ApiException {
        // when
        List<ProductPricePoint> productPricePoints = PRODUCT_PRICE_POINTS_CONTROLLER
                .listAllProductPricePoints(new ListAllProductPricePointsInput.Builder()
                        .filterDateField(BasicDateField.CREATED_AT)
                        .filterEndDatetime(ZonedDateTime.parse("2020-01-01T00:00:00Z"))
                        .build()
                )
                .getPricePoints();

        // then
        assertThat(productPricePoints).isEmpty();
    }

    @Test
    void shouldReturnEmptyListWhenIdsFilterContainsNonExistentValues() throws IOException, ApiException {
        // when
        List<ProductPricePoint> productPricePoints = PRODUCT_PRICE_POINTS_CONTROLLER
                .listAllProductPricePoints(
                        filterByStartDatetimeOfProductCreation(builder -> builder.filterIds(List.of(1, 2, 3, 4, 5)))
                )
                .getPricePoints();

        // then
        assertThat(productPricePoints).isEmpty();
    }

    @Test
    void shouldReturnEmptyListWhenStartDateFilterDoesNotMatchCreatedAtTimeframe() throws IOException, ApiException {
        // when
        List<ProductPricePoint> productPricePoints = PRODUCT_PRICE_POINTS_CONTROLLER
                .listAllProductPricePoints(new ListAllProductPricePointsInput.Builder()
                        .filterDateField(BasicDateField.CREATED_AT)
                        .filterStartDate(LocalDate.parse("2030-01-01"))
                        .build()
                )
                .getPricePoints();

        // then
        assertThat(productPricePoints).isEmpty();
    }

    @Test
    void shouldReturnEmptyListWhenStartDateTimeFilterDoesNotMatchCreatedAtTimeframe() throws IOException, ApiException {
        // when
        List<ProductPricePoint> productPricePoints = PRODUCT_PRICE_POINTS_CONTROLLER
                .listAllProductPricePoints(new ListAllProductPricePointsInput.Builder()
                        .filterDateField(BasicDateField.CREATED_AT)
                        .filterStartDatetime(ZonedDateTime.parse("2030-01-01T00:00:00Z"))
                        .build()
                )
                .getPricePoints();

        // then
        assertThat(productPricePoints).isEmpty();
    }

    @Test
    void shouldReturnListWithPricePointOfTypeCatalog() throws IOException, ApiException {
        // when
        List<ProductPricePoint> customPricePoints = PRODUCT_PRICE_POINTS_CONTROLLER
                .listAllProductPricePoints(
                        filterByStartDatetimeOfProductCreation(builder -> builder.filterType(List.of(PricePointType.CATALOG)))
                )
                .getPricePoints();

        // then
        assertThat(customPricePoints)
                .hasSize(3)
                .usingRecursiveFieldByFieldElementComparator()
                .isEqualTo(PRODUCT_PRICE_POINTS_OF_TYPE_CATALOG);
    }

    @Test
    void shouldReturnListWithPagedPricePoints() throws IOException, ApiException {
        // when
        List<ProductPricePoint> page1 = PRODUCT_PRICE_POINTS_CONTROLLER
                .listAllProductPricePoints(
                        filterByStartDatetimeOfProductCreation(builder -> builder.page(1).perPage(2))
                )
                .getPricePoints();
        List<ProductPricePoint> page2 = PRODUCT_PRICE_POINTS_CONTROLLER
                .listAllProductPricePoints(
                        filterByStartDatetimeOfProductCreation(builder -> builder.page(2).perPage(2))
                )
                .getPricePoints();
        List<ProductPricePoint> page3 = PRODUCT_PRICE_POINTS_CONTROLLER
                .listAllProductPricePoints(
                        filterByStartDatetimeOfProductCreation(builder -> builder.page(3).perPage(2))
                )
                .getPricePoints();

        // then
        assertThat(page1).hasSize(2);
        assertThat(page2).hasSize(2);
        assertThat(page3).hasSize(0);
    }

    private ListAllProductPricePointsInput filterByStartDatetimeOfProductCreation(Consumer<ListAllProductPricePointsInput.Builder> customizer) {
        ListAllProductPricePointsInput.Builder builder = new ListAllProductPricePointsInput.Builder()
                // filtering by product's createdAt to skip potential leftovers from other tests
                .filterDateField(BasicDateField.CREATED_AT)
                .filterStartDatetime(product.getCreatedAt());
        customizer.accept(builder);
        return builder.build();
    }
}
