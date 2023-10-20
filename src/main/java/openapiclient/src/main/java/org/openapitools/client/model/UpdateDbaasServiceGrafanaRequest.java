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
import org.openapitools.client.model.JsonSchemaGrafana;
import openapiclient.src.main.java.org.openapitools.client.model.UpdateDbaasServiceMysqlRequestMaintenance;

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
 * UpdateDbaasServiceGrafanaRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class UpdateDbaasServiceGrafanaRequest {
  public static final String SERIALIZED_NAME_MAINTENANCE = "maintenance";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE)
  private UpdateDbaasServiceMysqlRequestMaintenance maintenance;

  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  private String plan;

  public static final String SERIALIZED_NAME_TERMINATION_PROTECTION = "termination-protection";
  @SerializedName(SERIALIZED_NAME_TERMINATION_PROTECTION)
  private Boolean terminationProtection;

  public static final String SERIALIZED_NAME_GRAFANA_SETTINGS = "grafana-settings";
  @SerializedName(SERIALIZED_NAME_GRAFANA_SETTINGS)
  private JsonSchemaGrafana grafanaSettings;

  public static final String SERIALIZED_NAME_IP_FILTER = "ip-filter";
  @SerializedName(SERIALIZED_NAME_IP_FILTER)
  private List<String> ipFilter;

  public UpdateDbaasServiceGrafanaRequest() {
  }

  public UpdateDbaasServiceGrafanaRequest maintenance(UpdateDbaasServiceMysqlRequestMaintenance maintenance) {
    
    this.maintenance = maintenance;
    return this;
  }

   /**
   * Get maintenance
   * @return maintenance
  **/
  @javax.annotation.Nullable
  public UpdateDbaasServiceMysqlRequestMaintenance getMaintenance() {
    return maintenance;
  }


  public void setMaintenance(UpdateDbaasServiceMysqlRequestMaintenance maintenance) {
    this.maintenance = maintenance;
  }


  public UpdateDbaasServiceGrafanaRequest plan(String plan) {
    
    this.plan = plan;
    return this;
  }

   /**
   * Subscription plan
   * @return plan
  **/
  @javax.annotation.Nullable
  public String getPlan() {
    return plan;
  }


  public void setPlan(String plan) {
    this.plan = plan;
  }


  public UpdateDbaasServiceGrafanaRequest terminationProtection(Boolean terminationProtection) {
    
    this.terminationProtection = terminationProtection;
    return this;
  }

   /**
   * Service is protected against termination and powering off
   * @return terminationProtection
  **/
  @javax.annotation.Nullable
  public Boolean getTerminationProtection() {
    return terminationProtection;
  }


  public void setTerminationProtection(Boolean terminationProtection) {
    this.terminationProtection = terminationProtection;
  }


  public UpdateDbaasServiceGrafanaRequest grafanaSettings(JsonSchemaGrafana grafanaSettings) {
    
    this.grafanaSettings = grafanaSettings;
    return this;
  }

   /**
   * Get grafanaSettings
   * @return grafanaSettings
  **/
  @javax.annotation.Nullable
  public JsonSchemaGrafana getGrafanaSettings() {
    return grafanaSettings;
  }


  public void setGrafanaSettings(JsonSchemaGrafana grafanaSettings) {
    this.grafanaSettings = grafanaSettings;
  }


  public UpdateDbaasServiceGrafanaRequest ipFilter(List<String> ipFilter) {
    
    this.ipFilter = ipFilter;
    return this;
  }

  public UpdateDbaasServiceGrafanaRequest addIpFilterItem(String ipFilterItem) {
    if (this.ipFilter == null) {
      this.ipFilter = new ArrayList<>();
    }
    this.ipFilter.add(ipFilterItem);
    return this;
  }

   /**
   * Allowed CIDR address blocks for incoming connections
   * @return ipFilter
  **/
  @javax.annotation.Nullable
  public List<String> getIpFilter() {
    return ipFilter;
  }


  public void setIpFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDbaasServiceGrafanaRequest updateDbaasServiceGrafanaRequest = (UpdateDbaasServiceGrafanaRequest) o;
    return Objects.equals(this.maintenance, updateDbaasServiceGrafanaRequest.maintenance) &&
        Objects.equals(this.plan, updateDbaasServiceGrafanaRequest.plan) &&
        Objects.equals(this.terminationProtection, updateDbaasServiceGrafanaRequest.terminationProtection) &&
        Objects.equals(this.grafanaSettings, updateDbaasServiceGrafanaRequest.grafanaSettings) &&
        Objects.equals(this.ipFilter, updateDbaasServiceGrafanaRequest.ipFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintenance, plan, terminationProtection, grafanaSettings, ipFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDbaasServiceGrafanaRequest {\n");
    sb.append("    maintenance: ").append(toIndentedString(maintenance)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    terminationProtection: ").append(toIndentedString(terminationProtection)).append("\n");
    sb.append("    grafanaSettings: ").append(toIndentedString(grafanaSettings)).append("\n");
    sb.append("    ipFilter: ").append(toIndentedString(ipFilter)).append("\n");
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
    openapiFields.add("maintenance");
    openapiFields.add("plan");
    openapiFields.add("termination-protection");
    openapiFields.add("grafana-settings");
    openapiFields.add("ip-filter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateDbaasServiceGrafanaRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateDbaasServiceGrafanaRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateDbaasServiceGrafanaRequest is not found in the empty JSON string", UpdateDbaasServiceGrafanaRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateDbaasServiceGrafanaRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateDbaasServiceGrafanaRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `maintenance`
      if (jsonObj.get("maintenance") != null && !jsonObj.get("maintenance").isJsonNull()) {
        UpdateDbaasServiceMysqlRequestMaintenance.validateJsonElement(jsonObj.get("maintenance"));
      }
      if ((jsonObj.get("plan") != null && !jsonObj.get("plan").isJsonNull()) && !jsonObj.get("plan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan").toString()));
      }
      // validate the optional field `grafana-settings`
      if (jsonObj.get("grafana-settings") != null && !jsonObj.get("grafana-settings").isJsonNull()) {
        JsonSchemaGrafana.validateJsonElement(jsonObj.get("grafana-settings"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ip-filter") != null && !jsonObj.get("ip-filter").isJsonNull() && !jsonObj.get("ip-filter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip-filter` to be an array in the JSON string but got `%s`", jsonObj.get("ip-filter").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateDbaasServiceGrafanaRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateDbaasServiceGrafanaRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateDbaasServiceGrafanaRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateDbaasServiceGrafanaRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateDbaasServiceGrafanaRequest>() {
           @Override
           public void write(JsonWriter out, UpdateDbaasServiceGrafanaRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateDbaasServiceGrafanaRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateDbaasServiceGrafanaRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateDbaasServiceGrafanaRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateDbaasServiceGrafanaRequest
  */
  public static UpdateDbaasServiceGrafanaRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateDbaasServiceGrafanaRequest.class);
  }

 /**
  * Convert an instance of UpdateDbaasServiceGrafanaRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
