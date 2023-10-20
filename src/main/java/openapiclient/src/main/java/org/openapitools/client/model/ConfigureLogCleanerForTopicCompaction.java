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
import java.math.BigDecimal;
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
 * ConfigureLogCleanerForTopicCompaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class ConfigureLogCleanerForTopicCompaction {
  public static final String SERIALIZED_NAME_LOG_CLEANER_DELETE_RETENTION_MS = "log_cleaner_delete_retention_ms";
  @SerializedName(SERIALIZED_NAME_LOG_CLEANER_DELETE_RETENTION_MS)
  private Integer logCleanerDeleteRetentionMs;

  public static final String SERIALIZED_NAME_LOG_CLEANER_MAX_COMPACTION_LAG_MS = "log_cleaner_max_compaction_lag_ms";
  @SerializedName(SERIALIZED_NAME_LOG_CLEANER_MAX_COMPACTION_LAG_MS)
  private Integer logCleanerMaxCompactionLagMs;

  public static final String SERIALIZED_NAME_LOG_CLEANER_MIN_CLEANABLE_RATIO = "log_cleaner_min_cleanable_ratio";
  @SerializedName(SERIALIZED_NAME_LOG_CLEANER_MIN_CLEANABLE_RATIO)
  private BigDecimal logCleanerMinCleanableRatio;

  public static final String SERIALIZED_NAME_LOG_CLEANER_MIN_COMPACTION_LAG_MS = "log_cleaner_min_compaction_lag_ms";
  @SerializedName(SERIALIZED_NAME_LOG_CLEANER_MIN_COMPACTION_LAG_MS)
  private Integer logCleanerMinCompactionLagMs;

  /**
   * The default cleanup policy for segments beyond the retention window
   */
  @JsonAdapter(LogCleanupPolicyEnum.Adapter.class)
  public enum LogCleanupPolicyEnum {
    DELETE("delete"),
    
    COMPACT("compact"),
    
    COMPACT_DELETE("compact,delete");

    private String value;

    LogCleanupPolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LogCleanupPolicyEnum fromValue(String value) {
      for (LogCleanupPolicyEnum b : LogCleanupPolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LogCleanupPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LogCleanupPolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LogCleanupPolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LogCleanupPolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LOG_CLEANUP_POLICY = "log_cleanup_policy";
  @SerializedName(SERIALIZED_NAME_LOG_CLEANUP_POLICY)
  private LogCleanupPolicyEnum logCleanupPolicy;

  public ConfigureLogCleanerForTopicCompaction() {
  }

  public ConfigureLogCleanerForTopicCompaction logCleanerDeleteRetentionMs(Integer logCleanerDeleteRetentionMs) {
    
    this.logCleanerDeleteRetentionMs = logCleanerDeleteRetentionMs;
    return this;
  }

   /**
   * How long are delete records retained?
   * minimum: 0
   * maximum: 315569260000
   * @return logCleanerDeleteRetentionMs
  **/
  @javax.annotation.Nullable
  public Integer getLogCleanerDeleteRetentionMs() {
    return logCleanerDeleteRetentionMs;
  }


  public void setLogCleanerDeleteRetentionMs(Integer logCleanerDeleteRetentionMs) {
    this.logCleanerDeleteRetentionMs = logCleanerDeleteRetentionMs;
  }


  public ConfigureLogCleanerForTopicCompaction logCleanerMaxCompactionLagMs(Integer logCleanerMaxCompactionLagMs) {
    
    this.logCleanerMaxCompactionLagMs = logCleanerMaxCompactionLagMs;
    return this;
  }

   /**
   * The maximum amount of time message will remain uncompacted. Only applicable for logs that are being compacted
   * minimum: 30000
   * maximum: -9223372036854775616
   * @return logCleanerMaxCompactionLagMs
  **/
  @javax.annotation.Nullable
  public Integer getLogCleanerMaxCompactionLagMs() {
    return logCleanerMaxCompactionLagMs;
  }


  public void setLogCleanerMaxCompactionLagMs(Integer logCleanerMaxCompactionLagMs) {
    this.logCleanerMaxCompactionLagMs = logCleanerMaxCompactionLagMs;
  }


  public ConfigureLogCleanerForTopicCompaction logCleanerMinCleanableRatio(BigDecimal logCleanerMinCleanableRatio) {
    
    this.logCleanerMinCleanableRatio = logCleanerMinCleanableRatio;
    return this;
  }

   /**
   * Controls log compactor frequency. Larger value means more frequent compactions but also more space wasted for logs. Consider setting log.cleaner.max.compaction.lag.ms to enforce compactions sooner, instead of setting a very high value for this option.
   * minimum: 0.2
   * maximum: 0.9
   * @return logCleanerMinCleanableRatio
  **/
  @javax.annotation.Nullable
  public BigDecimal getLogCleanerMinCleanableRatio() {
    return logCleanerMinCleanableRatio;
  }


  public void setLogCleanerMinCleanableRatio(BigDecimal logCleanerMinCleanableRatio) {
    this.logCleanerMinCleanableRatio = logCleanerMinCleanableRatio;
  }


  public ConfigureLogCleanerForTopicCompaction logCleanerMinCompactionLagMs(Integer logCleanerMinCompactionLagMs) {
    
    this.logCleanerMinCompactionLagMs = logCleanerMinCompactionLagMs;
    return this;
  }

   /**
   * The minimum time a message will remain uncompacted in the log. Only applicable for logs that are being compacted.
   * minimum: 0
   * maximum: -9223372036854775616
   * @return logCleanerMinCompactionLagMs
  **/
  @javax.annotation.Nullable
  public Integer getLogCleanerMinCompactionLagMs() {
    return logCleanerMinCompactionLagMs;
  }


  public void setLogCleanerMinCompactionLagMs(Integer logCleanerMinCompactionLagMs) {
    this.logCleanerMinCompactionLagMs = logCleanerMinCompactionLagMs;
  }


  public ConfigureLogCleanerForTopicCompaction logCleanupPolicy(LogCleanupPolicyEnum logCleanupPolicy) {
    
    this.logCleanupPolicy = logCleanupPolicy;
    return this;
  }

   /**
   * The default cleanup policy for segments beyond the retention window
   * @return logCleanupPolicy
  **/
  @javax.annotation.Nullable
  public LogCleanupPolicyEnum getLogCleanupPolicy() {
    return logCleanupPolicy;
  }


  public void setLogCleanupPolicy(LogCleanupPolicyEnum logCleanupPolicy) {
    this.logCleanupPolicy = logCleanupPolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigureLogCleanerForTopicCompaction configureLogCleanerForTopicCompaction = (ConfigureLogCleanerForTopicCompaction) o;
    return Objects.equals(this.logCleanerDeleteRetentionMs, configureLogCleanerForTopicCompaction.logCleanerDeleteRetentionMs) &&
        Objects.equals(this.logCleanerMaxCompactionLagMs, configureLogCleanerForTopicCompaction.logCleanerMaxCompactionLagMs) &&
        Objects.equals(this.logCleanerMinCleanableRatio, configureLogCleanerForTopicCompaction.logCleanerMinCleanableRatio) &&
        Objects.equals(this.logCleanerMinCompactionLagMs, configureLogCleanerForTopicCompaction.logCleanerMinCompactionLagMs) &&
        Objects.equals(this.logCleanupPolicy, configureLogCleanerForTopicCompaction.logCleanupPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logCleanerDeleteRetentionMs, logCleanerMaxCompactionLagMs, logCleanerMinCleanableRatio, logCleanerMinCompactionLagMs, logCleanupPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigureLogCleanerForTopicCompaction {\n");
    sb.append("    logCleanerDeleteRetentionMs: ").append(toIndentedString(logCleanerDeleteRetentionMs)).append("\n");
    sb.append("    logCleanerMaxCompactionLagMs: ").append(toIndentedString(logCleanerMaxCompactionLagMs)).append("\n");
    sb.append("    logCleanerMinCleanableRatio: ").append(toIndentedString(logCleanerMinCleanableRatio)).append("\n");
    sb.append("    logCleanerMinCompactionLagMs: ").append(toIndentedString(logCleanerMinCompactionLagMs)).append("\n");
    sb.append("    logCleanupPolicy: ").append(toIndentedString(logCleanupPolicy)).append("\n");
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
    openapiFields.add("log_cleaner_delete_retention_ms");
    openapiFields.add("log_cleaner_max_compaction_lag_ms");
    openapiFields.add("log_cleaner_min_cleanable_ratio");
    openapiFields.add("log_cleaner_min_compaction_lag_ms");
    openapiFields.add("log_cleanup_policy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConfigureLogCleanerForTopicCompaction
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConfigureLogCleanerForTopicCompaction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigureLogCleanerForTopicCompaction is not found in the empty JSON string", ConfigureLogCleanerForTopicCompaction.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConfigureLogCleanerForTopicCompaction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigureLogCleanerForTopicCompaction` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("log_cleanup_policy") != null && !jsonObj.get("log_cleanup_policy").isJsonNull()) && !jsonObj.get("log_cleanup_policy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `log_cleanup_policy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("log_cleanup_policy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigureLogCleanerForTopicCompaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigureLogCleanerForTopicCompaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigureLogCleanerForTopicCompaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigureLogCleanerForTopicCompaction.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigureLogCleanerForTopicCompaction>() {
           @Override
           public void write(JsonWriter out, ConfigureLogCleanerForTopicCompaction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigureLogCleanerForTopicCompaction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigureLogCleanerForTopicCompaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigureLogCleanerForTopicCompaction
  * @throws IOException if the JSON string is invalid with respect to ConfigureLogCleanerForTopicCompaction
  */
  public static ConfigureLogCleanerForTopicCompaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigureLogCleanerForTopicCompaction.class);
  }

 /**
  * Convert an instance of ConfigureLogCleanerForTopicCompaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

