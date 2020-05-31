
package com.jothi.example.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "brand",
    "manufacturer_brand",
    "facet_id"
})
public class ProductBrandVO implements Serializable
{

    @JsonProperty("brand")
    private String brand;
    @JsonProperty("manufacturer_brand")
    private String manufacturerBrand;
    @JsonProperty("facet_id")
    private String facetId;
    private final static long serialVersionUID = 3683783503157585786L;

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("manufacturer_brand")
    public String getManufacturerBrand() {
        return manufacturerBrand;
    }

    @JsonProperty("manufacturer_brand")
    public void setManufacturerBrand(String manufacturerBrand) {
        this.manufacturerBrand = manufacturerBrand;
    }

    @JsonProperty("facet_id")
    public String getFacetId() {
        return facetId;
    }

    @JsonProperty("facet_id")
    public void setFacetId(String facetId) {
        this.facetId = facetId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("brand", brand).append("manufacturerBrand", manufacturerBrand).append("facetId", facetId).toString();
    }

}
