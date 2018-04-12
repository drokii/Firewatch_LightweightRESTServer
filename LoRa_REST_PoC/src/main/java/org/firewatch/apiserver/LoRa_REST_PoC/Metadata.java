package org.firewatch.apiserver.LoRa_REST_PoC;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "time",
        "frequency",
        "modulation",
        "data_rate",
        "bit_rate",
        "coding_rate",
        "gateways",
        "latitude",
        "longitude",
        "altitude"
})
public class Metadata {

    @JsonProperty("time")
    private String time;
    @JsonProperty("frequency")
    private Double frequency;
    @JsonProperty("modulation")
    private String modulation;
    @JsonProperty("data_rate")
    private String dataRate;
    @JsonProperty("bit_rate")
    private Integer bitRate;
    @JsonProperty("coding_rate")
    private String codingRate;
    @JsonProperty("gateways")
    private List<Gateway> gateways = null;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("altitude")
    private Integer altitude;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("frequency")
    public Double getFrequency() {
        return frequency;
    }

    @JsonProperty("frequency")
    public void setFrequency(Double frequency) {
        this.frequency = frequency;
    }

    @JsonProperty("modulation")
    public String getModulation() {
        return modulation;
    }

    @JsonProperty("modulation")
    public void setModulation(String modulation) {
        this.modulation = modulation;
    }

    @JsonProperty("data_rate")
    public String getDataRate() {
        return dataRate;
    }

    @JsonProperty("data_rate")
    public void setDataRate(String dataRate) {
        this.dataRate = dataRate;
    }

    @JsonProperty("bit_rate")
    public Integer getBitRate() {
        return bitRate;
    }

    @JsonProperty("bit_rate")
    public void setBitRate(Integer bitRate) {
        this.bitRate = bitRate;
    }

    @JsonProperty("coding_rate")
    public String getCodingRate() {
        return codingRate;
    }

    @JsonProperty("coding_rate")
    public void setCodingRate(String codingRate) {
        this.codingRate = codingRate;
    }

    @JsonProperty("gateways")
    public List<Gateway> getGateways() {
        return gateways;
    }

    @JsonProperty("gateways")
    public void setGateways(List<Gateway> gateways) {
        this.gateways = gateways;
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