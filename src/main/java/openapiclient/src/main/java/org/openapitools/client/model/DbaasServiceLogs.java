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
import openapiclient.src.main.java.org.openapitools.client.model.DbaasServiceLogsLogsInner;

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
 * DbaasServiceLogs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class DbaasServiceLogs {
  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private String offset;

  public static final String SERIALIZED_NAME_FIRST_LOG_OFFSET = "first-log-offset";
  @SerializedName(SERIALIZED_NAME_FIRST_LOG_OFFSET)
  private String firstLogOffset;

  public static final String SERIALIZED_NAME_LOGS = "logs";
  @SerializedName(SERIALIZED_NAME_LOGS)
  private List<DbaasServiceLogsLogsInner> logs;

  public DbaasServiceLogs() {
  }

  public DbaasServiceLogs offset(String offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @javax.annotation.Nullable
  public String getOffset() {
    return offset;
  }


  public void setOffset(String offset) {
    this.offset = offset;
  }


  public DbaasServiceLogs firstLogOffset(String firstLogOffset) {
    
    this.firstLogOffset = firstLogOffset;
    return this;
  }

   /**
   * Get firstLogOffset
   * @return firstLogOffset
  **/
  @javax.annotation.Nullable
  public String getFirstLogOffset() {
    return firstLogOffset;
  }


  public void setFirstLogOffset(String firstLogOffset) {
    this.firstLogOffset = firstLogOffset;
  }


  public DbaasServiceLogs logs(List<DbaasServiceLogsLogsInner> logs) {
    
    this.logs = logs;
    return this;
  }

  public DbaasServiceLogs addLogsItem(DbaasServiceLogsLogsInner logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<>();
    }
    this.logs.add(logsItem);
    return this;
  }

   /**
   * Get logs
   * @return logs
  **/
  @javax.annotation.Nullable
  public List<DbaasServiceLogsLogsInner> getLogs() {
    return logs;
  }


  public void setLogs(List<DbaasServiceLogsLogsInner> logs) {
    this.logs = logs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceLogs dbaasServiceLogs = (DbaasServiceLogs) o;
    return Objects.equals(this.offset, dbaasServiceLogs.offset) &&
        Objects.equals(this.firstLogOffset, dbaasServiceLogs.firstLogOffset) &&
        Objects.equals(this.logs, dbaasServiceLogs.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, firstLogOffset, logs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceLogs {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    firstLogOffset: ").append(toIndentedString(firstLogOffset)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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
    openapiFields.add("offset");
    openapiFields.add("first-log-offset");
    openapiFields.add("logs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DbaasServiceLogs
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DbaasServiceLogs.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DbaasServiceLogs is not found in the empty JSON string", DbaasServiceLogs.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DbaasServiceLogs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DbaasServiceLogs` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("offset") != null && !jsonObj.get("offset").isJsonNull()) && !jsonObj.get("offset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offset").toString()));
      }
      if ((jsonObj.get("first-log-offset") != null && !jsonObj.get("first-log-offset").isJsonNull()) && !jsonObj.get("first-log-offset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first-log-offset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first-log-offset").toString()));
      }
      if (jsonObj.get("logs") != null && !jsonObj.get("logs").isJsonNull()) {
        JsonArray jsonArraylogs = jsonObj.getAsJsonArray("logs");
        if (jsonArraylogs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("logs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `logs` to be an array in the JSON string but got `%s`", jsonObj.get("logs").toString()));
          }

          // validate the optional field `logs` (array)
          for (int i = 0; i < jsonArraylogs.size(); i++) {
            DbaasServiceLogsLogsInner.validateJsonElement(jsonArraylogs.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DbaasServiceLogs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DbaasServiceLogs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DbaasServiceLogs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DbaasServiceLogs.class));

       return (TypeAdapter<T>) new TypeAdapter<DbaasServiceLogs>() {
           @Override
           public void write(JsonWriter out, DbaasServiceLogs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DbaasServiceLogs read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DbaasServiceLogs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DbaasServiceLogs
  * @throws IOException if the JSON string is invalid with respect to DbaasServiceLogs
  */
  public static DbaasServiceLogs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DbaasServiceLogs.class);
  }

 /**
  * Convert an instance of DbaasServiceLogs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

