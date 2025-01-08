package org.example.service;


import org.example.domain.Libro;
import org.example.model.LibroInput;
import org.example.repos.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> buscarPorTitulo(String titulo) {
        return libroRepository.findByTituloContainingIgnoreCase(titulo);
    }

    public List<Libro> buscarPorAutor(String autorId) {
        return libroRepository.findByAutorId(autorId);
    }

    public List<Libro> buscarPorCategoria(String categoriaId) {
        return libroRepository.findByCategoriaId(categoriaId);
    }

    public Libro agregarLibro(LibroInput libroInput) {
        Libro libro = new Libro();
        libro.setTitulo(libroInput.getTitulo());
        libro.setAutorId(libroInput.getAutorId());
        libro.setCategoriaId(libroInput.getCategoriaId());
        libro.setDisponibilidad(libroInput.isDisponibilidad());
        return libroRepository.save(libro);
    }

    public Libro editarLibro(String id, LibroInput libroInput) {
        Optional<Libro> optionalLibro = libroRepository.findById(id);
        if (optionalLibro.isPresent()) {
            Libro libro = optionalLibro.get();
            libro.setTitulo(libroInput.getTitulo());
            libro.setAutorId(libroInput.getAutorId());
            libro.setCategoriaId(libroInput.getCategoriaId());
            libro.setDisponibilidad(libroInput.isDisponibilidad());
            return libroRepository.save(libro);
        }
        throw new RuntimeException("Libro no encontrado");
    }

    public boolean eliminarLibro(String id) {
        if (libroRepository.existsById(id)) {
            libroRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
