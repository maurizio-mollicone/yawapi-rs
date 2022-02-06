package it.mollik.yawapi.rs.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.mollik.yawapi.rs.exceptions.EntityNotFoundException;
import it.mollik.yawapi.rs.model.orm.Author;
import it.mollik.yawapi.rs.service.AuthorService;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    //@GetMapping("/author/list")
    @RequestMapping(method = RequestMethod.GET, path = "/author/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Author> list() throws EntityNotFoundException {
        return this.authorService.list();
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/author/find", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Author> findByName(@RequestParam(name = "name") String name) throws EntityNotFoundException {
        return this.authorService.findByName(name);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/author/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Author create(@RequestBody Author author) {
        return this.authorService.create(author.getArtistName(), author.getArtistCountry());
    }

}
