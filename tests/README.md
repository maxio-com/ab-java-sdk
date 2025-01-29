This test suite is quite large and can occasionally be flaky for certain endpoints, such as when AB returns a server error response.
To mitigate these issues, the suite has been parallelized, allowing for faster reruns when necessary.

To execute the tests, provide the following environment variables:
- `SUBDOMAINS` - A list of subdomains your tests will use. Locally, a single site should suffice.
- `API_KEYS` - A list of API keys corresponding to the subdomains. The order of keys must match the order of the subdomains.
- `SITE_ID` - (optional): Used only for site-specific assertions. Not required unless you are testing the site endpoint.
- `PRECONFIGURED_SUBDOMAIN` - A subdomain with a preconfigured state.
- `PRECONFIGURED_API_KEY` - The API key for the subdomain in a preconfigured state.


### Preconfigured site

Most tests require setting up resources beforehand. After the test suite finishes, a cleanup process is triggered.
However, not all resources can be set up using the API.

For tests that require such resources, a Preconfigured Site is used—a special site where resources are manually configured and are not cleared after each test run.

To use the Preconfigured Site, retrieve a client for it with the following method:
```
TestClientProvider.getPreconfiguredSiteClient()
```

### Notes on parallelism

- Each subdomain specified in the `SUBDOMAINS` environment variable is assigned a single thread.
- All test cases within a specific test class are executed on the same thread (and therefore the same subdomain) to prevent concurrent execution for the same site, which could result in test failures. This is also because most test classes have a single setup method that runs before all the tests in the class.
- Avoid using static fields in test classes - Some tests override static fields in base classes, which can interfere with other test runs.

