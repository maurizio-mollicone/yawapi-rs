package it.mollik.yawapi.rs.model.orm;

import java.io.Serializable;
import java.util.Date;
import java.util.StringJoiner;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.apache.commons.lang3.StringUtils;

import it.mollik.yawapi.rs.model.ItemType;

@MappedSuperclass
public class Item implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
   
    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "year")
    private Date year;
    
    @Column(name = "item_type")
    private ItemType itemType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer itemId) {
        this.id = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    @Override
    public String toString() {        
        String itemId = this.getId() != null ? this.getId().toString() : StringUtils.EMPTY;
        return new StringJoiner(StringUtils.EMPTY).add("Item [").add("itemId: ").add(itemId).add(", title: ").add(this.getTitle()).add("]").toString();
    }

}
