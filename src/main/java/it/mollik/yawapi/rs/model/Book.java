package it.mollik.yawapi.rs.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity(name = "book")
public class Book extends Item {

    @Column(name="isbn_code")
    private String isbnCode;

    @Column(name="genre", nullable = false)
    private BookGenre bookGenre;

    @ManyToMany
    @JoinTable(name = "book_authors", joinColumns = @JoinColumn(name = "item_id"), 
        inverseJoinColumns = @JoinColumn(name = "artist_id"))
    private Set<Writer> authors;

    public String getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
    }

    public BookGenre getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(BookGenre bookGenre) {
        this.bookGenre = bookGenre;
    }
     
    public Set<Writer> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Writer> authors) {
        this.authors = authors;
    }
}
