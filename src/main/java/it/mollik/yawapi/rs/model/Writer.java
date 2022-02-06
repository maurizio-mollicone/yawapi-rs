package it.mollik.yawapi.rs.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity(name = "writer")
public class Writer extends Artist{
    
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

}
