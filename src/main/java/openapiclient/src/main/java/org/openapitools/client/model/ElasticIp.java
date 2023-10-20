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
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import openapiclient.src.main.java.org.openapitools.client.model.ElasticIpHealthcheck;

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
 * Elastic IP
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class ElasticIp {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  /**
   * Elastic IP address family
   */
  @JsonAdapter(AddressfamilyEnum.Adapter.class)
  public enum AddressfamilyEnum {
    INET4("inet4"),
    
    INET6("inet6");

    private String value;

    AddressfamilyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AddressfamilyEnum fromValue(String value) {
      for (AddressfamilyEnum b : AddressfamilyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AddressfamilyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddressfamilyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddressfamilyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AddressfamilyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ADDRESSFAMILY = "addressfamily";
  @SerializedName(SERIALIZED_NAME_ADDRESSFAMILY)
  private AddressfamilyEnum addressfamily;

  public static final String SERIALIZED_NAME_CIDR = "cidr";
  @SerializedName(SERIALIZED_NAME_CIDR)
  private String cidr;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HEALTHCHECK = "healthcheck";
  @SerializedName(SERIALIZED_NAME_HEALTHCHECK)
  private ElasticIpHealthcheck healthcheck;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public ElasticIp() {
  }

  
  public ElasticIp(
     UUID id, 
     String ip, 
     AddressfamilyEnum addressfamily, 
     String cidr
  ) {
    this();
    this.id = id;
    this.ip = ip;
    this.addressfamily = addressfamily;
    this.cidr = cidr;
  }

   /**
   * Elastic IP ID
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }




   /**
   * Elastic IP address
   * @return ip
  **/
  @javax.annotation.Nullable
  public String getIp() {
    return ip;
  }




   /**
   * Elastic IP address family
   * @return addressfamily
  **/
  @javax.annotation.Nullable
  public AddressfamilyEnum getAddressfamily() {
    return addressfamily;
  }




   /**
   * Elastic IP cidr
   * @return cidr
  **/
  @javax.annotation.Nullable
  public String getCidr() {
    return cidr;
  }




  public ElasticIp description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Elastic IP description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ElasticIp healthcheck(ElasticIpHealthcheck healthcheck) {
    
    this.healthcheck = healthcheck;
    return this;
  }

   /**
   * Get healthcheck
   * @return healthcheck
  **/
  @javax.annotation.Nullable
  public ElasticIpHealthcheck getHealthcheck() {
    return healthcheck;
  }


  public void setHealthcheck(ElasticIpHealthcheck healthcheck) {
    this.healthcheck = healthcheck;
  }


  public ElasticIp labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public ElasticIp putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticIp elasticIp = (ElasticIp) o;
    return Objects.equals(this.id, elasticIp.id) &&
        Objects.equals(this.ip, elasticIp.ip) &&
        Objects.equals(this.addressfamily, elasticIp.addressfamily) &&
        Objects.equals(this.cidr, elasticIp.cidr) &&
        Objects.equals(this.description, elasticIp.description) &&
        Objects.equals(this.healthcheck, elasticIp.healthcheck) &&
        Objects.equals(this.labels, elasticIp.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ip, addressfamily, cidr, description, healthcheck, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticIp {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    addressfamily: ").append(toIndentedString(addressfamily)).append("\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    healthcheck: ").append(toIndentedString(healthcheck)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
    openapiFields.add("ip");
    openapiFields.add("addressfamily");
    openapiFields.add("cidr");
    openapiFields.add("description");
    openapiFields.add("healthcheck");
    openapiFields.add("labels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ElasticIp
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ElasticIp.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ElasticIp is not found in the empty JSON string", ElasticIp.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ElasticIp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ElasticIp` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("ip") != null && !jsonObj.get("ip").isJsonNull()) && !jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
      if ((jsonObj.get("addressfamily") != null && !jsonObj.get("addressfamily").isJsonNull()) && !jsonObj.get("addressfamily").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressfamily` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressfamily").toString()));
      }
      if ((jsonObj.get("cidr") != null && !jsonObj.get("cidr").isJsonNull()) && !jsonObj.get("cidr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cidr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cidr").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `healthcheck`
      if (jsonObj.get("healthcheck") != null && !jsonObj.get("healthcheck").isJsonNull()) {
        ElasticIpHealthcheck.validateJsonElement(jsonObj.get("healthcheck"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ElasticIp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ElasticIp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ElasticIp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ElasticIp.class));

       return (TypeAdapter<T>) new TypeAdapter<ElasticIp>() {
           @Override
           public void write(JsonWriter out, ElasticIp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ElasticIp read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ElasticIp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ElasticIp
  * @throws IOException if the JSON string is invalid with respect to ElasticIp
  */
  public static ElasticIp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ElasticIp.class);
  }

 /**
  * Convert an instance of ElasticIp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
