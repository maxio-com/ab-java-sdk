package com.maxio.advancedbilling.controllers.subscriptions;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClientProvider;
import com.maxio.advancedbilling.controllers.SubscriptionGroupsController;
import com.maxio.advancedbilling.controllers.SubscriptionsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.BankAccountAttributes;
import com.maxio.advancedbilling.models.BankAccountHolderType;
import com.maxio.advancedbilling.models.BankAccountPaymentProfile;
import com.maxio.advancedbilling.models.BankAccountType;
import com.maxio.advancedbilling.models.BankAccountVault;
import com.maxio.advancedbilling.models.CardType;
import com.maxio.advancedbilling.models.CollectionMethod;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CreateSubscription;
import com.maxio.advancedbilling.models.CreateSubscriptionComponent;
import com.maxio.advancedbilling.models.CreateSubscriptionRequest;
import com.maxio.advancedbilling.models.CreditCardPaymentProfile;
import com.maxio.advancedbilling.models.CreditCardVault;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.GroupSettings;
import com.maxio.advancedbilling.models.GroupTarget;
import com.maxio.advancedbilling.models.GroupTargetType;
import com.maxio.advancedbilling.models.IntervalUnit;
import com.maxio.advancedbilling.models.ListMetadataForResourceTypeInput;
import com.maxio.advancedbilling.models.NestedSubscriptionGroup;
import com.maxio.advancedbilling.models.PaginatedMetadata;
import com.maxio.advancedbilling.models.PaymentProfileAttributes;
import com.maxio.advancedbilling.models.PaymentType;
import com.maxio.advancedbilling.models.PrepaidConfiguration;
import com.maxio.advancedbilling.models.PricePointType;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ResourceType;
import com.maxio.advancedbilling.models.SortingDirection;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.SubscriptionComponent;
import com.maxio.advancedbilling.models.SubscriptionCustomPrice;
import com.maxio.advancedbilling.models.SubscriptionInclude;
import com.maxio.advancedbilling.models.SubscriptionState;
import com.maxio.advancedbilling.models.UpsertPrepaidConfiguration;
import com.maxio.advancedbilling.models.containers.CreateSubscriptionComponentComponentId;
import com.maxio.advancedbilling.models.containers.PaymentProfileAttributesExpirationMonth;
import com.maxio.advancedbilling.models.containers.PaymentProfileAttributesExpirationYear;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPriceInitialChargeInCents;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPriceInterval;
import com.maxio.advancedbilling.models.containers.SubscriptionCustomPricePriceInCents;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertThatErrorListResponse;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

public class SubscriptionsControllerCreateTest {
    private final TestSetup TEST_SETUP = new TestSetup();
    private final AdvancedBillingClient CLIENT = TestClientProvider.getClient();
    private final SubscriptionsController SUBSCRIPTIONS_CONTROLLER = CLIENT.getSubscriptionsController();

    private ProductFamily PRODUCT_FAMILY;
    private Product PRODUCT;
    private Customer CUSTOMER;

    @BeforeAll
    void setUp() throws IOException, ApiException {
        PRODUCT_FAMILY = TEST_SETUP.createProductFamily();
        PRODUCT = TEST_SETUP.createProduct(PRODUCT_FAMILY);
        CUSTOMER = TEST_SETUP.createCustomer();
    }

