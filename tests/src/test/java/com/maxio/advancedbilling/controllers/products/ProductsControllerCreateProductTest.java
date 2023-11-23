package com.maxio.advancedbilling.controllers.products;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.models.CreateOrUpdateProduct;
import com.maxio.advancedbilling.models.CreateOrUpdateProductRequest;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.containers.CustomerErrorResponseErrors;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.utils.TimeUtils.parseStringTimestamp;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ProductsControllerCreateProductTest extends ProductsControllerTestBase {

    @Test
    void shouldCreateProductWhenOnlyRequiredParametersAreProvided() throws IOException, ApiException {
        // when
        Instant timestamp = Instant.now().minus(5, ChronoUnit.SECONDS);
        String handle = "washington-" + RandomStringUtils.randomAlphanumeric(5).toLowerCase();
        Product product = productsController
                .createProduct(productFamily.getId(), new CreateOrUpdateProductRequest(
                        new CreateOrUpdateProduct()
                                .toBuilder()
                                .name("Sample product")
                                .handle(handle)
                                .description("A sample product for testing")
                                .priceInCents(1000)
                                .interval(1)
                                .intervalUnit("month")
                                .requireCreditCard(true)
                                .build()
                ))
                .getProduct();
        productsIds.add(product.getId());

        // then
        assertAll(
                () -> assertThat(product.getName()).isEqualTo("Sample product"),
                () -> assertThat(product.getHandle()).isEqualTo(handle),
                () -> assertThat(product.getDescription()).isEqualTo("A sample product for testing"),
                () -> assertThat(product.getPriceInCents()).isEqualTo(1000),
                () -> assertThat(product.getInterval()).isEqualTo(1),
                () -> assertThat(product.getIntervalUnit().match(i -> i).value()).isEqualTo(IntervalUnit.MONTH.value()),

                () -> assertThat(product.getId()).isNotNull(),
                () -> assertThat(parseStringTimestamp(product.getCreatedAt())).isAfterOrEqualTo(timestamp),
                () -> assertThat(parseStringTimestamp(product.getUpdatedAt())).isAfterOrEqualTo(timestamp),

                () -> assertThat(product.getAccountingCode()).isNull(),
                () -> assertThat(product.getRequestCreditCard()).isTrue(),
                () -> assertThat(product.getExpirationInterval()).isNull(),
                () -> assertThat(product.getExpirationIntervalUnit()).isNull(),
                () -> assertThat(product.getInitialChargeInCents()).isNull(),
                () -> assertThat(product.getTrialPriceInCents()).isNull(),
                () -> assertThat(product.getTrialInterval()).isNull(),
                () -> assertThat(product.getTrialIntervalUnit()).isNull(),
                () -> assertThat(product.getArchivedAt()).isNull(),
                () -> assertThat(product.getRequireCreditCard()).isTrue(),
                () -> assertThat(product.getReturnParams()).isNull(),
                () -> assertThat(product.getTaxable()).isFalse(),
                () -> assertThat(product.getUpdateReturnUrl()).isNull(),
                () -> assertThat(product.getInitialChargeAfterTrial()).isFalse(),
                () -> assertThat(product.getVersionNumber()).isEqualTo(1),
                () -> assertThat(product.getUpdateReturnParams()).isNull(),
                () -> assertThat(product.getProductPricePointName()).isEqualTo("Original"),
                () -> assertThat(product.getRequestBillingAddress()).isFalse(),
                () -> assertThat(product.getRequireBillingAddress()).isFalse(),
                () -> assertThat(product.getRequireShippingAddress()).isFalse(),
                () -> assertThat(product.getTaxCode()).isNull(),
                () -> assertThat(product.getDefaultProductPricePointId()).isPositive(),
                () -> assertThat(product.getUseSiteExchangeRate()).isTrue(),
                () -> assertThat(product.getItemCategory()).isNull(),
                () -> assertThat(product.getProductPricePointId()).isPositive(),
                () -> assertThat(product.getProductPricePointHandle()).isNotEmpty(),

                () -> assertThat(product.getProductFamily()).isNotNull(),
                () -> assertThat(product.getProductFamily().getId()).isEqualTo(productFamily.getId()),
                () -> assertThat(product.getProductFamily().getName()).isEqualTo(productFamily.getName()),
                () -> assertThat(product.getProductFamily().getHandle()).isEqualTo(productFamily.getHandle()),
                () -> assertThat(product.getProductFamily().getAccountingCode()).isEqualTo(productFamily.getAccountingCode()),
                () -> assertThat(product.getProductFamily().getDescription()).isEqualTo(productFamily.getDescription()),
                () -> assertThat(product.getProductFamily().getCreatedAt()).isEqualTo(productFamily.getCreatedAt()),
                () -> assertThat(product.getProductFamily().getUpdatedAt()).isEqualTo(productFamily.getUpdatedAt()),

                () -> assertThat(product.getPublicSignupPages()).isEmpty()
        );
    }

    @Test
    void shouldCreateProductWhenAllParametersAreProvided() throws IOException, ApiException {
        // when
        Instant timestamp = Instant.now().minus(5, ChronoUnit.SECONDS);
        String handle = "washington-" + RandomStringUtils.randomAlphanumeric(5).toLowerCase();
        Product product = productsController
                    .createProduct(productFamily.getId(), new CreateOrUpdateProductRequest(
                            new CreateOrUpdateProduct()
                                    .toBuilder()
                                    .name("Sample product full")
                                    .handle(handle)
                                    .description("A sample product for testing")
                                    .priceInCents(1000)
                                    .interval(1)
                                    .intervalUnit("month")
                                    .requireCreditCard(true)

                                    .accountingCode("code")
                                    .autoCreateSignupPage(true)
                                    .taxCode("taxcode")
                                    .build()
                    ))
                    .getProduct();
        productsIds.add(product.getId());
        // then
        assertAll(
                () -> assertThat(product.getName()).isEqualTo("Sample product full"),
                () -> assertThat(product.getHandle()).isEqualTo(handle),
                () -> assertThat(product.getDescription()).isEqualTo("A sample product for testing"),
                () -> assertThat(product.getPriceInCents()).isEqualTo(1000),
                () -> assertThat(product.getInterval()).isEqualTo(1),
                () -> assertThat(product.getIntervalUnit().match(i -> i).value()).isEqualTo(IntervalUnit.MONTH.value()),
                () -> assertThat(product.getTaxCode()).isEqualTo("taxcode"),
                () -> assertThat(product.getAccountingCode()).isEqualTo("code"),

                () -> assertThat(product.getId()).isNotNull(),
                () -> assertThat(parseStringTimestamp(product.getCreatedAt())).isAfterOrEqualTo(timestamp),
                () -> assertThat(parseStringTimestamp(product.getUpdatedAt())).isAfterOrEqualTo(timestamp),

                () -> assertThat(product.getRequestCreditCard()).isTrue(),
                () -> assertThat(product.getExpirationInterval()).isNull(),
                () -> assertThat(product.getExpirationIntervalUnit()).isNull(),
                () -> assertThat(product.getInitialChargeInCents()).isNull(),
                () -> assertThat(product.getTrialPriceInCents()).isNull(),
                () -> assertThat(product.getTrialInterval()).isNull(),
                () -> assertThat(product.getTrialIntervalUnit()).isNull(),
                () -> assertThat(product.getArchivedAt()).isNull(),
                () -> assertThat(product.getRequireCreditCard()).isTrue(),
                () -> assertThat(product.getReturnParams()).isNull(),
                () -> assertThat(product.getTaxable()).isFalse(),
                () -> assertThat(product.getUpdateReturnUrl()).isNull(),
                () -> assertThat(product.getInitialChargeAfterTrial()).isFalse(),
                () -> assertThat(product.getVersionNumber()).isEqualTo(1),
                () -> assertThat(product.getUpdateReturnParams()).isNull(),
                () -> assertThat(product.getProductPricePointName()).isEqualTo("Original"),
                () -> assertThat(product.getRequestBillingAddress()).isFalse(),
                () -> assertThat(product.getRequireBillingAddress()).isFalse(),
                () -> assertThat(product.getRequireShippingAddress()).isFalse(),
                () -> assertThat(product.getDefaultProductPricePointId()).isPositive(),
                () -> assertThat(product.getUseSiteExchangeRate()).isTrue(),
                () -> assertThat(product.getItemCategory()).isNull(),
                () -> assertThat(product.getProductPricePointId()).isPositive(),
                () -> assertThat(product.getProductPricePointHandle()).isNotEmpty(),

                () -> assertThat(product.getProductFamily()).isNotNull(),
                () -> assertThat(product.getProductFamily().getId()).isEqualTo(productFamily.getId()),
                () -> assertThat(product.getProductFamily().getName()).isEqualTo(productFamily.getName()),
                () -> assertThat(product.getProductFamily().getHandle()).isEqualTo(productFamily.getHandle()),
                () -> assertThat(product.getProductFamily().getAccountingCode()).isEqualTo(productFamily.getAccountingCode()),
                () -> assertThat(product.getProductFamily().getDescription()).isEqualTo(productFamily.getDescription()),
                () -> assertThat(product.getProductFamily().getCreatedAt()).isEqualTo(productFamily.getCreatedAt()),
                () -> assertThat(product.getProductFamily().getUpdatedAt()).isEqualTo(productFamily.getUpdatedAt()),

                () -> assertThat(product.getPublicSignupPages().size()).isEqualTo(1),
                () -> assertThat(product.getPublicSignupPages().get(0).getId()).isPositive(),
                () -> assertThat(product.getPublicSignupPages().get(0).getReturnUrl()).isNull(),
                () -> assertThat(product.getPublicSignupPages().get(0).getReturnParams()).isNull(),
                () -> assertThat(product.getPublicSignupPages().get(0).getUrl()).isNotEmpty()
                );
    }

    @Test
    void shouldNotCreateProductWithExistingHandle() throws IOException, ApiException {
        // when
        String handle = "washington-" + RandomStringUtils.randomAlphanumeric(5).toLowerCase();
        CreateOrUpdateProduct createOrUpdateProduct = new CreateOrUpdateProduct()
                .toBuilder()
                .name("Sample product full")
                .handle(handle)
                .priceInCents(1000)
                .interval(1)
                .intervalUnit("month")
                .build();
        Product product = productsController
                    .createProduct(productFamily.getId(), new CreateOrUpdateProductRequest(
                            createOrUpdateProduct
                    ))
                    .getProduct();
        productsIds.add(product.getId());
        // then
        String expectedErrorMessage = String.format(
                "API Handle: must be unique - '%s' has been taken by another Product in this Site.",
                handle);
        assertThatExceptionOfType(ErrorListResponseException.class)
                .isThrownBy(() -> productsController.createProduct(
                        productFamily.getId(), new CreateOrUpdateProductRequest(createOrUpdateProduct))
                )
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getErrors()).hasSameElementsAs(Collections.singletonList(expectedErrorMessage));
                });
    }

    @ParameterizedTest
    @MethodSource("argsForShouldNotCreateProductWhenBasicParametersAreBlank")
    void shouldNotCreateProductWhenBasicParametersAreBlank(CreateOrUpdateProduct createProduct, List<String> errorMessages) {
        // when - then
        assertThatExceptionOfType(ErrorListResponseException.class)
                .isThrownBy(() -> productsController.createProduct(
                        productFamily.getId(), new CreateOrUpdateProductRequest(createProduct))
                )
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getErrors().toString())
                            .isEqualTo(CustomerErrorResponseErrors.fromListOfString(errorMessages).toString());
                });
    }

    @Test
    void shouldNotCreateProductForNotOwnedProductFamily() {
        // when
        String handle = "washington-" + RandomStringUtils.randomAlphanumeric(5).toLowerCase();
        CreateOrUpdateProduct createOrUpdateProduct = new CreateOrUpdateProduct()
                .toBuilder()
                .name("Sample product full")
                .handle(handle)
                .priceInCents(1000)
                .interval(1)
                .intervalUnit("month")
                .build();

        // then
        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(() -> productsController
                        .createProduct(999999, new CreateOrUpdateProductRequest(
                                createOrUpdateProduct
                        ))
                )
                .withMessage("HTTP Response Not OK")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(403);
                    assertThat(e.getHttpContext().getResponse().getBody()).isEqualTo("A valid product family id is required");
                });
    }

    private static Stream<Arguments> argsForShouldNotCreateProductWhenBasicParametersAreBlank() {
        CreateOrUpdateProduct customerTemplate = new CreateOrUpdateProduct().toBuilder().name("test-name").handle("product-handle-test")
                .description("test description").priceInCents(11).interval(1).intervalUnit("month").build();
        return Stream.of(
                Arguments.of(
                        customerTemplate.toBuilder().name(null).build(), Collections.singletonList("Name: cannot be blank.")
                ),
                Arguments.of(
                        customerTemplate.toBuilder().intervalUnit(null).build(), List.of("Interval unit: cannot be blank.",
                                "Interval unit: must be 'month' or 'day'.")
                ),
                Arguments.of(
                        customerTemplate.toBuilder().handle("VERY INVALID HANDLE").build(),
                        List.of("API Handle: may only contain lowercase letters, numbers, underscores, and dashes")
                ),
                Arguments.of(
                        new CreateOrUpdateProduct(),
                        List.of("Name: cannot be blank.",
                                "Recurring Interval: must be greater than or equal to 1.",
                                "Interval unit: cannot be blank.",
                                "Interval unit: must be 'month' or 'day'.")
                )
        );
    }

}
