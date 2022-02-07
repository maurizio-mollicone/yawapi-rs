package it.mollik.yawapi.rs.model.orm;

import java.util.Locale;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "author")
public class Author extends Artist {
    
    @ManyToMany(mappedBy = "authors")
    @JsonIgnore
    private Set<Book> books;

    public Author() {
        super();   
    }


    public Author(String name, Locale country) {
        super(name, country);
    }
    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }


}
