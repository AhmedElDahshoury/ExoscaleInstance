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


import openapiclient.src.main.java.org.openapitools.client.model.GetSosPresignedUrl200Response;
import openapiclient.src.main.java.org.openapitools.client.model.ListSosBucketsUsage200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SosApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SosApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SosApi(ApiClient apiClient) {
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
     * Build call for getSosPresignedUrl
     * @param bucket  (required)
     * @param key  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSosPresignedUrlCall(String bucket, String key, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/sos/{bucket}/presigned-url"
            .replace("{" + "bucket" + "}", localVarApiClient.escapeString(bucket.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (key != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("key", key));
        }

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSosPresignedUrlValidateBeforeCall(String bucket, String key, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'bucket' is set
        if (bucket == null) {
            throw new ApiException("Missing the required parameter 'bucket' when calling getSosPresignedUrl(Async)");
        }

        return getSosPresignedUrlCall(bucket, key, _callback);

    }

    /**
     * Retrieve Presigned Download URL for SOS object
     * Generates Presigned Download URL for SOS object
     * @param bucket  (required)
     * @param key  (optional)
     * @return GetSosPresignedUrl200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public GetSosPresignedUrl200Response getSosPresignedUrl(String bucket, String key) throws ApiException {
        ApiResponse<GetSosPresignedUrl200Response> localVarResp = getSosPresignedUrlWithHttpInfo(bucket, key);
        return localVarResp.getData();
    }

    /**
     * Retrieve Presigned Download URL for SOS object
     * Generates Presigned Download URL for SOS object
     * @param bucket  (required)
     * @param key  (optional)
     * @return ApiResponse&lt;GetSosPresignedUrl200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetSosPresignedUrl200Response> getSosPresignedUrlWithHttpInfo(String bucket, String key) throws ApiException {
        okhttp3.Call localVarCall = getSosPresignedUrlValidateBeforeCall(bucket, key, null);
        Type localVarReturnType = new TypeToken<GetSosPresignedUrl200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve Presigned Download URL for SOS object (asynchronously)
     * Generates Presigned Download URL for SOS object
     * @param bucket  (required)
     * @param key  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSosPresignedUrlAsync(String bucket, String key, final ApiCallback<GetSosPresignedUrl200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSosPresignedUrlValidateBeforeCall(bucket, key, _callback);
        Type localVarReturnType = new TypeToken<GetSosPresignedUrl200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listSosBucketsUsage
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listSosBucketsUsageCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/sos-buckets-usage";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listSosBucketsUsageValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return listSosBucketsUsageCall(_callback);

    }

    /**
     * List SOS Buckets Usage
     * 
     * @return ListSosBucketsUsage200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public ListSosBucketsUsage200Response listSosBucketsUsage() throws ApiException {
        ApiResponse<ListSosBucketsUsage200Response> localVarResp = listSosBucketsUsageWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * List SOS Buckets Usage
     * 
     * @return ApiResponse&lt;ListSosBucketsUsage200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListSosBucketsUsage200Response> listSosBucketsUsageWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listSosBucketsUsageValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ListSosBucketsUsage200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List SOS Buckets Usage (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listSosBucketsUsageAsync(final ApiCallback<ListSosBucketsUsage200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = listSosBucketsUsageValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ListSosBucketsUsage200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
