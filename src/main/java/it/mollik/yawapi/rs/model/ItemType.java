package it.mollik.yawapi.rs.model;

public enum ItemType {
    BOOK("Book"),
    FILM("Film"),
    ALBUM("Album"),
    SONG("Song");

    public final String itemType;

    private ItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override 
    public String toString() { 
        return this.itemType; 
    }
}
