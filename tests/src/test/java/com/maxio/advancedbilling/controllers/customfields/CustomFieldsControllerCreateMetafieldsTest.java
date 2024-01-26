package com.maxio.advancedbilling.controllers.customfields;

import com.maxio.advancedbilling.TestClient;
import com.maxio.advancedbilling.controllers.CustomFieldsController;
import com.maxio.advancedbilling.exceptions.ApiException;
import com.maxio.advancedbilling.exceptions.SingleErrorResponseException;
import com.maxio.advancedbilling.models.CreateMetafield;
import com.maxio.advancedbilling.models.CreateMetafieldsRequest;
import com.maxio.advancedbilling.models.IncludeOption;
import com.maxio.advancedbilling.models.Metafield;
import com.maxio.advancedbilling.models.MetafieldInput;
import com.maxio.advancedbilling.models.MetafieldScope;
import com.maxio.advancedbilling.models.ResourceType;
import com.maxio.advancedbilling.models.containers.CreateMetafieldsRequestMetafields;
import com.maxio.advancedbilling.utils.TestTeardown;
import com.maxio.advancedbilling.utils.matchers.MetafieldEnumGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static com.maxio.advancedbilling.controllers.customfields.CustomFieldsTestsUtils.EMPTY_SCOPE;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnauthorized;
import static com.maxio.advancedbilling.utils.assertions.CommonAssertions.assertUnprocessableEntity;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class CustomFieldsControllerCreateMetafieldsTest {

    protected static final CustomFieldsController CUSTOM_FIELDS_CONTROLLER =
            TestClient.createClient().getCustomFieldsController();

    @AfterAll
    static void teardown() throws IOException, ApiException {
        new TestTeardown().deleteMetafields();
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldCreateSingleTextMetafieldWithScope(ResourceType resourceType) throws IOException, ApiException {
        // given
        String metafieldName = "text-metafield-" + randomNumeric(5);
        MetafieldScope scope = new MetafieldScope.Builder()
                .csv(IncludeOption.INCLUDE)
                .invoices(IncludeOption.INCLUDE)
                .statements(IncludeOption.INCLUDE)
                .portal(IncludeOption.EXCLUDE)
                .publicShow(IncludeOption.EXCLUDE)
                .publicEdit(IncludeOption.EXCLUDE)
                .build();
        CreateMetafieldsRequest createMetafieldsRequest =
                new CreateMetafieldsRequest(
                        CreateMetafieldsRequestMetafields.fromCreateMetafield(
                                new CreateMetafield.Builder()
                                        .name(metafieldName)
                                        .inputType(MetafieldInput.TEXT)
                                        .scope(scope)
                                        .build()
                        ));

        // when
        List<Metafield> metafields = CUSTOM_FIELDS_CONTROLLER.createMetafields(resourceType, createMetafieldsRequest);

        // then
        assertThat(metafields.size()).isEqualTo(1);
        Metafield metafield = metafields.get(0);
        assertThat(metafield.getId()).isNotNull();
        assertThat(metafield.getName()).isEqualTo(metafieldName);
        assertThat(metafield.getDataCount()).isEqualTo(0);
        assertThat(metafield.getInputType()).isEqualTo("text");
        assertThat(metafield.getEnum()).isNull();
        assertThat(metafield.getScope()).usingRecursiveComparison()
                .ignoringFields("hosted").isEqualTo(scope);
        assertThat(metafield.getScope().getHosted()).isEmpty();
    }

    @ParameterizedTest
    @EnumSource(ResourceType.class)
    void shouldCreateMultipleMetafieldsRadioAndDropdown(ResourceType resourceType) throws IOException, ApiException {
        // given
        String radioMetafieldName = "radio-" + randomNumeric(5);
        List<String> radioEnum = List.of("radio-option-1", "radio-option-2");
        String dropdownMetafieldName = "dropdown-" + randomNumeric(5);
        List<String> dropdownEnum = List.of("dropdown-option-1");

        CreateMetafieldsRequest createMetafieldsRequest =
                new CreateMetafieldsRequest(
                        CreateMetafieldsRequestMetafields.fromListOfCreateMetafield(
                                List.of(
                                    new CreateMetafield.Builder()
                                            .name(radioMetafieldName)
                                            .inputType(MetafieldInput.RADIO)
                                            .mEnum(radioEnum)
                                            .build(),
                                    new CreateMetafield.Builder()
                                            .name(dropdownMetafieldName)
                                            .inputType(MetafieldInput.DROPDOWN)
                                            .mEnum(dropdownEnum)
                                            .build()
                                )
                        ));

        // when
        List<Metafield> metafields = CUSTOM_FIELDS_CONTROLLER.createMetafields(resourceType, createMetafieldsRequest);

        // then
        assertThat(metafields.size()).isEqualTo(2);

        Metafield radioMetafield = metafields.get(0);
        assertThat(radioMetafield.getId()).isNotNull();
        assertThat(radioMetafield.getName()).isEqualTo(radioMetafieldName);
        assertThat(radioMetafield.getDataCount()).isEqualTo(0);
        assertThat(radioMetafield.getInputType()).isEqualTo("radio");
        assertThat(radioMetafield.getEnum()
                .match(new MetafieldEnumGetter<List<String>>()))
                .isEqualTo(radioEnum);
        assertThat(radioMetafield.getScope()).usingRecursiveComparison().isEqualTo(EMPTY_SCOPE);

        Metafield dropdownMetafield = metafields.get(1);
        assertThat(dropdownMetafield.getId()).isNotNull();
        assertThat(dropdownMetafield.getName()).isEqualTo(dropdownMetafieldName);
        assertThat(dropdownMetafield.getDataCount()).isEqualTo(0);
        assertThat(dropdownMetafield.getInputType()).isEqualTo("dropdown");
        assertThat(dropdownMetafield.getEnum()
                .match(new MetafieldEnumGetter<List<String>>()))
                .isEqualTo(dropdownEnum);
        assertThat(dropdownMetafield.getScope()).usingRecursiveComparison().isEqualTo(EMPTY_SCOPE);
    }

    @ParameterizedTest
    @MethodSource("argsForShouldReturn422WhenCreatingMetafieldsWithInvalidData")
    void shouldReturn422WhenCreatingMetafieldsWithInvalidData(CreateMetafieldsRequest request,
                                                              String expectedError) {
        // when - then
        assertUnprocessableEntity(
                SingleErrorResponseException.class,
                () -> CUSTOM_FIELDS_CONTROLLER.createMetafields(ResourceType.SUBSCRIPTIONS, request),
                e -> assertThat(e.getError()).isEqualTo(expectedError)
        );
    }

    private static Stream<Arguments> argsForShouldReturn422WhenCreatingMetafieldsWithInvalidData() {
        return Stream.of(
                Arguments.of(
                        null, "The root key 'metafields' is required"
                ),
                Arguments.of(
                        new CreateMetafieldsRequest(CreateMetafieldsRequestMetafields
                                .fromCreateMetafield(new CreateMetafield())),
                        "'name' must be present to create or update metafields"
                ),
                Arguments.of(
                        new CreateMetafieldsRequest(CreateMetafieldsRequestMetafields
                                .fromCreateMetafield(new CreateMetafield.Builder().name("").build())),
                        "'name' must be present to create or update metafields"
                )
        );
    }

    @Test
    void shouldNotCreateMetafieldsWhenProvidingInvalidCredentials() {
        assertUnauthorized(() -> TestClient.createInvalidCredentialsClient().getCustomFieldsController()
                .createMetafields(ResourceType.SUBSCRIPTIONS, null));
    }

}
