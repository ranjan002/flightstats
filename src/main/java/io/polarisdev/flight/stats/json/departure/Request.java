
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

public @Data class Request {

  private Airline airline;
  private Flight flight;
  private Date date;
  private Utc utc;
  private Airport airport;
  private CodeType codeType;
  private ExtendedOptions extendedOptions;
  private String url;
  private Map<String, Object> additionalProperties;
}
