
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

public @Data class OperationalTimes {

  private PublishedDeparture publishedDeparture;
  private PublishedArrival publishedArrival;
  private ScheduledGateDeparture scheduledGateDeparture;
  private EstimatedGateDeparture estimatedGateDeparture;
  private FlightPlanPlannedDeparture flightPlanPlannedDeparture;
  private ScheduledGateArrival scheduledGateArrival;
  private EstimatedGateArrival estimatedGateArrival;
  private FlightPlanPlannedArrival flightPlanPlannedArrival;
  private Map<String, Object> additionalProperties;
}
