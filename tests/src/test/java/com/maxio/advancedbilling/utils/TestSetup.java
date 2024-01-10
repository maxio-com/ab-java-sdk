package com.maxio.advancedbilling.utils;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CardType;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.ComponentKindPath;
import com.maxio.advancedbilling.models.ComponentPricePoint;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CreateComponentPricePoint;
import com.maxio.advancedbilling.models.CreateComponentPricePointRequest;
import com.maxio.advancedbilling.models.CreateCustomer;
import com.maxio.advancedbilling.models.CreateCustomerRequest;
import com.maxio.advancedbilling.models.CreateInvoice;
import com.maxio.advancedbilling.models.CreateInvoiceAddress;
import com.maxio.advancedbilling.models.CreateInvoiceRequest;
import com.maxio.advancedbilling.models.CreateMeteredComponent;
import com.maxio.advancedbilling.models.CreateOnOffComponent;
import com.maxio.advancedbilling.models.CreateOrUpdateCoupon;
import com.maxio.advancedbilling.models.CreateOrUpdateFlatAmountCoupon;
import com.maxio.advancedbilling.models.CreateOrUpdatePercentageCoupon;
import com.maxio.advancedbilling.models.CreateOrUpdateProduct;
import com.maxio.advancedbilling.models.CreateOrUpdateProductRequest;
import com.maxio.advancedbilling.models.CreatePrepaidComponent;
import com.maxio.advancedbilling.models.CreateProductFamily;
import com.maxio.advancedbilling.models.CreateProductFamilyRequest;
import com.maxio.advancedbilling.models.CreateProductPricePoint;
import com.maxio.advancedbilling.models.CreateProductPricePointRequest;
import com.maxio.advancedbilling.models.CreateQuantityBasedComponent;
import com.maxio.advancedbilling.models.CreateSubscription;
import com.maxio.advancedbilling.models.CreateSubscriptionRequest;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.Invoice;
import com.maxio.advancedbilling.models.MeteredComponent;
import com.maxio.advancedbilling.models.OnOffComponent;
import com.maxio.advancedbilling.models.OveragePricing;
import com.maxio.advancedbilling.models.PaymentProfileAttributes;
import com.maxio.advancedbilling.models.PrepaidUsageComponent;
import com.maxio.advancedbilling.models.Price;
import com.maxio.advancedbilling.models.PricingScheme;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ProductPricePoint;
import com.maxio.advancedbilling.models.QuantityBasedComponent;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.containers.CreateComponentBody;
import com.maxio.advancedbilling.models.containers.CreateComponentPricePointRequestPricePoint;
import com.maxio.advancedbilling.models.containers.CreateOrUpdateCouponCoupon;
import com.maxio.advancedbilling.models.containers.CreateOrUpdatePercentageCouponPercentage;
import com.maxio.advancedbilling.models.containers.CreateProductPricePointProductId;
import com.maxio.advancedbilling.models.containers.MeteredComponentUnitPrice;
import com.maxio.advancedbilling.models.containers.OnOffComponentUnitPrice;
import com.maxio.advancedbilling.models.containers.PaymentProfileAttributesExpirationMonth;
import com.maxio.advancedbilling.models.containers.PaymentProfileAttributesExpirationYear;
import com.maxio.advancedbilling.models.containers.PrepaidUsageComponentUnitPrice;
import com.maxio.advancedbilling.models.containers.PriceStartingQuantity;
import com.maxio.advancedbilling.models.containers.PriceUnitPrice;
import com.maxio.advancedbilling.models.containers.QuantityBasedComponentUnitPrice;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

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
        return createProduct(productFamily, b -> {
        });
    }

    public Product createProduct(ProductFamily productFamily, Consumer<CreateOrUpdateProduct.Builder> customizer)
            throws IOException, ApiException {
        String productName = "My Super Product " + randomNumeric(5);
        String handle = productName.toLowerCase().replace(" ", "-");
        CreateOrUpdateProduct.Builder builder = new CreateOrUpdateProduct.Builder()
                .name(productName)
                .handle(handle)
                .intervalUnit(IntervalUnit.MONTH)
                .interval(1)
                .requireCreditCard(false);
        customizer.accept(builder);

        return advancedBillingClient.getProductsController()
                .createProduct(productFamily.getId(), new CreateOrUpdateProductRequest(builder.build()))
                .getProduct();
    }

    public ProductPricePoint createProductPricePoint(Product product, String name) throws IOException, ApiException {
        return createProductPricePoint(product, name, b -> {
        });
    }

    public ProductPricePoint createProductPricePoint(Product product, String name,
                                                     Consumer<CreateProductPricePoint.Builder> customizer)
            throws IOException, ApiException {
        String handle = name.toLowerCase().replace(" ", "-");
        CreateProductPricePoint.Builder builder = new CreateProductPricePoint.Builder()
                .name(name)
                .handle(handle)
                .priceInCents(new Random().nextInt(1, 100000))
                .interval(1)
                .intervalUnit(IntervalUnit.MONTH);
        customizer.accept(builder);

        return advancedBillingClient.getProductPricePointsController()
                .createProductPricePoint(
                        CreateProductPricePointProductId.fromNumber(product.getId()),
                        new CreateProductPricePointRequest(builder.build())
                )
                .getPricePoint();
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
        return createQuantityBasedComponent(productFamilyId, b -> {
        });
    }

    public Component createQuantityBasedComponent(int productFamilyId, Consumer<QuantityBasedComponent.Builder> customizer) throws IOException, ApiException {
        String seed = RandomStringUtils.randomAlphanumeric(5).toLowerCase();
        QuantityBasedComponent.Builder quantityBasedComponentBuilder = new QuantityBasedComponent.Builder()
                .name("testcomponent-" + seed)
                .handle("test-handle-" + seed)
                .unitName("unit")
                .pricingScheme(PricingScheme.PER_UNIT)
                .unitPrice(QuantityBasedComponentUnitPrice.fromPrecision(1.0));
        customizer.accept(quantityBasedComponentBuilder);
        CreateQuantityBasedComponent createQuantityBasedComponent = new CreateQuantityBasedComponent(quantityBasedComponentBuilder.build());

        return advancedBillingClient.getComponentsController().createComponent(productFamilyId,
                        ComponentKindPath.QUANTITY_BASED_COMPONENTS,
                        CreateComponentBody.fromCreateQuantityBasedComponent(createQuantityBasedComponent))
                .getComponent();
    }

    public Component createOnOffComponent(int productFamilyId) throws IOException, ApiException {
        return createOnOffComponent(productFamilyId, b -> {});
    }

    public Component createOnOffComponent(int productFamilyId, Consumer<OnOffComponent.Builder> customizer) throws IOException, ApiException {
        String componentName = "Test On-Off Component " + randomNumeric(5);
        String handle = componentName.toLowerCase().replace(" ", "-") + randomNumeric(5);
        OnOffComponent.Builder onOffComponentBuilder = new OnOffComponent.Builder()
                .name(componentName)
                .handle(handle)
                .unitName("unit")
                .unitPrice(OnOffComponentUnitPrice.fromPrecision(1.0));
        customizer.accept(onOffComponentBuilder);
        CreateOnOffComponent createOnOffComponent = new CreateOnOffComponent(onOffComponentBuilder.build());

        return advancedBillingClient.getComponentsController().createComponent(productFamilyId,
                        ComponentKindPath.ON_OFF_COMPONENTS,
                        CreateComponentBody.fromCreateOnOffComponent(createOnOffComponent))
                .getComponent();
    }

    public Component createPrepaidComponent(ProductFamily productFamily, double unitPrice) throws IOException, ApiException {
        String componentName = "Test Prepaid Component " + randomNumeric(5);
        String handle = componentName.toLowerCase().replace(" ", "-") + randomNumeric(5);
        return advancedBillingClient.getComponentsController()
                .createComponent(
                        productFamily.getId(),
                        ComponentKindPath.PREPAID_USAGE_COMPONENTS,
                        CreateComponentBody.fromCreatePrepaidComponent(
                                new CreatePrepaidComponent(
                                        new PrepaidUsageComponent.Builder()
                                                .name(componentName)
                                                .handle(handle)
                                                .unitName("unit")
                                                .unitPrice(PrepaidUsageComponentUnitPrice.fromPrecision(unitPrice))
                                                .description("Description for: " + componentName)
                                                .allowFractionalQuantities(false)
                                                .pricingScheme(PricingScheme.PER_UNIT)
                                                .overagePricing(
                                                        new OveragePricing.Builder()
                                                                .pricingScheme(PricingScheme.PER_UNIT)
                                                                .prices(List.of(
                                                                                new Price.Builder()
                                                                                        .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                                                                        .unitPrice(PriceUnitPrice.fromPrecision(1.0))
                                                                                        .build()
                                                                        )
                                                                )
                                                                .build()
                                                )
                                                .build()
                                )
                        )
                ).getComponent();
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

    public Coupon createAmountCoupon(ProductFamily productFamily, long amountInCents, boolean stackable) throws IOException, ApiException {
        return advancedBillingClient.getCouponsController()
                .createCoupon(productFamily.getId(), new CreateOrUpdateCoupon.Builder()
                        .coupon(CreateOrUpdateCouponCoupon.fromCreateOrUpdateFlatAmountCoupon(
                                new CreateOrUpdateFlatAmountCoupon.Builder()
                                        .name("Amount Discount " + randomNumeric(5))
                                        .code("AMOUNT_DISCOUNT_" + randomNumeric(5))
                                        .description("Huuuuge amount discount: " + amountInCents)
                                        .amountInCents(amountInCents)
                                        .stackable(stackable)
                                        .build()
                        ))
                        .build())
                .getCoupon();
    }

    public Coupon createPercentageCoupon(ProductFamily productFamily, String percentage) throws IOException, ApiException {
        return createPercentageCoupon(productFamily, percentage, true);
    }

    public Coupon createPercentageCoupon(ProductFamily productFamily, String percentage, boolean stackable) throws IOException, ApiException {
        return advancedBillingClient.getCouponsController()
                .createCoupon(productFamily.getId(), new CreateOrUpdateCoupon.Builder()
                        .coupon(CreateOrUpdateCouponCoupon.fromCreateOrUpdatePercentageCoupon(
                                new CreateOrUpdatePercentageCoupon.Builder()
                                        .name("Percentage Discount " + randomNumeric(5))
                                        .code("PERCENTAGE_DISCOUNT_" + randomNumeric(5))
                                        .description("Huuuuge percentage discount: " + percentage)
                                        .percentage(CreateOrUpdatePercentageCouponPercentage.fromString(percentage))
                                        .stackable(stackable)
                                        .build()
                        ))
                        .build())
                .getCoupon();
    }

    public ComponentPricePoint createPricePointForComponent(int componentId, double unitPrice) throws IOException, ApiException {
        String name = "Price Point " + randomNumeric(5);
        String handle = name.toLowerCase().replace(" ", "-");
        CreateComponentPricePoint createComponentPricePoint = new CreateComponentPricePoint.Builder()
                .name(name)
                .handle(handle)
                .pricingScheme(PricingScheme.PER_UNIT)
                .prices(
                        List.of(
                                new Price.Builder()
                                        .unitPrice(PriceUnitPrice.fromPrecision(unitPrice))
                                        .startingQuantity(PriceStartingQuantity.fromNumber(1))
                                        .build()
                        )
                )
                .build();

        return advancedBillingClient.getComponentsController()
                .createComponentPricePoint(componentId,
                        new CreateComponentPricePointRequest(
                                CreateComponentPricePointRequestPricePoint
                                        .fromCreateComponentPricePoint(
                                                createComponentPricePoint
                                        )
                        )).getPricePoint();
    }

    public Subscription createSubscription(Customer customer, Product product) throws IOException, ApiException {
        return createSubscription(customer, product, b -> {
        });
    }

    public Subscription createSubscription(Customer customer, Product product,
                                           Consumer<CreateSubscription.Builder> subscriptionCustomizer) throws IOException, ApiException {
        return createSubscription(customer, product, subscriptionCustomizer, ppc -> ppc.fullNumber("4111 1111 1111 1111"));
    }

    public Subscription createSubscription(Customer customer, Product product,
                                           Consumer<CreateSubscription.Builder> subscriptionCustomizer,
                                           Consumer<PaymentProfileAttributes.Builder> paymentProfileCustomizer) throws IOException, ApiException {
        PaymentProfileAttributes.Builder paymentProfileBuilder = new PaymentProfileAttributes.Builder()
                .billingAddress("My Billing Address")
                .billingCity("New York")
                .billingCountry("USA")
                .billingState("NY")
                .billingZip("10001")
                .customerId(customer.getId())
                .cardType(CardType.VISA)
                .cvv("123")
                .expirationMonth(PaymentProfileAttributesExpirationMonth.fromNumber(5))
                .expirationYear(PaymentProfileAttributesExpirationYear.fromNumber(2050));
        paymentProfileCustomizer.accept(paymentProfileBuilder);

        CreateSubscription.Builder subscriptionBuilder = new CreateSubscription.Builder()
                .productId(product.getId())
                .customerId(customer.getId())
                .creditCardAttributes(paymentProfileBuilder.build());
        subscriptionCustomizer.accept(subscriptionBuilder);

        return advancedBillingClient.getSubscriptionsController()
                .createSubscription(new CreateSubscriptionRequest(subscriptionBuilder.build()))
                .getSubscription();
    }

    public Invoice createInvoice(int subscriptionId, Consumer<CreateInvoice.Builder> customizer) throws IOException, ApiException {
        CreateInvoice.Builder builder = new CreateInvoice.Builder()
                .memo("Adhoc invoice created")
                .paymentInstructions("Give me your money")
                .issueDate(LocalDate.now())
                .shippingAddress(new CreateInvoiceAddress.Builder()
                        .address("Shipping address")
                        .address2("Shipping address 2")
                        .city("Shipping city")
                        .zip("ABC")
                        .state("MP")
                        .country("PL")
                        .firstName("John")
                        .lastName("Doe")
                        .phone("555050505")
                        .build()
                );
        customizer.accept(builder);

        return advancedBillingClient.getInvoicesController()
                .createInvoice(subscriptionId, new CreateInvoiceRequest(builder.build()))
                .getInvoice();
    }
}
