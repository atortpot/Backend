package org.example.controller;


import org.example.domain.Libro;
import org.example.model.LibroInput;
import org.example.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class LibroController {

    @Autowired
    private LibroService libroService;

    @QueryMapping
    public List<Libro> buscarLibrosPorTitulo(@Argument String titulo) {
        return libroService.buscarPorTitulo(titulo);
    }

    @QueryMapping
    public List<Libro> buscarLibrosPorAutor(@Argument String autorId) {
        return libroService.buscarPorAutor(autorId);
    }

    @QueryMapping
    public List<Libro> buscarLibrosPorCategoria(@Argument String categoriaId) {
        return libroService.buscarPorCategoria(categoriaId);
    }

    @MutationMapping
    public Libro agregarLibro(@Argument LibroInput libroInput) {
        return libroService.agregarLibro(libroInput);
    }

    @MutationMapping
    public Libro editarLibro(@Argument String id, @Argument LibroInput libroInput) {
        return libroService.editarLibro(id, libroInput);
    }

    @MutationMapping
    public Boolean eliminarLibro(@Argument String id) {
        return libroService.eliminarLibro(id);
    }
}
