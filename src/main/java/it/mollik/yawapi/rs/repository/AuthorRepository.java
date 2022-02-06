package it.mollik.yawapi.rs.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.mollik.yawapi.rs.model.orm.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {
    
    public List<Author> findByArtistName(String artistName);

}
