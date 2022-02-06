package it.mollik.yawapi.rs.model.request;

import java.io.Serializable;
import java.util.Date;
import java.util.StringJoiner;
import java.util.UUID;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.commons.lang3.StringUtils;

public class RequestKey implements Serializable{
    
    private UUID correlationId;
    private UUID requestId;
    private Date timestamp;
    private String language;
    private String ipAddress;
    private String jsessionId;

    public RequestKey() {
        this("en", "0.0.0.0", StringUtils.EMPTY);
    }

    public RequestKey(String language, String ipAddress, String jsessionId) {
        super();
        this.correlationId = UUID.randomUUID();
        this.requestId = UUID.randomUUID();
        this.timestamp = new Date();
        this.language = language;
        this.ipAddress = ipAddress;
        this.jsessionId = jsessionId;
    }

    public UUID getCorrelationId() {
        return correlationId;
    }
    public void setCorrelationId(UUID correlationId) {
        this.correlationId = correlationId;
    }
    public UUID getRequestId() {
        return requestId;
    }
    public void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }
    public Date getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getIpAddress() {
        return ipAddress;
    }
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    public String getJsessionId() {
        return jsessionId;
    }
    public void setJsessionId(String jsessionId) {
        this.jsessionId = jsessionId;
    }
    
    @Override
    public String toString() {
        
        String item = new StringJoiner(StringUtils.EMPTY).add(this.getCorrelationId().toString()).toString();
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
