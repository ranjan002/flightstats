
package io.polarisdev.flight.stats.json.departure;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

public @Data class Airport_ {

  private String fs;
  private String iata;
  private String icao;
  private String faa;
  private String name;
  private String street1;
  private String city;
  private String cityCode;
  private String stateCode;
  private String postalCode;
  private String countryCode;
  private String countryName;
  private String regionName;
  private String timeZoneRegionName;
  private String weatherZone;
  private String localTime;
  private Integer utcOffsetHours;
  private Double latitude;
  private Double longitude;
  private Integer elevationFeet;
  private Integer classification;
  private Boolean active;
  private String delayIndexUrl;
  private String weatherUrl;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
