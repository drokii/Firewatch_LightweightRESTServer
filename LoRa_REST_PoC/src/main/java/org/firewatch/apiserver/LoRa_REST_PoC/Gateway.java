package org.firewatch.apiserver.LoRa_REST_PoC;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "gtw_id",
        "snr",
        "rf_chain",
        "latitude",
        "longitude",
        "altitude"
})
public class Gateway {

    @JsonProperty("gtw_id")
    private String gtwId;
    @JsonProperty("snr")
    private Integer snr;
    @JsonProperty("rf_chain")
    private Integer rfChain;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("altitude")
    private Integer altitude;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gtw_id")
    public String getGtwId() {
        return gtwId;
    }

    @JsonProperty("gtw_id")
    public void setGtwId(String gtwId) {
        this.gtwId = gtwId;
    }

    @JsonProperty("snr")
    public Integer getSnr() {
        return snr;
    }

    @JsonProperty("snr")
    public void setSnr(Integer snr) {
        this.snr = snr;
    }

    @JsonProperty("rf_chain")
    public Integer getRfChain() {
        return rfChain;
    }

    @JsonProperty("rf_chain")
    public void setRfChain(Integer rfChain) {
        this.rfChain = rfChain;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("altitude")
    public Integer getAltitude() {
        return altitude;
    }

    @JsonProperty("altitude")
    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}