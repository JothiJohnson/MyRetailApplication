
package com.jothi.example.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "base_url",
    "primary",
    "content_labels"
})
public class ImageVO implements Serializable
{

    @JsonProperty("base_url")
    private String baseUrl;
    @JsonProperty("primary")
    private String primary;
    @JsonProperty("content_labels")
    private List<ContentLabelVO> contentLabels = null;
    private final static long serialVersionUID = -3926568479023730586L;

    @JsonProperty("base_url")
    public String getBaseUrl() {
        return baseUrl;
    }

    @JsonProperty("base_url")
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @JsonProperty("primary")
    public String getPrimary() {
        return primary;
    }

    @JsonProperty("primary")
    public void setPrimary(String primary) {
        this.primary = primary;
    }

    @JsonProperty("content_labels")
    public List<ContentLabelVO> getContentLabels() {
        return contentLabels;
    }

    @JsonProperty("content_labels")
    public void setContentLabels(List<ContentLabelVO> contentLabels) {
        this.contentLabels = contentLabels;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("baseUrl", baseUrl).append("primary", primary).append("contentLabels", contentLabels).toString();
    }

}
