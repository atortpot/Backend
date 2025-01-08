package org.example.service;


import org.example.domain.Reserva;
import org.example.model.ReservaInput;
import org.example.repos.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva obtenerReservaPorId(String id) {
        return reservaRepository.findById(id).orElseThrow(() -> new RuntimeException("Reserva no encontrada"));
    }

    public Reserva crearReserva(ReservaInput reservaInput) {
        Reserva reserva = new Reserva();
        reserva.setUsuarioId(reservaInput.getUsuarioId());
        reserva.setLibroId(reservaInput.getLibroId());
        reserva.setFechaReserva(reservaInput.getFechaReserva());
        reserva.setEstado("PENDIENTE");
        return reservaRepository.save(reserva);
    }

    public boolean cancelarReserva(String id) {
        if (reservaRepository.existsById(id)) {
            reservaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}