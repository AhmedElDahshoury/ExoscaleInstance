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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import openapiclient.src.main.java.org.openapitools.client.model.AntiAffinityGroup;
import org.openapitools.client.model.DeployTarget;
import org.openapitools.client.model.ElasticIp;
import org.openapitools.client.model.Instance;
import openapiclient.src.main.java.org.openapitools.client.model.InstanceType;
import org.openapitools.client.model.Manager;
import openapiclient.src.main.java.org.openapitools.client.model.PrivateNetwork;
import openapiclient.src.main.java.org.openapitools.client.model.PublicIpAssignment;
import openapiclient.src.main.java.org.openapitools.client.model.SecurityGroup;
import org.openapitools.client.model.SshKey;
import org.openapitools.client.model.Template;

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
 * Instance Pool
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class InstancePool {
  public static final String SERIALIZED_NAME_ANTI_AFFINITY_GROUPS = "anti-affinity-groups";
  @SerializedName(SERIALIZED_NAME_ANTI_AFFINITY_GROUPS)
  private List<AntiAffinityGroup> antiAffinityGroups;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PUBLIC_IP_ASSIGNMENT = "public-ip-assignment";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP_ASSIGNMENT)
  private PublicIpAssignment publicIpAssignment;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_SECURITY_GROUPS = "security-groups";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS)
  private List<SecurityGroup> securityGroups;

  public static final String SERIALIZED_NAME_ELASTIC_IPS = "elastic-ips";
  @SerializedName(SERIALIZED_NAME_ELASTIC_IPS)
  private List<ElasticIp> elasticIps;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INSTANCE_TYPE = "instance-type";
  @SerializedName(SERIALIZED_NAME_INSTANCE_TYPE)
  private InstanceType instanceType;

  public static final String SERIALIZED_NAME_MIN_AVAILABLE = "min-available";
  @SerializedName(SERIALIZED_NAME_MIN_AVAILABLE)
  private Long minAvailable;

  public static final String SERIALIZED_NAME_PRIVATE_NETWORKS = "private-networks";
  @SerializedName(SERIALIZED_NAME_PRIVATE_NETWORKS)
  private List<PrivateNetwork> privateNetworks;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private Template template;

  /**
   * Instance Pool state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    SCALING_UP("scaling-up"),
    
    SCALING_DOWN("scaling-down"),
    
    DESTROYING("destroying"),
    
    CREATING("creating"),
    
    SUSPENDED("suspended"),
    
    RUNNING("running"),
    
    UPDATING("updating");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_SSH_KEY = "ssh-key";
  @SerializedName(SERIALIZED_NAME_SSH_KEY)
  private SshKey sshKey;

  public static final String SERIALIZED_NAME_INSTANCE_PREFIX = "instance-prefix";
  @SerializedName(SERIALIZED_NAME_INSTANCE_PREFIX)
  private String instancePrefix;

  public static final String SERIALIZED_NAME_USER_DATA = "user-data";
  @SerializedName(SERIALIZED_NAME_USER_DATA)
  private String userData;

  public static final String SERIALIZED_NAME_MANAGER = "manager";
  @SerializedName(SERIALIZED_NAME_MANAGER)
  private Manager manager;

  public static final String SERIALIZED_NAME_INSTANCES = "instances";
  @SerializedName(SERIALIZED_NAME_INSTANCES)
  private List<Instance> instances;

  public static final String SERIALIZED_NAME_DEPLOY_TARGET = "deploy-target";
  @SerializedName(SERIALIZED_NAME_DEPLOY_TARGET)
  private DeployTarget deployTarget;

  public static final String SERIALIZED_NAME_IPV6_ENABLED = "ipv6-enabled";
  @SerializedName(SERIALIZED_NAME_IPV6_ENABLED)
  private Boolean ipv6Enabled;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_DISK_SIZE = "disk-size";
  @SerializedName(SERIALIZED_NAME_DISK_SIZE)
  private Long diskSize;

  public static final String SERIALIZED_NAME_SSH_KEYS = "ssh-keys";
  @SerializedName(SERIALIZED_NAME_SSH_KEYS)
  private List<SshKey> sshKeys;

  public InstancePool() {
  }

  
  public InstancePool(
     StateEnum state, 
     List<Instance> instances, 
     UUID id
  ) {
    this();
    this.state = state;
    this.instances = instances;
    this.id = id;
  }

  public InstancePool antiAffinityGroups(List<AntiAffinityGroup> antiAffinityGroups) {
    
    this.antiAffinityGroups = antiAffinityGroups;
    return this;
  }

  public InstancePool addAntiAffinityGroupsItem(AntiAffinityGroup antiAffinityGroupsItem) {
    if (this.antiAffinityGroups == null) {
      this.antiAffinityGroups = new ArrayList<>();
    }
    this.antiAffinityGroups.add(antiAffinityGroupsItem);
    return this;
  }

   /**
   * Instance Pool Anti-affinity Groups
   * @return antiAffinityGroups
  **/
  @javax.annotation.Nullable
  public List<AntiAffinityGroup> getAntiAffinityGroups() {
    return antiAffinityGroups;
  }


  public void setAntiAffinityGroups(List<AntiAffinityGroup> antiAffinityGroups) {
    this.antiAffinityGroups = antiAffinityGroups;
  }


  public InstancePool description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Instance Pool description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public InstancePool publicIpAssignment(PublicIpAssignment publicIpAssignment) {
    
    this.publicIpAssignment = publicIpAssignment;
    return this;
  }

   /**
   * Get publicIpAssignment
   * @return publicIpAssignment
  **/
  @javax.annotation.Nullable
  public PublicIpAssignment getPublicIpAssignment() {
    return publicIpAssignment;
  }


  public void setPublicIpAssignment(PublicIpAssignment publicIpAssignment) {
    this.publicIpAssignment = publicIpAssignment;
  }


  public InstancePool labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public InstancePool putLabelsItem(String key, String labelsItem) {
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


  public InstancePool securityGroups(List<SecurityGroup> securityGroups) {
    
    this.securityGroups = securityGroups;
    return this;
  }

  public InstancePool addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
    if (this.securityGroups == null) {
      this.securityGroups = new ArrayList<>();
    }
    this.securityGroups.add(securityGroupsItem);
    return this;
  }

   /**
   * Instance Pool Security Groups
   * @return securityGroups
  **/
  @javax.annotation.Nullable
  public List<SecurityGroup> getSecurityGroups() {
    return securityGroups;
  }


  public void setSecurityGroups(List<SecurityGroup> securityGroups) {
    this.securityGroups = securityGroups;
  }


  public InstancePool elasticIps(List<ElasticIp> elasticIps) {
    
    this.elasticIps = elasticIps;
    return this;
  }

  public InstancePool addElasticIpsItem(ElasticIp elasticIpsItem) {
    if (this.elasticIps == null) {
      this.elasticIps = new ArrayList<>();
    }
    this.elasticIps.add(elasticIpsItem);
    return this;
  }

   /**
   * Instances Elastic IPs
   * @return elasticIps
  **/
  @javax.annotation.Nullable
  public List<ElasticIp> getElasticIps() {
    return elasticIps;
  }


  public void setElasticIps(List<ElasticIp> elasticIps) {
    this.elasticIps = elasticIps;
  }


  public InstancePool name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Instance Pool name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InstancePool instanceType(InstanceType instanceType) {
    
    this.instanceType = instanceType;
    return this;
  }

   /**
   * Get instanceType
   * @return instanceType
  **/
  @javax.annotation.Nullable
  public InstanceType getInstanceType() {
    return instanceType;
  }


  public void setInstanceType(InstanceType instanceType) {
    this.instanceType = instanceType;
  }


  public InstancePool minAvailable(Long minAvailable) {
    
    this.minAvailable = minAvailable;
    return this;
  }

   /**
   * Minimum number of running instances
   * minimum: 0
   * @return minAvailable
  **/
  @javax.annotation.Nullable
  public Long getMinAvailable() {
    return minAvailable;
  }


  public void setMinAvailable(Long minAvailable) {
    this.minAvailable = minAvailable;
  }


  public InstancePool privateNetworks(List<PrivateNetwork> privateNetworks) {
    
    this.privateNetworks = privateNetworks;
    return this;
  }

  public InstancePool addPrivateNetworksItem(PrivateNetwork privateNetworksItem) {
    if (this.privateNetworks == null) {
      this.privateNetworks = new ArrayList<>();
    }
    this.privateNetworks.add(privateNetworksItem);
    return this;
  }

   /**
   * Instance Pool Private Networks
   * @return privateNetworks
  **/
  @javax.annotation.Nullable
  public List<PrivateNetwork> getPrivateNetworks() {
    return privateNetworks;
  }


  public void setPrivateNetworks(List<PrivateNetwork> privateNetworks) {
    this.privateNetworks = privateNetworks;
  }


  public InstancePool template(Template template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  public Template getTemplate() {
    return template;
  }


  public void setTemplate(Template template) {
    this.template = template;
  }


   /**
   * Instance Pool state
   * @return state
  **/
  @javax.annotation.Nullable
  public StateEnum getState() {
    return state;
  }




  public InstancePool size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Number of instances
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


  public InstancePool sshKey(SshKey sshKey) {
    
    this.sshKey = sshKey;
    return this;
  }

   /**
   * Get sshKey
   * @return sshKey
  **/
  @javax.annotation.Nullable
  public SshKey getSshKey() {
    return sshKey;
  }


  public void setSshKey(SshKey sshKey) {
    this.sshKey = sshKey;
  }


  public InstancePool instancePrefix(String instancePrefix) {
    
    this.instancePrefix = instancePrefix;
    return this;
  }

   /**
   * The instances created by the Instance Pool will be prefixed with this value (default: pool)
   * @return instancePrefix
  **/
  @javax.annotation.Nullable
  public String getInstancePrefix() {
    return instancePrefix;
  }


  public void setInstancePrefix(String instancePrefix) {
    this.instancePrefix = instancePrefix;
  }


  public InstancePool userData(String userData) {
    
    this.userData = userData;
    return this;
  }

   /**
   * Instances Cloud-init user-data
   * @return userData
  **/
  @javax.annotation.Nullable
  public String getUserData() {
    return userData;
  }


  public void setUserData(String userData) {
    this.userData = userData;
  }


  public InstancePool manager(Manager manager) {
    
    this.manager = manager;
    return this;
  }

   /**
   * Get manager
   * @return manager
  **/
  @javax.annotation.Nullable
  public Manager getManager() {
    return manager;
  }


  public void setManager(Manager manager) {
    this.manager = manager;
  }


   /**
   * Instances
   * @return instances
  **/
  @javax.annotation.Nullable
  public List<Instance> getInstances() {
    return instances;
  }




  public InstancePool deployTarget(DeployTarget deployTarget) {
    
    this.deployTarget = deployTarget;
    return this;
  }

   /**
   * Get deployTarget
   * @return deployTarget
  **/
  @javax.annotation.Nullable
  public DeployTarget getDeployTarget() {
    return deployTarget;
  }


  public void setDeployTarget(DeployTarget deployTarget) {
    this.deployTarget = deployTarget;
  }


  public InstancePool ipv6Enabled(Boolean ipv6Enabled) {
    
    this.ipv6Enabled = ipv6Enabled;
    return this;
  }

   /**
   * Enable IPv6 for instances
   * @return ipv6Enabled
  **/
  @javax.annotation.Nullable
  public Boolean getIpv6Enabled() {
    return ipv6Enabled;
  }


  public void setIpv6Enabled(Boolean ipv6Enabled) {
    this.ipv6Enabled = ipv6Enabled;
  }


   /**
   * Instance Pool ID
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }




  public InstancePool diskSize(Long diskSize) {
    
    this.diskSize = diskSize;
    return this;
  }

   /**
   * Instances disk size in GB
   * minimum: 10
   * maximum: 50000
   * @return diskSize
  **/
  @javax.annotation.Nullable
  public Long getDiskSize() {
    return diskSize;
  }


  public void setDiskSize(Long diskSize) {
    this.diskSize = diskSize;
  }


  public InstancePool sshKeys(List<SshKey> sshKeys) {
    
    this.sshKeys = sshKeys;
    return this;
  }

  public InstancePool addSshKeysItem(SshKey sshKeysItem) {
    if (this.sshKeys == null) {
      this.sshKeys = new ArrayList<>();
    }
    this.sshKeys.add(sshKeysItem);
    return this;
  }

   /**
   * Instances SSH keys
   * @return sshKeys
  **/
  @javax.annotation.Nullable
  public List<SshKey> getSshKeys() {
    return sshKeys;
  }


  public void setSshKeys(List<SshKey> sshKeys) {
    this.sshKeys = sshKeys;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstancePool instancePool = (InstancePool) o;
    return Objects.equals(this.antiAffinityGroups, instancePool.antiAffinityGroups) &&
        Objects.equals(this.description, instancePool.description) &&
        Objects.equals(this.publicIpAssignment, instancePool.publicIpAssignment) &&
        Objects.equals(this.labels, instancePool.labels) &&
        Objects.equals(this.securityGroups, instancePool.securityGroups) &&
        Objects.equals(this.elasticIps, instancePool.elasticIps) &&
        Objects.equals(this.name, instancePool.name) &&
        Objects.equals(this.instanceType, instancePool.instanceType) &&
        Objects.equals(this.minAvailable, instancePool.minAvailable) &&
        Objects.equals(this.privateNetworks, instancePool.privateNetworks) &&
        Objects.equals(this.template, instancePool.template) &&
        Objects.equals(this.state, instancePool.state) &&
        Objects.equals(this.size, instancePool.size) &&
        Objects.equals(this.sshKey, instancePool.sshKey) &&
        Objects.equals(this.instancePrefix, instancePool.instancePrefix) &&
        Objects.equals(this.userData, instancePool.userData) &&
        Objects.equals(this.manager, instancePool.manager) &&
        Objects.equals(this.instances, instancePool.instances) &&
        Objects.equals(this.deployTarget, instancePool.deployTarget) &&
        Objects.equals(this.ipv6Enabled, instancePool.ipv6Enabled) &&
        Objects.equals(this.id, instancePool.id) &&
        Objects.equals(this.diskSize, instancePool.diskSize) &&
        Objects.equals(this.sshKeys, instancePool.sshKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antiAffinityGroups, description, publicIpAssignment, labels, securityGroups, elasticIps, name, instanceType, minAvailable, privateNetworks, template, state, size, sshKey, instancePrefix, userData, manager, instances, deployTarget, ipv6Enabled, id, diskSize, sshKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstancePool {\n");
    sb.append("    antiAffinityGroups: ").append(toIndentedString(antiAffinityGroups)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    publicIpAssignment: ").append(toIndentedString(publicIpAssignment)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    elasticIps: ").append(toIndentedString(elasticIps)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    minAvailable: ").append(toIndentedString(minAvailable)).append("\n");
    sb.append("    privateNetworks: ").append(toIndentedString(privateNetworks)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sshKey: ").append(toIndentedString(sshKey)).append("\n");
    sb.append("    instancePrefix: ").append(toIndentedString(instancePrefix)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    deployTarget: ").append(toIndentedString(deployTarget)).append("\n");
    sb.append("    ipv6Enabled: ").append(toIndentedString(ipv6Enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    diskSize: ").append(toIndentedString(diskSize)).append("\n");
    sb.append("    sshKeys: ").append(toIndentedString(sshKeys)).append("\n");
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
    openapiFields.add("anti-affinity-groups");
    openapiFields.add("description");
    openapiFields.add("public-ip-assignment");
    openapiFields.add("labels");
    openapiFields.add("security-groups");
    openapiFields.add("elastic-ips");
    openapiFields.add("name");
    openapiFields.add("instance-type");
    openapiFields.add("min-available");
    openapiFields.add("private-networks");
    openapiFields.add("template");
    openapiFields.add("state");
    openapiFields.add("size");
    openapiFields.add("ssh-key");
    openapiFields.add("instance-prefix");
    openapiFields.add("user-data");
    openapiFields.add("manager");
    openapiFields.add("instances");
    openapiFields.add("deploy-target");
    openapiFields.add("ipv6-enabled");
    openapiFields.add("id");
    openapiFields.add("disk-size");
    openapiFields.add("ssh-keys");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InstancePool
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InstancePool.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstancePool is not found in the empty JSON string", InstancePool.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InstancePool.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstancePool` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("anti-affinity-groups") != null && !jsonObj.get("anti-affinity-groups").isJsonNull()) {
        JsonArray jsonArrayantiAffinityGroups = jsonObj.getAsJsonArray("anti-affinity-groups");
        if (jsonArrayantiAffinityGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("anti-affinity-groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `anti-affinity-groups` to be an array in the JSON string but got `%s`", jsonObj.get("anti-affinity-groups").toString()));
          }

          // validate the optional field `anti-affinity-groups` (array)
          for (int i = 0; i < jsonArrayantiAffinityGroups.size(); i++) {
            AntiAffinityGroup.validateJsonElement(jsonArrayantiAffinityGroups.get(i));
          };
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("security-groups") != null && !jsonObj.get("security-groups").isJsonNull()) {
        JsonArray jsonArraysecurityGroups = jsonObj.getAsJsonArray("security-groups");
        if (jsonArraysecurityGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("security-groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `security-groups` to be an array in the JSON string but got `%s`", jsonObj.get("security-groups").toString()));
          }

          // validate the optional field `security-groups` (array)
          for (int i = 0; i < jsonArraysecurityGroups.size(); i++) {
            SecurityGroup.validateJsonElement(jsonArraysecurityGroups.get(i));
          };
        }
      }
      if (jsonObj.get("elastic-ips") != null && !jsonObj.get("elastic-ips").isJsonNull()) {
        JsonArray jsonArrayelasticIps = jsonObj.getAsJsonArray("elastic-ips");
        if (jsonArrayelasticIps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("elastic-ips").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `elastic-ips` to be an array in the JSON string but got `%s`", jsonObj.get("elastic-ips").toString()));
          }

          // validate the optional field `elastic-ips` (array)
          for (int i = 0; i < jsonArrayelasticIps.size(); i++) {
            ElasticIp.validateJsonElement(jsonArrayelasticIps.get(i));
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `instance-type`
      if (jsonObj.get("instance-type") != null && !jsonObj.get("instance-type").isJsonNull()) {
        InstanceType.validateJsonElement(jsonObj.get("instance-type"));
      }
      if (jsonObj.get("private-networks") != null && !jsonObj.get("private-networks").isJsonNull()) {
        JsonArray jsonArrayprivateNetworks = jsonObj.getAsJsonArray("private-networks");
        if (jsonArrayprivateNetworks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("private-networks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `private-networks` to be an array in the JSON string but got `%s`", jsonObj.get("private-networks").toString()));
          }

          // validate the optional field `private-networks` (array)
          for (int i = 0; i < jsonArrayprivateNetworks.size(); i++) {
            PrivateNetwork.validateJsonElement(jsonArrayprivateNetworks.get(i));
          };
        }
      }
      // validate the optional field `template`
      if (jsonObj.get("template") != null && !jsonObj.get("template").isJsonNull()) {
        Template.validateJsonElement(jsonObj.get("template"));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `ssh-key`
      if (jsonObj.get("ssh-key") != null && !jsonObj.get("ssh-key").isJsonNull()) {
        SshKey.validateJsonElement(jsonObj.get("ssh-key"));
      }
      if ((jsonObj.get("instance-prefix") != null && !jsonObj.get("instance-prefix").isJsonNull()) && !jsonObj.get("instance-prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instance-prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instance-prefix").toString()));
      }
      if ((jsonObj.get("user-data") != null && !jsonObj.get("user-data").isJsonNull()) && !jsonObj.get("user-data").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user-data` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user-data").toString()));
      }
      // validate the optional field `manager`
      if (jsonObj.get("manager") != null && !jsonObj.get("manager").isJsonNull()) {
        Manager.validateJsonElement(jsonObj.get("manager"));
      }
      if (jsonObj.get("instances") != null && !jsonObj.get("instances").isJsonNull()) {
        JsonArray jsonArrayinstances = jsonObj.getAsJsonArray("instances");
        if (jsonArrayinstances != null) {
          // ensure the json data is an array
          if (!jsonObj.get("instances").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `instances` to be an array in the JSON string but got `%s`", jsonObj.get("instances").toString()));
          }

          // validate the optional field `instances` (array)
          for (int i = 0; i < jsonArrayinstances.size(); i++) {
            Instance.validateJsonElement(jsonArrayinstances.get(i));
          };
        }
      }
      // validate the optional field `deploy-target`
      if (jsonObj.get("deploy-target") != null && !jsonObj.get("deploy-target").isJsonNull()) {
        DeployTarget.validateJsonElement(jsonObj.get("deploy-target"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("ssh-keys") != null && !jsonObj.get("ssh-keys").isJsonNull()) {
        JsonArray jsonArraysshKeys = jsonObj.getAsJsonArray("ssh-keys");
        if (jsonArraysshKeys != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ssh-keys").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ssh-keys` to be an array in the JSON string but got `%s`", jsonObj.get("ssh-keys").toString()));
          }

          // validate the optional field `ssh-keys` (array)
          for (int i = 0; i < jsonArraysshKeys.size(); i++) {
            SshKey.validateJsonElement(jsonArraysshKeys.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstancePool.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstancePool' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstancePool> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstancePool.class));

       return (TypeAdapter<T>) new TypeAdapter<InstancePool>() {
           @Override
           public void write(JsonWriter out, InstancePool value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstancePool read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstancePool given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstancePool
  * @throws IOException if the JSON string is invalid with respect to InstancePool
  */
  public static InstancePool fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstancePool.class);
  }

 /**
  * Convert an instance of InstancePool to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
