package it.mollik.yawapi.rs.model.request;

import java.io.Serializable;

public class GenericRequest  implements Serializable {
    
    private RequestKey requestKey;

    public RequestKey getRequestKey() {
        return requestKey;
    }

    public void setRequestKey(RequestKey requestKey) {
        this.requestKey = requestKey;
    }

}
