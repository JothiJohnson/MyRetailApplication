
package com.jothi.example.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "is_size_chart"
})
public class DisplayOptionVO implements Serializable
{

    @JsonProperty("is_size_chart")
    private Boolean isSizeChart;
    private final static long serialVersionUID = -5423026962200416419L;

    @JsonProperty("is_size_chart")
    public Boolean getIsSizeChart() {
        return isSizeChart;
    }

    @JsonProperty("is_size_chart")
    public void setIsSizeChart(Boolean isSizeChart) {
        this.isSizeChart = isSizeChart;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("isSizeChart", isSizeChart).toString();
    }

}
