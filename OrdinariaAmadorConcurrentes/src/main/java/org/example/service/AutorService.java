package org.example.service;


import org.example.domain.Autor;
import org.example.model.AutorInput;
import org.example.repos.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> obtenerTodos() {
        return autorRepository.findAll();
    }

    public Autor agregarAutor(AutorInput autorInput) {
        Autor autor = new Autor();
        autor.setNombre(autorInput.getNombre());
        return autorRepository.save(autor);
    }

    public Autor editarAutor(String id, AutorInput autorInput) {
        return autorRepository.findById(id).map(autor -> {
            autor.setNombre(autorInput.getNombre());
            return autorRepository.save(autor);
        }).orElseThrow(() -> new RuntimeException("Autor no encontrado"));
    }

    public boolean eliminarAutor(String id) {
        if (autorRepository.existsById(id)) {
            autorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}