/*
 * Exoscale Public API
 *  Infrastructure automation API, allowing programmatic access to all Exoscale products and services.  The [OpenAPI Specification](http://spec.openapis.org/oas/v3.0.3.html) source of this documentation can be obtained here:  * [JSON format](https://openapi-v2.exoscale.com/source.json) * [YAML format](https://openapi-v2.exoscale.com/source.yaml)
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@exoscale.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package openapiclient.src.main.java.org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import openapiclient.src.main.java.org.openapitools.client.model.DbaasMigrationStatusDetailsInner;
import openapiclient.src.main.java.org.openapitools.client.model.EnumMasterLinkStatus;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import openapiclient.src.main.java.org.openapitools.client.JSON;

/**
 * DbaasMigrationStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class DbaasMigrationStatus {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_MASTER_LAST_IO_SECONDS_AGO = "master-last-io-seconds-ago";
  @SerializedName(SERIALIZED_NAME_MASTER_LAST_IO_SECONDS_AGO)
  private Long masterLastIoSecondsAgo;

  public static final String SERIALIZED_NAME_MASTER_LINK_STATUS = "master-link-status";
  @SerializedName(SERIALIZED_NAME_MASTER_LINK_STATUS)
  private EnumMasterLinkStatus masterLinkStatus;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<DbaasMigrationStatusDetailsInner> details;

  public DbaasMigrationStatus() {
  }

  public DbaasMigrationStatus error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Error message in case that migration has failed
   * @return error
  **/
  @javax.annotation.Nullable
  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public DbaasMigrationStatus masterLastIoSecondsAgo(Long masterLastIoSecondsAgo) {
    
    this.masterLastIoSecondsAgo = masterLastIoSecondsAgo;
    return this;
  }

   /**
   * Redis only: how many seconds since last I/O with redis master
   * @return masterLastIoSecondsAgo
  **/
  @javax.annotation.Nullable
  public Long getMasterLastIoSecondsAgo() {
    return masterLastIoSecondsAgo;
  }


  public void setMasterLastIoSecondsAgo(Long masterLastIoSecondsAgo) {
    this.masterLastIoSecondsAgo = masterLastIoSecondsAgo;
  }


  public DbaasMigrationStatus masterLinkStatus(EnumMasterLinkStatus masterLinkStatus) {
    
    this.masterLinkStatus = masterLinkStatus;
    return this;
  }

   /**
   * Get masterLinkStatus
   * @return masterLinkStatus
  **/
  @javax.annotation.Nullable
  public EnumMasterLinkStatus getMasterLinkStatus() {
    return masterLinkStatus;
  }


  public void setMasterLinkStatus(EnumMasterLinkStatus masterLinkStatus) {
    this.masterLinkStatus = masterLinkStatus;
  }


  public DbaasMigrationStatus method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Migration method. Empty in case of multiple methods or error
   * @return method
  **/
  @javax.annotation.Nullable
  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public DbaasMigrationStatus status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Migration status
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public DbaasMigrationStatus details(List<DbaasMigrationStatusDetailsInner> details) {
    
    this.details = details;
    return this;
  }

  public DbaasMigrationStatus addDetailsItem(DbaasMigrationStatusDetailsInner detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Migration status per database
   * @return details
  **/
  @javax.annotation.Nullable
  public List<DbaasMigrationStatusDetailsInner> getDetails() {
    return details;
  }


  public void setDetails(List<DbaasMigrationStatusDetailsInner> details) {
    this.details = details;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasMigrationStatus dbaasMigrationStatus = (DbaasMigrationStatus) o;
    return Objects.equals(this.error, dbaasMigrationStatus.error) &&
        Objects.equals(this.masterLastIoSecondsAgo, dbaasMigrationStatus.masterLastIoSecondsAgo) &&
        Objects.equals(this.masterLinkStatus, dbaasMigrationStatus.masterLinkStatus) &&
        Objects.equals(this.method, dbaasMigrationStatus.method) &&
        Objects.equals(this.status, dbaasMigrationStatus.status) &&
        Objects.equals(this.details, dbaasMigrationStatus.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, masterLastIoSecondsAgo, masterLinkStatus, method, status, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasMigrationStatus {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    masterLastIoSecondsAgo: ").append(toIndentedString(masterLastIoSecondsAgo)).append("\n");
    sb.append("    masterLinkStatus: ").append(toIndentedString(masterLinkStatus)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("error");
    openapiFields.add("master-last-io-seconds-ago");
    openapiFields.add("master-link-status");
    openapiFields.add("method");
    openapiFields.add("status");
    openapiFields.add("details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DbaasMigrationStatus
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DbaasMigrationStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DbaasMigrationStatus is not found in the empty JSON string", DbaasMigrationStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DbaasMigrationStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DbaasMigrationStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      if ((jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
        JsonArray jsonArraydetails = jsonObj.getAsJsonArray("details");
        if (jsonArraydetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `details` to be an array in the JSON string but got `%s`", jsonObj.get("details").toString()));
          }

          // validate the optional field `details` (array)
          for (int i = 0; i < jsonArraydetails.size(); i++) {
            DbaasMigrationStatusDetailsInner.validateJsonElement(jsonArraydetails.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DbaasMigrationStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DbaasMigrationStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DbaasMigrationStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DbaasMigrationStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<DbaasMigrationStatus>() {
           @Override
           public void write(JsonWriter out, DbaasMigrationStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DbaasMigrationStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DbaasMigrationStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DbaasMigrationStatus
  * @throws IOException if the JSON string is invalid with respect to DbaasMigrationStatus
  */
  public static DbaasMigrationStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DbaasMigrationStatus.class);
  }

 /**
  * Convert an instance of DbaasMigrationStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
