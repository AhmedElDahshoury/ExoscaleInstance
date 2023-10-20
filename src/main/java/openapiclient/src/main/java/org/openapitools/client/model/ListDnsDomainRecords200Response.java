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
import org.openapitools.client.model.DnsDomainRecord;

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
 * ListDnsDomainRecords200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class ListDnsDomainRecords200Response {
  public static final String SERIALIZED_NAME_DNS_DOMAIN_RECORDS = "dns-domain-records";
  @SerializedName(SERIALIZED_NAME_DNS_DOMAIN_RECORDS)
  private List<DnsDomainRecord> dnsDomainRecords;

  public ListDnsDomainRecords200Response() {
  }

  public ListDnsDomainRecords200Response dnsDomainRecords(List<DnsDomainRecord> dnsDomainRecords) {
    
    this.dnsDomainRecords = dnsDomainRecords;
    return this;
  }

  public ListDnsDomainRecords200Response addDnsDomainRecordsItem(DnsDomainRecord dnsDomainRecordsItem) {
    if (this.dnsDomainRecords == null) {
      this.dnsDomainRecords = new ArrayList<>();
    }
    this.dnsDomainRecords.add(dnsDomainRecordsItem);
    return this;
  }

   /**
   * Get dnsDomainRecords
   * @return dnsDomainRecords
  **/
  @javax.annotation.Nullable
  public List<DnsDomainRecord> getDnsDomainRecords() {
    return dnsDomainRecords;
  }


  public void setDnsDomainRecords(List<DnsDomainRecord> dnsDomainRecords) {
    this.dnsDomainRecords = dnsDomainRecords;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDnsDomainRecords200Response listDnsDomainRecords200Response = (ListDnsDomainRecords200Response) o;
    return Objects.equals(this.dnsDomainRecords, listDnsDomainRecords200Response.dnsDomainRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsDomainRecords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDnsDomainRecords200Response {\n");
    sb.append("    dnsDomainRecords: ").append(toIndentedString(dnsDomainRecords)).append("\n");
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
    openapiFields.add("dns-domain-records");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ListDnsDomainRecords200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListDnsDomainRecords200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListDnsDomainRecords200Response is not found in the empty JSON string", ListDnsDomainRecords200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListDnsDomainRecords200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListDnsDomainRecords200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("dns-domain-records") != null && !jsonObj.get("dns-domain-records").isJsonNull()) {
        JsonArray jsonArraydnsDomainRecords = jsonObj.getAsJsonArray("dns-domain-records");
        if (jsonArraydnsDomainRecords != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dns-domain-records").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dns-domain-records` to be an array in the JSON string but got `%s`", jsonObj.get("dns-domain-records").toString()));
          }

          // validate the optional field `dns-domain-records` (array)
          for (int i = 0; i < jsonArraydnsDomainRecords.size(); i++) {
            DnsDomainRecord.validateJsonElement(jsonArraydnsDomainRecords.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListDnsDomainRecords200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListDnsDomainRecords200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListDnsDomainRecords200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListDnsDomainRecords200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ListDnsDomainRecords200Response>() {
           @Override
           public void write(JsonWriter out, ListDnsDomainRecords200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListDnsDomainRecords200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListDnsDomainRecords200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListDnsDomainRecords200Response
  * @throws IOException if the JSON string is invalid with respect to ListDnsDomainRecords200Response
  */
  public static ListDnsDomainRecords200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListDnsDomainRecords200Response.class);
  }

 /**
  * Convert an instance of ListDnsDomainRecords200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

