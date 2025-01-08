package org.example.repos;


import org.example.domain.Autor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends MongoRepository<Autor, String> {
}
