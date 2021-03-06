package it.mollik.yawapi.rs.service;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;

import it.mollik.yawapi.rs.exceptions.EntityNotFoundException;
import it.mollik.yawapi.rs.model.orm.Author;

@Service
public interface AuthorService {
    
    public List<Author> findByName(String authorName) throws EntityNotFoundException;

    public List<Author> list() throws EntityNotFoundException;

    public Author findById(Integer artistId) throws EntityNotFoundException;

    public Author create(String authorName, Locale country);

    public Author save(Author author);
    
    public void delete(Integer authorId) throws EntityNotFoundException;
}
