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
import org.openapitools.client.model.DbaasIntegration;
import org.openapitools.client.model.DbaasNodeState;
import openapiclient.src.main.java.org.openapitools.client.model.DbaasServiceBackup;
import openapiclient.src.main.java.org.openapitools.client.model.DbaasServiceMaintenance;
import openapiclient.src.main.java.org.openapitools.client.model.DbaasServiceNotification;
import openapiclient.src.main.java.org.openapitools.client.model.DbaasServiceRedisComponentsInner;
import openapiclient.src.main.java.org.openapitools.client.model.DbaasServiceRedisConnectionInfo;
import openapiclient.src.main.java.org.openapitools.client.model.DbaasServiceRedisUsersInner;
import org.openapitools.client.model.EnumServiceState;
import org.openapitools.client.model.JsonSchemaRedis;

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
 * DbaasServiceRedis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class DbaasServiceRedis {
  public static final String SERIALIZED_NAME_UPDATED_AT = "updated-at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_NODE_COUNT = "node-count";
  @SerializedName(SERIALIZED_NAME_NODE_COUNT)
  private Long nodeCount;

  public static final String SERIALIZED_NAME_CONNECTION_INFO = "connection-info";
  @SerializedName(SERIALIZED_NAME_CONNECTION_INFO)
  private DbaasServiceRedisConnectionInfo connectionInfo;

  public static final String SERIALIZED_NAME_NODE_CPU_COUNT = "node-cpu-count";
  @SerializedName(SERIALIZED_NAME_NODE_CPU_COUNT)
  private Long nodeCpuCount;

  public static final String SERIALIZED_NAME_INTEGRATIONS = "integrations";
  @SerializedName(SERIALIZED_NAME_INTEGRATIONS)
  private List<DbaasIntegration> integrations;

  public static final String SERIALIZED_NAME_ZONE = "zone";
  @SerializedName(SERIALIZED_NAME_ZONE)
  private String zone;

  public static final String SERIALIZED_NAME_NODE_STATES = "node-states";
  @SerializedName(SERIALIZED_NAME_NODE_STATES)
  private List<DbaasNodeState> nodeStates;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REDIS_SETTINGS = "redis-settings";
  @SerializedName(SERIALIZED_NAME_REDIS_SETTINGS)
  private JsonSchemaRedis redisSettings;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private EnumServiceState state;

  public static final String SERIALIZED_NAME_IP_FILTER = "ip-filter";
  @SerializedName(SERIALIZED_NAME_IP_FILTER)
  private List<String> ipFilter;

  public static final String SERIALIZED_NAME_BACKUPS = "backups";
  @SerializedName(SERIALIZED_NAME_BACKUPS)
  private List<DbaasServiceBackup> backups;

  public static final String SERIALIZED_NAME_TERMINATION_PROTECTION = "termination-protection";
  @SerializedName(SERIALIZED_NAME_TERMINATION_PROTECTION)
  private Boolean terminationProtection;

  public static final String SERIALIZED_NAME_NOTIFICATIONS = "notifications";
  @SerializedName(SERIALIZED_NAME_NOTIFICATIONS)
  private List<DbaasServiceNotification> notifications;

  public static final String SERIALIZED_NAME_COMPONENTS = "components";
  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  private List<DbaasServiceRedisComponentsInner> components;

  public static final String SERIALIZED_NAME_MAINTENANCE = "maintenance";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE)
  private DbaasServiceMaintenance maintenance;

  public static final String SERIALIZED_NAME_DISK_SIZE = "disk-size";
  @SerializedName(SERIALIZED_NAME_DISK_SIZE)
  private Long diskSize;

  public static final String SERIALIZED_NAME_NODE_MEMORY = "node-memory";
  @SerializedName(SERIALIZED_NAME_NODE_MEMORY)
  private Long nodeMemory;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_URI_PARAMS = "uri-params";
  @SerializedName(SERIALIZED_NAME_URI_PARAMS)
  private Object uriParams;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_CREATED_AT = "created-at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  private String plan;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<DbaasServiceRedisUsersInner> users;

  public DbaasServiceRedis() {
  }

  public DbaasServiceRedis updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Service last update timestamp (ISO 8601)
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public DbaasServiceRedis nodeCount(Long nodeCount) {
    
    this.nodeCount = nodeCount;
    return this;
  }

   /**
   * Number of service nodes in the active plan
   * minimum: 0
   * @return nodeCount
  **/
  @javax.annotation.Nullable
  public Long getNodeCount() {
    return nodeCount;
  }


  public void setNodeCount(Long nodeCount) {
    this.nodeCount = nodeCount;
  }


  public DbaasServiceRedis connectionInfo(DbaasServiceRedisConnectionInfo connectionInfo) {
    
    this.connectionInfo = connectionInfo;
    return this;
  }

   /**
   * Get connectionInfo
   * @return connectionInfo
  **/
  @javax.annotation.Nullable
  public DbaasServiceRedisConnectionInfo getConnectionInfo() {
    return connectionInfo;
  }


  public void setConnectionInfo(DbaasServiceRedisConnectionInfo connectionInfo) {
    this.connectionInfo = connectionInfo;
  }


  public DbaasServiceRedis nodeCpuCount(Long nodeCpuCount) {
    
    this.nodeCpuCount = nodeCpuCount;
    return this;
  }

   /**
   * Number of CPUs for each node
   * minimum: 0
   * @return nodeCpuCount
  **/
  @javax.annotation.Nullable
  public Long getNodeCpuCount() {
    return nodeCpuCount;
  }


  public void setNodeCpuCount(Long nodeCpuCount) {
    this.nodeCpuCount = nodeCpuCount;
  }


  public DbaasServiceRedis integrations(List<DbaasIntegration> integrations) {
    
    this.integrations = integrations;
    return this;
  }

  public DbaasServiceRedis addIntegrationsItem(DbaasIntegration integrationsItem) {
    if (this.integrations == null) {
      this.integrations = new ArrayList<>();
    }
    this.integrations.add(integrationsItem);
    return this;
  }

   /**
   * Service integrations
   * @return integrations
  **/
  @javax.annotation.Nullable
  public List<DbaasIntegration> getIntegrations() {
    return integrations;
  }


  public void setIntegrations(List<DbaasIntegration> integrations) {
    this.integrations = integrations;
  }


  public DbaasServiceRedis zone(String zone) {
    
    this.zone = zone;
    return this;
  }

   /**
   * The zone where the service is running
   * @return zone
  **/
  @javax.annotation.Nullable
  public String getZone() {
    return zone;
  }


  public void setZone(String zone) {
    this.zone = zone;
  }


  public DbaasServiceRedis nodeStates(List<DbaasNodeState> nodeStates) {
    
    this.nodeStates = nodeStates;
    return this;
  }

  public DbaasServiceRedis addNodeStatesItem(DbaasNodeState nodeStatesItem) {
    if (this.nodeStates == null) {
      this.nodeStates = new ArrayList<>();
    }
    this.nodeStates.add(nodeStatesItem);
    return this;
  }

   /**
   * State of individual service nodes
   * @return nodeStates
  **/
  @javax.annotation.Nullable
  public List<DbaasNodeState> getNodeStates() {
    return nodeStates;
  }


  public void setNodeStates(List<DbaasNodeState> nodeStates) {
    this.nodeStates = nodeStates;
  }


  public DbaasServiceRedis name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DbaasServiceRedis redisSettings(JsonSchemaRedis redisSettings) {
    
    this.redisSettings = redisSettings;
    return this;
  }

   /**
   * Get redisSettings
   * @return redisSettings
  **/
  @javax.annotation.Nullable
  public JsonSchemaRedis getRedisSettings() {
    return redisSettings;
  }


  public void setRedisSettings(JsonSchemaRedis redisSettings) {
    this.redisSettings = redisSettings;
  }


  public DbaasServiceRedis type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public DbaasServiceRedis state(EnumServiceState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  public EnumServiceState getState() {
    return state;
  }


  public void setState(EnumServiceState state) {
    this.state = state;
  }


  public DbaasServiceRedis ipFilter(List<String> ipFilter) {
    
    this.ipFilter = ipFilter;
    return this;
  }

  public DbaasServiceRedis addIpFilterItem(String ipFilterItem) {
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


  public DbaasServiceRedis backups(List<DbaasServiceBackup> backups) {
    
    this.backups = backups;
    return this;
  }

  public DbaasServiceRedis addBackupsItem(DbaasServiceBackup backupsItem) {
    if (this.backups == null) {
      this.backups = new ArrayList<>();
    }
    this.backups.add(backupsItem);
    return this;
  }

   /**
   * List of backups for the service
   * @return backups
  **/
  @javax.annotation.Nullable
  public List<DbaasServiceBackup> getBackups() {
    return backups;
  }


  public void setBackups(List<DbaasServiceBackup> backups) {
    this.backups = backups;
  }


  public DbaasServiceRedis terminationProtection(Boolean terminationProtection) {
    
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


  public DbaasServiceRedis notifications(List<DbaasServiceNotification> notifications) {
    
    this.notifications = notifications;
    return this;
  }

  public DbaasServiceRedis addNotificationsItem(DbaasServiceNotification notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Service notifications
   * @return notifications
  **/
  @javax.annotation.Nullable
  public List<DbaasServiceNotification> getNotifications() {
    return notifications;
  }


  public void setNotifications(List<DbaasServiceNotification> notifications) {
    this.notifications = notifications;
  }


  public DbaasServiceRedis components(List<DbaasServiceRedisComponentsInner> components) {
    
    this.components = components;
    return this;
  }

  public DbaasServiceRedis addComponentsItem(DbaasServiceRedisComponentsInner componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

   /**
   * Service component information objects
   * @return components
  **/
  @javax.annotation.Nullable
  public List<DbaasServiceRedisComponentsInner> getComponents() {
    return components;
  }


  public void setComponents(List<DbaasServiceRedisComponentsInner> components) {
    this.components = components;
  }


  public DbaasServiceRedis maintenance(DbaasServiceMaintenance maintenance) {
    
    this.maintenance = maintenance;
    return this;
  }

   /**
   * Get maintenance
   * @return maintenance
  **/
  @javax.annotation.Nullable
  public DbaasServiceMaintenance getMaintenance() {
    return maintenance;
  }


  public void setMaintenance(DbaasServiceMaintenance maintenance) {
    this.maintenance = maintenance;
  }


  public DbaasServiceRedis diskSize(Long diskSize) {
    
    this.diskSize = diskSize;
    return this;
  }

   /**
   * TODO UNIT disk space for data storage
   * minimum: 0
   * @return diskSize
  **/
  @javax.annotation.Nullable
  public Long getDiskSize() {
    return diskSize;
  }


  public void setDiskSize(Long diskSize) {
    this.diskSize = diskSize;
  }


  public DbaasServiceRedis nodeMemory(Long nodeMemory) {
    
    this.nodeMemory = nodeMemory;
    return this;
  }

   /**
   * TODO UNIT of memory for each node
   * minimum: 0
   * @return nodeMemory
  **/
  @javax.annotation.Nullable
  public Long getNodeMemory() {
    return nodeMemory;
  }


  public void setNodeMemory(Long nodeMemory) {
    this.nodeMemory = nodeMemory;
  }


  public DbaasServiceRedis uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * URI for connecting to the service (may be absent)
   * @return uri
  **/
  @javax.annotation.Nullable
  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public DbaasServiceRedis uriParams(Object uriParams) {
    
    this.uriParams = uriParams;
    return this;
  }

   /**
   * service_uri parameterized into key-value pairs
   * @return uriParams
  **/
  @javax.annotation.Nullable
  public Object getUriParams() {
    return uriParams;
  }


  public void setUriParams(Object uriParams) {
    this.uriParams = uriParams;
  }


  public DbaasServiceRedis version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Redis version
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public DbaasServiceRedis createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Service creation timestamp (ISO 8601)
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public DbaasServiceRedis plan(String plan) {
    
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


  public DbaasServiceRedis users(List<DbaasServiceRedisUsersInner> users) {
    
    this.users = users;
    return this;
  }

  public DbaasServiceRedis addUsersItem(DbaasServiceRedisUsersInner usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * List of service users
   * @return users
  **/
  @javax.annotation.Nullable
  public List<DbaasServiceRedisUsersInner> getUsers() {
    return users;
  }


  public void setUsers(List<DbaasServiceRedisUsersInner> users) {
    this.users = users;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbaasServiceRedis dbaasServiceRedis = (DbaasServiceRedis) o;
    return Objects.equals(this.updatedAt, dbaasServiceRedis.updatedAt) &&
        Objects.equals(this.nodeCount, dbaasServiceRedis.nodeCount) &&
        Objects.equals(this.connectionInfo, dbaasServiceRedis.connectionInfo) &&
        Objects.equals(this.nodeCpuCount, dbaasServiceRedis.nodeCpuCount) &&
        Objects.equals(this.integrations, dbaasServiceRedis.integrations) &&
        Objects.equals(this.zone, dbaasServiceRedis.zone) &&
        Objects.equals(this.nodeStates, dbaasServiceRedis.nodeStates) &&
        Objects.equals(this.name, dbaasServiceRedis.name) &&
        Objects.equals(this.redisSettings, dbaasServiceRedis.redisSettings) &&
        Objects.equals(this.type, dbaasServiceRedis.type) &&
        Objects.equals(this.state, dbaasServiceRedis.state) &&
        Objects.equals(this.ipFilter, dbaasServiceRedis.ipFilter) &&
        Objects.equals(this.backups, dbaasServiceRedis.backups) &&
        Objects.equals(this.terminationProtection, dbaasServiceRedis.terminationProtection) &&
        Objects.equals(this.notifications, dbaasServiceRedis.notifications) &&
        Objects.equals(this.components, dbaasServiceRedis.components) &&
        Objects.equals(this.maintenance, dbaasServiceRedis.maintenance) &&
        Objects.equals(this.diskSize, dbaasServiceRedis.diskSize) &&
        Objects.equals(this.nodeMemory, dbaasServiceRedis.nodeMemory) &&
        Objects.equals(this.uri, dbaasServiceRedis.uri) &&
        Objects.equals(this.uriParams, dbaasServiceRedis.uriParams) &&
        Objects.equals(this.version, dbaasServiceRedis.version) &&
        Objects.equals(this.createdAt, dbaasServiceRedis.createdAt) &&
        Objects.equals(this.plan, dbaasServiceRedis.plan) &&
        Objects.equals(this.users, dbaasServiceRedis.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatedAt, nodeCount, connectionInfo, nodeCpuCount, integrations, zone, nodeStates, name, redisSettings, type, state, ipFilter, backups, terminationProtection, notifications, components, maintenance, diskSize, nodeMemory, uri, uriParams, version, createdAt, plan, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbaasServiceRedis {\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
    sb.append("    connectionInfo: ").append(toIndentedString(connectionInfo)).append("\n");
    sb.append("    nodeCpuCount: ").append(toIndentedString(nodeCpuCount)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
    sb.append("    nodeStates: ").append(toIndentedString(nodeStates)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    redisSettings: ").append(toIndentedString(redisSettings)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    ipFilter: ").append(toIndentedString(ipFilter)).append("\n");
    sb.append("    backups: ").append(toIndentedString(backups)).append("\n");
    sb.append("    terminationProtection: ").append(toIndentedString(terminationProtection)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    maintenance: ").append(toIndentedString(maintenance)).append("\n");
    sb.append("    diskSize: ").append(toIndentedString(diskSize)).append("\n");
    sb.append("    nodeMemory: ").append(toIndentedString(nodeMemory)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    uriParams: ").append(toIndentedString(uriParams)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
    openapiFields.add("updated-at");
    openapiFields.add("node-count");
    openapiFields.add("connection-info");
    openapiFields.add("node-cpu-count");
    openapiFields.add("integrations");
    openapiFields.add("zone");
    openapiFields.add("node-states");
    openapiFields.add("name");
    openapiFields.add("redis-settings");
    openapiFields.add("type");
    openapiFields.add("state");
    openapiFields.add("ip-filter");
    openapiFields.add("backups");
    openapiFields.add("termination-protection");
    openapiFields.add("notifications");
    openapiFields.add("components");
    openapiFields.add("maintenance");
    openapiFields.add("disk-size");
    openapiFields.add("node-memory");
    openapiFields.add("uri");
    openapiFields.add("uri-params");
    openapiFields.add("version");
    openapiFields.add("created-at");
    openapiFields.add("plan");
    openapiFields.add("users");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("plan");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DbaasServiceRedis
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DbaasServiceRedis.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DbaasServiceRedis is not found in the empty JSON string", DbaasServiceRedis.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DbaasServiceRedis.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DbaasServiceRedis` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DbaasServiceRedis.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `connection-info`
      if (jsonObj.get("connection-info") != null && !jsonObj.get("connection-info").isJsonNull()) {
        DbaasServiceRedisConnectionInfo.validateJsonElement(jsonObj.get("connection-info"));
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
            DbaasIntegration.validateJsonElement(jsonArrayintegrations.get(i));
          };
        }
      }
      if ((jsonObj.get("zone") != null && !jsonObj.get("zone").isJsonNull()) && !jsonObj.get("zone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zone").toString()));
      }
      if (jsonObj.get("node-states") != null && !jsonObj.get("node-states").isJsonNull()) {
        JsonArray jsonArraynodeStates = jsonObj.getAsJsonArray("node-states");
        if (jsonArraynodeStates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("node-states").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `node-states` to be an array in the JSON string but got `%s`", jsonObj.get("node-states").toString()));
          }

          // validate the optional field `node-states` (array)
          for (int i = 0; i < jsonArraynodeStates.size(); i++) {
            DbaasNodeState.validateJsonElement(jsonArraynodeStates.get(i));
          };
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `redis-settings`
      if (jsonObj.get("redis-settings") != null && !jsonObj.get("redis-settings").isJsonNull()) {
        JsonSchemaRedis.validateJsonElement(jsonObj.get("redis-settings"));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ip-filter") != null && !jsonObj.get("ip-filter").isJsonNull() && !jsonObj.get("ip-filter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip-filter` to be an array in the JSON string but got `%s`", jsonObj.get("ip-filter").toString()));
      }
      if (jsonObj.get("backups") != null && !jsonObj.get("backups").isJsonNull()) {
        JsonArray jsonArraybackups = jsonObj.getAsJsonArray("backups");
        if (jsonArraybackups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("backups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `backups` to be an array in the JSON string but got `%s`", jsonObj.get("backups").toString()));
          }

          // validate the optional field `backups` (array)
          for (int i = 0; i < jsonArraybackups.size(); i++) {
            DbaasServiceBackup.validateJsonElement(jsonArraybackups.get(i));
          };
        }
      }
      if (jsonObj.get("notifications") != null && !jsonObj.get("notifications").isJsonNull()) {
        JsonArray jsonArraynotifications = jsonObj.getAsJsonArray("notifications");
        if (jsonArraynotifications != null) {
          // ensure the json data is an array
          if (!jsonObj.get("notifications").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `notifications` to be an array in the JSON string but got `%s`", jsonObj.get("notifications").toString()));
          }

          // validate the optional field `notifications` (array)
          for (int i = 0; i < jsonArraynotifications.size(); i++) {
            DbaasServiceNotification.validateJsonElement(jsonArraynotifications.get(i));
          };
        }
      }
      if (jsonObj.get("components") != null && !jsonObj.get("components").isJsonNull()) {
        JsonArray jsonArraycomponents = jsonObj.getAsJsonArray("components");
        if (jsonArraycomponents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("components").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `components` to be an array in the JSON string but got `%s`", jsonObj.get("components").toString()));
          }

          // validate the optional field `components` (array)
          for (int i = 0; i < jsonArraycomponents.size(); i++) {
            DbaasServiceRedisComponentsInner.validateJsonElement(jsonArraycomponents.get(i));
          };
        }
      }
      // validate the optional field `maintenance`
      if (jsonObj.get("maintenance") != null && !jsonObj.get("maintenance").isJsonNull()) {
        DbaasServiceMaintenance.validateJsonElement(jsonObj.get("maintenance"));
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if (!jsonObj.get("plan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan").toString()));
      }
      if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonNull()) {
        JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
        if (jsonArrayusers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("users").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
          }

          // validate the optional field `users` (array)
          for (int i = 0; i < jsonArrayusers.size(); i++) {
            DbaasServiceRedisUsersInner.validateJsonElement(jsonArrayusers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DbaasServiceRedis.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DbaasServiceRedis' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DbaasServiceRedis> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DbaasServiceRedis.class));

       return (TypeAdapter<T>) new TypeAdapter<DbaasServiceRedis>() {
           @Override
           public void write(JsonWriter out, DbaasServiceRedis value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DbaasServiceRedis read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DbaasServiceRedis given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DbaasServiceRedis
  * @throws IOException if the JSON string is invalid with respect to DbaasServiceRedis
  */
  public static DbaasServiceRedis fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DbaasServiceRedis.class);
  }

 /**
  * Convert an instance of DbaasServiceRedis to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

