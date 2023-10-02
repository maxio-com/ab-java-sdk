
# ACH Agreement

(Optional) If passed, the proof of the authorized ACH agreement terms will be persisted.

## Structure

`ACHAgreement`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AgreementTerms` | `String` | Optional | (Required when providing ACH agreement params) The ACH authorization agreement terms. | String getAgreementTerms() | setAgreementTerms(String agreementTerms) |
| `AuthorizerFirstName` | `String` | Optional | (Required when providing ACH agreement params) The first name of the person authorizing the ACH agreement. | String getAuthorizerFirstName() | setAuthorizerFirstName(String authorizerFirstName) |
| `AuthorizerLastName` | `String` | Optional | (Required when providing ACH agreement params) The last name of the person authorizing the ACH agreement. | String getAuthorizerLastName() | setAuthorizerLastName(String authorizerLastName) |
| `IpAddress` | `String` | Optional | (Required when providing ACH agreement params) The IP address of the person authorizing the ACH agreement. | String getIpAddress() | setIpAddress(String ipAddress) |

## Example (as JSON)

```json
{
  "agreement_terms": "agreement_terms4",
  "authorizer_first_name": "authorizer_first_name2",
  "authorizer_last_name": "authorizer_last_name2",
  "ip_address": "ip_address2"
}
```

