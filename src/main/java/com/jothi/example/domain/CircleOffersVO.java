
package com.jothi.example.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "universal_offer_exists",
    "non_universal_offer_exists"
})
public class CircleOffersVO implements Serializable
{

    @JsonProperty("universal_offer_exists")
    private Boolean universalOfferExists;
    @JsonProperty("non_universal_offer_exists")
    private Boolean nonUniversalOfferExists;
    private final static long serialVersionUID = 6556216013900959212L;

    @JsonProperty("universal_offer_exists")
    public Boolean getUniversalOfferExists() {
        return universalOfferExists;
    }

    @JsonProperty("universal_offer_exists")
    public void setUniversalOfferExists(Boolean universalOfferExists) {
        this.universalOfferExists = universalOfferExists;
    }

    @JsonProperty("non_universal_offer_exists")
    public Boolean getNonUniversalOfferExists() {
        return nonUniversalOfferExists;
    }

    @JsonProperty("non_universal_offer_exists")
    public void setNonUniversalOfferExists(Boolean nonUniversalOfferExists) {
        this.nonUniversalOfferExists = nonUniversalOfferExists;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("universalOfferExists", universalOfferExists).append("nonUniversalOfferExists", nonUniversalOfferExists).toString();
    }

}
