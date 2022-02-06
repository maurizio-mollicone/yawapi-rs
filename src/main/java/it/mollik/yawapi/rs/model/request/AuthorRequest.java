package it.mollik.yawapi.rs.model.request;

import java.util.List;

import it.mollik.yawapi.rs.model.orm.Author;

public class AuthorRequest extends GenericRequest {
    
    private List<Author> authors;

    /**
     * @return List<Author> return the authors
     */
    public List<Author> getAuthors() {
        return authors;
    }

    /**
     * @param authors the users to set
     */
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

}
