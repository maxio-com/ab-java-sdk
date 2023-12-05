package com.maxio.advancedbilling.controllers.products;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Product;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductsControllerReadProductByHandleTest extends ProductsControllerTestBase {

    @Test
    void shouldReadProduct() throws IOException, ApiException {
        // given
        Product product = createProduct();

        // when
        Product readProduct = productsController.readProductByHandle(product.getHandle()).getProduct();

        // then
        assertThat(readProduct).usingRecursiveComparison().isEqualTo(product);
    }

    @Test
    void shouldNotReadNotOwnedProduct() {
        // when-then
        assertNotFound(() -> productsController.readProductByHandle("abc"));
    }

}
