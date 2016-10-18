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
> ReportResponse getReport(analysisRefUid, authorization, acceptLanguage)

HTTP GET report (demo)

Get a pdf report (base64 encoded) (demo)

### Example
```java
// Import classes:
//import com.ApiException;
//import com.idcheckio.AnalysisApi;


AnalysisApi apiInstance = new AnalysisApi();
String analysisRefUid = "analysisRefUid_example"; // String | Report analysisRefUid
String authorization = "authorization_example"; // String | Authorization header
String acceptLanguage = "acceptLanguage_example"; // String | Accept language header
try {
    ReportResponse result = apiInstance.getReport(analysisRefUid, authorization, acceptLanguage);
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
 **authorization** | **String**| Authorization header |
 **acceptLanguage** | **String**| Accept language header | [optional]

### Return type

[**ReportResponse**](ReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

<a name="getResult"></a>
# **getResult**
> ResultResponse getResult(analysisRefUid, authorization, acceptLanguage, rectoImageCropped, faceImageCropped, signatureImageCropped)

HTTP GET result

Get result controls

### Example
```java
// Import classes:
//import com.ApiException;
//import com.idcheckio.AnalysisApi;


AnalysisApi apiInstance = new AnalysisApi();
String analysisRefUid = "analysisRefUid_example"; // String | Result analysisRefUid
String authorization = "authorization_example"; // String | Authorization header
String acceptLanguage = "acceptLanguage_example"; // String | Accept language header
Boolean rectoImageCropped = false; // Boolean | True to obtain recto image cropped if applicable
Boolean faceImageCropped = false; // Boolean | True to obtain face image cropped if applicable
Boolean signatureImageCropped = false; // Boolean | True to obtain signature image cropped if applicable
try {
    ResultResponse result = apiInstance.getResult(analysisRefUid, authorization, acceptLanguage, rectoImageCropped, faceImageCropped, signatureImageCropped);
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
 **authorization** | **String**| Authorization header |
 **acceptLanguage** | **String**| Accept language header | [optional]
 **rectoImageCropped** | **Boolean**| True to obtain recto image cropped if applicable | [optional] [default to false]
 **faceImageCropped** | **Boolean**| True to obtain face image cropped if applicable | [optional] [default to false]
 **signatureImageCropped** | **Boolean**| True to obtain signature image cropped if applicable | [optional] [default to false]

### Return type

[**ResultResponse**](ResultResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

<a name="getTask"></a>
# **getTask**
> TaskResponse getTask(analysisRefUid, authorization, acceptLanguage, wait)

HTTP GET task

Get task status

### Example
```java
// Import classes:
//import com.ApiException;
//import com.idcheckio.AnalysisApi;


AnalysisApi apiInstance = new AnalysisApi();
String analysisRefUid = "analysisRefUid_example"; // String | Task analysisRefUid
String authorization = "authorization_example"; // String | Authorization header
String acceptLanguage = "acceptLanguage_example"; // String | Accept language header
Long wait = 789L; // Long | specify a maximum wait time in milliseconds
try {
    TaskResponse result = apiInstance.getTask(analysisRefUid, authorization, acceptLanguage, wait);
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
 **authorization** | **String**| Authorization header |
 **acceptLanguage** | **String**| Accept language header | [optional]
 **wait** | **Long**| specify a maximum wait time in milliseconds | [optional]

### Return type

[**TaskResponse**](TaskResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

<a name="postImage"></a>
# **postImage**
> ResultResponse postImage(body2, authorization, asyncMode, body, acceptLanguage)

HTTP POST task image

POST an image check task

### Example
```java
// Import classes:
//import com.ApiException;
//import com.idcheckio.AnalysisApi;


AnalysisApi apiInstance = new AnalysisApi();
ImageRequest body2 = new ImageRequest(); // ImageRequest | Image request
String authorization = "authorization_example"; // String | Authorization header
Boolean asyncMode = true; // Boolean | true to activate asynchrone mode
AsynchronousResponse body = new AsynchronousResponse(); // AsynchronousResponse | 
String acceptLanguage = "acceptLanguage_example"; // String | Accept language header
try {
    ResultResponse result = apiInstance.postImage(body2, authorization, asyncMode, body, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysisApi#postImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body2** | [**ImageRequest**](ImageRequest.md)| Image request |
 **authorization** | **String**| Authorization header |
 **asyncMode** | **Boolean**| true to activate asynchrone mode | [optional]
 **body** | [**AsynchronousResponse**](AsynchronousResponse.md)|  | [optional]
 **acceptLanguage** | **String**| Accept language header | [optional]

### Return type

[**ResultResponse**](ResultResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

<a name="postMrz"></a>
# **postMrz**
> ResultResponse postMrz(body2, authorization, asyncMode, body, acceptLanguage)

HTTP POST task mrz

POST a mrz check task

### Example
```java
// Import classes:
//import com.ApiException;
//import com.idcheckio.AnalysisApi;


AnalysisApi apiInstance = new AnalysisApi();
MrzRequest body2 = new MrzRequest(); // MrzRequest | Mrz request
String authorization = "authorization_example"; // String | Authorization header
Boolean asyncMode = true; // Boolean | true to activate asynchrone mode
AsynchronousResponse body = new AsynchronousResponse(); // AsynchronousResponse | 
String acceptLanguage = "acceptLanguage_example"; // String | Accept language header
try {
    ResultResponse result = apiInstance.postMrz(body2, authorization, asyncMode, body, acceptLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysisApi#postMrz");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body2** | [**MrzRequest**](MrzRequest.md)| Mrz request |
 **authorization** | **String**| Authorization header |
 **asyncMode** | **Boolean**| true to activate asynchrone mode | [optional]
 **body** | [**AsynchronousResponse**](AsynchronousResponse.md)|  | [optional]
 **acceptLanguage** | **String**| Accept language header | [optional]

### Return type

[**ResultResponse**](ResultResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

