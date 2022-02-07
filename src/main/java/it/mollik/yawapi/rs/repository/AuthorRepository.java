package it.mollik.yawapi.rs.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.mollik.yawapi.rs.model.orm.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {
    
    public Iterable<Author> findByArtistName(String artistName);

    public Optional<Author> findByArtistId(Integer artistId);
}
