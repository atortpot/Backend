package org.example.repos;


import org.example.domain.Prestamo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrestamoRepository extends MongoRepository<Prestamo, String> {
    List<Prestamo> findByUsuarioId(String usuarioId);

    List<Prestamo> findByLibroId(String libroId);
}