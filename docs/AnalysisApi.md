# AnalysisApi

All URIs are relative to *https://localhost/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReport**](AnalysisApi.md#getReport) | **GET** /v0/pdfreport/{analysisRefUid} | HTTP GET report (demo)
[**getResult**](AnalysisApi.md#getResult) | **GET** /v0/result/{analysisRefUid} | HTTP GET result
[**getTask**](AnalysisApi.md#getTask) | **GET** /v0/task/{analysisRefUid} | HTTP GET task
[**postImage**](AnalysisApi.md#postImage) | **POST** /v0/task/image | HTTP POST task image
[**postMrz**](AnalysisApi.md#postMrz) | **POST** /v0/task/mrz | HTTP POST task mrz


<a name="getReport"></a>
# **getReport**
> ReportResponse getReport(analysisRefUid, acceptLanguage)

HTTP GET report (demo)

Get a pdf report (base64 encoded) (demo)

### Example
```java
// Import classes:
//import com.ariadnext.idcheckio.ApiClient;
//import com.ariadnext.idcheckio.ApiException;
//import com.ariadnext.idcheckio.Configuration;
//import com.ariadnext.idcheckio.auth.*;
//import com.ariadnext.idcheckio.ws.AnalysisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AnalysisApi apiInstance = new AnalysisApi();
String analysisRefUid = "analysisRefUid_example"; // String | Report analysisRefUid
String acceptLanguage = "acceptLanguage_example"; // String | Accept language header
try {
    ReportResponse result = apiInstance.getReport(analysisRefUid, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysisApi#getReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analysisRefUid** | **String**| Report analysisRefUid |
 **acceptLanguage** | **String**| Accept language header | [optional]

### Return type

[**ReportResponse**](ReportResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

<a name="getResult"></a>
# **getResult**
> ResultResponse getResult(analysisRefUid, acceptLanguage, rectoImageCropped, faceImageCropped, signatureImageCropped)

HTTP GET result

Get result controls

### Example
```java
// Import classes:
//import com.ariadnext.idcheckio.ApiClient;
//import com.ariadnext.idcheckio.ApiException;
//import com.ariadnext.idcheckio.Configuration;
//import com.ariadnext.idcheckio.auth.*;
//import com.ariadnext.idcheckio.ws.AnalysisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AnalysisApi apiInstance = new AnalysisApi();
String analysisRefUid = "analysisRefUid_example"; // String | Result analysisRefUid
String acceptLanguage = "acceptLanguage_example"; // String | Accept language header
Boolean rectoImageCropped = false; // Boolean | True to obtain recto image cropped if applicable
Boolean faceImageCropped = false; // Boolean | True to obtain face image cropped if applicable
Boolean signatureImageCropped = false; // Boolean | True to obtain signature image cropped if applicable
try {
    ResultResponse result = apiInstance.getResult(analysisRefUid, acceptLanguage, rectoImageCropped, faceImageCropped, signatureImageCropped);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysisApi#getResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analysisRefUid** | **String**| Result analysisRefUid |
 **acceptLanguage** | **String**| Accept language header | [optional]
 **rectoImageCropped** | **Boolean**| True to obtain recto image cropped if applicable | [optional] [default to false]
 **faceImageCropped** | **Boolean**| True to obtain face image cropped if applicable | [optional] [default to false]
 **signatureImageCropped** | **Boolean**| True to obtain signature image cropped if applicable | [optional] [default to false]

### Return type

[**ResultResponse**](ResultResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

<a name="getTask"></a>
# **getTask**
> TaskResponse getTask(analysisRefUid, acceptLanguage, wait)

HTTP GET task

Get task status

### Example
```java
// Import classes:
//import com.ariadnext.idcheckio.ApiClient;
//import com.ariadnext.idcheckio.ApiException;
//import com.ariadnext.idcheckio.Configuration;
//import com.ariadnext.idcheckio.auth.*;
//import com.ariadnext.idcheckio.ws.AnalysisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AnalysisApi apiInstance = new AnalysisApi();
String analysisRefUid = "analysisRefUid_example"; // String | Task analysisRefUid
String acceptLanguage = "acceptLanguage_example"; // String | Accept language header
Long wait = 789L; // Long | specify a maximum wait time in milliseconds
try {
    TaskResponse result = apiInstance.getTask(analysisRefUid, acceptLanguage, wait);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysisApi#getTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analysisRefUid** | **String**| Task analysisRefUid |
 **acceptLanguage** | **String**| Accept language header | [optional]
 **wait** | **Long**| specify a maximum wait time in milliseconds | [optional]

### Return type

[**TaskResponse**](TaskResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

<a name="postImage"></a>
# **postImage**
> ResultResponse postImage(body, asyncMode, acceptLanguage)

HTTP POST task image

POST an image check task

### Example
```java
// Import classes:
//import com.ariadnext.idcheckio.ApiClient;
//import com.ariadnext.idcheckio.ApiException;
//import com.ariadnext.idcheckio.Configuration;
//import com.ariadnext.idcheckio.auth.*;
//import com.ariadnext.idcheckio.ws.AnalysisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AnalysisApi apiInstance = new AnalysisApi();
ImageRequest body = new ImageRequest(); // ImageRequest | Image request
Boolean asyncMode = true; // Boolean | true to activate asynchrone mode
String acceptLanguage = "acceptLanguage_example"; // String | Accept language header
try {
    ResultResponse result = apiInstance.postImage(body, asyncMode, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysisApi#postImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ImageRequest**](ImageRequest.md)| Image request |
 **asyncMode** | **Boolean**| true to activate asynchrone mode | [optional]
 **acceptLanguage** | **String**| Accept language header | [optional]

### Return type

[**ResultResponse**](ResultResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

<a name="postMrz"></a>
# **postMrz**
> ResultResponse postMrz(body, asyncMode, acceptLanguage)

HTTP POST task mrz

POST a mrz check task

### Example
```java
// Import classes:
//import com.ariadnext.idcheckio.ApiClient;
//import com.ariadnext.idcheckio.ApiException;
//import com.ariadnext.idcheckio.Configuration;
//import com.ariadnext.idcheckio.auth.*;
//import com.ariadnext.idcheckio.ws.AnalysisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

AnalysisApi apiInstance = new AnalysisApi();
MrzRequest body = new MrzRequest(); // MrzRequest | Mrz request
Boolean asyncMode = true; // Boolean | true to activate asynchrone mode
String acceptLanguage = "acceptLanguage_example"; // String | Accept language header
try {
    ResultResponse result = apiInstance.postMrz(body, asyncMode, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysisApi#postMrz");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MrzRequest**](MrzRequest.md)| Mrz request |
 **asyncMode** | **Boolean**| true to activate asynchrone mode | [optional]
 **acceptLanguage** | **String**| Accept language header | [optional]

### Return type

[**ResultResponse**](ResultResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

