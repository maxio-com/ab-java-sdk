# Referral Codes

```java
ReferralCodesController referralCodesController = client.getReferralCodesController();
```

## Class Name

`ReferralCodesController`


# Validate Referral Code

Validates whether a referral code is valid and applicable within your site. This method is useful for validating referral codes that are entered by a customer.

## Referrals Documentation

Full documentation on how to use the referrals feature in the Advanced Billing UI can be located [here](https://maxio.zendesk.com/hc/en-us/sections/24286965611405-Referrals).

## Server Response

If the referral code is valid the status code will be `200` and the referral code will be returned. If the referral code is invalid, a `404` response will be returned.

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

