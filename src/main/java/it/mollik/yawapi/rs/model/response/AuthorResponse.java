package it.mollik.yawapi.rs.model.response;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import org.apache.commons.lang3.StringUtils;

import it.mollik.yawapi.rs.model.orm.Author;
import it.mollik.yawapi.rs.model.request.RequestKey;

public class AuthorResponse extends GenericResponse {

    private List<Author> authors;

    public AuthorResponse(RequestKey requestKey, Integer statusCode, String statusMessage) {
        super(requestKey, statusCode, statusMessage);
        this.authors = new ArrayList<>();
    }

    public AuthorResponse(RequestKey requestKey, Integer statusCode, String statusMessage, List<Author> authors) {
        this(requestKey, statusCode, statusMessage);
        this.authors = authors;
    }

    /**
     * @return List<Author> return the authors
     */
    public List<Author> getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return new StringJoiner(StringUtils.EMPTY).add(this.getClass().getName()).add(" [ ").add(this.getRequestKey().toString())
        .add(", authors ").add(this.getAuthors().toString())
        .add("]").toString();
    }
}
