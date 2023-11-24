package com.maxio.advancedbilling.controllers.products;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.ErrorListResponseException;
import com.maxio.advancedbilling.models.Product;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.Instant;

import static com.maxio.advancedbilling.utils.CommonAssertions.assertNotFound;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ProductsControllerArchiveProductTest extends ProductsControllerTestBase {

    @Test
    void shouldArchiveProduct() throws IOException, ApiException {
        // given
        Product product = createProduct();

        // when
        String timestamp = Instant.now().toString();
        productsController.archiveProduct(product.getId());

        // then
        Product archivedProduct = productsController.readProduct(product.getId()).getProduct();
        assertAll(
                () -> assertThat(archivedProduct.getId()).isEqualTo(product.getId()),
                () -> assertThat(archivedProduct.getArchivedAt()).isNotNull(),
                () -> assertThat(archivedProduct.getArchivedAt()).isAfterOrEqualTo(timestamp)
        );
    }

    @Test
    void shouldNotArchiveSameProductTwice() throws IOException, ApiException {
        // given
        Product product = createProduct();

        // when
        productsController.archiveProduct(product.getId());

        // then
        assertThatExceptionOfType(ErrorListResponseException.class)
                .isThrownBy(() -> productsController.archiveProduct(product.getId())
                )
                .withMessage("Unprocessable Entity (WebDAV)")
                .satisfies(e -> {
                    assertThat(e.getResponseCode()).isEqualTo(422);
                    assertThat(e.getErrors()).containsExactlyInAnyOrder("Product cannot be archived.");
                });
    }

    @Test
    void shouldNotArchiveNotOwnedProduct() {
        // when-then
        assertNotFound(() -> productsController.archiveProduct(99999999));
    }

}
