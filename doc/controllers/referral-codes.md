# Referral Codes

```java
ReferralCodesController referralCodesController = client.getReferralCodesController();
```

## Class Name

`ReferralCodesController`


# Validate Referral Code

Validates whether a referral code is valid and applicable within your site. This method is useful for validating referral codes that are entered by a customer.

For more information, see [Understanding Referrals](https://docs.maxio.com/hc/en-us/articles/24286981223693-Understanding-Referrals) in the product documentation.

```java
ReferralValidationResponse validateReferralCode(
    final String code)
```

## Authentication

This endpoint requires [BasicAuth](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `code` | `String` | Query, Required | The referral code you are trying to validate |

## Response Type

**200**: OK

[`ReferralValidationResponse`](../../doc/models/referral-validation-response.md)

## Example Usage

```java
String code = "code8";

try {
    ReferralValidationResponse result = referralCodesController.validateReferralCode(code);
    System.out.println(result);
} catch (SingleStringErrorResponseException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

## Example Response *(as JSON)*

```json
{
  "referral_code": {
    "id": 1032514,
    "site_id": 31615,
    "subscription_id": 16254270,
    "code": "9b6cdw"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found | [`SingleStringErrorResponseException`](../../doc/models/single-string-error-response-exception.md) |

