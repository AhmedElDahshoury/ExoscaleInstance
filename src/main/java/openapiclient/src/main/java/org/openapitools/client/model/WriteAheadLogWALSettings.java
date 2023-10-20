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
import org.openapitools.client.model.AnyOf;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * WriteAheadLogWALSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class WriteAheadLogWALSettings {
  public static final String SERIALIZED_NAME_WAL_WRITER_DELAY = "wal_writer_delay";
  @SerializedName(SERIALIZED_NAME_WAL_WRITER_DELAY)
  private Integer walWriterDelay;

  public static final String SERIALIZED_NAME_WAL_SENDER_TIMEOUT = "wal_sender_timeout";
  @SerializedName(SERIALIZED_NAME_WAL_SENDER_TIMEOUT)
  private AnyOf walSenderTimeout;

  public static final String SERIALIZED_NAME_MAX_WAL_SENDERS = "max_wal_senders";
  @SerializedName(SERIALIZED_NAME_MAX_WAL_SENDERS)
  private Integer maxWalSenders;

  public static final String SERIALIZED_NAME_MAX_SLOT_WAL_KEEP_SIZE = "max_slot_wal_keep_size";
  @SerializedName(SERIALIZED_NAME_MAX_SLOT_WAL_KEEP_SIZE)
  private Integer maxSlotWalKeepSize;

  public WriteAheadLogWALSettings() {
  }

  public WriteAheadLogWALSettings walWriterDelay(Integer walWriterDelay) {
    
    this.walWriterDelay = walWriterDelay;
    return this;
  }

   /**
   * WAL flush interval in milliseconds. Note that setting this value to lower than the default 200ms may negatively impact performance
   * minimum: 10
   * maximum: 200
   * @return walWriterDelay
  **/
  @javax.annotation.Nullable
  public Integer getWalWriterDelay() {
    return walWriterDelay;
  }


  public void setWalWriterDelay(Integer walWriterDelay) {
    this.walWriterDelay = walWriterDelay;
  }


  public WriteAheadLogWALSettings walSenderTimeout(AnyOf walSenderTimeout) {
    
    this.walSenderTimeout = walSenderTimeout;
    return this;
  }

   /**
   * Terminate replication connections that are inactive for longer than this amount of time, in milliseconds. Setting this value to zero disables the timeout.
   * @return walSenderTimeout
  **/
  @javax.annotation.Nullable
  public AnyOf getWalSenderTimeout() {
    return walSenderTimeout;
  }


  public void setWalSenderTimeout(AnyOf walSenderTimeout) {
    this.walSenderTimeout = walSenderTimeout;
  }


  public WriteAheadLogWALSettings maxWalSenders(Integer maxWalSenders) {
    
    this.maxWalSenders = maxWalSenders;
    return this;
  }

   /**
   * PostgreSQL maximum WAL senders
   * minimum: 20
   * maximum: 64
   * @return maxWalSenders
  **/
  @javax.annotation.Nullable
  public Integer getMaxWalSenders() {
    return maxWalSenders;
  }


  public void setMaxWalSenders(Integer maxWalSenders) {
    this.maxWalSenders = maxWalSenders;
  }


  public WriteAheadLogWALSettings maxSlotWalKeepSize(Integer maxSlotWalKeepSize) {
    
    this.maxSlotWalKeepSize = maxSlotWalKeepSize;
    return this;
  }

   /**
   * PostgreSQL maximum WAL size (MB) reserved for replication slots. Default is -1 (unlimited). wal_keep_size minimum WAL size setting takes precedence over this.
   * minimum: -1
   * maximum: 2147483647
   * @return maxSlotWalKeepSize
  **/
  @javax.annotation.Nullable
  public Integer getMaxSlotWalKeepSize() {
    return maxSlotWalKeepSize;
  }


  public void setMaxSlotWalKeepSize(Integer maxSlotWalKeepSize) {
    this.maxSlotWalKeepSize = maxSlotWalKeepSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WriteAheadLogWALSettings writeAheadLogWALSettings = (WriteAheadLogWALSettings) o;
    return Objects.equals(this.walWriterDelay, writeAheadLogWALSettings.walWriterDelay) &&
        Objects.equals(this.walSenderTimeout, writeAheadLogWALSettings.walSenderTimeout) &&
        Objects.equals(this.maxWalSenders, writeAheadLogWALSettings.maxWalSenders) &&
        Objects.equals(this.maxSlotWalKeepSize, writeAheadLogWALSettings.maxSlotWalKeepSize);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(walWriterDelay, walSenderTimeout, maxWalSenders, maxSlotWalKeepSize);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WriteAheadLogWALSettings {\n");
    sb.append("    walWriterDelay: ").append(toIndentedString(walWriterDelay)).append("\n");
    sb.append("    walSenderTimeout: ").append(toIndentedString(walSenderTimeout)).append("\n");
    sb.append("    maxWalSenders: ").append(toIndentedString(maxWalSenders)).append("\n");
    sb.append("    maxSlotWalKeepSize: ").append(toIndentedString(maxSlotWalKeepSize)).append("\n");
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
    openapiFields.add("wal_writer_delay");
    openapiFields.add("wal_sender_timeout");
    openapiFields.add("max_wal_senders");
    openapiFields.add("max_slot_wal_keep_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WriteAheadLogWALSettings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WriteAheadLogWALSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WriteAheadLogWALSettings is not found in the empty JSON string", WriteAheadLogWALSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!WriteAheadLogWALSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WriteAheadLogWALSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `wal_sender_timeout`
      if (jsonObj.get("wal_sender_timeout") != null && !jsonObj.get("wal_sender_timeout").isJsonNull()) {
        AnyOf.validateJsonElement(jsonObj.get("wal_sender_timeout"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WriteAheadLogWALSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WriteAheadLogWALSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WriteAheadLogWALSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WriteAheadLogWALSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<WriteAheadLogWALSettings>() {
           @Override
           public void write(JsonWriter out, WriteAheadLogWALSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WriteAheadLogWALSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WriteAheadLogWALSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WriteAheadLogWALSettings
  * @throws IOException if the JSON string is invalid with respect to WriteAheadLogWALSettings
  */
  public static WriteAheadLogWALSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WriteAheadLogWALSettings.class);
  }

 /**
  * Convert an instance of WriteAheadLogWALSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

