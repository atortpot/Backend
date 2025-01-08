package org.example.controller;



import org.example.domain.Autor;
import org.example.model.AutorInput;
import org.example.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AutorController {

    @Autowired
    private AutorService autorService;

    @QueryMapping
    public List<Autor> obtenerTodosLosAutores() {
        return autorService.obtenerTodos();
    }

    @MutationMapping
    public Autor agregarAutor(@Argument AutorInput autorInput) {
        return autorService.agregarAutor(autorInput);
    }

    @MutationMapping
    public Autor editarAutor(@Argument String id, @Argument AutorInput autorInput) {
        return autorService.editarAutor(id, autorInput);
    }

    @MutationMapping
    public Boolean eliminarAutor(@Argument String id) {
        return autorService.eliminarAutor(id);
    }
}
