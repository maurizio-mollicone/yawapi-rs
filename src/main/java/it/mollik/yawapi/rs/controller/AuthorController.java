package it.mollik.yawapi.rs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.mollik.yawapi.rs.exceptions.EntityNotFoundException;
import it.mollik.yawapi.rs.model.orm.Author;
import it.mollik.yawapi.rs.model.request.AuthorRequest;
import it.mollik.yawapi.rs.service.AuthorService;

@RestController
public class AuthorController {

    private static final Logger logger = LoggerFactory.getLogger(AuthorController.class);

    @Autowired
    private AuthorService authorService;

    @GetMapping(path = "/author/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Author> list() throws EntityNotFoundException {
        logger.info("/author/list");
        return this.authorService.list();
    }

    @PutMapping(path = "/author/find", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Author> findByName(@RequestBody AuthorRequest request) throws EntityNotFoundException {
        logger.info("/author/find {}" , request);
        List<Author> result = this.authorService.findByName(request.getAuthors().get(0).getArtistName());
        logger.info("/author/find OK {} elemts" , result.size());
        return result;
    }

    @PostMapping(path = "/author/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Author create(@RequestBody AuthorRequest request) {
        Author result = this.authorService.create(request.getAuthors().get(0).getArtistName(), request.getAuthors().get(0).getArtistCountry());
        logger.info("/author/created {}", result);
        return result;
    }

}