    @AfterAll
    void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(CUSTOMER);
    }

    @Test
    void shouldThrowExceptionIfCustomerIsMissing() {
        // given
        CreateSubscriptionRequest request = new CreateSubscriptionRequest(
                new CreateSubscription.Builder()
                        .productId(PRODUCT.getId())
                        .build()
        );

        // when then
        assertThatErrorListResponse(() -> SUBSCRIPTIONS_CONTROLLER.createSubscription(request))
                .isUnprocessableEntity()
                .hasErrors("A Customer must be specified for the subscription to be valid.");
    }

    @Test
    void shouldCreateBasicSubscriptionUsingCustomerId() throws IOException, ApiException {
        // when
        Subscription subscription = SUBSCRIPTIONS_CONTROLLER
                .createSubscription(new CreateSubscriptionRequest(
                        new CreateSubscription.Builder()
                                .productId(PRODUCT.getId())
                                .customerId(CUSTOMER.getId())
                                .build()
                )).getSubscription();

        // then
        assertBasicSubscriptionFields(subscription);
        assertBalancesWithDefaultPricePoint(subscription);

        assertThat(subscription.getCreditCard()).isNull();
        assertThat(subscription.getGroup()).isNull();
        assertThat(subscription.getBankAccount()).isNull();
        assertThat(subscription.getPaymentType()).isNull();
    }

    @Test
    void shouldCreateSubscriptionWithCreditCard() throws IOException, ApiException {
        // when
        Subscription subscription = SUBSCRIPTIONS_CONTROLLER
                .createSubscription(new CreateSubscriptionRequest(
                        new CreateSubscription.Builder()
                                .productId(PRODUCT.getId())
                                .customerId(CUSTOMER.getId())
                                .creditCardAttributes(new PaymentProfileAttributes.Builder()
                                        .billingAddress("My Billing Address")
                                        .billingCity("New York")
                                        .billingCountry("USA")
                                        .billingState("NY")
                                        .billingZip("10001")
                                        .customerId(CUSTOMER.getId())
                                        .fullNumber("4111 1111 1111 1111")
                                        .cardType(CardType.VISA)
                                        .cvv("123")
                                        .expirationMonth(PaymentProfileAttributesExpirationMonth.fromNumber(5))
                                        .expirationYear(PaymentProfileAttributesExpirationYear.fromNumber(2050))
                                        .build())
                                .build()
                )).getSubscription();

        // then
        assertBasicSubscriptionFields(subscription);
        assertBalancesWithDefaultPricePoint(subscription);

        CreditCardPaymentProfile creditCard = subscription.getCreditCard();
        assertThat(creditCard).isNotNull();
        assertThat(creditCard.getId()).isNotNull().isGreaterThan(1);
        assertThat(creditCard.getFirstName()).isEqualTo(CUSTOMER.getFirstName());
        assertThat(creditCard.getLastName()).isEqualTo(CUSTOMER.getLastName());
        assertThat(creditCard.getCustomerId()).isEqualTo(CUSTOMER.getId());

        assertThat(creditCard.getMaskedCardNumber()).isEqualTo("XXXX-XXXX-XXXX-1111");
        assertThat(creditCard.getCardType()).isEqualTo(CardType.VISA);
        assertThat(creditCard.getExpirationMonth()).isEqualTo(5);
        assertThat(creditCard.getExpirationYear()).isEqualTo(2050);
        assertThat(creditCard.getCurrentVault()).isEqualTo(CreditCardVault.BOGUS);
        assertThat(creditCard.getVaultToken()).isNotEmpty();
        assertThat(creditCard.getBillingAddress()).isEqualTo("My Billing Address");
        assertThat(creditCard.getBillingCity()).isEqualTo("New York");
        assertThat(creditCard.getBillingState()).isEqualTo("NY");
        assertThat(creditCard.getBillingZip()).isEqualTo("10001");
        assertThat(creditCard.getBillingCountry()).isEqualTo("USA");
        assertThat(creditCard.getCustomerVaultToken()).isNull();
        assertThat(creditCard.getBillingAddress2()).isNull();
        assertThat(creditCard.getPaymentType()).isEqualTo(PaymentType.CREDIT_CARD);
        assertThat(creditCard.getDisabled()).isFalse();
        assertThat(creditCard.getChargifyToken()).isNull();
        assertThat(creditCard.getSiteGatewaySettingId()).isNull();
        assertThat(creditCard.getGatewayHandle()).isNull();

        assertThat(subscription.getBankAccount()).isNull();
        assertThat(subscription.getPaymentType()).isEqualTo("credit_card");
    }

    @Test
    void shouldCreateSubscriptionWithBankAccount() throws IOException, ApiException {
        // when
        Subscription subscription = SUBSCRIPTIONS_CONTROLLER
                .createSubscription(new CreateSubscriptionRequest(
                        new CreateSubscription.Builder()
                                .productId(PRODUCT.getId())
                                .customerId(CUSTOMER.getId())
                                .bankAccountAttributes(new BankAccountAttributes.Builder()
                                        .bankName("Royal Bank of France")
                                        .bankAccountNumber("000000000000")
                                        .bankRoutingNumber("0003")
                                        .bankBranchCode("00006")
                                        .paymentType(PaymentType.BANK_ACCOUNT)
                                        .bankAccountHolderType(BankAccountHolderType.BUSINESS)
                                        .bankAccountType(BankAccountType.CHECKING)
                                        .build())
                                .build()
                )).getSubscription();

        // then
        assertBasicSubscriptionFields(subscription);
        assertBalancesWithDefaultPricePoint(subscription);

        // using Bank Account sets verified to true
        assertThat(subscription.getCustomer().getVerified()).isTrue();
        assertThat(subscription.getCreditCard()).isNull();

        BankAccountPaymentProfile bankAccount = subscription.getBankAccount();
        assertThat(bankAccount).isNotNull();
        assertThat(bankAccount.getId()).isNotNull().isGreaterThan(1);
        assertThat(bankAccount.getBankAccountHolderType()).isEqualTo(BankAccountHolderType.BUSINESS);
        assertThat(bankAccount.getBankAccountType()).isEqualTo(BankAccountType.CHECKING);
        assertThat(bankAccount.getBankName()).isEqualTo("Royal Bank of France");
        assertThat(bankAccount.getBillingAddress()).isNull();
        assertThat(bankAccount.getBillingAddress2()).isNull();
        assertThat(bankAccount.getBillingCity()).isNull();
        assertThat(bankAccount.getBillingState()).isNull();
        assertThat(bankAccount.getBillingZip()).isNull();
        assertThat(bankAccount.getBillingCountry()).isNull();
        assertThat(bankAccount.getCurrentVault()).isEqualTo(BankAccountVault.BOGUS);
        assertThat(bankAccount.getCustomerId()).isEqualTo(CUSTOMER.getId());
        assertThat(bankAccount.getCustomerVaultToken()).isNull();
        assertThat(bankAccount.getFirstName()).isEqualTo(CUSTOMER.getFirstName());
        assertThat(bankAccount.getLastName()).isEqualTo(CUSTOMER.getLastName());
        assertThat(bankAccount.getMaskedBankAccountNumber()).isEqualTo("XXXX0000");
        assertThat(bankAccount.getMaskedBankRoutingNumber()).isEqualTo("XXXX0003");
        assertThat(bankAccount.getVaultToken()).isEqualTo("000000000000");
        assertThat(bankAccount.getSiteGatewaySettingId()).isNull();
        assertThat(bankAccount.getGatewayHandle()).isNull();

        assertThat(subscription.getPaymentType()).isEqualTo("bank_account");
    }

    @Test
    void shouldCreateSubscriptionWithCoupon() throws IOException, ApiException {
        // given
        Coupon coupon = TEST_SETUP.createPercentageCoupon(PRODUCT_FAMILY, "0.5");

        // when
        Subscription subscription = SUBSCRIPTIONS_CONTROLLER
                .createSubscription(new CreateSubscriptionRequest(
                        new CreateSubscription.Builder()
                                .productId(PRODUCT.getId())
                                .customerId(CUSTOMER.getId())
                                .creditCardAttributes(new PaymentProfileAttributes.Builder()
                                        .billingAddress("My Billing Address")
                                        .billingCity("New York")
                                        .billingCountry("USA")
                                        .billingState("NY")
                                        .billingZip("10001")
                                        .customerId(CUSTOMER.getId())
                                        .fullNumber("4111 1111 1111 1111")
                                        .cardType(CardType.VISA)
                                        .cvv("123")
                                        .expirationMonth(PaymentProfileAttributesExpirationMonth.fromNumber(5))
                                        .expirationYear(PaymentProfileAttributesExpirationYear.fromNumber(2050))
                                        .build()
                                )
                                .customPrice(new SubscriptionCustomPrice.Builder()
                                        .name("My custom Price")
                                        .priceInCents(SubscriptionCustomPricePriceInCents.fromLong(1000))
                                        .initialChargeInCents(SubscriptionCustomPriceInitialChargeInCents.fromLong(200))
                                        .interval(SubscriptionCustomPriceInterval.fromNumber(1))
                                        .intervalUnit(IntervalUnit.MONTH)

                                        .build()
                                )
                                .couponCode(coupon.getCode())
                                .build()
                )).getSubscription();

        // then
        assertBasicSubscriptionFields(subscription);
        assertThat(subscription.getCouponCode()).isEqualTo(coupon.getCode());
        assertThat(subscription.getCouponUseCount()).isEqualTo(1);
        assertThat(subscription.getCouponUsesAllowed()).isEqualTo(1);
        assertThat(subscription.getCouponCodes())
                .isNotNull()
                .containsExactly(coupon.getCode());
        assertThat(subscription.getCoupons()).isNull();

        Subscription subscriptionWithCoupons = SUBSCRIPTIONS_CONTROLLER
                .readSubscription(subscription.getId(), List.of(SubscriptionInclude.COUPONS))
                .getSubscription();

        assertThat(subscriptionWithCoupons).isNotNull();
        assertThat(subscriptionWithCoupons.getCoupons())
                .extracting("code", "useCount", "usesAllowed", "expiresAt", "recurring", "amountInCents", "percentage")
                .containsExactly(tuple(coupon.getCode(), 1, 1, null, false, null, "0.5"));
    }

    @Test
    void shouldCreateSubscriptionWithComponents() throws IOException, ApiException {
        // given
        int component1UnitPrice = 10;
        int component1UnitBalance = 5;
        int component2UnitPrice = 8;
        int component2UnitBalance = 2;

        Component component1 = TEST_SETUP.createMeteredComponent(PRODUCT_FAMILY, component1UnitPrice);
        Component component2 = TEST_SETUP.createMeteredComponent(PRODUCT_FAMILY, component2UnitPrice);

        // when
        Subscription subscription = SUBSCRIPTIONS_CONTROLLER
                .createSubscription(new CreateSubscriptionRequest(
                        new CreateSubscription.Builder()
                                .productId(PRODUCT.getId())
                                .customerId(CUSTOMER.getId())
                                .creditCardAttributes(new PaymentProfileAttributes.Builder()
                                        .billingAddress("My Billing Address")
                                        .billingCity("New York")
                                        .billingCountry("USA")
                                        .billingState("NY")
                                        .billingZip("10001")
                                        .customerId(CUSTOMER.getId())
                                        .fullNumber("4111 1111 1111 1111")
                                        .cardType(CardType.VISA)
                                        .cvv("123")
                                        .expirationMonth(PaymentProfileAttributesExpirationMonth.fromNumber(5))
                                        .expirationYear(PaymentProfileAttributesExpirationYear.fromNumber(2050))
                                        .build()
                                )
                                .customPrice(new SubscriptionCustomPrice.Builder()
                                        .name("My custom Price")
                                        .priceInCents(SubscriptionCustomPricePriceInCents.fromLong(1000))
                                        .initialChargeInCents(SubscriptionCustomPriceInitialChargeInCents.fromLong(200))
                                        .interval(SubscriptionCustomPriceInterval.fromNumber(1))
                                        .intervalUnit(IntervalUnit.MONTH)
                                        .build()
                                )
                                .components(List.of(
                                        new CreateSubscriptionComponent.Builder()
                                                .componentId(CreateSubscriptionComponentComponentId.fromNumber(component1.getId()))
                                                .unitBalance(component1UnitBalance)
                                                .build(),
                                        new CreateSubscriptionComponent.Builder()
                                                .componentId(CreateSubscriptionComponentComponentId.fromNumber(component2.getId()))
                                                .unitBalance(component2UnitBalance)
                                                .build()
                                ))
                                .build()
                )).getSubscription();

        // then
        assertBasicSubscriptionFields(subscription);
        assertThat(subscription.getTotalRevenueInCents()).isEqualTo(1200
                + component1UnitBalance * component1UnitPrice * 100
                + component2UnitBalance * component2UnitPrice * 100
        );
        assertThat(subscription.getSignupRevenue()).isEqualTo("78.00");

        SubscriptionComponent subscriptionComponent1 = CLIENT.getSubscriptionComponentsController()
                .readSubscriptionComponent(subscription.getId(), component1.getId())
                .getComponent();

        SubscriptionComponent subscriptionComponent2 = CLIENT.getSubscriptionComponentsController()
                .readSubscriptionComponent(subscription.getId(), component2.getId())
                .getComponent();

        assertSubscriptionComponent(component1, subscriptionComponent1, subscription);
        assertSubscriptionComponent(component2, subscriptionComponent2, subscription);
    }

    @Test
    void shouldCreateSubscriptionWithCustomPrice() throws IOException, ApiException {
        // when
        Subscription subscription = SUBSCRIPTIONS_CONTROLLER
                .createSubscription(new CreateSubscriptionRequest(
                        new CreateSubscription.Builder()
                                .productId(PRODUCT.getId())
                                .customerId(CUSTOMER.getId())
                                .creditCardAttributes(new PaymentProfileAttributes.Builder()
                                        .billingAddress("My Billing Address")
                                        .billingCity("New York")
                                        .billingCountry("USA")
                                        .billingState("NY")
                                        .billingZip("10001")
                                        .customerId(CUSTOMER.getId())
                                        .fullNumber("4111 1111 1111 1111")
                                        .cardType(CardType.VISA)
                                        .cvv("123")
                                        .expirationMonth(PaymentProfileAttributesExpirationMonth.fromNumber(5))
                                        .expirationYear(PaymentProfileAttributesExpirationYear.fromNumber(2050))
                                        .build()
                                )
                                .customPrice(new SubscriptionCustomPrice.Builder()
                                        .name("My custom Price")
                                        .priceInCents(SubscriptionCustomPricePriceInCents.fromLong(1000))
                                        .initialChargeInCents(SubscriptionCustomPriceInitialChargeInCents.fromLong(200))
                                        .interval(SubscriptionCustomPriceInterval.fromNumber(1))
                                        .intervalUnit(IntervalUnit.MONTH)

                                        .build()
                                )
                                .build()
                )).getSubscription();

        // then
        assertBasicSubscriptionFields(subscription);
        assertThat(subscription.getProductPriceInCents()).isEqualTo(1000);
        assertThat(subscription.getTotalRevenueInCents()).isEqualTo(1200);
        assertThat(subscription.getSignupRevenue()).isEqualTo("12.00");
        assertThat(subscription.getProductPricePointType()).isEqualTo(PricePointType.CUSTOM);
        assertThat(subscription.getProductPricePointId()).isNotEqualTo(PRODUCT.getProductPricePointId());
        assertThat(subscription.getCancelAtEndOfPeriod()).isNull();

        Product subscriptionProduct = subscription.getProduct();
        assertThat(subscriptionProduct)
                .isNotNull()
                .usingRecursiveComparison(RecursiveComparisonConfiguration.builder()
                        .withIgnoredFields("createdAt", "updatedAt", "initialChargeAfterTrial", "productPricePointName",
                                "initialChargeInCents", "priceInCents", "productPricePointHandle", "productPricePointId")
                        .build())
                .isEqualTo(PRODUCT);

        assertThat(subscriptionProduct.getProductPricePointName()).isEqualTo("My custom Price");
        assertThat(subscriptionProduct.getProductPricePointId()).isNotEqualTo(PRODUCT.getProductPricePointId());
        assertThat(subscriptionProduct.getProductPricePointHandle()).isNotEqualTo(PRODUCT.getProductPricePointHandle());
        assertThat(subscriptionProduct.getInitialChargeAfterTrial()).isNull();
        assertThat(subscriptionProduct.getInitialChargeInCents()).isEqualTo(200L);
        assertThat(subscriptionProduct.getPriceInCents()).isEqualTo(1000L);
    }

    @Test
    void shouldCreateSubscriptionWithMetaFields() throws IOException, ApiException {
        // when
        Subscription subscription = SUBSCRIPTIONS_CONTROLLER
                .createSubscription(new CreateSubscriptionRequest(
                        new CreateSubscription.Builder()
                                .productId(PRODUCT.getId())
                                .customerId(CUSTOMER.getId())
                                .metafields(Map.of(
                                        "tag1", "value1",
                                        "tag2", "value2"))
                                .build()
                )).getSubscription();

        // then
        assertBasicSubscriptionFields(subscription);

        PaginatedMetadata paginatedMetadata = CLIENT.getCustomFieldsController()
                .listMetadataForResourceType(new ListMetadataForResourceTypeInput.Builder(ResourceType.SUBSCRIPTIONS)
                        .resourceIds(List.of(subscription.getId()))
                        .direction(SortingDirection.DESC)
                        .build()
                );

        assertThat(paginatedMetadata).isNotNull();
        assertThat(paginatedMetadata.getTotalCount()).isEqualTo(2);
        assertThat(paginatedMetadata.getCurrentPage()).isEqualTo(1);
        assertThat(paginatedMetadata.getTotalPages()).isEqualTo(1);
        assertThat(paginatedMetadata.getPerPage()).isEqualTo(2);
        assertThat(paginatedMetadata.getMetadata())
                .extracting("name", "value")
                .containsExactlyInAnyOrder(
                        tuple("tag1", "value1"),
                        tuple("tag2", "value2")
                );
    }

    @Test
    void shouldCreateSubscriptionWithGroup() throws IOException, ApiException {
        // given
        Subscription subscription1 = SUBSCRIPTIONS_CONTROLLER
                .createSubscription(new CreateSubscriptionRequest(
                        new CreateSubscription.Builder()
                                .productId(PRODUCT.getId())
                                .customerId(CUSTOMER.getId())
                                .creditCardAttributes(new PaymentProfileAttributes.Builder()
                                        .billingAddress("My Billing Address")
                                        .billingCity("New York")
                                        .billingCountry("USA")
                                        .billingState("NY")
                                        .billingZip("10001")
                                        .customerId(CUSTOMER.getId())
                                        .fullNumber("4111 1111 1111 1111")
                                        .cardType(CardType.VISA)
                                        .cvv("123")
                                        .expirationMonth(PaymentProfileAttributesExpirationMonth.fromNumber(5))
                                        .expirationYear(PaymentProfileAttributesExpirationYear.fromNumber(2050))
                                        .build()
                                )
                                .build()
                )).getSubscription();

        // when
        Subscription subscription2 = SUBSCRIPTIONS_CONTROLLER
                .createSubscription(new CreateSubscriptionRequest(
                        new CreateSubscription.Builder()
                                .productId(PRODUCT.getId())
                                .customerId(CUSTOMER.getId())
                                .group(new GroupSettings.Builder()
                                        .target(new GroupTarget.Builder()
                                                .id(subscription1.getId())
                                                .type(GroupTargetType.SUBSCRIPTION)
                                                .build())
                                        .build()
                                )
                                .build()
                )).getSubscription();

        // then
        assertBasicSubscriptionFields(subscription2);

        NestedSubscriptionGroup subscription2Group = subscription2.getGroup();
        assertThat(subscription2Group).isNotNull();
        assertThat(subscription2Group.getUid()).isNotNull();
        assertThat(subscription2Group.getPrimarySubscriptionId()).isEqualTo(subscription1.getId());
        assertThat(subscription2Group.getPrimary()).isFalse();
        assertThat(subscription2Group.getScheme()).isEqualTo(1);

        subscription1 = SUBSCRIPTIONS_CONTROLLER.readSubscription(subscription1.getId(), List.of()).getSubscription();
        NestedSubscriptionGroup subscription1Group = subscription1.getGroup();
        assertThat(subscription1Group).isNotNull();
        assertThat(subscription1Group.getUid()).isNotNull();
        assertThat(subscription1Group.getPrimarySubscriptionId()).isEqualTo(subscription1.getId());
        assertThat(subscription1Group.getPrimary()).isTrue();
        assertThat(subscription1Group.getScheme()).isEqualTo(1);

        // teardown
        SubscriptionGroupsController subscriptionGroupsController = CLIENT.getSubscriptionGroupsController();
        subscriptionGroupsController.removeSubscriptionFromGroup(subscription2.getId());
        subscriptionGroupsController.removeSubscriptionFromGroup(subscription1.getId());
    }

    @Test
    void shouldCreateSubscriptionWithPrepaidConfiguration() throws IOException, ApiException {
        // given
        int component1UnitPrice = 10;
        int component1UnitBalance = 5;

        Component component = TEST_SETUP.createMeteredComponent(PRODUCT_FAMILY, component1UnitPrice);

        // when
        Subscription subscription = SUBSCRIPTIONS_CONTROLLER
                .createSubscription(new CreateSubscriptionRequest(
                        new CreateSubscription.Builder()
                                .productId(PRODUCT.getId())
                                .customerId(CUSTOMER.getId())
                                .creditCardAttributes(new PaymentProfileAttributes.Builder()
                                        .billingAddress("My Billing Address")
                                        .billingCity("New York")
                                        .billingCountry("USA")
                                        .billingState("NY")
                                        .billingZip("10001")
                                        .customerId(CUSTOMER.getId())
                                        .fullNumber("4111 1111 1111 1111")
                                        .cardType(CardType.VISA)
                                        .cvv("123")
                                        .expirationMonth(PaymentProfileAttributesExpirationMonth.fromNumber(5))
                                        .expirationYear(PaymentProfileAttributesExpirationYear.fromNumber(2050))
                                        .build()
                                )
                                .components(List.of(
                                        new CreateSubscriptionComponent.Builder()
                                                .componentId(CreateSubscriptionComponentComponentId.fromNumber(component.getId()))
                                                .unitBalance(component1UnitBalance)
                                                .build()
                                ))
                                .paymentCollectionMethod(CollectionMethod.PREPAID)
                                .prepaidConfiguration(
                                        new UpsertPrepaidConfiguration.Builder()
                                                .initialFundingAmountInCents(100_00L)
                                                .replenishToAmountInCents(70_00L)
                                                .replenishThresholdAmountInCents(50_00L)
                                                .autoReplenish(true)
                                                .build()
                                )
                                .build()
                )).getSubscription();

        // then
        assertBasicSubscriptionFields(subscription);
        assertThat(subscription.getPrepaymentBalanceInCents()).isEqualTo(100_00L);

        PrepaidConfiguration prepaidConfiguration = subscription.getPrepaidConfiguration();
        assertThat(prepaidConfiguration).isNotNull();
        assertThat(prepaidConfiguration.getAutoReplenish()).isTrue();
        assertThat(prepaidConfiguration.getInitialFundingAmountInCents()).isEqualTo(100_00L);
        assertThat(prepaidConfiguration.getReplenishToAmountInCents()).isEqualTo(70_00L);
        assertThat(prepaidConfiguration.getReplenishThresholdAmountInCents()).isEqualTo(50_00L);
    }

    private void assertBasicSubscriptionFields(Subscription subscription) {
        assertThat(subscription)
                .as("subscription shouldn't be null")
                .isNotNull();
        assertThat(subscription.getId())
                .as("subscriptionId shouldn't be null")
                .isNotNull();
        assertThat(subscription.getState())
                .as("state is active")
                .isEqualTo(SubscriptionState.ACTIVE);
        assertThat(subscription.getPreviousState())
                .as("previousState is active")
                .isEqualTo(SubscriptionState.ACTIVE);
        assertThat(subscription.getProductVersionNumber())
                .as("getProductVersionNumber")
                .isEqualTo(1);

        ZonedDateTime now = ZonedDateTime.now();
        ZoneOffset nowOffset = now.getOffset();
        ZoneOffset futureOffset = now.plusMonths(1).getOffset();

        // Subtract 5 min to have some margin
        assertThat(subscription.getCurrentPeriodStartedAt())
                .as("getCurrentPeriodStartedAt")
                .isAfter(now.minusMinutes(5));
        assertThat(subscription.getCurrentPeriodEndsAt())
                .as("getCurrentPeriodEndsAt")
                .isAfter(now.plusMonths(1).minusMinutes(5)
                        .plusSeconds(futureOffset.getTotalSeconds() - nowOffset.getTotalSeconds())
                );
        assertThat(subscription.getTrialStartedAt())
                .as("getTrialStartedAt")
                .isNull();
        assertThat(subscription.getTrialEndedAt())
                .as("getTrialEndedAt")
                .isNull();
        assertThat(subscription.getActivatedAt())
                .as("getActivatedAt")
                .isAfter(now.minusMinutes(5));
        assertThat(subscription.getExpiresAt())
                .as("getExpiresAt")
                .isNull();
        assertThat(subscription.getCreatedAt())
                .as("getCreatedAt")
                .isAfter(now.minusMinutes(5));
        assertThat(subscription.getUpdatedAt())
                .as("getUpdatedAt")
                .isAfter(now.minusMinutes(5));

        assertThat(subscription.getCancellationMessage())
                .as("getCancellationMessage")
                .isNull();
        assertThat(subscription.getCancellationMethod())
                .as("getCancellationMethod")
                .isNull();
        assertThat(subscription.getCanceledAt())
                .as("getCanceledAt")
                .isNull();
        assertThat(subscription.getDelayedCancelAt())
                .as("getDelayedCancelAt")
                .isNull();

        assertThat(subscription.getSignupPaymentId())
                .as("getSignupPaymentId")
                .isNotNull().isGreaterThan(1);
        assertThat(subscription.getSnapDay())
                .as("getSnapDay")
                .isNull();

        assertThat(subscription.getReferralCode())
                .as("getReferralCode")
                .isNotNull();
        assertThat(subscription.getNextProductId())
                .as("getNextProductId")
                .isNull();
        assertThat(subscription.getNextProductHandle())
                .as("getNextProductHandle")
                .isNull();
        assertThat(subscription.getReasonCode())
                .as("getReasonCode")
                .isNull();
        assertThat(subscription.getAutomaticallyResumeAt())
                .as("getAutomaticallyResumeAt")
                .isNull();
        assertThat(subscription.getOfferId())
                .as("getOfferId")
                .isNull();
        assertThat(subscription.getPayerId())
                .as("getPayerId")
                .isNull();
        assertThat(subscription.getCreditBalanceInCents())
                .as("getCreditBalanceInCents")
                .isEqualTo(0);
        assertThat(subscription.getNextProductPricePointId())
                .as("getNextProductPricePointId")
                .isNull();
        assertThat(subscription.getStoredCredentialTransactionId())
                .as("getStoredCredentialTransactionId")
                .isNull();
        assertThat(subscription.getReference())
                .as("getReference")
                .isNull();
        assertThat(subscription.getOnHoldAt())
                .as("getOnHoldAt")
                .isNull();
        assertThat(subscription.getPrepaidDunning())
                .as("getPrepaidDunning")
                .matches(this::nullOrFalse);
        assertThat(subscription.getCoupons())
                .as("getCoupons")
                .isNull();
        assertThat(subscription.getDunningCommunicationDelayEnabled())
                .as("getDunningCommunicationDelayEnabled")
                .matches(this::nullOrFalse);
        assertThat(subscription.getDunningCommunicationDelayTimeZone())
                .as("getDunningCommunicationDelayTimeZone")
                .isNull();
        assertThat(subscription.getReceivesInvoiceEmails())
                .as("getReceivesInvoiceEmails")
                .matches(this::nullOrFalse);
        assertThat(subscription.getLocale())
                .as("getLocale")
                .isNull();
        assertThat(subscription.getCurrency())
                .as("getCurrency")
                .isEqualTo("USD");
        assertThat(subscription.getScheduledCancellationAt())
                .as("getScheduledCancellationAt")
                .isNull();
        assertThat(subscription.getCurrentBillingAmountInCents())
                .as("getCurrentBillingAmountInCents")
                .isNull();

        assertThat(subscription.getCustomer())
                .as("getCustomer")
                .isNotNull()
                .usingRecursiveComparison(RecursiveComparisonConfiguration.builder()
                        .withIgnoredFields("createdAt", "updatedAt", "verified", "additionalProperties")
                        .build())
                .isEqualTo(CUSTOMER);
    }

    private boolean nullOrFalse(Boolean bool) {
        return bool == null || !bool;
    }

    private void assertBalancesWithDefaultPricePoint(Subscription subscription) {
        assertThat(subscription.getBalanceInCents()).isEqualTo(0L);
        assertThat(subscription.getTotalRevenueInCents()).isEqualTo(0L);
        assertThat(subscription.getProductPriceInCents()).isEqualTo(0L);
        assertThat(subscription.getSignupRevenue()).isEqualTo("0.00");
        assertThat(subscription.getCancelAtEndOfPeriod()).isFalse();
        assertThat(subscription.getProductPricePointId()).isEqualTo(PRODUCT.getProductPricePointId());
        assertThat(subscription.getProductPricePointType()).isEqualTo(PricePointType.ENUM_DEFAULT);
        assertThat(subscription.getPaymentCollectionMethod()).isEqualTo(CollectionMethod.AUTOMATIC);
        assertThat(subscription.getNetTerms()).isNull();
        assertThat(subscription.getPrepaymentBalanceInCents()).isEqualTo(0);

        assertThat(subscription.getProduct())
                .isNotNull()
                .usingRecursiveComparison(RecursiveComparisonConfiguration.builder()
                        .withIgnoredFields("createdAt", "updatedAt")
                        .build())
                .isEqualTo(PRODUCT);

        assertThat(subscription.getCouponUseCount()).isNull();
        assertThat(subscription.getCouponUsesAllowed()).isNull();
        assertThat(subscription.getCouponCodes()).isNotNull().isEmpty();
        assertThat(subscription.getGroup()).isNull();
    }

    private void assertSubscriptionComponent(Component component1, SubscriptionComponent subscriptionComponent1, Subscription subscription) {
        assertThat(subscriptionComponent1.getId()).isNotNull().isGreaterThan(1);
        assertThat(subscriptionComponent1.getName()).isEqualTo(component1.getName());
        assertThat(subscriptionComponent1.getKind()).isEqualTo(component1.getKind());
        assertThat(subscriptionComponent1.getName()).isEqualTo(component1.getName());
        assertThat(subscriptionComponent1.getUnitName()).isEqualTo(component1.getUnitName());
        assertThat(subscriptionComponent1.getPricingScheme()).isEqualTo(component1.getPricingScheme());
        assertThat(subscriptionComponent1.getComponentHandle()).isEqualTo(component1.getHandle());
        assertThat(subscriptionComponent1.getSubscriptionId()).isEqualTo(subscription.getId());
        assertThat(subscriptionComponent1.getRecurring()).isFalse();
        assertThat(subscriptionComponent1.getUpgradeCharge()).isNull();
        assertThat(subscriptionComponent1.getDowngradeCredit()).isNull();
        assertThat(subscriptionComponent1.getArchivedAt()).isNull();
        assertThat(subscriptionComponent1.getPricePointId()).isNotNull();
        assertThat(subscriptionComponent1.getPricePointHandle()).isNotNull();
        assertThat(subscriptionComponent1.getPricePointType()).isEqualTo(PricePointType.ENUM_DEFAULT);
        assertThat(subscriptionComponent1.getPricePointName()).isNotNull();
        assertThat(subscriptionComponent1.getProductFamilyId()).isEqualTo(PRODUCT_FAMILY.getId());
        assertThat(subscriptionComponent1.getProductFamilyHandle()).isEqualTo(PRODUCT_FAMILY.getHandle());
        assertThat(subscriptionComponent1.getDescription()).isEqualTo(component1.getDescription());
        assertThat(subscriptionComponent1.getAllowFractionalQuantities()).isFalse();
        assertThat(subscriptionComponent1.getSubscription()).isNull();
        assertThat(subscriptionComponent1.getDisplayOnHostedPage()).matches(this::nullOrFalse);
    }
}
