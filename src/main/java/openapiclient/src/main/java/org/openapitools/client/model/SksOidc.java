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
import java.util.HashMap;
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
 * SKS Cluster OpenID config map
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class SksOidc {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client-id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_ISSUER_URL = "issuer-url";
  @SerializedName(SERIALIZED_NAME_ISSUER_URL)
  private String issuerUrl;

  public static final String SERIALIZED_NAME_USERNAME_CLAIM = "username-claim";
  @SerializedName(SERIALIZED_NAME_USERNAME_CLAIM)
  private String usernameClaim;

  public static final String SERIALIZED_NAME_USERNAME_PREFIX = "username-prefix";
  @SerializedName(SERIALIZED_NAME_USERNAME_PREFIX)
  private String usernamePrefix;

  public static final String SERIALIZED_NAME_GROUPS_CLAIM = "groups-claim";
  @SerializedName(SERIALIZED_NAME_GROUPS_CLAIM)
  private String groupsClaim;

  public static final String SERIALIZED_NAME_GROUPS_PREFIX = "groups-prefix";
  @SerializedName(SERIALIZED_NAME_GROUPS_PREFIX)
  private String groupsPrefix;

  public static final String SERIALIZED_NAME_REQUIRED_CLAIM = "required-claim";
  @SerializedName(SERIALIZED_NAME_REQUIRED_CLAIM)
  private Map<String, String> requiredClaim = new HashMap<>();

  public SksOidc() {
  }

  public SksOidc clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * OpenID client ID
   * @return clientId
  **/
  @javax.annotation.Nonnull
  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public SksOidc issuerUrl(String issuerUrl) {
    
    this.issuerUrl = issuerUrl;
    return this;
  }

   /**
   * OpenID provider URL
   * @return issuerUrl
  **/
  @javax.annotation.Nonnull
  public String getIssuerUrl() {
    return issuerUrl;
  }


  public void setIssuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
  }


  public SksOidc usernameClaim(String usernameClaim) {
    
    this.usernameClaim = usernameClaim;
    return this;
  }

   /**
   * JWT claim to use as the user name
   * @return usernameClaim
  **/
  @javax.annotation.Nullable
  public String getUsernameClaim() {
    return usernameClaim;
  }


  public void setUsernameClaim(String usernameClaim) {
    this.usernameClaim = usernameClaim;
  }


  public SksOidc usernamePrefix(String usernamePrefix) {
    
    this.usernamePrefix = usernamePrefix;
    return this;
  }

   /**
   * Prefix prepended to username claims
   * @return usernamePrefix
  **/
  @javax.annotation.Nullable
  public String getUsernamePrefix() {
    return usernamePrefix;
  }


  public void setUsernamePrefix(String usernamePrefix) {
    this.usernamePrefix = usernamePrefix;
  }


  public SksOidc groupsClaim(String groupsClaim) {
    
    this.groupsClaim = groupsClaim;
    return this;
  }

   /**
   * JWT claim to use as the user&#39;s group
   * @return groupsClaim
  **/
  @javax.annotation.Nullable
  public String getGroupsClaim() {
    return groupsClaim;
  }


  public void setGroupsClaim(String groupsClaim) {
    this.groupsClaim = groupsClaim;
  }


  public SksOidc groupsPrefix(String groupsPrefix) {
    
    this.groupsPrefix = groupsPrefix;
    return this;
  }

   /**
   * Prefix prepended to group claims
   * @return groupsPrefix
  **/
  @javax.annotation.Nullable
  public String getGroupsPrefix() {
    return groupsPrefix;
  }


  public void setGroupsPrefix(String groupsPrefix) {
    this.groupsPrefix = groupsPrefix;
  }


  public SksOidc requiredClaim(Map<String, String> requiredClaim) {
    
    this.requiredClaim = requiredClaim;
    return this;
  }

  public SksOidc putRequiredClaimItem(String key, String requiredClaimItem) {
    if (this.requiredClaim == null) {
      this.requiredClaim = new HashMap<>();
    }
    this.requiredClaim.put(key, requiredClaimItem);
    return this;
  }

   /**
   * A key value map that describes a required claim in the ID Token
   * @return requiredClaim
  **/
  @javax.annotation.Nullable
  public Map<String, String> getRequiredClaim() {
    return requiredClaim;
  }


  public void setRequiredClaim(Map<String, String> requiredClaim) {
    this.requiredClaim = requiredClaim;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SksOidc sksOidc = (SksOidc) o;
    return Objects.equals(this.clientId, sksOidc.clientId) &&
        Objects.equals(this.issuerUrl, sksOidc.issuerUrl) &&
        Objects.equals(this.usernameClaim, sksOidc.usernameClaim) &&
        Objects.equals(this.usernamePrefix, sksOidc.usernamePrefix) &&
        Objects.equals(this.groupsClaim, sksOidc.groupsClaim) &&
        Objects.equals(this.groupsPrefix, sksOidc.groupsPrefix) &&
        Objects.equals(this.requiredClaim, sksOidc.requiredClaim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, issuerUrl, usernameClaim, usernamePrefix, groupsClaim, groupsPrefix, requiredClaim);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SksOidc {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    issuerUrl: ").append(toIndentedString(issuerUrl)).append("\n");
    sb.append("    usernameClaim: ").append(toIndentedString(usernameClaim)).append("\n");
    sb.append("    usernamePrefix: ").append(toIndentedString(usernamePrefix)).append("\n");
    sb.append("    groupsClaim: ").append(toIndentedString(groupsClaim)).append("\n");
    sb.append("    groupsPrefix: ").append(toIndentedString(groupsPrefix)).append("\n");
    sb.append("    requiredClaim: ").append(toIndentedString(requiredClaim)).append("\n");
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
    openapiFields.add("client-id");
    openapiFields.add("issuer-url");
    openapiFields.add("username-claim");
    openapiFields.add("username-prefix");
    openapiFields.add("groups-claim");
    openapiFields.add("groups-prefix");
    openapiFields.add("required-claim");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("client-id");
    openapiRequiredFields.add("issuer-url");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SksOidc
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SksOidc.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SksOidc is not found in the empty JSON string", SksOidc.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SksOidc.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SksOidc` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SksOidc.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("client-id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client-id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client-id").toString()));
      }
      if (!jsonObj.get("issuer-url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer-url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer-url").toString()));
      }
      if ((jsonObj.get("username-claim") != null && !jsonObj.get("username-claim").isJsonNull()) && !jsonObj.get("username-claim").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username-claim` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username-claim").toString()));
      }
      if ((jsonObj.get("username-prefix") != null && !jsonObj.get("username-prefix").isJsonNull()) && !jsonObj.get("username-prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username-prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username-prefix").toString()));
      }
      if ((jsonObj.get("groups-claim") != null && !jsonObj.get("groups-claim").isJsonNull()) && !jsonObj.get("groups-claim").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups-claim` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groups-claim").toString()));
      }
      if ((jsonObj.get("groups-prefix") != null && !jsonObj.get("groups-prefix").isJsonNull()) && !jsonObj.get("groups-prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups-prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groups-prefix").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SksOidc.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SksOidc' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SksOidc> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SksOidc.class));

       return (TypeAdapter<T>) new TypeAdapter<SksOidc>() {
           @Override
           public void write(JsonWriter out, SksOidc value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SksOidc read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SksOidc given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SksOidc
  * @throws IOException if the JSON string is invalid with respect to SksOidc
  */
  public static SksOidc fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SksOidc.class);
  }

 /**
  * Convert an instance of SksOidc to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
