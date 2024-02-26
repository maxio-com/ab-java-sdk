package com.maxio.advancedbilling.controllers.proformainvoices;

import com.maxio.advancedbilling.AdvancedBillingClient;
import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.ProformaInvoicesController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.AllocateComponents;
import com.maxio.advancedbilling.models.Component;
import com.maxio.advancedbilling.models.Coupon;
import com.maxio.advancedbilling.models.CreateAllocation;
import com.maxio.advancedbilling.models.CreateMetafield;
import com.maxio.advancedbilling.models.CreateMetafieldsRequest;
import com.maxio.advancedbilling.models.CreateUsage;
import com.maxio.advancedbilling.models.CreateUsageRequest;
import com.maxio.advancedbilling.models.CustomFieldOwner;
import com.maxio.advancedbilling.models.Customer;
import com.maxio.advancedbilling.models.Direction;
import com.maxio.advancedbilling.models.IncludeOption;
import com.maxio.advancedbilling.models.InvoiceCustomField;
import com.maxio.advancedbilling.models.InvoiceDiscountBreakout;
import com.maxio.advancedbilling.models.InvoiceStatus;
import com.maxio.advancedbilling.models.IssueServiceCredit;
import com.maxio.advancedbilling.models.IssueServiceCreditRequest;
import com.maxio.advancedbilling.models.ListProformaInvoicesInput;
import com.maxio.advancedbilling.models.ListProformaInvoicesResponse;
import com.maxio.advancedbilling.models.Metafield;
import com.maxio.advancedbilling.models.MetafieldScope;
import com.maxio.advancedbilling.models.Product;
import com.maxio.advancedbilling.models.ProductFamily;
import com.maxio.advancedbilling.models.ProformaInvoice;
import com.maxio.advancedbilling.models.ProformaInvoiceDiscount;
import com.maxio.advancedbilling.models.ResourceType;
import com.maxio.advancedbilling.models.Subscription;
import com.maxio.advancedbilling.models.VoidInvoice;
import com.maxio.advancedbilling.models.VoidInvoiceRequest;
import com.maxio.advancedbilling.models.containers.CreateMetafieldsRequestMetafields;
import com.maxio.advancedbilling.models.containers.CreateUsageComponentId;
import com.maxio.advancedbilling.models.containers.IssueServiceCreditAmount;
import com.maxio.advancedbilling.utils.TestSetup;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.assertions.CommonAssertions;
import org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class ProformaInvoicesControllerListSubscriptionProformaInvoicesTest {

    private static final TestSetup TEST_SETUP = new TestSetup();
    private static final AdvancedBillingClient CLIENT = TestClient.createClient();
    private static final ProformaInvoicesController PROFORMA_INVOICES_CONTROLLER = CLIENT
            .getProformaInvoicesController();
    private static Customer customer;
    private static Product product;
    private static ProductFamily productFamily;
    private static Component meteredComponent;
    private static Component quantityBasedComponent;
    private static Coupon coupon;
    private static Subscription subscription;
    private static Metafield metafield;
    private static ProformaInvoice proformaInvoice1;
    private static ProformaInvoice proformaInvoice2;
    private static ProformaInvoice proformaInvoice3;
    private static ProformaInvoice proformaInvoice4Voided;

    @BeforeAll
    static void setUp() throws IOException, ApiException {
        productFamily = TEST_SETUP.createProductFamily();
        product = TEST_SETUP.createProduct(productFamily, b -> b.priceInCents(50000));
        customer = TEST_SETUP.createCustomer();
        meteredComponent = TEST_SETUP.createMeteredComponent(productFamily, 11.5);
        quantityBasedComponent = TEST_SETUP.createQuantityBasedComponent(productFamily.getId());
        coupon = TEST_SETUP.createAmountCoupon(productFamily, 1250, true);
        metafield = CLIENT.getCustomFieldsController().createMetafields(
                ResourceType.SUBSCRIPTIONS, new CreateMetafieldsRequest(
                        CreateMetafieldsRequestMetafields.fromCreateMetafield(
                                new CreateMetafield.Builder()
                                        .name("sub-metafield-" + randomNumeric(5))
                                        .scope(new MetafieldScope.Builder().invoices(IncludeOption.INCLUDE).build())
                                        .build()
                        )
                )
        ).get(0);
        subscription = TEST_SETUP.createSubscription(customer, product, s -> s
                .metafields(Map.of(metafield.getName(), "metafield_value"))
        );
        CLIENT.getSubscriptionsController()
                .applyCouponsToSubscription(subscription.getId(), coupon.getCode(), null);

        proformaInvoice1 = PROFORMA_INVOICES_CONTROLLER.createProformaInvoice(subscription.getId());

        CLIENT.getSubscriptionInvoiceAccountController().issueServiceCredit(subscription.getId(),
                new IssueServiceCreditRequest(
                        new IssueServiceCredit(IssueServiceCreditAmount.fromString("5"), "credit")
                ));
        proformaInvoice2 = PROFORMA_INVOICES_CONTROLLER.createProformaInvoice(subscription.getId());

        CLIENT.getSubscriptionComponentsController().allocateComponents(subscription.getId(),
                new AllocateComponents.Builder()
                        .allocations(
                                List.of(
                                        new CreateAllocation.Builder()
                                                .componentId(quantityBasedComponent.getId())
                                                .quantity(20)
                                                .build()
                                )
                        )
                        .build());
        CLIENT.getSubscriptionComponentsController().createUsage(subscription.getId(),
                CreateUsageComponentId.fromNumber(meteredComponent.getId()),
                new CreateUsageRequest(new CreateUsage.Builder()
                        .quantity(20.0)
                        .build()));
        proformaInvoice3 = PROFORMA_INVOICES_CONTROLLER.createProformaInvoice(subscription.getId());
        proformaInvoice4Voided = PROFORMA_INVOICES_CONTROLLER.createProformaInvoice(subscription.getId());
        proformaInvoice4Voided = PROFORMA_INVOICES_CONTROLLER.voidProformaInvoice(proformaInvoice4Voided.getUid(),
                new VoidInvoiceRequest(new VoidInvoice("duplicate")));
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteCustomer(customer);
    }

    @Test
    public void shouldListProformaInvoices() throws IOException, ApiException {
        // when
        List<ProformaInvoice> proformaInvoices = PROFORMA_INVOICES_CONTROLLER
                .listProformaInvoices(new ListProformaInvoicesInput.Builder()
                        .subscriptionId(subscription.getId())
                        .lineItems(true)
                        .credits(true)
                        .discounts(true)
                        .customFields(true)
                        .payments(true)
                        .direction(Direction.ASC)
                        .build()
                ).getProformaInvoices();

        // then
        List<ProformaInvoice> expectedInvoices = List.of(proformaInvoice1, proformaInvoice2, proformaInvoice3, proformaInvoice4Voided);
        assertThat(proformaInvoices).usingRecursiveFieldByFieldElementComparatorIgnoringFields("createdAt", "taxes")
               .isEqualTo(expectedInvoices);

        // custom fields
        assertThat(expectedInvoices).extracting(p -> p.getCustomFields().get(0))
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("metadatumId")
                .containsOnly(
                        new InvoiceCustomField.Builder()
                                .ownerType(CustomFieldOwner.SUBSCRIPTION)
                                .ownerId(subscription.getId())
                                .name(metafield.getName())
                                .value("metafield_value")
                                .build()
                );

        // discounts
        ProformaInvoiceDiscount.Builder discountBuilder = new ProformaInvoiceDiscount.Builder()
                .title("Coupon: %s - %s".formatted(coupon.getCode(), coupon.getDescription()))
                .code(coupon.getCode())
                .discountAmount("12.5")
                .discountType("flat_amount")
                .eligibleAmount("500.0")
                .sourceType("Coupon");
        assertThat(expectedInvoices).extracting(p -> p.getDiscounts().get(0))
                .usingRecursiveFieldByFieldElementComparator(RecursiveComparisonConfiguration.builder()
                        .withIgnoredFields("uid")
                        // also ignore uid nested in InvoiceDiscountBreakouts list
                        .withComparatorForType(((o1, o2) -> o1.getDiscountAmount().equals(o2.getDiscountAmount()) &&
                                        o1.getEligibleAmount().equals(o2.getEligibleAmount()) ? 0 : -1),
                                 InvoiceDiscountBreakout.class)
                        .build())
                .containsOnly(
                        discountBuilder
                                .lineItemBreakouts(List.of(
                                        new InvoiceDiscountBreakout(null, "500.0", "12.5")
                                ))
                                .build(),
                        discountBuilder
                                .title(coupon.getDescription())
                                .eligibleAmount("770.0")
                                .discountAmount("25.0")
                                .lineItemBreakouts(List.of(
                                        new InvoiceDiscountBreakout(null, "20.0", "12.5"),
                                        new InvoiceDiscountBreakout(null, "500.0", "12.5")
                                ))
                                .build()
                );

        // credits
        assertThat(proformaInvoice1.getCredits()).isEmpty();
        assertThat(proformaInvoice2.getCredits()).hasSize(1);
        assertThat(proformaInvoice3.getCredits()).hasSize(1);
        assertThat(proformaInvoice4Voided.getCredits()).hasSize(1);
    }

    @Test
    public void shouldListProformaInvoicesWithoutAdditionalData() throws IOException, ApiException {
        // when
        ProformaInvoice proformaInvoice = PROFORMA_INVOICES_CONTROLLER
                .listProformaInvoices(new ListProformaInvoicesInput.Builder()
                        .subscriptionId(subscription.getId())
                        .direction(Direction.DESC)
                        .perPage(1)
                        .build()
                ).getProformaInvoices().get(0);

        // then
        assertThat(proformaInvoice.getLineItems()).isNull();
        assertThat(proformaInvoice.getCredits()).isNull();
        assertThat(proformaInvoice.getDiscounts()).isNull();
        assertThat(proformaInvoice.getTaxes()).isNull();
        assertThat(proformaInvoice.getCustomFields()).isNull();
        assertThat(proformaInvoice.getPayments()).isNull();
    }

    @Test
    public void shouldListProformaInvoicesFilteringByStatus() throws IOException, ApiException {
        // when
        List<ProformaInvoice> proformaInvoices = PROFORMA_INVOICES_CONTROLLER
                .listProformaInvoices(new ListProformaInvoicesInput.Builder()
                        .subscriptionId(subscription.getId())
                        .status(InvoiceStatus.VOIDED)
                        .build()
                ).getProformaInvoices();

        // then
        assertThat(proformaInvoices).hasSize(1);
        assertThat(proformaInvoices.get(0)).usingRecursiveComparison()
                .ignoringFields("payments", "taxes", "credits", "createdAt", "customFields",
                        "lineItems", "discounts")
                .isEqualTo(proformaInvoice4Voided);
    }

    @Test
    public void shouldListProformaInvoicesWithPaging() throws IOException, ApiException {
        // when
        ListProformaInvoicesResponse page1 = PROFORMA_INVOICES_CONTROLLER
                .listProformaInvoices(new ListProformaInvoicesInput.Builder()
                        .subscriptionId(subscription.getId())
                        .page(1)
                        .perPage(2)
                        .build()
                );
        ListProformaInvoicesResponse page2 = PROFORMA_INVOICES_CONTROLLER
                .listProformaInvoices(new ListProformaInvoicesInput.Builder()
                        .subscriptionId(subscription.getId())
                        .page(2)
                        .perPage(2)
                        .build()
                );
        ListProformaInvoicesResponse page3 = PROFORMA_INVOICES_CONTROLLER
                .listProformaInvoices(new ListProformaInvoicesInput.Builder()
                        .subscriptionId(subscription.getId())
                        .page(3)
                        .perPage(2)
                        .build()
                );


        // then
        assertThat(page1.getProformaInvoices()).hasSize(2);
        assertThat(page1.getMeta().getCurrentPage()).isEqualTo(1);
        assertThat(page1.getMeta().getTotalPages()).isEqualTo(2);
        assertThat(page1.getMeta().getTotalCount()).isEqualTo(4);

        assertThat(page2.getProformaInvoices()).hasSize(2);
        assertThat(page2.getMeta().getCurrentPage()).isEqualTo(2);
        assertThat(page2.getMeta().getTotalPages()).isEqualTo(2);
        assertThat(page2.getMeta().getTotalCount()).isEqualTo(4);

        assertThat(page3.getProformaInvoices()).isEmpty();
        assertThat(page3.getMeta().getCurrentPage()).isEqualTo(3);
        assertThat(page3.getMeta().getTotalPages()).isEqualTo(2);
        assertThat(page3.getMeta().getTotalCount()).isEqualTo(4);
    }

    @Test
    public void shouldListProformaInvoicesUsingDateFilters() throws IOException, ApiException {
        // when
        List<ProformaInvoice> proformaInvoices = PROFORMA_INVOICES_CONTROLLER
                .listProformaInvoices(new ListProformaInvoicesInput.Builder()
                        .subscriptionId(subscription.getId())
                        .startDate(LocalDate.now().minusDays(5).toString())
                        .endDate(LocalDate.now().minusDays(3).toString())
                        .build()
                ).getProformaInvoices();

        // then
        assertThat(proformaInvoices).isEmpty();
    }

    @Test
    void shouldReturn401WhenProvidingInvalidCredentials() {
        // when - then
        CommonAssertions.assertUnauthorized(
                () -> TestClient.createInvalidCredentialsClient().getProformaInvoicesController()
                        .listProformaInvoices(new ListProformaInvoicesInput())
        );
    }

}
