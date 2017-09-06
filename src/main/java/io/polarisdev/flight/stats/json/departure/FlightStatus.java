
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

public @Data class FlightStatus {

  private Integer flightId;
  private String carrierFsCode;
  private String flightNumber;
  private String departureAirportFsCode;
  private String arrivalAirportFsCode;
  private DepartureDate departureDate;
  private ArrivalDate arrivalDate;
  private String status;
  private Schedule schedule;
  private OperationalTimes operationalTimes;
  private List<Codeshare> codeshares = null;
  private FlightDurations flightDurations;
  private AirportResources airportResources;
  private FlightEquipment flightEquipment;
  private Map<String, Object> additionalProperties;
}
