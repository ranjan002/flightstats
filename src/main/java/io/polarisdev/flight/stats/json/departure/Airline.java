
package io.polarisdev.flight.stats.json.departure;

import java.util.HashMap;
import java.util.Map;
import lombok.Data;

public @Data class Airline {

    private String requestedCode;
    private String fsCode;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
