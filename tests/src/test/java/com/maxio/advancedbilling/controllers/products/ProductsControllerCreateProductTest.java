package com.maxio.advancedbilling.controllers.products;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateOrUpdateProduct;
import com.maxio.advancedbilling.models.CreateOrUpdateProductRequest;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.utils.assertions.ApiExceptionAssert;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ProductsControllerCreateProductTest extends ProductsControllerTestBase {

    @Test
    void shouldCreateProductWhenOnlyRequiredParametersAreProvided() throws IOException, ApiException {
        // when
        ZonedDateTime timestamp = ZonedDateTime.now().minusSeconds(5);
        String handle = "washington-" + RandomStringUtils.randomAlphanumeric(5).toLowerCase();
        Product product = productsController
                .createProduct(String.valueOf(productFamily.getId()), new CreateOrUpdateProductRequest(
                        new CreateOrUpdateProduct.Builder()
                                .name("Sample product")
                                .handle(handle)
                                .description("A sample product for testing")
                                .priceInCents(1000)
                                .interval(1)
                                .intervalUnit(IntervalUnit.MONTH)
                                .requireCreditCard(true)
                                .build()
                ))
                .getProduct();

        // then
        assertAll(
                () -> assertThat(product.getName()).isEqualTo("Sample product"),
                () -> assertThat(product.getHandle()).isEqualTo(handle),
                () -> assertThat(product.getDescription()).isEqualTo("A sample product for testing"),
                () -> assertThat(product.getPriceInCents()).isEqualTo(1000),
                () -> assertThat(product.getInterval()).isEqualTo(1),
                () -> assertThat(product.getIntervalUnit()).isEqualTo(IntervalUnit.MONTH),

                () -> assertThat(product.getId()).isNotNull(),
                () -> assertThat(product.getCreatedAt()).isAfterOrEqualTo(timestamp),
                () -> assertThat(product.getUpdatedAt()).isAfterOrEqualTo(timestamp),

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
        ZonedDateTime timestamp = ZonedDateTime.now().minusSeconds(5);
        String handle = "washington-" + RandomStringUtils.randomAlphanumeric(5).toLowerCase();
        Product product = productsController
                .createProduct(String.valueOf(productFamily.getId()), new CreateOrUpdateProductRequest(
                        new CreateOrUpdateProduct.Builder()
                                .name("Sample product full")
                                .handle(handle)
                                .description("A sample product for testing")
                                .priceInCents(1000)
                                .interval(1)
                                .intervalUnit(IntervalUnit.MONTH)
                                .requireCreditCard(true)
                                .accountingCode("code")
                                .autoCreateSignupPage(true)
                                .taxCode("taxcode")
                                .build()
                ))
                .getProduct();
        // then
        assertAll(
                () -> assertThat(product.getName()).isEqualTo("Sample product full"),
                () -> assertThat(product.getHandle()).isEqualTo(handle),
                () -> assertThat(product.getDescription()).isEqualTo("A sample product for testing"),
                () -> assertThat(product.getPriceInCents()).isEqualTo(1000),
                () -> assertThat(product.getInterval()).isEqualTo(1),
                () -> assertThat(product.getIntervalUnit()).isEqualTo(IntervalUnit.MONTH),
                () -> assertThat(product.getTaxCode()).isEqualTo("taxcode"),
                () -> assertThat(product.getAccountingCode()).isEqualTo("code"),

                () -> assertThat(product.getId()).isNotNull(),
                () -> assertThat(product.getCreatedAt()).isAfterOrEqualTo(timestamp),
                () -> assertThat(product.getUpdatedAt()).isAfterOrEqualTo(timestamp),

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
        CreateOrUpdateProduct createOrUpdateProduct = new CreateOrUpdateProduct.Builder()
                .name("Sample product full")
                .handle(handle)
                .priceInCents(1000)
                .interval(1)
                .intervalUnit(IntervalUnit.MONTH)
                .build();
        productsController.createProduct(String.valueOf(productFamily.getId()), new CreateOrUpdateProductRequest(createOrUpdateProduct));

        // then
        CommonAssertions
                .assertThatErrorListResponse(() -> productsController
                        .createProduct(String.valueOf(productFamily.getId()), new CreateOrUpdateProductRequest(createOrUpdateProduct))
                )
                .isUnprocessableEntity()
                .hasErrors("API Handle: must be unique - '%s' has been taken by another Product in this Site.".formatted(handle));
    }

    @ParameterizedTest
    @MethodSource("argsForShouldNotCreateProductWhenBasicParametersAreBlank")
    void shouldNotCreateProductWhenBasicParametersAreBlank(CreateOrUpdateProduct createProduct, String[] errorMessages) {
        // when - then
        CommonAssertions
                .assertThatErrorListResponse(() -> productsController.createProduct(
                        String.valueOf(productFamily.getId()), new CreateOrUpdateProductRequest(createProduct))
                )
                .isUnprocessableEntity()
                .hasErrors(errorMessages);
    }

    private Stream<Arguments> argsForShouldNotCreateProductWhenBasicParametersAreBlank() {
        CreateOrUpdateProduct productTemplate = new CreateOrUpdateProduct.Builder()
                .name("test-name")
                .handle("product-handle-test")
                .description("test description")
                .priceInCents(11)
                .interval(1)
                .intervalUnit(IntervalUnit.MONTH)
                .build();
        return Stream.of(
                Arguments.of(
                        productTemplate.toBuilder().name(null).build(),
                        new String[]{"Name: cannot be blank."}
                ),
                Arguments.of(
                        productTemplate.toBuilder().intervalUnit(null).build(),
                        new String[]{"Interval unit: cannot be blank.", "Interval unit: must be 'month' or 'day'."}
                ),
                Arguments.of(
                        productTemplate.toBuilder().handle("VERY INVALID HANDLE").build(),
                        new String[]{"API Handle: may only contain lowercase letters, numbers, underscores, and dashes"}
                ),
                Arguments.of(
                        new CreateOrUpdateProduct(),
                        new String[]{
                                "Name: cannot be blank.",
                                "Recurring Interval: must be greater than or equal to 1.",
                                "Interval unit: cannot be blank.",
                                "Interval unit: must be 'month' or 'day'."
                        }
                )
        );
    }

    @Test
    void shouldNotCreateProductForNotOwnedProductFamily() {
        // given
        String handle = "washington-" + RandomStringUtils.randomAlphanumeric(5).toLowerCase();
        CreateOrUpdateProduct createOrUpdateProduct = new CreateOrUpdateProduct.Builder()
                .name("Sample product full")
                .handle(handle)
                .priceInCents(1000)
                .interval(1)
                .intervalUnit(IntervalUnit.MONTH)
                .build();

        // when - then
        new ApiExceptionAssert<>(() -> productsController
                .createProduct("999999", new CreateOrUpdateProductRequest(createOrUpdateProduct)))
                .hasErrorCode(403)
                .hasMessageStartingWithHttpNotOk();
    }
}
