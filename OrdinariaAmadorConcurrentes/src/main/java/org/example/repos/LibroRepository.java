package org.example.repos;


import org.example.domain.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends MongoRepository<Libro, String> {
    List<Libro> findByTituloContainingIgnoreCase(String titulo);

    List<Libro> findByAutorId(String autorId);

    List<Libro> findByCategoriaId(String categoriaId);
}