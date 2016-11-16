# AdministrationApi

All URIs are relative to *https://localhost/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHealth**](AdministrationApi.md#getHealth) | **GET** /v0/admin/health | HTTP GET health
[**getUser**](AdministrationApi.md#getUser) | **GET** /v0/admin/user | HTTP GET user


<a name="getHealth"></a>
# **getHealth**
> HealthResponse getHealth()

HTTP GET health

GET server health (OK 200)

### Example
```java
// Import classes:
//import com.ariadnext.idcheckio.ApiException;
//import com.ariadnext.idcheckio.ws.AdministrationApi;


AdministrationApi apiInstance = new AdministrationApi();
try {
    HealthResponse result = apiInstance.getHealth();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdministrationApi#getHealth");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HealthResponse**](HealthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

<a name="getUser"></a>
# **getUser**
> UserResponse getUser(acceptLanguage)

HTTP GET user

Get user informations

### Example
```java
// Import classes:
//import com.ariadnext.idcheckio.ApiClient;
//import com.ariadnext.idcheckio.ApiException;
//import com.ariadnext.idcheckio.Configuration;
//import com.ariadnext.idcheckio.auth.*;
//import com.ariadnext.idcheckio.ws.AdministrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AdministrationApi apiInstance = new AdministrationApi();
String acceptLanguage = "acceptLanguage_example"; // String | Accept language header
try {
    UserResponse result = apiInstance.getUser(acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdministrationApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **acceptLanguage** | **String**| Accept language header | [optional]

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

