
package com.jothi.example.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.stereotype.Component;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Component
@JsonPropertyOrder({
    "available_to_promise_network",
    "item",
    "circle_offers"
})
public class ProductVO implements Serializable
{

    @JsonProperty("available_to_promise_network")
    private AvailableToPromiseNetworkVO availableToPromiseNetwork;
    @JsonProperty("item")
    private ItemVO item;
    @JsonProperty("circle_offers")
    private CircleOffersVO circleOffers;
    private final static long serialVersionUID = 2547717457362043407L;

    @JsonProperty("available_to_promise_network")
    public AvailableToPromiseNetworkVO getAvailableToPromiseNetwork() {
        return availableToPromiseNetwork;
    }

    @JsonProperty("available_to_promise_network")
    public void setAvailableToPromiseNetwork(AvailableToPromiseNetworkVO availableToPromiseNetwork) {
        this.availableToPromiseNetwork = availableToPromiseNetwork;
    }

    @JsonProperty("item")
    public ItemVO getItem() {
        return item;
    }

    @JsonProperty("item")
    public void setItem(ItemVO item) {
        this.item = item;
    }

    @JsonProperty("circle_offers")
    public CircleOffersVO getCircleOffers() {
        return circleOffers;
    }

    @JsonProperty("circle_offers")
    public void setCircleOffers(CircleOffersVO circleOffers) {
        this.circleOffers = circleOffers;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("availableToPromiseNetwork", availableToPromiseNetwork).append("item", item).append("circleOffers", circleOffers).toString();
    }

}
