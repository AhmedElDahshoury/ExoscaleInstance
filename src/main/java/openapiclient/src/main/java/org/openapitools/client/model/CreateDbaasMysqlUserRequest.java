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
import java.util.Arrays;
import openapiclient.src.main.java.org.openapitools.client.model.EnumMysqlAuthenticationPlugin;

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
 * CreateDbaasMysqlUserRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class CreateDbaasMysqlUserRequest {
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_AUTHENTICATION = "authentication";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION)
  private EnumMysqlAuthenticationPlugin authentication;

  public CreateDbaasMysqlUserRequest() {
  }

  public CreateDbaasMysqlUserRequest username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nonnull
  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public CreateDbaasMysqlUserRequest authentication(EnumMysqlAuthenticationPlugin authentication) {
    
    this.authentication = authentication;
    return this;
  }

   /**
   * Get authentication
   * @return authentication
  **/
  @javax.annotation.Nullable
  public EnumMysqlAuthenticationPlugin getAuthentication() {
    return authentication;
  }


  public void setAuthentication(EnumMysqlAuthenticationPlugin authentication) {
    this.authentication = authentication;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDbaasMysqlUserRequest createDbaasMysqlUserRequest = (CreateDbaasMysqlUserRequest) o;
    return Objects.equals(this.username, createDbaasMysqlUserRequest.username) &&
        Objects.equals(this.authentication, createDbaasMysqlUserRequest.authentication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, authentication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDbaasMysqlUserRequest {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
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
    openapiFields.add("username");
    openapiFields.add("authentication");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("username");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateDbaasMysqlUserRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateDbaasMysqlUserRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDbaasMysqlUserRequest is not found in the empty JSON string", CreateDbaasMysqlUserRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateDbaasMysqlUserRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDbaasMysqlUserRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateDbaasMysqlUserRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDbaasMysqlUserRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDbaasMysqlUserRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDbaasMysqlUserRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDbaasMysqlUserRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDbaasMysqlUserRequest>() {
           @Override
           public void write(JsonWriter out, CreateDbaasMysqlUserRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDbaasMysqlUserRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateDbaasMysqlUserRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateDbaasMysqlUserRequest
  * @throws IOException if the JSON string is invalid with respect to CreateDbaasMysqlUserRequest
  */
  public static CreateDbaasMysqlUserRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDbaasMysqlUserRequest.class);
  }

 /**
  * Convert an instance of CreateDbaasMysqlUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
