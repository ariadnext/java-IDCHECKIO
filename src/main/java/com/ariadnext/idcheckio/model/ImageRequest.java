/**
 * IdCheck.IO API
 * Check identity documents
 *
 * OpenAPI spec version: 0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.ariadnext.idcheckio.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ImageRequest
 */

public class ImageRequest   {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("frontImage")
  private String frontImage = null;

  @SerializedName("frontImageIr")
  private String frontImageIr = null;

  @SerializedName("frontImageUv")
  private String frontImageUv = null;

  @SerializedName("backImage")
  private String backImage = null;

  @SerializedName("backImageIr")
  private String backImageIr = null;

  @SerializedName("backImageUv")
  private String backImageUv = null;

  @SerializedName("rectoImageCropped")
  private Boolean rectoImageCropped = false;

  @SerializedName("faceImageCropped")
  private Boolean faceImageCropped = false;

  @SerializedName("signatureImageCropped")
  private Boolean signatureImageCropped = false;

  public ImageRequest apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * API version (for backward compatibility purpose)
   * @return apiVersion
  **/
  @ApiModelProperty(example = "null", value = "API version (for backward compatibility purpose)")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public ImageRequest frontImage(String frontImage) {
    this.frontImage = frontImage;
    return this;
  }

   /**
   * frontImage containing front daylight image of the identity document (base64 encoded, no wrap, jpg/png/tiff/pdf format)
   * @return frontImage
  **/
  @ApiModelProperty(example = "null", required = true, value = "frontImage containing front daylight image of the identity document (base64 encoded, no wrap, jpg/png/tiff/pdf format)")
  public String getFrontImage() {
    return frontImage;
  }

  public void setFrontImage(String frontImage) {
    this.frontImage = frontImage;
  }

  public ImageRequest frontImageIr(String frontImageIr) {
    this.frontImageIr = frontImageIr;
    return this;
  }

   /**
   * frontImage containing front infrared image of the identity document (base64 encoded, no wrap, jpg/png/tiff/pdf format)
   * @return frontImageIr
  **/
  @ApiModelProperty(example = "null", required = true, value = "frontImage containing front infrared image of the identity document (base64 encoded, no wrap, jpg/png/tiff/pdf format)")
  public String getFrontImageIr() {
    return frontImageIr;
  }

  public void setFrontImageIr(String frontImageIr) {
    this.frontImageIr = frontImageIr;
  }

  public ImageRequest frontImageUv(String frontImageUv) {
    this.frontImageUv = frontImageUv;
    return this;
  }

   /**
   * frontImage containing front ultraviolet image of the identity document (base64 encoded, no wrap, jpg/png/tiff/pdf format)
   * @return frontImageUv
  **/
  @ApiModelProperty(example = "null", required = true, value = "frontImage containing front ultraviolet image of the identity document (base64 encoded, no wrap, jpg/png/tiff/pdf format)")
  public String getFrontImageUv() {
    return frontImageUv;
  }

  public void setFrontImageUv(String frontImageUv) {
    this.frontImageUv = frontImageUv;
  }

  public ImageRequest backImage(String backImage) {
    this.backImage = backImage;
    return this;
  }

   /**
   * backImage containing daylight back image of the identity document (base64 encoded, no wrap, jpg/png/tiff/pdf format)
   * @return backImage
  **/
  @ApiModelProperty(example = "null", value = "backImage containing daylight back image of the identity document (base64 encoded, no wrap, jpg/png/tiff/pdf format)")
  public String getBackImage() {
    return backImage;
  }

  public void setBackImage(String backImage) {
    this.backImage = backImage;
  }

  public ImageRequest backImageIr(String backImageIr) {
    this.backImageIr = backImageIr;
    return this;
  }

   /**
   * backImage containing infrared back image of the identity document (base64 encoded, no wrap, jpg/png/tiff/pdf format)
   * @return backImageIr
  **/
  @ApiModelProperty(example = "null", value = "backImage containing infrared back image of the identity document (base64 encoded, no wrap, jpg/png/tiff/pdf format)")
  public String getBackImageIr() {
    return backImageIr;
  }

  public void setBackImageIr(String backImageIr) {
    this.backImageIr = backImageIr;
  }

