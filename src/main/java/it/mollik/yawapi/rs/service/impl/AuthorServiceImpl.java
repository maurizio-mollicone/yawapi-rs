package it.mollik.yawapi.rs.service.impl;

import java.util.List;
import java.util.Locale;
import java.util.Locale.IsoCountryCode;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.mollik.yawapi.rs.exceptions.EntityNotFoundException;
import it.mollik.yawapi.rs.model.orm.Author;
import it.mollik.yawapi.rs.repository.AuthorRepository;
import it.mollik.yawapi.rs.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> findByName(String authorName) throws EntityNotFoundException {
        List<Author> authors = authorRepository.findByArtistName(authorName);
        if (authors == null || authors.isEmpty()) {
            throw new EntityNotFoundException();
        }
        return authors;
    }

    @Override
    public List<Author> list() throws EntityNotFoundException {
        List<Author> authors = StreamSupport.stream(this.authorRepository.findAll().spliterator(), false).collect(Collectors.toList());
        if (authors == null || authors.isEmpty()) {
            throw new EntityNotFoundException();
        }
        return authors;
    }

    @Override
    public Author findByArtistId(Integer artistId) throws EntityNotFoundException {
        return this.authorRepository.findById(artistId).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Author create(String authorName, Locale country) {
        Author author = new Author();
        author.setArtistCountry(country);
        author.setArtistName(authorName);
        return this.authorRepository.save(author);
    }

    @Override
    public Author save(Author author) {
        return this.authorRepository.save(author);
    }
    
}
