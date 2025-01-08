package org.example.controller;


import org.example.domain.Reserva;
import org.example.model.ReservaInput;
import org.example.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @QueryMapping
    public Reserva obtenerReserva(@Argument String id) {
        return reservaService.obtenerReservaPorId(id);
    }

    @MutationMapping
    public Reserva crearReserva(@Argument ReservaInput reservaInput) {
        return reservaService.crearReserva(reservaInput);
    }

    @MutationMapping
    public Boolean cancelarReserva(@Argument String id) {
        return reservaService.cancelarReserva(id);
    }
}
