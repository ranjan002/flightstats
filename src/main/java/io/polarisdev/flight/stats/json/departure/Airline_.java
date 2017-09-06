
package io.polarisdev.flight.stats.json.departure;

import java.util.HashMap;
import java.util.Map;
import lombok.Data;

public @Data class Airline_ {

    private String fs;
    private String iata;
    private String icao;
    private String name;
    private String phoneNumber;
    private Boolean active;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
