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
import org.openapitools.client.model.AddExternalSourceToSecurityGroupRequest;
import org.openapitools.client.model.AddRuleToSecurityGroupRequest;
import org.openapitools.client.model.CreateSecurityGroupRequest;
import org.openapitools.client.model.DetachInstanceFromPrivateNetworkRequest;
import org.openapitools.client.model.ListSecurityGroups200Response;
import org.openapitools.client.model.Operation;
import org.openapitools.client.model.RemoveExternalSourceFromSecurityGroupRequest;
import org.openapitools.client.model.SecurityGroup;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecurityGroupApi
 */
@Disabled
public class SecurityGroupApiTest {

    private final SecurityGroupApi api = new SecurityGroupApi();

    /**
     * Add an external source as a member of a Security Group
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addExternalSourceToSecurityGroupTest() throws ApiException {
        UUID id = null;
        AddExternalSourceToSecurityGroupRequest addExternalSourceToSecurityGroupRequest = null;
        Operation response = api.addExternalSourceToSecurityGroup(id, addExternalSourceToSecurityGroupRequest);
        // TODO: test validations
    }

    /**
     * Create a Security Group rule
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addRuleToSecurityGroupTest() throws ApiException {
        UUID id = null;
        AddRuleToSecurityGroupRequest addRuleToSecurityGroupRequest = null;
        Operation response = api.addRuleToSecurityGroup(id, addRuleToSecurityGroupRequest);
        // TODO: test validations
    }

    /**
     * Attach a Compute instance to a Security Group
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void attachInstanceToSecurityGroupTest() throws ApiException {
        UUID id = null;
        DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest = null;
        Operation response = api.attachInstanceToSecurityGroup(id, detachInstanceFromPrivateNetworkRequest);
        // TODO: test validations
    }

    /**
     * Create a Security Group
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSecurityGroupTest() throws ApiException {
        CreateSecurityGroupRequest createSecurityGroupRequest = null;
        Operation response = api.createSecurityGroup(createSecurityGroupRequest);
        // TODO: test validations
    }

    /**
     * Delete a Security Group rule
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRuleFromSecurityGroupTest() throws ApiException {
        UUID id = null;
        UUID ruleId = null;
        Operation response = api.deleteRuleFromSecurityGroup(id, ruleId);
        // TODO: test validations
    }

    /**
     * Delete a Security Group
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSecurityGroupTest() throws ApiException {
        UUID id = null;
        Operation response = api.deleteSecurityGroup(id);
        // TODO: test validations
    }

    /**
     * Detach a Compute instance from a Security Group
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void detachInstanceFromSecurityGroupTest() throws ApiException {
        UUID id = null;
        DetachInstanceFromPrivateNetworkRequest detachInstanceFromPrivateNetworkRequest = null;
        Operation response = api.detachInstanceFromSecurityGroup(id, detachInstanceFromPrivateNetworkRequest);
        // TODO: test validations
    }

    /**
     * Retrieve Security Group details
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSecurityGroupTest() throws ApiException {
        UUID id = null;
        SecurityGroup response = api.getSecurityGroup(id);
        // TODO: test validations
    }

    /**
     * List Security Groups.
     *
     * Lists security groups. When visibility is set to public, lists public security groups. Public security groups are objects maintained by Exoscale which contain source addresses for relevant services hosted by Exoscale. They can be used a source in ingress rules and as a destination in egress rules.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSecurityGroupsTest() throws ApiException {
        String visibility = null;
        ListSecurityGroups200Response response = api.listSecurityGroups(visibility);
        // TODO: test validations
    }

    /**
     * Remove an external source from a Security Group
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeExternalSourceFromSecurityGroupTest() throws ApiException {
        UUID id = null;
        RemoveExternalSourceFromSecurityGroupRequest removeExternalSourceFromSecurityGroupRequest = null;
        Operation response = api.removeExternalSourceFromSecurityGroup(id, removeExternalSourceFromSecurityGroupRequest);
        // TODO: test validations
    }

}