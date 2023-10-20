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
import org.openapitools.client.model.CreateInstancePoolRequest;
import org.openapitools.client.model.EvictInstancePoolMembersRequest;
import org.openapitools.client.model.InstancePool;
import org.openapitools.client.model.ListInstancePools200Response;
import org.openapitools.client.model.Operation;
import org.openapitools.client.model.ScaleInstancePoolRequest;
import java.util.UUID;
import org.openapitools.client.model.UpdateInstancePoolRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InstancePoolApi
 */
@Disabled
public class InstancePoolApiTest {

    private final InstancePoolApi api = new InstancePoolApi();

    /**
     * Create an Instance Pool
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createInstancePoolTest() throws ApiException {
        CreateInstancePoolRequest createInstancePoolRequest = null;
        Operation response = api.createInstancePool(createInstancePoolRequest);
        // TODO: test validations
    }

    /**
     * Delete an Instance Pool
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteInstancePoolTest() throws ApiException {
        UUID id = null;
        Operation response = api.deleteInstancePool(id);
        // TODO: test validations
    }

    /**
     * Evict Instance Pool members
     *
     * This operation evicts the specified Compute instances member from the Instance Pool, shrinking it to &#x60;&amp;lt;current pool size&amp;gt; - &amp;lt;# evicted members&amp;gt;&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void evictInstancePoolMembersTest() throws ApiException {
        UUID id = null;
        EvictInstancePoolMembersRequest evictInstancePoolMembersRequest = null;
        Operation response = api.evictInstancePoolMembers(id, evictInstancePoolMembersRequest);
        // TODO: test validations
    }

    /**
     * Retrieve Instance Pool details
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInstancePoolTest() throws ApiException {
        UUID id = null;
        InstancePool response = api.getInstancePool(id);
        // TODO: test validations
    }

    /**
     * List Instance Pools
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listInstancePoolsTest() throws ApiException {
        ListInstancePools200Response response = api.listInstancePools();
        // TODO: test validations
    }

    /**
     * Reset an Instance Pool field to its default value
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetInstancePoolFieldTest() throws ApiException {
        UUID id = null;
        String field = null;
        Operation response = api.resetInstancePoolField(id, field);
        // TODO: test validations
    }

    /**
     * Scale an Instance Pool
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void scaleInstancePoolTest() throws ApiException {
        UUID id = null;
        ScaleInstancePoolRequest scaleInstancePoolRequest = null;
        Operation response = api.scaleInstancePool(id, scaleInstancePoolRequest);
        // TODO: test validations
    }

    /**
     * Update an Instance Pool
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateInstancePoolTest() throws ApiException {
        UUID id = null;
        UpdateInstancePoolRequest updateInstancePoolRequest = null;
        Operation response = api.updateInstancePool(id, updateInstancePoolRequest);
        // TODO: test validations
    }

}
