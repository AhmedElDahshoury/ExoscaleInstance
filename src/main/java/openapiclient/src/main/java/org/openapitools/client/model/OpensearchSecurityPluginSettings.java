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
import org.openapitools.client.model.IPAddressRateLimitingSettings;
import openapiclient.src.main.java.org.openapitools.client.model.InternalAuthenticationBackendLimiting;

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
 * OpensearchSecurityPluginSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class OpensearchSecurityPluginSettings {
  public static final String SERIALIZED_NAME_IP_RATE_LIMITING = "ip_rate_limiting";
  @SerializedName(SERIALIZED_NAME_IP_RATE_LIMITING)
  private IPAddressRateLimitingSettings ipRateLimiting;

  public static final String SERIALIZED_NAME_INTERNAL_AUTHENTICATION_BACKEND_LIMITING = "internal_authentication_backend_limiting";
  @SerializedName(SERIALIZED_NAME_INTERNAL_AUTHENTICATION_BACKEND_LIMITING)
  private InternalAuthenticationBackendLimiting internalAuthenticationBackendLimiting;

  public OpensearchSecurityPluginSettings() {
  }

  public OpensearchSecurityPluginSettings ipRateLimiting(IPAddressRateLimitingSettings ipRateLimiting) {
    
    this.ipRateLimiting = ipRateLimiting;
    return this;
  }

   /**
   * Get ipRateLimiting
   * @return ipRateLimiting
  **/
  @javax.annotation.Nullable
  public IPAddressRateLimitingSettings getIpRateLimiting() {
    return ipRateLimiting;
  }


  public void setIpRateLimiting(IPAddressRateLimitingSettings ipRateLimiting) {
    this.ipRateLimiting = ipRateLimiting;
  }


  public OpensearchSecurityPluginSettings internalAuthenticationBackendLimiting(InternalAuthenticationBackendLimiting internalAuthenticationBackendLimiting) {
    
    this.internalAuthenticationBackendLimiting = internalAuthenticationBackendLimiting;
    return this;
  }

   /**
   * Get internalAuthenticationBackendLimiting
   * @return internalAuthenticationBackendLimiting
  **/
  @javax.annotation.Nullable
  public InternalAuthenticationBackendLimiting getInternalAuthenticationBackendLimiting() {
    return internalAuthenticationBackendLimiting;
  }


  public void setInternalAuthenticationBackendLimiting(InternalAuthenticationBackendLimiting internalAuthenticationBackendLimiting) {
    this.internalAuthenticationBackendLimiting = internalAuthenticationBackendLimiting;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpensearchSecurityPluginSettings opensearchSecurityPluginSettings = (OpensearchSecurityPluginSettings) o;
    return Objects.equals(this.ipRateLimiting, opensearchSecurityPluginSettings.ipRateLimiting) &&
        Objects.equals(this.internalAuthenticationBackendLimiting, opensearchSecurityPluginSettings.internalAuthenticationBackendLimiting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipRateLimiting, internalAuthenticationBackendLimiting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpensearchSecurityPluginSettings {\n");
    sb.append("    ipRateLimiting: ").append(toIndentedString(ipRateLimiting)).append("\n");
    sb.append("    internalAuthenticationBackendLimiting: ").append(toIndentedString(internalAuthenticationBackendLimiting)).append("\n");
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
    openapiFields.add("ip_rate_limiting");
    openapiFields.add("internal_authentication_backend_limiting");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OpensearchSecurityPluginSettings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OpensearchSecurityPluginSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OpensearchSecurityPluginSettings is not found in the empty JSON string", OpensearchSecurityPluginSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OpensearchSecurityPluginSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OpensearchSecurityPluginSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ip_rate_limiting`
      if (jsonObj.get("ip_rate_limiting") != null && !jsonObj.get("ip_rate_limiting").isJsonNull()) {
        IPAddressRateLimitingSettings.validateJsonElement(jsonObj.get("ip_rate_limiting"));
      }
      // validate the optional field `internal_authentication_backend_limiting`
      if (jsonObj.get("internal_authentication_backend_limiting") != null && !jsonObj.get("internal_authentication_backend_limiting").isJsonNull()) {
        InternalAuthenticationBackendLimiting.validateJsonElement(jsonObj.get("internal_authentication_backend_limiting"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OpensearchSecurityPluginSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OpensearchSecurityPluginSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OpensearchSecurityPluginSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OpensearchSecurityPluginSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<OpensearchSecurityPluginSettings>() {
           @Override
           public void write(JsonWriter out, OpensearchSecurityPluginSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OpensearchSecurityPluginSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OpensearchSecurityPluginSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OpensearchSecurityPluginSettings
  * @throws IOException if the JSON string is invalid with respect to OpensearchSecurityPluginSettings
  */
  public static OpensearchSecurityPluginSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OpensearchSecurityPluginSettings.class);
  }

 /**
  * Convert an instance of OpensearchSecurityPluginSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
