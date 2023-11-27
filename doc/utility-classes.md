
# Utility Classes Documentation

## ApiHelper Class

This is a Helper class with commonly used utilities for the SDK.

### Fields

| Name | Description | Type |
|  --- | --- | --- |
| mapper | Deserialization of Json data. | `ObjectMapper` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `serialize(Object obj)` | Json Serialization of a given object. | `String` |
| `deserialize(String json)` | Json deserialization of the given Json string. | `LinkedHashMap<String, Object>` |
| `deserialize(String json, Class<T> clazz)` | Json deserialization of the given Json string. | `<T extends Object> T` |
| `deserialize(String json, TypeReference<T> typeReference)` | JSON Deserialization of the given json string. | `<T extends Object> T` |
| `deserializeArray(String json, Class<T[]> classArray)` | JSON Deserialization of the given json string. | `<T extends Object> List<T>` |

## FileWrapper Class

Class to wrap file and contentType to be sent as part of a HTTP request.

### Constructors

| Name | Description |
|  --- | --- |
| `FileWrapper(File file)` | Initialization constructor. |
| `FileWrapper(File file, String contentType)` | Initialization constructor. |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `getFile()` | File instance. | `File` |
| `getContentType()` | Content type of the file. | `String` |

## ZonedDateTime Class

This is a utility class for DateTime operations.

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `fromUnixTimestamp(Long date)` | Parse a Unix Timestamp to a DateTime object. | `ZonedDateTime` |
| `fromUnixTimestamp(String date)` | Parse a Unix Timestamp string to a DateTime object. | `ZonedDateTime` |
| `toUnixTimestamp(ZonedDateTime value)` | Convert a DateTime object to a Unix Timestamp string. | `String` |
| `toUnixTimestamp(List<ZonedDateTime> values)` | Convert a List of DateTime objects to Unix Timestamp strings. | `List<String>` |
| `fromRfc1123DateTime(String date)` | Parse a datetime string in Rfc1123 format to a DateTime object. | `ZonedDateTime` |
| `toRfc1123DateTime(ZonedDateTime value)` | Convert a DateTime object to a Rfc1123 formatted string. | `String` |
| `toRfc1123DateTime(List<ZonedDateTime> values)` | Convert a List of DateTime objects to Rfc1123 formatted strings. | `List<String>` |
| `fromRfc8601DateTime(String date)` | Parse a datetime string in Rfc8601(Rfc3339) format to a DateTime object. | `ZonedDateTime` |
| `toRfc8601DateTime(ZonedDateTime value)` | Convert a DateTime object to a Rfc8601(Rfc3339) formatted string. | `String` |
| `toRfc8601DateTime(List<ZonedDateTime> values)` | Convert a List of DateTime objects to Rfc8601(Rfc3339) formatted strings. | `List<String>` |
| `fromSimpleDate(String date)` | Parse a simple date string to a LocalDate object. | `LocalDate` |
| `toSimpleDate(LocalDate value)` | Convert a LocalDate object to a string. | `String` |
| `toSimpleDate(List<LocalDate> values)` | Convert a List of LocalDate objects to strings. | `List<String>` |

