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


package openapiclient.src.main.java.org.openapitools.client.api;

import openapiclient.src.main.java.org.openapitools.client.ApiCallback;
import openapiclient.src.main.java.org.openapitools.client.ApiClient;
import openapiclient.src.main.java.org.openapitools.client.ApiException;
import openapiclient.src.main.java.org.openapitools.client.ApiResponse;
import openapiclient.src.main.java.org.openapitools.client.Configuration;
import openapiclient.src.main.java.org.openapitools.client.Pair;
import openapiclient.src.main.java.org.openapitools.client.ProgressRequestBody;
import openapiclient.src.main.java.org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import openapiclient.src.main.java.org.openapitools.client.model.Operation;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ComputeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ComputeApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for resetLoadBalancerServiceField
     * @param id  (required)
     * @param serviceId  (required)
     * @param field  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resetLoadBalancerServiceFieldCall(UUID id, UUID serviceId, String field, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/load-balancer/{id}/service/{service-id}/{field}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()))
            .replace("{" + "service-id" + "}", localVarApiClient.escapeString(serviceId.toString()))
            .replace("{" + "field" + "}", localVarApiClient.escapeString(field.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call resetLoadBalancerServiceFieldValidateBeforeCall(UUID id, UUID serviceId, String field, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling resetLoadBalancerServiceField(Async)");
        }

        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new ApiException("Missing the required parameter 'serviceId' when calling resetLoadBalancerServiceField(Async)");
        }

        // verify the required parameter 'field' is set
        if (field == null) {
            throw new ApiException("Missing the required parameter 'field' when calling resetLoadBalancerServiceField(Async)");
        }

        return resetLoadBalancerServiceFieldCall(id, serviceId, field, _callback);

    }

    /**
     * Reset a Load Balancer Service field to its default value
     * 
     * @param id  (required)
     * @param serviceId  (required)
     * @param field  (required)
     * @return Operation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public Operation resetLoadBalancerServiceField(UUID id, UUID serviceId, String field) throws ApiException {
        ApiResponse<Operation> localVarResp = resetLoadBalancerServiceFieldWithHttpInfo(id, serviceId, field);
        return localVarResp.getData();
    }

    /**
     * Reset a Load Balancer Service field to its default value
     * 
     * @param id  (required)
     * @param serviceId  (required)
     * @param field  (required)
     * @return ApiResponse&lt;Operation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Operation> resetLoadBalancerServiceFieldWithHttpInfo(UUID id, UUID serviceId, String field) throws ApiException {
        okhttp3.Call localVarCall = resetLoadBalancerServiceFieldValidateBeforeCall(id, serviceId, field, null);
        Type localVarReturnType = new TypeToken<Operation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Reset a Load Balancer Service field to its default value (asynchronously)
     * 
     * @param id  (required)
     * @param serviceId  (required)
     * @param field  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call resetLoadBalancerServiceFieldAsync(UUID id, UUID serviceId, String field, final ApiCallback<Operation> _callback) throws ApiException {

        okhttp3.Call localVarCall = resetLoadBalancerServiceFieldValidateBeforeCall(id, serviceId, field, _callback);
        Type localVarReturnType = new TypeToken<Operation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
