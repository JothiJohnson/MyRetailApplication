
package com.jothi.example.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "is_po_box_prohibited",
    "po_box_prohibited_message",
    "box_percent_filled_by_volume",
    "box_percent_filled_by_weight",
    "box_percent_filled_display"
})
public class FulfillmentVO implements Serializable
{

    @JsonProperty("is_po_box_prohibited")
    private Boolean isPoBoxProhibited;
    @JsonProperty("po_box_prohibited_message")
    private String poBoxProhibitedMessage;
    @JsonProperty("box_percent_filled_by_volume")
    private Double boxPercentFilledByVolume;
    @JsonProperty("box_percent_filled_by_weight")
    private Double boxPercentFilledByWeight;
    @JsonProperty("box_percent_filled_display")
    private Double boxPercentFilledDisplay;
    private final static long serialVersionUID = -7581468725519216226L;

    @JsonProperty("is_po_box_prohibited")
    public Boolean getIsPoBoxProhibited() {
        return isPoBoxProhibited;
    }

    @JsonProperty("is_po_box_prohibited")
    public void setIsPoBoxProhibited(Boolean isPoBoxProhibited) {
        this.isPoBoxProhibited = isPoBoxProhibited;
    }

    @JsonProperty("po_box_prohibited_message")
    public String getPoBoxProhibitedMessage() {
        return poBoxProhibitedMessage;
    }

    @JsonProperty("po_box_prohibited_message")
    public void setPoBoxProhibitedMessage(String poBoxProhibitedMessage) {
        this.poBoxProhibitedMessage = poBoxProhibitedMessage;
    }

    @JsonProperty("box_percent_filled_by_volume")
    public Double getBoxPercentFilledByVolume() {
        return boxPercentFilledByVolume;
    }

    @JsonProperty("box_percent_filled_by_volume")
    public void setBoxPercentFilledByVolume(Double boxPercentFilledByVolume) {
        this.boxPercentFilledByVolume = boxPercentFilledByVolume;
    }

    @JsonProperty("box_percent_filled_by_weight")
    public Double getBoxPercentFilledByWeight() {
        return boxPercentFilledByWeight;
    }

    @JsonProperty("box_percent_filled_by_weight")
    public void setBoxPercentFilledByWeight(Double boxPercentFilledByWeight) {
        this.boxPercentFilledByWeight = boxPercentFilledByWeight;
    }

    @JsonProperty("box_percent_filled_display")
    public Double getBoxPercentFilledDisplay() {
        return boxPercentFilledDisplay;
    }

    @JsonProperty("box_percent_filled_display")
    public void setBoxPercentFilledDisplay(Double boxPercentFilledDisplay) {
        this.boxPercentFilledDisplay = boxPercentFilledDisplay;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("isPoBoxProhibited", isPoBoxProhibited).append("poBoxProhibitedMessage", poBoxProhibitedMessage).append("boxPercentFilledByVolume", boxPercentFilledByVolume).append("boxPercentFilledByWeight", boxPercentFilledByWeight).append("boxPercentFilledDisplay", boxPercentFilledDisplay).toString();
    }

}
