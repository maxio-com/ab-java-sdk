package com.maxio.advancedbilling.controllers.products;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.models.CreateOrUpdateProduct;
import com.maxio.advancedbilling.models.CreateOrUpdateProductRequest;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductResponse;
import com.maxio.advancedbilling.models.containers.CustomerErrorResponseErrors;
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

public class ProductsControllerUpdateProductTest extends ProductsControllerTestBase {

    @Test
    void shouldUpdateProductWithAllParameters() throws IOException, ApiException {
        // when
        Instant timestamp = Instant.now().minus(5, ChronoUnit.SECONDS);
        Product product = createProduct();

        Product updatedProduct = productsController.updateProduct(product.getId(), new CreateOrUpdateProductRequest(
                new CreateOrUpdateProduct()
                        .toBuilder()
                        .name("Updated Product")
                        .handle("updated_handle")
                        .description("Updated Description")
                        .priceInCents(2000)
                        .interval(2)
                        .intervalUnit(IntervalUnit.DAY.value())

                        .accountingCode("acccode")
                        .taxCode("taxcode")
                        .requireCreditCard(true)
                        .build()
        )).getProduct();
        // then
        assertAll(
                () -> assertThat(updatedProduct.getId()).isEqualTo(product.getId()),
                () -> assertThat(updatedProduct.getName()).isEqualTo("Updated Product"),
                () -> assertThat(updatedProduct.getHandle()).isEqualTo("updated_handle"),
                () -> assertThat(updatedProduct.getDescription()).isEqualTo("Updated Description"),
                () -> assertThat(updatedProduct.getPriceInCents()).isEqualTo(2000),
                () -> assertThat(updatedProduct.getInterval()).isEqualTo(2),
                () -> assertThat(updatedProduct.getIntervalUnit().match(i -> i).value()).isEqualTo(IntervalUnit.DAY.value()),
                () -> assertThat(parseStringTimestamp(updatedProduct.getCreatedAt())).isAfterOrEqualTo(timestamp),
                () -> assertThat(parseStringTimestamp(updatedProduct.getUpdatedAt())).isAfterOrEqualTo(timestamp),
                () -> assertThat(updatedProduct.getAccountingCode()).isEqualTo("acccode"),
                () -> assertThat(updatedProduct.getRequestCreditCard()).isTrue(),
                () -> assertThat(updatedProduct.getTaxCode()).isEqualTo("taxcode"),

                () -> assertThat(updatedProduct.getExpirationInterval()).isNull(),
                () -> assertThat(updatedProduct.getExpirationIntervalUnit()).isNull(),
                () -> assertThat(updatedProduct.getInitialChargeInCents()).isNull(),
                () -> assertThat(updatedProduct.getTrialPriceInCents()).isNull(),
                () -> assertThat(updatedProduct.getTrialInterval()).isNull(),
                () -> assertThat(updatedProduct.getTrialIntervalUnit()).isNull(),
                () -> assertThat(updatedProduct.getArchivedAt()).isNull(),
                () -> assertThat(updatedProduct.getRequireCreditCard()).isTrue(),
                () -> assertThat(updatedProduct.getReturnParams()).isNull(),
                () -> assertThat(updatedProduct.getTaxable()).isFalse(),
                () -> assertThat(updatedProduct.getUpdateReturnUrl()).isNull(),
                () -> assertThat(updatedProduct.getInitialChargeAfterTrial()).isFalse(),
                () -> assertThat(updatedProduct.getVersionNumber()).isEqualTo(1),
                () -> assertThat(updatedProduct.getUpdateReturnParams()).isNull(),
                () -> assertThat(updatedProduct.getProductPricePointName()).isEqualTo("Default"),
                () -> assertThat(updatedProduct.getRequestBillingAddress()).isFalse(),
                () -> assertThat(updatedProduct.getRequireBillingAddress()).isFalse(),
                () -> assertThat(updatedProduct.getRequireShippingAddress()).isFalse(),
                () -> assertThat(updatedProduct.getDefaultProductPricePointId()).isPositive(),
                () -> assertThat(updatedProduct.getUseSiteExchangeRate()).isTrue(),
                () -> assertThat(updatedProduct.getItemCategory()).isNull(),
                () -> assertThat(updatedProduct.getProductPricePointId()).isPositive(),
                () -> assertThat(updatedProduct.getProductPricePointHandle()).isNotEmpty(),

                () -> assertThat(updatedProduct.getProductFamily()).isNotNull(),
                () -> assertThat(updatedProduct.getProductFamily().getId()).isEqualTo(productFamily.getId()),
                () -> assertThat(updatedProduct.getProductFamily().getName()).isEqualTo(productFamily.getName()),
                () -> assertThat(updatedProduct.getProductFamily().getHandle()).isEqualTo(productFamily.getHandle()),
                () -> assertThat(updatedProduct.getProductFamily().getAccountingCode()).isEqualTo(productFamily.getAccountingCode()),
                () -> assertThat(updatedProduct.getProductFamily().getDescription()).isEqualTo(productFamily.getDescription()),
                () -> assertThat(updatedProduct.getProductFamily().getCreatedAt()).isEqualTo(productFamily.getCreatedAt()),
                () -> assertThat(updatedProduct.getProductFamily().getUpdatedAt()).isEqualTo(productFamily.getUpdatedAt())
        );
    }

    @Test
    void shouldNotUpdateProductHandleToHandleOfExistingProduct() throws IOException, ApiException {
        // when
        Product product1 = createProduct();
        Product product2 = createProduct();

        // then
        String expectedErrorMessage = String.format(
                "API Handle: must be unique - '%s' has been taken by another Product in this Site.",
                product1.getHandle());
        assertThatExceptionOfType(ErrorListResponseException.class)
                .isThrownBy(() -> productsController.updateProduct(
                        product2.getId(), new CreateOrUpdateProductRequest(
                                new CreateOrUpdateProduct()
                                        .toBuilder()
                                        .name("Updated Product")
                                        .handle(product1.getHandle())
                                        .description("Updated Description")
                                        .priceInCents(2000)
                                        .interval(2)
                                        .intervalUnit(IntervalUnit.DAY.value())
                                        .build()
                        ))
                )
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getErrors()).hasSameElementsAs(Collections.singletonList(expectedErrorMessage));

                });
    }

    @ParameterizedTest
    @MethodSource("argsForShouldNotUpdateProductWithBlankBasicParameters")
    void shouldNotUpdateProductWithBlankBasicParameters(CreateOrUpdateProduct updateProduct, List<String> errorMessages) throws IOException, ApiException {
        // when - then
        Product product = createProduct();
        assertThatExceptionOfType(ErrorListResponseException.class)
                .isThrownBy(() -> productsController.updateProduct(
                        product.getId(), new CreateOrUpdateProductRequest(updateProduct))
                )
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getErrors().toString())
                            .isEqualTo(CustomerErrorResponseErrors.fromListOfString(errorMessages).toString());
                });
    }

    @Test
    void shouldNotUpdateNotOwnedProduct() throws IOException, ApiException {
        // when-then
        ProductResponse productResponse = productsController.updateProduct(999999, new CreateOrUpdateProductRequest());
        assertThat(productResponse).isNull();
    }

    private static Stream<Arguments> argsForShouldNotUpdateProductWithBlankBasicParameters() {
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
                )
        );
    }

}
