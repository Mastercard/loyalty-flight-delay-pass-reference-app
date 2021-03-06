/*
 *  Copyright (c) 2021 Mastercard

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

 *
 * Loyalty Flight Delay Pass API
 * The Loyalty Flight Delay Pass APIs offers cardholders, via their issuers, the ability to  access the Lounge in airport if flight gets delayed.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: loyalty-benefits-support@mastercard.flowdock.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



package com.mastercard.developer.flight_delay_pass_reference.api;

import com.mastercard.developer.flight_delay_pass_reference.ApiCallback;
import com.mastercard.developer.flight_delay_pass_reference.ApiClient;
import com.mastercard.developer.flight_delay_pass_reference.ApiException;
import com.mastercard.developer.flight_delay_pass_reference.ApiResponse;
import com.mastercard.developer.flight_delay_pass_reference.Configuration;
import com.mastercard.developer.flight_delay_pass_reference.Pair;
import com.mastercard.developer.flight_delay_pass_reference.ProgressRequestBody;
import com.mastercard.developer.flight_delay_pass_reference.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.mastercard.developer.flight_delay_pass_reference.model.RegistrionResponse;
import com.mastercard.developer.flight_delay_pass_reference.model.UserRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightDelayControllerApi {
    private ApiClient apiClient;

    public FlightDelayControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FlightDelayControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for postRegistration
     * @param xOpenapiClientId  (required)
     * @param userRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postRegistrationCall(String xOpenapiClientId, UserRequest userRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // create path and map variables
        String localVarPath =  "/flight-delay-pass/mock/registrations";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        Map<String, String> localVarHeaderParams = new HashMap<>();
        if (xOpenapiClientId != null) {
            localVarHeaderParams.put("x-openapi-clientid", apiClient.parameterToString(xOpenapiClientId));
        }

        Map<String, Object> localVarFormParams = new HashMap<>();
        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, userRequest, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postRegistrationValidateBeforeCall(String xOpenapiClientId, UserRequest userRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xOpenapiClientId' is set
        if (xOpenapiClientId == null) {
            throw new ApiException("Missing the required parameter 'xOpenapiClientId' when calling postRegistration(Async)");
        }
        
        // verify the required parameter 'userRequest' is set
        if (userRequest == null) {
            throw new ApiException("Missing the required parameter 'userRequest' when calling postRegistration(Async)");
        }


        return postRegistrationCall(xOpenapiClientId, userRequest, progressListener, progressRequestListener);
    }

    /**
     * 
     * 
     * @param xOpenapiClientId  (required)
     * @param userRequest  (required)
     * @return RegistrationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RegistrionResponse postRegistration(String xOpenapiClientId, UserRequest userRequest) throws ApiException {
        ApiResponse<RegistrionResponse> resp = postRegistrationWithHttpInfo(xOpenapiClientId, userRequest);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param xOpenapiClientId  (required)
     * @param userRequest  (required)
     * @return ApiResponse&lt;RegistrionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RegistrionResponse> postRegistrationWithHttpInfo(String xOpenapiClientId, UserRequest userRequest) throws ApiException {
        com.squareup.okhttp.Call call = postRegistrationValidateBeforeCall(xOpenapiClientId, userRequest, null, null);
        Type localVarReturnType = new TypeToken<RegistrionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param xOpenapiClientId  (required)
     * @param userRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postRegistrationAsync(String xOpenapiClientId, UserRequest userRequest, final ApiCallback<RegistrionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postRegistrationValidateBeforeCall(xOpenapiClientId, userRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RegistrionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
