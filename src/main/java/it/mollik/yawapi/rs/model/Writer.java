package it.mollik.yawapi.rs.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;

@Entity(name = "writer")
public class Writer extends Artist{
    
    private Set<Book> books;

}
