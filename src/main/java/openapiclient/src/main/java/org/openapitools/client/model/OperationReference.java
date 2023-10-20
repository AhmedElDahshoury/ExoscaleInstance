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
import java.util.UUID;

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
 * Related resource reference
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class OperationReference {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private String command;

  public OperationReference() {
  }

  
  public OperationReference(
     String link
  ) {
    this();
    this.link = link;
  }

  public OperationReference id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Reference ID
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


   /**
   * Link to the referenced resource
   * @return link
  **/
  @javax.annotation.Nullable
  public String getLink() {
    return link;
  }




  public OperationReference command(String command) {
    
    this.command = command;
    return this;
  }

   /**
   * Command name
   * @return command
  **/
  @javax.annotation.Nullable
  public String getCommand() {
    return command;
  }


  public void setCommand(String command) {
    this.command = command;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationReference operationReference = (OperationReference) o;
    return Objects.equals(this.id, operationReference.id) &&
        Objects.equals(this.link, operationReference.link) &&
        Objects.equals(this.command, operationReference.command);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, command);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationReference {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("link");
    openapiFields.add("command");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OperationReference
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OperationReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OperationReference is not found in the empty JSON string", OperationReference.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OperationReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OperationReference` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if ((jsonObj.get("command") != null && !jsonObj.get("command").isJsonNull()) && !jsonObj.get("command").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `command` to be a primitive type in the JSON string but got `%s`", jsonObj.get("command").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OperationReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OperationReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OperationReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OperationReference.class));

       return (TypeAdapter<T>) new TypeAdapter<OperationReference>() {
           @Override
           public void write(JsonWriter out, OperationReference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OperationReference read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OperationReference given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OperationReference
  * @throws IOException if the JSON string is invalid with respect to OperationReference
  */
  public static OperationReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OperationReference.class);
  }

 /**
  * Convert an instance of OperationReference to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
