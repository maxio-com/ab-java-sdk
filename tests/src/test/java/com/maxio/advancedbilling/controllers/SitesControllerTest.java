package com.maxio.advancedbilling.controllers;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.models.AllocationSettings;
import com.maxio.advancedbilling.models.NetTerms;
import com.maxio.advancedbilling.models.OrganizationAddress;
import com.maxio.advancedbilling.models.Site;
import com.maxio.advancedbilling.models.TaxConfiguration;
import com.maxio.advancedbilling.models.TaxConfigurationKind;
import com.maxio.advancedbilling.models.TaxDestinationAddress;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SitesControllerTest {
    private final SitesController sitesController = TestClient.createClient().getSitesController();

    @Test
    void shouldReadSite() throws Exception {
        // when
        Site site = sitesController.readSite().getSite();

        // then
        assertThat(site.getId()).isEqualTo(4512);
        assertThat(site.getName()).isEqualTo("Java SDK Env");
        assertThat(site.getSubdomain()).isEqualTo("java-sdk");
        assertThat(site.getCurrency()).isEqualTo("USD");
        assertThat(site.getSellerId()).isEqualTo(722159);
        assertThat(site.getNonPrimaryCurrencies()).containsExactlyInAnyOrder("EUR");
        assertThat(site.getRelationshipInvoicingEnabled()).isTrue();
        assertThat(site.getCustomerHierarchyEnabled()).isFalse();
        assertThat(site.getWhopaysEnabled()).isFalse();
        assertThat(site.getWhopaysDefaultPayer()).isEqualTo("self-ungrouped");

        AllocationSettings allocationSettings = site.getAllocationSettings();
        assertThat(allocationSettings.getUpgradeCharge()).isEqualTo("prorated");
        assertThat(allocationSettings.getAccrueCharge()).isTrue();
        assertThat(allocationSettings.getDowngradeCredit()).isEqualTo("none");

        OrganizationAddress organizationAddress = site.getOrganizationAddress();
        assertThat(organizationAddress.getStreet()).isEqualTo("Asdf Street");
        assertThat(organizationAddress.getLine2()).isEqualTo("123/444");
        assertThat(organizationAddress.getCity()).isEqualTo("San Antonio");
        assertThat(organizationAddress.getState()).isEqualTo("TX");
        assertThat(organizationAddress.getZip()).isEqualTo("78015");
        assertThat(organizationAddress.getCountry()).isEqualTo("US");
        assertThat(organizationAddress.getName()).isEqualTo("Developer Experience");
        assertThat(organizationAddress.getPhone()).isEqualTo("555 111 222");

        TaxConfiguration taxConfiguration = site.getTaxConfiguration();
        assertThat(taxConfiguration.getFullyConfigured()).isFalse();
        assertThat(taxConfiguration.getKind()).isEqualTo(TaxConfigurationKind.CUSTOM);
        assertThat(taxConfiguration.getDestinationAddress()).isEqualTo(TaxDestinationAddress.SHIPPING_THEN_BILLING);

        NetTerms netTerms = site.getNetTerms();
        assertThat(netTerms.getDefaultNetTerms()).isEqualTo(5);
        assertThat(netTerms.getAutomaticNetTerms()).isEqualTo(5);
        assertThat(netTerms.getRemittanceNetTerms()).isEqualTo(10);
        assertThat(netTerms.getNetTermsOnRemittanceSignupsEnabled()).isTrue();
        assertThat(netTerms.getCustomNetTermsEnabled()).isTrue();

        assertThat(site.getTest()).isTrue();
    }
}
