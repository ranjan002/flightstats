
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

public @Data class Codeshare {

  private String fsCode;
  private String flightNumber;
  private String relationship;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
