# idcheckio-java-client

![image](https://www.idcheck.io/content/uploads/sites/2/2015/12/tick_mark.png)

Web application : <https://idcheck.io>

Mashape REST API : <https://market.mashape.com/ariadnext/idcheck-io-api>

Swagger REST API : <https://api.idcheck.io/swagger/#/>

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

You have to add this Nexus url on your project :

```groovy
https://repoman.rennes.ariadnext.com/content/repositories/com.ariadnext.idcheckio
```

**Credentials**

To get your credentials, contact us by email with your all needs at: contact@idcheck.io
You will receive two sets of credentials: one for test purpose only and on for production.

**Platforms**

Three platforms can be targeted with the library:

| Platform   |      API URL                     | Credentials | Purpose                                  | Restriction                            | Cost                 |
-------------|----------------------------------|-------------|------------------------------------------|----------------------------------------|----------------------|
| SANDBOX    | https://sandbox.idcheck.io/rest  | Test        | Dev integration + automated tests        | Only a fix set of images are supported | Free
| TEST       | https://api-test.idcheck.io/rest | Test        | Functional tests / Idcheck.io evaluation | No SLA                                 | Commercial agreement
| PROD       | https://api.idcheck.io/rest      | Prod        | Production service                       | None                                   | Commercial agreement

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.ariadnext.idcheckio</groupId>
    <artifactId>idcheckio-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.ariadnext.idcheckio:idcheckio-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/idcheckio-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.ariadnext.idcheckio.invoker.*;
import com.ariadnext.idcheckio.invoker.auth.*;
import com.ariadnext.idcheckio.invoker.model.*;
import com.ariadnext.idcheckio.api.AdministrationApi;

import java.io.File;
import java.util.*;

public class AdministrationApiExample {

    public static void main(String[] args) {

        AdministrationApi apiInstance = new AdministrationApi();
        try {
            HealthResponse result = apiInstance.getHealth();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdministrationApi#getHealth");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/rest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdministrationApi* | [**getHealth**](docs/AdministrationApi.md#getHealth) | **GET** /v0/admin/health | HTTP GET health
*AdministrationApi* | [**getUser**](docs/AdministrationApi.md#getUser) | **GET** /v0/admin/user | HTTP GET user
*AnalysisApi* | [**getReport**](docs/AnalysisApi.md#getReport) | **GET** /v0/pdfreport/{analysisRefUid} | HTTP GET report (demo)
*AnalysisApi* | [**getResult**](docs/AnalysisApi.md#getResult) | **GET** /v0/result/{analysisRefUid} | HTTP GET result
*AnalysisApi* | [**getTask**](docs/AnalysisApi.md#getTask) | **GET** /v0/task/{analysisRefUid} | HTTP GET task
*AnalysisApi* | [**postImage**](docs/AnalysisApi.md#postImage) | **POST** /v0/task/image | HTTP POST task image
*AnalysisApi* | [**postMrz**](docs/AnalysisApi.md#postMrz) | **POST** /v0/task/mrz | HTTP POST task mrz
*SandboxApi* | [**getImage**](docs/SandboxApi.md#getImage) | **GET** /v0/sandbox/image/{imageUid} | HTTP GET image
*SandboxApi* | [**getImageList**](docs/SandboxApi.md#getImageList) | **GET** /v0/sandbox/imagelist | HTTP GET images list
*SandboxApi* | [**getMrz**](docs/SandboxApi.md#getMrz) | **GET** /v0/sandbox/mrz/{mrzUid} | HTTP GET mrz
*SandboxApi* | [**getMrzList**](docs/SandboxApi.md#getMrzList) | **GET** /v0/sandbox/mrzlist | HTTP GET mrz list


## Documentation for Models

 - [CheckSummaryOfTheSubmittedDocument](docs/CheckSummaryOfTheSubmittedDocument.md)
 - [ClassificationOfTheSubmittedDocument](docs/ClassificationOfTheSubmittedDocument.md)
 - [Control](docs/Control.md)
 - [ControlGroup](docs/ControlGroup.md)
 - [DetailedInformationOfTheHolderOfTheSubmittedDocument](docs/DetailedInformationOfTheHolderOfTheSubmittedDocument.md)
 - [DetailedInformationOfTheSubmittedDocument](docs/DetailedInformationOfTheSubmittedDocument.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [EventDate](docs/EventDate.md)
 - [ExtractedImage](docs/ExtractedImage.md)
 - [GenericData](docs/GenericData.md)
 - [HealthResponse](docs/HealthResponse.md)
 - [Image](docs/Image.md)
 - [ImageIndicator](docs/ImageIndicator.md)
 - [ImageListResponse](docs/ImageListResponse.md)
 - [ImageRequest](docs/ImageRequest.md)
 - [Mrz](docs/Mrz.md)
 - [MrzListResponse](docs/MrzListResponse.md)
 - [MrzRequest](docs/MrzRequest.md)
 - [MrzResponse](docs/MrzResponse.md)
 - [ReportResponse](docs/ReportResponse.md)
 - [ResultResponse](docs/ResultResponse.md)
 - [TaskResponse](docs/TaskResponse.md)
 - [UserResponse](docs/UserResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basic

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author
