package com.maxio.advancedbilling.productfamilies;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.ProductFamiliesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateProductFamily;
import com.maxio.advancedbilling.models.CreateProductFamilyRequest;
import com.maxio.advancedbilling.models.ProductFamily;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductFamiliesControllerCreateTest {
    private final AdvancedBillingClient client = TestClientProvider.getClient();
    private final ProductFamiliesController productFamiliesController = client.getProductFamiliesController();

    @Test
    void shouldCreateProductFamily() throws ApiException, IOException {
        // given
        String handle = "product-families-test-" + randomAlphabetic(10).toLowerCase();
        String name = "product families test " + randomAlphabetic(10).toLowerCase();

        // when
        ProductFamily productFamily = productFamiliesController.createProductFamily(
                new CreateProductFamilyRequest(new CreateProductFamily(name, handle, "description"))
        ).getProductFamily();

        // then
        assertThat(productFamily.getId()).isNotNull();
        assertThat(productFamily.getName()).isEqualTo(name);
        assertThat(productFamily.getHandle()).isEqualTo(handle);
        assertThat(productFamily.getAccountingCode()).isNull();
        assertThat(productFamily.getDescription()).isEqualTo("description");
        assertThat(productFamily.getCreatedAt())
                .isNotNull()
                .isEqualTo(productFamily.getUpdatedAt());
    }

    @Test
    void shouldCreateProductFamilyWithoutDescription() throws ApiException, IOException {
        // given
        String handle = "product-families-test-no-description-" + randomAlphabetic(10).toLowerCase();
        String name = "product families test no description" + randomAlphabetic(10).toLowerCase();

        // when
        ProductFamily productFamily = productFamiliesController.createProductFamily(
                new CreateProductFamilyRequest(new CreateProductFamily(name, handle, null))
        ).getProductFamily();

        // then
        assertThat(productFamily.getId()).isNotNull();
        assertThat(productFamily.getName()).isEqualTo(name);
        assertThat(productFamily.getHandle()).isEqualTo(handle);
        assertThat(productFamily.getAccountingCode()).isNull();
        assertThat(productFamily.getDescription()).isNull();
        assertThat(productFamily.getCreatedAt())
                .isNotNull()
                .isEqualTo(productFamily.getUpdatedAt());
    }

    @Test
    void shouldThrowExceptionIfHandleIsDuplicated() throws ApiException, IOException {
        // given
        String handle = "product-families-test-duplicate-" + randomAlphabetic(10).toLowerCase();
        String name = "product families test duplicate " + randomAlphabetic(10).toLowerCase();
        CreateProductFamilyRequest body = new CreateProductFamilyRequest(new CreateProductFamily(name, handle, null));
        productFamiliesController.createProductFamily(body);

        // when then
        assertThatErrorListResponse(() -> productFamiliesController.createProductFamily(body))
                .hasErrorCode(422)
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:[API Handle: must be unique - that value has been taken.]}'.")
                .hasErrors("API Handle: must be unique - that value has been taken.");
    }

    @Test
    void shouldThrowExceptionIfNameIsBlank() {
        // given
        CreateProductFamilyRequest body = new CreateProductFamilyRequest(new CreateProductFamily(null, null, null));

        // when then
        assertThatErrorListResponse(() -> productFamiliesController.createProductFamily(body))
                .hasErrorCode(422)
                .hasMessage("HTTP Response Not OK. Status code: 422. Response: '{errors:[Name: cannot be blank.]}'.")
                .hasErrors("Name: cannot be blank.");
    }

    @Test
    void shouldThrowExceptionOnInvalidCredentials() {
        // when - then
        assertUnauthorized(() -> TestClientProvider.createInvalidCredentialsClient().getProductFamiliesController()
                .createProductFamily(new CreateProductFamilyRequest(
                        new CreateProductFamily("test product family invalid credentials", null, null)
                )));
    }

}
