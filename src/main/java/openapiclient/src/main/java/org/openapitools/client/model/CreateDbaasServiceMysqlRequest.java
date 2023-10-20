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
import openapiclient.src.main.java.org.openapitools.client.model.CreateDbaasServiceMysqlRequestIntegrationsInner;
import org.openapitools.client.model.JsonSchemaMysql;
import openapiclient.src.main.java.org.openapitools.client.model.UpdateDbaasServiceMysqlRequestBackupSchedule;
import openapiclient.src.main.java.org.openapitools.client.model.UpdateDbaasServiceMysqlRequestMaintenance;
import openapiclient.src.main.java.org.openapitools.client.model.UpdateDbaasServiceMysqlRequestMigration;

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
 * CreateDbaasServiceMysqlRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class CreateDbaasServiceMysqlRequest {
  public static final String SERIALIZED_NAME_BACKUP_SCHEDULE = "backup-schedule";
  @SerializedName(SERIALIZED_NAME_BACKUP_SCHEDULE)
  private UpdateDbaasServiceMysqlRequestBackupSchedule backupSchedule;

  public static final String SERIALIZED_NAME_INTEGRATIONS = "integrations";
  @SerializedName(SERIALIZED_NAME_INTEGRATIONS)
  private List<CreateDbaasServiceMysqlRequestIntegrationsInner> integrations;

  public static final String SERIALIZED_NAME_IP_FILTER = "ip-filter";
  @SerializedName(SERIALIZED_NAME_IP_FILTER)
  private List<String> ipFilter;

  public static final String SERIALIZED_NAME_TERMINATION_PROTECTION = "termination-protection";
  @SerializedName(SERIALIZED_NAME_TERMINATION_PROTECTION)
  private Boolean terminationProtection;

  public static final String SERIALIZED_NAME_FORK_FROM_SERVICE = "fork-from-service";
  @SerializedName(SERIALIZED_NAME_FORK_FROM_SERVICE)
  private String forkFromService;

  public static final String SERIALIZED_NAME_RECOVERY_BACKUP_TIME = "recovery-backup-time";
  @SerializedName(SERIALIZED_NAME_RECOVERY_BACKUP_TIME)
  private String recoveryBackupTime;

  public static final String SERIALIZED_NAME_MYSQL_SETTINGS = "mysql-settings";
  @SerializedName(SERIALIZED_NAME_MYSQL_SETTINGS)
  private JsonSchemaMysql mysqlSettings;

  public static final String SERIALIZED_NAME_MAINTENANCE = "maintenance";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE)
  private UpdateDbaasServiceMysqlRequestMaintenance maintenance;

  public static final String SERIALIZED_NAME_ADMIN_USERNAME = "admin-username";
  @SerializedName(SERIALIZED_NAME_ADMIN_USERNAME)
  private String adminUsername;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  private String plan;

  public static final String SERIALIZED_NAME_ADMIN_PASSWORD = "admin-password";
  @SerializedName(SERIALIZED_NAME_ADMIN_PASSWORD)
  private String adminPassword;

  public static final String SERIALIZED_NAME_MIGRATION = "migration";
  @SerializedName(SERIALIZED_NAME_MIGRATION)
  private UpdateDbaasServiceMysqlRequestMigration migration;

  public static final String SERIALIZED_NAME_BINLOG_RETENTION_PERIOD = "binlog-retention-period";
  @SerializedName(SERIALIZED_NAME_BINLOG_RETENTION_PERIOD)
  private Long binlogRetentionPeriod;

  public CreateDbaasServiceMysqlRequest() {
  }

  public CreateDbaasServiceMysqlRequest backupSchedule(UpdateDbaasServiceMysqlRequestBackupSchedule backupSchedule) {
    
    this.backupSchedule = backupSchedule;
    return this;
  }

   /**
   * Get backupSchedule
   * @return backupSchedule
  **/
  @javax.annotation.Nullable
  public UpdateDbaasServiceMysqlRequestBackupSchedule getBackupSchedule() {
    return backupSchedule;
  }


  public void setBackupSchedule(UpdateDbaasServiceMysqlRequestBackupSchedule backupSchedule) {
    this.backupSchedule = backupSchedule;
  }


  public CreateDbaasServiceMysqlRequest integrations(List<CreateDbaasServiceMysqlRequestIntegrationsInner> integrations) {
    
    this.integrations = integrations;
    return this;
  }

  public CreateDbaasServiceMysqlRequest addIntegrationsItem(CreateDbaasServiceMysqlRequestIntegrationsInner integrationsItem) {
    if (this.integrations == null) {
      this.integrations = new ArrayList<>();
    }
    this.integrations.add(integrationsItem);
    return this;
  }

   /**
   * Service integrations to be enabled when creating the service.
   * @return integrations
  **/
  @javax.annotation.Nullable
  public List<CreateDbaasServiceMysqlRequestIntegrationsInner> getIntegrations() {
    return integrations;
  }


  public void setIntegrations(List<CreateDbaasServiceMysqlRequestIntegrationsInner> integrations) {
    this.integrations = integrations;
  }


  public CreateDbaasServiceMysqlRequest ipFilter(List<String> ipFilter) {
    
    this.ipFilter = ipFilter;
    return this;
  }

  public CreateDbaasServiceMysqlRequest addIpFilterItem(String ipFilterItem) {
    if (this.ipFilter == null) {
      this.ipFilter = new ArrayList<>();
    }
    this.ipFilter.add(ipFilterItem);
    return this;
  }

   /**
   * Allow incoming connections from CIDR address block, e.g. &#39;10.20.0.0/16&#39;
   * @return ipFilter
  **/
  @javax.annotation.Nullable
  public List<String> getIpFilter() {
    return ipFilter;
  }


  public void setIpFilter(List<String> ipFilter) {
    this.ipFilter = ipFilter;
  }


  public CreateDbaasServiceMysqlRequest terminationProtection(Boolean terminationProtection) {
    
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


  public CreateDbaasServiceMysqlRequest forkFromService(String forkFromService) {
    
    this.forkFromService = forkFromService;
    return this;
  }

   /**
   * Get forkFromService
   * @return forkFromService
  **/
  @javax.annotation.Nullable
  public String getForkFromService() {
    return forkFromService;
  }


  public void setForkFromService(String forkFromService) {
    this.forkFromService = forkFromService;
  }


  public CreateDbaasServiceMysqlRequest recoveryBackupTime(String recoveryBackupTime) {
    
    this.recoveryBackupTime = recoveryBackupTime;
    return this;
  }

   /**
   * ISO time of a backup to recover from for services that support arbitrary times
   * @return recoveryBackupTime
  **/
  @javax.annotation.Nullable
  public String getRecoveryBackupTime() {
    return recoveryBackupTime;
  }


  public void setRecoveryBackupTime(String recoveryBackupTime) {
    this.recoveryBackupTime = recoveryBackupTime;
  }


  public CreateDbaasServiceMysqlRequest mysqlSettings(JsonSchemaMysql mysqlSettings) {
    
    this.mysqlSettings = mysqlSettings;
    return this;
  }

   /**
   * Get mysqlSettings
   * @return mysqlSettings
  **/
  @javax.annotation.Nullable
  public JsonSchemaMysql getMysqlSettings() {
    return mysqlSettings;
  }


  public void setMysqlSettings(JsonSchemaMysql mysqlSettings) {
    this.mysqlSettings = mysqlSettings;
  }


  public CreateDbaasServiceMysqlRequest maintenance(UpdateDbaasServiceMysqlRequestMaintenance maintenance) {
    
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


  public CreateDbaasServiceMysqlRequest adminUsername(String adminUsername) {
    
    this.adminUsername = adminUsername;
    return this;
  }

   /**
   * Custom username for admin user. This must be set only when a new service is being created.
   * @return adminUsername
  **/
  @javax.annotation.Nullable
  public String getAdminUsername() {
    return adminUsername;
  }


  public void setAdminUsername(String adminUsername) {
    this.adminUsername = adminUsername;
  }


  public CreateDbaasServiceMysqlRequest version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * MySQL major version
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public CreateDbaasServiceMysqlRequest plan(String plan) {
    
    this.plan = plan;
    return this;
  }

   /**
   * Subscription plan
   * @return plan
  **/
  @javax.annotation.Nonnull
  public String getPlan() {
    return plan;
  }


  public void setPlan(String plan) {
    this.plan = plan;
  }


  public CreateDbaasServiceMysqlRequest adminPassword(String adminPassword) {
    
    this.adminPassword = adminPassword;
    return this;
  }

   /**
   * Custom password for admin user. Defaults to random string. This must be set only when a new service is being created.
   * @return adminPassword
  **/
  @javax.annotation.Nullable
  public String getAdminPassword() {
    return adminPassword;
  }


  public void setAdminPassword(String adminPassword) {
    this.adminPassword = adminPassword;
  }


  public CreateDbaasServiceMysqlRequest migration(UpdateDbaasServiceMysqlRequestMigration migration) {
    
    this.migration = migration;
    return this;
  }

   /**
   * Get migration
   * @return migration
  **/
  @javax.annotation.Nullable
  public UpdateDbaasServiceMysqlRequestMigration getMigration() {
    return migration;
  }


  public void setMigration(UpdateDbaasServiceMysqlRequestMigration migration) {
    this.migration = migration;
  }


  public CreateDbaasServiceMysqlRequest binlogRetentionPeriod(Long binlogRetentionPeriod) {
    
    this.binlogRetentionPeriod = binlogRetentionPeriod;
    return this;
  }

   /**
   * The minimum amount of time in seconds to keep binlog entries before deletion. This may be extended for services that require binlog entries for longer than the default for example if using the MySQL Debezium Kafka connector.
   * minimum: 600
   * maximum: 86400
   * @return binlogRetentionPeriod
  **/
  @javax.annotation.Nullable
  public Long getBinlogRetentionPeriod() {
    return binlogRetentionPeriod;
  }


  public void setBinlogRetentionPeriod(Long binlogRetentionPeriod) {
    this.binlogRetentionPeriod = binlogRetentionPeriod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDbaasServiceMysqlRequest createDbaasServiceMysqlRequest = (CreateDbaasServiceMysqlRequest) o;
    return Objects.equals(this.backupSchedule, createDbaasServiceMysqlRequest.backupSchedule) &&
        Objects.equals(this.integrations, createDbaasServiceMysqlRequest.integrations) &&
        Objects.equals(this.ipFilter, createDbaasServiceMysqlRequest.ipFilter) &&
        Objects.equals(this.terminationProtection, createDbaasServiceMysqlRequest.terminationProtection) &&
        Objects.equals(this.forkFromService, createDbaasServiceMysqlRequest.forkFromService) &&
        Objects.equals(this.recoveryBackupTime, createDbaasServiceMysqlRequest.recoveryBackupTime) &&
        Objects.equals(this.mysqlSettings, createDbaasServiceMysqlRequest.mysqlSettings) &&
        Objects.equals(this.maintenance, createDbaasServiceMysqlRequest.maintenance) &&
        Objects.equals(this.adminUsername, createDbaasServiceMysqlRequest.adminUsername) &&
        Objects.equals(this.version, createDbaasServiceMysqlRequest.version) &&
        Objects.equals(this.plan, createDbaasServiceMysqlRequest.plan) &&
        Objects.equals(this.adminPassword, createDbaasServiceMysqlRequest.adminPassword) &&
        Objects.equals(this.migration, createDbaasServiceMysqlRequest.migration) &&
        Objects.equals(this.binlogRetentionPeriod, createDbaasServiceMysqlRequest.binlogRetentionPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupSchedule, integrations, ipFilter, terminationProtection, forkFromService, recoveryBackupTime, mysqlSettings, maintenance, adminUsername, version, plan, adminPassword, migration, binlogRetentionPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDbaasServiceMysqlRequest {\n");
    sb.append("    backupSchedule: ").append(toIndentedString(backupSchedule)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    ipFilter: ").append(toIndentedString(ipFilter)).append("\n");
    sb.append("    terminationProtection: ").append(toIndentedString(terminationProtection)).append("\n");
    sb.append("    forkFromService: ").append(toIndentedString(forkFromService)).append("\n");
    sb.append("    recoveryBackupTime: ").append(toIndentedString(recoveryBackupTime)).append("\n");
    sb.append("    mysqlSettings: ").append(toIndentedString(mysqlSettings)).append("\n");
    sb.append("    maintenance: ").append(toIndentedString(maintenance)).append("\n");
    sb.append("    adminUsername: ").append(toIndentedString(adminUsername)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    adminPassword: ").append(toIndentedString(adminPassword)).append("\n");
    sb.append("    migration: ").append(toIndentedString(migration)).append("\n");
    sb.append("    binlogRetentionPeriod: ").append(toIndentedString(binlogRetentionPeriod)).append("\n");
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
    openapiFields.add("backup-schedule");
    openapiFields.add("integrations");
    openapiFields.add("ip-filter");
    openapiFields.add("termination-protection");
    openapiFields.add("fork-from-service");
    openapiFields.add("recovery-backup-time");
    openapiFields.add("mysql-settings");
    openapiFields.add("maintenance");
    openapiFields.add("admin-username");
    openapiFields.add("version");
    openapiFields.add("plan");
    openapiFields.add("admin-password");
    openapiFields.add("migration");
    openapiFields.add("binlog-retention-period");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("plan");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateDbaasServiceMysqlRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateDbaasServiceMysqlRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateDbaasServiceMysqlRequest is not found in the empty JSON string", CreateDbaasServiceMysqlRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateDbaasServiceMysqlRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateDbaasServiceMysqlRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateDbaasServiceMysqlRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `backup-schedule`
      if (jsonObj.get("backup-schedule") != null && !jsonObj.get("backup-schedule").isJsonNull()) {
        UpdateDbaasServiceMysqlRequestBackupSchedule.validateJsonElement(jsonObj.get("backup-schedule"));
      }
      if (jsonObj.get("integrations") != null && !jsonObj.get("integrations").isJsonNull()) {
        JsonArray jsonArrayintegrations = jsonObj.getAsJsonArray("integrations");
        if (jsonArrayintegrations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("integrations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `integrations` to be an array in the JSON string but got `%s`", jsonObj.get("integrations").toString()));
          }

          // validate the optional field `integrations` (array)
          for (int i = 0; i < jsonArrayintegrations.size(); i++) {
            CreateDbaasServiceMysqlRequestIntegrationsInner.validateJsonElement(jsonArrayintegrations.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ip-filter") != null && !jsonObj.get("ip-filter").isJsonNull() && !jsonObj.get("ip-filter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip-filter` to be an array in the JSON string but got `%s`", jsonObj.get("ip-filter").toString()));
      }
      if ((jsonObj.get("fork-from-service") != null && !jsonObj.get("fork-from-service").isJsonNull()) && !jsonObj.get("fork-from-service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fork-from-service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fork-from-service").toString()));
      }
      if ((jsonObj.get("recovery-backup-time") != null && !jsonObj.get("recovery-backup-time").isJsonNull()) && !jsonObj.get("recovery-backup-time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recovery-backup-time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recovery-backup-time").toString()));
      }
      // validate the optional field `mysql-settings`
      if (jsonObj.get("mysql-settings") != null && !jsonObj.get("mysql-settings").isJsonNull()) {
        JsonSchemaMysql.validateJsonElement(jsonObj.get("mysql-settings"));
      }
      // validate the optional field `maintenance`
      if (jsonObj.get("maintenance") != null && !jsonObj.get("maintenance").isJsonNull()) {
        UpdateDbaasServiceMysqlRequestMaintenance.validateJsonElement(jsonObj.get("maintenance"));
      }
      if ((jsonObj.get("admin-username") != null && !jsonObj.get("admin-username").isJsonNull()) && !jsonObj.get("admin-username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `admin-username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("admin-username").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if (!jsonObj.get("plan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan").toString()));
      }
      if ((jsonObj.get("admin-password") != null && !jsonObj.get("admin-password").isJsonNull()) && !jsonObj.get("admin-password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `admin-password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("admin-password").toString()));
      }
      // validate the optional field `migration`
      if (jsonObj.get("migration") != null && !jsonObj.get("migration").isJsonNull()) {
        UpdateDbaasServiceMysqlRequestMigration.validateJsonElement(jsonObj.get("migration"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateDbaasServiceMysqlRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateDbaasServiceMysqlRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateDbaasServiceMysqlRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateDbaasServiceMysqlRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateDbaasServiceMysqlRequest>() {
           @Override
           public void write(JsonWriter out, CreateDbaasServiceMysqlRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateDbaasServiceMysqlRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateDbaasServiceMysqlRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateDbaasServiceMysqlRequest
  * @throws IOException if the JSON string is invalid with respect to CreateDbaasServiceMysqlRequest
  */
  public static CreateDbaasServiceMysqlRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateDbaasServiceMysqlRequest.class);
  }

 /**
  * Convert an instance of CreateDbaasServiceMysqlRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
