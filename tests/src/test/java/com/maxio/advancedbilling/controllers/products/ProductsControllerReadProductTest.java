package com.maxio.advancedbilling.controllers.products;

import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Product;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.maxio.advancedbilling.utils.CommonAssertions.assertNotFound;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ProductsControllerReadProductTest extends ProductsControllerTestBase {

    @Test
    void shouldReadProduct() throws IOException, ApiException {
        // given
        Product product = createProduct();

        // when
        Product readProduct = productsController.readProduct(product.getId()).getProduct();

        // then
        assertAll(
                () -> assertThat(readProduct.getName()).isEqualTo(product.getName()),
                () -> assertThat(readProduct.getHandle()).isEqualTo(product.getHandle()),
                () -> assertThat(readProduct.getDescription()).isEqualTo("A sample product for testing"),
                () -> assertThat(readProduct.getPriceInCents()).isEqualTo(1000),
                () -> assertThat(readProduct.getInterval()).isEqualTo(1),
                () -> assertThat(readProduct.getIntervalUnit().match(i -> i).value()).isEqualTo(IntervalUnit.MONTH.value()),

                () -> assertThat(readProduct.getId()).isNotNull(),
                () -> assertThat(readProduct.getCreatedAt()).isEqualTo(product.getCreatedAt()),
                () -> assertThat(readProduct.getUpdatedAt()).isEqualTo(product.getUpdatedAt()),

                () -> assertThat(readProduct.getAccountingCode()).isEqualTo(product.getAccountingCode()),
                () -> assertThat(readProduct.getRequestCreditCard()).isEqualTo(product.getRequestCreditCard()),
                () -> assertThat(readProduct.getExpirationInterval()).isEqualTo(product.getExpirationInterval()),
                () -> assertThat(readProduct.getExpirationIntervalUnit()).isEqualTo(product.getExpirationIntervalUnit()),
                () -> assertThat(readProduct.getInitialChargeInCents()).isEqualTo(product.getInitialChargeInCents()),
                () -> assertThat(readProduct.getTrialPriceInCents()).isEqualTo(product.getTrialPriceInCents()),
                () -> assertThat(readProduct.getTrialInterval()).isEqualTo(product.getTrialInterval()),
                () -> assertThat(readProduct.getTrialIntervalUnit()).isEqualTo(product.getTrialIntervalUnit()),
                () -> assertThat(readProduct.getArchivedAt()).isEqualTo(product.getArchivedAt()),
                () -> assertThat(readProduct.getRequireCreditCard()).isEqualTo(product.getRequireCreditCard()),
                () -> assertThat(readProduct.getReturnParams()).isEqualTo(product.getReturnParams()),
                () -> assertThat(readProduct.getTaxable()).isEqualTo(product.getTaxable()),
                () -> assertThat(readProduct.getUpdateReturnUrl()).isEqualTo(product.getUpdateReturnUrl()),
                () -> assertThat(readProduct.getInitialChargeAfterTrial()).isEqualTo(product.getInitialChargeAfterTrial()),
                () -> assertThat(readProduct.getVersionNumber()).isEqualTo(product.getVersionNumber()),
                () -> assertThat(readProduct.getUpdateReturnParams()).isEqualTo(product.getUpdateReturnParams()),
                () -> assertThat(readProduct.getProductPricePointName()).isEqualTo(product.getProductPricePointName()),
                () -> assertThat(readProduct.getRequestBillingAddress()).isEqualTo(product.getRequestBillingAddress()),
                () -> assertThat(readProduct.getRequireBillingAddress()).isEqualTo(product.getRequireBillingAddress()),
                () -> assertThat(readProduct.getRequireShippingAddress()).isEqualTo(product.getRequireShippingAddress()),
                () -> assertThat(readProduct.getTaxCode()).isEqualTo(product.getTaxCode()),
                () -> assertThat(readProduct.getDefaultProductPricePointId()).isEqualTo(product.getDefaultProductPricePointId()),
                () -> assertThat(readProduct.getUseSiteExchangeRate()).isEqualTo(product.getUseSiteExchangeRate()),
                () -> assertThat(readProduct.getItemCategory()).isEqualTo(product.getItemCategory()),
                () -> assertThat(readProduct.getProductPricePointId()).isEqualTo(product.getProductPricePointId()),
                () -> assertThat(readProduct.getProductPricePointHandle()).isEqualTo(product.getProductPricePointHandle()),

                () -> assertThat(readProduct.getProductFamily().getId()).isEqualTo(productFamily.getId()),
                () -> assertThat(readProduct.getProductFamily().getName()).isEqualTo(productFamily.getName()),
                () -> assertThat(readProduct.getProductFamily().getHandle()).isEqualTo(productFamily.getHandle()),
                () -> assertThat(readProduct.getProductFamily().getAccountingCode()).isEqualTo(productFamily.getAccountingCode()),
                () -> assertThat(readProduct.getProductFamily().getDescription()).isEqualTo(productFamily.getDescription()),
                () -> assertThat(readProduct.getProductFamily().getCreatedAt()).isEqualTo(productFamily.getCreatedAt()),
                () -> assertThat(readProduct.getProductFamily().getUpdatedAt()).isEqualTo(productFamily.getUpdatedAt()),

                () -> assertThat(readProduct.getPublicSignupPages()).isEmpty()
        );
    }

    @Test
    void shouldNotArchiveNotOwnedProduct() {
        // when-then
        assertNotFound(() -> productsController.readProduct(99999999));
    }

}
