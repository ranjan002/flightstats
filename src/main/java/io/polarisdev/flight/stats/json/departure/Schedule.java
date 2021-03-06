
package io.polarisdev.flight.stats.json.departure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

public @Data class Schedule {

  private String flightType;
  private String serviceClasses;
  private String restrictions;
  private List<Downline> downlines = null;
  private List<Upline> uplines = null;
  private Map<String, Object> additionalProperties;

}
