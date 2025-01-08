package org.example.controller;


import org.example.domain.Categoria;
import org.example.model.CategoriaInput;
import org.example.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @QueryMapping
    public List<Categoria> obtenerTodasLasCategorias() {
        return categoriaService.obtenerTodas();
    }

    @MutationMapping
    public Categoria agregarCategoria(@Argument CategoriaInput categoriaInput) {
        return categoriaService.agregarCategoria(categoriaInput);
    }

    @MutationMapping
    public Categoria editarCategoria(@Argument String id, @Argument CategoriaInput categoriaInput) {
        return categoriaService.editarCategoria(id, categoriaInput);
    }

    @MutationMapping
    public Boolean eliminarCategoria(@Argument String id) {
        return categoriaService.eliminarCategoria(id);
    }
}
