
package com.jothi.example.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "is_hazardous_material",
    "has_lead_disclosure"
})
public class EnvironmentalSegmentationVO implements Serializable
{

    @JsonProperty("is_hazardous_material")
    private Boolean isHazardousMaterial;
    @JsonProperty("has_lead_disclosure")
    private Boolean hasLeadDisclosure;
    private final static long serialVersionUID = -5172696514388741017L;

    @JsonProperty("is_hazardous_material")
    public Boolean getIsHazardousMaterial() {
        return isHazardousMaterial;
    }

    @JsonProperty("is_hazardous_material")
    public void setIsHazardousMaterial(Boolean isHazardousMaterial) {
        this.isHazardousMaterial = isHazardousMaterial;
    }

    @JsonProperty("has_lead_disclosure")
    public Boolean getHasLeadDisclosure() {
        return hasLeadDisclosure;
    }

    @JsonProperty("has_lead_disclosure")
    public void setHasLeadDisclosure(Boolean hasLeadDisclosure) {
        this.hasLeadDisclosure = hasLeadDisclosure;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("isHazardousMaterial", isHazardousMaterial).append("hasLeadDisclosure", hasLeadDisclosure).toString();
    }

}
