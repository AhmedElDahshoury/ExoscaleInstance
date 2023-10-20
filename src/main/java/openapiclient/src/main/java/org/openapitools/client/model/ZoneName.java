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
 * Gets or Sets zone-name
 */
@JsonAdapter(ZoneName.Adapter.class)
public enum ZoneName {
  
  CH_DK_2("ch-dk-2"),
  
  DE_MUC_1("de-muc-1"),
  
  CH_GVA_2("ch-gva-2"),
  
  AT_VIE_1("at-vie-1"),
  
  DE_FRA_1("de-fra-1"),
  
  BG_SOF_1("bg-sof-1"),
  
  AT_VIE_2("at-vie-2");

  private String value;

  ZoneName(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ZoneName fromValue(String value) {
    for (ZoneName b : ZoneName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ZoneName> {
    @Override
    public void write(final JsonWriter jsonWriter, final ZoneName enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ZoneName read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ZoneName.fromValue(value);
    }
  }
}
