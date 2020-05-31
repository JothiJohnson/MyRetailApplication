
package com.jothi.example.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "downstream_description",
    "bullet_description"
})
public class ProductDescriptionVO implements Serializable
{

    @JsonProperty("title")
    private String title;
    @JsonProperty("downstream_description")
    private String downstreamDescription;
    @JsonProperty("bullet_description")
    private List<String> bulletDescription = null;
    private final static long serialVersionUID = -3448037743596014273L;

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("downstream_description")
    public String getDownstreamDescription() {
        return downstreamDescription;
    }

    @JsonProperty("downstream_description")
    public void setDownstreamDescription(String downstreamDescription) {
        this.downstreamDescription = downstreamDescription;
    }

    @JsonProperty("bullet_description")
    public List<String> getBulletDescription() {
        return bulletDescription;
    }

    @JsonProperty("bullet_description")
    public void setBulletDescription(List<String> bulletDescription) {
        this.bulletDescription = bulletDescription;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("title", title).append("downstreamDescription", downstreamDescription).append("bulletDescription", bulletDescription).toString();
    }

}
