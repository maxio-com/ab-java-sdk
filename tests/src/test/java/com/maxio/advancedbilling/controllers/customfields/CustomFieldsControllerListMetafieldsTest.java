package com.maxio.advancedbilling.controllers.customfields;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.CustomFieldsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.models.CreateMetafield;
import com.maxio.advancedbilling.models.CreateMetafieldsRequest;
import com.maxio.advancedbilling.models.ListMetafieldsInput;
import com.maxio.advancedbilling.models.ListMetafieldsResponse;
import com.maxio.advancedbilling.models.Metafield;
import com.maxio.advancedbilling.models.MetafieldInput;
import com.maxio.advancedbilling.models.ResourceType;
import com.maxio.advancedbilling.models.SortingDirection;
import com.maxio.advancedbilling.models.containers.CreateMetafieldsRequestMetafields;
import com.maxio.advancedbilling.models.containers.MetafieldEnum;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.matchers.MetafieldEnumGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

import static com.maxio.advancedbilling.controllers.customfields.CustomFieldsTestsUtils.randomScope;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class CustomFieldsControllerListMetafieldsTest {

    protected static final CustomFieldsController CUSTOM_FIELDS_CONTROLLER =
            TestClient.createClient().getCustomFieldsController();

    static Metafield radioMetafield = new Metafield.Builder()
            .name("metafield-" + randomNumeric(7))
            .inputType("radio")
            .mEnum(MetafieldEnum.fromListOfString(List.of("option 1", "option 2")))
            .scope(randomScope())
            .dataCount(0)
            .build();

    static Metafield textMetafield = new Metafield.Builder()
            .name("metafield-" + randomNumeric(7))
            .inputType("text")
            .scope(randomScope())
            .dataCount(0)
            .build();

    static Metafield dropdownMetafield = new Metafield.Builder()
            .name("metafield-" + randomNumeric(7))
            .inputType("dropdown")
            .mEnum(MetafieldEnum.fromListOfString(List.of("option 11", "option 22")))
            .scope(randomScope())
            .dataCount(0)
            .build();

    @BeforeAll
    static void setup() throws IOException, ApiException {
        // remove existing metafields
        new TestTeardown().deleteMetafields();

        // setup new metafields
        for (ResourceType resourceType: ResourceType.values()) {
            CUSTOM_FIELDS_CONTROLLER.createMetafields(resourceType,
                    new CreateMetafieldsRequest(
                            CreateMetafieldsRequestMetafields.fromListOfCreateMetafield(
                                    List.of(fromMetafield(radioMetafield),
                                            fromMetafield(textMetafield),
                                            fromMetafield(dropdownMetafield))
                            )
                    ));
        }
    }

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteMetafields();
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldListMetafields(ResourceType resourceType) throws IOException, ApiException {
        // when
        ListMetafieldsResponse metafieldsResponse = CUSTOM_FIELDS_CONTROLLER.listMetafields(new ListMetafieldsInput
                .Builder()
                .resourceType(resourceType)
                .build());

        // then
        assertThat(metafieldsResponse.getMetafields().size()).isEqualTo(3);
        assertThat(metafieldsResponse.getMetafields())
                .usingRecursiveFieldByFieldElementComparatorIgnoringFields("id", "mEnum")
                .containsExactlyInAnyOrder(radioMetafield, dropdownMetafield, textMetafield);

        assertThat(metafieldsResponse.getPerPage()).isEqualTo(20);
        assertThat(metafieldsResponse.getTotalCount()).isEqualTo(3);
        assertThat(metafieldsResponse.getTotalPages()).isEqualTo(1);
        assertThat(metafieldsResponse.getCurrentPage()).isEqualTo(1);
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldListMetafieldsWithPaging(ResourceType resourceType) throws IOException, ApiException {
        // when
        ListMetafieldsResponse firstPage = listWithPaging(resourceType, 1);
        ListMetafieldsResponse secondPage = listWithPaging(resourceType, 2);
        ListMetafieldsResponse thirdPage = listWithPaging(resourceType, 3);

        // then
        assertThat(firstPage.getMetafields()).hasSize(2);
        assertThat(firstPage.getMetafields()).isSortedAccordingTo(Comparator.comparing(Metafield::getId));
        assertThat(secondPage.getMetafields()).hasSize(1);
        assertThat(thirdPage.getMetafields()).isEmpty();

        assertThat(firstPage.getCurrentPage()).isEqualTo(1);
        assertThat(secondPage.getCurrentPage()).isEqualTo(2);
        assertThat(thirdPage.getCurrentPage()).isEqualTo(3);

        assertThat(firstPage.getTotalPages()).isEqualTo(2);
        assertThat(secondPage.getTotalPages()).isEqualTo(2);
        assertThat(thirdPage.getTotalPages()).isEqualTo(2);
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldListMetafieldsWithDescDirection(ResourceType resourceType) throws IOException, ApiException {
        // when
        List<Metafield> metafields = CUSTOM_FIELDS_CONTROLLER.listMetafields(new ListMetafieldsInput
                .Builder()
                .resourceType(resourceType)
                .direction(SortingDirection.DESC)
                .build()).getMetafields();

        // then
        assertThat(metafields).hasSize(3);
        assertThat(metafields).isSortedAccordingTo(Comparator.comparing(Metafield::getId).reversed());
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldListMetafieldsWithNameFilter(ResourceType resourceType) throws IOException, ApiException {
        // when
        List<Metafield> dropdownMetafieldResponse = CUSTOM_FIELDS_CONTROLLER.listMetafields(new ListMetafieldsInput
                .Builder()
                .resourceType(resourceType)
                .name(dropdownMetafield.getName())
                .build()).getMetafields();
        ListMetafieldsResponse nonExistingMetafieldNameResponse = CUSTOM_FIELDS_CONTROLLER.listMetafields(new ListMetafieldsInput
                .Builder()
                .resourceType(resourceType)
                .name("abc")
                .build());

        // then
        assertThat(dropdownMetafieldResponse).hasSize(1);
        assertThat(dropdownMetafieldResponse.get(0)).usingRecursiveComparison().ignoringFields("id")
                .isEqualTo(dropdownMetafield);
        assertThat(nonExistingMetafieldNameResponse.getMetafields()).isEmpty();
        assertThat(nonExistingMetafieldNameResponse.getTotalPages()).isEqualTo(1);
        assertThat(nonExistingMetafieldNameResponse.getTotalCount()).isEqualTo(0);
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldNotListMetafieldsWhenProvidingInvalidPage(ResourceType resourceType) {
        // when-then
        assertUnprocessableEntity(
                ApiException.class,
                () -> CUSTOM_FIELDS_CONTROLLER.listMetafields(new ListMetafieldsInput
                        .Builder()
                        .resourceType(resourceType)
                        .page(-3)
                        .build()),
                e -> assertThat(e.getMessage()).startsWith("HTTP Response Not OK. Status code: 422. Response:")
        );
    }

    @Test
    void shouldNotListMetafieldsWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getCustomFieldsController()
                .listMetafields(new ListMetafieldsInput.Builder().resourceType(ResourceType.SUBSCRIPTIONS).build()));
    }

    private ListMetafieldsResponse listWithPaging(ResourceType resourceType, int page) throws ApiException, IOException {
        return CUSTOM_FIELDS_CONTROLLER.listMetafields(new ListMetafieldsInput
                .Builder()
                .resourceType(resourceType)
                .perPage(2)
                .page(page)
                .build());
    }

    private static CreateMetafield fromMetafield(Metafield metafield) {
        return new CreateMetafield(metafield.getName(), metafield.getScope(),
                MetafieldInput.fromString(metafield.getInputType()),
                metafield.getEnum() == null ? null: metafield.getEnum().match(new MetafieldEnumGetter<>()));
    }

}
