
package com.jothi.example.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "category_type",
    "type",
    "name"
})
public class ItemTypeVO implements Serializable
{

    @JsonProperty("category_type")
    private String categoryType;
    @JsonProperty("type")
    private Integer type;
    @JsonProperty("name")
    private String name;
    private final static long serialVersionUID = 3575749545625094483L;

    @JsonProperty("category_type")
    public String getCategoryType() {
        return categoryType;
    }

    @JsonProperty("category_type")
    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Integer type) {
        this.type = type;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("categoryType", categoryType).append("type", type).append("name", name).toString();
    }

}
