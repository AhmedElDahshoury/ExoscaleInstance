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
 * PromoteSnapshotToTemplateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class PromoteSnapshotToTemplateRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DEFAULT_USER = "default-user";
  @SerializedName(SERIALIZED_NAME_DEFAULT_USER)
  private String defaultUser;

  public static final String SERIALIZED_NAME_SSH_KEY_ENABLED = "ssh-key-enabled";
  @SerializedName(SERIALIZED_NAME_SSH_KEY_ENABLED)
  private Boolean sshKeyEnabled;

  public static final String SERIALIZED_NAME_PASSWORD_ENABLED = "password-enabled";
  @SerializedName(SERIALIZED_NAME_PASSWORD_ENABLED)
  private Boolean passwordEnabled;

  public PromoteSnapshotToTemplateRequest() {
  }

  public PromoteSnapshotToTemplateRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Template name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PromoteSnapshotToTemplateRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Template description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PromoteSnapshotToTemplateRequest defaultUser(String defaultUser) {
    
    this.defaultUser = defaultUser;
    return this;
  }

   /**
   * Template default user
   * @return defaultUser
  **/
  @javax.annotation.Nullable
  public String getDefaultUser() {
    return defaultUser;
  }


  public void setDefaultUser(String defaultUser) {
    this.defaultUser = defaultUser;
  }


  public PromoteSnapshotToTemplateRequest sshKeyEnabled(Boolean sshKeyEnabled) {
    
    this.sshKeyEnabled = sshKeyEnabled;
    return this;
  }

   /**
   * Enable SSH key-based login in the template
   * @return sshKeyEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getSshKeyEnabled() {
    return sshKeyEnabled;
  }


  public void setSshKeyEnabled(Boolean sshKeyEnabled) {
    this.sshKeyEnabled = sshKeyEnabled;
  }


  public PromoteSnapshotToTemplateRequest passwordEnabled(Boolean passwordEnabled) {
    
    this.passwordEnabled = passwordEnabled;
    return this;
  }

   /**
   * Enable password-based login in the template
   * @return passwordEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getPasswordEnabled() {
    return passwordEnabled;
  }


  public void setPasswordEnabled(Boolean passwordEnabled) {
    this.passwordEnabled = passwordEnabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromoteSnapshotToTemplateRequest promoteSnapshotToTemplateRequest = (PromoteSnapshotToTemplateRequest) o;
    return Objects.equals(this.name, promoteSnapshotToTemplateRequest.name) &&
        Objects.equals(this.description, promoteSnapshotToTemplateRequest.description) &&
        Objects.equals(this.defaultUser, promoteSnapshotToTemplateRequest.defaultUser) &&
        Objects.equals(this.sshKeyEnabled, promoteSnapshotToTemplateRequest.sshKeyEnabled) &&
        Objects.equals(this.passwordEnabled, promoteSnapshotToTemplateRequest.passwordEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, defaultUser, sshKeyEnabled, passwordEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromoteSnapshotToTemplateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultUser: ").append(toIndentedString(defaultUser)).append("\n");
    sb.append("    sshKeyEnabled: ").append(toIndentedString(sshKeyEnabled)).append("\n");
    sb.append("    passwordEnabled: ").append(toIndentedString(passwordEnabled)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("default-user");
    openapiFields.add("ssh-key-enabled");
    openapiFields.add("password-enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PromoteSnapshotToTemplateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PromoteSnapshotToTemplateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PromoteSnapshotToTemplateRequest is not found in the empty JSON string", PromoteSnapshotToTemplateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PromoteSnapshotToTemplateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PromoteSnapshotToTemplateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PromoteSnapshotToTemplateRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("default-user") != null && !jsonObj.get("default-user").isJsonNull()) && !jsonObj.get("default-user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default-user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default-user").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromoteSnapshotToTemplateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromoteSnapshotToTemplateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromoteSnapshotToTemplateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromoteSnapshotToTemplateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PromoteSnapshotToTemplateRequest>() {
           @Override
           public void write(JsonWriter out, PromoteSnapshotToTemplateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromoteSnapshotToTemplateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromoteSnapshotToTemplateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromoteSnapshotToTemplateRequest
  * @throws IOException if the JSON string is invalid with respect to PromoteSnapshotToTemplateRequest
  */
  public static PromoteSnapshotToTemplateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromoteSnapshotToTemplateRequest.class);
  }

 /**
  * Convert an instance of PromoteSnapshotToTemplateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
