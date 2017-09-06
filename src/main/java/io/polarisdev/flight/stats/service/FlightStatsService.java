package io.polarisdev.flight.stats.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.polarisdev.flight.stats.helper.FlightStatsHelper;
import io.polarisdev.flight.stats.json.departure.FlightStatsByDepature;
import lombok.extern.slf4j.Slf4j;


/**
 * Service which can perform Corporation
 */

@Service
@Slf4j
public class FlightStatsService {
  @Value("${flight.stats.basic.url}")
  private String flightStatsBasicUrl;

  public FlightStatsByDepature getFlightStatusByDepartureDate(String carrier, String flightNo,
      String depatureDate, boolean utc, String airport, String codeType) {
    String urlForFlightstatsOnDepartingDate = FlightStatsHelper.createRequestUri(
        flightStatsBasicUrl, carrier, flightNo, depatureDate, utc, airport, codeType);
    RestTemplate restTemplate = new RestTemplate();
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    HttpEntity<String> entity = new HttpEntity<String>(headers);
    restTemplate.setMessageConverters(getMessageConverters());
    ResponseEntity<FlightStatsByDepature> responseResultByDepature = restTemplate.exchange(
        urlForFlightstatsOnDepartingDate, HttpMethod.GET, entity, FlightStatsByDepature.class);
    System.out.println("responseResult value is\t:" + responseResultByDepature);
    return responseResultByDepature.getBody();
  }

  public static List<HttpMessageConverter<?>> getMessageConverters() {
    List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
    converters.add(new MappingJackson2HttpMessageConverter());
    return converters;
  }
}
