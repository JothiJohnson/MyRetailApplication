 
package com.jothi.example.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "images",
    "sales_classification_nodes"
})
public class EnrichmentVO implements Serializable
{

    @JsonProperty("images")
    private List<ImageVO> images = null;
    @JsonProperty("sales_classification_nodes")
    private List<SalesClassificationNodeVO> salesClassificationNodes = null;
    private final static long serialVersionUID = 2055798499313549450L;

    @JsonProperty("images")
    public List<ImageVO> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<ImageVO> images) {
        this.images = images;
    }

    @JsonProperty("sales_classification_nodes")
    public List<SalesClassificationNodeVO> getSalesClassificationNodes() {
        return salesClassificationNodes;
    }

    @JsonProperty("sales_classification_nodes")
    public void setSalesClassificationNodes(List<SalesClassificationNodeVO> salesClassificationNodes) {
        this.salesClassificationNodes = salesClassificationNodes;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("images", images).append("salesClassificationNodes", salesClassificationNodes).toString();
    }

}
