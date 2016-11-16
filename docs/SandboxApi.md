# SandboxApi

All URIs are relative to *https://localhost/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getImage**](SandboxApi.md#getImage) | **GET** /v0/sandbox/image/{imageUid} | HTTP GET image
[**getImageList**](SandboxApi.md#getImageList) | **GET** /v0/sandbox/imagelist | HTTP GET images list
[**getMrz**](SandboxApi.md#getMrz) | **GET** /v0/sandbox/mrz/{mrzUid} | HTTP GET mrz
[**getMrzList**](SandboxApi.md#getMrzList) | **GET** /v0/sandbox/mrzlist | HTTP GET mrz list


<a name="getImage"></a>
# **getImage**
> List&lt;byte[]&gt; getImage(imageUid, rawType, face, light)

HTTP GET image

GET image

### Example
```java
// Import classes:
//import com.ariadnext.idcheckio.ApiException;
//import com.ariadnext.idcheckio.ws.SandboxApi;


SandboxApi apiInstance = new SandboxApi();
String imageUid = "imageUid_example"; // String | EnumDemoDocsImage
String rawType = "rawType_example"; // String | Image raw type
String face = "face_example"; // String | Image face
String light = "light_example"; // String | Image light
try {
    List<byte[]> result = apiInstance.getImage(imageUid, rawType, face, light);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SandboxApi#getImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageUid** | **String**| EnumDemoDocsImage |
 **rawType** | **String**| Image raw type | [optional] [enum: BASE64, JPG]
 **face** | **String**| Image face | [optional] [enum: RECTO, VERSO]
 **light** | **String**| Image light | [optional] [enum: DL, IR, UV]

### Return type

**List&lt;byte[]&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

<a name="getImageList"></a>
# **getImageList**
> ImageListResponse getImageList()

HTTP GET images list

GET images list

### Example
```java
// Import classes:
//import com.ariadnext.idcheckio.ApiException;
//import com.ariadnext.idcheckio.ws.SandboxApi;


SandboxApi apiInstance = new SandboxApi();
try {
    ImageListResponse result = apiInstance.getImageList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SandboxApi#getImageList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ImageListResponse**](ImageListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

<a name="getMrz"></a>
# **getMrz**
> MrzResponse getMrz(mrzUid)

HTTP GET mrz

GET mrz

### Example
```java
// Import classes:
//import com.ariadnext.idcheckio.ApiException;
//import com.ariadnext.idcheckio.ws.SandboxApi;


SandboxApi apiInstance = new SandboxApi();
String mrzUid = "mrzUid_example"; // String | EnumDemoDocsMrz
try {
    MrzResponse result = apiInstance.getMrz(mrzUid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SandboxApi#getMrz");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mrzUid** | **String**| EnumDemoDocsMrz |

### Return type

[**MrzResponse**](MrzResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

<a name="getMrzList"></a>
# **getMrzList**
> MrzListResponse getMrzList()

HTTP GET mrz list

GET mrz list

### Example
```java
// Import classes:
//import com.ariadnext.idcheckio.ApiException;
//import com.ariadnext.idcheckio.ws.SandboxApi;


SandboxApi apiInstance = new SandboxApi();
try {
    MrzListResponse result = apiInstance.getMrzList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SandboxApi#getMrzList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MrzListResponse**](MrzListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

