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
import org.openapitools.client.model.AccessKey;

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
 * ListAccessKeys200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class ListAccessKeys200Response {
  public static final String SERIALIZED_NAME_ACCESS_KEYS = "access-keys";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEYS)
  private List<AccessKey> accessKeys;

  public ListAccessKeys200Response() {
  }

  public ListAccessKeys200Response accessKeys(List<AccessKey> accessKeys) {
    
    this.accessKeys = accessKeys;
    return this;
  }

  public ListAccessKeys200Response addAccessKeysItem(AccessKey accessKeysItem) {
    if (this.accessKeys == null) {
      this.accessKeys = new ArrayList<>();
    }
    this.accessKeys.add(accessKeysItem);
    return this;
  }

   /**
   * Get accessKeys
   * @return accessKeys
  **/
  @javax.annotation.Nullable
  public List<AccessKey> getAccessKeys() {
    return accessKeys;
  }


  public void setAccessKeys(List<AccessKey> accessKeys) {
    this.accessKeys = accessKeys;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAccessKeys200Response listAccessKeys200Response = (ListAccessKeys200Response) o;
    return Objects.equals(this.accessKeys, listAccessKeys200Response.accessKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAccessKeys200Response {\n");
    sb.append("    accessKeys: ").append(toIndentedString(accessKeys)).append("\n");
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
    openapiFields.add("access-keys");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListAccessKeys200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListAccessKeys200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAccessKeys200Response is not found in the empty JSON string", ListAccessKeys200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListAccessKeys200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAccessKeys200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("access-keys") != null && !jsonObj.get("access-keys").isJsonNull()) {
        JsonArray jsonArrayaccessKeys = jsonObj.getAsJsonArray("access-keys");
        if (jsonArrayaccessKeys != null) {
          // ensure the json data is an array
          if (!jsonObj.get("access-keys").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `access-keys` to be an array in the JSON string but got `%s`", jsonObj.get("access-keys").toString()));
          }

          // validate the optional field `access-keys` (array)
          for (int i = 0; i < jsonArrayaccessKeys.size(); i++) {
            AccessKey.validateJsonElement(jsonArrayaccessKeys.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAccessKeys200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAccessKeys200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAccessKeys200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAccessKeys200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAccessKeys200Response>() {
           @Override
           public void write(JsonWriter out, ListAccessKeys200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAccessKeys200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAccessKeys200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAccessKeys200Response
  * @throws IOException if the JSON string is invalid with respect to ListAccessKeys200Response
  */
  public static ListAccessKeys200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAccessKeys200Response.class);
  }

 /**
  * Convert an instance of ListAccessKeys200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
