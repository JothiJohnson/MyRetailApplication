
package com.jothi.example.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "is_product_recalled"
})
public class RecallComplianceVO implements Serializable
{

    @JsonProperty("is_product_recalled")
    private Boolean isProductRecalled;
    private final static long serialVersionUID = 1447238709523786611L;

    @JsonProperty("is_product_recalled")
    public Boolean getIsProductRecalled() {
        return isProductRecalled;
    }

    @JsonProperty("is_product_recalled")
    public void setIsProductRecalled(Boolean isProductRecalled) {
        this.isProductRecalled = isProductRecalled;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("isProductRecalled", isProductRecalled).toString();
    }

}
