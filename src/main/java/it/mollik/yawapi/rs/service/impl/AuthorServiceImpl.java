package it.mollik.yawapi.rs.service.impl;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.mollik.yawapi.rs.exceptions.EntityNotFoundException;
import it.mollik.yawapi.rs.model.orm.Author;
import it.mollik.yawapi.rs.repository.AuthorRepository;
import it.mollik.yawapi.rs.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

    private Logger logger = LoggerFactory.getLogger(AuthorServiceImpl.class);

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> findByName(String authorName) throws EntityNotFoundException {
        logger.info("findByName {}", authorName);
        List<Author> authors = authorRepository.findByArtistName(authorName);
        if (authors == null || authors.isEmpty()) {
            logger.error("EntityNotFoundException {}", authorName);
            throw new EntityNotFoundException(String.format("EntityNotFoundException %s", authorName));
        }
        return authors;
    }

    @Override
    public List<Author> list() throws EntityNotFoundException {
        logger.info("list");

        List<Author> authors = StreamSupport.stream(this.authorRepository.findAll().spliterator(), false).collect(Collectors.toList());
        if (authors == null || authors.isEmpty()) {
            logger.error("EntityNotFoundException");
            throw new EntityNotFoundException(StringUtils.EMPTY);
        }
        return authors;
    }

    @Override
    public Author findByArtistId(Integer artistId) throws EntityNotFoundException {
        return this.authorRepository.findById(artistId).orElseThrow(() -> new EntityNotFoundException(artistId.toString()));
    }

    @Override
    public Author create(String authorName, Locale country) {
        Author author = new Author();
        author.setArtistCountry(country);
        author.setArtistName(authorName);
        logger.info("create {}", author);
        return this.authorRepository.save(author);
    }

    @Override
    public Author save(Author author) {
        logger.info("save {}", author);
        return this.authorRepository.save(author);
    }
    
}
