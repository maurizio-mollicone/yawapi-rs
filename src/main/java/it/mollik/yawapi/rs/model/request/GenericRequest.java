package it.mollik.yawapi.rs.model.request;

import java.io.Serializable;
import java.util.StringJoiner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.commons.lang3.StringUtils;

public class GenericRequest implements Serializable {
    
    private RequestKey requestKey;

    public GenericRequest() {
        this.requestKey = new RequestKey();
    }
    
    public RequestKey getRequestKey() {
        return requestKey;
    }

    public void setRequestKey(RequestKey requestKey) {
        this.requestKey = requestKey;
    }

    @Override
    public String toString() {
        
        String item = new StringJoiner(StringUtils.EMPTY).add(this.getRequestKey().getCorrelationId().toString()).toString();
        String result = item;
        ObjectMapper mapper = new ObjectMapper();
        try {
            result = mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            result = item;
        }
        return result;
    }
}
