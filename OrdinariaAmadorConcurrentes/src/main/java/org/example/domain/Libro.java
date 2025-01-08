package org.example.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "libros")
public class Libro {
    @Id
    private String id;
    private String titulo;
    private String autorId;
    private String categoriaId;
    private boolean disponibilidad;

    // Constructor vacío
    public Libro() {}

    // Constructor completo
    public Libro(String id, String titulo, String autorId, String categoriaId, boolean disponibilidad) {
        this.id = id;
        this.titulo = titulo;
        this.autorId = autorId;
        this.categoriaId = categoriaId;
        this.disponibilidad = disponibilidad;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutorId() {
        return autorId;
    }

    public void setAutorId(String autorId) {
        this.autorId = autorId;
    }

    public String getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(String categoriaId) {
        this.categoriaId = categoriaId;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
