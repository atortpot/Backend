package org.example.repos;


import org.example.domain.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaRepository extends MongoRepository<Reserva, String> {
    List<Reserva> findByUsuarioId(String usuarioId);

    List<Reserva> findByLibroId(String libroId);
}