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

import com.mastercard.developer.flight_delay_pass_reference.ApiClient;
import com.mastercard.developer.flight_delay_pass_reference.ApiException;
import com.mastercard.developer.flight_delay_pass_reference.ApiResponse;
import com.mastercard.developer.flight_delay_pass_reference.ProgressRequestBody;
import com.mastercard.developer.flight_delay_pass_reference.model.RegistrionResponse;
import com.mastercard.developer.flight_delay_pass_reference.model.UserRequest;
import com.squareup.okhttp.Call;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.when;

/**
 * API tests for FlightDelayControllerApi
 */
@Ignore
public class FlightDelayControllerApiTest {

    private FlightDelayControllerApi api;

    @Mock
    private ApiClient apiClientMock;

    @Mock
    private Call call;

    @Before
    public void setUp() throws ApiException {
        MockitoAnnotations.initMocks(this);
        api = new FlightDelayControllerApi(apiClientMock);
        //noinspection unchecked,unchecked,unchecked,unchecked
        when(apiClientMock.buildCall(any(String.class), any(String.class), any(List.class), any(List.class), any(Object.class), any(Map.class), any(Map.class), any(String[].class), (ProgressRequestBody.ProgressRequestListener)isNull())).thenReturn(call);
    }
    /**
     *
     *
     *
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postRegistrationTest() throws ApiException {
        String xOpenapiClientId = "api-key";
        UserRequest userRequest = new UserRequest();
        RegistrionResponse registrationResponse = new RegistrionResponse();
        @SuppressWarnings("unchecked") ApiResponse resp = new ApiResponse(200, null, registrationResponse);
        //noinspection unchecked
        when(apiClientMock.execute(any(Call.class), any(Type.class))).thenReturn(resp);
        RegistrionResponse response = api.postRegistration(xOpenapiClientId, userRequest);
        assertEquals(response, registrationResponse);
    }

    @Test(expected = ApiException.class)
    public void createUserTest_Exception() throws ApiException {
        RegistrionResponse registrationResponse = new RegistrionResponse();
        @SuppressWarnings("unchecked") ApiResponse resp = new ApiResponse(200, null, registrationResponse);
        //noinspection unchecked
        when(apiClientMock.execute(any(Call.class), any(Type.class))).thenReturn(resp);
        api.postRegistration(null, null);
    }

}
