/*
 * Exoscale Public API
 *  Infrastructure automation API, allowing programmatic access to all Exoscale products and services.  The [OpenAPI Specification](http://spec.openapis.org/oas/v3.0.3.html) source of this documentation can be obtained here:  * [JSON format](https://openapi-v2.exoscale.com/source.json) * [YAML format](https://openapi-v2.exoscale.com/source.yaml)
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@exoscale.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package openapiclient.src.test.java.org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.GetSosPresignedUrl200Response;
import org.openapitools.client.model.ListSosBucketsUsage200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SosApi
 */
@Disabled
public class SosApiTest {

    private final SosApi api = new SosApi();

    /**
     * Retrieve Presigned Download URL for SOS object
     *
     * Generates Presigned Download URL for SOS object
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSosPresignedUrlTest() throws ApiException {
        String bucket = null;
        String key = null;
        GetSosPresignedUrl200Response response = api.getSosPresignedUrl(bucket, key);
        // TODO: test validations
    }

    /**
     * List SOS Buckets Usage
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSosBucketsUsageTest() throws ApiException {
        ListSosBucketsUsage200Response response = api.listSosBucketsUsage();
        // TODO: test validations
    }

}