  public ImageRequest backImageUv(String backImageUv) {
    this.backImageUv = backImageUv;
    return this;
  }

   /**
   * backImage containing ultraviolet back image of the identity document (base64 encoded, no wrap, jpg/png/tiff/pdf format)
   * @return backImageUv
  **/
  @ApiModelProperty(example = "null", value = "backImage containing ultraviolet back image of the identity document (base64 encoded, no wrap, jpg/png/tiff/pdf format)")
  public String getBackImageUv() {
    return backImageUv;
  }

  public void setBackImageUv(String backImageUv) {
    this.backImageUv = backImageUv;
  }

  public ImageRequest rectoImageCropped(Boolean rectoImageCropped) {
    this.rectoImageCropped = rectoImageCropped;
    return this;
  }

   /**
   * rectoImageCropped true to obtain recto image cropped if applicable
   * @return rectoImageCropped
  **/
  @ApiModelProperty(example = "null", value = "rectoImageCropped true to obtain recto image cropped if applicable")
  public Boolean getRectoImageCropped() {
    return rectoImageCropped;
  }

  public void setRectoImageCropped(Boolean rectoImageCropped) {
    this.rectoImageCropped = rectoImageCropped;
  }

  public ImageRequest faceImageCropped(Boolean faceImageCropped) {
    this.faceImageCropped = faceImageCropped;
    return this;
  }

   /**
   * faceImageCropped true to obtain recto image cropped if applicable
   * @return faceImageCropped
  **/
  @ApiModelProperty(example = "null", value = "faceImageCropped true to obtain recto image cropped if applicable")
  public Boolean getFaceImageCropped() {
    return faceImageCropped;
  }

  public void setFaceImageCropped(Boolean faceImageCropped) {
    this.faceImageCropped = faceImageCropped;
  }

  public ImageRequest signatureImageCropped(Boolean signatureImageCropped) {
    this.signatureImageCropped = signatureImageCropped;
    return this;
  }

   /**
   * signatureImageCropped true to obtain recto image cropped if applicable
   * @return signatureImageCropped
  **/
  @ApiModelProperty(example = "null", value = "signatureImageCropped true to obtain recto image cropped if applicable")
  public Boolean getSignatureImageCropped() {
    return signatureImageCropped;
  }

  public void setSignatureImageCropped(Boolean signatureImageCropped) {
    this.signatureImageCropped = signatureImageCropped;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageRequest imageRequest = (ImageRequest) o;
    return Objects.equals(this.apiVersion, imageRequest.apiVersion) &&
        Objects.equals(this.frontImage, imageRequest.frontImage) &&
        Objects.equals(this.frontImageIr, imageRequest.frontImageIr) &&
        Objects.equals(this.frontImageUv, imageRequest.frontImageUv) &&
        Objects.equals(this.backImage, imageRequest.backImage) &&
        Objects.equals(this.backImageIr, imageRequest.backImageIr) &&
        Objects.equals(this.backImageUv, imageRequest.backImageUv) &&
        Objects.equals(this.rectoImageCropped, imageRequest.rectoImageCropped) &&
        Objects.equals(this.faceImageCropped, imageRequest.faceImageCropped) &&
        Objects.equals(this.signatureImageCropped, imageRequest.signatureImageCropped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, frontImage, frontImageIr, frontImageUv, backImage, backImageIr, backImageUv, rectoImageCropped, faceImageCropped, signatureImageCropped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageRequest {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    frontImage: ").append(toIndentedString(frontImage)).append("\n");
    sb.append("    frontImageIr: ").append(toIndentedString(frontImageIr)).append("\n");
    sb.append("    frontImageUv: ").append(toIndentedString(frontImageUv)).append("\n");
    sb.append("    backImage: ").append(toIndentedString(backImage)).append("\n");
    sb.append("    backImageIr: ").append(toIndentedString(backImageIr)).append("\n");
    sb.append("    backImageUv: ").append(toIndentedString(backImageUv)).append("\n");
    sb.append("    rectoImageCropped: ").append(toIndentedString(rectoImageCropped)).append("\n");
    sb.append("    faceImageCropped: ").append(toIndentedString(faceImageCropped)).append("\n");
    sb.append("    signatureImageCropped: ").append(toIndentedString(signatureImageCropped)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

