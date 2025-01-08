package org.example.controller;


import org.example.domain.Prestamo;
import org.example.model.PrestamoInput;
import org.example.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PrestamoController {

    @Autowired
    private PrestamoService prestamoService;

    @QueryMapping
    public Prestamo obtenerPrestamo(@Argument String id) {
        return prestamoService.obtenerPrestamoPorId(id);
    }

    @MutationMapping
    public Prestamo crearPrestamo(@Argument PrestamoInput prestamoInput) {
        return prestamoService.crearPrestamo(prestamoInput);
    }

    @MutationMapping
    public Boolean finalizarPrestamo(@Argument String id) {
        return prestamoService.finalizarPrestamo(id);
    }
}