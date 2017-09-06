package io.polarisdev.flight.stats.helper;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class FlightStatsHelper {

  public static final String appId = "cc6d8955";
  public static final String appKey = "4e30fef804a700b7dbe177eca93f5da6";

  public static String createRequestUri(String flightStatsBasicUrl,
      String carrier, String flightNo, String depatureDate, boolean utc, String airport,
      String codeType) {
    String[] splittedDate = convertDateIntoYearMonthDay(depatureDate);
    StringBuilder finalUrl = new StringBuilder(flightStatsBasicUrl);
    finalUrl.append(carrier).append("/").append(flightNo).append("/dep/").append(splittedDate[0])
        .append("/").append(splittedDate[1]).append("/").append(splittedDate[2]).append("?appId=")
        .append(appId).append("&appKey=").append(appKey).append("&utc=").append(utc);
    if (null != airport && StringUtils.isEmpty(airport)) {
      finalUrl.append("&airport=");
      finalUrl.append(airport);
    }
    if (null != codeType && StringUtils.isEmpty(codeType)) {
      finalUrl.append("&codeType=");
      finalUrl.append(codeType);
    }
    return finalUrl.toString();
  }

  private static String[] convertDateIntoYearMonthDay(String depatureDate) {
    String[] splitedDate = null;
    if (null != depatureDate) {
      splitedDate = depatureDate.split("\\-");
    }
    return splitedDate;
  }

}
