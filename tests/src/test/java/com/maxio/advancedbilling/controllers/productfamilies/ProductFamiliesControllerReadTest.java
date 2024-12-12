package com.maxio.advancedbilling.controllers.productfamilies;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.ProductFamiliesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateProductFamily;
import com.maxio.advancedbilling.models.CreateProductFamilyRequest;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ProductFamilyResponse;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertNotFound;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductFamiliesControllerReadTest {
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final ProductFamiliesController productFamiliesController = client.getProductFamiliesController();

    @Test
    void shouldReadProductFamily() throws ApiException, IOException {
        // given
        String handle = "product-families-read-" + randomAlphabetic(10).toLowerCase();
        String name = "product families test read " + randomAlphabetic(10).toLowerCase();

        ProductFamily productFamily = productFamiliesController.createProductFamily(
                new CreateProductFamilyRequest(new CreateProductFamily(name, handle, "description"))
        ).getProductFamily();

        // when
        ProductFamilyResponse readFamily = productFamiliesController.readProductFamily(productFamily.getId());

        // then
        assertThat(readFamily.getProductFamily())
                .usingRecursiveComparison()
                .isEqualTo(productFamily);
    }

    @Test
    void shouldReturn404IfProductFamilyDoesNotExist() {
        // when then
        assertNotFound(() -> productFamiliesController.readProductFamily(1));
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() throws IOException, ApiException {
        // given
        CreateProductFamilyRequest body = new CreateProductFamilyRequest(
                new CreateProductFamily("test read product family", null, null));
        ProductFamily productFamily = productFamiliesController.createProductFamily(body).getProductFamily();

        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getProductFamiliesController()
                .readProductFamily(productFamily.getId()));
    }

}
