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
        "app_id",
        "dev_id",
        "hardware_serial",
        "port",
        "counter",
        "is_retry",
        "confirmed",
        "payload_raw",
        "payload_fields",
        "metadata",
        "downlink_url"
})
public class UplinkData {

    @JsonProperty("app_id")
    private String appId;
    @JsonProperty("dev_id")
    private String devId;
    @JsonProperty("hardware_serial")
    private String hardwareSerial;
    @JsonProperty("port")
    private Integer port;
    @JsonProperty("counter")
    private Integer counter;
    @JsonProperty("is_retry")
    private Boolean isRetry;
    @JsonProperty("confirmed")
    private Boolean confirmed;
    @JsonProperty("payload_raw")
    private String payloadRaw;
    @JsonProperty("payload_fields")
    private PayloadFields payloadFields;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("downlink_url")
    private String downlinkUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("app_id")
    public String getAppId() {
        return appId;
    }

    @JsonProperty("app_id")
    public void setAppId(String appId) {
        this.appId = appId;
    }

    @JsonProperty("dev_id")
    public String getDevId() {
        return devId;
    }

    @JsonProperty("dev_id")
    public void setDevId(String devId) {
        this.devId = devId;
    }

    @JsonProperty("hardware_serial")
    public String getHardwareSerial() {
        return hardwareSerial;
    }

    @JsonProperty("hardware_serial")
    public void setHardwareSerial(String hardwareSerial) {
        this.hardwareSerial = hardwareSerial;
    }

    @JsonProperty("port")
    public Integer getPort() {
        return port;
    }

    @JsonProperty("port")
    public void setPort(Integer port) {
        this.port = port;
    }

    @JsonProperty("counter")
    public Integer getCounter() {
        return counter;
    }

    @JsonProperty("counter")
    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    @JsonProperty("is_retry")
    public Boolean getIsRetry() {
        return isRetry;
    }

    @JsonProperty("is_retry")
    public void setIsRetry(Boolean isRetry) {
        this.isRetry = isRetry;
    }

    @JsonProperty("confirmed")
    public Boolean getConfirmed() {
        return confirmed;
    }

    @JsonProperty("confirmed")
    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    @JsonProperty("payload_raw")
    public String getPayloadRaw() {
        return payloadRaw;
    }

    @JsonProperty("payload_raw")
    public void setPayloadRaw(String payloadRaw) {
        this.payloadRaw = payloadRaw;
    }

    @JsonProperty("payload_fields")
    public PayloadFields getPayloadFields() {
        return payloadFields;
    }

    @JsonProperty("payload_fields")
    public void setPayloadFields(PayloadFields payloadFields) {
        this.payloadFields = payloadFields;
    }

    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @JsonProperty("downlink_url")
    public String getDownlinkUrl() {
        return downlinkUrl;
    }

    @JsonProperty("downlink_url")
    public void setDownlinkUrl(String downlinkUrl) {
        this.downlinkUrl = downlinkUrl;
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