package it.mollik.yawapi.rs.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "book")
public class Book extends Item {

    @Column(name="isbn_code")
    private String isbnCode;

    @Column(name="genre")
    private String genre;

    
    private Set<Writer> authors;

    public String getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
     
    public Set<Writer> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Writer> authors) {
        this.authors = authors;
    }
}
