
# Resumption Charge

(For calendar billing subscriptions only) The way that the resumed subscription's charge should be handled

## Enumeration

`ResumptionCharge`

## Fields

| Name |
|  --- |
| `PRORATED` |
| `IMMEDIATE` |
| `DELAYED` |

## Example

```java
import com.maxio.advancedbilling.models.ResumptionCharge;

ResumptionCharge resumptionCharge = ResumptionCharge.IMMEDIATE;
```

