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
import org.openapitools.client.model.AddServiceToLoadBalancerRequest;
import org.openapitools.client.model.CreateLoadBalancerRequest;
import org.openapitools.client.model.ListLoadBalancers200Response;
import org.openapitools.client.model.LoadBalancer;
import org.openapitools.client.model.LoadBalancerService;
import org.openapitools.client.model.Operation;
import java.util.UUID;
import org.openapitools.client.model.UpdateLoadBalancerRequest;
import org.openapitools.client.model.UpdateLoadBalancerServiceRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NetworkLoadBalancerApi
 */
@Disabled
public class NetworkLoadBalancerApiTest {

    private final NetworkLoadBalancerApi api = new NetworkLoadBalancerApi();

    /**
     * Add a Load Balancer Service
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addServiceToLoadBalancerTest() throws ApiException {
        UUID id = null;
        AddServiceToLoadBalancerRequest addServiceToLoadBalancerRequest = null;
        Operation response = api.addServiceToLoadBalancer(id, addServiceToLoadBalancerRequest);
        // TODO: test validations
    }

    /**
     * Create a Load Balancer
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createLoadBalancerTest() throws ApiException {
        CreateLoadBalancerRequest createLoadBalancerRequest = null;
        Operation response = api.createLoadBalancer(createLoadBalancerRequest);
        // TODO: test validations
    }

    /**
     * Delete a Load Balancer
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteLoadBalancerTest() throws ApiException {
        UUID id = null;
        Operation response = api.deleteLoadBalancer(id);
        // TODO: test validations
    }

    /**
     * Delete a Load Balancer Service
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteLoadBalancerServiceTest() throws ApiException {
        UUID id = null;
        UUID serviceId = null;
        Operation response = api.deleteLoadBalancerService(id, serviceId);
        // TODO: test validations
    }

    /**
     * Retrieve Load Balancer details
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLoadBalancerTest() throws ApiException {
        UUID id = null;
        LoadBalancer response = api.getLoadBalancer(id);
        // TODO: test validations
    }

    /**
     * Retrieve Load Balancer Service details
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLoadBalancerServiceTest() throws ApiException {
        UUID id = null;
        UUID serviceId = null;
        LoadBalancerService response = api.getLoadBalancerService(id, serviceId);
        // TODO: test validations
    }

    /**
     * List Load Balancers
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listLoadBalancersTest() throws ApiException {
        ListLoadBalancers200Response response = api.listLoadBalancers();
        // TODO: test validations
    }

    /**
     * Reset a Load Balancer field to its default value
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetLoadBalancerFieldTest() throws ApiException {
        UUID id = null;
        String field = null;
        Operation response = api.resetLoadBalancerField(id, field);
        // TODO: test validations
    }

    /**
     * Reset a Load Balancer Service field to its default value
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetLoadBalancerServiceFieldTest() throws ApiException {
        UUID id = null;
        UUID serviceId = null;
        String field = null;
        Operation response = api.resetLoadBalancerServiceField(id, serviceId, field);
        // TODO: test validations
    }

    /**
     * Update a Load Balancer
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateLoadBalancerTest() throws ApiException {
        UUID id = null;
        UpdateLoadBalancerRequest updateLoadBalancerRequest = null;
        Operation response = api.updateLoadBalancer(id, updateLoadBalancerRequest);
        // TODO: test validations
    }

    /**
     * Update a Load Balancer Service
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateLoadBalancerServiceTest() throws ApiException {
        UUID id = null;
        UUID serviceId = null;
        UpdateLoadBalancerServiceRequest updateLoadBalancerServiceRequest = null;
        Operation response = api.updateLoadBalancerService(id, serviceId, updateLoadBalancerServiceRequest);
        // TODO: test validations
    }

}
