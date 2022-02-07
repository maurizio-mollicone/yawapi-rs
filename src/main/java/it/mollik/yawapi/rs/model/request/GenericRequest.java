package it.mollik.yawapi.rs.model.request;

import java.io.Serializable;
import java.util.StringJoiner;

import org.apache.commons.lang3.StringUtils;

public class GenericRequest implements Serializable {
    
    private RequestKey requestKey;

    public GenericRequest() {
        this.requestKey = new RequestKey();
    }

    public GenericRequest(RequestKey requestKey) {
        this.requestKey = requestKey;
    }

    public RequestKey getRequestKey() {
        return requestKey;
    }

    public void setRequestKey(RequestKey requestKey) {
        this.requestKey = requestKey;
    }

    @Override
    public String toString() {
        return new StringJoiner(StringUtils.EMPTY).add(this.getClass().getName()).add(" [ ").add(this.getRequestKey().toString()).add("]").toString();
    }
}
