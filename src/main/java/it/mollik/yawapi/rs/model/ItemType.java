package it.mollik.yawapi.rs.model;

public enum ItemType {
    BOOK("Book"),
    FILM("Film"),
    ALBUM("Album"),
    SONG("Song");


    private String itemTypeValue;

    public String getItemTypeValue() {
        return itemTypeValue;
    }

    public void setItemTypeValue(String itemTypeValue) {
        this.itemTypeValue = itemTypeValue;
    }

    private ItemType(String itemTypeValue) {
        this.itemTypeValue = itemTypeValue;
    }

    @Override
    public String toString() {
        return this.itemTypeValue;
    }

}
