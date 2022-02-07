package it.mollik.yawapi.rs.repository;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import it.mollik.yawapi.rs.model.orm.Author;

@Repository
public interface AuthorRepository extends PagingAndSortingRepository<Author, Integer> {
    
    public Iterable<Author> findByName(String name);

}
