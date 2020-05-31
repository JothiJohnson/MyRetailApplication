
package com.jothi.example.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "product"
})
public class DomainVO implements Serializable
{

    @JsonProperty("product")
    private ProductVO product;
    private final static long serialVersionUID = -3318552658591922899L;

    @JsonProperty("product")
    public ProductVO getProduct() {
        return product;
    }

    @JsonProperty("product")
    public void setProduct(ProductVO product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("product", product).toString();
    }

}
