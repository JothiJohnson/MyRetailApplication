
package com.jothi.example.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class BundleComponentsVO implements Serializable
{

    private final static long serialVersionUID = -3536800297909863724L;

    @Override
    public String toString() {
        return new ToStringBuilder(this).toString();
    }

}
