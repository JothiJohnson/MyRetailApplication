
package com.jothi.example.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class HandlingVO implements Serializable
{

    private final static long serialVersionUID = 8982519323550886203L;

    @Override
    public String toString() {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this).toString();
    }

}
