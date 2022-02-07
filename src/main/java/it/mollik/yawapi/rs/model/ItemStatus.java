package it.mollik.yawapi.rs.model;

public enum ItemStatus {
    
    NEW("N"),
    UPDATE("U"),
    SYNC("S"),
    DELETE("D");

    private String status;

    private ItemStatus(String status) {
        this.status = status;
    }

    /**
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    protected void setStatus(String status) {
        this.status = status;
    }

    @Override 
    public String toString() {
        return this.status;
    }

}
