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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import openapiclient.src.main.java.org.openapitools.client.model.ZoneName;

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
 * Instance template
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class Template {
  public static final String SERIALIZED_NAME_MAINTAINER = "maintainer";
  @SerializedName(SERIALIZED_NAME_MAINTAINER)
  private String maintainer;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SSH_KEY_ENABLED = "ssh-key-enabled";
  @SerializedName(SERIALIZED_NAME_SSH_KEY_ENABLED)
  private Boolean sshKeyEnabled;

  public static final String SERIALIZED_NAME_FAMILY = "family";
  @SerializedName(SERIALIZED_NAME_FAMILY)
  private String family;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DEFAULT_USER = "default-user";
  @SerializedName(SERIALIZED_NAME_DEFAULT_USER)
  private String defaultUser;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_PASSWORD_ENABLED = "password-enabled";
  @SerializedName(SERIALIZED_NAME_PASSWORD_ENABLED)
  private Boolean passwordEnabled;

  public static final String SERIALIZED_NAME_BUILD = "build";
  @SerializedName(SERIALIZED_NAME_BUILD)
  private String build;

  public static final String SERIALIZED_NAME_CHECKSUM = "checksum";
  @SerializedName(SERIALIZED_NAME_CHECKSUM)
  private String checksum;

  /**
   * Boot mode (default: legacy)
   */
  @JsonAdapter(BootModeEnum.Adapter.class)
  public enum BootModeEnum {
    LEGACY("legacy"),
    
    UEFI("uefi");

    private String value;

    BootModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BootModeEnum fromValue(String value) {
      for (BootModeEnum b : BootModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BootModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BootModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BootModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BootModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BOOT_MODE = "boot-mode";
  @SerializedName(SERIALIZED_NAME_BOOT_MODE)
  private BootModeEnum bootMode;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ZONES = "zones";
  @SerializedName(SERIALIZED_NAME_ZONES)
  private List<ZoneName> zones;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_CREATED_AT = "created-at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  /**
   * Template visibility
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    PRIVATE("private"),
    
    PUBLIC("public");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VisibilityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private VisibilityEnum visibility;

  public Template() {
  }

  
  public Template(
     String maintainer, 
     String family, 
     String build, 
     UUID id, 
     String version, 
     OffsetDateTime createdAt, 
     VisibilityEnum visibility
  ) {
    this();
    this.maintainer = maintainer;
    this.family = family;
    this.build = build;
    this.id = id;
    this.version = version;
    this.createdAt = createdAt;
    this.visibility = visibility;
  }

   /**
   * Template maintainer
   * @return maintainer
  **/
  @javax.annotation.Nullable
  public String getMaintainer() {
    return maintainer;
  }




  public Template description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Template description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Template sshKeyEnabled(Boolean sshKeyEnabled) {
    
    this.sshKeyEnabled = sshKeyEnabled;
    return this;
  }

   /**
   * Enable SSH key-based login
   * @return sshKeyEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getSshKeyEnabled() {
    return sshKeyEnabled;
  }


  public void setSshKeyEnabled(Boolean sshKeyEnabled) {
    this.sshKeyEnabled = sshKeyEnabled;
  }


   /**
   * Template family
   * @return family
  **/
  @javax.annotation.Nullable
  public String getFamily() {
    return family;
  }




  public Template name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Template name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Template defaultUser(String defaultUser) {
    
    this.defaultUser = defaultUser;
    return this;
  }

   /**
   * Template default user
   * @return defaultUser
  **/
  @javax.annotation.Nullable
  public String getDefaultUser() {
    return defaultUser;
  }


  public void setDefaultUser(String defaultUser) {
    this.defaultUser = defaultUser;
  }


  public Template size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Template size
   * minimum: 0
   * @return size
  **/
  @javax.annotation.Nullable
  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public Template passwordEnabled(Boolean passwordEnabled) {
    
    this.passwordEnabled = passwordEnabled;
    return this;
  }

   /**
   * Enable password-based login
   * @return passwordEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getPasswordEnabled() {
    return passwordEnabled;
  }


  public void setPasswordEnabled(Boolean passwordEnabled) {
    this.passwordEnabled = passwordEnabled;
  }


   /**
   * Template build
   * @return build
  **/
  @javax.annotation.Nullable
  public String getBuild() {
    return build;
  }




  public Template checksum(String checksum) {
    
    this.checksum = checksum;
    return this;
  }

   /**
   * Template MD5 checksum
   * @return checksum
  **/
  @javax.annotation.Nullable
  public String getChecksum() {
    return checksum;
  }


  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }


  public Template bootMode(BootModeEnum bootMode) {
    
    this.bootMode = bootMode;
    return this;
  }

   /**
   * Boot mode (default: legacy)
   * @return bootMode
  **/
  @javax.annotation.Nullable
  public BootModeEnum getBootMode() {
    return bootMode;
  }


  public void setBootMode(BootModeEnum bootMode) {
    this.bootMode = bootMode;
  }


   /**
   * Template ID
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }




  public Template zones(List<ZoneName> zones) {
    
    this.zones = zones;
    return this;
  }

  public Template addZonesItem(ZoneName zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<>();
    }
    this.zones.add(zonesItem);
    return this;
  }

   /**
   * Zones availability
   * @return zones
  **/
  @javax.annotation.Nullable
  public List<ZoneName> getZones() {
    return zones;
  }


  public void setZones(List<ZoneName> zones) {
    this.zones = zones;
  }


  public Template url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Template source URL
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


   /**
   * Template version
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }




   /**
   * Template creation date
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * Template visibility
   * @return visibility
  **/
  @javax.annotation.Nullable
  public VisibilityEnum getVisibility() {
    return visibility;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Template template = (Template) o;
    return Objects.equals(this.maintainer, template.maintainer) &&
        Objects.equals(this.description, template.description) &&
        Objects.equals(this.sshKeyEnabled, template.sshKeyEnabled) &&
        Objects.equals(this.family, template.family) &&
        Objects.equals(this.name, template.name) &&
        Objects.equals(this.defaultUser, template.defaultUser) &&
        Objects.equals(this.size, template.size) &&
        Objects.equals(this.passwordEnabled, template.passwordEnabled) &&
        Objects.equals(this.build, template.build) &&
        Objects.equals(this.checksum, template.checksum) &&
        Objects.equals(this.bootMode, template.bootMode) &&
        Objects.equals(this.id, template.id) &&
        Objects.equals(this.zones, template.zones) &&
        Objects.equals(this.url, template.url) &&
        Objects.equals(this.version, template.version) &&
        Objects.equals(this.createdAt, template.createdAt) &&
        Objects.equals(this.visibility, template.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintainer, description, sshKeyEnabled, family, name, defaultUser, size, passwordEnabled, build, checksum, bootMode, id, zones, url, version, createdAt, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Template {\n");
    sb.append("    maintainer: ").append(toIndentedString(maintainer)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sshKeyEnabled: ").append(toIndentedString(sshKeyEnabled)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultUser: ").append(toIndentedString(defaultUser)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    passwordEnabled: ").append(toIndentedString(passwordEnabled)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    bootMode: ").append(toIndentedString(bootMode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
    openapiFields.add("maintainer");
    openapiFields.add("description");
    openapiFields.add("ssh-key-enabled");
    openapiFields.add("family");
    openapiFields.add("name");
    openapiFields.add("default-user");
    openapiFields.add("size");
    openapiFields.add("password-enabled");
    openapiFields.add("build");
    openapiFields.add("checksum");
    openapiFields.add("boot-mode");
    openapiFields.add("id");
    openapiFields.add("zones");
    openapiFields.add("url");
    openapiFields.add("version");
    openapiFields.add("created-at");
    openapiFields.add("visibility");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Template
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Template.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Template is not found in the empty JSON string", Template.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Template.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Template` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("maintainer") != null && !jsonObj.get("maintainer").isJsonNull()) && !jsonObj.get("maintainer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maintainer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maintainer").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("family") != null && !jsonObj.get("family").isJsonNull()) && !jsonObj.get("family").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `family` to be a primitive type in the JSON string but got `%s`", jsonObj.get("family").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("default-user") != null && !jsonObj.get("default-user").isJsonNull()) && !jsonObj.get("default-user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default-user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default-user").toString()));
      }
      if ((jsonObj.get("build") != null && !jsonObj.get("build").isJsonNull()) && !jsonObj.get("build").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `build` to be a primitive type in the JSON string but got `%s`", jsonObj.get("build").toString()));
      }
      if ((jsonObj.get("checksum") != null && !jsonObj.get("checksum").isJsonNull()) && !jsonObj.get("checksum").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checksum` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checksum").toString()));
      }
      if ((jsonObj.get("boot-mode") != null && !jsonObj.get("boot-mode").isJsonNull()) && !jsonObj.get("boot-mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `boot-mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("boot-mode").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("zones") != null && !jsonObj.get("zones").isJsonNull() && !jsonObj.get("zones").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `zones` to be an array in the JSON string but got `%s`", jsonObj.get("zones").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) && !jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Template.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Template' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Template> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Template.class));

       return (TypeAdapter<T>) new TypeAdapter<Template>() {
           @Override
           public void write(JsonWriter out, Template value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Template read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Template given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Template
  * @throws IOException if the JSON string is invalid with respect to Template
  */
  public static Template fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Template.class);
  }

 /**
  * Convert an instance of Template to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
