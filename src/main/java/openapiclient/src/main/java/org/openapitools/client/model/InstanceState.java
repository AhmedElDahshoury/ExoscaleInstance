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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets instance-state
 */
@JsonAdapter(InstanceState.Adapter.class)
public enum InstanceState {
  
  EXPUNGING("expunging"),
  
  STARTING("starting"),
  
  DESTROYING("destroying"),
  
  RUNNING("running"),
  
  STOPPING("stopping"),
  
  STOPPED("stopped"),
  
  MIGRATING("migrating"),
  
  ERROR("error"),
  
  DESTROYED("destroyed");

  private String value;

  InstanceState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InstanceState fromValue(String value) {
    for (InstanceState b : InstanceState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<InstanceState> {
    @Override
    public void write(final JsonWriter jsonWriter, final InstanceState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InstanceState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InstanceState.fromValue(value);
    }
  }
}

