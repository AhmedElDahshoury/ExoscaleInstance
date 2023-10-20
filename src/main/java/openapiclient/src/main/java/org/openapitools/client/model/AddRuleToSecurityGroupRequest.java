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
import openapiclient.src.main.java.org.openapitools.client.model.AddRuleToSecurityGroupRequestIcmp;
import org.openapitools.client.model.SecurityGroupResource;

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
 * AddRuleToSecurityGroupRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-20T18:49:30.768335Z[Etc/UTC]")
public class AddRuleToSecurityGroupRequest {
  /**
   * Network flow direction to match
   */
  @JsonAdapter(FlowDirectionEnum.Adapter.class)
  public enum FlowDirectionEnum {
    INGRESS("ingress"),
    
    EGRESS("egress");

    private String value;

    FlowDirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FlowDirectionEnum fromValue(String value) {
      for (FlowDirectionEnum b : FlowDirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FlowDirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FlowDirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FlowDirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FlowDirectionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FLOW_DIRECTION = "flow-direction";
  @SerializedName(SERIALIZED_NAME_FLOW_DIRECTION)
  private FlowDirectionEnum flowDirection;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_SECURITY_GROUP = "security-group";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP)
  private SecurityGroupResource securityGroup;

  /**
   * Network protocol
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    TCP("tcp"),
    
    ESP("esp"),
    
    ICMP("icmp"),
    
    UDP("udp"),
    
    GRE("gre"),
    
    AH("ah"),
    
    IPIP("ipip"),
    
    ICMPV6("icmpv6");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProtocolEnum fromValue(String value) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProtocolEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private ProtocolEnum protocol;

  public static final String SERIALIZED_NAME_ICMP = "icmp";
  @SerializedName(SERIALIZED_NAME_ICMP)
  private AddRuleToSecurityGroupRequestIcmp icmp;

  public static final String SERIALIZED_NAME_START_PORT = "start-port";
  @SerializedName(SERIALIZED_NAME_START_PORT)
  private Long startPort;

  public static final String SERIALIZED_NAME_END_PORT = "end-port";
  @SerializedName(SERIALIZED_NAME_END_PORT)
  private Long endPort;

  public AddRuleToSecurityGroupRequest() {
  }

  public AddRuleToSecurityGroupRequest flowDirection(FlowDirectionEnum flowDirection) {
    
    this.flowDirection = flowDirection;
    return this;
  }

   /**
   * Network flow direction to match
   * @return flowDirection
  **/
  @javax.annotation.Nonnull
  public FlowDirectionEnum getFlowDirection() {
    return flowDirection;
  }


  public void setFlowDirection(FlowDirectionEnum flowDirection) {
    this.flowDirection = flowDirection;
  }


  public AddRuleToSecurityGroupRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Security Group rule description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AddRuleToSecurityGroupRequest network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * CIDR-formatted network allowed
   * @return network
  **/
  @javax.annotation.Nullable
  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public AddRuleToSecurityGroupRequest securityGroup(SecurityGroupResource securityGroup) {
    
    this.securityGroup = securityGroup;
    return this;
  }

   /**
   * Get securityGroup
   * @return securityGroup
  **/
  @javax.annotation.Nullable
  public SecurityGroupResource getSecurityGroup() {
    return securityGroup;
  }


  public void setSecurityGroup(SecurityGroupResource securityGroup) {
    this.securityGroup = securityGroup;
  }


  public AddRuleToSecurityGroupRequest protocol(ProtocolEnum protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Network protocol
   * @return protocol
  **/
  @javax.annotation.Nonnull
  public ProtocolEnum getProtocol() {
    return protocol;
  }


  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }


  public AddRuleToSecurityGroupRequest icmp(AddRuleToSecurityGroupRequestIcmp icmp) {
    
    this.icmp = icmp;
    return this;
  }

   /**
   * Get icmp
   * @return icmp
  **/
  @javax.annotation.Nullable
  public AddRuleToSecurityGroupRequestIcmp getIcmp() {
    return icmp;
  }


  public void setIcmp(AddRuleToSecurityGroupRequestIcmp icmp) {
    this.icmp = icmp;
  }


  public AddRuleToSecurityGroupRequest startPort(Long startPort) {
    
    this.startPort = startPort;
    return this;
  }

   /**
   * Start port of the range
   * minimum: 1
   * maximum: 65535
   * @return startPort
  **/
  @javax.annotation.Nullable
  public Long getStartPort() {
    return startPort;
  }


  public void setStartPort(Long startPort) {
    this.startPort = startPort;
  }


  public AddRuleToSecurityGroupRequest endPort(Long endPort) {
    
    this.endPort = endPort;
    return this;
  }

   /**
   * End port of the range
   * minimum: 1
   * maximum: 65535
   * @return endPort
  **/
  @javax.annotation.Nullable
  public Long getEndPort() {
    return endPort;
  }


  public void setEndPort(Long endPort) {
    this.endPort = endPort;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddRuleToSecurityGroupRequest addRuleToSecurityGroupRequest = (AddRuleToSecurityGroupRequest) o;
    return Objects.equals(this.flowDirection, addRuleToSecurityGroupRequest.flowDirection) &&
        Objects.equals(this.description, addRuleToSecurityGroupRequest.description) &&
        Objects.equals(this.network, addRuleToSecurityGroupRequest.network) &&
        Objects.equals(this.securityGroup, addRuleToSecurityGroupRequest.securityGroup) &&
        Objects.equals(this.protocol, addRuleToSecurityGroupRequest.protocol) &&
        Objects.equals(this.icmp, addRuleToSecurityGroupRequest.icmp) &&
        Objects.equals(this.startPort, addRuleToSecurityGroupRequest.startPort) &&
        Objects.equals(this.endPort, addRuleToSecurityGroupRequest.endPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowDirection, description, network, securityGroup, protocol, icmp, startPort, endPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddRuleToSecurityGroupRequest {\n");
    sb.append("    flowDirection: ").append(toIndentedString(flowDirection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    icmp: ").append(toIndentedString(icmp)).append("\n");
    sb.append("    startPort: ").append(toIndentedString(startPort)).append("\n");
    sb.append("    endPort: ").append(toIndentedString(endPort)).append("\n");
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
    openapiFields.add("flow-direction");
    openapiFields.add("description");
    openapiFields.add("network");
    openapiFields.add("security-group");
    openapiFields.add("protocol");
    openapiFields.add("icmp");
    openapiFields.add("start-port");
    openapiFields.add("end-port");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("flow-direction");
    openapiRequiredFields.add("protocol");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddRuleToSecurityGroupRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddRuleToSecurityGroupRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddRuleToSecurityGroupRequest is not found in the empty JSON string", AddRuleToSecurityGroupRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddRuleToSecurityGroupRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddRuleToSecurityGroupRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddRuleToSecurityGroupRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("flow-direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flow-direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flow-direction").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      // validate the optional field `security-group`
      if (jsonObj.get("security-group") != null && !jsonObj.get("security-group").isJsonNull()) {
        SecurityGroupResource.validateJsonElement(jsonObj.get("security-group"));
      }
      if (!jsonObj.get("protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol").toString()));
      }
      // validate the optional field `icmp`
      if (jsonObj.get("icmp") != null && !jsonObj.get("icmp").isJsonNull()) {
        AddRuleToSecurityGroupRequestIcmp.validateJsonElement(jsonObj.get("icmp"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddRuleToSecurityGroupRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddRuleToSecurityGroupRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddRuleToSecurityGroupRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddRuleToSecurityGroupRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AddRuleToSecurityGroupRequest>() {
           @Override
           public void write(JsonWriter out, AddRuleToSecurityGroupRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddRuleToSecurityGroupRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddRuleToSecurityGroupRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddRuleToSecurityGroupRequest
  * @throws IOException if the JSON string is invalid with respect to AddRuleToSecurityGroupRequest
  */
  public static AddRuleToSecurityGroupRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddRuleToSecurityGroupRequest.class);
  }

 /**
  * Convert an instance of AddRuleToSecurityGroupRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

