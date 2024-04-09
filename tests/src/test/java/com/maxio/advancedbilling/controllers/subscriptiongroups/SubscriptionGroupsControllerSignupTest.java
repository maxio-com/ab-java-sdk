package com.maxio.advancedbilling.controllers.subscriptiongroups;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.SubscriptionGroupsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.SubscriptionGroupSignupErrorResponseException;
import com.maxio.advancedbilling.models.BankAccountHolderType;
import com.maxio.advancedbilling.models.BankAccountType;
import com.maxio.advancedbilling.models.CollectionMethod;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.NestedSubscriptionGroup;
import com.maxio.advancedbilling.models.PayerAttributes;
import com.maxio.advancedbilling.models.PaymentType;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.SubscriptionGroupBankAccount;
import com.maxio.advancedbilling.models.SubscriptionGroupCreditCard;
import com.maxio.advancedbilling.models.SubscriptionGroupItem;
import com.maxio.advancedbilling.models.SubscriptionGroupSignup;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupComponent;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupItem;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupRequest;
import com.maxio.advancedbilling.models.SubscriptionGroupSignupResponse;
import com.maxio.advancedbilling.models.SubscriptionGroupSubscriptionError;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupCreditCardExpirationMonth;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupCreditCardExpirationYear;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupCreditCardFullNumber;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupSignupComponentComponentId;
import com.maxio.advancedbilling.models.containers.SubscriptionGroupSignupComponentUnitBalance;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import org.assertj.core.api.ThrowingConsumer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.models.SubscriptionState.ACTIVE;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class SubscriptionGroupsControllerSignupTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final SubscriptionGroupsController SUBSCRIPTION_GROUPS_CONTROLLER =
            CLIENT.getSubscriptionGroupsController();
    private static SubscriptionGroupSignupResponse groupSignup;
    private static Customer customer;
    private static Product product;
    private static Product product2;
    private static Component meteredComponent;
    private static Coupon coupon;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        ProductFamily productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(1250));
        product2 = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(1000));

        customer = TEST_SETUP.createCustomer();
        meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 11.5);
        coupon = TEST_SETUP.createAmountCoupon(productFamily, 1250, true);
    }

    @AfterEach
    void cleanupSubscriptionGroup() throws IOException, ApiException {
        if (groupSignup != null) {
            new TestTeardown().deleteSubscriptionGroup(groupSignup);
            groupSignup = null;
        }
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    void shouldSignupSubscriptionGroupUsingExistingCustomer() throws IOException, ApiException {
        // given
        Customer customer = TEST_SETUP.createCustomer();

        // when
        groupSignup = SUBSCRIPTION_GROUPS_CONTROLLER
                .signupWithSubscriptionGroup(new SubscriptionGroupSignupRequest(
                        new SubscriptionGroupSignup.Builder()
                                .payerId(customer.getId())
                                .creditCardAttributes(new SubscriptionGroupCreditCard.Builder()
                                        .fullNumber(SubscriptionGroupCreditCardFullNumber.fromString("4111 1111 1111 1111"))
                                        .expirationMonth(SubscriptionGroupCreditCardExpirationMonth.fromNumber(11))
                                        .expirationYear(SubscriptionGroupCreditCardExpirationYear.fromNumber(LocalDate.now().getYear() + 1))
                                        .billingAddress("1703 Edsel Road")
                                        .billingCity("Los Angeles")
                                        .billingState("CA")
                                        .build())
                                .subscriptions(List.of(new SubscriptionGroupSignupItem.Builder()
                                                .productId(product.getId())
                                                .couponCodes(List.of(coupon.getCode()))
                                                .primary(true)
                                                .components(List.of(new SubscriptionGroupSignupComponent.Builder()
                                                        .componentId(SubscriptionGroupSignupComponentComponentId.fromNumber(meteredComponent.getId()))
                                                        .unitBalance(SubscriptionGroupSignupComponentUnitBalance.fromNumber(10))
                                                        .build())
                                                )
                                                .build(),
                                        new SubscriptionGroupSignupItem.Builder()
                                                .productId(product2.getId())
                                                .components(List.of(new SubscriptionGroupSignupComponent.Builder()
                                                        .componentId(SubscriptionGroupSignupComponentComponentId.fromNumber(meteredComponent.getId()))
                                                        .unitBalance(SubscriptionGroupSignupComponentUnitBalance.fromNumber(20))
                                                        .build())
                                                )
                                                .build()
                                ))
                                .build()
                ));

        // then
        assertThat(groupSignup.getCustomerId()).isEqualTo(customer.getId());
        assertSubscriptionGroup();
    }

    @Test
    void shouldSignupSubscriptionGroupWithPayerAttributes() throws IOException, ApiException {
        // given - when
        String reference = "ref-" + randomNumeric(10);
        groupSignup = SUBSCRIPTION_GROUPS_CONTROLLER
                .signupWithSubscriptionGroup(new SubscriptionGroupSignupRequest(
                        new SubscriptionGroupSignup.Builder()
                                .payerAttributes(new PayerAttributes.Builder()
                                        .firstName("John")
                                        .lastName("Doe")
                                        .city("New York")
                                        .state("NY")
                                        .country("US")
                                        .address("Broadway")
                                        .zip("78015")
                                        .address2("1703 Edsel Road")
                                        .email("payerdoe@chargify.com")
                                        .ccEmails("washington@example.com")
                                        .reference(reference)
                                        .organization("Acme, Inc")
                                        .phone("555-111-222")
                                        .locale("es-MX")
                                        .vatNumber("123")
                                        .taxExempt(true)
                                        .taxExemptReason("N")
                                        .build())
                                .bankAccountAttributes(new SubscriptionGroupBankAccount.Builder()
                                        .bankName("Best Bank")
                                        .bankRoutingNumber("021000089")
                                        .bankAccountNumber("111111111111")
                                        .bankAccountType(BankAccountType.CHECKING)
                                        .bankAccountHolderType(BankAccountHolderType.BUSINESS)
                                        .paymentType(PaymentType.BANK_ACCOUNT)
                                        .build()
                                )
                                .subscriptions(List.of(new SubscriptionGroupSignupItem.Builder()
                                                .productId(product.getId())
                                                .couponCodes(List.of(coupon.getCode()))
                                                .primary(true)
                                                .components(List.of(new SubscriptionGroupSignupComponent.Builder()
                                                        .componentId(SubscriptionGroupSignupComponentComponentId.fromNumber(meteredComponent.getId()))
                                                        .unitBalance(SubscriptionGroupSignupComponentUnitBalance.fromNumber(10))
                                                        .build())
                                                )
                                                .build(),
                                        new SubscriptionGroupSignupItem.Builder()
                                                .productId(product2.getId())
                                                .components(List.of(new SubscriptionGroupSignupComponent.Builder()
                                                        .componentId(SubscriptionGroupSignupComponentComponentId.fromNumber(meteredComponent.getId()))
                                                        .unitBalance(SubscriptionGroupSignupComponentUnitBalance.fromNumber(20))
                                                        .build())
                                                )
                                                .build()
                                ))
                                .build()
                ));
        Customer createdCustomer = CLIENT.getCustomersController().readCustomer(groupSignup.getCustomerId()).getCustomer();

        // then
        assertThat(groupSignup.getCustomerId()).isNotNull();
        assertSubscriptionGroup();

        assertThat(createdCustomer.getFirstName()).isEqualTo("John");
        assertThat(createdCustomer.getLastName()).isEqualTo("Doe");
        assertThat(createdCustomer.getEmail()).isEqualTo("payerdoe@chargify.com");
        assertThat(createdCustomer.getId()).isNotNull();
        assertThat(createdCustomer.getCreatedAt()).isNotNull();
        assertThat(createdCustomer.getUpdatedAt()).isNotNull();
        assertThat(createdCustomer.getCcEmails()).isEqualTo("washington@example.com");
        assertThat(createdCustomer.getOrganization()).isEqualTo("Acme, Inc");
        assertThat(createdCustomer.getReference()).isEqualTo(reference);
        assertThat(createdCustomer.getAddress()).isEqualTo("Broadway");
        assertThat(createdCustomer.getAddress2()).isEqualTo("1703 Edsel Road");
        assertThat(createdCustomer.getCity()).isEqualTo("New York");
        assertThat(createdCustomer.getState()).isEqualTo("NY");
        assertThat(createdCustomer.getStateName()).isEqualTo("New York");
        assertThat(createdCustomer.getZip()).isEqualTo("78015");
        assertThat(createdCustomer.getCountry()).isEqualTo("US");
        assertThat(createdCustomer.getCountryName()).isEqualTo("United States");
        assertThat(createdCustomer.getPhone()).isEqualTo("555-111-222");
        assertThat(createdCustomer.getVerified()).isFalse();
        assertThat(createdCustomer.getPortalCustomerCreatedAt()).isNull();
        assertThat(createdCustomer.getPortalInviteLastSentAt()).isNull();
        assertThat(createdCustomer.getPortalInviteLastAcceptedAt()).isNull();
        assertThat(createdCustomer.getTaxExempt()).isTrue();
        assertThat(createdCustomer.getVatNumber()).isEqualTo("123");
        assertThat(createdCustomer.getParentId()).isNull();
        assertThat(createdCustomer.getLocale()).isEqualTo("es-MX");
        assertThat(createdCustomer.getDefaultSubscriptionGroupUid()).isNull();
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenSigningUpGroupWithInvalidData")
    void shouldReturn422WhenSigningUpGroupWithInvalidData(SubscriptionGroupSignupRequest request,
                                                         ThrowingConsumer<SubscriptionGroupSignupErrorResponseException>
                                                                 assertionsConsumer) {
        assertUnprocessableEntity(
                SubscriptionGroupSignupErrorResponseException.class,
                () -> SUBSCRIPTION_GROUPS_CONTROLLER.signupWithSubscriptionGroup(request),
                assertionsConsumer::accept
        );
    }

    private static Stream<Arguments> argsForShouldReturn422WhenSigningUpGroupWithInvalidData() {
        return Stream.of(
                Arguments.of(
                        new SubscriptionGroupSignupRequest(
                                new SubscriptionGroupSignup.Builder()
                                        .subscriptions(List.of(
                                                new SubscriptionGroupSignupItem.Builder()
                                                        .build()
                                        ))
                                        .build()
                        ),
                        (ThrowingConsumer<SubscriptionGroupSignupErrorResponseException>) error ->
                        {
                            assertThat(error.getErrors().getSubscriptions()).isNull();
                            assertThat(error.getErrors().getSubscriptionGroup()).containsOnly(
                                    "One primary subscription is required.",
                                    "One of 'payer_attributes', 'payer_id', 'payer_reference' is required.");
                        }
                ),
                Arguments.of(
                        new SubscriptionGroupSignupRequest(
                                new SubscriptionGroupSignup.Builder()
                                        .payerId(customer.getId())
                                        .subscriptions(List.of(
                                                new SubscriptionGroupSignupItem.Builder()
                                                        .primary(true)
                                                        .productId(product.getId())
                                                        .build()
                                        ))
                                        .build()
                        ),
                        (ThrowingConsumer<SubscriptionGroupSignupErrorResponseException>) error ->
                        {
                            assertThat(error.getErrors().getSubscriptionGroup()).isNull();
                            assertThat(error.getErrors().getSubscriptions()).usingRecursiveComparison().isEqualTo(
                                    Map.of("0", new SubscriptionGroupSubscriptionError.Builder()
                                            .base(List.of("No payment method was on file for the $12.50 balance"))
                                            .build())
                            );
                        }
                ),
                Arguments.of(
                        new SubscriptionGroupSignupRequest(
                                new SubscriptionGroupSignup.Builder()
                                        .payerId(customer.getId())
                                        .creditCardAttributes(new SubscriptionGroupCreditCard.Builder()
                                                .chargifyToken("abc")
                                                .build())
                                        .subscriptions(List.of(
                                                new SubscriptionGroupSignupItem.Builder()
                                                        .primary(true)
                                                        .productId(product.getId())
                                                        .build()
                                        ))
                                        .build()
                        ),
                        (ThrowingConsumer<SubscriptionGroupSignupErrorResponseException>) error ->
                        {
                            assertThat(error.getErrors().getSubscriptionGroup()).isNull();
                            assertThat(error.getErrors().getSubscriptions()).usingRecursiveComparison().isEqualTo(
                                    Map.of("0", new SubscriptionGroupSubscriptionError.Builder()
                                            .paymentProfileChargifyToken(List.of("Chargify token not found"))
                                            .build())
                            );
                        }
                ),
                Arguments.of(
                        new SubscriptionGroupSignupRequest(
                                new SubscriptionGroupSignup.Builder()
                                        .payerId(customer.getId())
                                        .creditCardAttributes(new SubscriptionGroupCreditCard.Builder()
                                                .fullNumber((SubscriptionGroupCreditCardFullNumber.fromString("4111 1111 1111 1111")))
                                                .expirationMonth(SubscriptionGroupCreditCardExpirationMonth.fromNumber(11))
                                                .expirationYear(SubscriptionGroupCreditCardExpirationYear.fromNumber(LocalDate.now().getYear() + 1))
                                                .build())
                                        .subscriptions(List.of(
                                                new SubscriptionGroupSignupItem.Builder()
                                                        .primary(true)
                                                        .productId(123)
                                                        .build()
                                        ))
                                        .build()
                        ),
                        (ThrowingConsumer<SubscriptionGroupSignupErrorResponseException>) error ->
                        {
                            assertThat(error.getErrors().getSubscriptionGroup()).isNull();
                            assertThat(error.getErrors().getSubscriptions()).usingRecursiveComparison().isEqualTo(
                                    Map.of("0", new SubscriptionGroupSubscriptionError.Builder()
                                            .product(List.of("Product must be specified and be a valid product provided by the seller."))
                                            .productPricePointId(List.of("Product price point must belong to product."))
                                            .build())
                            );
                        }
                )
        );
    }

    private void assertSubscriptionGroup() throws IOException, ApiException {
        assertThat(groupSignup.getAdditionalProperties()).isEmpty();
        assertThat(groupSignup.getCancelAtEndOfPeriod()).isFalse();
        assertThat(groupSignup.getNextAssessmentAt()).isAfter(ZonedDateTime.now());
        assertThat(groupSignup.getPaymentCollectionMethod()).isEqualTo(CollectionMethod.AUTOMATIC);
        assertThat(groupSignup.getPaymentProfileId()).isNotNull();
        assertThat(groupSignup.getPrimarySubscriptionId()).isNotNull();
        assertThat(groupSignup.getScheme()).isEqualTo(1);
        assertThat(groupSignup.getScheme()).isEqualTo(1);
        assertThat(groupSignup.getState()).isEqualTo(ACTIVE);
        assertThat(groupSignup.getSubscriptionIds()).isNotEmpty();
        assertThat(groupSignup.getSubscriptionIds()).hasSize(2);
        assertThat(groupSignup.getUid()).isNotNull();

        assertThat(groupSignup.getSubscriptions()).hasSize(2);
        SubscriptionGroupItem subscription1 = groupSignup.getSubscriptions().get(0);
        SubscriptionGroupItem subscription2 = groupSignup.getSubscriptions().get(1);

        assertThat(subscription1.getAdditionalProperties()).isEmpty();
        assertThat(subscription1.getBalanceInCents()).isEqualTo(0);
        assertThat(subscription1.getCouponCode()).isEqualTo(coupon.getCode());
        assertThat(subscription1.getCurrency()).isEqualTo("USD");
        assertThat(subscription1.getId()).isNotNull();
        assertThat(subscription1.getProductHandle()).isEqualTo(product.getHandle());
        assertThat(subscription1.getProductId()).isEqualTo(product.getId());
        assertThat(subscription1.getProductPricePointHandle()).isEqualTo(product.getProductPricePointHandle());
        assertThat(subscription1.getProductPricePointId()).isEqualTo(product.getDefaultProductPricePointId());
        assertThat(subscription1.getReference()).isNull();
        assertThat(subscription1.getTotalRevenueInCents()).isEqualTo(11500);

        assertThat(subscription2.getAdditionalProperties()).isEmpty();
        assertThat(subscription2.getBalanceInCents()).isEqualTo(0);
        assertThat(subscription2.getCouponCode()).isNull();
        assertThat(subscription2.getCurrency()).isEqualTo("USD");
        assertThat(subscription2.getId()).isNotNull();
        assertThat(subscription2.getProductHandle()).isEqualTo(product2.getHandle());
        assertThat(subscription2.getProductId()).isEqualTo(product2.getId());
        assertThat(subscription2.getProductPricePointHandle()).isEqualTo(product2.getProductPricePointHandle());
        assertThat(subscription2.getProductPricePointId()).isEqualTo(product2.getDefaultProductPricePointId());
        assertThat(subscription2.getReference()).isNull();
        assertThat(subscription2.getTotalRevenueInCents()).isEqualTo(24000);

        NestedSubscriptionGroup subscription1Group = CLIENT.getSubscriptionsController().readSubscription(subscription1.getId(), null)
                .getSubscription().getGroup();
        NestedSubscriptionGroup subscription2Group = CLIENT.getSubscriptionsController().readSubscription(subscription2.getId(), null)
                .getSubscription().getGroup();

        assertThat(subscription1Group.getPrimary()).isTrue();
        assertThat(subscription1Group.getPrimarySubscriptionId()).isEqualTo(subscription1.getId());
        assertThat(subscription1Group.getScheme()).isEqualTo(1);
        assertThat(subscription1Group.getUid()).isEqualTo(groupSignup.getUid());

        assertThat(subscription2Group.getPrimary()).isFalse();
        assertThat(subscription2Group.getPrimarySubscriptionId()).isEqualTo(subscription1.getId());
        assertThat(subscription2Group.getScheme()).isEqualTo(1);
        assertThat(subscription2Group.getUid()).isEqualTo(groupSignup.getUid());
    }

    @Test
    void shouldNotSignupGroupWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getSubscriptionGroupsController()
                .signupWithSubscriptionGroup(null));
    }

}
