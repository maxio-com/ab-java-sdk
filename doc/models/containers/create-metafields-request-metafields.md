
# Create Metafields Request Metafields

## Class Name

`CreateMetafieldsRequestMetafields`

## Cases

| Type | Factory Method |
|  --- | --- |
| [`CreateMetafield`](../../../doc/models/create-metafield.md) | CreateMetafieldsRequestMetafields.fromCreateMetafield(CreateMetafield createMetafield) |
| [`List<CreateMetafield>`](../../../doc/models/create-metafield.md) | CreateMetafieldsRequestMetafields.fromListOfCreateMetafield(List<CreateMetafield> listOfCreateMetafield) |

## CreateMetafield

### Initialization Code

#### Example

```java
CreateMetafieldsRequestMetafields.fromCreateMetafield(
        new CreateMetafield.Builder()
            .name("my_field")
            .scope(new MetafieldScope.Builder()
                .csv(IncludeOption.EXCLUDE)
                .invoices(IncludeOption.EXCLUDE)
                .statements(IncludeOption.EXCLUDE)
                .portal(IncludeOption.EXCLUDE)
                .publicShow(IncludeOption.EXCLUDE)
                .publicEdit(IncludeOption.EXCLUDE)
                .build())
            .inputType(MetafieldInput.TEXT)
            .mEnum(Arrays.asList(
                "string"
            ))
            .build()
    )
```

## List<CreateMetafield>

### Initialization Code

#### Example

```java
CreateMetafieldsRequestMetafields.fromListOfCreateMetafield(
        Arrays.asList(
            new CreateMetafield.Builder()
                .build()
        )
    )
```

