package org.example.service;


import org.example.domain.Categoria;
import org.example.model.CategoriaInput;
import org.example.repos.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> obtenerTodas() {
        return categoriaRepository.findAll();
    }

    public Categoria agregarCategoria(CategoriaInput categoriaInput) {
        Categoria categoria = new Categoria();
        categoria.setNombre(categoriaInput.getNombre());
        categoria.setDescripcion(categoriaInput.getDescripcion());
        return categoriaRepository.save(categoria);
    }

    public Categoria editarCategoria(String id, CategoriaInput categoriaInput) {
        return categoriaRepository.findById(id).map(categoria -> {
            categoria.setNombre(categoriaInput.getNombre());
            categoria.setDescripcion(categoriaInput.getDescripcion());
            return categoriaRepository.save(categoria);
        }).orElseThrow(() -> new RuntimeException("Categoría no encontrada"));
    }

    public boolean eliminarCategoria(String id) {
        if (categoriaRepository.existsById(id)) {
            categoriaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}