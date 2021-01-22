/*
 * FlightDelayPass API
 * FlightDelayPass application
 *
 * OpenAPI spec version: v1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.flight_delay_pass_reference.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Account
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-22T14:30:47.482-06:00[America/Chicago]")
public class Account {
  public static final String SERIALIZED_NAME_PAN = "pan";
  @SerializedName(SERIALIZED_NAME_PAN)
  private String pan;

  public static final String SERIALIZED_NAME_ICA = "ica";
  @SerializedName(SERIALIZED_NAME_ICA)
  private Integer ica;

  public Account pan(String pan) {
    this.pan = pan;
    return this;
  }

   /**
   * Get pan
   * @return pan
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPan() {
    return pan;
  }

  public void setPan(String pan) {
    this.pan = pan;
  }

  public Account ica(Integer ica) {
    this.ica = ica;
    return this;
  }

   /**
   * Get ica
   * @return ica
  **/
  @ApiModelProperty(value = "")
  public Integer getIca() {
    return ica;
  }

  public void setIca(Integer ica) {
    this.ica = ica;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.pan, account.pan) &&
        Objects.equals(this.ica, account.ica);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pan, ica);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    ica: ").append(toIndentedString(ica)).append("\n");
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

