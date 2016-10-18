# AdministrationApi

All URIs are relative to *https://localhost/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConfig**](AdministrationApi.md#getConfig) | **GET** /v0/admin/config | 
[**getHealth**](AdministrationApi.md#getHealth) | **GET** /v0/admin/health | HTTP GET health
[**getUser**](AdministrationApi.md#getUser) | **GET** /v0/admin/user | HTTP GET user


<a name="getConfig"></a>
# **getConfig**
> getConfig(authorization)



### Example
```java
// Import classes:
//import com.ApiException;
//import com.idcheckio.AdministrationApi;


AdministrationApi apiInstance = new AdministrationApi();
String authorization = "authorization_example"; // String | Authorization header
try {
    apiInstance.getConfig(authorization);
} catch (ApiException e) {
    System.err.println("Exception when calling AdministrationApi#getConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization header |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

<a name="getHealth"></a>
# **getHealth**
> HealthResponse getHealth()

HTTP GET health

GET server health (OK 200)

### Example
```java
// Import classes:
//import com.ApiException;
//import com.idcheckio.AdministrationApi;


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
> UserResponse getUser(authorization, acceptLanguage)

HTTP GET user

Get user informations

### Example
```java
// Import classes:
//import com.ApiException;
//import com.idcheckio.AdministrationApi;


AdministrationApi apiInstance = new AdministrationApi();
String authorization = "authorization_example"; // String | Authorization header
String acceptLanguage = "acceptLanguage_example"; // String | Accept language header
try {
    UserResponse result = apiInstance.getUser(authorization, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdministrationApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization header |
 **acceptLanguage** | **String**| Accept language header | [optional]

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

