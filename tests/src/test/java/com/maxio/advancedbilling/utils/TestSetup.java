package com.maxio.advancedbilling.utils;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentKindPath;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CreateCustomer;
import com.maxio.advancedbilling.models.CreateCustomerRequest;
import com.maxio.advancedbilling.models.CreateMeteredComponent;
import com.maxio.advancedbilling.models.CreateOrUpdateCoupon;
import com.maxio.advancedbilling.models.CreateOrUpdatePercentageCoupon;
import com.maxio.advancedbilling.models.CreateOrUpdateProduct;
import com.maxio.advancedbilling.models.CreateOrUpdateProductRequest;
import com.maxio.advancedbilling.models.CreateProductFamily;
import com.maxio.advancedbilling.models.CreateProductFamilyRequest;
import com.maxio.advancedbilling.models.CreateQuantityBasedComponent;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.MeteredComponent;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.QuantityBasedComponent;
import com.maxio.advancedbilling.models.containers.CreateComponentBody;
import com.maxio.advancedbilling.models.containers.CreateOrUpdateCouponCoupon;
import com.maxio.advancedbilling.models.containers.CreateOrUpdatePercentageCouponPercentage;
import com.maxio.advancedbilling.models.containers.MeteredComponentUnitPrice;
import com.maxio.advancedbilling.models.containers.QuantityBasedComponentUnitPrice;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.IOException;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class TestSetup {
    private final AdvancedBillingClient advancedBillingClient = TestClient.createClient();

    public ProductFamily createProductFamily() throws IOException, ApiException {
        return advancedBillingClient.getProductFamiliesController()
                .createProductFamily(new CreateProductFamilyRequest(
                        new CreateProductFamily.Builder().name("Test Product Family " + randomNumeric(5)).build())
                )
                .getProductFamily();
    }

    public Product createProduct(ProductFamily productFamily) throws IOException, ApiException {
        String productName = "My Super Product " + randomNumeric(5);
        String handle = productName.toLowerCase().replace(" ", "-");
        return advancedBillingClient.getProductsController()
                .createProduct(
                        productFamily.getId(),
                        new CreateOrUpdateProductRequest(
                                new CreateOrUpdateProduct.Builder()
                                        .name(productName)
                                        .handle(handle)
                                        .intervalUnit(IntervalUnit.MONTH)
                                        .interval(1)
                                        .requireCreditCard(false)
                                        .build()
                        ))
                .getProduct();
    }

    public Component createMeteredComponent(ProductFamily productFamily, double unitPrice) throws IOException, ApiException {
        String componentName = "Test Metered Component " + randomNumeric(5);
        String handle = componentName.toLowerCase().replace(" ", "-") + randomNumeric(5);
        return advancedBillingClient.getComponentsController()
                .createComponent(
                        productFamily.getId(),
                        ComponentKindPath.METERED_COMPONENTS,
                        CreateComponentBody.fromCreateMeteredComponent(
                                new CreateMeteredComponent(
                                        new MeteredComponent.Builder()
                                                .name(componentName)
                                                .handle(handle)
                                                .unitName("unit")
                                                .unitPrice(MeteredComponentUnitPrice.fromPrecision(unitPrice))
                                                .description("Description for: " + componentName)
                                                .allowFractionalQuantities(false)
                                                .pricingScheme(PricingScheme.PER_UNIT)
                                                .build()
                                )
                        )
                ).getComponent();
    }

    public Component createQuantityBasedComponent(int productFamilyId) throws IOException, ApiException {
        String seed = RandomStringUtils.randomAlphanumeric(5).toLowerCase();
        QuantityBasedComponent quantityBasedComponent = new QuantityBasedComponent.Builder()
                .name("testcomponent-" + seed)
                .handle("test-handle-" + seed)
                .unitName("unit")
                .pricingScheme(PricingScheme.PER_UNIT)
                .unitPrice(QuantityBasedComponentUnitPrice.fromPrecision(1.0))
                .build();
        CreateQuantityBasedComponent createQuantityBasedComponent = new CreateQuantityBasedComponent(quantityBasedComponent);

        return advancedBillingClient.getComponentsController().createComponent(productFamilyId,
                        ComponentKindPath.QUANTITY_BASED_COMPONENTS,
                        CreateComponentBody.fromCreateQuantityBasedComponent(createQuantityBasedComponent))
                .getComponent();
    }

    public Customer createCustomer() throws IOException, ApiException {
        String firstName = "John" + randomNumeric(2);
        String lastName = "Doe" + randomNumeric(2);
        String reference = firstName + "_" + lastName;
        reference = reference.toLowerCase();

        return advancedBillingClient.getCustomersController()
                .createCustomer(
                        new CreateCustomerRequest(
                                new CreateCustomer.Builder()
                                        .firstName(firstName)
                                        .lastName(lastName)
                                        .email("john.doe+test" + randomNumeric(5) + "@maxio.com")
                                        .ccEmails("ccemail" + randomNumeric(5) + "@maxio.com")
                                        .organization("Maxio Org " + randomNumeric(5))
                                        .reference(reference)
                                        .address("Maple Street " + randomNumeric(5))
                                        .address2("Address2 line" + randomNumeric(2))
                                        .city("New York")
                                        .state("NY")
                                        .zip("111-11")
                                        .country("USA")
                                        .phone(randomNumeric(9))
                                        .locale("es-MX")
                                        .build()
                        )).getCustomer();
    }

    public Coupon createPercentageCoupon(ProductFamily productFamily, String percentage) throws IOException, ApiException {
        return advancedBillingClient.getCouponsController()
                .createCoupon(productFamily.getId(), new CreateOrUpdateCoupon.Builder()
                        .coupon(CreateOrUpdateCouponCoupon.fromCreateOrUpdatePercentageCoupon(
                                new CreateOrUpdatePercentageCoupon.Builder()
                                        .name("Percentage Discount " + randomNumeric(5))
                                        .code("PERCENTAGE_DISCOUNT_" + randomNumeric(5))
                                        .description("Huuuuge percentage discount: " + percentage)
                                        .percentage(CreateOrUpdatePercentageCouponPercentage.fromString(percentage))
                                        .build()
                        ))
                        .build())
                .getCoupon();
    }
}
