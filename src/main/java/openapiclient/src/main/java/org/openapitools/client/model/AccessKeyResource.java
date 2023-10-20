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
 * Access key resource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class AccessKeyResource {
  /**
   * Resource domain
   */
  @JsonAdapter(DomainEnum.Adapter.class)
  public enum DomainEnum {
    PARTNER("partner"),
    
    SOS("sos");

    private String value;

    DomainEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DomainEnum fromValue(String value) {
      for (DomainEnum b : DomainEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DomainEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DomainEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DomainEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DomainEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private DomainEnum domain;

  /**
   * Resource type
   */
  @JsonAdapter(ResourceTypeEnum.Adapter.class)
  public enum ResourceTypeEnum {
    PRODUCT("product"),
    
    BUCKET("bucket");

    private String value;

    ResourceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResourceTypeEnum fromValue(String value) {
      for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResourceTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource-type";
  @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
  private ResourceTypeEnum resourceType;

  public static final String SERIALIZED_NAME_RESOURCE_NAME = "resource-name";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
  private String resourceName;

  public AccessKeyResource() {
  }

  public AccessKeyResource domain(DomainEnum domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * Resource domain
   * @return domain
  **/
  @javax.annotation.Nullable
  public DomainEnum getDomain() {
    return domain;
  }


  public void setDomain(DomainEnum domain) {
    this.domain = domain;
  }


  public AccessKeyResource resourceType(ResourceTypeEnum resourceType) {
    
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Resource type
   * @return resourceType
  **/
  @javax.annotation.Nullable
  public ResourceTypeEnum getResourceType() {
    return resourceType;
  }


  public void setResourceType(ResourceTypeEnum resourceType) {
    this.resourceType = resourceType;
  }


  public AccessKeyResource resourceName(String resourceName) {
    
    this.resourceName = resourceName;
    return this;
  }

   /**
   * Resource name
   * @return resourceName
  **/
  @javax.annotation.Nullable
  public String getResourceName() {
    return resourceName;
  }


  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessKeyResource accessKeyResource = (AccessKeyResource) o;
    return Objects.equals(this.domain, accessKeyResource.domain) &&
        Objects.equals(this.resourceType, accessKeyResource.resourceType) &&
        Objects.equals(this.resourceName, accessKeyResource.resourceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, resourceType, resourceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessKeyResource {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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
    openapiFields.add("domain");
    openapiFields.add("resource-type");
    openapiFields.add("resource-name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessKeyResource
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessKeyResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessKeyResource is not found in the empty JSON string", AccessKeyResource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AccessKeyResource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessKeyResource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("domain") != null && !jsonObj.get("domain").isJsonNull()) && !jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      if ((jsonObj.get("resource-type") != null && !jsonObj.get("resource-type").isJsonNull()) && !jsonObj.get("resource-type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource-type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource-type").toString()));
      }
      if ((jsonObj.get("resource-name") != null && !jsonObj.get("resource-name").isJsonNull()) && !jsonObj.get("resource-name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource-name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource-name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessKeyResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessKeyResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessKeyResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessKeyResource.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessKeyResource>() {
           @Override
           public void write(JsonWriter out, AccessKeyResource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessKeyResource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessKeyResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessKeyResource
  * @throws IOException if the JSON string is invalid with respect to AccessKeyResource
  */
  public static AccessKeyResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessKeyResource.class);
  }

 /**
  * Convert an instance of AccessKeyResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

