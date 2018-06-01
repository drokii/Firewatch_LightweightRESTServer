package org.firewatch.apiserver.LoRa_REST_PoC;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class PayloadFields {


    @JsonProperty("heatPercentageInPicture")
    private int heatPercentageInPicture;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonAnyGetter
    public int getHeatPercentageInPicture() {
        return heatPercentageInPicture;
    }

    @JsonAnySetter
    public void setHeatPercentageInPicture(int heatPercentageInPicture) {
        this.heatPercentageInPicture = heatPercentageInPicture;
    }


}