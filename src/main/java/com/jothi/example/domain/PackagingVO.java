
package com.jothi.example.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "is_retail_ticketed"
})
public class PackagingVO implements Serializable
{

    @JsonProperty("is_retail_ticketed")
    private Boolean isRetailTicketed;
    private final static long serialVersionUID = 6276910314733693066L;

    @JsonProperty("is_retail_ticketed")
    public Boolean getIsRetailTicketed() {
        return isRetailTicketed;
    }

    @JsonProperty("is_retail_ticketed")
    public void setIsRetailTicketed(Boolean isRetailTicketed) {
        this.isRetailTicketed = isRetailTicketed;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("isRetailTicketed", isRetailTicketed).toString();
    }

}
