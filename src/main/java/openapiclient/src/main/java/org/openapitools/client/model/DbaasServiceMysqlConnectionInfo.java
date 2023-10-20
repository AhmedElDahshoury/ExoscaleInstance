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
import java.util.Map;

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
 * MySQL connection information properties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class DbaasServiceMysqlConnectionInfo {
  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private List<String> uri;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private List<Map<String, String>> params;

  public static final String SERIALIZED_NAME_STANDBY = "standby";
  @SerializedName(SERIALIZED_NAME_STANDBY)
  private List<String> standby;

  public DbaasServiceMysqlConnectionInfo() {
  }

  public DbaasServiceMysqlConnectionInfo uri(List<String> uri) {
    
    this.uri = uri;
    return this;
  }

  public DbaasServiceMysqlConnectionInfo addUriItem(String uriItem) {
    if (this.uri == null) {
      this.uri = new ArrayList<>();
    }
    this.uri.add(uriItem);
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @javax.annotation.Nullable
  public List<String> getUri() {
    return uri;
  }


  public void setUri(List<String> uri) {
    this.uri = uri;
  }


  public DbaasServiceMysqlConnectionInfo params(List<Map<String, String>> params) {
    
    this.params = params;
    return this;
  }

  public DbaasServiceMysqlConnectionInfo addParamsItem(Map<String, String> paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<>();
    }
    this.params.add(paramsItem);
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @javax.annotation.Nullable
  public List<Map<String, String>> getParams() {
    return params;
  }


  public void setParams(List<Map<String, String>> params) {
    this.params = params;
  }


  public DbaasServiceMysqlConnectionInfo standby(List<String> standby) {
    
    this.standby = standby;
    return this;
  }

  public DbaasServiceMysqlConnectionInfo addStandbyItem(String standbyItem) {
    if (this.standby == null) {
      this.standby = new ArrayList<>();
    }
    this.standby.add(standbyItem);
    return this;
  }

   /**
   * Get standby
   * @return standby
  **/
  @javax.annotation.Nullable
  public List<String> getStandby() {
    return standby;
  }


  public void setStandby(List<String> standby) {
    this.standby = standby;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceMysqlConnectionInfo dbaasServiceMysqlConnectionInfo = (DbaasServiceMysqlConnectionInfo) o;
    return Objects.equals(this.uri, dbaasServiceMysqlConnectionInfo.uri) &&
        Objects.equals(this.params, dbaasServiceMysqlConnectionInfo.params) &&
        Objects.equals(this.standby, dbaasServiceMysqlConnectionInfo.standby);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, params, standby);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceMysqlConnectionInfo {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    standby: ").append(toIndentedString(standby)).append("\n");
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
    openapiFields.add("uri");
    openapiFields.add("params");
    openapiFields.add("standby");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DbaasServiceMysqlConnectionInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DbaasServiceMysqlConnectionInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DbaasServiceMysqlConnectionInfo is not found in the empty JSON string", DbaasServiceMysqlConnectionInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DbaasServiceMysqlConnectionInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DbaasServiceMysqlConnectionInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull() && !jsonObj.get("uri").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be an array in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("params") != null && !jsonObj.get("params").isJsonNull() && !jsonObj.get("params").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `params` to be an array in the JSON string but got `%s`", jsonObj.get("params").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("standby") != null && !jsonObj.get("standby").isJsonNull() && !jsonObj.get("standby").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `standby` to be an array in the JSON string but got `%s`", jsonObj.get("standby").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DbaasServiceMysqlConnectionInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DbaasServiceMysqlConnectionInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DbaasServiceMysqlConnectionInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DbaasServiceMysqlConnectionInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DbaasServiceMysqlConnectionInfo>() {
           @Override
           public void write(JsonWriter out, DbaasServiceMysqlConnectionInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DbaasServiceMysqlConnectionInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DbaasServiceMysqlConnectionInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DbaasServiceMysqlConnectionInfo
  * @throws IOException if the JSON string is invalid with respect to DbaasServiceMysqlConnectionInfo
  */
  public static DbaasServiceMysqlConnectionInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DbaasServiceMysqlConnectionInfo.class);
  }

 /**
  * Convert an instance of DbaasServiceMysqlConnectionInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
