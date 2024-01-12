package com.maxio.advancedbilling.controllers.products;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZonedDateTime;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductsControllerArchiveProductTest extends ProductsControllerTestBase {

    @Test
    void shouldArchiveProduct() throws IOException, ApiException {
        // given
        Product product = createProduct();

        // when
        ZonedDateTime timestamp = ZonedDateTime.now().minusSeconds(5);
        productsController.archiveProduct(product.getId());

        // then
        Product archivedProduct = productsController.readProduct(product.getId()).getProduct();
        assertAll(
                () -> assertThat(archivedProduct.getId()).isEqualTo(product.getId()),
                () -> assertThat(archivedProduct.getArchivedAt()).isNotNull(),
                () -> assertTrue(archivedProduct.getArchivedAt().isAfter(timestamp))
        );
    }

    @Test
    void shouldNotArchiveSameProductTwice() throws IOException, ApiException {
        // given
        Product product = createProduct();

        // when
        productsController.archiveProduct(product.getId());

        // then
        CommonAssertions
                .assertThatErrorListResponse(() -> productsController.archiveProduct(product.getId()))
                .isUnprocessableEntity()
                .hasErrors("Product cannot be archived.");
    }

    @Test
    void shouldNotArchiveNotOwnedProduct() {
        // when - then
        assertNotFound(() -> productsController.archiveProduct(99999999));
    }

}
