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
import openapiclient.src.main.java.org.openapitools.client.model.GetDbaasSettingsGrafana200ResponseSettingsGrafana;

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
 * GetDbaasSettingsGrafana200ResponseSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class GetDbaasSettingsGrafana200ResponseSettings {
  public static final String SERIALIZED_NAME_GRAFANA = "grafana";
  @SerializedName(SERIALIZED_NAME_GRAFANA)
  private GetDbaasSettingsGrafana200ResponseSettingsGrafana grafana;

  public GetDbaasSettingsGrafana200ResponseSettings() {
  }

  public GetDbaasSettingsGrafana200ResponseSettings grafana(GetDbaasSettingsGrafana200ResponseSettingsGrafana grafana) {
    
    this.grafana = grafana;
    return this;
  }

   /**
   * Get grafana
   * @return grafana
  **/
  @javax.annotation.Nullable
  public GetDbaasSettingsGrafana200ResponseSettingsGrafana getGrafana() {
    return grafana;
  }


  public void setGrafana(GetDbaasSettingsGrafana200ResponseSettingsGrafana grafana) {
    this.grafana = grafana;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDbaasSettingsGrafana200ResponseSettings getDbaasSettingsGrafana200ResponseSettings = (GetDbaasSettingsGrafana200ResponseSettings) o;
    return Objects.equals(this.grafana, getDbaasSettingsGrafana200ResponseSettings.grafana);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grafana);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDbaasSettingsGrafana200ResponseSettings {\n");
    sb.append("    grafana: ").append(toIndentedString(grafana)).append("\n");
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
    openapiFields.add("grafana");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetDbaasSettingsGrafana200ResponseSettings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetDbaasSettingsGrafana200ResponseSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDbaasSettingsGrafana200ResponseSettings is not found in the empty JSON string", GetDbaasSettingsGrafana200ResponseSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetDbaasSettingsGrafana200ResponseSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDbaasSettingsGrafana200ResponseSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `grafana`
      if (jsonObj.get("grafana") != null && !jsonObj.get("grafana").isJsonNull()) {
        GetDbaasSettingsGrafana200ResponseSettingsGrafana.validateJsonElement(jsonObj.get("grafana"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetDbaasSettingsGrafana200ResponseSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDbaasSettingsGrafana200ResponseSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDbaasSettingsGrafana200ResponseSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDbaasSettingsGrafana200ResponseSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDbaasSettingsGrafana200ResponseSettings>() {
           @Override
           public void write(JsonWriter out, GetDbaasSettingsGrafana200ResponseSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDbaasSettingsGrafana200ResponseSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetDbaasSettingsGrafana200ResponseSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetDbaasSettingsGrafana200ResponseSettings
  * @throws IOException if the JSON string is invalid with respect to GetDbaasSettingsGrafana200ResponseSettings
  */
  public static GetDbaasSettingsGrafana200ResponseSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDbaasSettingsGrafana200ResponseSettings.class);
  }

 /**
  * Convert an instance of GetDbaasSettingsGrafana200ResponseSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
