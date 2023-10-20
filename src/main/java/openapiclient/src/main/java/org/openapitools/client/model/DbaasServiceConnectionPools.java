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
 * PostgreSQL PGBouncer connection pools
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class DbaasServiceConnectionPools {
  public static final String SERIALIZED_NAME_CONNECTION_URI = "connection-uri";
  @SerializedName(SERIALIZED_NAME_CONNECTION_URI)
  private String connectionUri;

  public static final String SERIALIZED_NAME_DATABASE = "database";
  @SerializedName(SERIALIZED_NAME_DATABASE)
  private String database;

  /**
   * PGBouncer pool mode
   */
  @JsonAdapter(PoolModeEnum.Adapter.class)
  public enum PoolModeEnum {
    TRANSACTION("transaction"),
    
    STATEMENT("statement"),
    
    SESSION("session");

    private String value;

    PoolModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PoolModeEnum fromValue(String value) {
      for (PoolModeEnum b : PoolModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PoolModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PoolModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PoolModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PoolModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_POOL_MODE = "pool-mode";
  @SerializedName(SERIALIZED_NAME_POOL_MODE)
  private PoolModeEnum poolMode;

  public static final String SERIALIZED_NAME_POOL_NAME = "pool-name";
  @SerializedName(SERIALIZED_NAME_POOL_NAME)
  private String poolName;

  public static final String SERIALIZED_NAME_POOL_SIZE = "pool-size";
  @SerializedName(SERIALIZED_NAME_POOL_SIZE)
  private Long poolSize;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public DbaasServiceConnectionPools() {
  }

  public DbaasServiceConnectionPools connectionUri(String connectionUri) {
    
    this.connectionUri = connectionUri;
    return this;
  }

   /**
   * Connection URI for the DB pool
   * @return connectionUri
  **/
  @javax.annotation.Nonnull
  public String getConnectionUri() {
    return connectionUri;
  }


  public void setConnectionUri(String connectionUri) {
    this.connectionUri = connectionUri;
  }


  public DbaasServiceConnectionPools database(String database) {
    
    this.database = database;
    return this;
  }

   /**
   * Service database name
   * @return database
  **/
  @javax.annotation.Nonnull
  public String getDatabase() {
    return database;
  }


  public void setDatabase(String database) {
    this.database = database;
  }


  public DbaasServiceConnectionPools poolMode(PoolModeEnum poolMode) {
    
    this.poolMode = poolMode;
    return this;
  }

   /**
   * PGBouncer pool mode
   * @return poolMode
  **/
  @javax.annotation.Nonnull
  public PoolModeEnum getPoolMode() {
    return poolMode;
  }


  public void setPoolMode(PoolModeEnum poolMode) {
    this.poolMode = poolMode;
  }


  public DbaasServiceConnectionPools poolName(String poolName) {
    
    this.poolName = poolName;
    return this;
  }

   /**
   * Connection pool name
   * @return poolName
  **/
  @javax.annotation.Nonnull
  public String getPoolName() {
    return poolName;
  }


  public void setPoolName(String poolName) {
    this.poolName = poolName;
  }


  public DbaasServiceConnectionPools poolSize(Long poolSize) {
    
    this.poolSize = poolSize;
    return this;
  }

   /**
   * Size of PGBouncer&#39;s PostgreSQL side connection pool
   * minimum: 1
   * maximum: 1000
   * @return poolSize
  **/
  @javax.annotation.Nonnull
  public Long getPoolSize() {
    return poolSize;
  }


  public void setPoolSize(Long poolSize) {
    this.poolSize = poolSize;
  }


  public DbaasServiceConnectionPools username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Pool username
   * @return username
  **/
  @javax.annotation.Nonnull
  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceConnectionPools dbaasServiceConnectionPools = (DbaasServiceConnectionPools) o;
    return Objects.equals(this.connectionUri, dbaasServiceConnectionPools.connectionUri) &&
        Objects.equals(this.database, dbaasServiceConnectionPools.database) &&
        Objects.equals(this.poolMode, dbaasServiceConnectionPools.poolMode) &&
        Objects.equals(this.poolName, dbaasServiceConnectionPools.poolName) &&
        Objects.equals(this.poolSize, dbaasServiceConnectionPools.poolSize) &&
        Objects.equals(this.username, dbaasServiceConnectionPools.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionUri, database, poolMode, poolName, poolSize, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceConnectionPools {\n");
    sb.append("    connectionUri: ").append(toIndentedString(connectionUri)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    poolMode: ").append(toIndentedString(poolMode)).append("\n");
    sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
    sb.append("    poolSize: ").append(toIndentedString(poolSize)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("connection-uri");
    openapiFields.add("database");
    openapiFields.add("pool-mode");
    openapiFields.add("pool-name");
    openapiFields.add("pool-size");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("connection-uri");
    openapiRequiredFields.add("database");
    openapiRequiredFields.add("pool-mode");
    openapiRequiredFields.add("pool-name");
    openapiRequiredFields.add("pool-size");
    openapiRequiredFields.add("username");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DbaasServiceConnectionPools
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DbaasServiceConnectionPools.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DbaasServiceConnectionPools is not found in the empty JSON string", DbaasServiceConnectionPools.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DbaasServiceConnectionPools.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DbaasServiceConnectionPools` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DbaasServiceConnectionPools.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("connection-uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection-uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection-uri").toString()));
      }
      if (!jsonObj.get("database").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `database` to be a primitive type in the JSON string but got `%s`", jsonObj.get("database").toString()));
      }
      if (!jsonObj.get("pool-mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pool-mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool-mode").toString()));
      }
      if (!jsonObj.get("pool-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pool-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool-name").toString()));
      }
      if (!jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DbaasServiceConnectionPools.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DbaasServiceConnectionPools' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DbaasServiceConnectionPools> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DbaasServiceConnectionPools.class));

       return (TypeAdapter<T>) new TypeAdapter<DbaasServiceConnectionPools>() {
           @Override
           public void write(JsonWriter out, DbaasServiceConnectionPools value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DbaasServiceConnectionPools read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DbaasServiceConnectionPools given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DbaasServiceConnectionPools
  * @throws IOException if the JSON string is invalid with respect to DbaasServiceConnectionPools
  */
  public static DbaasServiceConnectionPools fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DbaasServiceConnectionPools.class);
  }

 /**
  * Convert an instance of DbaasServiceConnectionPools to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

