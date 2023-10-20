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
import org.openapitools.client.model.DbaasServiceCommon;

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
 * ListDbaasServices200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class ListDbaasServices200Response {
  public static final String SERIALIZED_NAME_DBAAS_SERVICES = "dbaas-services";
  @SerializedName(SERIALIZED_NAME_DBAAS_SERVICES)
  private List<DbaasServiceCommon> dbaasServices;

  public ListDbaasServices200Response() {
  }

  public ListDbaasServices200Response dbaasServices(List<DbaasServiceCommon> dbaasServices) {
    
    this.dbaasServices = dbaasServices;
    return this;
  }

  public ListDbaasServices200Response addDbaasServicesItem(DbaasServiceCommon dbaasServicesItem) {
    if (this.dbaasServices == null) {
      this.dbaasServices = new ArrayList<>();
    }
    this.dbaasServices.add(dbaasServicesItem);
    return this;
  }

   /**
   * Get dbaasServices
   * @return dbaasServices
  **/
  @javax.annotation.Nullable
  public List<DbaasServiceCommon> getDbaasServices() {
    return dbaasServices;
  }


  public void setDbaasServices(List<DbaasServiceCommon> dbaasServices) {
    this.dbaasServices = dbaasServices;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDbaasServices200Response listDbaasServices200Response = (ListDbaasServices200Response) o;
    return Objects.equals(this.dbaasServices, listDbaasServices200Response.dbaasServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbaasServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDbaasServices200Response {\n");
    sb.append("    dbaasServices: ").append(toIndentedString(dbaasServices)).append("\n");
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
    openapiFields.add("dbaas-services");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListDbaasServices200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListDbaasServices200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListDbaasServices200Response is not found in the empty JSON string", ListDbaasServices200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListDbaasServices200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListDbaasServices200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("dbaas-services") != null && !jsonObj.get("dbaas-services").isJsonNull()) {
        JsonArray jsonArraydbaasServices = jsonObj.getAsJsonArray("dbaas-services");
        if (jsonArraydbaasServices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dbaas-services").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dbaas-services` to be an array in the JSON string but got `%s`", jsonObj.get("dbaas-services").toString()));
          }

          // validate the optional field `dbaas-services` (array)
          for (int i = 0; i < jsonArraydbaasServices.size(); i++) {
            DbaasServiceCommon.validateJsonElement(jsonArraydbaasServices.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListDbaasServices200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListDbaasServices200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListDbaasServices200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListDbaasServices200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ListDbaasServices200Response>() {
           @Override
           public void write(JsonWriter out, ListDbaasServices200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListDbaasServices200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListDbaasServices200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListDbaasServices200Response
  * @throws IOException if the JSON string is invalid with respect to ListDbaasServices200Response
  */
  public static ListDbaasServices200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListDbaasServices200Response.class);
  }

 /**
  * Convert an instance of ListDbaasServices200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

