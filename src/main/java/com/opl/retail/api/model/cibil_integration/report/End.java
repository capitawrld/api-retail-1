
package com.opl.retail.api.model.cibil_integration.report;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TotalLength",
    "SegmentTag"
})
public class End implements Serializable
{

    @JsonProperty("TotalLength")
    private String totalLength;
    @JsonProperty("SegmentTag")
    private String segmentTag;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -592281263642947732L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public End() {
    }

    /**
     * 
     * @param totalLength
     * @param segmentTag
     */
    public End(String totalLength, String segmentTag) {
        super();
        this.totalLength = totalLength;
        this.segmentTag = segmentTag;
    }

    @JsonProperty("TotalLength")
    public String getTotalLength() {
        return totalLength;
    }

    @JsonProperty("TotalLength")
    public void setTotalLength(String totalLength) {
        this.totalLength = totalLength;
    }

    @JsonProperty("SegmentTag")
    public String getSegmentTag() {
        return segmentTag;
    }

    @JsonProperty("SegmentTag")
    public void setSegmentTag(String segmentTag) {
        this.segmentTag = segmentTag;
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
