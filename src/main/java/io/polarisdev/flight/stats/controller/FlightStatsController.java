package io.polarisdev.flight.stats.controller;



import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.polarisdev.flight.stats.json.departure.FlightStatsByDepature;
import io.polarisdev.flight.stats.service.FlightStatsService;
import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/flight")
@Slf4j
public class FlightStatsController {

  private FlightStatsService flightStatsService;

  public FlightStatsController(FlightStatsService flightStatsService) {
    this.flightStatsService = flightStatsService;
  }


  /**
   * Returns the Flight Statuses for the given Carrier and Flight Number that departed on the given
   * date. Optionally, the departure airport may be specified.
   * 
   * @param carrier
   * @param flightNo
   * @param depatureDate
   * @param utc
   * @param airport
   * @param codeType
   * @return
   */
  @GetMapping("/status/{carrier}/{flightNo}/{depatureDate}/{utc}/{airport}/{codeType}")
  public FlightStatsByDepature getFlightStatusByDepartureDate(@PathVariable String carrier,
      @PathVariable String flightNo, @PathVariable String depatureDate, @PathVariable boolean utc,
      @PathVariable String airport, @PathVariable String codeType) {

    return flightStatsService.getFlightStatusByDepartureDate(carrier, flightNo, depatureDate, utc,
        airport, codeType);
  }

}
